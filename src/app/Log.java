
package app;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class Log extends javax.swing.JFrame {
    
    /*Declaración de variables estaticas o de clase*/
    private static String usuario;
    private static String password;

    
    public Log() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblPass = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        btnInicio = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        bgCity = new javax.swing.JLabel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpCerrar = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1080, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto Medium", 1, 32)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Inicio ");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 557, 43));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 280, 10));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 280, 10));

        lblPass.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblPass.setText("Contraseña");
        bg.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 147, 30));

        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUsuario.setHighlighter(null);
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 280, 33));

        txtPass.setBorder(null);
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        bg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 280, 30));

        lblUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario");
        bg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 147, 30));

        btnInicio.setBackground(new java.awt.Color(0, 110, 207));

        lblInicio.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("Iniciar Sesión");
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        bg.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 572, -1, -1));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        lblLogo.setPreferredSize(new java.awt.Dimension(40, 40));
        bg.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 26, 460, 150));

        bgCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city_vector.jpg"))); // NOI18N
        bg.add(bgCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 460, 700));

        jpBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));

        jpCerrar.setBackground(new java.awt.Color(240, 240, 240));

        lblCerrar.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCerrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpCerrarLayout = new javax.swing.GroupLayout(jpCerrar);
        jpCerrar.setLayout(jpCerrarLayout);
        jpCerrarLayout.setHorizontalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        jpCerrarLayout.setVerticalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBarraSuperiorLayout = new javax.swing.GroupLayout(jpBarraSuperior);
        jpBarraSuperior.setLayout(jpBarraSuperiorLayout);
        jpBarraSuperiorLayout.setHorizontalGroup(
            jpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraSuperiorLayout.createSequentialGroup()
                .addComponent(jpCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1025, Short.MAX_VALUE))
        );
        jpBarraSuperiorLayout.setVerticalGroup(
            jpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraSuperiorLayout.createSequentialGroup()
                .addComponent(jpCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Método que se ejecuta al pulsar el botón de "Iniciar Sesión"*/
    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        usuario=txtUsuario.getText();
        password=txtPass.getText();
        boolean conectado = false; //Declaración e inicialización de variable booleana
                                   // para comprobar que la conexión ha tenido éxito
        try{
           Connection con=Conexion.getConexion(usuario, password);
           conectado=con.isValid(1); //Comprobación de que la conexión es válida
          }catch(Exception e){ //Excepción que captura si el usuario o contraseña no son correctos
              conectado=false;
              JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecto");
              e.printStackTrace(); 
          } 
        /*Si hay conexión mostramos mensaje de bienvenida, inicializamos la segunda
        pantalla, la hacemos visible y cerramos la actual para no gastar recursos*/
        if(conectado){
            JOptionPane.showMessageDialog(null, "Bienvenido");
            Alumnos alumno=new Alumnos();
            alumno.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblInicioMouseClicked

   /*Evento que se ejecuta al pulsar la tecla Enter una vez escrito elcampo password*/
    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ //Si el nº de código de la tecla pulsada coincide con el nº de código de la tecla Enter
            usuario=txtUsuario.getText();
            password=txtPass.getText();
            boolean conectado = false; //Declaración e inicialización de variable booleana
                                   // para comprobar que la conexión ha tenido éxito
            try{
             Connection con=Conexion.getConexion(usuario, password);
             conectado=con.isValid(1); //Comprobación de que la conexión es válida
            }catch(Exception e){ //Excepción que captura si el usuario o contraseña no son correctos
                conectado=false;
                JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecto");
                e.printStackTrace(); 
            } 
            /*Si hay conexión mostramos mensaje de bienvenida, inicializamos la segunda
            pantalla, la hacemos visible y cerramos la actual para no gastar recursos*/
            if(conectado){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Alumnos alumno=new Alumnos();
                alumno.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void lblInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMousePressed
        btnInicio.setBackground(new Color(10, 93, 173));
    }//GEN-LAST:event_lblInicioMousePressed

    private void lblInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseEntered
        btnInicio.setBackground(new Color(0, 139, 207));
    }//GEN-LAST:event_lblInicioMouseEntered

    private void lblInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseExited
        btnInicio.setBackground(new Color(0, 110, 207));
    }//GEN-LAST:event_lblInicioMouseExited

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        jpCerrar.setBackground(new Color (232, 17, 35));
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        jpCerrar.setBackground(new Color (240, 240, 240));
        lblCerrar.setForeground(new Color (0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMousePressed
        jpCerrar.setBackground(new Color (181, 30, 25));
        lblCerrar.setForeground(new Color (255, 255, 255));
    }//GEN-LAST:event_lblCerrarMousePressed

    
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
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }
    
    /*Métodos creados para ser usados en la segunda clase y obtener el usuario y
    contraseña introducidos para realizar la conexión*/
    public static String getUsuario(){
        return usuario;
    }
    
    public static String getPassword(){
        return password;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgCity;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpCerrar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
