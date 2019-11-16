package com.danielyoshio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielyoshio.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
