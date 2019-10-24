public class Sudoku {

    private int [] topRow = new int[3];
    private int [] midRow = new int[3];
    private int [] bottomRow = new int[3];

    /*public Sudoku(){
        //this(null,null,null);
    }
*/

   // (int[] topRow, int[] midRow, int[] bottomRow //this is not working when its being passed into the constructor
    public Sudoku(){

       // System.out.println("Constructor");
        populateRow(this.topRow);
        populateRow(this.midRow);
        populateRow(this.bottomRow);
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

        for(int i=0;i<num.length;i++){



            num[i] = (int)((Math.random()*((9-1)+1))+1);
            //System.out.println("populateArray");


        }

        //return num;
    }

    public String listRowContent(int[] num){
        //System.out.println("display Array");
        String content="";
        for(int i=0;i<num.length;i++){

            content +=  num[i] +" ";
        }
        return content;

    }


    public String toString() {
        System.out.println("listRowContent(topRow)");
        return String.format("%s\n%s\n%s",listRowContent(topRow),listRowContent(midRow),listRowContent(bottomRow));
    }
}
