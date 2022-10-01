package lekcijaViens.majasDarbs;

public class Main {
    public static void main(String[] args) {

        //Main metodē vajag nodefinēt mainīgos (ar atbilstošo datatipu) Valstij (brīva izvēle) un izvadīt uz ekrāna:

        System.out.println("Linda Smalkā mājas darbs");
        String nosaukums = "Norvēģija";
        int iedzīvotājuSkaits = 5425270;
        int valstsPlatiba = 385207;
        String galvaspilsēta = "Oslo";
        String oficiālāValoda1 = "norvēģu";
        String oficiālāValoda2 = "sāmu";
        Boolean isEU = false;
        Boolean isEEZ = true;
        char valuta = 'N';

        System.out.println(nosaukums);
        System.out.println(iedzīvotājuSkaits);
        System.out.println(valstsPlatiba);
        System.out.println(galvaspilsēta);
        System.out.println(oficiālāValoda1);
        System.out.println(oficiālāValoda2);
        System.out.println(isEU);
        System.out.println(isEEZ);
        System.out.println(valuta);
        System.out.println("Vai Norvēģija ir Eiropas Savienībā " + isEU);
        System.out.println("Vai Norvēģija ir EEEZ " + isEEZ);

        System.out.println(nosaukums + " ir valsts Ziemeļeiropā un daļa no Skandināvijas. " +
                "\nNorvēģijā dzīvo " + iedzīvotājuSkaits + " iedzīvotāji. Norvēģijas platība ir " +
                valstsPlatiba + " km2, \nkas padara Norvēģiju par piekto lielāko valsti Eiropā. Norvēģijas " +
                "\ngalvaspilsēta un lielākā pilsēta ir " + galvaspilsēta + ". Norvēģijas oficialā valoda ir " +
                oficiālāValoda1 + " valoda, \ndažos reģionos arī " + oficiālāValoda2 + " valoda." +
                "Norvēģijā kā norēķinu valūtu " + "\nizmanto - Norvēģu kronas, ko bieži saīsina - " + valuta + ".");


    //Pemēri ar aritmētiskajiem operatoriem

        int a = 100;
        int b = 20;
        int c = 5;
        int d = 2;

        int rezultats1 = a + b;
        System.out.println(rezultats1);
        System.out.println(c + d);
        System.out.println(a + c + 5);

        int rezultats2 = b - c;
        System.out.println(rezultats2);
        System.out.println(b-d);
        System.out.println(rezultats1 - rezultats2);

        System.out.println(d*8);
        System.out.println(rezultats1*rezultats2);
        System.out.println(a*b);

        System.out.println(rezultats1/4);
        System.out.println(a/b);
        System.out.println(a/4);

        System.out.println(rezultats1 % rezultats1);
        System.out.println(rezultats1 % rezultats1 + 2);
        System.out.println(c % d);

        int summa = b * d;
        System.out.println(summa - 26 + rezultats1 / rezultats2);

        System.out.println(a + b + c - d);
        System.out.println(rezultats1 * 2 + c);
        System.out.println((a+b)/d-rezultats2);





}
}