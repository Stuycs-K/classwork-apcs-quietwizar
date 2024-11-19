import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Test{
  public static int[] pathing(String filename){
  Scanner input=null;
  int Nord=0;
  int Sud=0;
  int Ost=0;
  int West=0;
  int[] changer={0,0,0,0};//North South East West
  try{
    File file=new File (filename);
    input = new Scanner(file);
    int holder=0;
    while(input.hasNext()){
      String lines=input.next();
      if(lines.charAt(0)=='R'){
        holder-=1;
      }
      else{
        holder+=1;
      }
      holder=(holder+4)%4;
      changer[holder]+=Integer.parseInt(lines.substring(1,lines.length()-1));
      
    }

      }catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return null; 
      }
      return changer;
  }
  }

