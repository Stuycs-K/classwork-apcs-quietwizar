import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static boolean trichecker(int a, int b, int c){
    return((a+b)>c&&(b+c)>a&&(a+c)>b);
  }
  public static int countTrianglesA(String filename){
    int count=0;
    Scanner input=null;
    try{
      File file=new File (filename);
      input = new Scanner(file);
      while(input.hasNextLine()){
        String lines=input.nextLine();
        String[]linesparts=lines.split("\\s+");//Just learnt that this was whitespace
        if(linesparts.length==3){
          if(trichecker(Integer.parseInt(linesparts[0]),Integer.parseInt(linesparts[1]),Integer.parseInt(linesparts[2]))){
            count++;
          }
        }
      }
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
    }
    //googled finally because my code wasnt working
    finally{
      if(input!=null){
        input.close();
      }
    }
    return count;
  }
  public static int countTrianglesB(String filename){
    int count=0;
    Scanner input=null;
    try{
      File file=new File (filename);
      input = new Scanner(file);
      while(input.hasNextLine()){
        String lines1=input.nextLine();
        String lines2=input.nextLine();
        String lines3=input.nextLine();
        count+= countTrianglesA(lines1)+countTrianglesA(lines2)+countTrianglesA(lines3);
      }
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
    }
    //googled finally because my code wasnt working
    finally{
      if(input!=null){
        input.close();
      }
    } 
    return count;
  }
}
