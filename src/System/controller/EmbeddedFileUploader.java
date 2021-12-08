package System.controller;

import System.model.EmbeddedFile;

public class EmbeddedFileUploader {
    private EmbeddedFile embeddedFile;

    void setEmbeddedFile(EmbeddedFile embeddedFile){ // get File from user's files, upload to the uploader
        this.embeddedFile = embeddedFile;
    }

    EmbeddedFile getEmbeddedFile(){ // upload embedded file to the page.
        return embeddedFile;
    }

}
