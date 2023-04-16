public class Main {
    public static void main(String[] args) {
        Budynek budynek1 = new Budynek();
        budynek1.setNazwa("blok");
        budynek1.setLiczbaPieter(7);
        budynek1.setRokBudowy(2009);
        budynek1.info();
        budynek1.wiek();
        System.out.println();
        Budynek budynek2 = new Budynek();
        budynek2.setNazwa("szeregowiec");
        budynek2.setLiczbaPieter(2);
        budynek2.setRokBudowy(2015);
        budynek2.info();
        budynek2.wiek();
        System.out.println();
        Budynek budynek3 = new Budynek();
        budynek3.setNazwa("szkoła");
        budynek3.setLiczbaPieter(3);
        budynek3.setRokBudowy(1994);
        budynek3.info();
        budynek3.wiek();
    }
}