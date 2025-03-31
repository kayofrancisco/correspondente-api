package br.com.correspondente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.Audiencia;

public interface AudienciaRepository extends JpaRepository<Audiencia, Long> {
}