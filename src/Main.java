public class Main {
    public static void main(String[] args) {
        Coche coche = new CocheElectrico();

        coche.setTipoCoche("Renault");

        System.out.println(coche.getTipoCoche());

        CocheDatabase db = new DatabaseMySql();

        guardarEnBaseDeDatos(db,coche);
    }

    public static void guardarEnBaseDeDatos(CocheDatabase cdb, Coche coche){
        cdb.guardarCoche(coche);
    }
}