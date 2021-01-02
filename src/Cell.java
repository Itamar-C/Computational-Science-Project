abstract class Cell { // the class is abstract because we are not going to instantiate it, only its subclassas

    /**
     *
     * @param n - number of  steps
     * @param initState - the intial state. The inter
     */
    public Cell(int n, Object initCellParams){
        this.stateHistory = new Object[n]; // TODO how to intiate in java an array of objects
        this.currentState = initCell(initCellParams);
    }

    public Object currentState;
    public Object[] stateHistory;

    /**
     * The function doStep takes this.currentState and advance it to the n+1 state
     * The implementing class is expected to return a new cellState of the n+1 state
     * The
     * @param neighbours - an array of the neiboughring cells
     * @return cellState of the n+1 step
     */
    abstract public Object doStep(Object neighbours[][]); // To be inherited and implemented in subclasses
    abstract public Object initCell(Object params);

    /**
     * To be implemented by inheriting classes that need more complex state than boolean

    public class cellState {
        public cellState(object state) {
            this.state = state;
        }
        public object state;
    }
     */
}


