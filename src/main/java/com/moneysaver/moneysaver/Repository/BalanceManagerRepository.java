package com.moneysaver.moneysaver.Repository;

import com.moneysaver.moneysaver.DAO.BalanceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BalanceManagerRepository extends JpaRepository<BalanceManager,Long> {
    @Query(
      value = "SELECT b FROM BalanceManager b  JOIN b.subCategory s JOIN  s.category c JOIN b.savingPlan sp JOIN sp.users us WHERE c.type=?1  and us.idUser =?2 and sp.idSavingPlan =?3")
    List<BalanceManager> findAllBalanceManagerByType(String type , Long id,Long idBalanceManager);
}
