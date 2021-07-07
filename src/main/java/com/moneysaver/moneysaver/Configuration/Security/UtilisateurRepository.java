package com.moneysaver.moneysaver.Configuration.Security;

import com.moneysaver.moneysaver.DAO.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtilisateurRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String username);
}
