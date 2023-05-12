package pe.com.tiendita.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name="Categoria")
@Table(name="t_categoria")
public class Categoria implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="codcat")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name="nomcat")
	private String nombre;
	
	@Column(name="estcat")
	private boolean estado;

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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
	
}
