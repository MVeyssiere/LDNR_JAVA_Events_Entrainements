package events_entrainements.git;

import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import static java.awt.FlowLayout.LEFT;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Marine V
 */
public class MoiButton {

    JFrame frame;
    JPanel fenetre;

    public MoiButton() {

        frame = new JFrame();
        fenetre = new JPanel();

        fenetre.setLayout(new GridBagLayout());
        fenetre.setPreferredSize(new Dimension(200, 200));
        // put label MOI and center it in the frame
        JLabel label = new JLabel("MOI");
        label.setHorizontalAlignment(LEFT);
        label.setVerticalAlignment(CENTER);
        label.setVerticalTextPosition(CENTER);
        label.setFont(new Font("Monaco", Font.BOLD, 28));

        fenetre.add(label);
        frame.add(fenetre);
        frame.pack();
        frame.setVisible(true);
    }
}
