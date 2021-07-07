package com.moneysaver.moneysaver.DTO.Mapping.Converter;

import com.moneysaver.moneysaver.DAO.Users;
import com.moneysaver.moneysaver.DTO.Mapping.BaseDTOConverter.BaseDTOConverter;
import com.moneysaver.moneysaver.DTO.UserRegisterDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRegisterConverter extends BaseDTOConverter<UserRegisterDTO, Users> {
    @Override
    public UserRegisterDTO convertToDTO(Users entity) {
        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
        userRegisterDTO.setIdUser(entity.getIdUser());
        userRegisterDTO.setUsername(entity.getUsername());
        userRegisterDTO.setPassword(entity.getPassword());
        userRegisterDTO.setCreateDate(entity.getCreateDate());

        return userRegisterDTO;
    }

    @Override
    public Users convertToEntity(UserRegisterDTO dto) {
        Users users = new Users();
        users.setIdUser(dto.getIdUser());
        users.setUsername(dto.getUsername());
        users.setPassword(dto.getPassword());
        users.setCreateDate(dto.getCreateDate());

        return users;
    }

    @Override
    public List<UserRegisterDTO> convertToListDTO(List<Users> entity) {
        return null;
    }

    @Override
    public List<Users> convertToListEntity(List<UserRegisterDTO> dto) {
        return null;
    }
}
