package api.auth.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.auth.api.domain.entity.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {

}
