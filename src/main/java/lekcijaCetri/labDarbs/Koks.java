package lekcijaCetri.labDarbs;

public class Koks {
    String koks = "Priede";
    int suguSkaitsLatvijā = 13;
    boolean irSkujas = true;
    float apkartmērs = 0.7F;
    char priedeSaisinajums = 'P';

    public void printKoksInfo () {
        System.out.println("Koks{" +
                "koks='" + koks + '\'' +
                ", suguSkaitsLatvijā=" + suguSkaitsLatvijā +
                ", irSkujas=" + irSkujas +
                ", apkartmērs=" + apkartmērs +
                ", priedeSaisinajums=" + priedeSaisinajums +
                '}');
    }

}
