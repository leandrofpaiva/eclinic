package br.com.eclinic.infrastructure.medic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.eclinic.infrastructure.medic.entities.CargoEntity;

/**
 * @author javadev
 * 
 */
public interface CargoRepository extends
		JpaRepository<CargoEntity, Integer> {

	@Override
	@Query("select c from #{#entityName} c where ativo = 1")
	public List<CargoEntity> findAll();

	@Query("select c from #{#entityName} c where id_status = 1 and ativo = 1")
	public List<CargoEntity> list();
}
