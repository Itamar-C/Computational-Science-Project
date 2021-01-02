abstract class CellMatrix {
    /**
     * timeStep Updates the current matrix while separating t and t+1
     *
     * @param currentState the current matrix (time step t)
     * @param matrixLength the matrix's length
     * @param matrixWidth  the matrix's width
     *                     theCell updates the cell we are currently running on
     *                     neighbours is a list of all of the cell's neighbours made by the neighboursCell object
     * @return matrix of t+1
     */
    private Cell[][] currentState;

    public CellMatrix(int matrixLength, int matrixWidth, int numOfSteps, Object additionalParams){
        this.currentState = new Cell[matrixLength][matrixWidth]
        for (int row = 0; row <= matrixLength; ++row) { //running on the rows
            for (int place = 0; place <= matrixWidth; ++place) { //running on the columns
                this.currentState[row][place] = this.initiateCell(row, place, additionalParams)
            }
        }
    }

    public void timeStep(int matrixLength, int matrixWidth, Object additionalParams) {
        Cell[][] nextMatrix = this.currentState.clone(); //making a clone of the current matrix
        for (int row = 0; row <= matrixLength; ++row) { //running on the rows
            for (int place = 0; place <= matrixWidth; ++place) { //running on the columns
                Cell[][] neighbours = getNeighbours(row, place);
                nextMatrix[row][place].doStep(neighbours);
            }
        }
        this.currentState = nextMatrix;
           // return nextMatrix; //matrix of t+1
    }
    abstract Cell[][] getNeighbours(int cellRow, int column);
    /* The function instantiate a Cell state, which in turn set its intial state */
    abstract Cell initiateCell(int cellRow, int cellColumn, Object additionalParams);



}

    /**
     *the main of the whole system, puts it all together
     */
    /*
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
} */
