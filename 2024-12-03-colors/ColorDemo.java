import java.util.Random;
public class ColorDemo{
  public static void color(int r, int g, int b){
    System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");  
  }
  public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
    }
  }
  public static final String RESET="\u001b[0m";
  public static void main(String[] args){
    Random rand=new Random();
    int randInt=rand.nextInt(257);
    for(int i=0;i<257;i++){
      int randInt1=rand.nextInt(257);
      int randInt2=rand.nextInt(257);
      int randInt3=rand.nextInt(257);
      color(randInt1,randInt2,randInt3);
      if(i%16==0&&i!=0){
        int randInt4=rand.nextInt(9);
        randInt4+=30;
        System.out.print("\u001b[0"+randInt4+"m");
        System.out.print("A 16 reached!");
      }
      sleep(10);
    }
    System.out.print("\u001b[?25l");
    System.out.println();
    System.out.print(RESET);
  }
}

