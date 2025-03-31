package br.com.correspondente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correspondente.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}