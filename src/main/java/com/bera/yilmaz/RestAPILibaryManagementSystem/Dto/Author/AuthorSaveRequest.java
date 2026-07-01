package com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Author;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorSaveRequest {
    @NotNull
    private String name;
    @NotNull
    private LocalDate birthday;
    @NotNull
    private String country;
}
