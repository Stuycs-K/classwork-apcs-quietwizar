import java.util.Scanner;
import java.util.Random;
class Game {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Welcome to D&D 0.5. What is your name?");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Name is: " + userName);
    Adventurer player=new CodeWarrior(userName, 100);
    Adventurer enemy=new Berserker("Neighborhood Berserker", 100);
    boolean breaker=true;
    while(player.getHP()>0 &&  enemy.getHP()>0 && breaker){
      System.out.println(player.getName()+ ","+player.getHP()+"/"+player.getmaxHP()+" HP,"+player.getSpecial()+"/"+player.getSpecialMax()+" " + player.getSpecialName());
      System.out.println(enemy.getName()+ ","+enemy.getHP()+"/"+enemy.getmaxHP()+" HP,"+enemy.getSpecial()+"/"+enemy.getSpecialMax()+" "+enemy.getSpecialName());
      System.out.println("Type: (a) for attack, (sp) for special, (su) for support, and quit to quit");
      String newinput=userInput.nextLine();
      if(newinput.equals("quit")){
        breaker=false;
      }
      else if(newinput.equals("a")){
        System.out.println(player.attack(enemy));
      }
      else if(newinput.equals("sp")){
        System.out.println(player.specialAttack(enemy));
      }
      else if(newinput.equals("su")){
        System.out.println(player.support(player));
      }
      else{
        System.out.println("You failed to do anything!");
      }
      if(breaker && enemy.getHP()>0){
        Random rand=new Random();
        int randInt=rand.nextInt(3);
        int mod=randInt%3;
        if(mod==0){
          System.out.println(enemy.attack(player));
        }
        if(mod==1){
          System.out.println(enemy.specialAttack(player));
        }
        if(mod==2){
          System.out.println(enemy.support(enemy));
        }
      }
    }
    if(player.getHP()<=0){
      System.out.println("You Lose! The Neighborhood Berserker has Triumphed");
    }
    if(enemy.getHP()<=0){
      System.out.println("You Win! The Berserker is vanquished");
    }
    userInput.close();

  }
}
