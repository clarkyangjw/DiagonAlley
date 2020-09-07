package com.clark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsedBook {

    private Integer id;
    private Integer categoryId;
    private String bookName;
    private String author;
    private String publisher;
    private String ISBN;
    private String school;
    private String courseCode;
    private Integer series;


}
