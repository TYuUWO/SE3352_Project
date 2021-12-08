package System.model;

import java.util.List;
///////
// List of Resources://////////
//Image
//EmbeddedFile
//Text
//CommentName
//CommentDesc
//CommentDate
//Page
//////
public class Resource { // Image, files, text count as a resource, as well as the page themselves.

    List<Page> pageList;
    List<Image> imageList;
    List<EmbeddedFile> embeddedFileList;



    void addToResource(Image image){ //upload an image to resource
        imageList.add(image);
    }
    void addToResource(EmbeddedFile embeddedFile){ //upload an image to resource
        embeddedFileList.add(embeddedFile);
    }
    void getAllFiles(){ // get images and files, send to file access

    }
}
