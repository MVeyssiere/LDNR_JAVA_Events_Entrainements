/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ThreeButtons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @author Marine V
 */
public class MyMouseListener implements MouseListener {
        @Override
    public void mouseClicked(MouseEvent me) {
            JButton butt = (JButton) me.getSource();
            JOptionPane.showMessageDialog(null, "Vous avez cliqué sur " + butt.getText(), "Alerte!", JOptionPane.ERROR_MESSAGE);
        }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
