
/**The Sudoko Generator**/
public class Sudoku {

    private int[] numbers[];
    private int numOfRC; //number of rows and columns.
    private int missingNum; // number of missing digits.
    private int sqrtOfN; //square root of number of numOfColRow.


    public Sudoku(int numOfRC, int missingN) {

        setNumOfRC(numOfRC);
        setMissingNum(missingN);


    }

    /**setters of the Numbers **/
    public void setNumOfRC(int numOfRC) {
        this.numOfRC = numOfRC;
    }

    public void setMissingNum(int missingNum) {
        this.missingNum = missingNum;
    }

    /**end of setter methods**/

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


    //Generating random number

    public int genRadomNum(int num){
        return (int) Math.floor((Math.random()*num+1));
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

        for (int i = 0; i<numOfRC; i++)
        {
            for (int j = 0; j<numOfRC; j++)
                System.out.print(numbers[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }


}


