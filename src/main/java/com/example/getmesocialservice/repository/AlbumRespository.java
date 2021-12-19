package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRespository {

    List<Album> albumList = new ArrayList<>();

    /*public Album getAlbum() {
        Album album = new Album("Abc","Abc Desc","no pic");
       return album;
    }*/

    public Album saveAlbum(Album album) {
        //System.out.println(album.getAlbumId());
        album.setAlbumId(albumList.size()+1);
        //System.out.println(album.getAlbumId());
        albumList.add(album);
        //System.out.println(album.getAlbumId());
        return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId()==albumId){
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album album1:albumList){
            if(album1.getAlbumId()==albumId){
                album1.setName(album.getName());
                album1.setDescription(album.getDescription());
                album1.setCoverPicUrl(album.getCoverPicUrl());
                return album1;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deleteAlbum = null;
        for (Album album1:albumList){
            if(album1.getAlbumId()==albumId){
                deleteAlbum = album1;
                albumList.remove(album1);
                return deleteAlbum;
            }
        }
        return deleteAlbum;
    }
}
