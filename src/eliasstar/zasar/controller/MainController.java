package eliasstar.zasar.controller;

import java.awt.event.ActionEvent;
import eliasstar.zasar.gui.MainView;

public class MainController {

    private final MainView view;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public MainController(MainView view) {
        this.view = view;

        view.getZasarButton().addActionListener((ActionEvent evt) -> {
            zasarButtonPressed(evt);
        });
    }

    private void zasarButtonPressed(ActionEvent evt) {
        String input = view.getInputTextArea().getText().toUpperCase();
        view.getInputTextArea().setText(input);

        String key = view.getKeyTextField().getText().toUpperCase().replaceAll("[^A-Z]", "");
        view.getKeyTextField().setText(key);

        boolean isPlainText = view.getEncryptRadioButton().isSelected();
        int keyCode = (int) view.getKeySpinner().getValue();

        key = prepareKey(key, keyCode);

        view.getOutputTextArea().setText(isPlainText ? encrypt(key, input) : decrypt(key, input));
    }

    private String encrypt(String keyAlphabet, String text) {
        return crypt(text, ALPHABET, keyAlphabet);
    }

    private String decrypt(String keyAlphabet, String text) {
        return crypt(text, keyAlphabet, ALPHABET);
    }

    private String crypt(String text, String fromAlphabet, String toAlphabet) {
        String output = "";
        char curChar;
        int index;

        for (int i = 0; i < text.length(); i++) {
            curChar = text.charAt(i);
            index = fromAlphabet.indexOf(curChar);
            output += index != -1 ? toAlphabet.charAt(index) : curChar;
        }

        return output;
    }

    private String prepareKey(String key, int keyCode) {
        StringBuilder sb = new StringBuilder();
        key.chars().distinct().forEach(c -> sb.append((char) c));
        key = sb.toString();

        return key + addOffset(getMissingChars(key), keyCode);
    }

    private String getMissingChars(String input) {
        boolean[] mark = new boolean[26];

        for (int index = 0, i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            } else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }

            mark[index] = true;
        }

        String missing = "";

        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                missing += i >= 0 && i < 26 ? (char) (i + 'A') : ' ';
            }
        }

        return missing;
    }

    private String addOffset(String input, int offset) {
        char[] orig = input.toCharArray();
        char[] off = new char[orig.length];

        for (int i = 0; i < orig.length; i++) {
            off[i + offset >= off.length ? i + offset - off.length : i + offset] = orig[i];
        }

        return String.valueOf(off);
    }
}
