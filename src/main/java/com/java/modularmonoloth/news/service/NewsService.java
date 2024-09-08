package com.java.modularmonoloth.news.service;

import com.java.modularmonoloth.news.dto.NewsDTO;
import com.java.modularmonoloth.news.entity.NewsEntity;
import com.java.modularmonoloth.news.mapper.NewsMapper;
import com.java.modularmonoloth.news.repository.NewsRepository;
import org.apache.coyote.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

    Logger logger = LoggerFactory.getLogger(NewsService.class);

    private final NewsRepository newsRepository;

    private final NewsMapper newsMapper;

    public NewsService(@Autowired NewsRepository newsRepository, @Autowired NewsMapper newsMapper) {
        this.newsRepository = newsRepository;
        this.newsMapper = newsMapper;
    }

    public NewsDTO insert(NewsDTO newsDTO) {
        NewsEntity news = newsMapper.toEntity(newsDTO);
        return newsMapper.toDTO(newsRepository.save(news));
    }

    public NewsDTO update(NewsDTO newsDTO) throws BadRequestException {
        NewsEntity news = newsRepository.findById(newsDTO.getId()).orElse(null);
        if (news == null) {
            throw new BadRequestException("News doesn't exists");
        }
        news = newsMapper.toEntity(newsDTO);
        return newsMapper.toDTO(newsRepository.save(news));
    }

    public Page<NewsDTO> getAll(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        Page<NewsEntity> newsPage = newsRepository.findAll(pageable);
        return newsPage.map(newsMapper::toDTO);
    }

    public NewsDTO getById(long id) throws Exception {
        NewsEntity news = newsRepository.findById(id).orElse(null);
        if (news == null) {
            throw new BadRequestException("News doesn't exists");
        }
        return newsMapper.toDTO(news);
    }

    public void delete(long id) throws Exception {
        NewsEntity news = newsRepository.findById(id).orElse(null);
        if (news == null) {
            throw new BadRequestException("News doesn't exists");
        }
        newsRepository.delete(news);
    }

}
