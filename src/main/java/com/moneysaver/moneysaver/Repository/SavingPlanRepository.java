package com.moneysaver.moneysaver.Repository;

import com.moneysaver.moneysaver.DAO.SavingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingPlanRepository extends JpaRepository<SavingPlan , Long> {


}
