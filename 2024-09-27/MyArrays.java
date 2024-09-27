ublic class MyArrays{
  public static String arrayToString(int[] nums){
    String arr="[";
    arr+=nums[0];
    for(int i=1; i<nums.length; i++){
    arr+=", "+nums[i];
    }
    arr+="]";
    return arr;
  }
  public static void main(String[] args){
    //test cases
    int[] test1 = new int[]{};
    int[] test2 = new int[]{0, 4, 23,19, 23};
    int[] test3 = new int[]{1};
    int[] test4= new int[]{1, 12};
    System.out.println("Original: [], Actual: "+ arrayToString(test1));
    System.out.println("Original: [0, 4, 23, 19, 23], Actual: "+ arrayToString(test2));
    System.out.println("Original: [1], Actual: "+ arrayToString(test3));
    System.out.println("Original: [1,12], Actual: "+ arrayToString(test4));
  }
}
