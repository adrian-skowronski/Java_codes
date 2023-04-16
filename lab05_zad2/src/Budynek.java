public class Budynek {
String nazwa;
int rokBudowy, liczbaPieter;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public void setRokBudowy(int rokBudowy) {
        this.rokBudowy = rokBudowy;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public void setLiczbaPieter(int liczbaPieter) {
        this.liczbaPieter = liczbaPieter;
    }

    public void info(){
        System.out.println("Budynek o nazwie "+nazwa+" zbudowany w roku "+rokBudowy+" posiadający pięter "+liczbaPieter);
    }
    public void wiek(){
        int obecnyRok = 2023;
        int wiek = obecnyRok - rokBudowy;
        System.out.println("Wiek budynku: "+wiek+" lat");
    }

}

