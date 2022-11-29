package api.auth.api.service;

import java.util.List;

import api.auth.api.domain.dtos.ProductDTO;
import api.auth.api.domain.entity.Product;

public interface IProductService {

	ProductDTO add(Product product);
	
	List<ProductDTO> findAll();
}
