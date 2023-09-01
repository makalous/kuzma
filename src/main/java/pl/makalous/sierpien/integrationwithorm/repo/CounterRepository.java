package pl.makalous.sierpien.integrationwithorm.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.makalous.sierpien.integrationwithorm.repo.entites.CounterEntity;

@Repository
public interface CounterRepository extends CrudRepository<CounterEntity, Long> {
    @Override
    CounterEntity save(CounterEntity counterEntity);
}