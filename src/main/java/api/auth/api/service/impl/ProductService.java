package api.auth.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import api.auth.api.domain.dtos.ProductDTO;
import api.auth.api.domain.entity.Product;
import api.auth.api.domain.repository.IProductRepository;
import api.auth.api.service.IProductService;
import api.auth.api.utils.mappers.IProductMapper;

@Service
public class ProductService implements IProductService {

	private IProductRepository productRepository;
	private IProductMapper productMapper;
	
	public ProductService(IProductRepository productRepository, IProductMapper productMapper) {
		this.productRepository = productRepository;
		this.productMapper = productMapper;
	}
	
	@Override
	public ProductDTO add(Product product) {
		return productMapper.toDto(productRepository.save(product));
	}
	@Override
	public List<ProductDTO> findAll() {
		return productMapper.toDto(productRepository.findAll());
	}
	
	
}
