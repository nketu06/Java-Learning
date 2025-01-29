package org.example.Files;

import java.io.*;

/**
 *  stream is sequance of data-> byte or unicode(character)
 */

public class Main {
    public static void main(String[] args) throws IOException {

        // file Writer

//        FileWriter fw = new FileWriter("Java.txt");
//        fw.write("Hello World");
//        fw.close();
//        System.out.println("file created");

        // printwriter
//        FileWriter fw = new FileWriter("printwriter.txt");
//        PrintWriter pw = new PrintWriter(fw);
//        pw.println("Hello World");
//        pw.close();
//        fw.close();

        // file reader
//        FileReader fileReader = new FileReader("java.txt");
//        int i=0;
//        while ((i=fileReader.read()) != -1) {
//            System.out.print((char)i);
//        }
//        fileReader.close();

//        buffer reader
//        FileReader fileReader = new FileReader("java.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        while (true) {
//            String line = bufferedReader.readLine();
//            if (line == null) break;
//            System.out.print(line);
//        }
//        fileReader.close();
//        bufferedReader.close();

//        // create new file
//        File file=new File("test.txt");
//        file.createNewFile();

//        FileInputStream fis = new FileInputStream("java.txt");
//        int read = fis.read();
//        while (read != -1) {
//            System.out.print((char) read+" ");
//            read = fis.read();
//        }
//
//        FileReader fileReader = new FileReader("java.txt");
//        int i=0;
//        while ((i=fileReader.read()) != -1) {
//            System.out.print((char)i);
//        }
//        fileReader.close();

        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write("Hello World");
        fileWriter.close();






    }
}
