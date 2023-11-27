package com.bbva.loanapplication.repository;

import com.bbva.loanapplication.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<Application, Integer> {
    @Query("SELECT COUNT(1) FROM Application A WHERE MONTH(A.create_date) = 11")
    long countByNovember();
}
