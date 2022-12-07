public class Main {
    public static void main(String[] args) {
        Coche coche = new CocheElectrico();

        coche.setTipoCoche("Renault");

        System.out.println(coche.getTipoCoche());
    }
}