package com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {
    @NotNull
    private String name;
    @NotNull
    private int public_year;
    @NotNull
    private int stock;
}
