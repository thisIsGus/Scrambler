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
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // added code

    frame.add(panel);

    JLabel lbl = new JLabel("Select your prefered version...");
    lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
    //lbl.setVisible(true); // Not needed

    panel.add(lbl);

    cb.setMaximumSize(cb.getPreferredSize()); // added code
    cb.setAlignmentX(Component.CENTER_ALIGNMENT);// added code
    //cb.setVisible(true); // Not needed
    panel.add(cb);

    chek.setAlignmentX(Component.CENTER_ALIGNMENT);
    //lbl.setVisible(true); // Not needed

    panel.add(chek);

    JCheckBox c1 = new JCheckBox("Blocks?");
    JCheckBox c2 = new JCheckBox("Colormaps?");
    JCheckBox c3 = new JCheckBox("Dither?");
    JCheckBox c4 = new JCheckBox("Entities?");
    JCheckBox c5 = new JCheckBox("Environment?");
    JCheckBox c6 = new JCheckBox("Fonts?");
    JCheckBox c7 = new JCheckBox("Misc? (Mostly Shadows/Vingettes)");
    JCheckBox c8 = new JCheckBox("Mob Effects?");
    JCheckBox c9 = new JCheckBox("Armor?");
    JCheckBox c10 = new JCheckBox("Paintings?");
    JCheckBox c11 = new JCheckBox("Particles?");

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

    btn.setAlignmentX(Component.CENTER_ALIGNMENT); // added code
    panel.add(btn);

    frame.setVisible(true); // added code

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn) {
            thingy.compileResourcePack();
        }
    }
}




//         My failed attempt

// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.Font;
// import java.awt.BorderLayout;
// import javax.swing.JButton;
// import javax.swing.BorderFactory;
// //import javax.swing.ImageIcon;
// import javax.swing.JLabel;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JComboBox;
// import java.awt.FlowLayout;
// import javax.swing.border.Border;

// public class GUI {
//     public GUI(){

//         JLabel label = new JLabel(); //create label
//         Border border = BorderFactory.createLineBorder(Color.gray, 5);
        
//         JButton button = new JButton();

//         JFrame frame = new JFrame(); //creates a frame
//         label.setHorizontalAlignment(JLabel.CENTER);
//         label.setVerticalAlignment(JLabel.TOP);

//         frame.setLayout(new BorderLayout());
//         frame.add(label, BorderLayout.NORTH);
//         frame.add(button, BorderLayout.SOUTH);

//         frame.getRootPane().setBorder(border);
        
//         //label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of Item (ImageIcon)
//         //label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of Image Icon
//         label.setForeground(Color.black); //set font color
//         Font labelFont = new Font("MV Boli", Font.PLAIN, 20);
//         label.setFont(labelFont);
//         label.setText("Filler Filler Filler"); //set text of label
//         //label.setIconTextGap(30);
//         label.setBorder(border);
//         //frame.add(label);
//         //label.setBounds(100, 100, 250, 250);

//         button.setBounds(frame.getWidth()/2, frame.getHeight()/2, 100, 50);

//         String[] choices = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};
//         final JComboBox<String> cb = new JComboBox<String>(choices);

//         cb.setVisible(true);
//         panel.add(cb);
        
//         frame.add(button);

//         frame.setTitle("Minecraft Scrambler"); //sets title of frame
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of app upon clicking x
//         frame.setResizable(false); //prevent frame from being resized
//         //frame.setLayout(null);
//         frame.setSize(620, 420); //sets x dimension and y dimension
//         frame.setVisible(true); //make frame visible

//         /*
//         ImageIcon image = new ImageIcon(something here later gus); //create an ImageIcon
//         frame.setIconImage(image.getImage()); //change icon of Frame
//         */
//         frame.getContentPane().setBackground(Color.LIGHT_GRAY);

//         //frame.pack();
//     }
// }