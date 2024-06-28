package entity;

import java.sql.Timestamp;
import java.util.List;

public class Orden {

    private int id;
    private int mesa;
    private Timestamp fecha;
    private List<DetalleOrden> detalles;
    private double total;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetalleOrden> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleOrden> detalles) {
        this.detalles = detalles;
    }

    // Calculate total price
    public void calculateTotal() {
        total = detalles.stream().mapToDouble(d -> d.getPrecio() * d.getCantidad()).sum();
    }
}
