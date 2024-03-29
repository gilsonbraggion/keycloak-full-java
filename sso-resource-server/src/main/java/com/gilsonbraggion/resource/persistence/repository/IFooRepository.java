package com.gilsonbraggion.resource.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gilsonbraggion.resource.persistence.model.Foo;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
