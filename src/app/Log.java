
package app;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class Log extends javax.swing.JFrame {
    
    private static String usuario;
    private static String password;

    
    public Log() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        bgCity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 280, 33));

        txtPass.setText("jPasswordField1");
        txtPass.setBorder(null);
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 40));
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 26, 460, 150));

        bgCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city_vector.jpg"))); // NOI18N
        bg.add(bgCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 460, 700));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        usuario=txtUsuario.getText();
        password=txtPass.getText();
        boolean conectado = false;
        try{
           Connection con=Conexion.getConexion(usuario, password);
           conectado=con.isValid(1);
          }catch(Exception e){
              conectado=false;
              JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecto");
              e.printStackTrace();
              
          } 
        
        if(conectado){
            JOptionPane.showMessageDialog(null, "Bienvenido");
            Alumnos alumno=new Alumnos();
            alumno.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblInicioMouseClicked

    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
