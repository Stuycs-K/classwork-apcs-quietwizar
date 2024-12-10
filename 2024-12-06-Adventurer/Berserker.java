import java.util.Random;
public class Berserker extends Adventurer{
  private int special;
  private int specialMax=4;

  public Berserker(String name){
    this(name, 10);
  }

  public Berserker(String name, int hp){
      super(name, hp);
  }

  public String getSpecialName(){
    return "Rage";
  }

  public int getSpecial(){
    return special;
  }
  public void setSpecial(int n){
    special=n;
  }
  public int getSpecialMax(){
    return specialMax;
  }
  
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    Random rand= new Random();
    int dmg=rand.nextInt(7)+13;
    other.applyDamage(dmg);
    super.restoreSpecial(1);
    return("The Berserker "+this+" hit "+other.getName()+" for "+dmg+" dmg");
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.setHP(other.getHP()+10);
    if(other.getHP()>other.getmaxHP()){
      other.setHP(other.getmaxHP());
    }
    return("Berserker "+this+" healed "+ other.getName()+ " for 10 hp");
  }

  //heall or buff self
  public String support(){
    this.setHP(this.getHP()+10);
    if(this.getHP()>this.getmaxHP()){
      this.setHP(this.getmaxHP());
    }
    return("Berserker "+this+" healed 10 hp");
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if(this.getSpecial()<4){
      return "Not enough power!";
    }
    Random rand= new Random();
    int dmg=30+rand.nextInt(10);
    other.applyDamage(dmg);
    this.setSpecial(0);
    return("Berserker "+this+" raged and did "+dmg+" dmg to " + other.getName());
  }
  public void applyDamage(int amount){
    super.applyDamage(amount);
  }

  //toString method
  public String toString(){
    return this.getName();
  }

}
