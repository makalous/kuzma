package pl.makalous.integrationwithorm.repo.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class CounterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int count;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "counter_entity_id"),
            inverseJoinColumns = @JoinColumn(name = "information_entity_id"))
    private Set<InformationEntity> oneToOne;
}
