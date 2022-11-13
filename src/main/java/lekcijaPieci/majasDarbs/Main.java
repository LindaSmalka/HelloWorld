package lekcijaPieci.majasDarbs;

public class Main {

    public static void main(String[] args) {

        Cilindrs cilindrs = new Cilindrs (6.8,8.4);

        System.out.println("Cilindrs 1: ");
        cilindrs.printTilpums();
        cilindrs.printVirsma();




        System.out.println("\nCilindrs 2: ");
        cilindrs.setRadiuss(9.5);
        cilindrs.setAugstums(4.3);

        cilindrs.printTilpums();
        cilindrs.printVirsma();


    }
}
