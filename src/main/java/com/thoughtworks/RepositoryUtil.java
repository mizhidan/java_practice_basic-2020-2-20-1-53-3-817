package com.thoughtworks;

import java.util.Collection;

public class RepositoryUtil<E> {
    public static<E> void printList(MemoryRepository<E> repo) {
        Collection<E> list = repo.list();
        for(E values: list) {
            System.out.println(values);
        }
    }
}
