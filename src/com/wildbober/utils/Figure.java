package com.wildbober.utils;

import com.wildbober.Line;
import com.wildbober.Point;

import java.io.*;
import java.util.ArrayList;

public class Figure extends Line implements Externalizable {

    ArrayList<Line> lines;

    public Figure(){

    }

    public Figure(ArrayList<Line> lines){
        this.lines = lines;
    }

    public void printSquare(){
        for (int i =0; i < lines.size(); i++){
            lines.get(i).PrintLine();
        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(lines);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        lines = (ArrayList<Line>) in.readObject();
    }

}
