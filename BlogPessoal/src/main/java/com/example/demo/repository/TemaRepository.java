package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	//pega tudo que a pessoa digita e ignora o maisculo e minusculo
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
	
	
	@Query(value = "select*from tb_tema where descricao like '%Leis%' ", nativeQuery = true)
	List<Tema> Pesq();

}
