package com.ponto.online.api.repositories;

import java.util.List;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ponto.online.api.entities.Lancamento;

@Transactional(readOnly = true)
@NamedNativeQueries({
		@NamedNativeQuery(name = "LancamentoRepository.findByFuncionarioId", query = "SELECT lancamneto FROM Lancamento lancamneto WHERE lancamento.funcionario.id = :funcionarioId") 
		})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	List<Lancamento> findByFuncionarioId(@Param("FuncionarioId") Long funcionarioId);

	Page<Lancamento> findByFuncionarioId(@Param("FuncionarioId") Long funcionarioId, Pageable pageable);
}
