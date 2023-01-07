import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener {

    static JButton btn = new JButton("OK");
    static String[] versions = { "1.19", "1.18", "1.17", "1.16",
                                "1.15", "1.14", "1.13", "1.12", "1.11", "1.10", "1.9", "1.8", "1.7", "1.6" };
    static final JComboBox<String> cb = new JComboBox<String>(versions);
    JLabel chek = new JLabel("Select what you would like randomized...");
    GetAllFiles thingy = new GetAllFiles();

    public GUI(){

    JFrame frame = new JFrame("Randomized MC Texturepacks");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocation(430, 100);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    frame.add(panel);

    JLabel lbl = new JLabel("Select your prefered version...");
    lbl.setAlignmentX(Component.CENTER_ALIGNMENT);

    panel.add(lbl);

    cb.setMaximumSize(cb.getPreferredSize()); 
    cb.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(cb);

    chek.setAlignmentX(Component.CENTER_ALIGNMENT);

    panel.add(chek);

    JCheckBox c1 = new JCheckBox("Blocks?", true);
    JCheckBox c2 = new JCheckBox("Colormaps?", true);
    JCheckBox c3 = new JCheckBox("Dither?", true);
    JCheckBox c4 = new JCheckBox("Entities?", true);
    JCheckBox c5 = new JCheckBox("Environment?", true);
    JCheckBox c6 = new JCheckBox("Fonts?", true);
    JCheckBox c7 = new JCheckBox("Misc? (Mostly Shadows/Vingettes)", true);
    JCheckBox c8 = new JCheckBox("Mob Effects?", true);
    JCheckBox c9 = new JCheckBox("Armor?", true);
    JCheckBox c10 = new JCheckBox("Paintings?", true);
    JCheckBox c11 = new JCheckBox("Particles?", true);

    c1.setAlignmentX(Component.CENTER_ALIGNMENT);
    c2.setAlignmentX(Component.CENTER_ALIGNMENT);
    c3.setAlignmentX(Component.CENTER_ALIGNMENT);
    c4.setAlignmentX(Component.CENTER_ALIGNMENT);
    c5.setAlignmentX(Component.CENTER_ALIGNMENT);
    c6.setAlignmentX(Component.CENTER_ALIGNMENT);
    c7.setAlignmentX(Component.CENTER_ALIGNMENT);
    c8.setAlignmentX(Component.CENTER_ALIGNMENT);
    c9.setAlignmentX(Component.CENTER_ALIGNMENT);
    c10.setAlignmentX(Component.CENTER_ALIGNMENT);
    c11.setAlignmentX(Component.CENTER_ALIGNMENT);

    panel.add(c1);
    panel.add(c2);
    panel.add(c3);
    panel.add(c4);
    panel.add(c5);
    panel.add(c6);
    panel.add(c7);
    panel.add(c8);
    panel.add(c9);
    panel.add(c10);
    panel.add(c11);

    btn.setAlignmentX(Component.CENTER_ALIGNMENT); 
    panel.add(btn);

    frame.setVisible(true);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn) {
            thingy.compileResourcePack();
        }
    }
}
