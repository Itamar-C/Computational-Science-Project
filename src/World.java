abstract public class World {

    public World() {
        /* get here from the button or whatever the needed params
        for the simulation
         */
        this.width = this.getWidth();
        this.length = this.getLength();
        this.numSteps = this.getNumOfSteps();
        this.params = this.getAdditionalParams();
        oneCellMatrix = this.initCellMatrix();
    }

public CellMatrix oneCellMatrix;
    int width;
    int length;
    int numSteps;
    Object params;

     int getWidth() {
         return 10; // TODO get from btn
     }
     int getLength() {
         return 15; // TODO get from btn
     }
     int getNumOfSteps() {
         return 20; // TODO get from btn
     }
    abstract Object getAdditionalParams();
     abstract CellMatrix initCellMatrix();
    public void runSimulation() {
        for (int step = 0; step <= this.numSteps; ++step) {
            this.oneCellMatrix.timeStep(this.length, this.width, this.params); //TODO need more params?
        }

}


    public static void main(String[] args) {
        GOLWorld ourWorld = new GOLWorld();
        ourWorld.runSimulation();
    }

