package view;

import control.ClienteControl;
import control.UsuariosControl;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.UsuariosDAO;

public class UsuariosVIEW extends javax.swing.JFrame {

    public UsuariosVIEW() {

        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTusuarios.getModel();
        jTusuarios.setRowSorter(new TableRowSorter(modelo));
        jTusuarios.setBorder(BorderFactory.createBevelBorder(0));
        jTusuarios.getTableHeader().setBorder(BorderFactory.createBevelBorder(0));

        Criar_ler_tabela();

        jLnome.setVisible(false);
        jTextField_nome.setVisible(false);

        jLid.setVisible(false);
        jTextField_id.setVisible(false);
        jBalterar.setVisible(false);
        jLid.setVisible(false);
        jTextField_id.setVisible(false);
        jBalterar.setVisible(false);
        jBexcluir.setVisible(false);
        estado.setVisible(false);
        jTestado.setVisible(false);
        telefone.setVisible(false);
        jTtelefone.setVisible(false);
        cidade.setVisible(false);
        jTcidade.setVisible(false);

    }

    public void Criar_ler_tabela() {

        DefaultTableModel modelo = (DefaultTableModel) jTusuarios.getModel();
        modelo.setNumRows(0);

        ArrayList<String> tabela = new ArrayList<>();
        UsuariosDAO ud = new UsuariosDAO();

        ud.receber_tabela(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        brNova_Cadastrar_usuario = new javax.swing.JButton();
        jBexcluir_usuario = new javax.swing.JButton();
        jBeditar_usuario = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTusuarios = new javax.swing.JTable();
        jLnome = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBalterar = new keeptoo.KButton();
        jBexcluir = new keeptoo.KButton();
        telefone = new javax.swing.JLabel();
        jTtelefone = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        jTcidade = new javax.swing.JTextField();
        estado = new javax.swing.JLabel();
        aviso3 = new javax.swing.JLabel();
        aviso2 = new javax.swing.JLabel();
        jTestado = new javax.swing.JTextField();
        aviso1 = new javax.swing.JLabel();
        aviso4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel3.setkEndColor(new java.awt.Color(102, 255, 153));
        kGradientPanel3.setkGradientFocus(200);
        kGradientPanel3.setkStartColor(new java.awt.Color(153, 51, 255));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cart.png"))); // NOI18N
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        brNova_Cadastrar_usuario.setBackground(new java.awt.Color(153, 51, 255));
        brNova_Cadastrar_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brNova_Cadastrar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        brNova_Cadastrar_usuario.setText("Cadastrar usuario");
        brNova_Cadastrar_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        brNova_Cadastrar_usuario.setContentAreaFilled(false);
        brNova_Cadastrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brNova_Cadastrar_usuarioActionPerformed(evt);
            }
        });
        kGradientPanel3.add(brNova_Cadastrar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, 42));

        jBexcluir_usuario.setBackground(new java.awt.Color(153, 51, 255));
        jBexcluir_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBexcluir_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jBexcluir_usuario.setText("Excluir usuario");
        jBexcluir_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jBexcluir_usuario.setContentAreaFilled(false);
        jBexcluir_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluir_usuarioActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jBexcluir_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 42));

        jBeditar_usuario.setBackground(new java.awt.Color(153, 51, 255));
        jBeditar_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBeditar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jBeditar_usuario.setText("Editar usuario");
        jBeditar_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jBeditar_usuario.setContentAreaFilled(false);
        jBeditar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditar_usuarioActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jBeditar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 44));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        jButton3.setText("Voltar");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 51, 255));

        jTusuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Telefone", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTusuarios.setGridColor(new java.awt.Color(255, 255, 255));
        jTusuarios.setOpaque(false);
        jTusuarios.setShowHorizontalLines(false);
        jTusuarios.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTusuarios);

        jLnome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLnome.setForeground(new java.awt.Color(153, 51, 255));
        jLnome.setText("Nome:");

        jLid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLid.setForeground(new java.awt.Color(153, 51, 255));
        jLid.setText("Id referente ao usuario:");

        jTextField_nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_nome.setForeground(new java.awt.Color(102, 51, 255));
        jTextField_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));

        jTextField_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(102, 51, 255));
        jTextField_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("x");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBalterar.setText("Alterar");
        jBalterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBalterar.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        jBalterar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        jBalterar.setkHoverStartColor(new java.awt.Color(153, 153, 255));
        jBalterar.setkIndicatorColor(new java.awt.Color(0, 204, 153));
        jBalterar.setkSelectedColor(new java.awt.Color(0, 204, 153));
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jBexcluir.setText("Excluir");
        jBexcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBexcluir.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        jBexcluir.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        jBexcluir.setkHoverStartColor(new java.awt.Color(153, 153, 255));
        jBexcluir.setkIndicatorColor(new java.awt.Color(0, 204, 153));
        jBexcluir.setkSelectedColor(new java.awt.Color(0, 204, 153));
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        telefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefone.setForeground(new java.awt.Color(99, 15, 229));
        telefone.setText("Telefone:");

        jTtelefone.setForeground(new java.awt.Color(99, 15, 229));
        jTtelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(99, 15, 229)));
        jTtelefone.setOpaque(false);
        jTtelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefoneActionPerformed(evt);
            }
        });

        cidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cidade.setForeground(new java.awt.Color(99, 15, 229));
        cidade.setText("Cidade:");

        jTcidade.setForeground(new java.awt.Color(99, 15, 229));
        jTcidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(99, 15, 229)));
        jTcidade.setOpaque(false);
        jTcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcidadeActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estado.setForeground(new java.awt.Color(99, 15, 229));
        estado.setText("Estado:");

        aviso3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aviso3.setForeground(new java.awt.Color(255, 0, 51));

        aviso2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aviso2.setForeground(new java.awt.Color(255, 0, 51));

        jTestado.setForeground(new java.awt.Color(99, 15, 229));
        jTestado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(99, 15, 229)));
        jTestado.setOpaque(false);
        jTestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTestadoActionPerformed(evt);
            }
        });

        aviso1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aviso1.setForeground(new java.awt.Color(255, 0, 51));

        aviso4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aviso4.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(aviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(aviso3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(estado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aviso4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(aviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLid, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLnome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado)
                            .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aviso1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aviso4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefone)
                        .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cidade)
                        .addComponent(jTcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aviso3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBeditar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditar_usuarioActionPerformed

        jLnome.setVisible(true);
        jTextField_nome.setVisible(true);
        estado.setVisible(true);
        jTestado.setVisible(true);
        telefone.setVisible(true);
        jTtelefone.setVisible(true);
        cidade.setVisible(true);
        jTcidade.setVisible(true);

        jLid.setVisible(true);
        jTextField_id.setVisible(true);
        jBalterar.setVisible(true);
        jBexcluir.setVisible(false);

    }//GEN-LAST:event_jBeditar_usuarioActionPerformed

    private void brNova_Cadastrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brNova_Cadastrar_usuarioActionPerformed

        new Cadastro_ClientesVIEW().setVisible(true);
        dispose();


    }//GEN-LAST:event_brNova_Cadastrar_usuarioActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        aviso1.setText("");
        aviso2.setText("");
        aviso3.setText("");
        aviso4.setText("");

        if (jTextField_nome.getText().trim().isEmpty()) {
            //instrucao para campo vazio
            aviso1.setText("O Campo 'nome' esta em branco");

        } else if (jTtelefone.getText().trim().isEmpty()) {
            //instrucao para campo vazio
            aviso2.setText("O Campo 'telefone' esta em branco");

        } else if (jTcidade.getText().trim().isEmpty()) {
            //instrucao para campo vazio
            aviso3.setText("O Campo 'Cidade' esta em branco");

        } else if (jTestado.getText().trim().isEmpty()) {
            //instrucao para campo vazio
            aviso4.setText("O Campo 'Estado' esta em branco");

        } else {
            ArrayList<String> myArrayList = new ArrayList<>();
            myArrayList.add(jTextField_id.getText());
            myArrayList.add(jTextField_nome.getText());
            UsuariosControl uct = new UsuariosControl();
            uct.recebe_lista_altera_usuario(myArrayList);

            ArrayList<String> myArrayList2 = new ArrayList<>();
            myArrayList2.add(jTextField_id.getText());
            myArrayList2.add(jTtelefone.getText());
            myArrayList2.add(jTcidade.getText());
            myArrayList2.add(jTestado.getText());

            ClienteControl ct = new ClienteControl();
            ct.recebe_lista_altera_cliente(myArrayList2);

            Criar_ler_tabela();
        }
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new AdminVIEW().setVisible(true);//que quer abrir
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBexcluir_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluir_usuarioActionPerformed
        // TODO add your handling code here:

        jLnome.setVisible(false);
        jTextField_nome.setVisible(false);  
        estado.setVisible(false);
        jTestado.setVisible(false);
        telefone.setVisible(false);
        jTtelefone.setVisible(false);
        cidade.setVisible(false);
        jTcidade.setVisible(false);

        jLid.setVisible(true);
        jTextField_id.setVisible(true);
        jBalterar.setVisible(false);
        jBexcluir.setVisible(true);
        

    }//GEN-LAST:event_jBexcluir_usuarioActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add(jTextField_id.getText());

        UsuariosControl uct = new UsuariosControl();
        uct.recebe_lista_exclui_usuario(myArrayList);

        ArrayList<String> myArrayList2 = new ArrayList<>();
        myArrayList2.add(jTextField_id.getText());

        ClienteControl ct = new ClienteControl();
        ct.recebe_lista_exclui_cliente(myArrayList2);

        Criar_ler_tabela();

    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jTtelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefoneActionPerformed

    private void jTcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcidadeActionPerformed

    private void jTestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTestadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuariosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new UsuariosVIEW().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso1;
    private javax.swing.JLabel aviso2;
    private javax.swing.JLabel aviso3;
    private javax.swing.JLabel aviso4;
    private javax.swing.JButton brNova_Cadastrar_usuario;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel estado;
    private keeptoo.KButton jBalterar;
    private javax.swing.JButton jBeditar_usuario;
    private keeptoo.KButton jBexcluir;
    private javax.swing.JButton jBexcluir_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcidade;
    private javax.swing.JTextField jTestado;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTtelefone;
    private javax.swing.JTable jTusuarios;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}
