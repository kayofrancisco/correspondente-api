package br.com.correspondente.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.Advogado;

public interface AdvogadoRepository extends JpaRepository<Advogado, Long> {
    public List<Advogado> findByNome(String nome);
}