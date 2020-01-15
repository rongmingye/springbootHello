package com.example.helloworld.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.helloworld.common.api.ApiResponse;
import com.example.helloworld.entity.Article;

import java.util.List;

public interface ArticleService extends IService<Article> {

    public List<Article> getListByUserId(String userId);

    public ApiResponse addArticle(Article article);

}
