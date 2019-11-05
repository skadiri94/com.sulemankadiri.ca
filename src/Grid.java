import javax.swing.*;
import java.awt.GridLayout;

public class Grid extends JFrame{
	JPanel p=new JPanel();
	JTextField buttons[]=new JTextField[81];
	
	public static void main(String args[]){
		new Grid();
	}
	
	public Grid(){
		super("Grid");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(9,9));
		for(int i=0;i<81;i++){
			buttons[i]=new JTextField();

			p.add(buttons[i]);
		}
		add(p);
		
		setVisible(true);
	}
}