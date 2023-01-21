package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	// Elementos de la interfaz

	private JFrame cerberus;
	private JPasswordField pwdPass;
	private JTextField text_email;
	private JButton btn_login;

	// Getters de elementos de la interfaz

	public JPasswordField getPwdPass() {
		return pwdPass;
	}

	public JTextField getText_email() {
		return text_email;
	}

	public JButton getBtn_login() {
		return btn_login;
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cerberus = new JFrame();
		cerberus.getContentPane().setBackground(Color.MAGENTA);
		cerberus.getContentPane().setLayout(new GridLayout(1, 1, 0, 0));

		JPanel panel_background = new JPanel();
		panel_background.setBackground(Color.WHITE);
		cerberus.getContentPane().add(panel_background);
		panel_background.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel_background.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 137, 0 };
		gbl_panel.rowHeights = new int[] { 0, 30, 0, 44, 100, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 100.0, 100.0, 100.0, 100.0, 100.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lbl_email = new JLabel("Email");
		GridBagConstraints gbc_lbl_email = new GridBagConstraints();
		gbc_lbl_email.anchor = GridBagConstraints.SOUTH;
		gbc_lbl_email.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_email.gridx = 0;
		gbc_lbl_email.gridy = 0;
		panel.add(lbl_email, gbc_lbl_email);

		text_email = new JTextField();
		GridBagConstraints gbc_text_email = new GridBagConstraints();
		gbc_text_email.anchor = GridBagConstraints.NORTH;
		gbc_text_email.insets = new Insets(0, 0, 5, 0);
		gbc_text_email.gridx = 0;
		gbc_text_email.gridy = 1;
		panel.add(text_email, gbc_text_email);
		text_email.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		pwdPass = new JPasswordField();
		pwdPass.setColumns(10);
		pwdPass.setText("Pass");
		GridBagConstraints gbc_pwdPass = new GridBagConstraints();
		gbc_pwdPass.anchor = GridBagConstraints.NORTH;
		gbc_pwdPass.insets = new Insets(0, 0, 5, 0);
		gbc_pwdPass.gridx = 0;
		gbc_pwdPass.gridy = 3;
		panel.add(pwdPass, gbc_pwdPass);

		btn_login = new JButton("Log In");
	

		GridBagConstraints gbc_btn_login = new GridBagConstraints();
		gbc_btn_login.gridx = 0;
		gbc_btn_login.gridy = 4;
		panel.add(btn_login, gbc_btn_login);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_background.add(panel_1);

		JLabel lbl_img_placeholder = new JLabel("img_placeholder");
		panel_1.add(lbl_img_placeholder);
		cerberus.setVisible(true);
		cerberus.setTitle("Cerberus Password Manager");
		cerberus.setBounds(100, 100, 450, 300);
		cerberus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
