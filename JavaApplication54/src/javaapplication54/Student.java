package javaapplication52;

public class Student {

    private String name;
    private int Mssv;
    private float LT;
    private float TH;
    private float TB;

    public Student() {
    }

    public Student(String name, int Mssv, float LT, float TH) {
        this.name = name;
        this.Mssv = Mssv;
        this.LT = LT;
        this.TH = TH;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMssv() {
        return Mssv;
    }
    public void setMssv(int Mssv) {
        this.Mssv = Mssv;
    }

    public float getLT() {
        return LT;
    }
    public void setLT(float LT) {
        this.LT = LT;
    }

    public float getTH() {
        return TH;
    }
    public void setTH(float TH) {
        this.TH = TH;
    }

    public float getTB() {
        return TB = (LT + TH)/2;
    }
    public void setTB(float TB) {
        this.TB = TB;
    }

    @Override
    public String toString() {
        return "Student " 
                + "Name= " + name
                + ", Mssv= " + Mssv 
                + ", LT= " + LT 
                + ", TH= " + TH 
                + ", TB= " + getTB();
    }
}
