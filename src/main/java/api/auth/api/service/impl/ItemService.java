package api.auth.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import api.auth.api.domain.dtos.ItemDTO;
import api.auth.api.domain.entity.Item;
import api.auth.api.domain.repository.IItemRepository;
import api.auth.api.exception.NotFoundException;
import api.auth.api.service.IItemService;
import api.auth.api.utils.mappers.IItemMapper;

@Service
public class ItemService implements IItemService {

	private IItemRepository itemRepo;
	private IItemMapper itemMapper;
	
	public ItemService(IItemRepository itemRepo, IItemMapper itemMapper) {
		this.itemRepo = itemRepo;
		this.itemMapper = itemMapper;
	}
	
	@Override
	public ItemDTO add(Item item) {
		return itemMapper.toDto(itemRepo.save(item));
	}

	@Override
	public void remove(ItemDTO item) {	
		itemRepo.delete(itemMapper.toEntity(item));
	}

	@Override
	public List<ItemDTO> findByOrder(Long orderId) {	
		Optional<List<Item>> itens = itemRepo.findByTableOrderId(orderId);
		return itemMapper.toDto(itens.orElseThrow( () -> new NotFoundException()));
	}

}
