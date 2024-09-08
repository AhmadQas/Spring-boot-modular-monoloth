package com.java.modularmonoloth.news.entity;

import com.java.modularmonoloth.domain.entity.BaseEntity;
import com.java.modularmonoloth.news.enumrations.NewsStatuses;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "news")
@Setter
@Getter
public class NewsEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "news_seq_gen")
    @SequenceGenerator(name = "news_seq_gen", sequenceName = "news_id_seq")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "title_arabic", nullable = false)
    private String titleArabic;

    @Lob
    @Column(name = "content")
    private String content;

    @Lob
    @Column(name = "content_arabic")
    private String contentArabic;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status", nullable = false)
    private NewsStatuses status = NewsStatuses.ACTIVE;

}
