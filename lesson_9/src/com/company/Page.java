package com.company;

/**
 * Created by java on 09.12.2016.
 */
public class Page {
    int pageNum;
    Photo[] photos;
    boolean notFull = true;

    Page(int pageNum){
        this.pageNum = pageNum;
        this.photos = new Photo[10];
    }
    public void addPhoto(Photo photo){
        for (int i = 0; i < photos.length && photos[i] == null; i++){
            photos[i] = photo;
            if(i == photos.length - 1) notFull= false;
            break;
        }
    }
    public void setPhotoTitle(String title, int photonum){
       if( photonum<photos .length && photonum > 1 &&photos[photonum] != null){
           photos[photonum].setTitle(title);
       }
    }
}
