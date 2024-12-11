package service;

import java.util.List;

public abstract class BaseService<T> {
    public abstract List<T> getAll();
    public abstract T getById(String id);
    public abstract boolean add(T entity);
    public abstract boolean update(T entity);
    public abstract boolean delete(String id);
}
