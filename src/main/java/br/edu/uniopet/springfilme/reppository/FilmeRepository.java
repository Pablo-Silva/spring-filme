package br.edu.uniopet.springfilme.reppository;

import br.edu.uniopet.springfilme.domain.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
