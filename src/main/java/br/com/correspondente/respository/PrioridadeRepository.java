package br.com.correspondente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.Prioridade;

public interface PrioridadeRepository extends JpaRepository<Prioridade, Long> {
}