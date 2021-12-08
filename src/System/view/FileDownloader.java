package System.view;

import java.util.ArrayList;

import System.model.Page;
import System.model.Resource;

public class FileDownloader {
	
	private String userId;
	private ArrayList<Resource> resourceList = new ArrayList<>();
	
	public FileDownloader(String userId, ArrayList<Resource> resourceList) {
		//load the user credentials and get ready to access the database
		this.userId = userId;
		this.resourceList = resourceList;
	}
	
	private FileAccess accessFile = new FileAccess(userId, resourceList);
	
	//user downloads resource through link but must also be authorized to download the resource
	public Resource downloadResource(String link, String userId){
		//the real implementation would have code that executes the download instead of a return
		return accessFile.getResource(link, userId);
	}
}
