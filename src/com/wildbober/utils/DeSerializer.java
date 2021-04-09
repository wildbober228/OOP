package com.wildbober.utils;

import com.wildbober.Line;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializer {

    public Object DeSerializeToClass(String nameFile) throws IOException, ClassNotFoundException {

        Object object = new Object();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nameFile)))
        {
            object = ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return object;
    }

}
