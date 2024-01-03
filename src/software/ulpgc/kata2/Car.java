package software.ulpgc.kata2;

public class Car {
    private String model;
    private double mpg;
    private int cyl;
    private double disp;
    private int hp;
    private double drat;
    private double wt;
    private double qsec;
    private int vs;
    private int am;
    private int gear;
    private int carb;

    public Car(String model, double mpg, int cyl, double disp, int hp, double drat, double wt, double qsec, int vs, int am, int gear, int carb) {
        this.model = model;
        this.mpg = mpg;
        this.cyl = cyl;
        this.disp = disp;
        this.hp = hp;
        this.drat = drat;
        this.wt = wt;
        this.qsec = qsec;
        this.vs = vs;
        this.am = am;
        this.gear = gear;
        this.carb = carb;
    }

    public String getModel() {
        return model;
    }

    public double getMpg() {
        return mpg;
    }

    public int getCyl() {
        return cyl;
    }

    public double getDisp() {
        return disp;
    }

    public int getHp() {
        return hp;
    }

    public double getDrat() {
        return drat;
    }

    public double getWt() {
        return wt;
    }

    public double getQsec() {
        return qsec;
    }

    public int getVs() {
        return vs;
    }

    public int getAm() {
        return am;
    }

    public int getGear() {
        return gear;
    }

    public int getCarb() {
        return carb;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mpg=" + mpg +
                ", cyl=" + cyl +
                ", disp=" + disp +
                ", hp=" + hp +
                ", drat=" + drat +
                ", wt=" + wt +
                ", qsec=" + qsec +
                ", vs=" + vs +
                ", am=" + am +
                ", gear=" + gear +
                ", carb=" + carb +
                '}';
    }
}
