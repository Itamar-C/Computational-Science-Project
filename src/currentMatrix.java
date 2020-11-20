public class currentMatrix {
    /**
     * timeStep Updates the current matrix while separating t and t+1
     * @param currentState the current matrix (time step t)
     * @param matrixLength the matrix's length
     * @param matrixWidth the matrix's width
     * theCell updates the cell we are currently running on
     * neighbours is a list of all of the cell's neighbours made by the neighboursCell object
     * @return matrix of t+1
     */
    public int[][] timeStep(int[][] currentState, int matrixLength, int matrixWidth){
        int[][] nextMatrix = currentState.clone(); //making a clone of the current matrix
        for (int row = 0; row <= matrixLength; ++row) { //running on the rows
            for (int place = 0; place <= matrixWidth; ++place) { //running on the columns
                int[] theCell = [row, place]; //updates the cell we are currently running on
                int[] neighbours = neighbourCells.chooseMethod(method, theCell); //directs to the neighbours object
                nextMatrix[theCell[0]][theCell[1]] = Cell.neighbourConditions(neighbours, neighbourCondition, currentState, conditionResult, theCell); //directs to the Cell object to activate the neighbours conditions on the cell
                nextMatrix[theCell[0]][theCell[1]] = Cell.cellConditions(currentState, CellconditionResult, theCell, condition, theCell); //directs to the Cell object to activate the cell conditions on the cell
            }

        }
        return nextMatrix; //matrix of t+1
    }

    /**
     *the main of the whole system, puts it all together
     */
    public static void main(String[] args) {
        int[][][] AllMatrixes = [] //to save every time-step's state
        int[][] matrix1 = makeMatrix.makeGrid(matrixLength, matrixWidth); //direct to makeMatrix object to make an empty initial grid
        int[][] currentState = makeMatrix.fillGrid(matrix1, matrixLength, matrixWidth, cellType, densityOrPossibility);//direct to makeMatrix object to fill the empty initial grid
        for (int tstep = 1; tstep <= timesteps; ++tstep) { //progress in time steps
            int[][] nextState = timeStep(int[][] currentState, int matrixLength, int matrixWidth, String method)
            currentState = nextState
            AllMatrixes += currentState
        }
        plot(AllMatrixes)//direct to plot object to plot in different ways the module's progress

    }
}
