package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaizmers;
    int atrums = 0;
    Date izgatavosanasDatums;


    Velosipeds(){
        System.out.println("Taisām jaunu velo");   //kaut kas notiek, kad tiek izsaukta metode ar 'new' Main klasē, piem. katru reizi kad jaunu velosipēdu taisa
        izgatavosanasDatums = new Date();
        System.out.println("Izgatavošanas datums: " + izgatavosanasDatums);

    }

    Velosipeds(String zimols, int ramjaizmers, int atrums) {
        izgatavosanasDatums = new Date();
        this.zimols = zimols;
        this.ramjaizmers = ramjaizmers;
        this.atrums = atrums;

    }


    public void printAtrums() {
        System.out.println(atrums);

    }


    public void paatrinajums() {
        System.out.println("Velo paātrinās");
        atrums = atrums + 5;
    }

    public void bremzesana() {
        System.out.println("Velo bremzē, ātrums ir: " + atrums);
        if (atrums >= 5) {
            atrums = atrums - 5;
        } else {
            System.out.println("Tu jau stāvi");
        }
    }
}
