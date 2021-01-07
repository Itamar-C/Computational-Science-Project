abstract class Cell { // the class is abstract because we are not going to instantiate it, only its subclassas

    /**
     * The function doStep takes this.currentState and advance it to the n+1 state
     * The implementing class is expected to return a new cellState of the n+1 state
     * @param neighbours - an array of the neiboughring cells
     * @return cellState of the n+1 step
     */
    abstract public Object doStep(Object neighbours[][]); // To be inherited and implemented in subclasses

    /**
     *
     * @param params additional parameter
     * @return
     */
    abstract public Object initCell(Object params);

    /**
     *
     * @param n - number of  steps
     * @param initCellParams - the cell's parameters
     */
    public Cell(int n, Object initCellParams){
        this.stateHistory = new Object[n]; // TODO how to intiate in java an array of objects
        this.currentState = initCell(initCellParams);
    }

    public Object currentState;
    public Object[] stateHistory;
}

class GOLCellPrey extends Cell{
    @java.lang.Override
    public int doStep(int[][] neighbours) {
        for (int i = 0, i = 7, i ++) { //הנטרף נאכל אם יש לידו אפילו טורף אחד
            if (neighbours[i] == 2) {
                return 0;
            }
        }
        if (j == 1) { //הנטרף מזדווג וממלא מקום ריק בילוד החדש
            for (int i = 0, i = 7, i ++) {
                if (neighbours[i] == 0) {
                    neighbours[i] = 1;
                    break;
                }
            }
        }
        return 1;
    }

    @java.lang.Override
    public int initCell(float[] params) {
        double random = Math.random()
        if (0< random <= params[0]){
            return 1;
        }
    }
}

class GOLCellPredator extends Cell{
    @java.lang.Override
    public Object doStep(int[][] neighbours) {
        int j = 0// number of predators around the predator
        for (int i = 0, i = 7, i ++) {
            if (neighbours[i] == 2) {
                j = j + 1;
            }
        }
        if (j >= 3) {
            return 0; //the predator dies from over population
        }
        if (j == 1) { //הטורף מזדווג וממלא מקום ריק בילוד החדש
            for (int i = 0, i = 7, i ++) {
                if (neighbours[i] == 0) {
                    neighbours[i] = 2;
                    break;
                }
            }
            for (int i = 0, i = 7, i ++) {// האם ישנו אוכל לטורף בסביבתו??
                if (neighbours[i] == 1) {
                    neighbours[i] = 0;
                    break;
                }
                if (i == 7) {
                    double random = Math.random();
                    if (random <= 0.3) { // הסיכוי של הטורף למות אם לא אכל
                        return 0;
                    }
                }
                return 2; // מחזיר אותו מצב אם הוא לא מת מצפיפות או מחוסר אוכל
            }
        }
    }

    @java.lang.Override
    public int initCell(float[] params) {
        double random = Math.random()
        if (0< random <= (params[0]+params[1]) {
            return 2;
        }
        if (random > (params[0]+params[1]){
            return 0;
        }
    }
}