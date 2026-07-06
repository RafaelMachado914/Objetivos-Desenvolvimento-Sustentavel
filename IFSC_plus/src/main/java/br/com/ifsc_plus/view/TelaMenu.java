package br.com.ifsc_plus.view;


import br.com.ifsc_plus.dao.AlunoDao;
import br.com.ifsc_plus.dao.CursoDao;
import br.com.ifsc_plus.dao.MatriculaDAO;
import br.com.ifsc_plus.model.Aluno;
import br.com.ifsc_plus.model.Curso;
import br.com.ifsc_plus.model.Matricula;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaMenu extends javax.swing.JFrame {

    private Long idSelecionado;

    public TelaMenu() {
        initComponents();
        carregarAlunos();
        carregarCursos();
        listarMatriculas();
    }


    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        SairBotao = new javax.swing.JButton();
        SairBotao1 = new javax.swing.JButton();
        SairBotao2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        MATRICULAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MATRICULAR1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("IFSC +");

        SairBotao.setBackground(new java.awt.Color(153, 255, 153));
        SairBotao.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SairBotao.setForeground(new java.awt.Color(204, 0, 0));
        SairBotao.setText("SAIR");
        SairBotao.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 51, 51)));
        SairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairBotaoActionPerformed(evt);
            }
        });

        SairBotao1.setBackground(new java.awt.Color(153, 255, 153));
        SairBotao1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SairBotao1.setForeground(new java.awt.Color(204, 0, 0));
        SairBotao1.setText("CADASTRAR CURSO");
        SairBotao1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 51, 51)));
        SairBotao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairBotao1ActionPerformed(evt);
            }
        });

        SairBotao2.setBackground(new java.awt.Color(153, 255, 153));
        SairBotao2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SairBotao2.setForeground(new java.awt.Color(204, 0, 0));
        SairBotao2.setText("CADASTRAR ALUNO");
        SairBotao2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 51, 51)));
        SairBotao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairBotao2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(241, 241, 241))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SairBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SairBotao1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SairBotao2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(SairBotao2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(SairBotao1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(SairBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(1073, 554));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("GERENCIAMENTO DE MATRICULAS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ALUNO:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CURSO:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<Curso>());

        MATRICULAR.setBackground(new java.awt.Color(0, 255, 0));
        MATRICULAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MATRICULAR.setForeground(new java.awt.Color(255, 255, 255));
        MATRICULAR.setText("MATRICULAR");
        MATRICULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATRICULARActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MATRICULAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "ALUNO", "CURSO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        MATRICULAR1.setBackground(new java.awt.Color(0, 255, 0));
        MATRICULAR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MATRICULAR1.setForeground(new java.awt.Color(255, 255, 255));
        MATRICULAR1.setText("EXCLUIR");
        MATRICULAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATRICULAR1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<Aluno>());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(MATRICULAR))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, 840, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(MATRICULAR1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(MATRICULAR)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MATRICULAR1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairBotao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairBotao2ActionPerformed
        new TelaCadAluno().setVisible(true);
    }//GEN-LAST:event_SairBotao2ActionPerformed

    private void SairBotao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairBotao1ActionPerformed
        new TelaCadCursorso().setVisible(true);
    }//GEN-LAST:event_SairBotao1ActionPerformed

    private void SairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairBotaoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairBotaoActionPerformed

    private void MATRICULAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATRICULAR1ActionPerformed
         if(idSelecionado == null){

        JOptionPane.showMessageDialog(this,
                "Selecione uma matrícula.");

        return;

    }

    MatriculaDAO dao = new MatriculaDAO();

    dao.excluir(idSelecionado);

    listarMatriculas();

    idSelecionado = null;

    }//GEN-LAST:event_MATRICULAR1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void MATRICULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATRICULARActionPerformed
            Aluno aluno = (Aluno) jComboBox1.getSelectedItem();

    Curso curso = (Curso) jComboBox2.getSelectedItem();

    if(aluno == null || curso == null){

        JOptionPane.showMessageDialog(this,
                "Selecione um aluno e um curso.");

        return;

    }

    Matricula matricula = new Matricula();

    matricula.setAluno(aluno);

    matricula.setCurso(curso);

    MatriculaDAO dao = new MatriculaDAO();

    dao.salvar(matricula);

    JOptionPane.showMessageDialog(this,
            "Aluno matriculado com sucesso.");

    listarMatriculas();

    limparCampos();
    }//GEN-LAST:event_MATRICULARActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int linha = jTable1.getSelectedRow();

        if(linha != -1){

           idSelecionado =
                Long.parseLong(
                        jTable1.getValueAt(linha,0).toString());

    }
    }//GEN-LAST:event_jTable1MouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }
    
private void carregarAlunos(){

    AlunoDao dao = new AlunoDao();

    jComboBox1.removeAllItems();

    for(Aluno aluno : dao.listarTodos()){

        jComboBox1.addItem(aluno);

    }

}

private void carregarCursos(){

    CursoDao dao = new CursoDao();

    jComboBox2.removeAllItems();

    for(Curso curso : dao.listarTodos()){

        jComboBox2.addItem(curso);

    }

}

private void listarMatriculas(){

    DefaultTableModel modelo =
            (DefaultTableModel) jTable1.getModel();

    modelo.setRowCount(0);

    MatriculaDAO dao = new MatriculaDAO();

    for(Matricula m : dao.listarTodos()){

        modelo.addRow(new Object[]{

            m.getId(),

            m.getAluno().getNome(),

            m.getCurso().getNome()

        });

    }

}

private void limparCampos(){

    jComboBox1.setSelectedIndex(-1);

    jComboBox2.setSelectedIndex(-1);

}
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MATRICULAR;
    private javax.swing.JButton MATRICULAR1;
    private javax.swing.JButton SairBotao;
    private javax.swing.JButton SairBotao1;
    private javax.swing.JButton SairBotao2;
    private javax.swing.JComboBox<Aluno> jComboBox1;
    private javax.swing.JComboBox<Curso> jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
