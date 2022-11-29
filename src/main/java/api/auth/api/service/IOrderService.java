package api.auth.api.service;

import java.util.List;

import api.auth.api.domain.dtos.OrderDTO;
import api.auth.api.domain.entity.Order;

public interface IOrderService {

	OrderDTO add(Order order);
	
	List<OrderDTO> findAll();
}
