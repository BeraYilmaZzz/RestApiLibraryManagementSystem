package com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Book;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookResponse {
    private Long id;
    private String name;
    private int publicationYear;
    private int stock;
}
