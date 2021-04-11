package com.wildbober;

import com.wildbober.utils.DataHelper;
import com.wildbober.utils.DeSerializer;
import com.wildbober.utils.Figure;
import com.wildbober.utils.Serializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Figure> listObjects = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Serializer serializer = new Serializer();
    DeSerializer deSerializer = new DeSerializer();

    public Controller(){

    }

    public void Start() throws IOException, ClassNotFoundException {

        while (true){
            System.out.println("1 - добавить новый обьект в список");
            System.out.println("2 - изменить обьект в списоке");
            System.out.println("3 - серилизовать обьект в файл");
            System.out.println("4 - серилизовать данные из файла в обьект");
            System.out.println("5 - просмотреть список");

            int index =  in.nextInt();

           if(index == 1){
               Figure figure = addObject();
               listObjects.add(figure);
               printFigures();
           }
           if(index == 2){
               changeObject(listObjects);
               printFigures();
           }
           if(index == 3){
               serializeToFile();
           }
           if(index == 4){
               deSerializeToFile();
           }
           if(index == 5){
               printFigures();
           }
        }
    }

    private Figure addObject(){
        ArrayList<Line> lines = new ArrayList<>();
        System.out.println("сколько линий добавить в фигуру?");

        int count = in.nextInt();

        for (int i =0 ; i < count ; i++){
            System.out.println("Введите x1");
            int x1 = in.nextInt();
            System.out.println("Введите y1");
            int y1 = in.nextInt();
            System.out.println("Введите x2");
            int x2 = in.nextInt();
            System.out.println("Введите y2");
            int y2 = in.nextInt();
            Line line = new Line(new Point(x1,y1), new Point(x2,y2));
            lines.add(line);
        }

        Figure figure = new Figure(lines);

        return figure;
    }

    private void changeObject(ArrayList<Figure> listObjects){


        System.out.println("в Списке содержится "+listObjects.size() + " фигур");
        System.out.println("какую фигуру вы хотите изменить?");

        int index = in.nextInt();
        index--;
        if(index >= listObjects.size()){
            System.out.println("index превышает количество фигур");
        }

        listObjects.set(index,addObject());
    }

    private void serializeToFile() throws IOException {
        serializer.SerializeToObject(listObjects, "objects.dat");

    }

    private void deSerializeToFile() throws IOException, ClassNotFoundException {
        listObjects = (ArrayList<Figure>) deSerializer.DeSerializeToClass("objects.dat");
    }

    private void printFigures(){
        for(int i = 0; i < listObjects.size(); i++){
            listObjects.get(i).printSquare();
        }
    }

}
