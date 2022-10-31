package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();   //faker vietā var būt jebkāds nosaukums
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);


        System.out.println(faker.shakespeare().hamletQuote());
        System.out.println(faker.address().streetName());
        System.out.println(faker.dog().breed());

        //Adrese, telefons, epasts, uzvārds, pēc brīvas izvēles

        System.out.println(faker.address().city() + faker.address().streetAddress());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.name().lastName());
        System.out.println(faker.harryPotter().book());
        System.out.println(faker.dog().breed() + faker.dog().name());

    }
}

