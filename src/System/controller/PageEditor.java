package System.controller;

import System.model.Page;

public class PageEditor {
    public Page page;

    public PageEditor(Page page){ //gets called when edit button is pressed on FileViewer
        this.page = page;
    } // gets page from resource to edit the page

    void uploadImage(){}

    void uploadEmbeddedFile(){}

    void addText(String string){}
}
