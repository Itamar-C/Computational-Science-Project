public class cell {
    /**
     *the conditions activated on the cells by the neighbour cells
     * @param neighbours list of neighbours made in the neighbourCells object
     * @param neighbourCondition the conditions activated on the cells according to the neighbours state and the module's conditions
     * @param currentState the matrix in time step t
     * @param conditionResult the result of the conditions activated on the cells according to the neighbours state and the module's conditions
     * @param theCell the cell we are running on
     * @return the new cell's state
     */
    static int neighbourConditions(int[] neighbours, int neighbourCondition, int[][] currentState, int conditionResult, int[] theCell) {
        for (int i = 0; i <= (neighbours.length - 1); ++i) {
            if (currentState[neighbours][i][0][1] == neighbourCondition) {
                currentState[theCell[0]][theCell[1]] = conditionResult;
            }
        }
        return currentState[theCell[0]][theCell[1]];
    }

    /**
     * the conditions activated on the cells according to the module's conditions and the cell's current state
     * @param currentState the matrix in time step t
     * @param CellconditionResult the result of the conditions activated on the cells according to the module's conditions and the cell's current state
     * @param theCell the cell we are running on
     * @param condition the conditions activated on the cells according to the module's conditions and the cell's current state
     * @return the new cell's state
     */
//the conditions activated on the cells according to the module's conditions
    static int cellConditions(int[][] currentState, int CellconditionResult, int[] theCell, int condition) {
        if (currentState[theCell[0]][theCell[1]] == condition) {
            currentState[theCell[0]][theCell[1]] = CellconditionResult;
        }
        return currentState[theCell[0]][theCell[1]];
    }
}
