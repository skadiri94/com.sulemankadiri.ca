import javax.swing.*;

public class StudentDriver {
    public static void main(String[] args) {
        JTextArea jta = new JTextArea();
        UnderGrad [] underGradStudents = new UnderGrad[10];
        int age,index=0;
        String name;



        while( JOptionPane.showConfirmDialog(null,"Create a New Under Gradute Student","Confirmation",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

            name = JOptionPane.showInputDialog("Enter Name: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age: "));

            underGradStudents[index] = new UnderGrad(name,age);

            index++;
        }

        for(int i=0;i<underGradStudents.length;i++) {

            if(!underGradStudents[i].equals(null))
            jta.append(underGradStudents[i].toString());
            else
                break;

        }

        JOptionPane.showMessageDialog(null,jta,"Message",JOptionPane.INFORMATION_MESSAGE);
    }
}
