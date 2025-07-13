package com.ecommerce.sb_ecom.controller;

import com.ecommerce.sb_ecom.model.Category;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class CategoryController {

    private List<Category> categories = new ArrayList<Category>();

    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories() {
        return categories;
    }
}
