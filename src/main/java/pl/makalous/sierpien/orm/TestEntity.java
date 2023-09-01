package pl.makalous.sierpien.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String column1;

    @ManyToMany
    @JoinTable(name = "entity_relation",
            joinColumns = @JoinColumn(name = "test_entity_id"),
            inverseJoinColumns = @JoinColumn(name = "test_entity2_id"))
    private Set<TestEntity2> entity2Set;

    // Getters and setters
}
