package br.unesc.topicos.grc.view;

import br.unesc.topicos.grc.bean.GrupoProduto;
import java.awt.Color;
import br.unesc.topicos.grc.listener.CadastroGrupoProdutoListener;

public class CadastroGrupoProdutoJIF extends javax.swing.JInternalFrame {

    private boolean camposValidos = true;
    private CadastroGrupoProdutoListener jInternalListeners
            = new CadastroGrupoProdutoListener(this);

    public CadastroGrupoProdutoJIF() {
        initComponents();
        getRootPane().setDefaultButton(jButtonSalvarGrupo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelGrupo = new javax.swing.JLabel();
        jTextFieldGrupo = new javax.swing.JTextField();
        jButtonSalvarGrupo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelAviso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Grupo de Produtos");

        jLabelGrupo.setText("Novo Grupo:");

        jButtonSalvarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unesc/topicos/grc/layout/content-save.png"))); // NOI18N
        jButtonSalvarGrupo.setText("Salvar");
        jButtonSalvarGrupo.addActionListener(jInternalListeners);
        jButtonSalvarGrupo.setActionCommand("salvarNGrupo");

        jLabelAviso.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAviso.setText("Campos com \"*\" são obrigatórios");
        jLabelAviso.setVisible(false);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelGrupo)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGrupo)
                    .addComponent(jTextFieldGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSalvarGrupo)
                    .addComponent(jLabelAviso))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        limparCampos();
    }//GEN-LAST:event_formComponentHidden

    public GrupoProduto getDadoGrupoProduto() {
        if (validarCampos()) {
            GrupoProduto grupoProduto = new GrupoProduto();
            grupoProduto.setNome(jTextFieldGrupo.getText());

            return grupoProduto;
        }

        return null;
    }

    public boolean validarCampos() {
        camposValidos = true;

        if (jTextFieldGrupo.getText().equals("")) {
            jLabelGrupo.setForeground(Color.red);
            camposValidos = false;
        } else {
            jLabelGrupo.setForeground(Color.black);
        }

        jLabelAviso.setVisible(!camposValidos);

        return camposValidos;
    }

    public void limparCampos() {
        jTextFieldGrupo.setText("");
        jLabelGrupo.setForeground(Color.black);
        jLabelAviso.setVisible(false);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAviso;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldGrupo;
    // End of variables declaration//GEN-END:variables
}
