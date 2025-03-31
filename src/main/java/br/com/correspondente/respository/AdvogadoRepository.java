package br.com.correspondente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.Advogado;

public interface AdvogadoRepository extends JpaRepository<Advogado, Long> {
}