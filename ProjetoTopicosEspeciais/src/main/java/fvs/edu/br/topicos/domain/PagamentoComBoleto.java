package fvs.edu.br.topicos.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import fvs.edu.br.topicos.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dateDeVencimento;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataDePagamento;
	
	public PagamentoComBoleto () {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataDeVencimento, Date dataDePagamento) {
		super(id, estado, pedido);
		this.dateDeVencimento = dataDeVencimento;
		this.dataDePagamento = dataDePagamento;
	}

	public Date getDateDeVencimento() {
		return dateDeVencimento;
	}

	public void setDateDeVencimento(Date dateDeVencimento) {
		this.dateDeVencimento = dateDeVencimento;
	}

	public Date getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Date dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}
	
	

}
