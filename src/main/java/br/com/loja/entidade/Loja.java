package br.com.loja.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loja {

	@Id
	//@GeneratedValue(generator = "uuid")
	@Column(name = "cnpj_loja")
	private String cnpjLoja;
	
	@Column(name = "piso_loja")
	private String pisoLoja;
	
	@Column(name = "numero_loja")
	private Integer numeroLoja;
	
	@Column(name = "status_loja")
	private Boolean statusLoja;
	
	@Column(name = "data_loja")
	private Date dataLoja;
	
	@Column(name = "seguimento_loja")
	private String seguimentoLoja;

	public String getCnpjLoja() {
		return cnpjLoja;
	}

	public void setCnpjLoja(String cnpjLoja) {
		this.cnpjLoja = cnpjLoja;
	}

	public String getPisoLoja() {
		return pisoLoja;
	}

	public void setPisoLoja(String pisoLoja) {
		this.pisoLoja = pisoLoja;
	}

	public Integer getNumeroLoja() {
		return numeroLoja;
	}

	public void setNumeroLoja(Integer numeroLoja) {
		this.numeroLoja = numeroLoja;
	}

	public Boolean getStatusLoja() {
		return statusLoja;
	}

	public void setStatusLoja(Boolean statusLoja) {
		this.statusLoja = statusLoja;
	}

	public Date getDataLoja() {
		return dataLoja;
	}

	public void setDataLoja(Date dataLoja) {
		this.dataLoja = dataLoja;
	}

	public String getSeguimentoLoja() {
		return seguimentoLoja;
	}

	public void setSeguimentoLoja(String seguimentoLoja) {
		this.seguimentoLoja = seguimentoLoja;
	}
	
}
