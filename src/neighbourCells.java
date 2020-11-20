public class neighbourCells {
    /**
     * creating a neighbours list according to method
     * @param method type of neighbourhood method
     * @param theCell the cell we are running on
     * @return
     */
    static int[] chooseMethod(String method, int[] theCell){
        int[] neighbours = []
        if (method == 'moore'){
            neighbours = [[theCell[0]-1, theCell[1]], [theCell[0]-1, theCell[1]-1], [theCell[0]-1, theCell[1]+1], [theCell[0], theCell[1]-1], [theCell[0], theCell[1]+1], [theCell[0]+1, theCell[1]], [theCell[0]+1, theCell[1]-1], [theCell[0]+1, theCell[0]+1]];
        }
        if (method == 'von nueman'){
            neighbours = [[theCell[0]-1, theCell[1]], [theCell[0], theCell[1]-1], [theCell[0], theCell[1]+1], [theCell[0]+1, theCell[1]]];
        }
        return neighbours;
    }
}
