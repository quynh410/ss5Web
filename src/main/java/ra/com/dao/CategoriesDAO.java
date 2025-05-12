package ra.com.dao;

import ra.com.model.Categories;

import java.util.List;

public interface CategoriesDAO {
    List<Categories> findAll();
    boolean save(Categories catalog);
    Categories findById(int catalogId);
    boolean update(Categories catalog);
    boolean delete(int catalogId);
}