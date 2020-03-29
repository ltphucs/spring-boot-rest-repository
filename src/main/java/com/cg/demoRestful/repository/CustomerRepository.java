package com.cg.demoRestful.repository;

import com.cg.demoRestful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

@RepositoryRestResource
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
