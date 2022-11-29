package api.auth.api.domain.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import api.auth.api.domain.entity.Order;
import api.auth.api.domain.entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private int amount;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private Order tableOrder;
	private Product product;
	
}
