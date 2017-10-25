package com.jcyang;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Newspaper newspaper = new Newspaper();

        Scanner scanner = new Scanner(System.in);
        ArrayList<Article> articles2=new ArrayList<Article>();
        String repeatSwitch="";
        String articleTitle="";
        String articleContent="";
        String articleDate="";

       do {

           Article article = new Article();
            System.out.println("Enter the title of a new article");
            ArrayList<Article>articles=newspaper.getArticles();
             articleTitle = scanner.nextLine();
            article.setTitle(articleTitle);
            System.out.println("Enter the article");
             articleContent = scanner.nextLine();
            article.setContent(articleContent);
            System.out.println("Enter the date of the article");
             articleDate = scanner.nextLine();
            article.setDate(articleDate);
            articles2.add(article);
            newspaper.setArticles(articles2);

            System.out.println("Would you like to continue? Enter any key to continue or 'quit' to exit");
            repeatSwitch=scanner.nextLine();
        } while(!repeatSwitch.equalsIgnoreCase("quit"));

        String string1=newspaper.showArticles(newspaper.getArticles());
        System.out.println(string1);

    }
}
