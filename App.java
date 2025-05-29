import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {
        JFrame janela = new JFrame();

    JLabel titulo = new JLabel("Minha primeira janela");
    titulo.setBounds(70,50, 150, 30);
    janela.add(titulo);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(100, 170, 200, 30);
        janela.add(campoTexto);

    JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(100, 250, 290, 130);
        janela.add(areaTexto);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(400, 130, 200, 30);
        janela.add(campoSenha);

        JLabel labelSenha = new JLabel("Digite sua senha:");
        labelSenha.setBounds(400, 100, 150, 30);
        janela.add(labelSenha);

        JButton botao = new JButton("Login");
        botao.setBounds(100, 100, 200, 50);
        janela.add(botao);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Você está fazendo login com o nome: " + campoTexto.getText());
                areaTexto.setText("Você está fazendo login com o nome: " + campoTexto.getText());
            }
        });

        janela.setLayout(null);
        janela.setBounds(0, 0, 1600, 1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
}
}
