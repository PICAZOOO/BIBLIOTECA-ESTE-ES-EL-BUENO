package biblioteca;

import biblioteca.Consultar;
import java.io.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Borrar extends javax.swing.JFrame {

    private JFrame ventanaPrincipal;
    private File archivo; 

    /**
     * Creates new form Borrar
     */
    public Borrar(JFrame vp, File arch) {
        this.ventanaPrincipal = vp;
        this.archivo = arch;
        this.ventanaPrincipal.setVisible(false);
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        edtrNombre = new javax.swing.JTextField();
        edtlimpiar = new javax.swing.JButton();
        edtatras = new javax.swing.JButton();
        edtborrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECA PICAZO");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Borrar");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(119, 12, 85, 29);

        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Autor:");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(23, 63, 34, 16);
        getContentPane().add(edtrNombre);
        edtrNombre.setBounds(69, 61, 245, 20);

        edtlimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtlimpiar.setText("Limpiar");
        edtlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(edtlimpiar);
        edtlimpiar.setBounds(132, 99, 77, 27);

        edtatras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtatras.setText("Atras");
        edtatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtatrasActionPerformed(evt);
            }
        });
        getContentPane().add(edtatras);
        edtatras.setBounds(23, 99, 65, 27);

        edtborrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtborrar.setText("Borrar");
        edtborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtborrarActionPerformed(evt);
            }
        });
        getContentPane().add(edtborrar);
        edtborrar.setBounds(242, 99, 72, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo ventana.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 160);

        setSize(new java.awt.Dimension(380, 179));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtatrasActionPerformed
        this.setVisible(false);
        ventanaPrincipal.setVisible(true);
    }//GEN-LAST:event_edtatrasActionPerformed

    private void edtlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtlimpiarActionPerformed

        edtrNombre.setText("");
    }//GEN-LAST:event_edtlimpiarActionPerformed

    private void edtborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtborrarActionPerformed

        String espacios = " "; 
        String[] pedazos; 
        String nombre; 
        String nombrePedazo; 
        Boolean encontrado = false;
        LinkedList<String> paraGuardar = new LinkedList(); 

        if (edtrNombre.getText().equals("")) { 
            JOptionPane.showMessageDialog(this, "Te falta agregar el nombre", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(archivo));  
                String linea = reader.readLine(); 
                if (linea == null) {
                    JOptionPane.showMessageDialog(this, "El archivo no tiene ese nombre", "Archivo vacío", JOptionPane.INFORMATION_MESSAGE);
                    reader.close();
                    do {

                        pedazos = linea.split(espacios, 3);

                        nombre = edtrNombre.getText().toUpperCase();
                        nombrePedazo = pedazos[0].toUpperCase();

                        if (!nombrePedazo.equals(nombre)) {
                            
                            
                            
                            if (!nombrePedazo.equals("")) {
                                paraGuardar.add(linea);
                            }
                        } else {
                            encontrado = true;
                        }

                        linea = reader.readLine(); 

                    } while (linea != null);

                    reader.close();

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(this, "No hay ningun nombre que coincida", "Error..", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
                        while (!paraGuardar.isEmpty()) {
                            writer.write(paraGuardar.poll().toString());
                            writer.newLine();
                        }
                        writer.flush();
                        writer.close();
                        JOptionPane.showMessageDialog(this, "Archivo eliminado!!", "Eliminado S:", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_edtborrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edtatras;
    private javax.swing.JButton edtborrar;
    private javax.swing.JButton edtlimpiar;
    private javax.swing.JTextField edtrNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
