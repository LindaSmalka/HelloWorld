package lekcijaCetri.majasDarbs;

public class Trissturis {

        int mala1;
        int mala2;
        int mala3;
        double laukums;
        double pusperimetrs;

        public Trissturis() {
                System.out.println("Mēs veidojam jaunu trijstūri");
        }

        public Trissturis(int mala1, int mala2, int mala3) {
                this.mala1 = mala1;
                this.mala2 = mala2;
                this.mala3 = mala3;
                this.pusperimetrs = (mala1 + mala2 + mala3) / 2;
                this.laukums = Math.sqrt(pusperimetrs * (pusperimetrs - mala1) * (pusperimetrs - mala2) * (pusperimetrs - mala3));
        }

        public double rekinamPusperimetru() {
                System.out.println("Pusperimetrs: ");
                return pusperimetrs = (mala1 + mala2 + mala3) / 2;
        }

        public double rekinamLaukumu() {
                System.out.println("Laukums: ");
                return pusperimetrs = Math.sqrt(pusperimetrs * (pusperimetrs - mala1) * (pusperimetrs - mala2) * (pusperimetrs - mala3));
        }

        public boolean vaiIrVienadmalu() {
                System.out.println("Vau šis trīsstūris ir vienādmalu");
                return mala1 == mala2 && mala1 == mala3 && mala2 == mala3;
        }

        public boolean vaiIrVienadsanu() {
                System.out.println("Vau šis trīsstūris ir vienādsānu");
                return mala1 == mala2 || mala1 == mala3 || mala2 == mala3;
        }
}