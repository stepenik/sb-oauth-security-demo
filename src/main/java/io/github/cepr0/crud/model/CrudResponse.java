package io.github.cepr0.crud.model;

import org.springframework.lang.Nullable;

import java.io.Serializable;

public interface CrudResponse<ID extends Serializable> extends Serializable {
	@Nullable ID getId();
}
