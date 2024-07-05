
package entidades;

import javax.persistence.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

@Entity
@Table(name = "Ordenes")
public class OrdenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_mesa", nullable = false)
    private int numeroMesa;

    @Column(name = "numero_orden", nullable = false)
    private int numeroOrden;

    @Column(name = "notas")
    private String notas;
    
    @Column(name = "total")
    private Double total;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "orden_id")
    private List<PlatilloEntity> platillos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public List<PlatilloEntity> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<PlatilloEntity> platillos) {
        this.platillos = platillos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


}
