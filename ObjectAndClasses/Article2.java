package ObjectAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Article2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> articleList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            articleList.add(article);
        }
        String command = scanner.nextLine();
        switch (command) {
            case "title":
                articleList.stream().sorted((s1,s2) -> s1.getTitle().compareTo(s1.getTitle()));
                //articleList.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articleList.stream().sorted((s1,s2) -> s1.getContent().compareTo(s1.getContent()));
               // articleList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articleList.stream().sorted((s1,s2) -> s1.author.compareTo(s1.getAuthor()));
                // articleList.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        System.out.println(articleList.toString());

    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s%n", getTitle(), getContent(), getAuthor());
        }
    }
}
