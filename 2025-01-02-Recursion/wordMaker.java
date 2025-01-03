public class wordMaker{
  public static void makeWords(int remainingLetters,String result, String alphabet){
    if(remainingLetters>0){
      makeWords(remainingLetters-1,result+=alphabet.substring(1,2), alphabet);
    }
    else{
      print result;
    }
  }
  public static void main(Strings[] args){
    makeWords(3,"","abc")
  }
}
