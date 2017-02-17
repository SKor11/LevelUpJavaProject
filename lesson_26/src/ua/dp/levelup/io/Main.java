package ua.dp.levelup.io;

import java.io.*;
import java.lang.invoke.WrongMethodTypeException;

/**
 * Created by java on 17.02.2017.
 */
public class Main {


    public static void main(String[] args)  {
//        OutputStream out = new FileOutputStream("file.txt");
//
//        out.write("Hello World!\r\n".getBytes());
//        out.write("Hello World!".getBytes());
//
//
//        out.close();

        String fileName = "input.txt";
        String fileData = redFromFile(fileName);

        System.out.println(fileData);
        writeToFile(fileData, "output.txt");
    }

    public static String redFromFile(String fileName)  {
        int data;
        StringBuilder result = new StringBuilder();
        try(InputStream input = new FileInputStream(fileName)) {

            while ((data = input.read())>= 0 ){
                result.append((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public  static  void  writeToFile(String data, String fileName) {

        try(Writer  out = new FileWriter(fileName)) {
            out.write(data.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
