package lekcijaPieci.labDarbs;

public class Main {

    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog(); ///var likt iekavās age jo Dog i konstruktors
        Cow govs = new Cow();


        muris.age = 3;
        muris.canClimbTrees = true;

        reksis.age = 6;
        reksis.canClimbTrees = false;

        muris.breathe();
        reksis.breathe();
        govs.breathe();


        muris.makeSound();
        reksis.makeSound();
        govs.makeSound();

        muris.eat();
        reksis.eat();

        muris.sharpenClaws();
        reksis.growl();

        muris.printClimbing();



        House house = new House(1,2,3,"Brivibas",
                2.5,100000L,true);


        house.printHouse();
        house.setKadastralaVertiba(300000);
        house.setAdrese("Tallinas iela");

        System.out.println("Mājas adrese ir: " + house.getAdrese());



        Person cilveks1 = new Person("Linda","Smalkā");
        System.out.println(cilveks1.getPersonsKods());


        Calculator kalkulators = new Calculator();
        System.out.println(Calculator.add(5,10));
        System.out.println(Calculator.add(5.3,10.8));
        System.out.println(Calculator.add(3,5,7));





    }
}
