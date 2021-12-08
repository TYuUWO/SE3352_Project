package System.view;

import java.util.ArrayList;

import System.model.Resource;

public class FileAccess {
	private String userId;
	private ArrayList<Resource> resourceList = new ArrayList<>();
	
	public FileAccess(String userId, ArrayList<Resource> resourceList) {
		//load the user credentials and get ready to access the database
		this.userId = userId;
		this.resourceList = resourceList;
	}
	//return resource corresponding to the link given
	public Resource getResource(String link, String userId){
		//if resource is not found it will simply be null
		Resource resource = null;
		
		//get page with link
		for(int i=0;i<resourceList.size();i++) {
			if (resourceList.get(i).getLink()==link) {
				resource = resourceList.get(i);
			}
		}
		
		if (resource.validate(userId)) {
			return resource;
		}
		else {
			//do not return the resource
			return null;
		}
	}
}
