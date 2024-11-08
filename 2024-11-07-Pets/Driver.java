public class Driver{
    public static void main(String[] args){
        Animal dog= new Animal("woof", 10, "Good Dog");
        dog.speak();
        Bird duck= new Bird ("tweet", 2, "the ugly duckling", 12.5, "white");
        duck.speak();
    }
}