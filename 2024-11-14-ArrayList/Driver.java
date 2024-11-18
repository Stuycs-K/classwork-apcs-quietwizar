public class Driver{
  public static void main(String[] args){
	//System.out.println(ArrayListPractice.createRandomArray(20));
	//ArrayListPractice.replaceEmpty(ArrayListPractice.createRandomArray(50));
    ArrayList<String> test1= new ArrayListPractice(createRandomArray(20));
    ArrayList<String> test2= new ArrayListPractice(createRandomArray(20));
    ArrayList<String> test3= new ArrayListPractice(createRandomArray(20));
    ArrayList<String> test4= new ArrayListPractice(createRandomArray(20));
    System.out.println(test1);
    System.out.println(makeReversedList(test1));
    
  }
}
