import java.io.*;

public class JavaLessonSix {

    public static void main(String[] args){
       try {
           getAFile("./somestuff.txt");
       }
       catch (IOException e){

           System.out.println("An IO Error Occurred");
       }


    }

   public static void getAFile(String fileName) throws IOException, FileNotFoundException{
        FileInputStream file = new FileInputStream(fileName);


   }



}