package System.controller;

import System.model.Image;

public class ImageUploader {
    private Image image;

    void setImage(Image imageFile) { // get image from user files to the image uploader
        imageFile = image;
    }

    Image getImage(){
        return image;
    }
    // returns image that was uploaded to the page

}
