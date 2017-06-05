package biblioteca;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Insertar extends javax.swing.JFrame {

    private File fichero;
    private JFrame ventanaPrincipal;
    private LinkedList serial = new LinkedList();

    
    public Insertar(JFrame vp, File f) {
        this.ventanaPrincipal = vp;
        this.fichero = f;
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
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPasswoed = new javax.swing.JLabel();
        edtNombre = new javax.swing.JTextField();
        edtUsuario = new javax.swing.JTextField();
        edtSerial = new javax.swing.JTextField();
        edtAnadir = new javax.swing.JButton();
        edtLimpiar = new javax.swing.JButton();
        edtGuardar = new javax.swing.JButton();
        edtCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtPaneVer = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECA PICAZO");
        setBackground(new java.awt.Color(0, 240, 240));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Dar de alta..");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(200, 10, 163, 25);

        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Autor:");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(10, 50, 34, 16);

        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Editorial:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(10, 80, 49, 16);

        jLabelPasswoed.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPasswoed.setText("Serial:");
        getContentPane().add(jLabelPasswoed);
        jLabelPasswoed.setBounds(10, 110, 36, 16);
        getContentPane().add(edtNombre);
        edtNombre.setBounds(130, 50, 286, 20);
        getContentPane().add(edtUsuario);
        edtUsuario.setBounds(130, 80, 286, 20);

        edtSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSerialActionPerformed(evt);
            }
        });
        getContentPane().add(edtSerial);
        edtSerial.setBounds(130, 110, 286, 20);

        edtAnadir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtAnadir.setText("Añadir");
        edtAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAnadirActionPerformed(evt);
            }
        });
        getContentPane().add(edtAnadir);
        edtAnadir.setBounds(450, 60, 72, 27);

        edtLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtLimpiar.setText("Limpiar Datos");
        edtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(edtLimpiar);
        edtLimpiar.setBounds(430, 100, 123, 27);

        edtGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtGuardar.setText("Guardar");
        edtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(edtGuardar);
        edtGuardar.setBounds(460, 310, 83, 27);

        edtCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCancelar.setText("Regresar");
        edtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(edtCancelar);
        edtCancelar.setBounds(20, 310, 110, 27);

        edtPaneVer.setEditable(false);
        jScrollPane2.setViewportView(edtPaneVer);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 150, 522, 141);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo dos.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 630, 420);

        setSize(new java.awt.Dimension(577, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCancelarActionPerformed

        this.setVisible(false);
        ventanaPrincipal.setVisible(true);

    }//GEN-LAST:event_edtCancelarActionPerformed

    private void edtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtLimpiarActionPerformed

        edtNombre.setText("");
        edtUsuario.setText("");
        edtSerial.setText("");

    }//GEN-LAST:event_edtLimpiarActionPerformed

    private void edtAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAnadirActionPerformed

        String nuevoItem; 

        if (edtNombre.getText().equals("") || edtUsuario.getText().equals("") || edtSerial.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ERROR: Te faltan escribir datos ): ", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        nuevoItem = edtNombre.getText() + " " + edtUsuario.getText() + " " + edtSerial.getText() + " \n";
        serial.add(nuevoItem);
        edtPaneVer.setText(edtPaneVer.getText() + nuevoItem);
    }//GEN-LAST:event_edtAnadirActionPerformed

    private void edtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtGuardarActionPerformed

        BufferedWriter writer; 

        if (fichero == null) {
            
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
            JFileChooser fileChooserGuardar = new JFileChooser();
            fileChooserGuardar.setFileFilter(filtro);
            fileChooserGuardar.setDialogTitle("Guardar");
            int seleccion = fileChooserGuardar.showSaveDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = fileChooserGuardar.getSelectedFile();
                fileChooserGuardar.setFileSelectionMode(JFileChooser.FILES_ONLY);
                try {
                    writer = new BufferedWriter(new FileWriter(fichero + ".txt")); 
                    while (!serial.isEmpty()) {
                        writer.write(serial.poll().toString());
                        writer.newLine();
                    }
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar", "Error de guardado", JOptionPane.ERROR_MESSAGE);
                }

                JOptionPane.showMessageDialog(this, "Se han guardado correctamente los datos");
                this.setVisible(false);
                ventanaPrincipal.setVisible(true);
            }
        } else if (!(fichero == null))
        {
            try {
                writer = new BufferedWriter(new FileWriter(fichero, true));
                while (!serial.isEmpty()) {
                    writer.write(serial.poll().toString());
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al dar de alta", "Error de guardado", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "Se han guardado correctamente los datos");
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar", "X", JOptionPane.ERROR_MESSAGE);
        }

       
        this.setVisible(false);
        ventanaPrincipal.setVisible(true);
    }//GEN-LAST:event_edtGuardarActionPerformed

    private void edtSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSerialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edtAnadir;
    private javax.swing.JButton edtCancelar;
    private javax.swing.JButton edtGuardar;
    private javax.swing.JButton edtLimpiar;
    private javax.swing.JTextField edtNombre;
    private javax.swing.JTextPane edtPaneVer;
    private javax.swing.JTextField edtSerial;
    private javax.swing.JTextField edtUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPasswoed;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
