import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Test{
  public static int[] pathing(String filename){
  Scanner input=null;
  int Nord=0;
  int Sud=0;
  int Ost=0;
  int West=0;
  int[] changer={0,0,0,0,0};//North East South West
  ArrayList<String> trackkeeper=new ArrayList<String>();
  try{
    File file=new File (filename);
    input = new Scanner(file);
    int holder=0;
    int remember=0;
    int holder2=0;
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
      String location=(changer[0]-changer[2])+","+(changer[1]-changer[3]);
      for(int j=0; j<trackkeeper.size();j++){
        if(trackkeeper.get(j).equals(location)){
          changer[4]=Math.abs(changer[0]-changer[2])+Math.abs(changer[1]-changer[3]);
        }
      }
      
    }

      }catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return null; 
      }
      return changer;
  }
  }

