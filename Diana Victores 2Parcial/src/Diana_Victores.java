
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Diana_Victores extends javax.swing.JFrame {

    /**
     * Creates new form Diana_Victores
     */
    public Diana_Victores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cara = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        parra = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        voca = new javax.swing.JRadioButton();
        num = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        conv = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ingrese parrafo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, -1, -1));
        getContentPane().add(parra, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 20, 95, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CARACTER"));

        cara.add(voca);
        voca.setText("vocal");

        cara.add(num);
        num.setText("numero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voca)
                    .addComponent(num))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(voca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(num)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 58, 130, -1));

        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 162, -1, -1));

        jLabel2.setText("convertido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 206, -1, -1));
        getContentPane().add(conv, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 203, 94, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "caracter", "aparece"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 90));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "palabra", "longitud"
            }
        ));
        jScrollPane3.setViewportView(tabla2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 250, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    DefaultTableModel model=(DefaultTableModel)tabla.getModel();
           
String t,newpal="";
int i,x,alt=0,elt=0,ilt=0,olt=0,ult=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n0=0;
char ch;
t=parra.getText();
x=t.length();

 if(voca.isSelected()){ 
for (i=0;i<x;i=i+1){
ch=t.charAt(i);
 if(ch=='a'){
  alt=alt+1;
  }
  if(ch=='e'){
  elt=elt+1;
  }
  if(ch=='i'){
  ilt=ilt+1;
  }
  if(ch=='o'){
  olt=olt+1;
  }
  if(ch=='u'){
  ult=ult+1;
  }
}
Object[] file=new Object[2];
file[0]="a";
file[1]=String.valueOf(alt);   
model.addRow(file);
file[0]="e";
file[1]=String.valueOf(elt);   
model.addRow(file);
file[0]="i";
file[1]=String.valueOf(ilt); 
model.addRow(file);
file[0]="o";
file[1]=String.valueOf(olt);   
model.addRow(file);
file[0]="u";
file[1]=String.valueOf(ult);   
model.addRow(file);
tabla.setModel(model);

}

if(num.isSelected()){ 
for (i=0;i<x;i=i+1){
ch=t.charAt(i);
if(ch=='1'){
  n1=n1+1;
  }
  if(ch=='2'){
  n2=n2+1;
  }
   if(ch=='3'){
  n3=n3+1;
  }
    if(ch=='4'){
  n4=n4+1;
  }
     if(ch=='5'){
  n5=n5+1;
  }
       if(ch=='6'){
  n6=n6+1;
  }
       if(ch=='7'){
  n7=n7+1;
  }
       if(ch=='8'){
  n8=n8+1;
  }
    if(ch=='9'){
  n9=n9+1;
  }
      if(ch=='0'){
  n0=n0+1;
  }  
}Object[] file=new Object[2];
file[0]="1";
file[1]=String.valueOf(n1);
model.addRow(file);
file[0]="2";
file[1]=String.valueOf(n2);
model.addRow(file);
file[0]="3";
file[1]=String.valueOf(n3);
model.addRow(file);
file[0]="4";
file[1]=String.valueOf(n4);
model.addRow(file);
file[0]="5";
file[1]=String.valueOf(n5);
model.addRow(file);
file[0]="6";
file[1]=String.valueOf(n6);
model.addRow(file);
file[0]="7";
file[1]=String.valueOf(n7);
model.addRow(file);
file[0]="8";
file[1]=String.valueOf(n8);
model.addRow(file);
file[0]="9";
file[1]=String.valueOf(n9);
model.addRow(file);
file[0]="0";
file[1]=String.valueOf(n0);
model.addRow(file);
tabla.setModel(model);
 
}

conv.setText(newpal);
//LONGITUD
String palabra;
   
   char ch2;
   palabra=parra.getText();
 StringTokenizer st=new StringTokenizer (palabra);
  String pal="";
while (st.hasMoreTokens()){
pal=st.nextToken();
    DefaultTableModel modelo= (DefaultTableModel) tabla2.getModel();
           Object [] fila=new Object[10];
           fila[0]=pal;
           fila[1]=pal.length();
           modelo.addRow(fila);
tabla2.setModel(modelo);
    
    }
  

    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diana_Victores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diana_Victores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diana_Victores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diana_Victores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diana_Victores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup cara;
    private javax.swing.JTextField conv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton num;
    private javax.swing.JTextField parra;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JRadioButton voca;
    // End of variables declaration//GEN-END:variables
}
