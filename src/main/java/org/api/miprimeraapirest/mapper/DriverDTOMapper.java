package org.api.miprimeraapirest.mapper;


import org.api.miprimeraapirest.model.Driver;
import org.api.miprimeraapirest.model.DriverDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface DriverDTOMapper {

    @Mappings({
            @Mapping(target = "code", source = "code"),
            @Mapping(target = "fullName", expression = "java(crearFullName(driver.getForename(), driver.getSurname()))"),
            @Mapping(target = "dob", source = "dob")
    })
    DriverDTO toDriverDTO(Driver driver);

    default String crearNombreCompleto(String forename, String surname){
        return forename + " " + surname;
    }

}
