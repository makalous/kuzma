package pl.makalous.sierpien.mvc.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Team {
    private int id;
    private String name;
    private String colour;
    private int howManyPlayers;
}
