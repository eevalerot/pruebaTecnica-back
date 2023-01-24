package com.famisanarPrueba.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "lib_books")
public class LibBooks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoriesIdGenerator")
	@SequenceGenerator(name = "categoriesIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "categories_id_seq")
	private int book_id;
	
	@NotNull(message = "dont not null")
	@Column(name = "book_isbn", length = 15)
	private String bookIsbn;
	
	@Column(name = "book_published_date")
	private Date bookPublishedDate;
	
	@NotNull(message = "dont not null")
	@Column(name = "book_title", length = 100)
	private String bookTitle;
	
	@NotNull(message = "dont not null")
	@Column(name = "book_price")
	private int book_price;
	
	@Column(name = "book_description", length = 200)
	private String bookDescription;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_aut_id", nullable = true)
	private authors libAuthors;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_cat_id", nullable = true)
	private LibCategories libCategories;
	
	

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public Date getBookPublishedDate() {
		return bookPublishedDate;
	}

	public void setBookPublishedDate(Date bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public authors getLibAuthors() {
		return libAuthors;
	}

	public void setLibAuthors(authors libAuthors) {
		this.libAuthors = libAuthors;
	}

	public LibCategories getLibCategories() {
		return libCategories;
	}

	public void setLibCategories(LibCategories libCategories) {
		this.libCategories = libCategories;
	}
	
	
	

}
