package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.RMILoginClientController;
import model.User;

public class RMILoginClientFrm extends JFrame implements ActionListener {

	private static final long serialVersionUID = 5086760931196902476L;
	private JTextField tfUserName = new JTextField();
	private JTextField tfPassword = new JTextField();
	private JButton btnLogin = new JButton("Login");
	private JLabel lblResult = new JLabel("");
	public JTextField getTfUserName() {
		return tfUserName;
	}
	public void setTfUserName(JTextField tfUserName) {
		this.tfUserName = tfUserName;
	}
	public JTextField getTfPassword() {
		return tfPassword;
	}
	public void setTfPassword(JTextField tfPassword) {
		this.tfPassword = tfPassword;
	}
	public JButton getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	public JLabel getLblResult() {
		return lblResult;
	}
	public void setLblResult(JLabel lblResult) {
		this.lblResult = lblResult;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public RMILoginClientFrm() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		tfUserName.setBounds(30, 20, 100, 30);
		tfPassword.setBounds(30, 60, 100, 30);
		btnLogin.setBounds(30, 100, 100, 30);
		lblResult.setBounds(30, 140, 200, 30);
		add(tfUserName);
		add(tfPassword);
		add(btnLogin);
		add(lblResult);
		setPreferredSize(new Dimension(800, 600));
		pack();
		btnLogin.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		if(btnLogin.equals(btn)) {
			clickLogin();
		}
	}
	
	public void clickLogin() {
		User user = new User(tfUserName.getText(), tfPassword.getText());
		RMILoginClientController clientCtr = new RMILoginClientController();
		if(clientCtr.remoteCheckLogin(user)) {
			lblResult.setText("Login success");
		} else {
			lblResult.setText("Login fail");
		}
	}
}
