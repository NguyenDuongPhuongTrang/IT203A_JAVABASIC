<<<<<<< HEAD
package interfaces;

import java.util.List;

public interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}
=======
package interfaces;

import java.util.List;

public interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}
>>>>>>> 97faaa4ea5e9811bc5ca84cf5717b53ddd74d73c
