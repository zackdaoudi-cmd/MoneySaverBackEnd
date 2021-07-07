package com.moneysaver.moneysaver.Repository;

import com.moneysaver.moneysaver.DAO.Users;
import com.moneysaver.moneysaver.DTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    Users findSavingPlanByIdUser(Long Iduser);



}
