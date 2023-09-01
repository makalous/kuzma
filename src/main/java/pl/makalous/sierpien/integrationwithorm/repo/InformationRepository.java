package pl.makalous.sierpien.integrationwithorm.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.makalous.sierpien.integrationwithorm.repo.entites.InformationEntity;

@Repository
public interface InformationRepository extends CrudRepository<InformationEntity, Long> {
    @Override
    InformationEntity save(InformationEntity informationEntity);

    /*@Query("select a.name, a.gender, b.count from InformationEntity a join COunterEntity b on a.id=b.id")
    Set<Object[]> getFromJoinedTablesInfo();*/
}
