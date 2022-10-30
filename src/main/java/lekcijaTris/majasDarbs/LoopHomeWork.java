package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

        uzdevumsViens();
        uzdevumsDivi();
        uzdevumsTris();



    }


    public static void uzdevumsViens() {

        Scanner scanner = new Scanner(System.in);

        int skaitlis;
        int summa = 0;
        while (summa < 100) {

            System.out.println("Ievadi skaitli:");
            skaitlis = scanner.nextInt();
            summa = summa + skaitlis;

        }
        System.out.println("Gatavs");


    }

    public static void uzdevumsDivi() {

        //while

        System.out.println("Piemēri ar WHILE");

        int[] izdevumi = {89, 95, 150, 63, 195};
        int i = 0;
        while (i < 5) {
            System.out.println("Pēdējo mēnešu izdevumi " + izdevumi[i]);
            i++;
        }

        int i1 = 0;
        while (i1 < izdevumi.length) {
            System.out.println(izdevumi[i1]);
            i1 = i1 + 1;
        }

        String[] valstis = {"Igaunija", "Norvēģija", "Polija", "Portugāle"};
        int v = 0;
        while (v < 4) {
            System.out.println("Šogad apceļotās valstis " + valstis[v]);
            v++;

        }

        char[] burti = {'a', 'b', 'c', 'd', 'e',};
        int b = 0;
        while (b < 5) {
            System.out.println("Pirmie alfabēta burti " + burti[b]);
            b = b + 1;

        }

        //do while

        System.out.println("Piemēri ar DO WHILE");

        int i2 = 0;
        do {
            System.out.println("Izdevumi");
            i2++;
        } while (i2 < izdevumi.length);

        int v1 = 0;
        do {
            System.out.println(valstis[v1]);
            v1++;
        }
        while (v1 < valstis.length);

        int b1 = 0;
        do {
            System.out.println(burti[b1]);
            b1++;
        }
        while (b1 < 3);

        //for loop

        System.out.println("Piemēri ar FOR");

        for (int u = 0; u < izdevumi.length; u++) {
            System.out.println(izdevumi[u]);
        }

        for (int u = 0; u < 4; u++) {
            System.out.println(valstis[u]);
        }

        for (int u = 0; u < burti.length; u++) {
            System.out.println(burti[u]);
        }

        //for each

        System.out.println("Piemēri ar FOR EACH");

        for (int mēnešaIzdevumi : izdevumi) {
            System.out.println(mēnešaIzdevumi);
        }

        for (String valstuNosaukumi : valstis) {
            System.out.println(valstuNosaukumi);
        }

        for (char alfabētaBurti : burti) {
            System.out.println(alfabētaBurti);
        }
    }

    public static void uzdevumsTris() {



//
        int[] masivs =  new int[100];
        for (int i = 0; i < masivs.length; i++) {
            masivs[i] = i;
        }
        for (int j: masivs){
        if (j%2==0) {
            System.out.println("Pāra skaitļi:" + j);
        }

        }
    }


    public static void uzdevumsCetri() {
    }

        }








