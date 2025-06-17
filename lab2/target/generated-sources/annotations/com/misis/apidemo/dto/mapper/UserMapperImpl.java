package com.misis.apidemo.dto.mapper;

import com.misis.apidemo.db.User;
import com.misis.apidemo.dto.UserCreateDTO;
import com.misis.apidemo.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-15T20:02:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.7 (Ubuntu)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UUID id = null;
        String name = null;
        String email = null;

        id = user.getId();
        name = user.getName();
        email = user.getEmail();

        UserDTO userDTO = new UserDTO( id, name, email );

        return userDTO;
    }

    @Override
    public User toEntity(UserCreateDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setName( userDTO.name() );
        user.setEmail( userDTO.email() );

        return user;
    }

    @Override
    public List<UserDTO> toDTOList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( toDTO( user ) );
        }

        return list;
    }
}
