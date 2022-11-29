package api.auth.api.utils.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import api.auth.api.domain.dtos.ItemDTO;
import api.auth.api.domain.entity.Item;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IItemMapper extends BaseEntityMapper<Item, ItemDTO> {
}
