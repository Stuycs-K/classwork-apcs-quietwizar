import java.util.Scanner;
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
    breaker=true;
    while(player.getHP()>0 &&  enemy.getHP()>0 && breaker){
      System.out.println(player.getName()+ ","+player.getHP()+"/"+player.getmaxHP()" HP,"+player.getSpecial()+"/"+player.getSpecialMax()+" "+player.getSpecialName());
      System.out.println(enemy.getName()+ ","+enemy.getHP()+"/"+enemy.getmaxHP()" HP,"+enemy.getSpecial()+"/"+enemy.getSpecialMax()+" "+enemy.getSpecialName());
      System.out.println("Type: (a) for attack, (sp) for special, (su) for support, and quit to quit")
      String newinput=userInput.nextLine();
      if(newinput.equals("quit")){
        breaker=false;
      }
      if(newinput)
    }
  }
}
