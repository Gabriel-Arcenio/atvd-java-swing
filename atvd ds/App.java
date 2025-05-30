import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class App {
    public static void main(String[] args) {
        JFrame janela = new JFrame();

        // Nome da janela e foto
        janela.setTitle("CADASTRO DE USUÁRIOS");
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("src/image.png"));
        janela.setFocusable(true);


        // Adicionando um campo de texto
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(100, 180, 200, 30);
        janela.add(campoTexto);

        // Definindo o texto do campo de texto
        JLabel labelTexto2 = new JLabel("Digite seu nome:");
        labelTexto2.setBounds(100, 140, 150, 40);
        janela.add(labelTexto2);

        // Adicionando um campo de senha
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(100, 250, 200, 30);
        janela.add(campoSenha);

        // Definindo o texto do campo de senha
        JLabel labelSenha = new JLabel("Digite sua senha:");
        labelSenha.setBounds(100, 210, 150, 40);
        janela.add(labelSenha);

        // Adicionando uma area de texto para exibir informações
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(515, 800, 290, 80);
        janela.add(areaTexto);

        // Definindo o texto do comboBox
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(100, 600, 200, 30);
        comboBox.addItem("Selecione uma opção");
        comboBox.addItem("Opção 1");
        comboBox.addItem("Opção 2");
        comboBox.addItem("Opção 3");
        janela.add(comboBox);


        // Adicionando botões
        // Botão de limpar
        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(85, 800, 200, 50);
        janela.add(botaoLimpar);
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                campoTexto.setText("");
                campoSenha.setText("");
                areaTexto.setText("");
            }
        });

        //Botão de login
        JButton botaologin = new JButton("Login");
        botaologin.setBounds(300, 800, 200, 50);
        janela.add(botaologin);
        botaologin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Você está fazendo login com o nome: " + campoTexto.getText());
                System.out.println("Sua senha é: " + new String(campoSenha.getPassword()));
                areaTexto.setText("Você está fazendo login com o nome: " + campoTexto.getText());
                campoTexto.setText("");
                campoSenha.setText("");
            }
        });

        // Configurando a janela
        janela.setLayout(null);
        janela.setBounds(0, 0, 1600, 1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
}
}
