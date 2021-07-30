package ventana;

import java.awt.Color;
import java.awt.Graphics;

public class Formas extends javax.swing.JFrame {

    public Formas() {
        initComponents();
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formas().setVisible(true);
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLUE);
        g.drawLine(0, 70, 100, 70);
        g.drawRect(150, 70, 50, 70);
        g.drawRoundRect(250, 70, 50, 70, 6, 6);
        g.drawOval(350, 70, 50, 70);

        int vectorX[] = {500, 550, 450};
        int vectorY[] = {70, 120, 120};
        g.drawPolygon(vectorX, vectorY, 3);
        
        g.setColor(Color.GREEN);
        g.fillRect(150, 270, 50, 70);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
