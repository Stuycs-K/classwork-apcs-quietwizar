public class Driver{
  public static void main(String[] args){
    Adventurer p1= new Berserker("Clifford",100);
    Adventurer p2= new Berserker("Big Red Dog", 100);
    System.out.println(p1.getHP());
    System.out.println(p1.getName());
    System.out.println(p1.attack(p2));
    System.out.println(p2.specialAttack(p1));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());
    System.out.println(p1.support(p2));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());
  }
}
