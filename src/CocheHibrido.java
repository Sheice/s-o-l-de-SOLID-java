public class CocheHibrido implements Coche, CocheConPuertas{
    private String tipo;
    private int cantPuertas;

    @Override
    public void setTipoCoche(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipoCoche() {
        return tipo;
    }

    @Override
    public int getCantPuertas() {
        return cantPuertas;
    }

    @Override
    public void setCantPuertas(int cantPuertas) {
    this.cantPuertas = cantPuertas;
    }
}
