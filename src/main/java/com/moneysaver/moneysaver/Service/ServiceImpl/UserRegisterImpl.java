package com.moneysaver.moneysaver.Service.ServiceImpl;

import com.moneysaver.moneysaver.DAO.Users;
import com.moneysaver.moneysaver.DTO.Mapping.Converter.UserRegisterConverter;
import com.moneysaver.moneysaver.DTO.UserRegisterDTO;
import com.moneysaver.moneysaver.Repository.UserRepository;
import com.moneysaver.moneysaver.Service.IService.IUserRegisterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterImpl implements IUserRegisterImpl {

    @Autowired
    private UserRegisterConverter userRegisterConverter;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRegisterDTO saveNewUser(UserRegisterDTO userRegisterDTO){
        Users user = userRegisterConverter.convertToEntity(userRegisterDTO);
        userRepository.save(user);
        return userRegisterConverter.convertToDTO(user);
    }
}
