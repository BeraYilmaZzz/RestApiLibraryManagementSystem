package com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PublisherSaveRequest {

    private String name;

    private int year;
}
