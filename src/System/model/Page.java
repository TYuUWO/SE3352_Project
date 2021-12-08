package System.model;

import System.model.Comment;

import java.util.ArrayList;
import java.util.List;

public class Page {
	
	private ArrayList<String> userList = new ArrayList<>();
	private String link;
	private something content;

	ArrayList<Comment> commentList;
	ArrayList<String> textList;
	
	public Page(ArrayList<String> users, String link) {
		//initialize the users with permission to access and the page link
		this.userList = users;
		this.link = link;
	}
	public void addComment(Comment comment){
		commentList.add(comment);
	}
	public void addText(String text){
		textList.add(text);
	}
	public ArrayList<Comment> getCommentList() {return commentList;}
	public String getLink() {
		return link;
	}
	//no setLink because link cannot be changed
	
	//method to change the page's content through the editor
	public void setContent(putsomethinghere) {
		this.content = putsomethinghere
	}
	
	//check whether user has permission to access the page
	public boolean validate(String userId) {
		boolean valid = false;
		for(int i=0;i<userList.size();i++) {
			if (userList.get(i)==userId) {
				valid = true;
			}
		}
		return valid;
	}
}
