package pl.makalous.sierpien.orm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class ControllerInputDto {
    private int id;
    private String column;
}
