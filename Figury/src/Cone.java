//stożek
public class Cone {
    double h, r;
    String name;

    public Cone(double h, double r, String name) {
        this.h = h;
        this.r = r;
        this.name = name;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double objetosc(double r, double h){
    return (Math.PI*r*r*h)/3;
    }
    public double pole(double r){
        return Math.PI*r*r+Math.PI*r*Math.hypot(r,h);
    }
    public void wypisz(){
        System.out.format("Figura stożek o nazwie: %s, promień podstawy: %.2f, wysokość: %.2f, pole: %.2f, objętość: %.2f",name,r,h,pole(r),objetosc(r,h));
    }
}
