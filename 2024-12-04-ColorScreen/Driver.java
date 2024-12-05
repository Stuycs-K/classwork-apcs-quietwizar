import java.util.Random;
public class Driver{
    public static int[] arrayMaker(){
        Random rand=new Random();
        int[] made=new int[]{rand.nextInt(99),rand.nextInt(99),rand.nextInt(99)};
        return made;
    }
    public static void topborder(int length, String character, int color){
        Text.color(color);
        for(int i=0;i<length;i++){
            System.out.print(character);
        }
    }
    public static void main(String[] args){
        topborder(80,"-",Text.RED);
        System.out.println(Text.RESET);
    }
}