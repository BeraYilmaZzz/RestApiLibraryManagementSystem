package com.bera.yilmaz.RestAPILibaryManagementSystem.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name ="publisher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="establishment_year",nullable = false)
    private Integer establishmentYear;

    @Column(name="address",nullable = false)
    private String address;

    @OneToMany(mappedBy ="publisher",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Book> books;
}

