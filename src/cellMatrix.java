abstract class CellMatrix {

    private Cell[][] currentState;

    /**
     *
     * @param matrixLength
     * @param matrixWidth
     * @param numOfSteps
     * @param additionalParams is the parameters we get from the the specific cellular automata world, parameters specialized for the specific automata
     */
    public CellMatrix(int matrixLength, int matrixWidth, int numOfSteps, Object additionalParams){
        this.currentState = new Cell[matrixLength][matrixWidth]
        for (int row = 0; row <= matrixLength; ++row) { //running on the rows
            for (int place = 0; place <= matrixWidth; ++place) { //running on the columns
                this.currentState[row][place] = this.initiateCell(row, place, additionalParams)
            }
        }
    }

    /**
     * timeStep Updates the current matrix while separating t and t+1

     * @param currentState the current matrix (time step t)
     * @param matrixLength the matrix's length
     * @param matrixWidth  the matrix's width
     * @param additionalParams is the parameters we get from the the specific cellular automata world, parameters specialized for the specific automata
     * @return matrix of t+1
     */
    public void timeStep(int matrixLength, int matrixWidth, Object additionalParams, Cell[][] currentState) {
        Cell[][] nextMatrix = this.currentState.clone(); //making a clone of the current matrix
        for (int row = 0; row <= matrixLength; ++row) { //running on the rows
            for (int place = 0; place <= matrixWidth; ++place) { //running on the columns
                Cell[][] neighbours = getNeighbours(row, place, currentstate);
                nextMatrix[row][place].doStep(neighbours);
            }
        }
        this.currentState = nextMatrix;
            // return nextMatrix; //matrix of t+1

        for (int[][] row : matrixLength){
            System.out.println(Arrays.toString(row));
        }

    }

    /**
     * getNeighbours creates a list
     * @param cellRow the row of the cell we are currently running on
     * @param column the column of the cell we are currently running on
     * @return list of neighbous indexes
     */
    abstract Cell[][] getNeighbours(int cellRow, int column);

    /**
     * initiateCell instantiate a Cell state, which in turn set its intial state
     * @param cellRow the row of the cell we are currently running on
     * @param column the column of the cell we are currently running on
     * @param additionalParams is the parameters we get from the the specific cellular automata world, parameters specialized for the specific automata (פרמטרי איכלוסין)
     * @return תא מאוכלס לפי הפרמטרים הניתנו
     */
    abstract Cell initiateCell(int cellRow, int column, Object additionalParams);



}

class GOLcellMatrix extends CellMatrix{
    @java.lang.Override
    Cell[][] getNeighbours(int cellRow, int column, Cell[][] currentstate) {
        int[][] neighbours = [currentstate[cellRow+1][column], currentstate[cellRow+1][column-1], currentstate[cellRow+1][column+1], currentstate[cellRow-1][column+1], currentstate[cellRow-1][column], currentstate[cellRow-1][column+1], currentstate[cellRow][column+1], currentstate[cellRow][column-1]]
        return neighbours;
    }
    @java.lang.Override
    Cell initiateCell(int cellRow, int cellColumn, float[] additionalParams) {
        return Cell;
    }
}
