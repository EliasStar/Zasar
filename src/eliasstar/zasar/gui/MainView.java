package eliasstar.zasar.gui;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainView extends javax.swing.JFrame {

    private static final long serialVersionUID = 2842320343553105182L;

    private javax.swing.ButtonGroup CryptButtonGroup;
    private javax.swing.JRadioButton DecryptRadioButton;
    private javax.swing.JRadioButton EncryptRadioButton;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JScrollPane InputScrollPane;
    private javax.swing.JTextArea InputTextArea;
    private javax.swing.JLabel KeyLabel;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JScrollPane OutputScrollPane;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JButton ZasarButton;
    private javax.swing.JLabel ZasarLabel;
    private javax.swing.JPanel ZasarPanel;
    private javax.swing.JSpinner keySpinner;
    private javax.swing.JTextField keyTextField;

    public MainView() {
        initComponents();
    }

    public JRadioButton getDecryptRadioButton() {
        return DecryptRadioButton;
    }

    public JTextArea getInputTextArea() {
        return InputTextArea;
    }

    public JTextArea getOutputTextArea() {
        return OutputTextArea;
    }

    public JButton getZasarButton() {
        return ZasarButton;
    }

    public JSpinner getKeySpinner() {
        return keySpinner;
    }

    public JTextField getKeyTextField() {
        return keyTextField;
    }

    public JRadioButton getEncryptRadioButton() {
        return EncryptRadioButton;
    }

    private void initComponents() {

        CryptButtonGroup = new javax.swing.ButtonGroup();
        ZasarPanel = new javax.swing.JPanel();
        keyTextField = new javax.swing.JTextField();
        OutputScrollPane = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();
        InputScrollPane = new javax.swing.JScrollPane();
        InputTextArea = new javax.swing.JTextArea();
        keySpinner = new javax.swing.JSpinner();
        EncryptRadioButton = new javax.swing.JRadioButton();
        DecryptRadioButton = new javax.swing.JRadioButton();
        KeyLabel = new javax.swing.JLabel();
        InputLabel = new javax.swing.JLabel();
        OutputLabel = new javax.swing.JLabel();
        ZasarLabel = new javax.swing.JLabel();
        ZasarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zasar");

        keyTextField.setFont(new java.awt.Font("Tahoma", 0, 13));
        keyTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        OutputTextArea.setEditable(false);
        OutputTextArea.setColumns(20);
        OutputTextArea.setLineWrap(true);
        OutputTextArea.setRows(5);
        OutputScrollPane.setViewportView(OutputTextArea);

        InputTextArea.setColumns(20);
        InputTextArea.setLineWrap(true);
        InputTextArea.setRows(5);
        InputTextArea.setTabSize(4);
        InputTextArea.setName("");
        InputScrollPane.setViewportView(InputTextArea);

        keySpinner.setFont(new java.awt.Font("Tahoma", 0, 13));
        keySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));
        keySpinner.setName("");

        CryptButtonGroup.add(EncryptRadioButton);
        EncryptRadioButton.setFont(new java.awt.Font("Tahoma", 0, 13));
        EncryptRadioButton.setSelected(true);
        EncryptRadioButton.setText("Encrypt");

        CryptButtonGroup.add(DecryptRadioButton);
        DecryptRadioButton.setFont(new java.awt.Font("Tahoma", 0, 13));
        DecryptRadioButton.setText("Decrypt");

        KeyLabel.setFont(new java.awt.Font("Tahoma", 0, 13));
        KeyLabel.setText("Key:");

        InputLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        InputLabel.setText("Input");

        OutputLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        OutputLabel.setText("Output");

        ZasarLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        ZasarLabel.setText("Zasar");

        ZasarButton.setFont(new java.awt.Font("Tahoma", 0, 13));
        ZasarButton.setText("Go!");

        javax.swing.GroupLayout ZasarPanelLayout = new javax.swing.GroupLayout(ZasarPanel);
        ZasarPanel.setLayout(ZasarPanelLayout);
        ZasarPanelLayout.setHorizontalGroup(ZasarPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ZasarPanelLayout.createSequentialGroup().addContainerGap()
                        .addGroup(ZasarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(InputScrollPane).addComponent(OutputScrollPane)
                                .addGroup(ZasarPanelLayout.createSequentialGroup().addGroup(ZasarPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ZasarLabel).addComponent(InputLabel).addComponent(OutputLabel)
                                        .addGroup(ZasarPanelLayout.createSequentialGroup().addComponent(KeyLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(keySpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        ZasarPanelLayout.createSequentialGroup().addGroup(ZasarPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(EncryptRadioButton).addComponent(DecryptRadioButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ZasarButton)))
                        .addContainerGap()));
        ZasarPanelLayout.setVerticalGroup(ZasarPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ZasarPanelLayout.createSequentialGroup().addContainerGap().addComponent(ZasarLabel)
                        .addGap(18, 18, 18)
                        .addGroup(ZasarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(KeyLabel)
                                .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(keySpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18).addComponent(InputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InputScrollPane).addGap(18, 18, 18).addComponent(OutputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OutputScrollPane).addGap(18, 18, 18)
                        .addGroup(ZasarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ZasarButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        ZasarPanelLayout.createSequentialGroup().addComponent(EncryptRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DecryptRadioButton)))
                        .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ZasarPanel,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ZasarPanel,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }
}
