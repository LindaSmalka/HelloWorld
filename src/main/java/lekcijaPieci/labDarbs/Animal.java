package lekcijaPieci.labDarbs;

public class Animal {

    int age;
    boolean canClimbTrees;

//    //ja šeit ieliek konstruktoru, tad tas jaizveio visās klasēs , kas manto
    //no Animal.
//
//    public Animal(int age, boolean canClimbTrees) {
//        this.age = age;
//        this.canClimbTrees = canClimbTrees;
//    }

    public void breathe () {
        System.out.println("I can breathe");
    }

    //override - ja izmanto to pašu, kas tiek jau izmantots Klasēs
    //*klases ņems no klases, ja nebūs definēts, tad no šejienes
    public void makeSound(){
        System.out.println("I am animal, i make generic sound");
    }
    public void eat () {
        System.out.println("I am eating .. nom nom nom");
    }




}
