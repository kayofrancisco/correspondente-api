package br.com.correspondente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}