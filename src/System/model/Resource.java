package System.model;

import System.model.EmbeddedFile;
import System.model.Image;
import System.model.Page;

import java.util.ArrayList;
import java.util.List;

public class Resource {
	//resources can either be pages or part of the content on a page

	private ArrayList<String> userList = new ArrayList<>();
	private String link;
	private Content content;

	ArrayList<Page> pageList;
	ArrayList<Image> imageList;
	ArrayList<EmbeddedFile> embeddedFileList;
	
	public Resource(ArrayList<String> users, String link, Content content) {
		//initialize the users with permission to access and the page link
		this.userList = users;
		this.link = link;
		//set content when resource is created; content cannot be changed
		this.content = content;
	}
	public void addToResource(Image image){ //upload an image to resource
		imageList.add(image);
	}
	public void addToResource(EmbeddedFile embeddedFile){ //upload an image to resource
		embeddedFileList.add(embeddedFile);
	}
	void getAllFiles(){ // get images and files, send to file access
	
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

