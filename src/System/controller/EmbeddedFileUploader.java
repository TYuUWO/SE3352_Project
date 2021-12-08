package System.controller;

import System.model.EmbeddedFile;
import System.model.Resource;

public class EmbeddedFileUploader {
    private EmbeddedFile embeddedFile;

    void setEmbeddedFile(EmbeddedFile embeddedFile){ // get File from user's files, upload to the uploader
        this.embeddedFile = embeddedFile;
    }

    EmbeddedFile getEmbeddedFile(){ // upload embedded file to the page.
        return embeddedFile;
    }

    void uploadEmbeddedFile(Resource resource){
        resource.addToResource(getEmbeddedFile());
    }

}
