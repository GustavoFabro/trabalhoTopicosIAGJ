package br.unesc.topicos.grc.view;

import br.unesc.topicos.grc.bean.Cliente;
import br.unesc.topicos.grc.dao.ClienteDao;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import br.unesc.topicos.grc.listener.AniversarioListener;
import br.unesc.topicos.grc.util.LogEvents;

public class AniversarioJIF extends javax.swing.JInternalFrame {

    private LogEvents logEvents = new LogEvents();
    private AniversarioListener jInternalListeners = new AniversarioListener(this);
    private MaskFormatter dataFormatter;
    private ClienteDao dao = new ClienteDao();

    private Cliente cliente;
    private String auxAniversario;
    private String[] listAniversario;

    public AniversarioJIF() {

        try {
            dataFormatter = new MaskFormatter("##/##/####");
            dataFormatter.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            logEvents.gravarLog(ex.getMessage() + "\n");
        }

        initComponents();

    }

    public void setListaAniversariantes(List<Cliente> lista) {
        listaAniversarios.removeAll();
     
        listaAniversarios.setListData(
                new Vector(new Vector(lista)));
    }

    public String[] getDadosAniversario() {
        String mes = "__";

        if (jComboBoxMes.getSelectedIndex() != 0) {
            if (jComboBoxMes.getSelectedIndex() < 10) {
                mes = "0" + (jComboBoxMes.getSelectedIndex());
            } else {
                mes = (jComboBoxMes.getSelectedIndex()) + "";
            }

        }

        return new String[]{
            (jComboBoxDia.getSelectedItem() != "*")
            ? (String) jComboBoxDia.getSelectedItem() : "__", mes
        };

    }

    public void limparCampos() {
        jComboBoxDia.setSelectedIndex(-1);
        jComboBoxMes.setSelectedIndex(-1);
        listaAniversarios.removeAll();
        
        labelNome.setText(""); 
        labelCpf.setText("");
        labelDataC.setText(""); 
        labelTel.setText("");
        labelEmail.setText(""); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAniversarios = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelDataC = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(233, 233, 233));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Dia:");

        listaAniversarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAniversariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaAniversarios);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Pesquisa Aniversário");

        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unesc/grc/topicos/layout/account-search.png"))); // NOI18N
        btnProcurar.setMinimumSize(new java.awt.Dimension(48, 48));
        btnProcurar.setActionCommand("procurar");
        btnProcurar.addActionListener(jInternalListeners);

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
            { "*", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
                "28", "29", "30", "31"}));
    jComboBoxDia.setSelectedIndex(0);

    jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel7.setText("Mês");

    jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
        { "*", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"}));
jComboBoxMes.setSelectedIndex(0);

jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
jLabel3.setText("Nome:");

jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
jLabel4.setText("CPF:");

jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
jLabel5.setText("Telefone:");

jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
jLabel6.setText("Cliente desde:");

jLabel8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
jLabel8.setText("E-mail:");

labelNome.setText("                                                                            ");

labelCpf.setText("                                                                          ");

labelTel.setText("                                                                 ");

labelEmail.setText("                                                                      ");

labelDataC.setText("                                                             ");

javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(
    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelTel))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelNome))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelDataC)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(labelNome))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(labelCpf))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(labelTel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(labelDataC))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(labelEmail)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        limparCampos();
    }//GEN-LAST:event_formComponentHidden

    private void listaAniversariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAniversariosValueChanged
        Cliente cliente = (Cliente) listaAniversarios.getSelectedValue();

        if (cliente != null) {
            labelNome.setText(cliente.getNome() + " " + cliente.getSobreNome());
            labelCpf.setText(cliente.getCpf());
            labelDataC.setText(convertDate(cliente.getDataCadastro().split("-")));
            labelTel.setText(cliente.getTelefone());
            labelEmail.setText(cliente.getEmail().equals("")?
                    "E-mail não cadastrado" : cliente.getEmail());  
        }
    }//GEN-LAST:event_listaAniversariosValueChanged

    public String convertDate(String[] data) {
        return data[2] + "/" + data[1] + "/" + data[0];
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcurar;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataC;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTel;
    private javax.swing.JList listaAniversarios;
    // End of variables declaration//GEN-END:variables
}