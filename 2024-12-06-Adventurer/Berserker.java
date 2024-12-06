import java.util.Random;
public abstract class Berserker extends Adventurer{
  private String name;
  private int HP,maxHP;

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
    other.applyDamage(15);
    this.setSpecial(this.getspecial()+1)
    return("The Berserker "+this.getName()+" hit "+other.getName()+" for 15 dmg");
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.setHP(other.getHP()+10);
    return("Berserker "+this.getName()+" healed "+ other.getName()+ " for 10 hp");
  }

  //heall or buff self
  public abstract support(){
    this.setHP(this.getHP()+10);
    return(return("Berserker "+this.getName()+" healed 10 hp");
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    other.applyDamage(40);
    this.setSpecial(0);
    return("Berserker "+this.getName()+" raged and did 40 dmg to " + other.getName());
  }
  public void applyDamage(int amount){
    this.HP -= amount;
  }

  //toString method
  public String toString(){
    return this.getName();
  }

  //Get Methods
  public String getName(){
    return name;
  }

  public int getHP(){
      return HP;
  }

  public int getmaxHP(){
      return maxHP;
  }
  public void setmaxHP(int newMax){
        maxHP = newMax;
  }

  //Set Methods
  public void setHP(int health){
      this.HP = health;
  }

  public void setName(String s){
      this.name = s;
  }

}
