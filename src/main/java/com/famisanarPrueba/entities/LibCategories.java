package com.famisanarPrueba.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "lib_book_categories")
public class LibCategories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoriesIdGenerator")
	@SequenceGenerator(name = "categoriesIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "categories_id_seq")
	private int cat_id;
	
	@NotNull(message = "dont not null")
	@Column(name = "cat_descripcion", length = 60)
	private String catDescripcion;

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCatDescripcion() {
		return catDescripcion;
	}

	public void setCatDescripcion(String catDescripcion) {
		this.catDescripcion = catDescripcion;
	}
	
	
	
}
