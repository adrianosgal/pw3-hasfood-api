package br.com.adriano.sena.hasfood.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
@Table(name="TBL_PEDIDO")
public class Pedido {
	
	@Id
	@Column(name="ID-PEDIDO")
	private long id;
	
	@Enumerated
	@Column(name="TX_STATUS")
	private StatusPedidoEnum status;
	
	@Column(name="DT_PEDIDO")
	private Date data;
	
	@Column(name="ID_RESTAURANTE")
	private long id_restaurante;
	
	
}
