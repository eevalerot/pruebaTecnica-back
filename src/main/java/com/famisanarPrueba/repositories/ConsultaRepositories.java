package com.famisanarPrueba.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.famisanarPrueba.entities.LibBooks;

@Repository
public interface ConsultaRepositories extends JpaRepository<LibBooks, Integer>{

	@Query("SELECT l FROM LibBooks l WHERE l.libCategories.cat_id = :idCat")
	Optional<Object> finBook(@Param("idCat") int idCat);
	
	@Query(value = "select lb.* \n"
			+ "from lib_books lb inner join lib_authors la ON lb.book_aut_id = la.id inner join lib_book_categories lbc on lb.book_cat_id = lbc.cat_id where lbc.cat_id = :idCat",nativeQuery = true)
	List<LibBooks> findBook(@Param("idCat") int idCat);
}