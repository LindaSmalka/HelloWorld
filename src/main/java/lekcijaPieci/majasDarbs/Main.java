package lekcijaPieci.majasDarbs;

public class Main {

    public static void main(String[] args) {

        Cilindrs cilindrs = new Cilindrs(4,5);

        System.out.println("Cilindrs 1: ");
        cilindrs.printTilpums();
        cilindrs.printVirsma();




        System.out.println("\nCilindrs 2: ");
        cilindrs.setRadiuss(9);
        cilindrs.setAugstums(4);

        cilindrs.printTilpums();
        cilindrs.printVirsma();


    }
}
