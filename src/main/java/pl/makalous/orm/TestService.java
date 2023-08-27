package pl.makalous.orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class TestService {
    private TestEntity2Repository testEntity2Repository;

    @Autowired
    TestService(TestEntity2Repository testEntity2Repository) {
        this.testEntity2Repository = testEntity2Repository;
    }

    public List<JoinedEntities> useInTheController() {
        Set<Object[]> toApply = testEntity2Repository.innerJoinTestEntitiesAndTestEntities2();
        List<JoinedEntities> toReturn = new ArrayList<>();
        for (Object[] iterate : toApply) {
            toReturn.add(JoinedEntities.builder()
                    .id((Long) iterate[0])
                    .column1((String) iterate[1])
                    .column2((String) iterate[2]).build());
        }
        return toReturn;
    }
}
