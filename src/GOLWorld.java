public class GOLWorld extends World {

    public Object getAdditionalParams() {
        return 0.4; //The initial chance of life in a cell TODO better
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