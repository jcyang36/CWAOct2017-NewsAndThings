package com.jcyang;

import java.util.ArrayList;

public class Newspaper {
    private String title;
    private ArrayList<Article> articles;

public  Newspaper(){
    articles = new ArrayList<Article>();
}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
    public void addArticle(Article anArticle){
    articles.add(anArticle);
    }

    public String showArticles(ArrayList<Article> articles){
        String result="";
        for(Article a: articles){
            result+=a.getTitle();
            result+="\n";
            result+=a.getContent();
            result+="\n";
            result+=a.getDate();
            result+="\n";

        }
        return result;
    }
}
