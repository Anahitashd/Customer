package com.example.customer.config;

import com.example.customer.dto.AccountDto;
import com.example.customer.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(target = "id", ignore = true)
    Account toEntity(AccountDto dto);

    AccountDto toDTO(Account entity);
}
