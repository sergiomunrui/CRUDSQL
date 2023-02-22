
package app;

/*Importación de librerías*/
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergi
 */
public class Alumnos extends javax.swing.JFrame {

    
    public Alumnos() {
        initComponents();
        txtId.setVisible(false);
        cargarTabla();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgrSexo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblDatos = new javax.swing.JLabel();
        jpEliminar = new javax.swing.JPanel();
        lblEliminar1 = new javax.swing.JLabel();
        jpLimpiar = new javax.swing.JPanel();
        lblLimpiar = new javax.swing.JLabel();
        jpModificar = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlumnos = new app.Tabla2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos");
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 700));

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.setPreferredSize(new java.awt.Dimension(1080, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Alumnos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, -1, 48));

        jPanel1.setBackground(new java.awt.Color(20, 79, 137));
        jPanel1.setBorder(null);
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matrícula:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");

        txtMatricula.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtEdad.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");

        txtEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        rbgrSexo.add(rbHombre);
        rbHombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbHombre.setText("Hombre");
        rbHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHombreActionPerformed(evt);
            }
        });

        rbgrSexo.add(rbMujer);
        rbMujer.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbMujer.setForeground(new java.awt.Color(255, 255, 255));
        rbMujer.setText("Mujer");

        btnGuardar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblDatos.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatos.setText("DATOS");

        jpEliminar.setBackground(new java.awt.Color(0, 170, 235));
        jpEliminar.setPreferredSize(new java.awt.Dimension(90, 35));

        lblEliminar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblEliminar1.setForeground(new java.awt.Color(240, 240, 240));
        lblEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar1.setText("Eliminar");
        lblEliminar1.setPreferredSize(new java.awt.Dimension(90, 35));
        lblEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpEliminarLayout = new javax.swing.GroupLayout(jpEliminar);
        jpEliminar.setLayout(jpEliminarLayout);
        jpEliminarLayout.setHorizontalGroup(
            jpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpEliminarLayout.setVerticalGroup(
            jpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpLimpiar.setBackground(new java.awt.Color(0, 170, 235));
        jpLimpiar.setPreferredSize(new java.awt.Dimension(90, 35));

        lblLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblLimpiar.setForeground(new java.awt.Color(240, 240, 240));
        lblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiar.setText("Limpiar");
        lblLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpLimpiarLayout = new javax.swing.GroupLayout(jpLimpiar);
        jpLimpiar.setLayout(jpLimpiarLayout);
        jpLimpiarLayout.setHorizontalGroup(
            jpLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpLimpiarLayout.setVerticalGroup(
            jpLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jpModificar.setBackground(new java.awt.Color(0, 170, 235));
        jpModificar.setPreferredSize(new java.awt.Dimension(90, 35));

        lblModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(240, 240, 240));
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar.setText("Modificar");
        lblModificar.setPreferredSize(new java.awt.Dimension(53, 17));
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpModificarLayout = new javax.swing.GroupLayout(jpModificar);
        jpModificar.setLayout(jpModificarLayout);
        jpModificarLayout.setHorizontalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        jpModificarLayout.setVerticalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        lblLogo.setMaximumSize(new java.awt.Dimension(40, 40));
        lblLogo.setMinimumSize(new java.awt.Dimension(40, 40));
        lblLogo.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jpModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbHombre)
                                        .addGap(55, 55, 55)
                                        .addComponent(rbMujer)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDatos)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHombre)
                    .addComponent(jLabel6)
                    .addComponent(rbMujer))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 460, 700));
        jPanel1.getAccessibleContext().setAccessibleName("");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(600, 406));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Matrícula", "Nombre", "Sexo", "Email"
            }
        ));
        tblAlumnos.setFocusable(false);
        tblAlumnos.setPreferredSize(new java.awt.Dimension(600, 534));
        tblAlumnos.getTableHeader().setReorderingAllowed(false);
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAlumnos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, 600, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        /*Valores guardados en las variables correspondientes*/
        String matricula=txtMatricula.getText();
        String nombre=txtNombre.getText();
        int edad=Integer.parseInt(txtEdad.getText());
        String email=txtEmail.getText();
        String sexo=""; //Declaramos la variable sexo y la inicializamos con cadena vacía
        /*If-else para guardar en la variable sexo dependiendo del valor arrojado por el radioButton*/
        if(rbHombre.isSelected()== true){
            sexo="H";
        }else if(rbMujer.isSelected()== true){
            sexo="M";
        }
        
        /*Llamada al método de la clase Log para obtener usuario y contraseña y realizar la conexión*/
        String user=Log.getUsuario();
        String pass=Log.getPassword();

        try{
           Connection con= Conexion.getConexion(user, pass); //Realiza la conexión mediante el método creado de la clase Conexion
           //Instancia e inicialización de una sentencie preparada para guardar un nuevo registro
           PreparedStatement ps=con.prepareStatement("INSERT INTO ALUMNOS (MATRICULA, NOMBRE, EDAD, SEXO, EMAIL, ACTIVO) VALUES (?,?,?,?,?,?)");
           ps.setString(1, matricula);
           ps.setString(2, nombre);
           ps.setInt(3, edad);
           ps.setString(4, sexo);
           ps.setString(5, email);
           ps.setInt(6, 1);
           ps.executeUpdate();//Ejecuta la sentencia SQL
           
           JOptionPane.showMessageDialog(null, "Registro guardado correctamente"); //Muestra mensaje en caso de éxito
           limpiar(); //Limpiamos los campos una vez guardados
           cargarTabla(); //Cargamos los datos de la BBDD cada vez que hacemos un nuevo registro
           
        }catch(Exception e){ //Captura excepción en caso de que no tener éxito
            System.out.println("Introducción de datos NO realizada correctamente"); 
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rbHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbHombreActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        String user=Log.getUsuario();
        String pass=Log.getPassword();
        
        try{
            int fila = tblAlumnos.getSelectedRow(); //Obtiene el nº de fila de la fila seleccionada por nosotros al clickar sobre ella
            int id = (int) tblAlumnos.getValueAt(fila, 0); //Obtiene el ID del registro de la fila seleccionada
            
            PreparedStatement ps;
            ResultSet rs; 
            
            Connection conn=Conexion.getConexion(user, pass);
            ps=conn.prepareStatement("SELECT ID, MATRICULA, NOMBRE, EDAD, SEXO, EMAIL FROM ALUMNOS WHERE ID=?");
            ps.setInt(1, id); //En el campo ID(oculto) coloca el ID guardado anteriormente
            rs=ps.executeQuery(); //Ejecuta la consulta
            
            while(rs.next()){   
                txtMatricula.setText(rs.getString(2)); //Coloca el dato en el campo matrícula tras la consulta
                txtNombre.setText(rs.getString(3)); //Coloca el dato en el campo nombre tras la consulta
                txtEdad.setText(String.valueOf(rs.getInt(4))); //Coloca el dato en el campo edad tras la consulta
                txtEmail.setText(rs.getString(6)); //Coloca el dato en el campo email tras la consulta
                if(rs.getString(5).equals("H")){ //If-else para comprobar el dato arrojado en la consulta y compararlo con el valor 'H' o 'M' 
                    rbHombre.setSelected(true); //si es 'H' deja seleccionado el radioBoton Hombre
                }else if(rs.getString(5).equals("M")){
                    rbMujer.setSelected(true); //si es 'M' deja seleccionado el radioBoton Mujer
                }
                txtId.setText(rs.getString(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked
        /*Valores guardados en las variables correspondientes*/
        int id=Integer.parseInt(txtId.getText());
        String matricula=txtMatricula.getText();
        String nombre=txtNombre.getText();
        int edad=Integer.parseInt(txtEdad.getText());
        String email=txtEmail.getText();
        String sexo=""; //Declaramos la variable sexo y la inicializamos con cadena vacía
        /*If-else para guardar en la variable sexo dependiendo del valor arrojado por el radioButton*/
        if(rbHombre.isSelected()== true){
            sexo="H";
        }else if(rbMujer.isSelected()== true){
            sexo="M";
        }
        
        /*Llamada al método de la clase Log para obtener usuario y contraseña y realizar la conexión*/
        String user=Log.getUsuario();
        String pass=Log.getPassword();

        try{
           Connection con= Conexion.getConexion(user, pass); //Realiza la conexión mediante el método creado de la clase Conexion
           //Instancia e inicialización de una sentencie preparada para guardar un nuevo registro
           PreparedStatement ps=con.prepareStatement("UPDATE ALUMNOS SET MATRICULA=?, NOMBRE=?, EDAD=?, SEXO=?, EMAIL=? WHERE ID=?");
           ps.setString(1, matricula);
           ps.setString(2, nombre);
           ps.setInt(3, edad);
           ps.setString(4, sexo);
           ps.setString(5, email);
           ps.setInt(6, id);
           ps.executeUpdate();//Ejecuta la sentencia SQL
           
           JOptionPane.showMessageDialog(null, "Registro modificado correctamente"); //Muestra mensaje en caso de éxito
           limpiar(); //Limpiamos los campos una vez guardados
           cargarTabla(); //Cargamos los datos de la BBDD cada vez que hacemos un nuevo registro
           
        }catch(Exception e){ //Captura excepción en caso de que no tener éxito
            System.out.println("Introducción de datos NO realizada correctamente"); 
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblModificarMouseClicked

    private void lblEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseClicked
        /*Valores guardados en las variables correspondientes*/
        int id=Integer.parseInt(txtId.getText());
        
        
        /*Llamada al método de la clase Log para obtener usuario y contraseña y realizar la conexión*/
        String user=Log.getUsuario();
        String pass=Log.getPassword();

        try{
           Connection con= Conexion.getConexion(user, pass); //Realiza la conexión mediante el método creado de la clase Conexion
           //Instancia e inicialización de una sentencie preparada para guardar un nuevo registro
           PreparedStatement ps=con.prepareStatement("DELETE FROM ALUMNOS WHERE ID=?");
           ps.setInt(1, id);
           ps.executeUpdate();//Ejecuta la sentencia SQL
           
           JOptionPane.showMessageDialog(null, "Registro eliminado correctamente"); //Muestra mensaje en caso de éxito
           limpiar(); //Limpiamos los campos una vez guardados
           cargarTabla(); //Cargamos los datos de la BBDD cada vez que hacemos un nuevo registro
           
        }catch(Exception e){ //Captura excepción en caso de que no tener éxito
            System.out.println("Introducción de datos NO realizada correctamente"); 
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblEliminar1MouseClicked

    private void lblLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_lblLimpiarMouseClicked

    /*Método para limpiar los campos del formulario cada vez que pulsamos de nuevo el botón correposdiente*/
    private void limpiar(){
        txtId.setText("");
        txtMatricula.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
        rbgrSexo.clearSelection(); //Al ser radioButton se hace mediante este método
    }
    
    /*Método para mostrar en formato de tabla los datos consultados*/
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlumnos.getModel(); //Obtenemos la tabla por defecto que nos proporciona la clase Swing de JAVA
        modeloTabla.setRowCount(0); //Cada vez que ejecutemos el método, primero limpiará el contenido de las filas mostradas
        
        /*Declaración de las variables*/
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int ncolumnas;
        String user=Log.getUsuario();
        String pass=Log.getPassword();
        
        Tabla2.anchoColumnas(tblAlumnos); //Llamada al método estático de la clase Tabla2 para el ancho de columnas
        
        try{
            Connection conn = Conexion.getConexion(user, pass);
            ps=conn.prepareStatement("SELECT ID, MATRICULA, NOMBRE, SEXO, EMAIL FROM ALUMNOS"); //Guardamos en la PreparedStatement la sentencia a ejecutar
            rs=ps.executeQuery(); //Ejecutamos la consulta y la guardamos en el ResultSet
            rsmd=rs.getMetaData(); //Guardamos los metadatos de la consulta realizada en un objeto de tipo ResultSetMetaData para poder consultar información sobre los datos de la consulta
            ncolumnas=rsmd.getColumnCount(); //Guardamos mediante el método el nº de columnas que arroja la consulta y es guardado en el ResultSet
            
            while(rs.next()){
                Object[] fila= new Object[ncolumnas]; //Creamos un array de tipo Object para guardar los datos que vamos extrayendo del ResultSet
                for(int i=0; i<ncolumnas; i++){ //Mediante un bucle for recorremos el ResultSet y guardamos el dato de cada campo en la posición del array fila correspondiente
                    fila[i]=rs.getObject(i+1); //El ResultSet es i+1 porque no empieza en la posición 0 sino en la posición 1
                }
                modeloTabla.addRow(fila); //Añadimos a nuestro objeto modeloTabla los datos guardados en el array fila
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Datos de BBDD no cargados"); //Declaramos la excepción en caso de que ocurra
            e.printStackTrace();    
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpEliminar;
    private javax.swing.JPanel jpLimpiar;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblEliminar1;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.ButtonGroup rbgrSexo;
    private app.Tabla2 tblAlumnos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
