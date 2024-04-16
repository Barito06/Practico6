package Vistas;

import Entidades.Producto;
import java.util.TreeSet;

public class Menu extends javax.swing.JFrame {
private TreeSet<Producto> productos = new TreeSet<>();
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jdEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiRubro = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jProductos.setText("Productos");
        jProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jmiRubro.setText("Por Rubro");
        jmiRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jmiRubro);

        jmiNombre.setText("Por Nombre");
        jmiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNombre);

        jMenuItem5.setText("Por Precio");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductosActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        gestionDeProductos gdp = new gestionDeProductos(productos);
        gdp.setVisible(true);
        jdEscritorio.add(gdp);
    }//GEN-LAST:event_jProductosActionPerformed

    private void jmiRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRubroActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        ConsultaProductoRubro gdp=new ConsultaProductoRubro(productos);
        gdp.setVisible(true);
        jdEscritorio.add(gdp);
    }//GEN-LAST:event_jmiRubroActionPerformed

    private void jmiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNombreActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        ListadoNombre gdp=new ListadoNombre(productos);
        gdp.setVisible(true);
        jdEscritorio.add(gdp);
    }//GEN-LAST:event_jmiNombreActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        ConsultaPorPrecio gdp=new ConsultaPorPrecio(productos);
        gdp.setVisible(true);
        jdEscritorio.add(gdp);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jProductos;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiRubro;
    // End of variables declaration//GEN-END:variables
}