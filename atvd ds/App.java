import java.awt.TextField;
import java.awt.Color;
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

        // Cor Laranja
        Color orangeTheme = new Color(255, 165, 0);

        // Configurações básicas da janela
        janela.setTitle("CADASTRO DE USUÁRIOS");
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("src/image.png"));
        janela.getContentPane().setBackground(new Color(240, 240, 240)); // Fundo cinza claro
        janela.setFocusable(true);

        // Título
        JLabel labelTitulo = new JLabel("CADASTRO DE PESSOAS");
        labelTitulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        labelTitulo.setBounds(400, 10, 400, 30);
        labelTitulo.setForeground(orangeTheme);
        janela.add(labelTitulo);

        // Primeira linha (CPF, Data Nascimento, RG)
        JLabel labelcpf = new JLabel("CPF/CNPJ:");
        labelcpf.setBounds(20, 50, 80, 20);
        janela.add(labelcpf);

        JTextField campocpf = new JTextField();
        campocpf.setBounds(20, 70, 150, 25);
        janela.add(campocpf);

        JLabel labelDataNascimento = new JLabel("Data Nasc.:");
        labelDataNascimento.setBounds(190, 50, 100, 20);
        janela.add(labelDataNascimento);
        
        JTextField campoDataNascimento = new JTextField();
        campoDataNascimento.setBounds(190, 70, 150, 25);
        janela.add(campoDataNascimento);

        JLabel labelrg = new JLabel("RG:");
        labelrg.setBounds(360, 50, 40, 20);
        janela.add(labelrg);
        
        JTextField camporg = new JTextField();
        camporg.setBounds(360, 70, 150, 25);
        janela.add(camporg);

        // Nome
        JLabel labelTexto2 = new JLabel("Nome Completo:");
        labelTexto2.setBounds(20, 100, 150, 20);
        janela.add(labelTexto2);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(20, 120, 1160, 25);
        janela.add(campoTexto);

        // Senha
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(20, 150, 150, 20);
        janela.add(labelSenha);

        JPasswordField camposenha = new JPasswordField();
        camposenha.setBounds(20, 170, 1160, 25);
        janela.add(camposenha);

        // Email
        JLabel emaillLabel = new JLabel("Email:");
        emaillLabel.setBounds(20, 200, 300, 20);
        janela.add(emaillLabel);

        JTextField campoemail = new JTextField();
        campoemail.setBounds(20, 220, 1160, 25);
        janela.add(campoemail);

        // Telefone
        JLabel labeltelefone = new JLabel("Telefone:");
        labeltelefone.setBounds(20, 250, 150, 20);
        janela.add(labeltelefone);

        JTextField campoTelefone = new JTextField();
        campoTelefone.setBounds(20, 270, 1160, 25);
        janela.add(campoTelefone);

        // CEP
        JLabel labelTexto3 = new JLabel("CEP:");
        labelTexto3.setBounds(20, 300, 150, 20);
        janela.add(labelTexto3);

        JTextField campoCep = new JTextField();
        campoCep.setBounds(20, 320, 200, 25);
        janela.add(campoCep);

        // Estado, Cidade, País
        JComboBox<String> comboBoxEstado = new JComboBox<>();
        comboBoxEstado.setBounds(240, 320, 200, 25);
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
        comboBoxCidade.setBounds(460, 320, 200, 25);
        comboBoxCidade.addItem("Selecione a cidade");
        comboBoxCidade.addItem("Campinas");
        comboBoxCidade.addItem("São Paulo");
        comboBoxCidade.addItem("Vinhedo");
        janela.add(comboBoxCidade);

        JComboBox<String> comboBoxpais = new JComboBox<>();
        comboBoxpais.setBounds(680, 320, 200, 25);
        
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

        // Endereço (Bairro, Número, Logradouro, Complemento)
        JLabel labelEstado = new JLabel("Bairro:");
        labelEstado.setBounds(20, 350, 150, 20);
        janela.add(labelEstado);
        
        JTextField campoBairro = new JTextField();
        campoBairro.setBounds(20, 370, 1160, 25);
        janela.add(campoBairro);

        JLabel labelCidade = new JLabel("Número:");
        labelCidade.setBounds(20, 400, 150, 20);
        janela.add(labelCidade);
        
        JTextField campoNumero = new JTextField();
        campoNumero.setBounds(20, 420, 150, 25);
        janela.add(campoNumero);

        JLabel labelPais = new JLabel("Logradouro:");
        labelPais.setBounds(190, 400, 150, 20);
        janela.add(labelPais);
        
        JTextField campoLogradouro = new JTextField();
        campoLogradouro.setBounds(190, 420, 250, 25);
        janela.add(campoLogradouro);

        JLabel labelPais2 = new JLabel("Complemento:");
        labelPais2.setBounds(460, 400, 150, 20);
        janela.add(labelPais2);
        
        JTextField campoComplemento = new JTextField();
        campoComplemento.setBounds(460, 420, 300, 25);
        janela.add(campoComplemento);

        // Sexo e Estado Civil
        JLabel labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(780, 400, 150, 20);
        janela.add(labelSexo);
        
        JComboBox<String> comboBoxSexo = new JComboBox<>();
        comboBoxSexo.setBounds(780, 420, 150, 25);
        comboBoxSexo.addItem("Selecione o sexo");
        comboBoxSexo.addItem("Masculino");
        comboBoxSexo.addItem("Feminino");
        comboBoxSexo.addItem("Outro");
        janela.add(comboBoxSexo);

        JLabel labelEstadoCivil = new JLabel("Estado Civil:");
        labelEstadoCivil.setBounds(950, 400, 180, 20);
        janela.add(labelEstadoCivil);
        
        JComboBox<String> comboBoxEstadoCivil = new JComboBox<>();
        comboBoxEstadoCivil.setBounds(950, 420, 180, 25);
        comboBoxEstadoCivil.addItem("Selecione o estado civil");
        comboBoxEstadoCivil.addItem("Solteiro(a)");
        comboBoxEstadoCivil.addItem("Casado(a)");
        comboBoxEstadoCivil.addItem("Divorciado(a)");
        comboBoxEstadoCivil.addItem("Viúvo(a)");
        comboBoxEstadoCivil.addItem("União Estável");
        janela.add(comboBoxEstadoCivil);

        // Termos
        JCheckBox checkBoxTermos = new JCheckBox("Aceito os termos de uso");
        checkBoxTermos.setBounds(20, 460, 200, 25);
        janela.add(checkBoxTermos);

        // Área de texto
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(450, 460, 300, 60);
        janela.add(areaTexto);

        // Botões
        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(20, 500, 200, 30);
        botaoLimpar.setBackground(orangeTheme);
        botaoLimpar.setForeground(Color.WHITE);
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

        JButton botaologin = new JButton("Login");
        botaologin.setBounds(240, 500, 200, 30);
        botaologin.setBackground(orangeTheme);
        botaologin.setForeground(Color.WHITE);
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

        // Configuração final da janela
        janela.setLayout(null);
        janela.setSize(1200, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
