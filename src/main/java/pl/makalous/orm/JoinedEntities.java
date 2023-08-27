package pl.makalous.orm;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class JoinedEntities {
    private Long id;
    private String column1;
    private String column2;
}
