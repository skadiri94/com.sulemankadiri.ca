import javax.swing.*;
import java.util.Scanner;

/**The Sudoko Generator**/
public class Sudoku {

    private int[] numbers[];
    private int numOfRC; //number of rows and columns.
    private int missingNum; // number of missing digits.
    private int sqrtOfN; //square root of number of numOfColRow.


    public Sudoku(int numOfRC, int missingN) {

        setNumOfRC(numOfRC);
        System.out.println("Constructor" + numOfRC);
        setMissingNum(missingN);
        setSqrtOfN(sqrtOfN);
        numbers = new int[numOfRC][numOfRC];


    }

    /**setters of the Numbers **/
    public void setNumOfRC(int numOfRC) {
        this.numOfRC = numOfRC;
    }

    public void setMissingNum(int missingNum) {
        this.missingNum = missingNum;
    }

    public void setSqrtOfN(int sqrtOfN) {

        Double sqrtOfND = Math.sqrt(numOfRC);
        sqrtOfN = sqrtOfND.intValue();

        this.sqrtOfN = sqrtOfN;
    }

    /**end of setter methods**/

    public void fillSudoku(){

        for (int i = 0; i<numOfRC; i=i+sqrtOfN) {

            // for diagonal box, start coordinates->i==j
            populateSudoku(i, i);
        }
    }
    /**generating the Sudoku numbers **/

    public void cellGenerator(int row, int col){

        int digits;

        for(int i = 0; i < sqrtOfN; i++){

            for(int j = 0; j < sqrtOfN; j++){

            }
        }

    }


    // Returns false if given 3 x 3 block contains num.
    boolean unUsedInBox(int rowStart, int colStart, int num)
    {
        for (int i = 0; i<numOfRC; i++)
            for (int j = 0; j<numOfRC; j++)
                if (numbers[rowStart+i][colStart+j]==num)
                    return false;

        return true;
    }

    void populateSudoku(int row,int col)
    {
        int num;
        for (int i=0; i<sqrtOfN; i++)
        {
            for (int j=0; j<sqrtOfN; j++)
            {

                    num = genRadomNum(numOfRC);

                //System.out.println("Random Number" + num);
                numbers[row+i][col+j] = num;

            }
        }
    }



    //Generating random number

    public int genRadomNum(int num){

        Scanner sc = new Scanner(System.in);
        return num = sc.nextInt();


    }

    //check if the digit already exist in Row
    public boolean alreadyPickedRow(int i, int num){

        for(int j = 0; j < numOfRC; j++)
            if(numbers[i][j] == num)
                return false;
        return true;
    }

    //check if the digit already exist in Column
    public boolean alreadyPickedCol(int j, int num){

        for(int i = 0; i < numOfRC; i++)
            if(numbers[i][j] == num)
                return false;
        return true;
    }

    public String toString(){
            String print = "";
        for (int i = 0; i<numOfRC; i++)
        {
            for (int j = 0; j<numOfRC; j++)
                print += numbers[i][j] + " ";
                print += "\n";
        }
        print += "\n";

        System.out.println("to String" + print);

        return print;
    }


}


