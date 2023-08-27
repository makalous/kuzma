package pl.makalous.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class TestEntity2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String column2;

    @ManyToMany(mappedBy = "entity2Set")
    private Set<TestEntity> entitySet;

    // Getters and setters
}
