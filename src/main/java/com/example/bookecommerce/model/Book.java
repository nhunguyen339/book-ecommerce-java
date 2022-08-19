package com.example.bookecommerce.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Book {

    @Id
    private String id;

    private String name;

    private Integer price;

    private Date updatedDate;

}
