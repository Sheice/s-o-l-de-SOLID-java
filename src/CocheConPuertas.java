public class CocheConPuertas extends Coche {
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

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
}
