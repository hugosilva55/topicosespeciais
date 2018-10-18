package fvs.edu.br.topicos.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date instante;
	
	@ManyToOne
	@JoinColumn(name="endereco_id")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public Pedido() {
	}
		
	public Pedido(Integer id, Date instante) {
		super();
		this.id = id;
		this.instante = instante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
