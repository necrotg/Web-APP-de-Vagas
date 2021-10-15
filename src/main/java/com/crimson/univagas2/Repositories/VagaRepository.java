package com.crimson.univagas2.Repositories;

import com.crimson.univagas2.Model.Vaga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VagaRepository extends CrudRepository<Vaga, Long> {
}
