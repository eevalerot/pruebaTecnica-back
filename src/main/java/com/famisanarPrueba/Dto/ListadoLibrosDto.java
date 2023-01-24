package com.famisanarPrueba.Dto;

public class ListadoLibrosDto {

	public LibCategoriesDto getLibCategories() {
		return libCategories;
	}
	public void setLibCategories(LibCategoriesDto libCategories) {
		this.libCategories = libCategories;
	}
	private String bookTitle;
	private String bookIsbn;
	private String bookDescription;
	private int book_price;
	private AuthorDto libAuthors;
	private LibCategoriesDto libCategories;
	
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public AuthorDto getLibAuthors() {
		return libAuthors;
	}
	public void setLibAuthors(AuthorDto libAuthors) {
		this.libAuthors = libAuthors;
	}

	
	
}
