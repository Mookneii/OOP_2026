import javax.swing.*;
import java.awt.event.*;
public class Ex3 { 
    public static void main(String[] args){
 JFrame frame = new JFrame("First GUI");
 frame.setSize(400, 300);
 frame.setLayout(null);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JLabel title = new JLabel("Count number of Vowel, Consonant and Space");
 title.setBounds(50, 20, 300, 20);
 JLabel textLabel = new JLabel("Text: ");
 textLabel.setBounds(50,60,50,25);
 JTextField textField = new JTextField();
 textField.setBounds(10,60,200,25);
 JButton btn = new JButton("Find");
 btn.setBounds(140,100,100,30);
 JLabel result1 = new JLabel("Count of vowel is: ");
 result1.setBounds(50,150,300,20);
 JLabel result2 = new JLabel("Count of consonant is: ");
 result2.setBounds(50,170,300,20);
 JLabel result3 = new JLabel("Count of space is: ");
 result3.setBounds(50,190,300,20);
 btn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        String text = textField.getText().toLowerCase();
        int vowel =0;
        int consonant = 0;
        int space = 0;
        for(int i =0; i< text.length();i++){
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e'|| ch == 'o' || ch== 'i' || ch == 'u'){
                vowel++;
            }
            else if( ch>='a' && ch<= 'z'){
                consonant++;
            }
            else if( ch == ' '){
                space++;
            }
        }
        result1.setText("Count of Vowel is :"+ vowel);
        result2.setText("Count of consonant is: "+ consonant);
        result3.setText("Count of space is : "+ space);
    }
 });
 frame.add(textLabel);
 frame.add(textField);
 frame.add(btn);
frame.add(title);
frame.add(result1);
frame.add(result2);
frame.add(result3);
frame.setVisible(true);
}
}
