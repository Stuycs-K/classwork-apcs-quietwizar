import java.util.Random;
public class Driver{
    public static void topborder(int length, String character, int color){
        Text.color(color);
        for(int i=0;i<length;i++){
            System.out.print(character);
        }
    }
    public static void main(String[] args){
        System.out.print(Text.HIDE_CURSOR);
        Text.go(1,0);
        topborder(80,"+",Text.RED);
        Text.go(30,0);
        topborder(80,"+",Text.RED);
        for(int i=2;i<30;i++){
            Text.go(i,0);
            System.out.print("+");
            Text.go(i,80);
            System.out.print("+");
        }
        Text.wait(40);
        Random rand=new Random();
        int[] made=new int[]{rand.nextInt(100),rand.nextInt(100),rand.nextInt(100)};
        int count=0;
        for(int j=30;j<80;j+=20){
            Text.go(2,j);
            if(made[count]<25){
                Text.color(Text.RED,Text.BRIGHT);
            }
            else if(made[count]>75){
                Text.color(Text.GREEN,Text.BRIGHT);
            }
            else{
                Text.color(Text.WHITE);
            }
            System.out.print(made[count]);
            count+=1;
        }
        Text.wait(40);
        Text.go(3,1)
        topborder(78,"H",Text.BLUE);

        System.out.println(Text.RESET);
    }
}