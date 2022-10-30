package lekcijaCetri.majasDarbs;

public class Main {

    public static void main(String[] args) {

        Trissturis trissturis1 = new Trissturis();
        trissturis1.mala1 = 5;
        trissturis1.mala2 = 7;
        trissturis1.mala3 = 9;

        System.out.println(trissturis1.rekinamPusperimetru());
        System.out.println(trissturis1.rekinamLaukumu());
        System.out.println(trissturis1.vaiIrVienadmalu());
        System.out.println(trissturis1.vaiIrVienadsanu());


        Trissturis trissturis2 = new Trissturis(5, 5, 5 );

        System.out.println(trissturis2.rekinamPusperimetru());
        System.out.println(trissturis2.rekinamLaukumu());
        System.out.println(trissturis2.vaiIrVienadmalu());
        System.out.println(trissturis2.vaiIrVienadsanu());



    }

}

