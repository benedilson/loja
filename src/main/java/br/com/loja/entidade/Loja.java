package br.com.loja.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
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
	
}
