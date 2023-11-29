package com.bbva.loanservice.repository;

import com.bbva.loanservice.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanServiceRepository extends JpaRepository<Application, Integer> {

}
