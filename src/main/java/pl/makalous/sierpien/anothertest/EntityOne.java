package pl.makalous.sierpien.anothertest;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EntityOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JoinTable(joinColumns = @JoinColumn(name = "entity_one_id"),
            inverseJoinColumns = @JoinColumn(name = "entity_two_id"))
    @OneToMany
    private Set<EntityTwo> joinResult;
}
