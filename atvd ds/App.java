import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class App {
    public static void main(String[] args) {
        JFrame janela = new JFrame();

        // Nome da janela e foto
        janela.setTitle("CADASTRO DE USUÁRIOS");
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("src/image.png"));
        janela.setFocusable(true);


        JLabel labelTitulo = new JLabel("CADASTRO DE PESSOAS");
        labelTitulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 32));
        labelTitulo.setBounds(100, 80, 500, 50);
        janela.add(labelTitulo);

        JLabel labelcpf = new JLabel("CPF/CNPJ:");
        labelcpf.setBounds(580, 80, 300, 40);
        janela.add(labelcpf);

                // Adicionando um campo de cpf/cnpj
        JTextField campocpf = new JTextField();
        campocpf.setBounds(580, 120, 100, 30);
        janela.add(campocpf);

                // Adicionando um campo de data de nascimento
        JLabel labelDataNascimento = new JLabel("Data de Nascimento:");
        labelDataNascimento.setBounds(700, 80, 150, 40);
        janela.add(labelDataNascimento);
        JTextField campoDataNascimento = new JTextField();
        campoDataNascimento.setBounds(700, 120, 150, 30);
        janela.add(campoDataNascimento);

        
        JLabel labelrg = new JLabel("Rg:");
        labelrg.setBounds(870, 80, 400, 40);
        janela.add(labelrg);
        // Adicionando um campo de rg
        JTextField camporg = new JTextField();
        camporg.setBounds(870, 120, 180, 30);
        janela.add(camporg);

        // Adicionando um campo de texto
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(100, 200, 1100, 30);
        janela.add(campoTexto);

        // Definindo o texto do campo de texto
        JLabel labelTexto2 = new JLabel("Digite seu nome:");
        labelTexto2.setBounds(100, 160, 150, 40);
        janela.add(labelTexto2);

        // Adicionando um campo de senha
        JPasswordField camposenha = new JPasswordField();
        camposenha.setBounds(100, 280, 1100, 30);
        janela.add(camposenha);

        // Definindo o texto do campo de senha
        JLabel labelSenha = new JLabel("Digite sua senha:");
        labelSenha.setBounds(100, 240, 150, 40);
        janela.add(labelSenha);

        // Definindo o texto do campo de email
        JLabel emaillLabel = new JLabel("Digite seu email:");
        emaillLabel.setBounds(100, 320, 300, 40);
        janela.add(emaillLabel);

        // Adicionando um campo de email
        JTextField campoemail = new JTextField();
        campoemail.setBounds(100, 360, 1100, 30);
        janela.add(campoemail);

        JLabel labeltelefone = new JLabel("Digite seu telefone:");
        labeltelefone.setBounds(100, 400, 150, 40);
        janela.add(labeltelefone);

        // Adicionando um campo de telefone
        JTextField campoTelefone = new JTextField();
        campoTelefone.setBounds(100, 440, 1100, 30);
        janela.add(campoTelefone);

        JLabel labelTexto3 = new JLabel("Digite seu CEP");
        labelTexto3.setBounds(100, 480, 150, 40);
        janela.add(labelTexto3);

        // Adicionando um campo de CEP
        JTextField campoCep = new JTextField();
        campoCep.setBounds(100, 520, 1100, 30);
        janela.add(campoCep);

        JComboBox<String> comboBoxEstado = new JComboBox<>();
        comboBoxEstado.setBounds(100, 560, 200, 30);
        comboBoxEstado.addItem("Selecione o estado");
        comboBoxEstado.addItem("Acre");
        comboBoxEstado.addItem("Alagoas");
        comboBoxEstado.addItem("Amapá");
        comboBoxEstado.addItem("Amazonas");
        comboBoxEstado.addItem("Bahia");
        comboBoxEstado.addItem("Ceará");
        comboBoxEstado.addItem("Distrito Federal");
        comboBoxEstado.addItem("Espírito Santo");
        comboBoxEstado.addItem("Goiás");
        comboBoxEstado.addItem("Maranhão");
        comboBoxEstado.addItem("Mato Grosso");
        comboBoxEstado.addItem("Mato Grosso do Sul");
        comboBoxEstado.addItem("Minas Gerais");
        comboBoxEstado.addItem("Pará");
        comboBoxEstado.addItem("Paraíba");
        comboBoxEstado.addItem("Paraná");
        comboBoxEstado.addItem("Pernambuco");
        comboBoxEstado.addItem("Piauí");
        comboBoxEstado.addItem("Rio de Janeiro");
        comboBoxEstado.addItem("Rio Grande do Norte");
        comboBoxEstado.addItem("Rio Grande do Sul");
        comboBoxEstado.addItem("Rondônia");
        comboBoxEstado.addItem("Roraima");
        comboBoxEstado.addItem("Santa Catarina");
        comboBoxEstado.addItem("São Paulo");
        comboBoxEstado.addItem("Sergipe");
        comboBoxEstado.addItem("Tocantins");
        janela.add(comboBoxEstado);

        JComboBox<String> comboBoxCidade = new JComboBox<>();
        comboBoxCidade.setBounds(320, 560, 200, 30);
        comboBoxCidade.addItem("Selecione a cidade");
        comboBoxCidade.addItem("Campinas");
        comboBoxCidade.addItem("São Paulo");
        comboBoxCidade.addItem("Vinhedo");
        janela.add(comboBoxCidade);

        JComboBox<String> comboBoxpais = new JComboBox<>();
        comboBoxpais.setBounds(540, 560, 200, 30);
        comboBoxpais.addItem("Selecione o país");
        comboBoxpais.addItem("Brasil");
        comboBoxpais.addItem("Estados Unidos");
        comboBoxpais.addItem("Argentina");
        comboBoxpais.addItem("Alemanha");
        comboBoxpais.addItem("França");
        comboBoxpais.addItem("Japão");
        comboBoxpais.addItem("China");
        comboBoxpais.addItem("Reino Unido");
        comboBoxpais.addItem("Canadá");
        comboBoxpais.addItem("Itália");
        comboBoxpais.addItem("Espanha");
        comboBoxpais.addItem("Portugal");
        comboBoxpais.addItem("México");
        comboBoxpais.addItem("Austrália");
        comboBoxpais.addItem("Índia");
        comboBoxpais.addItem("Rússia");
        comboBoxpais.addItem("África do Sul");
        comboBoxpais.addItem("Coreia do Sul");
        comboBoxpais.addItem("Nova Zelândia");
        comboBoxpais.addItem("Suécia");
        comboBoxpais.addItem("Noruega");
        comboBoxpais.addItem("Dinamarca");
        comboBoxpais.addItem("Finlândia");
        comboBoxpais.addItem("Polônia");
        comboBoxpais.addItem("Bélgica");
        comboBoxpais.addItem("Suíça");
        comboBoxpais.addItem("Áustria");
        comboBoxpais.addItem("Grécia");
        comboBoxpais.addItem("Holanda");
        comboBoxpais.addItem("Irlanda");
        comboBoxpais.addItem("Turquia");
        janela.add(comboBoxpais);

        JLabel labelEstado = new JLabel("Bairro:");
        labelEstado.setBounds(100, 600, 150, 40);
        janela.add(labelEstado);
        // Adicionando um campo de bairro
        JTextField campoBairro = new JTextField();
        campoBairro.setBounds(100, 640, 1100, 30);
        janela.add(campoBairro);

        JLabel labelCidade = new JLabel("Numero:");
        labelCidade.setBounds(100, 680, 150, 40);
        janela.add(labelCidade);
        // Adicionando um campo de número
        JTextField campoNumero = new JTextField();
        campoNumero.setBounds(100, 720, 150, 30);
        janela.add(campoNumero);

        JLabel labelPais = new JLabel("Logradouro:");
        labelPais.setBounds(300, 680, 150, 40);
        janela.add(labelPais);
        // Adicionando um campo de logradouro
        JTextField campoLogradouro = new JTextField();
        campoLogradouro.setBounds(300, 720, 150, 30);
        janela.add(campoLogradouro);

        JLabel labelPais2 = new JLabel("Complemento:");
        labelPais2.setBounds(500, 680, 150, 40);
        janela.add(labelPais2);
        // Adicionando um campo de complemento
        JTextField campoComplemento = new JTextField();
        campoComplemento.setBounds(500, 720, 320, 30);
        janela.add(campoComplemento);


        JLabel labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(850, 680, 150, 40);
        janela.add(labelSexo);
        // Adicionando um campo de sexo
        JComboBox<String> comboBoxSexo = new JComboBox<>();
        comboBoxSexo.setBounds(850, 720, 150, 30);
        comboBoxSexo.addItem("Selecione o sexo");
        comboBoxSexo.addItem("Masculino");
        comboBoxSexo.addItem("Feminino");
        comboBoxSexo.addItem("Outro");
        janela.add(comboBoxSexo);

        JLabel labelEstadoCivil = new JLabel("Estado Civil:");
        labelEstadoCivil.setBounds(1020, 680, 180, 40);
        janela.add(labelEstadoCivil);
        // Adicionando um campo de estado civil
        JComboBox<String> comboBoxEstadoCivil = new JComboBox<>();
        comboBoxEstadoCivil.setBounds(1020, 720, 180, 30);
        comboBoxEstadoCivil.addItem("Selecione o estado civil");
        comboBoxEstadoCivil.addItem("Solteiro(a)");
        comboBoxEstadoCivil.addItem("Casado(a)");
        comboBoxEstadoCivil.addItem("Divorciado(a)");
        comboBoxEstadoCivil.addItem("Viúvo(a)");
        comboBoxEstadoCivil.addItem("União Estável");
        janela.add(comboBoxEstadoCivil);

        JCheckBox checkBoxTermos = new JCheckBox("Aceito os termos de uso");
        checkBoxTermos.setBounds(100, 760, 200, 30);
        janela.add(checkBoxTermos);



        // Adicionando uma area de texto para exibir informações
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(515, 800, 290, 80);
        janela.add(areaTexto);

        // Adicionando botões
        // Botão de limpar
        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(85, 800, 200, 50);
        janela.add(botaoLimpar);
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                campoTexto.setText("");
                camposenha.setText("");
                areaTexto.setText("");
                campocpf.setText("");
                campoDataNascimento.setText("");
                camporg.setText("");
                campoemail.setText("");
                campoTelefone.setText("");
                campoCep.setText("");
                campoBairro.setText("");
                campoNumero.setText("");
                campoLogradouro.setText("");
                campoComplemento.setText("");
                comboBoxEstado.setSelectedIndex(0);
                comboBoxCidade.setSelectedIndex(0);
                comboBoxpais.setSelectedIndex(0);
                comboBoxSexo.setSelectedIndex(0);
                comboBoxEstadoCivil.setSelectedIndex(0);
                checkBoxTermos.setSelected(false);
                System.out.println("Campos limpos!");
                areaTexto.setText("Campos limpos!");
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
                System.out.println("Sua senha é: " + new String(camposenha.getPassword()));
                areaTexto.setText("Você está fazendo login com o nome: " + campoTexto.getText());
                campoTexto.setText("");
                camposenha.setText("");
                campocpf.setText("");
                campoDataNascimento.setText("");
                camporg.setText("");
                campoemail.setText("");
                campoTelefone.setText("");
                campoCep.setText("");
                campoBairro.setText("");
                campoNumero.setText("");
                campoLogradouro.setText("");
                campoComplemento.setText("");
                comboBoxEstado.setSelectedIndex(0);
                comboBoxCidade.setSelectedIndex(0);
                comboBoxpais.setSelectedIndex(0);
                comboBoxSexo.setSelectedIndex(0);
                comboBoxEstadoCivil.setSelectedIndex(0);
                checkBoxTermos.setSelected(false);
            }
        });

        // Configurando a janela
        janela.setLayout(null);
        janela.setBounds(0, 0, 1600, 1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
}
}
