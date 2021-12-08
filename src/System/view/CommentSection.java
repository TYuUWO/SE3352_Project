package System.view;

import System.controller.CommentEditor;
import System.model.Comment;
import System.model.Page;

import java.util.ArrayList;
import java.util.List;

public class CommentSection { // shows the comment section
    private ArrayList<Comment> commentList;
    private Page page;
    public CommentSection(){}

    String displayCommentSection(Page page){ //display the comment section
        this.page = page; // Set private value of page for sending comments later
        String comments ="";
        commentList = page.getCommentList();
        for(Comment comment : commentList){
            comments += "\n" + comment.getName() + "\n" + comment.getDate() + "\n" + comment.getDesc();
        }
        return comments;
    }
    void addComment(){
        CommentEditor comment = new CommentEditor();
        //Ask user for comment
        comment.setComment("Name", System.currentTimeMillis(),"The comment.");
        comment.sendComment(page);
    }

}
