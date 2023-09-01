package pl.makalous.sierpien.integrationwithorm.repo.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class InformationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private Double probability;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "information_entity_id"),
            inverseJoinColumns = @JoinColumn(name = "counter_entity_id"))
    private Set<CounterEntity> oneToOne;
}
