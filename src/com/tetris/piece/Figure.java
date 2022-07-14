package com.tetris.piece;

public abstract class Figure {
    private KartezjanPoint[] placePoint = new KartezjanPoint[4];
    private KartezjanPoint middle = placePoint[2];
    private int rotate = 0;


    public Figure(KartezjanPoint[] placePoint) {
        this.placePoint = placePoint;
    }

    public abstract void fillMyPlace();
//working only with I type of figure
    public void rotate() {
        if (rotate == 0) {
            for (int i = 0; i < placePoint.length; i++) {
                int row = middle.getRow();
                int column = middle.getColumn() - placePoint[i].getRow();
                int[] ar = {row, column};
                placePoint[i].setPointIndex(ar);
                this.rotate = 1;
            }
        } else {
            for (int i = 0; i < placePoint.length; i++) {

                int column = middle.getColumn();
                int row = middle.getRow() - placePoint[i].getColumn();
                int[] ar = {row, column};
                placePoint[i].setPointIndex(ar);
            }
            this.rotate = 0;
        }

    }
}
