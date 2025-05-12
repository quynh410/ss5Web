package ra.com.service;

import ra.com.model.Categories;

import java.util.List;

public interface CategoriesService {
    List<Categories> findAll();

    boolean save(Categories catalog);
    Categories findById(int id);

    boolean update(Categories catalog);

    boolean delete(int catalogId);
}