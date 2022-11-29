package api.auth.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import api.auth.api.domain.dtos.OrderDTO;
import api.auth.api.domain.entity.Order;
import api.auth.api.domain.repository.IOrderRepository;
import api.auth.api.service.IOrderService;
import api.auth.api.utils.mappers.IOrderMapper;

@Service
public class OrderService implements IOrderService {
	
	private IOrderRepository orderRepo;
	private IOrderMapper orderMapper;
	
	public OrderService(IOrderRepository orderRepo, IOrderMapper orderMapper) {
		this.orderMapper = orderMapper;
		this.orderRepo = orderRepo;
	}
	
	public OrderDTO add(Order order) {
		return orderMapper.toDto(orderRepo.save(order));
	}
	
	public List<OrderDTO> findAll() {
		return orderMapper.toDto(orderRepo.findAll());
	}
	
	
}
