package com.company;

/**
 * Created by java on 09.12.2016.
 */
public class Album {
    String name;
    Page[] pages = new Page[20];


    Album(String name){
        this.name= name;
    }
    public void setPhotoTitle(String title, int photonum,int pageNum){
        if(pageNum<pages.length && pageNum > 1 && pages[pageNum] != null){
            pages[pageNum].setPhotoTitle(title, photonum);
        }
    }
}
