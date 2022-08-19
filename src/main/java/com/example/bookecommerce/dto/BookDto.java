package com.example.bookecommerce.dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
public class BookDto {

    private String id;

    private String name;

    private int price;

    private Date updatedDate;

    private Date createdDate;

}
