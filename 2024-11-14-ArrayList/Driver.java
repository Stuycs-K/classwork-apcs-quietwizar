import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
	//System.out.println(ArrayListPractice.createRandomArray(20));
	//ArrayListPractice.replaceEmpty(ArrayListPractice.createRandomArray(50));
    ArrayList<String> test1= ArrayListPractice.createRandomArray(20);
    ArrayList<String> test2= ArrayListPractice.createRandomArray(200000);
    ArrayList<String> test3= ArrayListPractice.createRandomArray(10);
    ArrayList<String> test5= ArrayListPractice.createRandomArray(12);
    ArrayList<String> test4= ArrayListPractice.createRandomArray(200000);
    //System.out.println(test1);
    //System.out.println(ArrayListPractice.makeReversedList(test1));
    //System.out.println(ArrayListPractice.makeReversedList(test2));
    //System.out.println(test3);
    //System.out.println(test5);
    //System.out.println(ArrayListPractice.mixLists(test3, test5));
    System.out.println(ArrayListPractice.mixLists(test5,test4));
    
  }
}
