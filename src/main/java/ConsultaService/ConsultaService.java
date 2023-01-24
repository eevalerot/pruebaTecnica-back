package ConsultaService;

import java.util.List;

import org.springframework.stereotype.Component;

import com.famisanarPrueba.Dto.ListadoLibrosDto;
import com.famisanarPrueba.entities.LibCategories;

@Component
public interface ConsultaService {

	List<ListadoLibrosDto> findByLibros(int idCat);
	
	List<LibCategories> listCategories();
	
}
