package lekcijaPieci.labDarbs;

public class Dog extends Animal{


    private int legCount = 4;

    public void makeSound(){
        System.out.println("VAU VAU VAU");
    }


    public int getLegCount(){
        return this.legCount;
    }

    private void test123(){
        System.out.println("PRIVATE METHOD");
    }

    public void growl () {
        System.out.println("RRRRRRRRRRR");
    }

//
//     no šī vairs nav jēga jo Animal klasē tika ielikts Konstruktors par age
//    public Dog(int age) {
//        super.age = age;    ///this.age
//    }
}
