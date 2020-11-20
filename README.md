# Computational-Science-Project
## makeMatrix
Makes the grid and prepares the initial state of the matrix.
Input: matrix size, type of cells, the spread of the cells.
Output: the initial matrix with all its components.
Functions: 
makeGrid - creates the grid (gets the length and width of a wanted matrix and gives back a matrix based on that).
fillGrid - fills the grid  with randomly displaced cells based on the given types of cells and spread of them (gets type of cells and the spread of the cells and gives back a filled matrix).
Dynamic variables: 
initialMatrix : array/ int[]
Static variables:
numCells: int
matrixLength: int
matrixWidth: int

## currentMatrix
Updates the current matrix while separating t and t+1 , updates which cell we are running on.
Input: result of makeMatrix (initialMatrix), 
Output: all matrixes (the module after a whole run)
Functions:
timeStep- forwarding the module in 1 time step
Static variables:
timeSteps: int
Dynamic variables:
nextMatrix: int[][] array (next time step)
currentState: int[][] (time step t matrix)
theCell: int[]
neighbours: int[]
AllMatrixes: int[][][]

## neighbourCells
Make a list of the neighbours of a given cell . choose the type of neighbourhood method that suits the current model. 
Input: index of a cell, methodType
Output: dictionary of neighbours, list of neighbours
Functions: 
chooseMethod - choose the type of neighbour method that suits the current model.
Static variables:
method; String
Dynamic variables:
neighbours: int[]

## Cell
Changing the cell according to the cell’s conditions and neighbours (such as speed, color, state of matter, etc.).
Input: current state, index of a cell, neighbour list & list, conditions applied by cell itself and neighbours, conditions results
Output: new state of the cell
Functions: 
neighbourConditions - conditions applied influenced by neighbours.
cellConditions -  self cell conditions applied


## plot
Plots the wanted graphs/charts/diagrams.
Input: Allmatrixes: int[][][] 
Output: graphs/charts/diagrams
Functions: 
Animation - makes an animation of the graph.
Function over time - etc.
Diagram - etc.
Columns - etc.
