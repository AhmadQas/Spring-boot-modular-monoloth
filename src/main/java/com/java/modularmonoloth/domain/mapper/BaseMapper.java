package com.java.modularmonoloth.domain.mapper;


public interface BaseMapper<D, E> {

    E toEntity(D dto);

    D toDTO(E entity);

}
