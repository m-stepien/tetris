package com.tetris.logic;

import com.tetris.logic.PointSystem;
import com.tetris.piece.Place;
import java.util.ArrayList;

public class Tetris{
    private int playerPoint=0;
    private PointSystem point;
    private Place[][] tetrisMatrix = new Place[20][10];
    public ArrayList<Integer> checkIsRowFull(){
        boolean isFull;
        ArrayList<Integer> fullRows = new ArrayList<Integer>();
        int i;
        for(i =0; i<this.tetrisMatrix.length;i++){
            isFull = true;
            for(int j = 0; j<this.tetrisMatrix[0].length;j++){
                if(this.tetrisMatrix[i][j].isEmpty()){
                    isFull=false;
                    break;
                }
            }
            if(isFull){
                fullRows.add(i);
            }
        }
        return fullRows;
    }
    public void deleteRows(ArrayList<Integer> fullRows){
        for(int i=0; i<fullRows.size();i++){
            for(int j=0;j<this.tetrisMatrix[0].length;j++){
                this.tetrisMatrix[i][j].makeEmpty();
            }
            this.playerPoint=point.addPoint(playerPoint);
        }
    }
}
