package mtc.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mtc.app.model.EventSeverityDowngrade;


@Repository
public interface MtcRepository extends CrudRepository<EventSeverityDowngrade, Long>{
	List<EventSeverityDowngrade> findByHostname(String Hostname);
}