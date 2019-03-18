package events_entrainements.git;

import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import static java.awt.FlowLayout.LEFT;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Marine V
 */
public class MoiButton extends JFrame {
    JPanel fenetre;

    public MoiButton() {

        fenetre = new JPanel();
        fenetre.setLayout(new GridBagLayout());
        // button creation
        JButton moi = new JButton("MOI");
        moi.setFont(new Font("Monaco", Font.BOLD, 28)); // to increase font size
        moi.setPreferredSize(new Dimension(100, 100));

        // create the event on a click of the mouse
        moi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JOptionPane.showMessageDialog(null, "Vous avez cliqué", "info!", JOptionPane.WARNING_MESSAGE);
            }
        });


        //fenetre.add(label);
        fenetre.add(moi);
        this.add(fenetre);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame panneau = new MoiButton();
    }
}
