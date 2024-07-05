package daos;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    
    void crear(T entidad);
    
    Optional<T> obtenerPorId(long id);
    
    List<T> obtenerTodos();
    
    void actualizar(T entidad);
    
    void eliminar(long id);
    
}

