package pl.makalous.sierpien.anothertest;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class SomeDto {
    private int id;
    private String idkNvm;
    private double price;
}
