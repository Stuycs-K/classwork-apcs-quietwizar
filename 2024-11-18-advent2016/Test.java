class Test{
  public static void pathing(String filename){
  Scanner input=null;
  int Nord=0;
  int Sud=0;
  int Ost=0;
  int West=0;
  try{
    File file=new File (filename);
    input = new Scanner(file);
    ArrayList<String> changer=["Nord","Sud","Ost","West"];
    int holder=0;
    while(input.hasNext()){
      String lines=input.next();
      if(x.charAt(0)=='R'){
        holder-=1;
        if (holder<0){
          holder=4
        }
      }
      else{
        holder+=1;
        if(holder>4){
          holder=0;
        }
      }
      
    }

      }catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return; //you can return from a void function just don't put a value.
      }
  }
  }
  public static void main(String[] args)
}
