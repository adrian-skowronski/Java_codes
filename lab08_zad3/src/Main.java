public class Main {
    public static void main(String[] args) {

        Adres adres1 = new Adres();

        String[] errors = new String[5];
        int errorCount = 0;

        try {
            adres1.setUlica("Poziomkowa");
        } catch (adresError e) {
            errors[errorCount++] = e.getMessage();
        }
        try {
            adres1.setNumerDomu(-29);
        } catch (adresError e) {
            errors[errorCount++] = e.getMessage();
        }
        try {
            adres1.setKodPocztowy("12-345");
        } catch (adresError e) {
            errors[errorCount++] = e.getMessage();
        }
        try {
            adres1.setMiasto(null);
        } catch (adresError e) {
            errors[errorCount++] = e.getMessage();
        }

        for (errorCount = 0; errorCount < 4; errorCount++) {
            System.out.println(" " + errors[errorCount]);
        }

        System.out.println("");
        adres1.info();

    }

}