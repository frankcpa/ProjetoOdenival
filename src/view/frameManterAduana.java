/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AduanaModel;
import model.CargoModel;
import repository.AduanaRepository;
import repository.CargoRepository;

/**
 *
 * @author Frank
 */
public class frameManterAduana extends javax.swing.JInternalFrame {

    private static frameManterAduana frameAduana;
    private AduanaRepository aduanaRepository = null;

    public static frameManterAduana getInstancia() {
        if (frameAduana == null) {
            frameAduana = new frameManterAduana();
        }
        return frameAduana;
    }

    public frameManterAduana() {
        initComponents();
        //((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        botaoCancelarEdicao.setVisible(false);
        txtId.setVisible(false);
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
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo2 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableAduanas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoBuscar = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoEditarRegistro = new javax.swing.JButton();
        botaoRemoverRegistro = new javax.swing.JButton();
        botaoCancelarEdicao = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Aduana");
        setToolTipText("Cadastro de Aduana");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setVisible(false);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(56, 65, 84));

        jLabel1.setBackground(new java.awt.Color(56, 65, 84));
        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manter Cadastro de Aduana");
        jLabel1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel3.setText("Nome");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setMinimumSize(new java.awt.Dimension(4, 20));
        jScrollPane1.setViewportView(txtDescricao);

        jLabel11.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel11.setText("Descrição");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        labelTitulo2.setBackground(new java.awt.Color(56, 65, 84));
        labelTitulo2.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        labelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo2.setText("Aduanas Já Cadastradas");
        labelTitulo2.setRequestFocusEnabled(false);

        labelTitulo.setBackground(new java.awt.Color(56, 65, 84));
        labelTitulo.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Cadastrar Nova Aduana");
        labelTitulo.setRequestFocusEnabled(false);

