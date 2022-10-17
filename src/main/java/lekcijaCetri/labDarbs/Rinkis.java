package lekcijaCetri.labDarbs;

public class Rinkis {
    double r;
    final double PI = 3.14; //Math.PI - iebuveta formula //final nozimee 'vertiba kura nemainaas'

    public double rekinatLaukumu () {
        return r*r*PI;
    }

    public double rekinatLinijasGarumu(){
        return 2*PI*r;
    }

    public Rinkis(double r) {
        this.r = r;
    }
}
