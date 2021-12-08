package System.model;

import java.util.List;

public class Page { // Here for layout of the page
    List<Comment> commentList;
    List<String> textList;
    public Page(){

    }

    void displayPage() {

    }
    public void addComment(Comment comment){
        commentList.add(comment);
    }
    public void addText(String text){
        textList.add(text);
    }

}
