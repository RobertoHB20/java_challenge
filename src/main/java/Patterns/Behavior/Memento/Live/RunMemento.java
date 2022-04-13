package Patterns.Behavior.Memento.Live;

public class RunMemento {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Article article = new Article("Cantinflas", "Ahi esta el detalle");

        article.setText(article.getText() + " es una pelicula comica");

        System.out.println(article.getText());
        caretaker.addMemento(article.createMemento());

        article.setText(article.getText() + " y protagonizada por Mario Moreno Cantinflas");
        System.out.println(article.getText());
        caretaker.addMemento(article.createMemento());

        article.setText(article.getText() + " y Leonardo Di Caprio");
        System.out.println(article.getText());

        ArticleMemento memento1 = caretaker.getMemento(0);
        ArticleMemento memento2 = caretaker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println(article.getText());

        article.restoreMemento(memento2);
        System.out.println(article.getText());

        article.setText(article.getText() + " y otros actores");
        System.out.println(article.getText());

    }
}
