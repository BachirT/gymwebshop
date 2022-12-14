package com.webshop.gymwebshop.dao;

import com.webshop.gymwebshop.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//RepositoryRestResource is om aan te geven dat de default settings van mapping aan naamgeving
//Anders moeten zijn en dat andere geef je dan zelf aan. Default wordt er een s aan je model toegevoegd, dat past
//niet bij category
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository  extends JpaRepository<ProductCategory, Long> {

}
