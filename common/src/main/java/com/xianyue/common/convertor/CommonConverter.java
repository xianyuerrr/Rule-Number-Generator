package com.xianyue.common.convertor;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.Collection;

public interface CommonConverter<S, T> {
    T convert(S source);

    Collection<T> convert(Collection<S> sourceList);

    S convertReserve(T source);

    Collection<S> convertReserve(Collection<T> sourceList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    S partialUpdate(T ruleDto, @MappingTarget S ruleEntity);
}
