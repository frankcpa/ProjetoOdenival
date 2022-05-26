/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pessoa;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CargoModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import repository.CargoRepository;

/**
 *
 * @author Frank
 */
public class frameManterCargo extends javax.swing.JInternalFrame {

    private static frameManterCargo frameCargo;
    private CargoRepository cargoRepository = null;

    public static frameManterCargo getInstancia() {
        if (frameCargo == null) {
            frameCargo = new frameManterCargo();
        }
        return frameCargo;
    }

    public frameManterCargo() {
        initComponents();
        //((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        botaoCancelarEdicao.setVisible(false);
        txtIdCargo.setVisible(false);
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
        txtNomeCargo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoCargo = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo2 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableCargos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNomeBuscar = new javax.swing.JTextField();
        botaoBuscarCargos = new javax.swing.JButton();
        txtIdCargo = new javax.swing.JTextField();
        botaoCadastrarCargo = new javax.swing.JButton();
        botaoEditarRegistro = new javax.swing.JButton();
        botaoRemoverRegistro = new javax.swing.JButton();
        botaoCancelarEdicao = new javax.swing.JButton();
        botaoGerarRelatorio = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Funcionário");
        setToolTipText("Cadastro de Funcionário");
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
        jLabel1.setText("Manter Cadastro de Cargo");
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

        txtDescricaoCargo.setColumns(20);
        txtDescricaoCargo.setRows(5);
        txtDescricaoCargo.setMinimumSize(new java.awt.Dimension(4, 20));
        jScrollPane1.setViewportView(txtDescricaoCargo);

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
        labelTitulo2.setText("Cargos Já Cadastrados");
        labelTitulo2.setRequestFocusEnabled(false);

        labelTitulo.setBackground(new java.awt.Color(56, 65, 84));
        labelTitulo.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Cadastrar Novo Cargo");
        labelTitulo.setRequestFocusEnabled(false);

        jtableCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableCargos.setColumnSelectionAllowed(true);
        jtableCargos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jtableCargos);
        jtableCargos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtableCargos.getColumnModel().getColumnCount() > 0) {
            jtableCargos.getColumnModel().getColumn(0).setMinWidth(0);
            jtableCargos.getColumnModel().getColumn(0).setPreferredWidth(0);
            jtableCargos.getColumnModel().getColumn(0).setMaxWidth(0);
            jtableCargos.getColumnModel().getColumn(1).setMinWidth(200);
            jtableCargos.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtableCargos.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jLabel4.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel4.setText("Nome");

        botaoBuscarCargos.setBackground(new java.awt.Color(0, 204, 153));
        botaoBuscarCargos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoBuscarCargos.setForeground(new java.awt.Color(255, 255, 255));
        botaoBuscarCargos.setText("Buscar");
        botaoBuscarCargos.setBorder(null);
        botaoBuscarCargos.setBorderPainted(false);
        botaoBuscarCargos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoBuscarCargos.setPreferredSize(new java.awt.Dimension(43, 20));
        botaoBuscarCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarCargosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNomeBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoBuscarCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(txtNomeCargo)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(291, 291, 291)
                                    .addComponent(txtIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(labelTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(114, 114, 114)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txtNomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtNomeBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscarCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(550, Short.MAX_VALUE)))
        );

        botaoCadastrarCargo.setBackground(new java.awt.Color(0, 51, 51));
        botaoCadastrarCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrarCargo.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrarCargo.setText("Salvar");
        botaoCadastrarCargo.setBorder(null);
        botaoCadastrarCargo.setBorderPainted(false);
        botaoCadastrarCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoCadastrarCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCadastrarCargoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCadastrarCargoMouseExited(evt);
            }
        });
        botaoCadastrarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarCargoActionPerformed(evt);
            }
        });

        botaoEditarRegistro.setBackground(new java.awt.Color(0, 51, 51));
        botaoEditarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoEditarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditarRegistro.setText("Editar Registro");
        botaoEditarRegistro.setBorderPainted(false);
        botaoEditarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        botaoRemoverRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        botaoCancelarEdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        botaoGerarRelatorio.setBackground(new java.awt.Color(0, 51, 51));
        botaoGerarRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoGerarRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        botaoGerarRelatorio.setText("Gerar Relatório");
        botaoGerarRelatorio.setBorderPainted(false);
        botaoGerarRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoGerarRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoGerarRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoGerarRelatorioMouseExited(evt);
            }
        });
        botaoGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarRelatorioActionPerformed(evt);
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
                    .addComponent(botaoCadastrarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEditarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(botaoRemoverRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(botaoCancelarEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
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
                        .addComponent(botaoCadastrarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoEditarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRemoverRegistro)
                        .addGap(27, 27, 27)
                        .addComponent(botaoGerarRelatorio)
                        .addGap(131, 131, 131))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populaTabelaCargos(String nome) {
        if (this.cargoRepository == null) {
            this.cargoRepository = new CargoRepository();
        }
        DefaultTableModel model = (DefaultTableModel) jtableCargos.getModel();
        model.setRowCount(0);
        List<CargoModel> listaDeCargos = this.cargoRepository.buscarPorNome(nome);
        for (int i = 0; i < listaDeCargos.size(); i++) {
            model.addRow(new Object[]{
                listaDeCargos.get(i).getIdCargo(),
                listaDeCargos.get(i).getNome(),
                listaDeCargos.get(i).getDescricao()
            });
        }
        jtableCargos.setModel(model);
    }

    private void botaoCadastrarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarCargoActionPerformed
        if (!txtNomeCargo.getText().equals("") && !txtDescricaoCargo.getText().equals("")) {
            CargoModel cargo = new CargoModel();
            cargo.setNome(txtNomeCargo.getText());
            cargo.setDescricao(txtDescricaoCargo.getText());
            if (!txtIdCargo.getText().equals("")) {
                long idCargo;
                idCargo = Long.parseLong(txtIdCargo.getText());
                cargo.setIdCargo(idCargo);
            }
            if (this.cargoRepository == null) {
                this.cargoRepository = new CargoRepository();
            }

            try {
                if (!txtIdCargo.getText().equals("")) {
                    this.cargoRepository.atualizar(cargo);
                } else {
                    this.cargoRepository.salvar(cargo);
                }
            } catch (Exception e) {
            }
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            txtNomeCargo.setText("");
            txtDescricaoCargo.setText("");
            txtIdCargo.setText("");
            botaoCancelarEdicao.setVisible(false);
            botaoCadastrarCargo.setLabel("Salvar");
        } else {
            JOptionPane.showMessageDialog(null, "Informe o nome e a descrição do cargo");
        }
    }//GEN-LAST:event_botaoCadastrarCargoActionPerformed

    private void botaoCadastrarCargoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarCargoMouseEntered
        botaoCadastrarCargo.setBackground(new Color(0, 153, 0));
        botaoCadastrarCargo.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_botaoCadastrarCargoMouseEntered

    private void botaoCadastrarCargoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarCargoMouseExited
        botaoCadastrarCargo.setBackground(new Color(0, 51, 51));
        botaoCadastrarCargo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_botaoCadastrarCargoMouseExited

    private void botaoBuscarCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarCargosActionPerformed
        populaTabelaCargos(txtNomeBuscar.getText());
    }//GEN-LAST:event_botaoBuscarCargosActionPerformed

    private void botaoEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarRegistroActionPerformed
        int linhaSelecionada = jtableCargos.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        } else {
            long idCargo = (long) jtableCargos.getValueAt(linhaSelecionada, 0);
            DefaultTableModel dtm = (DefaultTableModel) jtableCargos.getModel();
            //CargoModel cargo = this.cargoRepository.buscarPorId(idCargo);
            txtNomeCargo.setText((String) jtableCargos.getValueAt(linhaSelecionada, 1));
            txtDescricaoCargo.setText((String) jtableCargos.getValueAt(linhaSelecionada, 2));
            txtIdCargo.setText("" + jtableCargos.getValueAt(linhaSelecionada, 0));
            botaoCancelarEdicao.setVisible(true);
            botaoCadastrarCargo.setLabel("Salvar Alteração");
        }
    }//GEN-LAST:event_botaoEditarRegistroActionPerformed

    private void botaoRemoverRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverRegistroActionPerformed
        int linhaSelecionada = jtableCargos.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        } else {
            long idCargo = (long) jtableCargos.getValueAt(linhaSelecionada, 0);
            String nomeCargo = (String) jtableCargos.getValueAt(linhaSelecionada, 1);
            int retorno = JOptionPane.showConfirmDialog(null, "Gostaria realmente de excluir o cargo de " + nomeCargo + "?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (retorno == 0) {
                DefaultTableModel dtm = (DefaultTableModel) jtableCargos.getModel();
                CargoModel cargo = this.cargoRepository.buscarPorId(idCargo);
                this.cargoRepository.excluir(cargo);
                dtm.removeRow(jtableCargos.getSelectedRow());
                jtableCargos.setModel(dtm);
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
        txtNomeCargo.setText("");
        txtDescricaoCargo.setText("");
        txtIdCargo.setText("");
        botaoCancelarEdicao.setVisible(false);
        botaoCadastrarCargo.setLabel("Salvar");
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
        if (this.cargoRepository != null) {
            this.cargoRepository.fecharConexao();
        }
        txtNomeCargo.setText("");
        txtDescricaoCargo.setText("");
        txtIdCargo.setText("");
        botaoCancelarEdicao.setVisible(false);
        botaoCadastrarCargo.setLabel("Salvar");

        DefaultTableModel model = (DefaultTableModel) jtableCargos.getModel();
        model.setRowCount(0);
        jtableCargos.setModel(model);

        this.dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void botaoGerarRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGerarRelatorioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGerarRelatorioMouseEntered

    private void botaoGerarRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGerarRelatorioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGerarRelatorioMouseExited

    private void botaoGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarRelatorioActionPerformed
        List<CargoModel> listaCargos = cargoRepository.buscarPorNome("chefão");
        JasperPrint jasperPrint = null;
        String path = "resources/jasperreports/cargos2.jrxml";
        
        try {
            InputStream employeeReportStream;
            employeeReportStream = new FileInputStream(new File(path).getPath());
            JasperReport jasperReport = JasperCompileManager.compileReport(employeeReportStream);
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(listaCargos);
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, ds);
        } catch (FileNotFoundException | JRException ex) {
            Logger.getLogger(frameManterCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer view = new JasperViewer(jasperPrint, false);
        view.setVisible(true);
    }//GEN-LAST:event_botaoGerarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscarCargos;
    private javax.swing.JButton botaoCadastrarCargo;
    private javax.swing.JButton botaoCancelarEdicao;
    private javax.swing.JButton botaoEditarRegistro;
    private javax.swing.JButton botaoGerarRelatorio;
    private javax.swing.JButton botaoRemoverRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtableCargos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JTextArea txtDescricaoCargo;
    private javax.swing.JTextField txtIdCargo;
    private javax.swing.JTextField txtNomeBuscar;
    private javax.swing.JTextField txtNomeCargo;
    // End of variables declaration//GEN-END:variables
}
