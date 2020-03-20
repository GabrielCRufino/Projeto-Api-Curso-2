package com.feira.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feira.projeto.domain.Barraca;

@Repository
public interface BarracaRepository extends JpaRepository<Barraca, Integer>{

}
