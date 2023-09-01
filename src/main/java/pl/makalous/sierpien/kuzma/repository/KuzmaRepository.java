package pl.makalous.sierpien.kuzma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.makalous.sierpien.kuzma.entity.KuzmaEntity;

@Repository
public interface KuzmaRepository extends CrudRepository<KuzmaEntity, Long> {

}
