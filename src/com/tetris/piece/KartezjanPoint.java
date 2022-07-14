package com.tetris.piece;

public class KartezjanPoint {
    private int[] pointIndex = new int[2];

    public KartezjanPoint(int[] pointIndex) {
        this.pointIndex = pointIndex;
    }

    public int getRow() {
        return pointIndex[0];
    }
    public int getColumn() {
        return pointIndex[1];
    }

    public void setPointIndex(int[] pointIndex) {
        this.pointIndex = pointIndex;
    }
}
