package ioStream;

import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
//        Box box = new Box();
//        box.setHeight(30);
//        box.setWidth(60);
//        try{
//            FileOutputStream fs = new FileOutputStream("foo.txt");
//            ObjectOutputStream os = new ObjectOutputStream(fs);
//            os.writeObject(box);
//            os.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String toTest = "what is bule + yellow?/green";
        String[] result = toTest.split("/");
        for (String token : result) {
            System.out.println(token);
        }
    }
}
