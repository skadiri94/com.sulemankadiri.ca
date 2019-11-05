import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame{
	JPanel p =new JPanel();
	JTextField textFields[]=new JTextField[81];
	JPanel overallP =new JPanel();
	JPanel northPanel = new JPanel();
	JButton btnCheck = new JButton("Check");
	
	public static void main(String args[]){
		new Grid();
	}
	
	public Grid(){
		super("Grid");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(9,9));
		p.setSize(300,300);
		int digits=0;

		for(int i=0;i<81;i++){
			textFields[i]=new JTextField();
			textFields[i].setHorizontalAlignment(JTextField.CENTER);
			textFields[i].setDocument(new JTextFieldLimit(1));
			digits =(int) (Math.random()*((9-1)+1))+1;
			textFields[i].setText(String.valueOf(digits));

			p.add(textFields[i]);
		}
		JLabel l = new JLabel("test label");
		l.setSize(100,100);
		overallP.setLayout(new BorderLayout());
		northPanel.setLayout(new FlowLayout());
		northPanel.add(l);
		overallP.add(northPanel,BorderLayout.NORTH);
		overallP.add(p,BorderLayout.CENTER);
        add(overallP);
		setVisible(true);
	}

	public int[] getDigits(){
		//btnCheck.addActionListener(e ->
		int[] allNums = new int[81];

			for (int i = 0; i < 81; i++)
				allNums[i] = Integer.parseInt(textFields[i].getText());
			//}
			return allNums;
			//});
		}



}