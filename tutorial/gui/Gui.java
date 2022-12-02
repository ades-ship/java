import java.awt.event.*;
import javax.swing.*;
class Demo implements ActionListener
{
    JFrame frame= new JFrame("laudo");
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField tf3=new JTextField();
    JButton b=new JButton("Integer divison");

    public Demo()
    {
       frame.setSize(500,600);
       b.setBounds(50,130,95,30);
       tf1.setBounds(50,40,150,20);
       tf2.setBounds(50,70,150,20);
       tf3.setBounds(50,160,300,30);

       b.addActionListener(this);
       frame.add(b);
       frame.add(tf1);
       frame.add(tf2);

       frame.add(tf3);

       frame.setLayout(null);
       frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {

        String s1=tf1.getText();
        String s2=tf2.getText();
         
        try{
            int x=Integer.parseInt(s1);
            int y=Integer.parseInt(s2);
            int s3=x/y;
            String s=""+s3;
            tf3.setText(s);
            
        }
        catch(Exception es)
        {
            tf3.setText(es.toString());
        }


    }
   

}
public class Gui
{
    public static void main(String[]args)
    {
        Demo d = new Demo();
    }
}