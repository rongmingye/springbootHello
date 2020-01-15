package com.example.helloworld.controller;

import com.example.helloworld.common.api.ApiResponse;
import com.example.helloworld.entity.Article;
import com.example.helloworld.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/add")
    public ApiResponse add(Article article) {

        return articleService.addArticle(article);
    }

    @GetMapping("list")
    public ApiResponse list() {

        List<Article> articleList = articleService.list();

        return ApiResponse.successWithData(articleList);
    }

    @GetMapping("list/{userId}")
    public ApiResponse add(@RequestParam String userId) {

        List<Article> articleList = articleService.getListByUserId(userId);

        return ApiResponse.successWithData(articleList);
    }
}
