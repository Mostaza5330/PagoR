
package daos;

import entidades.Usuario;
import java.util.List;
import java.util.Optional;
import javax.persistence.*;

public class UsuarioDaoImpl implements IDao<Usuario> {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UsuarioDaoImpl() {
        this.emf = Persistence.createEntityManagerFactory("default");
        this.em = emf.createEntityManager();
    }

    @Override
    public void crear(Usuario entidad) {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        System.out.println("Se ha agregado el usuario a la base de datos exitosamente.");
    }

    @Override
    public Optional<Usuario> obtenerPorId(long id) {
        Usuario usuario = em.find(Usuario.class, id);
        return usuario != null ? Optional.of(usuario) : Optional.empty();
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return em.createQuery("FROM Usuarios", Usuario.class).getResultList();
    }

    @Override
    public void actualizar(Usuario entidad) {
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, id);
        if (usuario != null) {
            em.remove(usuario);
        }
        em.getTransaction().commit();
    }
}
    

