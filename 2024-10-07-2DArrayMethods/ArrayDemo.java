import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    int[] test1 = new int[]{};
    int[] test2 = new int[]{0, 4, 23,19, 23};
    int[] test3 = new int[]{1};
    int[] test4= new int[]{1, 12};
    int[] test5= new int[]{2, 3, 4, 9};
    int[][] test6= new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};
    int[][] emptytest=new int[][]{{}};
    int[][] weirdtest=new int[][]{{3,7,4}, {2,1}, {}, {232}};
    int[][] test7=new int[][]{{1,2,3},{4,5,6}};
    int[][] test8 = new int[][]{{},{-2,-4,-6},{4,-5},{1,4,7,-8}};
    int[][] test9=new int[][]{{},{3,7,-4,6},{12,21},{201,22,-100}};


    System.out.println("Original: [], Actual: "+ arrToString(test1));
    System.out.println("Original: [0, 4, 23, 19, 23], Actual: "+ arrToString(test2));
    System.out.println("Original: [1], Actual: "+ arrToString(test3));
    System.out.println("Original: [1,12], Actual: "+ arrToString(test4));

    System.out.println("[2, 3, 4, 9] vs" + arrToString(test5));
    System.out.println("Original: [[2, 3, 4], [5, 6, 7], [2, 4, 9]], new: " + arrToString(test6));
    System.out.println("Array sum of [[2, 3, 4], [5, 6, 7], [2, 4, 9]]: "+ arr2DSum(test6));
    System.out.println("Array sum of [[]]: "+ arr2DSum(emptytest));
    System.out.println("Array sum of [[3,7,4], [2,1], [], [232]]: "+ arr2DSum(weirdtest));

    System.out.println("Swapped of [[2,3,4],[5,6,7][2,4,9]]: "+ arrToString(swapRC(test6)));
    System.out.println("Swapped of [[1,2,3],[4,5,6]]: "+ arrToString(swapRC(test7)));


    replaceNegative(test8);
    String CopyTest=arrToString(copy(test9));
    System.out.println("Origional: {{},{3,7,-4,6},{12,21},{201,22,-100}}, copy= " + CopyTest + "and the copied string: " + arrToString(test9));
    test9[1][2]=0;
    System.out.println("Check copy chage: " + arrToString(test9) + " vs " + CopyTest);

    System.out.println("Table of [[2,3,4],[5,6,7][2,4,9]]: "+ htmlTable(test6));
    System.out.println("Table of [[],[3,7,-4,6],[12,21],[201,22,-100]]: "+ htmlTable(test9));
    System.out.println("Table of [[3,7,4], [2,1], [], [232]]: "+ htmlTable(weirdtest));
    

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] nums){
    String arr="[";
    if(nums.length==0){
      return "[]";
    }
    arr+=nums[0];
    for(int i=1; i<nums.length; i++){
    arr+=", "+nums[i];
    }
    arr+="]";
    return arr;
  }


  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String arr="[";
    for (int i = 0; i<ary.length; i++){
      arr+=arrToString(ary[i]);
      if(i<ary.length-1){
        arr+=", ";
      }
    }
    arr+="]";
    return arr;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int zerocount=0;
    for(int i=0; i<nums.length; i++){
      for(int j=0; j<nums[i].length; j++){
        if(nums[i][j]==0){
          zerocount++;
        }
      }
    }
    return zerocount;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][]nums){
     int sum=0;
     for(int i=0; i<nums.length; i++){
       for(int j=0; j<nums[i].length; j++){
         sum+=nums[i][j];
       }
     }
     return sum;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i<vals.length; i++){
      for(int j = 0; j<vals[i].length;j++){
        if(vals[i][j] < 0){
          if(i==j){
            vals[i][j] = 1;
          }
          else{
            vals[i][j] = 0;
          }
        }
      }
    }
    System.out.println(Arrays.toString(vals));
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] returnCopy(int[]ary){
    int[] arr=new int[ary.length];
    for(int i=0; i<ary.length; i++){
      arr[i]=ary[i];
    }
    return arr;
  }

  public static int[][] copy(int[][] nums){
    int[][] copyarray=new int[nums.length][];
    for (int i=0; i<nums.length; i++){
      copyarray[i]=returnCopy(nums[i]);
    }

    return copyarray;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][]swappedArray=new int[nums[0].length][nums.length];
    for(int i=0; i<nums.length; i++){
      for(int j=0; j<nums[0].length; j++){
        swappedArray[j][i]=nums[i][j];
      }
    }
    return swappedArray;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String ToHtml="<table>";
    for(int i=0; i<nums.length; i++){
      ToHtml+="<tr>";
      for(int j=0; j<nums[i].length; j++){
        ToHtml+="<td>"+nums[i][j]+"</td>";
      }
      ToHtml+="</tr>";
    }
    ToHtml+="</table>";
    return ToHtml;
  }
}
