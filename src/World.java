import javax.swing.JOptionPane;
java.util.Random class
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

    /**
     * button to get the matrix's width
     * @return the matrix's width
     */
     int getWidth() {
         String width = JOptionPane.showInputDialog(null, "Please enter the width of the cellular automata: ");
         int Width = Integer.parseInt(width);
         System.out.println("Width is:" + width);
         return Width; // TODO get from btn
     }
    /**
     * button to get the matrix's length
     * @return the matrix's length
     */
     int getLength() {
         String height = JOptionPane.showInputDialog(null, "Please enter the height of the cellular automata: ");
         int Height = Integer.parseInt(height);
         System.out.println("Height is:" + height);
         return Height; // TODO get from btn
     }
    /**
     * button to get the simulation's number of time steps
     * @return the simulation's number of time steps
     */
     int getNumOfSteps() {
         String numSteps = JOptionPane.showInputDialog(null, "Please enter the number of time steps for your cellular automata: ");
         int NumSteps = Integer.parseInt(numSteps);
         System.out.println("number of time steps:" + numSteps);
         return NumSteps; // TODO get from btn
     }

    /**
     *
     * @return
     */
    abstract Object getAdditionalParams();

    Object[][][] history = [];
    /**
     * אתחול המטריקס ואכלוסו
     * @return initated matrix
     */
    abstract CellMatrix initCellMatrix();

    public void runSimulation() {
        for (int step = 0; step <= this.numSteps; ++step) {
            this.oneCellMatrix.timeStep(this.length, this.width, this.params, history);
        }
    }
}
public class ItamarAndAlma{
    public static void main(String[] args) {
        GOLWorld ourWorld = new GOLWorld();
        ourWorld.runSimulation();
}