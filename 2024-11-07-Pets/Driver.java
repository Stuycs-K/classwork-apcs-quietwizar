/*When I changed getName() for birds, the bird object went from "the ugly duckling" to "The Mighty the ugly duckling."
However, this only changed it for birds, as the dog still generated "Good Dog"
Effectivly, this tells us because Bird is a subclass of dogs, Birds inherits everything animals can but when you override birds, it has its own unique action */
/*All of them worked except bird B2, where bird was creating a new animal
This makes sense because bird is a subclass of animal and can do everything that animal can based on the previous answer
However, bird cannot create a new animal because an animal is not necessarly a bird (bird is a animal, not the other way around) and thus cannot be assigned*/
public class Driver{
    public static void main(String[] args){
        Animal dog= new Animal("woof", 10, "Good Dog");
        dog.speak();
        Bird duck= new Bird ("tweet", 2, "the ugly duckling", 5.5, "white");
        duck.speak();
        Animal a1 = new Animal("bzz",1,"Nice Bee");
        Bird b1 = new Bird("Nevermore",20,"Raven",6.0,"black");
        //Bird b2 = new Animal("Caw",30,"Eagle");
        Animal a2 = new Bird("meow",5,"Kitty",4.4,"Orange");
        a1.speak();
        b1.speak();
        a2.speak();
    }
}