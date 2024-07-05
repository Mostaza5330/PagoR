
package daos;


import entidades.PlatilloEntity;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlatilloDaoImpl implements IDao<PlatilloEntity>{
 
    private EntityManagerFactory emf;
    private EntityManager em;

    public PlatilloDaoImpl() {
        this.emf = Persistence.createEntityManagerFactory("default");
        this.em = emf.createEntityManager();
    }

    @Override
    public void crear(PlatilloEntity entidad) {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        System.out.println("Se a agregado el platillo a la base de datos exitosamente.");
    }

    @Override
    public Optional<PlatilloEntity> obtenerPorId(long id) {
        PlatilloEntity PlatilloEntity = em.find(PlatilloEntity.class, id);
        return PlatilloEntity != null ? Optional.of(PlatilloEntity) : Optional.empty();
    }

    @Override
    public List<PlatilloEntity> obtenerTodos() {
        return em.createQuery("FROM Platillos", PlatilloEntity.class).getResultList();
    }

    @Override
    public void actualizar(PlatilloEntity entidad) {
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        em.getTransaction().begin();
        PlatilloEntity platillo = em.find(PlatilloEntity.class, id);
        if (platillo != null) {
            em.remove(platillo);
        }
        em.getTransaction().commit();
    }
    
}
