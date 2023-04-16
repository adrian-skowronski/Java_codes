//prostopadłościan
public class Rectangular {
    double a,b,c;
    String name;

    public Rectangular(double a, double b, double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double pole(double a, double b, double c){
        return 2*a*c+2*c*b+2*a*b;
    }
    public double objetosc(double a, double b, double c){
        return a*b*c;
    }
    public void wypisz(){
        System.out.format("Figura prostopadłościan o nazwie: %s, dł. boków: %.2f, %.2f, %.2f, pole: %.2f, objętość: %.2f",name,a,b,c,pole(a,b,c),objetosc(a,b,c));
    }
}
