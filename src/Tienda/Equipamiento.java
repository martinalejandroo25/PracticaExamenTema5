package Tienda;

public class Equipamiento extends ProductoBase {

    private String marca;
    private String deporte;

    public Equipamiento(String codigo, String nombre, Double precio, Integer stock, String marca, String deporte) {
        super(codigo, nombre, precio, stock);
        this.marca = marca;
        this.deporte = deporte;
    }




    @Override
    public String getInfo() {
        final StringBuilder sb = new StringBuilder("Equipamiento{");
        sb.append("codigo='").append(getCodigo()).append('\'');
        sb.append(", nombre='").append(getNombre()).append('\'');
        sb.append(", precio=").append(getPrecio());
        sb.append(", stock=").append(getStock());
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", deporte='").append(deporte).append('\'');
        sb.append('}');
        return sb.toString();

    }

    @Override
    public void setPrecio(double precio) {
        this.setPrecio(precio);
    }

    public String getMarca() {
        return marca;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
