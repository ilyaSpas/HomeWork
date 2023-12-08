package dao;

public interface Dao <K, V>{
    V save(V v);
}
