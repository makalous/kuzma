package pl.makalous.integrationwithorm.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class ApiResponseDto {
    private int count;
    private String name;
    private String gender;
    private Double probability;

    public ApiResponseDto() {
    }
}
