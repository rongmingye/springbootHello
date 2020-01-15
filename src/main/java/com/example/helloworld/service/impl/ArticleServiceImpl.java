package com.example.helloworld.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.helloworld.common.api.ApiResponse;
import com.example.helloworld.entity.Article;
import com.example.helloworld.mapper.ArticleMapper;
import com.example.helloworld.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> getListByUserId(String userId) {

        if (StringUtils.isEmpty(userId)) {
            return null;
        }

        QueryWrapper<Article> articleQueryWrapper = new QueryWrapper<>();
        articleQueryWrapper.like("user_id", userId);
        List  articleList = articleMapper.selectList(articleQueryWrapper);
        return articleList;
    }

    @Override
    public ApiResponse addArticle(Article article) {

        if (StringUtils.isEmpty(article.getTitle())) {
            return ApiResponse.failure("请输入文章标题");
        }

        baseMapper.insert(article);

        return ApiResponse.successWithData(article);
    }
}
