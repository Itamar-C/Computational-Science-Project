public class GOLWorld extends World {

    public Object getAdditionalParams() {
        String preyProbPop = JOptionPane.showInputDialog(null, "Please enter the prey's intial population ");
        float PreyPop = float.parsefloat(height);
        System.out.println("the prey's intial population:" + preyProbPop);
        String predatorProbPop = JOptionPane.showInputDialog(null, "Please enter the predator's intial population ");
        float PredatorPop = float.parsefloat(height);
        System.out.println("the predator's intial population:" + predatorProbPop);
        return [PreyPop, PredatorPop];
    }

    public CellMatrix initCellMatrix() {
        return new GOLCellMatrix(this.length, this.width, this.numSteps, this.params);
    }

    }
}


//TODO GOLCellMatrix subclass
// TODO GOLCellMatrix.getNeighbours implementation
// TODO GOLCellMatrix.initiateCell implementation

//TODO GOLCell
// TODO GOLCell.initCell
// TODO GOLCell.doStep