public class Adres {
    String ulica;
    int numerDomu;
    String kodPocztowy;
    String miasto;


    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) throws adresError {
        if (ulica == null) {
            throw new adresError("Ulica nie może być pusta!");
        }
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) throws adresError {
        if (numerDomu <= 0) throw new adresError("Numer domu nie może być liczbą <= 0");
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) throws adresError {
        if (kodPocztowy == null) {
            throw new adresError("Kod pocztowy nie może być pusty!");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) throws adresError {
        if (miasto == null) {
            throw new adresError("Miasto nie może być puste!");
        }
        this.miasto = miasto;
    }

    public void info() {
        System.out.println("Ulica: " + ulica + "\n" + "Numer domu: " + numerDomu + "\n" + "Kod pocztowy: " + kodPocztowy + "\n" + "Miasto: " + miasto);
    }


}

