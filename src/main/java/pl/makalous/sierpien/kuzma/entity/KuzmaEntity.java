package pl.makalous.sierpien.kuzma.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KuzmaEntity {
    @Id
    private Long id;
    private String name;

    public KuzmaEntity() {
    }

    public KuzmaEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
