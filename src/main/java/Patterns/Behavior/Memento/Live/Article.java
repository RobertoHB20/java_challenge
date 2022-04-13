package Patterns.Behavior.Memento.Live;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Article {

    private String author;
    private String text;

    public ArticleMemento createMemento(){
        ArticleMemento memento = new ArticleMemento(this.author, this.text);
        return memento;
    }

    public void restoreMemento(ArticleMemento memento){
        this.author = memento.getAuthor();
        this.text = memento.getText();
    }
}
