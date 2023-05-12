package pe.com.tiendita.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.tiendita.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

	@Query("select p from Producto p where p.estado=1")
	List<Producto> findAllCustom();
}
