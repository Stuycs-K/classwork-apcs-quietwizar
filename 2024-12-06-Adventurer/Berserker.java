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

  }
  public abstract int getSpecialMax();

}
