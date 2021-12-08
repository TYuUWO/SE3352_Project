package System.view;

import java.util.ArrayList;

import System.model.Page;
import System.model.Resource;

public class FileViewer {
	
	private String userId;
	private ArrayList<Resource> resourceList = new ArrayList<>();
	
	public FileViewer(String userId, ArrayList<Resource> resourceList) {
		//load the user credentials and get ready to access the database
		this.userId = userId;
		this.resourceList = resourceList;
	}
	
	private FileAccess accessFile = new FileAccess(userId, resourceList);
	
	//user views resource through link but must also be authorized to view the resource
	public Resource displayResource(String link, String userId){
		//the real implementation would have code that displays the resource instead of a return
		return accessFile.getResource(link, userId);
	}
}
