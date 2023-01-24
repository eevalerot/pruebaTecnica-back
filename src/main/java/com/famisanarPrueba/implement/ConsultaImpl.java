package com.famisanarPrueba.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.famisanarPrueba.Dto.ListadoLibrosDto;
import com.famisanarPrueba.commons.MHelpers;
import com.famisanarPrueba.entities.LibBooks;
import com.famisanarPrueba.entities.LibCategories;
import com.famisanarPrueba.repositories.ConsultaRepositories;
import com.famisanarPrueba.repositories.LibCategoriesRepository;

import ConsultaService.ConsultaService;

@Service
public class ConsultaImpl implements ConsultaService{
	
	@Autowired
	private ConsultaRepositories consultaRepositories;
	
	@Autowired
	private LibCategoriesRepository libCategoriesRepository;

	@Override
	public List<ListadoLibrosDto> findByLibros(int idCat) {
		
		List<ListadoLibrosDto> listBook = new ArrayList<>();
		List<LibBooks> findBook = this.consultaRepositories.findBook(idCat);
		
		for (Object book : findBook) {
			ListadoLibrosDto c = MHelpers.modelMapper().map(book, ListadoLibrosDto.class);
			listBook.add(c);
		}
		return listBook;

	}

	@Override
	public List<LibCategories> listCategories() {
		
		return this.libCategoriesRepository.findAll();
	}
	
	
	
	
}
