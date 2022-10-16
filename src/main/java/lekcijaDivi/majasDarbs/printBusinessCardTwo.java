package lekcijaDivi.majasDarbs;

public class printBusinessCardTwo {

    public static void main(String[] args) {
    printCard("Linda", "Smalkā", "+371 12345678", 1992);
    printCard("Vita", "Irbe", "+371 23456789", 1993);


    }

        public static void printCard (String vards, String uzvards, String telefons, int gads) {

            System.out.println("Vizītkarte");
            System.out.println("###############");
            System.out.println("Vārds: " + vards );
            System.out.println("Uzvārds: " + uzvards);
            System.out.println("Telefona numurs: " + telefons );
            System.out.println("Dzimšanas gads: " + gads );
            System.out.println("###############");

            }


    }

