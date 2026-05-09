import javax.swing.*;
import java.awt.event.*;
import cmat
public class Ex4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First GUI");
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel title = new JLabel("Find roots of quadratic ax^2+bx+c=0");
        title.setBounds(50,20,250,30);
        JLabel input1 = new JLabel("a=");
        input1.setBounds(50,40,200,50);
        JTextField textF1 = new JTextField();
        textF1.setBounds(50, 80, 200, 30);
         JLabel input2 = new JLabel("b=");
        input2.setBounds(50,120,200,50);
        JTextField textF2 = new JTextField();
        textF2.setBounds(50, 160, 200, 30);
        JLabel input3 = new JLabel("c=");
        input3.setBounds(50,180,200,50);
        JTextField textF3 = new JTextField();
        textF3.setBounds(50, 220, 200, 30);
        JButton btn = new JButton("Find");
        btn.setBounds(50,260,80,30);
        JLabel result = new JLabel("");
        result.setBounds(50, 230, 350, 30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             double a = Double.parseDouble(textF1.getText());
             double b = Double.parseDouble(textF2.getText());
             double c = Double.parseDouble(textF3.getText());
              double d = b * b - 4 * a * c;

                if (d > 0) {
                    double r1 = (-b + Math.sqrt(d)) / (2 * a);
                    double r2 = (-b - Math.sqrt(d)) / (2 * a);
                    result.setText("Roots: " + r1 + " , " + r2);
                } else if (d == 0) {
                    double r = -b / (2 * a);
                    result.setText("Root: " + r);
                } else {
                    result.setText("No real roots");
                }   
            }
        });

        frame.add(title);
        frame.add(input1);
        frame.add(textF1);
        frame.add(textF2);
        frame.add(input2);
         frame.add(textF3);
        frame.add(input3);
        frame.add(btn);
        frame.setVisible(true);
    }
    
}
