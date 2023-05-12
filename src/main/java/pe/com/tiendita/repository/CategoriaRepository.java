package pe.com.tiendita.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.tiendita.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	@Query("select c from Categoria c where c.estado=1")
	List<Categoria> findAllCustom();
}
