//kula
public class Sphere {
    double r;
    String name;

    public Sphere(double r, String name) {
        this.r = r;
        this.name = name;
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
    public double pole(double r){
        return 4*Math.PI*r*r;
    }
    public double objetosc(double r){
        return (4*Math.PI*Math.pow(r,3))/3;
    }
    public void wypisz(){
        System.out.format("Figura kula o nazwie: %s, promień: %.2f, pole: %.4f, objętość: %.4f",name,r,pole(r),objetosc(r));
    }
}

