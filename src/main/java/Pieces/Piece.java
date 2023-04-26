package Pieces;

import java.util.LinkedList;

abstract class Piece {

    private final String color;
    private Position position;

    Piece(String color, Position position) {
        this.color = color;
        this.position = position;
    }

    // setters & getters
    public String getColor() { return this.color; }
    public Position getPosition() { return this.position; }

    public void setPosition(Position p) { this.position = p; }
}
