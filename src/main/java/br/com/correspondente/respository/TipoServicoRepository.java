package br.com.correspondente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.TipoServico;

public interface TipoServicoRepository extends JpaRepository<TipoServico, Long> {
}