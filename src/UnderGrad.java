import javax.swing.*;

public class UnderGrad extends Student {

    private String [] subjects = new String[10];
    private String category;

    public UnderGrad(String name, int age){
        super(name,age);
        populateSubject(subjects);
        setCategory(category);

    }


    public void setCategory(String category) {
        this.category = "Full Time";
    }


    public String getCategory() {
        return category;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public String toString() {


        return super.toString() + "\n\n" + String.format("Sutend: %s\nCategory: ",printSubjects(subjects),getCategory());
    }

    public void populateSubject(String[] subjects){
        int index=0;
        String s = JOptionPane.showInputDialog(null,"Enter Subject: ");
        while(!s.equals("")){

            subjects[index] = s;

            index++;
            System.out.println(s);
            s = JOptionPane.showInputDialog(null,"Enter Subject: ");;
        }

    }

    public String printSubjects(String [] subjects){
        String sub = "";

        for(int i=0;i<9;i++)
        {
            sub += subjects[i] + ", ";
        }

        return sub;
    }


}
