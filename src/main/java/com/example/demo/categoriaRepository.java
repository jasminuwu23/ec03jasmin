package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface categoriaRepository extends PagingAndSortingRepository<Categoriajm, Integer>,CrudRepository<Categoriajm, Integer> {
    
    List<Categoriajm> findByNombre(@Param("nombre") String nombre);

}

