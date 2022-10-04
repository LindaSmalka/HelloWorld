package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
        //int = integer, satur veselu skaitli
        //mainigos raksta ar mazo burtu (vecums)
        //ja sastav no diviem vai vairak vardiem, nevar likt atstarpi, katru nakamo vardu raksta ar lielo burtu (kurpuIzmers)

        int temperatura = -10;
        System.out.println("Ziemā būs: " + temperatura);

        int vecums = 30;
        System.out.println("Mans vecums ir: " + vecums);
        int garums = 170;
        System.out.println("Mans garums ir: " + garums);
        int kurpjuIzmers = 38;
        System.out.println("Mans kurpju izmers ir: " + kurpjuIzmers);
        int darbaStazs = 8;
        System.out.println("Mans darba stazs ir: " + darbaStazs);
        int svars = 60;
        System.out.println("Mans svars ir: " + svars);

        System.out.println("VECUMS:" + vecums + " GARUMS: " + garums + " Kurpju izmers: " + kurpjuIzmers);
        System.out.println("VECUMS:" + vecums + "\nGARUMS: " + garums + "\nKurpju izmers:" + kurpjuIzmers);

        String sunaVards = "Reksis";
        boolean vaiIrPotets = true;
        if(vaiIrPotets==true){
            System.out.println("Reksis drikst braukt uz sacensibam");
        }

        if(vaiIrPotets==false){
            System.out.println("Reksim jādodas potēties");
        }
        String teksts = "Suņa vārds ir: ";
        System.out.println("Suņa vārds ir " + sunaVards);
        System.out.println(teksts + sunaVards);

        // maksimālā integer vērtība
        int maxInt = 2147483647;
        int population = 1800000;
        // min integer vērtība
        int minINT = -2147483648;

        // pieņem veselu skaitli no -128 līdz +127
        byte vecums2 = 99;

        short latvijasMazpilseta = 17000;

        //long izmanto super garajiem skaitljiem
        long zivisOkena = 21474836499L;


        float apavuIzmers = 44.5F;
        System.out.println("apavu izmers " + apavuIzmers);

        double grauduSvars = 180.3;
        System.out.println("Tika pardoti " + grauduSvars + " kg graudu");

        //atbild uz jautajumu patiess vai nepatiess
        //Sodien ir sestdiena, veikals ir atverts
        boolean isOpen = true;
        //Turpreti skolas ir slegtas
        boolean isClosed = false;
        System.out.println("Vai veikals ir atverts? " + isOpen);

        boolean isFebruaris = false;
        boolean isLeapYear = true;

        //tekstu var saglabat ar String vai char (simbols) - atzimē ar ''
        String sunaSkirne = "VAS";
        char valuta = 'E';
        char dzimums = 'V';
        char atzime = 'F';
        System.out.println("izprintet" + valuta + atzime + dzimums);

        //nedefineti mainigie
        System.out.println("test" + valuta + atzime + dzimums);
        int a = 5;
        int b = 10;
        int summa;
        summa = a + b;
        System.out.println(summa);
        summa = a + a;
        System.out.println(summa);

        String name = "Juris";
        System.out.println(name);
        name = "Jānis";
        System.out.println(name);


        int x = 10;
        int y = -45;

        int rezultats = x + y;
        System.out.println(rezultats);

        rezultats = x - y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        double rezultatsDal = 10 / 3;
        System.out.println(rezultatsDal);

        rezultats = 11 % 2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/2;
        System.out.println(rezultats);

        String koks = "Priede";
        int suguSkaitsLatvijā = 13;
        boolean irSkujas = true;
        float apkartmērs = 0.7F;
        char priedeSaisinajums = 'P';



    }
}
