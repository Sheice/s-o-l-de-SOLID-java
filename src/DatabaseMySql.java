import java.util.ArrayList;

public class DatabaseMySql implements CocheDatabase {
    private ArrayList<Coche> cochesGuardados= new ArrayList();
    @Override
    public void guardarCoche(Coche coche) {
        cochesGuardados.add(coche);
        System.out.println("El coche se guardó en MySql");
    }
}