        jtableAduanas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Código", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableAduanas.setColumnSelectionAllowed(true);
        jtableAduanas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jtableAduanas);
        jtableAduanas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtableAduanas.getColumnModel().getColumnCount() > 0) {
            jtableAduanas.getColumnModel().getColumn(0).setMinWidth(0);
            jtableAduanas.getColumnModel().getColumn(0).setPreferredWidth(0);
            jtableAduanas.getColumnModel().getColumn(0).setMaxWidth(0);
            jtableAduanas.getColumnModel().getColumn(2).setMinWidth(200);
            jtableAduanas.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtableAduanas.getColumnModel().getColumn(2).setMaxWidth(200);
            jtableAduanas.getColumnModel().getColumn(3).setMinWidth(0);
            jtableAduanas.getColumnModel().getColumn(3).setPreferredWidth(0);
            jtableAduanas.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        jLabel4.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel4.setText("Nome");

        botaoBuscar.setBackground(new java.awt.Color(0, 204, 153));
        botaoBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botaoBuscar.setText("Buscar");
        botaoBuscar.setBorder(null);
        botaoBuscar.setBorderPainted(false);
        botaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscar.setPreferredSize(new java.awt.Dimension(43, 20));
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel5.setText("Código");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCodigoBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(291, 291, 291)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(labelTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(txtNome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(372, 372, 372)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(515, Short.MAX_VALUE)))
        );

        botaoCadastrar.setBackground(new java.awt.Color(0, 51, 51));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("Salvar");
        botaoCadastrar.setBorder(null);
        botaoCadastrar.setBorderPainted(false);
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseExited(evt);
            }
        });
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoEditarRegistro.setBackground(new java.awt.Color(0, 51, 51));
        botaoEditarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoEditarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditarRegistro.setText("Editar Registro");
        botaoEditarRegistro.setBorderPainted(false);
        botaoEditarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEditarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoEditarRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoEditarRegistroMouseExited(evt);
            }
        });
        botaoEditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarRegistroActionPerformed(evt);
            }
        });

        botaoRemoverRegistro.setBackground(new java.awt.Color(0, 51, 51));
        botaoRemoverRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoRemoverRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverRegistro.setText("Remover Registro");
        botaoRemoverRegistro.setBorderPainted(false);
        botaoRemoverRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemoverRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoRemoverRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoRemoverRegistroMouseExited(evt);
            }
        });
        botaoRemoverRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverRegistroActionPerformed(evt);
            }
        });

        botaoCancelarEdicao.setBackground(new java.awt.Color(0, 51, 51));
        botaoCancelarEdicao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCancelarEdicao.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarEdicao.setText("Cancelar Alteração");
        botaoCancelarEdicao.setBorder(null);
        botaoCancelarEdicao.setBorderPainted(false);
        botaoCancelarEdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelarEdicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCancelarEdicaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCancelarEdicaoMouseExited(evt);
            }
        });
        botaoCancelarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEditarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(botaoRemoverRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(botaoCancelarEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoEditarRegistro)
                        .addGap(50, 50, 50)
                        .addComponent(botaoRemoverRegistro)
                        .addGap(143, 143, 143))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populaTabelaAduanas(String nome) {
        if (this.aduanaRepository == null) {
            this.aduanaRepository = new AduanaRepository();
        }
        DefaultTableModel model = (DefaultTableModel) jtableAduanas.getModel();
        model.setRowCount(0);
        List<AduanaModel> listaDeAduanas = this.aduanaRepository.buscarPorNome(nome);
        for (int i = 0; i < listaDeAduanas.size(); i++) {
            model.addRow(new Object[]{
                listaDeAduanas.get(i).getIdAduana(),
                listaDeAduanas.get(i).getNome(),
                listaDeAduanas.get(i).getCodigo(),
                listaDeAduanas.get(i).getDescricao()
            });
        }
        jtableAduanas.setModel(model);
    }
    
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        if (!txtNome.getText().equals("") && !txtDescricao.getText().equals("")) {
            AduanaModel aduana = new AduanaModel();
            aduana.setNome(txtNome.getText());
            aduana.setCodigo(txtCodigo.getText());
            aduana.setDescricao(txtDescricao.getText());
            if (!txtId.getText().equals("")) {
                long idAduana;
                idAduana = Long.parseLong(txtId.getText());
                aduana.setIdAduana(idAduana);
            }
            if (this.aduanaRepository == null) {
                this.aduanaRepository = new AduanaRepository();
            }

            try {
                if (!txtId.getText().equals("")) {
                    this.aduanaRepository.atualizar(aduana);
                }else{
                    this.aduanaRepository.salvar(aduana);
                }
            } catch (Exception e) {
            }
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            txtNome.setText("");
            txtCodigo.setText("");
            txtDescricao.setText("");
            txtId.setText("");
            botaoCancelarEdicao.setVisible(false);
            botaoCadastrar.setLabel("Salvar");
        } else {
            JOptionPane.showMessageDialog(null, "Informe o nome, código e a descrição da Aduana");
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseEntered
        botaoCadastrar.setBackground(new Color(0, 153, 0));
        botaoCadastrar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_botaoCadastrarMouseEntered

    private void botaoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseExited
        botaoCadastrar.setBackground(new Color(0, 51, 51));
        botaoCadastrar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_botaoCadastrarMouseExited

    private void botaoEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarRegistroActionPerformed
        int linhaSelecionada = jtableAduanas.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        } else {
            long idCargo = (long) jtableAduanas.getValueAt(linhaSelecionada, 0);
            DefaultTableModel dtm = (DefaultTableModel) jtableAduanas.getModel();
            //CargoModel cargo = this.cargoRepository.buscarPorId(idCargo);
            txtId.setText("" + jtableAduanas.getValueAt(linhaSelecionada, 0));
            txtNome.setText((String) jtableAduanas.getValueAt(linhaSelecionada, 1));
            txtCodigo.setText((String) jtableAduanas.getValueAt(linhaSelecionada, 2));
            txtDescricao.setText((String) jtableAduanas.getValueAt(linhaSelecionada, 3));          
            
            botaoCancelarEdicao.setVisible(true);
            botaoCadastrar.setLabel("Salvar Alteração");
        }
    }//GEN-LAST:event_botaoEditarRegistroActionPerformed

    private void botaoRemoverRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverRegistroActionPerformed
        int linhaSelecionada = jtableAduanas.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        } else {
            long idAduana = (long) jtableAduanas.getValueAt(linhaSelecionada, 0);
            String nomeAduana = (String) jtableAduanas.getValueAt(linhaSelecionada, 1);
            int retorno = JOptionPane.showConfirmDialog(null, "Gostaria realmente de excluir a Aduana: " + nomeAduana + "?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (retorno == 0) {
                DefaultTableModel dtm = (DefaultTableModel) jtableAduanas.getModel();
                AduanaModel aduana = this.aduanaRepository.buscarPorId(idAduana);
                this.aduanaRepository.excluir(aduana);
                dtm.removeRow(jtableAduanas.getSelectedRow());
                jtableAduanas.setModel(dtm);
            }
        }
    }//GEN-LAST:event_botaoRemoverRegistroActionPerformed

    private void botaoEditarRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarRegistroMouseEntered
        botaoEditarRegistro.setBackground(new Color(204, 204, 0));
        botaoEditarRegistro.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_botaoEditarRegistroMouseEntered

    private void botaoEditarRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarRegistroMouseExited
        botaoEditarRegistro.setBackground(new Color(0, 51, 51));
        botaoEditarRegistro.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_botaoEditarRegistroMouseExited

    private void botaoRemoverRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverRegistroMouseEntered
        botaoRemoverRegistro.setBackground(new Color(255, 51, 51));
        botaoRemoverRegistro.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_botaoRemoverRegistroMouseEntered

    private void botaoRemoverRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverRegistroMouseExited
        botaoRemoverRegistro.setBackground(new Color(0, 51, 51));
        botaoRemoverRegistro.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_botaoRemoverRegistroMouseExited

    private void botaoCancelarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarEdicaoActionPerformed
        txtNome.setText("");
        txtDescricao.setText("");
        txtId.setText("");
        botaoCancelarEdicao.setVisible(false);
        botaoCadastrar.setLabel("Salvar");
    }//GEN-LAST:event_botaoCancelarEdicaoActionPerformed

    private void botaoCancelarEdicaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCancelarEdicaoMouseEntered
        botaoCancelarEdicao.setBackground(new Color(204, 204, 0));
        botaoCancelarEdicao.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_botaoCancelarEdicaoMouseEntered

    private void botaoCancelarEdicaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCancelarEdicaoMouseExited
        botaoCancelarEdicao.setBackground(new Color(0, 51, 51));
        botaoCancelarEdicao.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_botaoCancelarEdicaoMouseExited

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if (this.aduanaRepository != null) {
            this.aduanaRepository.fecharConexao();
        }
        txtNome.setText("");
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtId.setText("");
        botaoCancelarEdicao.setVisible(false);
        botaoCadastrar.setLabel("Salvar");

        DefaultTableModel model = (DefaultTableModel) jtableAduanas.getModel();
        model.setRowCount(0);
        jtableAduanas.setModel(model);
        
        this.dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        populaTabelaAduanas(txtNome.getText());
    }//GEN-LAST:event_botaoBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelarEdicao;
    private javax.swing.JButton botaoEditarRegistro;
    private javax.swing.JButton botaoRemoverRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtableAduanas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}