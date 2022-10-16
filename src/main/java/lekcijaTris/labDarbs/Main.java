package lekcijaTris.labDarbs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sākās programma");
        metodeDivi("Kate", "Kalniņa", "Saulkrasti", 28);
        metodeDivi("Jānis", "Bērziņš", "Liepāja", 55);
        metodeDivi("Mārcis", "Smalkais", "Valmiera", 30);
        metodeViens();
        printNewLine();
        metodeViens();
        System.out.println("Beidzās programma");
        int laukums = aprekinatTaisnsturaLaukumu(3, 4);
        System.out.println("Taisnstūra laukums ir: " + laukums);
        System.out.println(average(3.5, 11.5,  9.2));

        macamiesMasivus();

        whileCikls();

        printUzdevums();

        //nodefinēt savu vārdu kā masīvu ar burtiem (char)
        // izmantojot foreach ciklu, izvadīt savu vārdu vienā rindā uz ekrāna

        char [] vards = {'L', 'I', 'N', 'D', 'A'};
        for (char burts:vards){
            System.out.print(burts);
        }


        Scanner ievade = new Scanner(System.in);
        
//        System.out.println("Ievadi skaitli...");
//        int number = ievade.nextInt();
//        int summa = 0;
//        while (number > 0) {
//            summa = summa + number;
//            System.out.println("Ievadi skaitli...");
//            number = ievade.nextInt();
//        }
//        System.out.println("summa ir:" + summa);

        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int m = 0;
        while(m < kartis.length){
            System.out.println(kartis[m]);
            m++;
        }



        //ciematā ir māju numuri no 1- 50
        // grib pirkt māju, kur nedalās ar 3 vai 5
        //cik mājas der

        int count = 0;
        for (int j = 1; j <= 50 ; j++) {
            if(j%3==0 || j%5==0){
                System.out.println("Šie numuri neder" + j);
            }else {
            count++;
        }
    }
        System.out.println("Der " + count + "Māju numuri");

    }

    //uzdevums - izprintēt visus skaitlus no menesa tēriņi masīva uz ekrāna

    public static void printUzdevums () {
        int[] menesaTerini = {100, 40, 23, -44, 55, 200};
        System.out.println(menesaTerini[0]);
        System.out.println(menesaTerini[1]);
        System.out.println(menesaTerini[2]);
        System.out.println(menesaTerini[3]);
        System.out.println(menesaTerini[4]);
        System.out.println(menesaTerini[5]);

    }


        public static void whileCikls () {
        int x = 5;
        while (x > 0) {
            System.out.println("x nav nulle, X = " + x);
            x = x-1; //x--  pamazinam par 1 - tas pats kas x-1
    }

        int[] terini = {100, 40, 23, -44, 55, 200};
        int s = 0;
        while (s < 6) {
                System.out.println(terini[s]);
                s++;
            }


        int i = 10;
        while (i<50) {
            System.out.println("I ir " + i);
            i = i+1; //i++  palielina par 1 - tas pats ka i+1

        }

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};

        System.out.println("Kods sākās");
        int z = 0;
        while (z<4) {
            System.out.println(cars[z]);
            z = z + 1;

        }
        System.out.println("Kods turpinās");


            String[] cars1 = {"Volvo", "BMW", "Nissan", "Mercedes","Audi"};

            System.out.println("kods sākās");
            int b = 0;
            while (b < cars1.length) {
                System.out.println(cars1[b]);
                b = b + 1;
            }
            System.out.println("kods turpinās");

            ///// DO WHILE
            int q = 0;
            do {
                System.out.println("TEST TEST TEST");
                q++;
            } while (q < 10);

            
            Scanner scanner = new Scanner(System.in);
            String parole = "SuperSecretPassword123";
            String ievaditaParole;
            do {
                System.out.println("Ievadi paroli");
                ievaditaParole = scanner.next();
                System.out.println("Pārbaudām paroli");
            } while (!ievaditaParole.equals(parole));

            System.out.println("Pareiza parole");
            
            //////FOR

            String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

            for (int j = 0; j < 4 ; j++) {
                System.out.println("Cikls izpildas, j = " + j);
            }

            for (int j = 0; j < kartis2.length ; j++) {
                System.out.println(kartis2[j]);
            }


            for (int v = 0; v <= 20; v = v + 2) {
                System.out.println(v);
            }

            ///// FOR EACH

            long [] telefonaNumuri = {222222222, 33333333, 444444, 55555, 6666666};
            for (long numurs : telefonaNumuri) {
                System.out.println(numurs);
            }

            String[] kartis3 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
            for (String vienaKarts: kartis3) {
                System.out.println(vienaKarts);
            }

        }






    public static void macamiesMasivus () {

        //MASĪVI

        int[] monthlyCosts = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]); //piens
        System.out.println(produktuSaraksts[1]); //maize
        System.out.println(produktuSaraksts[2]); //olas

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); //desa

        String[] cars = {"Volvo","BMW","Nissan","Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);



        cars[1]="Audi"; //aizstājam 1. pozīciju masīvā

        String[] studentuSaraksts = new String[23];  //23 norāda uz elementu skaitu
        studentuSaraksts[0]="Jānis Bērziņš";
        studentuSaraksts[1]="Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]); //izprintēs null, jo nav definēts

        int[] menesiGada = new int[12];
        menesiGada[0] = 1;

    }
    public static double average (double a, double b, double c){
        return (a+b+c)/3;
    }
    public static int aprekinatTaisnsturaLaukumu(int platums, int garums){
        return platums*garums;
    }

    public static void printNewLine(){
        System.out.println("\n");
    }

    public static void metodeViens () {
        System.out.println("###############");
        System.out.println("Linda Smalkā");
        System.out.println("Rīga");
        System.out.println("Vecums: " + 30);
        System.out.println("$$$$$$$$$$$$$");
    }

    public static void metodeDivi (String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("###############");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums: " + vecums );
        System.out.println("$$$$$$$$$$$$$");

    }
            //vai piemeram printCard / printetKartinu utt
            // metodes vienmēr definē KLASES ietvaros



}


/////Mājas darbā katru uzdevumu taisīt kā metodi




