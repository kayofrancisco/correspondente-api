package br.com.correspondente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.Local;

public interface LocalRepository extends JpaRepository<Local, Long> {
}