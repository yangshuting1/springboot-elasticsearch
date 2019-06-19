package com.yst.springbootelasticsearch.entity;

import com.yst.springbootelasticsearch.common.Constant;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = Constant.USER_INDEX, type = Constant.USER_TYPE)
public class User {
    @Id
    private String userID;
    private String name;
    private Integer age;
    private String address;
    private Integer sex;
}
