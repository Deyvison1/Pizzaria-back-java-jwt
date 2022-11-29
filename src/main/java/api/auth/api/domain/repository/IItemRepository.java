package api.auth.api.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.auth.api.domain.entity.Item;

@Repository
public interface IItemRepository extends JpaRepository<Item, Long> {
	
	Optional<List<Item>> findByTableOrderId(Long id);
}
