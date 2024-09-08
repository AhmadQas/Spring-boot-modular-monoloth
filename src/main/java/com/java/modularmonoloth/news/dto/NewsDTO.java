package com.java.modularmonoloth.news.dto;


import com.java.modularmonoloth.domain.dto.BaseEntityDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Setter
@Getter
@ToString
public class NewsDTO extends BaseEntityDTO implements Serializable {
    private long id;
    private String title;
    private String titleArabic;
    private String content;
    private String contentArabic;
}
