package api.auth.api.service;

import java.util.List;

import api.auth.api.domain.dtos.ItemDTO;
import api.auth.api.domain.entity.Item;

public interface IItemService {

	ItemDTO add(Item item);
	
	void remove(ItemDTO item);
	
	List<ItemDTO> findByOrder(Long orderId);
}
