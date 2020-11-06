package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Postagem;

@Repository
public interface Postagemrepository extends JpaRepository<Postagem, Long>{
	
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
	
	@Query(value = "select*from postagem where ano > 2011", nativeQuery = true)
	List<Postagem> findAllMaior();
	
	@Query(value = "select*from postagem ORDER BY ano DESC", nativeQuery = true)
	List<Postagem> anosDesc();
	
	@Query(value = "select*from postagem ORDER BY ano ASC", nativeQuery = true)
	List<Postagem> anosAsc();
	
	@Query(value = "select*from postagem where ano >= 2011 and ano <=2013", nativeQuery = true)
	List<Postagem> anosIntervalos();
	
	@Query(value = "select*from postagem where titulo like '%Direito' ", nativeQuery = true)
	List<Postagem> PesqA();
	
	
	
	

}
