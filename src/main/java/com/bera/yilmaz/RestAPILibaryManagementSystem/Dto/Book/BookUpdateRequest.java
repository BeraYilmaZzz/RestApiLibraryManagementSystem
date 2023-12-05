package com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookUpdateRequest {
    private long id;
    @NotNull
    private String name;
    @NotNull
    private int publicationYear;
    @NotNull
    private int stock;

}
