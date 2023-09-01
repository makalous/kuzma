package pl.makalous.sierpien.anothertest;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EntityTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double price;
    private String date;
    @JoinTable(joinColumns = @JoinColumn(name = "entity_two_id"),
            inverseJoinColumns = @JoinColumn(name = "entity_one_id"))
    @ManyToOne
    private Set<EntityOne> joinResult;
}
