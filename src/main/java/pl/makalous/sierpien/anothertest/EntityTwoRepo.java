package pl.makalous.sierpien.anothertest;

import org.springframework.data.repository.CrudRepository;

public interface EntityTwoRepo extends CrudRepository<EntityTwo, Long> {
    @Override
    EntityTwo save(EntityTwo entityTwo);
}
