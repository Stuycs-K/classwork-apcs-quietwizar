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
  public static ArrayList<Integer> day2(String filename){
    Scanner input=null;
    ArrayList<String> passkey= new ArrayList<String>(4);
    ArrayList<Integer> password=new ArrayList<Integer>(5);
    int[][] code=  {{1,2,3},{4,5,6},{7,8,9}};
    try{
      File file=new File(filename);
      input=new Scanner(file);
      while(input.hasNextLine()){
        String lines=input.nextLine();
        passkey.add(lines);
      }
      //System.out.println(passkey);
      for(int i=0; i<passkey.size();i++){
        int[] tracker={1,1};
        for(int j=0; j<passkey.get(i).length();j++){
          if(passkey.get(i).charAt(j)=='U'&&tracker[0]>0){
            tracker[0]-=1;
          }
          if(passkey.get(i).charAt(j)=='L'&&tracker[1]>0){
            tracker[1]-=1;
          }
          if(passkey.get(i).charAt(j)=='R'&&tracker[1]<2){
            tracker[1]+=1;
          }
          if(passkey.get(i).charAt(j)=='D'&&tracker[0]<2){
            tracker[0]+=1;
          }
        }
        password.add(code[tracker[0]][tracker[1]]);
      }
    }catch(FileNotFoundException e){
      return null;
    }
    return password;
  }
  public static String day6(String filename){
  Scanner input=null;
  String answer="";
  try{
    File file=new File(filename);
    input=new Scanner(file);
    ArrayList<String> line=new ArrayList<String>();
    while(input.hasNextLine()){
      String lines=input.nextLine();
      line.add(lines);
    }
    int linelength=line.get(0).length();
    for(int i=0; i<linelength;i++){
      int[] frq=new int[26];
      for(int j=0; j<line.size();j++){
        frq[(int)(line.get(j).charAt(i)-'a')]+=1;
      }
      int max=(int)Math.pow(10,10);//change to zero normally
      int maxindex=0;
      for(int k=0; k<frq.length;k++){
        if(max>frq[k]&&frq[k]>0){//get rid of the add and change max to < to fix it
          max=frq[k];
          maxindex=k;
        }
      }
      answer=answer+(char)(maxindex +'a');
    }

  }catch(FileNotFoundException e){
    return null;
  }
  return answer;
  }
}
