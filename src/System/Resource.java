package System;

import java.util.ArrayList;

public class Resource {
	//resources can either be pages or part of the content on a page

	private ArrayList<String> userList = new ArrayList<>();
	private String link;
	private Content content;
	
	public Resource(ArrayList<String> users, String link, Content content) {
		//initialize the users with permission to access and the page link
		this.userList = users;
		this.link = link;
		//set content when resource is created; content cannot be changed
		this.content = content;
	}
	
	public String getLink() {
		return link;
	}
	//no setLink because link cannot be changed
	
	//check whether user has permission to access the resource
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
