package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LaboratorijasDarbsDivi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Salīdzināšanas izteiksmes

        //lielāks
        int x=3;
        int y=2;
        System.out.println(x>y);
        y=3;
        System.out.println(x>y);
        System.out.println(3>6);

        //mazāks
        x=5;
        y=3;
        System.out.println(x<y);
        y=10;
        System.out.println(x<y);


        //vienāds
        System.out.println(x==y);
        System.out.println(5==5);
        System.out.println(true==true);
        System.out.println(true==false);

        //ja grib salidzinat String
        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));


        //nav vienāds
        System.out.println(x!=y);
        System.out.println(!luksaforaKrasa.equals("red"));


        //mazāks vienāds
        x=5;
        y=5;
        System.out.println(x<=y);

        x=4;
        System.out.println(x<=y);

        x=7;
        System.out.println(x<=y);

        //lielāks vienāds

        int vecums = 21;
        System.out.println("Vai cilvēks var balsot?" + (vecums>18));
        System.out.println("Vai cilvēks var balsot?" + (vecums>=18));

        int vecums1 = 18;
        System.out.println("Vai cilvēks var balsot?" + (vecums1>18));
        System.out.println("Vai cilvēks var balsot?" + (vecums1>=18));


        //loģiskie operatori
        int z = 10;

        System.out.println(x<6 && z>y); //ja viens ir false, tad viss ir false - loģiskais UN

        System.out.println(x<6 || z>y); // pietiek, ja viens izpildās - loģiskais VAI


        //If-then
        //ja ir yes, tad izpildās, tas, ka ir {}
        //ja ir no, tad izlaiž un iet tālāk

        int age = 18;
        System.out.println("Paskaties cilvēka pasē");
        if (age>=18){
            System.out.println("Drīkst balsot");
        }

        System.out.println("Tālākas darbības");


        //pārbaudīt vai skaitlis ir negatīvs, ja ir, izvadīt uz ekrāns tesktu - NEGATĪVS

        int skaitlis = -5;
        if (skaitlis<0){
            System.out.println("Negatīvs");
        }


        //IF - ELSE


        if (skaitlis>0){
            System.out.println("Skaitlis pozitīvs");
        }else{
            System.out.println("Skaitlis negatīvs vai nulle");
        }


        String luksaforaKrāsa = "green";
        if (luksaforaKrāsa.equals("green")){
            System.out.println("EJ");
        }else {
            System.out.println("STĀVI");
        }



        int age2 = 18;
        boolean hasVoted = false;

        System.out.println("Paskaties cilvēka pasē");
        if (age2 >= 18 && hasVoted==false) {
            System.out.println("Drīkst balsot");
        } else {
            System.out.println("Nedrīkst balsot");
        }

        //es aizeju un nobalsoju
        hasVoted = true;

        if (age2 >= 18 && hasVoted==false) {
            System.out.println("Drīkst balsot");
        } else {
            System.out.println("Nedrīkst balsot");
        }

        //IF - else if

        System.out.println("Ievadīsim skaitli i");
        int i = 17;
        if (i == 10){
            System.out.println("Skaitlis ir 10");
        } else if (i == 15) {
            System.out.println("Skaitlis ir 15");
        }else if (i == 20){
            System.out.println("Skaitlis ir 20");
        }else{
            System.out.println("Skaitlis nav neviens no vajadzīgajiem skaitļiem");
        }

        //zaļa gaisma / sarkana gaisma / nedeg neviena gaisma

        String luksafors = "zaļš";
        if (luksafors.equals("sarkans")){
            System.out.println("STĀVĒT");
        }else if (luksafors.equals("zaļš")){
            System.out.println("IET");
        }else {
            System.out.println("Nedeg neviena gaisma");
        }

        //SWITCH
        int monthNumber = 3;
        switch(monthNumber){
            case 1: System.out.println("Janvāris");
            break; //ja nav ielikts brake, sistēma iet tālāk pat ja izpildās
            case 2: System.out.println("Februāris");
            break;
            case 3: System.out.println("Marts");
            break;
            case 4: System.out.println("Aprīlis");
            break;
            default: //kas notiek ja neviens neizpildās
                System.out.println("Mēnesis nav minēts");
        }


        String animal = "DOG";
        String result;
        switch (animal){
            case "DOG":
                result = "Domestic animal";
                break;
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild animal";
            default:
                result = "Unknown animal";
        }
        System.out.println("This animal is: " + result);



        //noteikt vai ievadītais skaitlis ir pāra vai nepāra skaitlis - ja ir ieslēgts scanner
//        int number = scanner.nextInt();
        //te uzrakstīt kodu, kurš izvada vai skaitlis ir para vai nepara
        int number = 10; //ja nav scanner
        if (number % 2 == 0) {
            System.out.println(number + " ir pāra skaitlis");
        } else {
            System.out.println(number + " ir nepāra skaitlis");
        }


        System.out.println("Ievadi skaitli g");
        int g = scanner.nextInt();
        if (g<0) {
            System.out.println("Skaitlis ir negatīvs");
        }else if (g>0) {
            System.out.println("Skaitlis ir pozitīvs");
        }else if (g>=0) {
            System.out.println("Skaitlis ir nulle");
        }








        Scanner scanner1 = new Scanner(System.in);


        System.out.println("Hello Lekcija 2");
        int gadi;
        System.out.println("Kā tevi sauc?");
        String name = scanner1.nextLine();
        System.out.println("Labdien, " + name + " Esi sveicināta manā programmā");

        System.out.println("Ievadi cilveka vecumu...");
        gadi = scanner1.nextInt();

        if (gadi>=18){
            System.out.println("Cilvēks drīkst balsot");
        }

        System.out.println("Programmas turpinājums");

        System.out.println("Ievadi skaitli a");
        int a = scanner.nextInt();
        System.out.println("Ievadi skaitli b");
        int b = scanner.nextInt();
        int summa = a + b;
        System.out.println("Skaitla " + a + " un Skaitla " + b + " Summa ir " + summa);


    }
}
