package Pieces;

public class Pawn extends Piece {
    private boolean firstMove;

    Pawn(String color, Position position) {
        super(color, position);
        this.firstMove = false;
    }

    public boolean isValidMove(Position newPosition, boolean isKill) {

        Position myPosition = this.getPosition();
        boolean isWhitePiece = this.getColor().equals("white");


        boolean isDiagonal = Math.abs(myPosition.getCol() - newPosition.getCol()) == 1;
        boolean isForward = myPosition.getCol() - newPosition.getCol() == 0;
        int distanceForward = myPosition.getRow() - newPosition.getRow();

        // initialize variables
        boolean isReachableKilling = false;
        boolean isReachable = false;

        // check for potential scenarios
        if(isDiagonal)
            isReachableKilling = isWhitePiece? distanceForward == 1: distanceForward == -1;
        else if (isForward && this.isFirstMove() && isWhitePiece)
            isReachable = 0 < distanceForward && distanceForward <= 2;
        else if (isForward && this.isFirstMove() && !isWhitePiece)
            isReachable = 0 > distanceForward && distanceForward >= -2;
        else if (isForward && !this.isFirstMove())
            isReachable = isWhitePiece ? distanceForward == 1 : distanceForward == -1;

        this.setFirstMove(false);

        return (isReachableKilling && isKill) || isReachable;
    }


    // setters & getters
    public boolean isFirstMove() { return this.firstMove; }
    public void setFirstMove(boolean firstMove) { this.firstMove = firstMove; }
}
