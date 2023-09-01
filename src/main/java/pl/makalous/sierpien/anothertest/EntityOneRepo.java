package pl.makalous.sierpien.anothertest;

import org.springframework.data.repository.CrudRepository;

public interface EntityOneRepo extends CrudRepository<EntityOne, Long> {
    @Override
    EntityOne save(EntityOne entityOneRepo);
}
