import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingCalculator {
	private JButton jbone,jbtwo,jbthree,jbfour,jbfive,jbsix,jbseven,jbeight,jbnine,jbzero,jbplus,jbminus,jbmul,jbdiv,jbequal,jbclear;
	private JPanel  panel;
	private JTextField jtfshow;
	private int num1=0,num2=0,result=0;
	public SwingCalculator(){
		jbone   = new JButton("1");
		jbtwo   = new JButton("2");
		jbthree = new JButton("3");
		jbfour  = new JButton("4");
		jbfive  = new JButton("5");
		jbsix   = new JButton("6");
		jbseven = new JButton("7");
		jbeight = new JButton("8");
		jbnine  = new JButton("9");
		jbzero  = new JButton("0");
		jbequal = new JButton("=");
	    jbclear = new JButton("C");
	    jbplus  = new JButton("+");
	    jbminus = new JButton("-");
	    jbmul	= new JButton("*");
	    jbdiv   = new JButton("/");
	    jtfshow = new JTextField(10);
	    panel = new JPanel();
	    panel.setLayout(new GridLayout(4,4));
	    panel.add(jbseven);
	    panel.add(jbeight);
	    panel.add(jbnine);
	    panel.add(jbplus);
	    panel.add(jbfour);
	    panel.add(jbfive);
	    panel.add(jbsix);
	    panel.add(jbminus);
	    panel.add(jbone);
	    panel.add(jbtwo);
	    panel.add(jbthree);
	    panel.add(jbmul);
	    panel.add(jbclear);
	    panel.add(jbzero);
	    panel.add(jbequal);
	    panel.add(jbdiv);
	    jtfshow.setEditable(false);
	    
	    JFrame frame = new JFrame("Swing Calculator");
	    frame.setLayout(new BorderLayout());
	    frame.add(jtfshow,BorderLayout.NORTH);
	    frame.add(panel,BorderLayout.CENTER);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setTitle("Swing Calculator");
		frame.setVisible(true);
	
	
        }
   

   public static void main(String[] args){
		SwingCalculator c = new SwingCalculator();
	}

}