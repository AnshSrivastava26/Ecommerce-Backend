package com.ansh.E_commerce.App.Repository;

import java.util.List;

import com.ansh.E_commerce.App.Modal.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryId(String categoryId);

    List<Category>findByLevel(Integer level);

}
