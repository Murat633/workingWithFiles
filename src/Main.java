import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        writeFile();
        readFile();
    }

    public static void createFile(){
        try{
            File file = new File("C:\\Java Demos\\files\\students.das");
            if(file.createNewFile()){
                System.out.println("Dosya Üretildi");
            }else{
                System.out.println("Dosya Zaten Var");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void getFileInfo(){
        try {
            File file = new File("C:\\Java Demos\\files\\students.das");
            if(file.exists()){
                System.out.println("Dosya Adı " + file.getName());
                System.out.println("Dosya Yolu " + file.getPath());
                System.out.println("Dosya Yolu " + file.getAbsolutePath());
                System.out.println("Dosya Yazıla Bilir mi " + file.canWrite());
                System.out.println("Dosya Okuna Bilir mi " + file.canRead());
                System.out.println("Dosya boyutu (byte) " + file.length());

            }
        }catch (Exception e){

        }
    }
    public static void readFile(){
        File file = new File("C:\\Java Demos\\files\\students.das");
       try {
           Scanner reader = new Scanner(file);
           while(reader.hasNextLine()){
               String line = reader.nextLine();
               System.out.println(line);
           }
           reader.close();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Java Demos\\files\\students.das",true));
            writer.newLine();
            writer.write("Murat");
            System.out.println("Dosyaya Yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}