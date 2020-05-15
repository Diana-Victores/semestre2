
//import java.awt.Color;
import Login.in_sesion;
import Nomina.reciboo;
import Nomina.LABORATORIO1;
import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class LABORATORIOCOMPLETO extends javax.swing.JFrame {
    //Esto significa que colocando la palabra eslash sera lo mismo poner las barras invertidas \\
    String eslash=File.separator;
    //Esta es la ubicacion de la base de datos
    String ubicacion=System.getProperty("user.dir")+eslash+"Empleados"+eslash;
    //user.dir es para decir que la ubicacion de la bd estara dentro del proyecto
    //ademas de que este en la carpeta del proyecto que me cree una nueva carpeta que se llamara registros
    
    /**
     * Creates new form Planilla
     */
       public LABORATORIOCOMPLETO() {
        initComponents();
    }
       
       //colocames un metodo crear 
    private void Crear(){
        //como ya tengo creada la ubicacion del archivo creare el nombre del archivo, es decir el archivop tendra el nombre ID   
        String archivo=nombres.getText()+".registros"; //registros sera la extension del archivo
        //en un file creara la ubicacion
        File crea_ubicacion=new File(ubicacion);
        File crea_archivo=new File(ubicacion+archivo); //el archivo se creara en donde esta la ubicacion
        
        //en caso que no tenga nada escrito el campo del ID
        if(nombres.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "NO ESTA INGRESADO EL ID");
        }else{
            
            try {
                //en caso que no exista el archivo lo cree
            if(crea_archivo.exists()){
                JOptionPane.showMessageDialog(rootPane, "EL REGISTO YA EXISTE");
            }else{
                
                String puestooo;
                
               //sirve para crear la carpeta
               crea_ubicacion.mkdirs();
                try (Formatter creaForma = new Formatter(ubicacion+archivo)) {
                    creaForma.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n","***Empresa "+jLabel3.getText(),
                            "NOMBRE= "+nombres.getText(),
                            "PUESTO= "+pues.getText(),
                            "***INGRESOS DEL EMPLEADO***",
                            "SUELDO EXTRAORDINARIO= "+suel.getText(),
                            "COMISIONES= "+comis.getText(),
                            "***DESCUENTOS DEL EMPLEADO***",
                            "ANTICIPOS= "+antici.getText(),
                            "DESCUENTO JUDICIAL= "+djudicial.getText());
                }
               JOptionPane.showMessageDialog(rootPane,"REGISTRO INGRESADO CORRECTAMENTE");
            }
         } catch (Exception e){
         JOptionPane.showMessageDialog(rootPane,"REGISTRO INCORRECTO");
            }
        }
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
        nombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pues = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        suel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        otross = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        antici = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        djudicial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        otrosss = new javax.swing.JTextField();
        CmdCalc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        CmdSalir = new javax.swing.JButton();
        CmdTotales = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TSal = new javax.swing.JTextField();
        cheque = new javax.swing.JButton();
        CmdCalc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 60, 90));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        nombres.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("Puesto:");

        pues.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pues, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Desarrollo Empresarial S.A.");

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Sueldo Extraordinario:");

        suel.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("Comisiones:");

        comis.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Otros:");

        otross.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otross, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(suel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(otross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descuentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("Anticipos:");

        antici.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Descuento Judicial:");

        djudicial.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("Otros:");

        otrosss.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otrosss, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(djudicial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(antici, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(antici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(djudicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(otrosss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        CmdCalc.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        CmdCalc.setText("Calcular");
        CmdCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalcActionPerformed(evt);
            }
        });

        tablita.setBackground(new java.awt.Color(102, 102, 102));
        tablita.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        tablita.setForeground(new java.awt.Color(255, 255, 255));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puesto", "Sueldo Ordinario", "Sueldo Extra", "Bonificación", "Comisiones", "Otros", "Total Ingreso", "IGSS", "ISR", "Anticipos", "Descuento Judicial", "Otros", "Total Descuentosl", "Sueldo Líquido"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        CmdSalir.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        CmdSalir.setText("Salir");
        CmdSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSalirActionPerformed(evt);
            }
        });

        CmdTotales.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        CmdTotales.setText("Totales");
        CmdTotales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdTotalesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setText("Total Salarios:");

        TSal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        cheque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheque.setForeground(new java.awt.Color(204, 0, 0));
        cheque.setText("Generar Cheque");
        cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeActionPerformed(evt);
            }
        });

        CmdCalc1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        CmdCalc1.setText("Guardar");
        CmdCalc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cheque)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20)
                        .addComponent(TSal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmdCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmdTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmdCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(358, 358, 358)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cheque)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CmdCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(CmdTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CmdCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalcActionPerformed
        //----- VARIABLES -----//
        String nombree="";
        String puestoo="";
        double sueldo=0.0;
        //------------------------//
        nombree = nombres.getText();
        puestoo = pues.getText();
        switch(puestoo)
        {
            case "Contador":
                sueldo=6000;
                break;
            case "Auxiliar":
                sueldo=2000;
                break;
            case "Secretaria":
                sueldo=2500;
                break;
            case "Vendedora":
                sueldo=1000;
                break;
            case "Chofer":
                sueldo=1800;
                break;
            case "Mensajero":
                sueldo=900;
                break;
        }
        //--------------------------//
        double sueldoExtra=0, comisiones=0, otrosIngresos=0;
        sueldoExtra=Double.parseDouble(suel.getText());
        comisiones=Double.parseDouble(comis.getText());
        otrosIngresos=Double.parseDouble(otross.getText());
        //----------------------------------------------//
        double totIngresos=0;
        //--- SE ADICIONAN 154.5, VALOR DE LA BONIFICACIÓN INCENTIVO
        totIngresos = 154.5+sueldo+sueldoExtra+comisiones+otrosIngresos;
        //-------------------------------------------------------//
        double igss=0;
        igss=sueldo*0.0483;
        double isr=0;
        if(sueldo>=5000){
            isr=71.98;
        }
        double anticipos=0, dj=0, otrosDescuentos=0;
        double totDesc=0;
        anticipos=Double.parseDouble(antici.getText());
        dj=Double.parseDouble(djudicial.getText());
        otrosDescuentos=Double.parseDouble(otrosss.getText());
        //---------
        totDesc=igss+isr+anticipos+dj+otrosDescuentos;
        //---------------------//
        double sueldoLiquido=0;
        sueldoLiquido = totIngresos-totDesc;
        //---------------------------------------//
        Object[] data = new Object[15];
        data[0]=nombree;
        data[1]=puestoo;
        data[2]=String.valueOf(sueldo);
        data[3]=String.valueOf(sueldoExtra);
        data[4]="154.5";
        data[5]=String.valueOf(comisiones);
        data[6]=String.valueOf(otrosIngresos);
        data[7]=String.valueOf(totIngresos);
        data[8]=String.valueOf(igss);
        data[9]="71.98";
        data[10]=String.valueOf(anticipos);
        data[11]=String.valueOf(dj);
        data[12]=String.valueOf(otrosDescuentos);
        data[13]=String.valueOf(totDesc);
        data[14]=String.valueOf(sueldoLiquido);
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        modelo.addRow(data);
        tablita.setModel(modelo);
        //--------------------------//
        nombres.setText("");
        suel.setText("");
        comis.setText("");
        otross.setText("");
        antici.setText("");
        otrosss.setText("");
        djudicial.setText("");
        nombres.requestFocus();
    }//GEN-LAST:event_CmdCalcActionPerformed

    private void CmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_CmdSalirActionPerformed

    private void CmdTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdTotalesActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        float t2=0; String t0="";
        for(int i=0; i<modelo.getRowCount(); i++)
        {
            t0=(String)modelo.getValueAt(i,14);
            t2=t2+Float.parseFloat(t0);
        }
        TSal.setText(String.valueOf(t2));
    }//GEN-LAST:event_CmdTotalesActionPerformed

    private void chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeActionPerformed
        this.setVisible(true);
        reciboo c= new reciboo();
        c.setVisible(true);
        try {
            reciboo M = new reciboo();
            int fila =tablita.getSelectedRow();

            reciboo.txtNombre2.setText(tablita.getValueAt(fila,0).toString());
            reciboo.txtPuesto.setText(tablita.getValueAt(fila,1).toString());
            reciboo.txtSueldo.setText(tablita.getValueAt(fila,3).toString());
            reciboo.IGSS.setText(tablita.getValueAt(fila,8).toString());
            reciboo.ISR.setText(tablita.getValueAt(fila,9).toString());
            reciboo.Totales.setText(tablita.getValueAt(fila,14).toString());

            M.show();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_chequeActionPerformed

    private void CmdCalc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalc1ActionPerformed
        Crear();
    }//GEN-LAST:event_CmdCalc1ActionPerformed

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
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                in_sesion login = new in_sesion();
                login.setVisible(true);
                //new LABORATORIO1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdCalc;
    private javax.swing.JButton CmdCalc1;
    private javax.swing.JButton CmdSalir;
    private javax.swing.JButton CmdTotales;
    private javax.swing.JTextField TSal;
    private javax.swing.JTextField antici;
    private javax.swing.JButton cheque;
    private javax.swing.JTextField comis;
    private javax.swing.JTextField djudicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField otross;
    private javax.swing.JTextField otrosss;
    private javax.swing.JTextField pues;
    private javax.swing.JTextField suel;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}
