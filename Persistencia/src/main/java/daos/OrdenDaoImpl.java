
package daos;

import entidades.OrdenEntity;
import java.util.List;
import java.util.Optional;
import javax.persistence.*;

public class OrdenDaoImpl implements IDao<OrdenEntity> {

    private EntityManagerFactory emf;
    private EntityManager em;

    public OrdenDaoImpl() {
        this.emf = Persistence.createEntityManagerFactory("default");
        this.em = emf.createEntityManager();
    }

    @Override
    public void crear(OrdenEntity entidad) {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        System.out.println("Se ha agregado la orden a la base de datos exitosamente.");
    }

    @Override
    public Optional<OrdenEntity> obtenerPorId(long id) {
        OrdenEntity orden = em.find(OrdenEntity.class, id);
        return orden != null ? Optional.of(orden) : Optional.empty();
    }

    @Override
    public List<OrdenEntity> obtenerTodos() {
        return em.createQuery("FROM OrdenEntity", OrdenEntity.class).getResultList();
    }

    @Override
    public void actualizar(OrdenEntity entidad) {
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        em.getTransaction().begin();
        OrdenEntity orden = em.find(OrdenEntity.class, id);
        if (orden != null) {
            em.remove(orden);
        }
        em.getTransaction().commit();
    }
}
