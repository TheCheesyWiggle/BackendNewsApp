package com.example.NewsBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArticleController {

    @GetMapping("/GetArticles")
    public ArrayList<Article> getArticle(){
        ArrayList<Article> Articles = new ArrayList<Article>();
        Articles.add(new Article(1,1,"title1","body1"));
        Articles.add(new Article(1,2,"title2","body2"));
        Articles.add(new Article(1,3,"title3","body3"));
        Articles.add(new Article(1,4,"title4","body4"));
        return Articles;
    }
}
