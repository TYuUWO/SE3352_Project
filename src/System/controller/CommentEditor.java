package System.controller;

import System.model.Comment;
import System.model.Page;

import java.util.Date;

public class CommentEditor { //add comment to the page as a viewer
    private String comment;
    private String name;
    private Date date;

   public void setComment(String name, Date date, String comment){
        this.name = name;
        this.date = date;
        this.comment = comment;
    }
    public void sendComment(Page page){ // send the comment to a specific page
        Comment objComment = new Comment(name,date,comment);
        page.addComment(objComment); // adds Comment to specific page
    } // send a comment to a specific page
}
