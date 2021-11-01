package handler.springframework.springpetsplayground.services.map;

import handler.springframework.springpetsplayground.model.BaseEntity;

import java.util.*;

/**
 * Created by Evan on 4/7/2021
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T obj) {

        if (obj != null) {
            if (obj.getId() == null) {
                obj.setId(getNextId());
            }

            map.put(obj.getId(), obj);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return obj;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
