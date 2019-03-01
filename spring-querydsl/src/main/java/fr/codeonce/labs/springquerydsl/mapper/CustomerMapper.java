package fr.codeonce.labs.springquerydsl.mapper;

import org.mapstruct.Mapper;

import fr.codeonce.labs.springquerydsl.dto.CustomerDto;
import fr.codeonce.labs.springquerydsl.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	
	CustomerDto mapToDto(Customer customer);
	
	CustomerDto mapToDto2(Customer customer);
	

}
