package System.controller;

import System.model.Page;

public class TextEditor {

    String saveString(Page page, String string){ // saves the string to the page
        page.addText(string);
        return string;
    }
}
