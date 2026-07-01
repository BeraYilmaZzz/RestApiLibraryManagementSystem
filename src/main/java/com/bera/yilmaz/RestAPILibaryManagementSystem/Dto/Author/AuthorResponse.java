package com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AuthorResponse {
    private int id;
    private String name;
    private LocalDate birthYear;
    private String country;
}
