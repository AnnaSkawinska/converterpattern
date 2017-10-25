package software.xsolve.converterpattern.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import software.xsolve.converterpattern.domain.BaseEntity;
import software.xsolve.converterpattern.dto.AbstractDto;

public interface GenericConverter<D extends AbstractDto, E extends BaseEntity>  {
	E createFrom(D dto);

	D createFrom(E entity);

	E updateEntity(E entity, D dto);

	default List<D> createFromEntities(final Collection<E> entities) {
		return entities.stream()
				.map(this::createFrom)
				.collect(Collectors.toList());
	}

	default List<E> createFromDtos(final Collection<D> dtos) {
		return dtos.stream()
				.map(this::createFrom)
				.collect(Collectors.toList());
	}
}
