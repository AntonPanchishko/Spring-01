package service.impl;

import dto.UserResponseDto;
import model.User;
import org.springframework.stereotype.Service;
import service.UserMapper;

@Service
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponseDto toDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        dto.setLastname(user.getLastname());
        dto.setId(user.getId());
        return dto;
    }
}
