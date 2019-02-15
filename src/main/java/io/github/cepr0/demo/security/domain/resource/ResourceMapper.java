package io.github.cepr0.demo.security.domain.resource;

import io.github.cepr0.crud.mapper.CrudMapper;
import io.github.cepr0.demo.security.domain.resource.dto.ResourceRequest;
import io.github.cepr0.demo.security.domain.resource.dto.ResourceResponse;
import io.github.cepr0.demo.security.domain.user.UserMapper;
import io.github.cepr0.demo.security.model.Resource;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValueMappingStrategy.RETURN_DEFAULT;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
		nullValueCheckStrategy = ALWAYS,
		nullValueMappingStrategy = RETURN_DEFAULT,
		nullValuePropertyMappingStrategy = IGNORE,
		uses = UserMapper.class
)
public abstract class ResourceMapper implements CrudMapper<Resource, Integer, ResourceRequest, ResourceResponse> {
}
