package pe.com.tiendita.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Producto")
@Table(name="t_producto")
public class Producto  implements Serializable{

	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="codpro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name="nompro")
	private String nombre;
	@Column(name="preproc")
	private double preciocompra;
	@Column(name="preprov")
	private double precioventa;
	@Column(name="canpro")
	private double cantidad;
	@Column(name="estpro")
	private boolean estado;
	
	//LLAVE FORANEA
	@ManyToOne
	@JoinColumn(name="codcat",nullable = false)
	private Categoria categoria;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPreciocompra() {
		return preciocompra;
	}

	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}

	public double getPrecioventa() {
		return precioventa;
	}

	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
