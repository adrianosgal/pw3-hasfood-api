package br.com.adriano.sena.hasfood.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="TBL_ENTREGA")
public class Avaliacao {

	@Id
	@Column(name="ID_PEDIDO")
	private long id;
	
	@Column(name="TX_NOME_CLIENTE")
	private String nome_cliente;
	
	@Column(name="TX_ENDERECO")
	private String endereco;
	
	@Column(name="ID_PEDIDO")
	private long pedido;
}
