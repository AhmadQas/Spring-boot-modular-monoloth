package com.java.modularmonoloth.news.mapper;

import com.java.modularmonoloth.domain.mapper.BaseMapper;
import com.java.modularmonoloth.news.dto.NewsDTO;
import com.java.modularmonoloth.news.entity.NewsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsMapper extends BaseMapper<NewsDTO, NewsEntity> {
    @Override
    NewsDTO toDTO(NewsEntity entity);

    @Override
    NewsEntity toEntity(NewsDTO dto);
}
