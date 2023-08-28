package pl.makalous.orm;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TestEntity2Repository extends CrudRepository<TestEntity2, Long> {
    @Query("SELECT a.id, a.column1, b.column2 FROM TestEntity a JOIN TestEntity2 b ON a.id = b.id")
    Set<Object[]> innerJoinTestEntitiesAndTestEntities2();

    TestEntity2 save(TestEntity2 testEntity2);
}
