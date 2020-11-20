import java.lang.Math;


/**
 * makeMatrix Makes the grid and prepares the initial state of the matrix
 */
public class makeMatrix {
    /**
     * makeGrid is a function that creates an empty grid
     * @param matrixLength the matrix's length
     * @param matrixWidth the matrix's width
     * @return returns the empty grid
     */
    static int[][] makeGrid(int matrixLength, int matrixWidth){
        int[][] matrix1 =new int[matrixLength][matrixWidth];
        return matrix1;
    }

    /**
     * fillGrid is a function that fills the grid  with randomly displaced cells based on the given types of cells and spread of them
     * @param matrix1 the empty grid(matrix) made in makeGrid function
     * @param cellType the cell type - integer that can symbol a tree/empty space/ burning tree or the speed and etc.
     * @param densityOrPossibility the density or possibility (according to the module we are checking) to fill a cell
     * @return returns the start matrix
     */
    static int[][] fillGrid(int[][] matrix1, int matrixLength, int matrixWidth, int cellType, double densityOrPossibility){
        for (int row = 0; row<=matrixLength; ++row){
            for (int place = 0; place<=matrixWidth; ++place){
                double p = Math.random();
                if (p < densityOrPossibility){
                    matrix1[row][place] = cellType;
                }
            }
        }
        return matrix1;
    }
}