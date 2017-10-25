package com.jcyang;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Newspaper newspaper = new Newspaper();
        ArrayList<Article> articles2=new ArrayList<Article>();
        Article article = new Article();
        Scanner scanner = new Scanner(System.in);
        String repeatSwitch="";
        String articleTitle="";
        String articleContent="";
        String articleDate="";

        while(!repeatSwitch.equalsIgnoreCase("quit")) {
            System.out.println("Enter the title of a new article");
             articleTitle = scanner.nextLine();
            article.setTitle(articleTitle);
            System.out.println("Enter the article");
             articleContent = scanner.nextLine();
            article.setContent(articleContent);
            System.out.println("Enter the date of the article");
             articleDate = scanner.nextLine();
            article.setDate(articleDate);
            newspaper.addArticle(article);
            for(Article article2: newspaper.getArticles()){
                System.out.println(article2.getContent());
            }
            System.out.println("Would you like to continue? Enter any key to continue or 'quit' to exit");
            repeatSwitch=scanner.nextLine();
        }

        String string1=newspaper.showArticles(newspaper.getArticles());
        System.out.println(string1);

    }
}
