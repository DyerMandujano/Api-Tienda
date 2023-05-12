package pe.com.tiendita.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tiendita.entity.Producto;
import pe.com.tiendita.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

	@Autowired
	private ProductoService servicio;
	
	//SOLO SE PUEDE TENER UN '@GetMapping' SIN PARAMETROS
	@GetMapping
	public List<Producto> findAll()
	{
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<Producto> findAllCustom()
	{
		return servicio.findAllCustom();	
	}
	
	@GetMapping("/{id}")
	public Optional<Producto> findById(@PathVariable Long id)
	{
		return servicio.findById(id);	
	}
	
	//INGRESAR DATOS
	@PostMapping
	public Producto add(@RequestBody Producto c)
	{
		return servicio.add(c);
	}
	
	@PutMapping("/{id}")
	public Producto update(@PathVariable Long id, @RequestBody Producto c)
	{
		c.setCodigo(id);
		return servicio.update(c);
	}
	
	@DeleteMapping("/{id}")
	public Producto delete(@PathVariable Long id)
	{
		Producto objproducto = new Producto();
		objproducto.setEstado(false);
		return servicio.delete(Producto.builder().codigo(id).build());
	}
}
