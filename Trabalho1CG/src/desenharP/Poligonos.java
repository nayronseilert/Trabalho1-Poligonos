/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenharP;
import java.awt.Graphics2D;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import javax.media.opengl.*;
import javax.media.opengl.*;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;


public class Poligonos extends javax.swing.JFrame {

    
    
    public Poligonos() {
        initComponents();
    }
    
    private int x_inicio;
    private int y_inicio;
    private int x_fim;
    private int y_fim;
    
    private Line2D Reta;
    private Rectangle2D RETANGULO;
    private Ellipse2D CIRCULO;
    
    
    private Graphics2D g2;
    
    private List<Line2D> reta = new ArrayList();
    private List<Rectangle2D> retangulo = new ArrayList();
    private List<Ellipse2D> circulo = new ArrayList();
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jRadioReta = new javax.swing.JRadioButton();
        jRadioRetangulo = new javax.swing.JRadioButton();
        jBtnClear = new javax.swing.JButton();
        jRadioCirculo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jRadioReta.setBackground(new java.awt.Color(255, 255, 0));
        radioGroup.add(jRadioReta);
        jRadioReta.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jRadioReta.setText("Reta");
        jRadioReta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRetaActionPerformed(evt);
            }
        });

        jRadioRetangulo.setBackground(new java.awt.Color(255, 255, 0));
        radioGroup.add(jRadioRetangulo);
        jRadioRetangulo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jRadioRetangulo.setText("Retangulo");

        jBtnClear.setText("Limpar");
        jBtnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnClearMouseClicked(evt);
            }
        });
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jRadioCirculo.setBackground(new java.awt.Color(255, 255, 0));
        radioGroup.add(jRadioCirculo);
        jRadioCirculo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jRadioCirculo.setText("Circulo");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("AR JULIAN", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Polígonos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioCirculo)
                            .addComponent(jRadioReta)
                            .addComponent(jRadioRetangulo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jBtnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jRadioReta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioRetangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioCirculo)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnClear)
                        .addGap(0, 216, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        
        if(g2 == null)
        {            
        g2 = (Graphics2D) jPanel1.getGraphics();
        }
        
        x_inicio = evt.getX();
        y_inicio = evt.getY();
        x_fim = evt.getX();
        y_fim = evt.getY();
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        //capturando coordenada pelo mouse
        if(jRadioReta.isSelected())
        {
            jPanel1.update(g2);            
            
            x_fim = evt.getX();
            y_fim = evt.getY();
            
            Reta = new Line2D.Float((float) x_inicio, (float) y_inicio, (float) x_fim, (float) y_fim);
            
            
            DrawAll();
            
            g2.draw(Reta);
                    
        }
        
        if(jRadioRetangulo.isSelected())
        {
             
            jPanel1.update(g2);            
            
            x_fim = evt.getX() - x_inicio;
            y_fim = evt.getY() - y_inicio;
            
         
              RETANGULO = new Rectangle2D.Float((float) x_inicio, (float) y_inicio, (float) x_fim, (float) y_fim);
            DrawAll();
            
         
              g2.draw(RETANGULO);  
           
        }
           if(jRadioCirculo.isSelected())
        {
            
            jPanel1.update(g2);            
            
            x_fim = evt.getX() - x_inicio;
            y_fim = evt.getY() - y_inicio;
            
            CIRCULO = new Ellipse2D.Float((float) x_inicio, (float) y_inicio, (float) x_fim, (float) y_fim);
            
            DrawAll();
            
            g2.draw(CIRCULO);
                        
        }
        
   
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        //chamado quando o mouse e solto
        if(jRadioReta.isSelected())
        {
            jPanel1.update(g2);            
            
            x_fim = evt.getX();
            y_fim = evt.getY();
            
            Reta = new Line2D.Float((float) x_inicio, (float) y_inicio, (float) x_fim, (float) y_fim);
           
            reta.add(Reta);
            
            DrawAll();
                        
        }
        
        if(jRadioRetangulo.isSelected()) 
        {
            jPanel1.update(g2);            
            
            x_fim = evt.getX() - x_inicio;
            y_fim = evt.getY() - y_inicio;
            
        
             RETANGULO = new Rectangle2D.Float((float) x_inicio, (float) y_inicio, (float) x_fim, (float) y_fim);

            retangulo.add(RETANGULO);
            DrawAll();
          
        }
        
        if(jRadioCirculo.isSelected()) 
        {
           
            jPanel1.update(g2);            
            
            x_fim = evt.getX() - x_inicio;
            y_fim = evt.getY() - y_inicio;
            
            CIRCULO = new Ellipse2D.Float((float) x_inicio, (float) y_inicio, (float) x_fim, (float) y_fim);
            
            circulo.add(CIRCULO);
            DrawAll();
            
        }

     

        
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jBtnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnClearMouseClicked
        
        jPanel1.update(g2);
        reta.clear();
        retangulo.clear();
        circulo.clear();
        
    }//GEN-LAST:event_jBtnClearMouseClicked

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jRadioRetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioRetaActionPerformed

    private void DrawAll() 
    {
        for(int i=0; i<reta.size(); i++) {
            g2.draw(reta.get(i));
        }
        
       
     for(int i=0; i<retangulo.size(); i++) {
            g2.draw(retangulo.get(i));
        }
    
    
        for(int i=0; i<circulo.size(); i++) {
            
            g2.draw(circulo.get(i));
            
        }

    }
    
    
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
            java.util.logging.Logger.getLogger(Poligonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poligonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poligonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poligonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Poligonos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioCirculo;
    private javax.swing.JRadioButton jRadioReta;
    private javax.swing.JRadioButton jRadioRetangulo;
    private javax.swing.ButtonGroup radioGroup;
    // End of variables declaration//GEN-END:variables
    
    
}