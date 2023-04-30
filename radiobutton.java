
package checkbox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;


public class radiobutton extends JFrame {
    private JLabel label;
    private JRadioButton r1;
    private JRadioButton r3;
    private JRadioButton r2;
    private ButtonGroup rgroup;
    private JPanel panel;
    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;
    
    
    
    
    
    
    
    public radiobutton()
    {
        setTitle("radio buttons ");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground (Color.LIGHT_GRAY);
        label = new JLabel("choose one");
        Border border = BorderFactory.createLineBorder(Color.black);
        label.setBorder(border);
        image1 =new ImageIcon("pink.jpg");
        image2 = new ImageIcon ("blue.png");
        image3 = new ImageIcon ("yellow.png");
        
        
        r1 = new JRadioButton("pink");
        r2 = new JRadioButton("blue");
        r3 = new JRadioButton("yellow");
        r1.setIcon(image1);
        r2.setIcon(image2);
        r3.setIcon(image3);
        rgroup = new ButtonGroup();
        rgroup.add(r1);
        rgroup.add(r2);
        rgroup.add(r3);
        r1.addActionListener(new clicked());
        r2.addActionListener(new clicked());
        r3.addActionListener(new clicked());
 
        panel = new JPanel();
        panel.add(label);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        add(panel);
        
        setVisible(true);
        
       
    }
    
    
    
    
    
    private class clicked implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            
            if (r1.isSelected())
            {
                System.out.print("pink");
                label.setForeground(Color.pink);
                
            }
            else if(r2.isSelected())
            {
                System.out.print("blue");
                label.setForeground(Color.BLUE);
            }
            else if(r3.isSelected())
            {
                System.out.print("yellow");
                label.setForeground(Color.YELLOW);
            }
        }
        
    }
    

   
    public static void main(String[] args) {
        new radiobutton();
    }
    
}
