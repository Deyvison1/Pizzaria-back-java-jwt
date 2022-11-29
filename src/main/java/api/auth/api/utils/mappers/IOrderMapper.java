package api.auth.api.utils.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import api.auth.api.domain.dtos.OrderDTO;
import api.auth.api.domain.entity.Order;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IOrderMapper extends BaseEntityMapper<Order, OrderDTO> {
	
}
