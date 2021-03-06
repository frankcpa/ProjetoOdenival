/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.empresa;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.EmpresaModel;
import model.FuncionarioModel;
import model.localidade.CidadeModel;
import model.localidade.EstadoModel;
import repository.CargoRepository;
import repository.CidadeRepository;
import repository.EstadoRepository;
import repository.EmpresaRepository;

public class frameCadastrarEmpresa extends javax.swing.JInternalFrame {

    private static frameCadastrarEmpresa frameCadFunc;
    private CargoRepository cargoRepository = null;
    private EstadoRepository estadoRepository = null;
    private CidadeRepository cidadeRepository = null;
    private EmpresaRepository empresaRepository = null;
    private final AtendeCliente portaAcesso;
    //public GerenciadorDeJanela gerenciadorDeJanelas;

    //public static frameCadastrarFuncionario getInstancia(JDesktopPane jDesktopPane1) {
    public static frameCadastrarEmpresa getInstancia() {
        if (frameCadFunc == null) {
            frameCadFunc = new frameCadastrarEmpresa();
        }
        return frameCadFunc;
    }

    //public frameCadastrarFuncionario(JDesktopPane jDesktopPane1) {
    public frameCadastrarEmpresa() {

        initComponents();
        //this.gerenciadorDeJanelas = new GerenciadorDeJanela();
        //((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        AtendeClienteService service = new AtendeClienteService();
        this.portaAcesso = service.getAtendeClientePort();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)####-####");
            txtTelefone = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel10 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCEI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("#####-###");
            txtCEP = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel13 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboBoxPais = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        comboBoxEstado = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        comboBoxCidades = new javax.swing.JComboBox<>();
        botaoCadastrarEmpresa = new javax.swing.JButton();
        txtCNPJ = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##.###.###/####-##");
            txtCNPJ = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        txtRazaoSocial = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)####-####");
            txtTelefone = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        txtNIT = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Empresas");
        setToolTipText("Cadastro de Empresas");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setVisible(false);

        jPanel1.setBackground(new java.awt.Color(56, 65, 84));

        jLabel1.setBackground(new java.awt.Color(56, 65, 84));
        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Empresa");
        jLabel1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel2.setText("E-Mail");

        txtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel3.setText("Nome Fantasia");

        jLabel4.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel4.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel6.setText("CI");

        jLabel7.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel7.setText("NIT");

        jLabel8.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel8.setText("CNPJ");

        jLabel10.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel10.setText("Raz??o Social");

        jLabel11.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel11.setText("CEI");

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel5.setText("CEP");

        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel13.setText("Rua / Avenida / Logradouro");

        jLabel12.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel12.setText("N??mero");

        jLabel16.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel16.setText("Complemento");

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel14.setText("Bairro");

        comboBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Brasil", "Bol??via" }));
        comboBoxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPaisActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel17.setText("Pa??s");

        jLabel19.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel19.setText("Estado");

        comboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel18.setText("Cidade");

        botaoCadastrarEmpresa.setBackground(new java.awt.Color(0, 51, 51));
        botaoCadastrarEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrarEmpresa.setText("Salvar");
        botaoCadastrarEmpresa.setBorder(null);
        botaoCadastrarEmpresa.setBorderPainted(false);
        botaoCadastrarEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoCadastrarEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCadastrarEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCadastrarEmpresaMouseExited(evt);
            }
        });
        botaoCadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNomeFantasia)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtCEI, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCI))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addComponent(txtRazaoSocial)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel13))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtComplemento)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(botaoCadastrarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14))
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel19)
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addComponent(botaoCadastrarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public class ComboItem {

        private String value;
        private String label;

        public ComboItem(String value, String label) {
            this.value = value;
            this.label = label;
        }

        public String getValue() {
            return this.value;
        }

        public String getLabel() {
            return this.label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private void populaBoxEstados(String pais, EstadoModel estadoSelecionado) {
        if (pais.equals("Brasil")) {
            if (this.estadoRepository == null) {
                this.estadoRepository = new EstadoRepository();
            }
            List<EstadoModel> listaDeEstados = this.estadoRepository.buscar();

            Object objs[] = new Object[listaDeEstados.size()];
            ComboItem item;
            int itemSelecionado = 0;
            for (int i = 0; i < listaDeEstados.size(); i++) {
                item = new ComboItem("" + listaDeEstados.get(i).getIdEstado(), listaDeEstados.get(i).getEstadoNome() + " / " + listaDeEstados.get(i).getEstadoSigla());
                objs[i] = item;
                if (estadoSelecionado != null) {
                    if (estadoSelecionado.getEstadoNome().toLowerCase().trim().equals(listaDeEstados.get(i).getEstadoNome().toLowerCase().trim())) {
                        itemSelecionado = i;
                    }
                }
            }
            DefaultComboBoxModel model2 = new DefaultComboBoxModel(objs);
            comboBoxEstado.setModel(model2);
            if (estadoSelecionado != null) {
                comboBoxEstado.setSelectedIndex(itemSelecionado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vamos inserir os estados do pa??s: " + pais);
        }
    }

    private void populaBoxCidades(long Idestado, CidadeModel cidadeSelecionada) {
        if (this.cidadeRepository == null) {
            this.cidadeRepository = new CidadeRepository();
        }
        List<CidadeModel> listaDeCidades = this.cidadeRepository.buscar(Idestado);

        Object objs[] = new Object[listaDeCidades.size()];
        ComboItem item;
        int itemSelecionado = 0;
        for (int i = 0; i < listaDeCidades.size(); i++) {
            item = new ComboItem("" + listaDeCidades.get(i).getIdCidade(), listaDeCidades.get(i).getCidadeNome());
            objs[i] = item;
            if (cidadeSelecionada != null) {
                if (cidadeSelecionada.getCidadeNome().toLowerCase().trim().equals(listaDeCidades.get(i).getCidadeNome().toLowerCase().trim())) {
                    itemSelecionado = i;
                }
            }
        }
        DefaultComboBoxModel model2 = new DefaultComboBoxModel(objs);
        comboBoxCidades.setModel(model2);
        if (cidadeSelecionada != null) {
            comboBoxCidades.setSelectedIndex(itemSelecionado);
        }
    }

    private void botaoCadastrarEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarEmpresaMouseEntered
        botaoCadastrarEmpresa.setBackground(new Color(0, 153, 0));
        botaoCadastrarEmpresa.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_botaoCadastrarEmpresaMouseEntered

    private void botaoCadastrarEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarEmpresaMouseExited
        botaoCadastrarEmpresa.setBackground(new Color(0, 51, 51));
        botaoCadastrarEmpresa.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_botaoCadastrarEmpresaMouseExited

    public boolean verificaCamposObrigatorios() {
        boolean retorno = true;

        if (txtNomeFantasia.getText().trim().isEmpty()) {
            txtNomeFantasia.setBorder(new LineBorder(Color.red));
            retorno = false;
        } else {
            txtNomeFantasia.setBorder(new LineBorder(Color.GRAY));
        }

        if (txtCEI.getText().trim().isEmpty()) {
            txtCEI.setBorder(new LineBorder(Color.red));
            retorno = false;
        } else {
            txtCEI.setBorder(new LineBorder(Color.GRAY));
        }

        return retorno;
    }

    private void botaoCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarEmpresaActionPerformed
        if (verificaCamposObrigatorios()) {
            EmpresaModel empresaModel = new EmpresaModel();

            ComboItem item = (ComboItem) comboBoxCidades.getSelectedItem();
            long cidadeID = Long.parseLong(item.getValue());
            CidadeModel cidade = cidadeRepository.buscarPorId(cidadeID);

            empresaModel.setNomeFantasia(txtNomeFantasia.getText());
            empresaModel.setCNPJ(txtCNPJ.getText().replace(".", "").replace("/", "").replace("-", ""));
            empresaModel.setRazaoSocial(txtRazaoSocial.getText());
            empresaModel.setEmail(txtEmail.getText());
            empresaModel.setTelefone(txtTelefone.getText().replace("(", "").replace(")", "").replace("(-", ""));
            empresaModel.setCEI(txtCEI.getText());
            empresaModel.setCI(txtCI.getText());
            empresaModel.setNIT(txtNIT.getText());
            empresaModel.setCep(Long.parseLong(txtCEP.getText().replace("-", "")));
            empresaModel.setRuaAvenida(txtEndereco.getText());
            empresaModel.setNumero(txtNumero.getText());
            empresaModel.setBairro(txtBairro.getText());
            empresaModel.setComplemento(txtComplemento.getText());
            empresaModel.setCidade(cidade);

            if (this.empresaRepository == null) {
                this.empresaRepository = new EmpresaRepository();
            }

            empresaRepository.salvar(empresaModel);

            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Campos Obrigat??rios n??o foram preenchidos!", null, JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_botaoCadastrarEmpresaActionPerformed

    private void comboBoxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPaisActionPerformed
        populaBoxEstados(comboBoxPais.getSelectedItem().toString(), null);
        populaBoxCidades(1, null);
    }//GEN-LAST:event_comboBoxPaisActionPerformed

    private void comboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEstadoActionPerformed
        ComboItem item = (ComboItem) comboBoxEstado.getSelectedItem();
        populaBoxCidades(Long.parseLong(item.getValue()), null);

    }//GEN-LAST:event_comboBoxEstadoActionPerformed

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
        if (!txtCEP.getText().trim().isEmpty()) {
            try {
                EnderecoERP enderecoRetorno = this.portaAcesso.consultaCEP(txtCEP.getText().trim().replace("-", ""));
                txtEndereco.setText(enderecoRetorno.getEnd());
                txtBairro.setText(enderecoRetorno.getBairro());

                if (this.cidadeRepository == null) {
                    this.cidadeRepository = new CidadeRepository();
                }
                List<CidadeModel> cidades = cidadeRepository.buscarPorNome(enderecoRetorno.getCidade());
                if (cidades != null && !cidades.isEmpty()) {
                    CidadeModel cidade = cidades.get(0);
                    comboBoxPais.setSelectedIndex(Integer.parseInt("" + cidade.getEstado().getPais().getIdPais()));
                    populaBoxEstados(cidade.getEstado().getPais().getPaisNome(), cidade.getEstado());
                    populaBoxCidades(cidade.getEstado().getIdEstado(), cidade);
                } else {
                    JOptionPane.showMessageDialog(null, "Cidade n??o encontrada!", "Sistema", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException_Exception ex) {
                Logger.getLogger(frameCadastrarEmpresa.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Correios - WebService", JOptionPane.WARNING_MESSAGE);
            } catch (SigepClienteException ex) {
                Logger.getLogger(frameCadastrarEmpresa.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Correios - WebService", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCEPFocusLost

    private void txtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFantasiaActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarEmpresa;
    private javax.swing.JComboBox<String> comboBoxCidades;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JComboBox<String> comboBoxPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEI;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
