package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class MajasDarbsDivi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.uzdevums");

       int x = 4;
        System.out.println(x > 0);
        System.out.println(x<0);

        int y = 6;
        System.out.println(y>5 && y<=10);
        System.out.println(!(y>=5) || y<=10);
        System.out.println(y==0 || y==10);

        System.out.println(x*x>10);

    // 2. uzdevums



        System.out.println("2.uzdevums");
        System.out.println("Ievadi mēneša numuru:");
        int monthNumber;
        monthNumber = scanner.nextInt();

        switch(monthNumber){
            case 1: System.out.println("Janvāris");
                break;
            case 2: System.out.println("Februāris");
                break;
            case 3: System.out.println("Marts");
                break;
            case 4: System.out.println("Aprīlis");
                break;
            case 5: System.out.println("Maijs");
                break;
            case 6: System.out.println("Jūnijs");
                break;
            case 7: System.out.println("Jūlijs");
                break;
            case 8: System.out.println("Augusts");
                break;
            case 9: System.out.println("Septembris");
                break;
            case 10: System.out.println("Oktobris");
                break;
            case 11: System.out.println("Novembris");
                break;
            case 12: System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis nav minēts");
        }


        System.out.println("3.uzdevums");


        System.out.println("Ievadi 3 veselus skaitļus:");

        int skaitlis1 = scanner.nextInt();
        int skaitlis2 = scanner.nextInt();
        int skaitlis3  = scanner.nextInt();

        //test System.out.println(skaitlis1+skaitlis2+skaitlis3);

        if (skaitlis1>skaitlis2 && skaitlis1>skaitlis3) {
            System.out.println(skaitlis1 + " ir lielākais skaitlis");
        } else if (skaitlis2>skaitlis1 && skaitlis2>skaitlis3) {
            System.out.println(skaitlis2 + " ir lielākais skaitlis");
        } else if (skaitlis3>skaitlis1 && skaitlis3>skaitlis2) {
            System.out.println(skaitlis3 + " ir lielākais skaitlis");
        }


        System.out.println("4.uzdevums");

        Scanner luksaforaKrasa = new Scanner(System.in);

        System.out.println("Kāda krāsa deg luksaforā?");
        String luksafors = luksaforaKrasa.nextLine();

        if (luksafors.equals("sarkana")){
            System.out.println("STĀVĒT");
        }else if (luksafors.equals("zaļa")) {
            System.out.println("IET");
        }else if (luksafors.equals("dzeltena")){
                System.out.println("PAGAIDI MAZLIET");
        }else {System.out.println("Jāzvana uz avārijas dienestu!");
        }








    }
}
