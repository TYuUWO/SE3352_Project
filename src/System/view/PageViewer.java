
package System.view;

import System.model.Page;

import java.util.ArrayList;

public class PageViewer {
	
	private String userId;
	private Page loginPage;
	private Page notFound;
	private ArrayList<Page> pageList = new ArrayList<>();
	
	public PageViewer(String userId, ArrayList<Page> pageList) {
		//load the user credentials and get ready to access the database
		this.userId = userId;
		this.pageList = pageList;
	}
	
	//user views page through link but must also be authorized to view the page
	public Page getPage(String link, String userId){
		//if page is not found then return the notFound page
		Page page = notFound;
		
		//get page with link
		for(int i=0;i<pageList.size();i++) {
			if (pageList.get(i).getLink()==link) {
				page = pageList.get(i);
			}
		}
		
		if (page.validate(userId)) {
			return page;
		}
		else {
			return loginPage;
		}
	}
}

