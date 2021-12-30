package com.crimson.univagas2.Repositories;

import com.crimson.univagas2.Model.Aplicante;
import com.crimson.univagas2.Model.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AplicanteRepository extends CrudRepository<Aplicante, Long> {
}
