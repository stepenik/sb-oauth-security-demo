package io.github.cepr0.crud.service;

import io.github.cepr0.crud.model.CrudRequest;
import io.github.cepr0.crud.model.CrudResponse;
import io.github.cepr0.crud.model.IdentifiableEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudService<T extends IdentifiableEntity<ID>, ID extends Serializable, Q extends CrudRequest, S extends CrudResponse<ID>> {
	@NonNull S create(@NonNull Q request);
	@NonNull T create(@NonNull T entity);

	@NonNull Optional<S> getOne(@NonNull ID id);
	@NonNull List<S> getAll(@NonNull Pageable pageable);
	@NonNull List<S> getAll(@NonNull Sort sort);
	@NonNull List<S> getAll();

	@NonNull Optional<S> update(@NonNull ID id, @NonNull Q request);
	@NonNull T update(@NonNull T entity);

	@NonNull boolean delete(@NonNull ID id);
}
