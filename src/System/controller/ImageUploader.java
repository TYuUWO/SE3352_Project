package System.controller;

import System.model.Image;
import System.model.Resource;

public class ImageUploader {
    private Image image;

    void setImage(Image imageFile) { // get image from user files to the image uploader
        imageFile = image;
    }

    Image getImage(){
        return image;
    }
    // returns image that was uploaded to the page

    void uploadImage(Resource resource){
        resource.addToResource(getImage());
    }
}
