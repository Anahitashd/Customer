package com.example.customer.config;

import com.example.customer.dto.AccountDto;
import com.example.customer.dto.CustomerDto;
import com.example.customer.model.Customer;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    Customer toEntity (CustomerDto dto);

    CustomerDto toDTO (Customer entity);
}
