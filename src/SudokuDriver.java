import javax.swing.*;

public class SudokuDriver {

    public static void main(String[] args) {

        Sudoku sd = new Sudoku(6,1);


        //String s = JOptionPane.showInputDialog(null ,"Enter anything");

        sd.fillSudoku();
        System.out.println(sd.toString());

    }
}
