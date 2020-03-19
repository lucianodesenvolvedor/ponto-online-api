package com.ponto.online.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ponto.online.api.entities.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario findByCpf(String cpf);

	Funcionario findByEmail(String email);

	Funcionario FindByCpfOrEmail(String cpf, String email);
}
