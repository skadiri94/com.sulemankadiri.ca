public class SudokuDriver {

    public static void main(String[] args) {

        Sudoku sd = new Sudoku();
        int[] num0 = new int[3],num1 = new int[3],num2 = new int[3];

        sd.populateRow(num0);
        sd.populateRow(num1);
        sd.populateRow(num2);

        sd = new Sudoku(num0,num1,num2);

        System.out.println(sd.toString());

    }
}
