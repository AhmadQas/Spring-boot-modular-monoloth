package com.java.modularmonoloth.news.web.rest;

import com.java.modularmonoloth.news.dto.NewsDTO;
import com.java.modularmonoloth.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
public class NewsController {


    @Autowired
    NewsService newsService;


    @GetMapping
    public Page<NewsDTO> getAll(@RequestParam int page, @RequestParam int size) {
        return newsService.getAll(page, size);
    }

    @GetMapping("/{id}")
    public NewsDTO getAll(@PathVariable long id) throws Exception {
        return newsService.getById(id);
    }

    @PostMapping
    public NewsDTO save(@RequestBody NewsDTO newsDTO) {
        return newsService.insert(newsDTO);
    }


    @PutMapping
    public NewsDTO update(@RequestBody NewsDTO newsDTO) throws Exception {
        return newsService.update(newsDTO);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) throws Exception {
        newsService.delete(id);
    }
}
