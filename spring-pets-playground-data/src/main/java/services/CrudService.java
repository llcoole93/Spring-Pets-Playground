package services;

import java.util.Set;

/**
 * Created by Evan on 4/7/2021
 */
public interface CrudService <T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}