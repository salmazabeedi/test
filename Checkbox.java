package checkbox;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Checkbox extends JFrame {

    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JTextField text;
    private JCheckBox check;
    private JCheckBox check1;
    private JCheckBox check2;
    private JRadioButton pr;
    private JRadioButton br;
    private JRadioButton gr;
    
    private ButtonGroup rbgroup;
    
    private Border border;
            

    public Checkbox() {

        setTitle("checkboxes");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        panel = new JPanel();
        label = new JLabel("chose one");
        // button = new JButton ("done");
       
        check = new JCheckBox("pink");
        check1 = new JCheckBox("blue");
        check2 = new JCheckBox("green");
        check.addItemListener(new Checkchoice());
        check1.addItemListener(new Checkchoice());
        check2.addItemListener(new Checkchoice());

        add(label, BorderLayout.NORTH);
        add(check,BorderLayout.WEST);
        add(check1, BorderLayout.CENTER);
        add(check2,BorderLayout.EAST);
       // add(panel);

        setVisible(true);
    }

    private class Checkchoice implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == check) {

                if (check.isSelected()) {
                    getContentPane().setBackground(Color.pink);
                    check.setBackground(Color.pink);

                } else {
                    getContentPane().setBackground(Color.LIGHT_GRAY);
                    check.setBackground(Color.LIGHT_GRAY);
                }
            }

            if (e.getSource() == check1) {
                if (check1.isSelected()) {
                    getContentPane().setBackground(Color.blue);
                    check1.setBackground(Color.blue);

                } else {
                    getContentPane().setBackground(Color.LIGHT_GRAY);
                    check1.setBackground(Color.LIGHT_GRAY);
                }
            }
            
            if (e.getSource() == check2){
                if(check2.isSelected()){
                    getContentPane().setBackground(Color.green);
                    check2.setBackground(Color.green);
                }
                else
                {
                    getContentPane().setBackground(Color.LIGHT_GRAY);
                    check2.setBackground(Color.LIGHT_GRAY);
                }
           
            }

        }

    }

    public static void main(String[] args) {
        new Checkbox();
    }

}
