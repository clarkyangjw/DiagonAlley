package com.clark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Description;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advertising {

    private Integer id;
    private String name;
    private Integer itemId;
    private Integer price;
    private String description;
    private Integer advertisingCategoryId;
    private Date publishDate;
    private Date lastUpdate;
    private Integer AdvertisingStatusId;

}
