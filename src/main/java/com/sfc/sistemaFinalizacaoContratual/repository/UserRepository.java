package com.sfc.sistemaFinalizacaoContratual.repository;

import com.sfc.sistemaFinalizacaoContratual.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}