package com.moneysaver.moneysaver.Repository;

import com.moneysaver.moneysaver.DAO.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegisterRepository extends JpaRepository<Users,Long> {
}
