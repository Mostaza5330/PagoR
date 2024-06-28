package entity;

public class Pago {

    private int id;
    private float monto;
    private String descripcion;
    private String metodoPago;
    private String fecha;

    public Pago(int id, float monto, String metodoPago, String descripcion, String fecha) {
        this.id = id;
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
    }

    public Pago() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
