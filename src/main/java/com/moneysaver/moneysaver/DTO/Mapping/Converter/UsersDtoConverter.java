package com.moneysaver.moneysaver.DTO.Mapping.Converter;

import com.moneysaver.moneysaver.DAO.Users;
import com.moneysaver.moneysaver.DTO.Mapping.BaseDTOConverter.BaseDTOConverter;
import com.moneysaver.moneysaver.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersDtoConverter extends BaseDTOConverter<UserDTO, Users> {

    @Autowired
    private SavingPlanConverter savingPlanConverter;

    @Override
    public UserDTO convertToDTO(Users entity) {
        UserDTO usersDto = new UserDTO();
        usersDto.setIdUser(entity.getIdUser());
        usersDto.setUsername(entity.getUsername());
        usersDto.setCreateDate(entity.getCreateDate());
        usersDto.setSavingPlanDTOList(savingPlanConverter.convertToListDTO(entity.getSavingPlants()));

        return usersDto;
    }

    @Override
    public Users convertToEntity(UserDTO dto) {
        Users users = new Users();
        users.setIdUser(dto.getIdUser());
        users.setUsername(dto.getUsername());
        users.setCreateDate(dto.getCreateDate());
        users.setSavingPlants(savingPlanConverter.convertToListEntity(dto.savingPlanDTOList));

        return users;

    }

    @Override
    public List<UserDTO> convertToListDTO(List<Users> entity) {

        return null;
    }

    @Override
    public List<Users> convertToListEntity(List<UserDTO> dto) {
        return null;
    }
}
