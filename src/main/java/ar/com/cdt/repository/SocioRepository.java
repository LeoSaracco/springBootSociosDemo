package ar.com.cdt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.cdt.entities.Socio;

/**
 *
 * @author lsaracco
 */
public interface SocioRepository extends JpaRepository<Socio, Long> {

}
