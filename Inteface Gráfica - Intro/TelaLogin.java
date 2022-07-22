package introducaoInterface;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {
	
	public static void main(String[] args) {
		final String USER = "Renan";
		final String PASS = "12345";
		
		JFrame frame = new JFrame ("Acesso");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		JLabel lblUsuario = new JLabel("Usuário: ");
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setToolTipText("Informe seu usuário de acesso...");
		JPasswordField txtSenha = new JPasswordField(8);
		JLabel lblSenha = new JLabel("Senha: ");
		txtSenha.setToolTipText("Informe sua senha de acesso...");
		  
		JButton btnLogin = new JButton("Login");
		panel.add(lblUsuario);
		panel.add(txtUsuario);
		panel.add(lblSenha);
		panel.add(txtSenha);
		panel.add(btnLogin);
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
		//String y = txtUsuario.getText() == "1"? "sim" : "não";
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)){
					JOptionPane.showMessageDialog(null, "Dados corretos");
				}else {
					JOptionPane.showMessageDialog(null, "Dados incorretos");
				}
				
			}
			
		});
	}
}
