package lekcijaPieci.majasDarbs;

public class Cilindrs {

    private int radiuss;
    private int augstums;

    public Cilindrs(int radiuss, int augstums) {
        this.radiuss = radiuss;
        this.augstums = augstums;
    }


    public int getRadiuss() {
        return radiuss;
    }

    public void  setRadiuss(int radiuss) {this.radiuss = radiuss; }

    public int  getAugstums() {return augstums;};

    public void  setAugstums(int augstums) {this.augstums = augstums; }



    //tilpums = PI*R*R*H


    public double cilindraTilpums () {return Math.PI * radiuss * radiuss * augstums;};


    //virsma

    public double cilindraVirsma;
    public double cilindraPamataLaukums () {return Math.PI * radiuss * radiuss;}
    public double cilindraSanuVirsma () {return 2* Math.PI * radiuss * augstums;}

    public double cilindraVirsma () {return (2 * cilindraPamataLaukums())+ cilindraSanuVirsma ();}


    public void printTilpums () {
        System.out.println(cilindraTilpums());
    }

    public void printVirsma () {
        System.out.println(cilindraVirsma());
    }


}
