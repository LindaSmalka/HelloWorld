package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        String vards = "Linda";
        House majaViens = new House(2,10,10,"Brivibas 1", 3.4, 10000, true );
//
//        ja izmanto konstruktoru, tad var ievadit visas vertibas uzreiz augstak
//        majaViens.adrese = "Miera iela 94";
//        majaViens.durvjuSkaits = 4;
//        majaViens.griestuAugstums = 3.6;
//        majaViens.kadastralaVertiba = 150000;
//        majaViens.loguSkaits = 10;
//        majaViens.stavuDaudzums = 3;
//        majaViens.vaiPrivatipasums = true;
//        majaViens.printHouse();


        House majaDivi = new House(2,10,10,"Brivibas 1", 3.4, 10000, true );
//        majaDivi.adrese = "Rīgas iela 63";
//        majaDivi.durvjuSkaits = 8;
//        majaDivi.griestuAugstums = 4.2;
//        majaDivi.kadastralaVertiba = 200000;
//        majaDivi.loguSkaits = 15;
//        majaDivi.stavuDaudzums = 2;
//        majaDivi.vaiPrivatipasums = true;
//        majaDivi.printHouse();

        System.out.println(majaViens.adrese);
        System.out.println(majaDivi.adrese);

        //piemērs
        char[] mansVards = {'L', 'I', 'N', 'D', 'A'};
        int i = 0;
        for (char burts : mansVards) {
            System.out.println("Cikls nr:" + i);
            System.out.println(burts);
            i++;
        }

        House[] majas = {majaViens, majaDivi};
        for (House maja : majas) {                    //maja - raksta ko grib, kaut vai xx
            System.out.println(maja.adrese);
            System.out.println(maja.durvjuSkaits);
            System.out.println(maja.loguSkaits);
            System.out.println(maja.kadastralaVertiba);
            System.out.println(maja.vaiPrivatipasums);
            System.out.println(maja.griestuAugstums);
            System.out.println(maja.stavuDaudzums);
        }

        House[] majasV = {majaViens, majaDivi};
        for (House maja : majasV) {
            maja.printHouse();
        }


        //metode
        Velosipeds mansVelo = new Velosipeds();
        System.out.println(mansVelo.atrums);
        mansVelo.printAtrums();


        mansVelo.atrums = 2;
        Velosipeds mansVelo2 = new Velosipeds();
        mansVelo2.printAtrums();


        Velosipeds ritenBraucejsViens = new Velosipeds();
        Velosipeds ritenBraucejsDivi = new Velosipeds();

        Velosipeds ritenisX = new Velosipeds("ZZK", 21, 100);

        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDivi.atrums = 30;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenBraucejsTris = new Velosipeds();
        System.out.println("Izgatavošanas darums" + ritenBraucejsTris.izgatavosanasDatums);

        ritenBraucejsTris.zimols = "ZZK";
        System.out.println(ritenBraucejsTris.zimols);
        ritenBraucejsTris.printAtrums();

        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();

        ritenBraucejsTris.printAtrums();

        System.out.println("Priekšā izskrien kaķis");
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();

        ritenBraucejsTris.printAtrums();



        //par priedi
        Koks priede = new Koks();
        priede.printKoksInfo();


        Rinkis rinkisViens = new Rinkis(5);    //iekavās liek, ja ir konstruktora Rinkis klasē, ja nē, tad definē
//        rinkisViens.r=5;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatLinijasGarumu());


        Rinkis rinkisDivi = new Rinkis(10);    //iekavās liek, ja ir konstruktora Rinkis klasē, ja nē, tad definē
//        rinkisDivi.r=10;
        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.rekinatLinijasGarumu());





    }
}
