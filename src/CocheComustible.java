public class CocheComustible extends Coche{
    private String tipo;

    @Override
    public void setTipoCoche(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipoCoche() {
        return tipo;
    }
}
