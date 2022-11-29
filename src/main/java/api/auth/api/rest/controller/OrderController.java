package api.auth.api.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.auth.api.domain.dtos.OrderDTO;
import api.auth.api.domain.entity.Order;
import api.auth.api.service.IOrderService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/order")
@AllArgsConstructor
public class OrderController {

	private IOrderService orderService;
	
	@PostMapping
	public ResponseEntity<OrderDTO> add(@RequestBody Order order) {
		return ResponseEntity.ok(orderService.add(order));
	}
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll() {
		return ResponseEntity.ok(orderService.findAll());
	}
	
}
