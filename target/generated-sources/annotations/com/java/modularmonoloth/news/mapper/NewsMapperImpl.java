package com.java.modularmonoloth.news.mapper;

import com.java.modularmonoloth.news.dto.NewsDTO;
import com.java.modularmonoloth.news.entity.NewsEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-08T22:08:45+0300",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class NewsMapperImpl implements NewsMapper {

    @Override
    public NewsDTO toDTO(NewsEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NewsDTO newsDTO = new NewsDTO();

        newsDTO.setCreatedDate( entity.getCreatedDate() );
        newsDTO.setUpdatedDate( entity.getUpdatedDate() );
        newsDTO.setCreatedBy( entity.getCreatedBy() );
        newsDTO.setUpdatedBy( entity.getUpdatedBy() );
        if ( entity.getId() != null ) {
            newsDTO.setId( entity.getId() );
        }
        newsDTO.setTitle( entity.getTitle() );
        newsDTO.setTitleArabic( entity.getTitleArabic() );
        newsDTO.setContent( entity.getContent() );
        newsDTO.setContentArabic( entity.getContentArabic() );

        return newsDTO;
    }

    @Override
    public NewsEntity toEntity(NewsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        NewsEntity newsEntity = new NewsEntity();

        newsEntity.setCreatedDate( dto.getCreatedDate() );
        newsEntity.setUpdatedDate( dto.getUpdatedDate() );
        newsEntity.setCreatedBy( dto.getCreatedBy() );
        newsEntity.setUpdatedBy( dto.getUpdatedBy() );
        newsEntity.setId( dto.getId() );
        newsEntity.setTitle( dto.getTitle() );
        newsEntity.setTitleArabic( dto.getTitleArabic() );
        newsEntity.setContent( dto.getContent() );
        newsEntity.setContentArabic( dto.getContentArabic() );

        return newsEntity;
    }
}
