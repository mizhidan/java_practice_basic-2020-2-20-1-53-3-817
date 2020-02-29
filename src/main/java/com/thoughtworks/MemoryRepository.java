package com.thoughtworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRepository<E> implements Repository<E> {
    Map<String, E> objects = new HashMap<>();

    public MemoryRepository() {

    }

    public MemoryRepository(Map<String, E> objects) {
        this.objects = objects;
    }


    @Override
    public void save(String id, E entity) {
        objects.put(id, entity);
    }

    @Override
    public E get(String id) {
        return objects.get(id);
    }

    @Override
    public void delete(String id) {
        objects.remove(id);
    }

    @Override
    public void update(String id, E entity) {
        objects.replace(id, entity);
    }

    @Override
    public Collection<E> list() {
        return objects.values();
    }
}
