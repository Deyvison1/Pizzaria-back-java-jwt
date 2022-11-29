package api.auth.api.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.auth.api.domain.dtos.ProductDTO;
import api.auth.api.domain.entity.Product;
import api.auth.api.service.IProductService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

	private IProductService productService;
	
	@PostMapping
	public ResponseEntity<ProductDTO> add(@RequestBody Product product) {
		return ResponseEntity.ok(productService.add(product));
	}
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll() {
		return ResponseEntity.ok(productService.findAll());
	}
	
}
