public class Sudoku {

    private int [] topRow = new int[3];
    private int [] midRow = new int[3];
    private int [] bottomRow = new int[3];

    public Sudoku(){
        this(null,null,null);
    }

    public Sudoku(int[] topRow, int[] midRow, int[] bottomRow){

        System.out.println("Constructor");
        populateRow(topRow);
        populateRow(midRow);
        populateRow(bottomRow);
        //setMidRow(populateRow(midRow));
        //setBottomRow(populateRow(bottomRow));


    }

    public void setTopRow(int[] topRow) {
        this.topRow = topRow;
    }

    public void setMidRow(int[] midRow) {
        this.midRow = midRow;
    }

    public void setBottomRow(int[] bottomRow) {
        this.bottomRow = bottomRow;
    }

    public int[] getTopRow() {
        return topRow;
    }

    public int[] getMidRow() {
        return midRow;
    }

    public int[] getBottomRow() {
        return bottomRow;
    }
    //creating a method to populate the array of int
    public void populateRow(int[] num){

        for(int i=0;i<4;i++){



            num[i] = 1;//(int)((Math.random()*((9-1)+1))+1);
            System.out.println("populateArray");


        }

        //return num;
    }

    public String listRowContent(int[] num){
        System.out.println("display Array");
        String content="";
        for(int i=0;i<num.length;i++){

            content +=  num[i] +", ";
        }
        return content;

    }


    public String toString() {
        System.out.println("listRowContent(topRow)");
        return String.format("%s\n%s\n%s",listRowContent(topRow),listRowContent(midRow),listRowContent(bottomRow));
    }
}
