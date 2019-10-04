package com.e.pageview.Model;

import androidx.fragment.app.Fragment;

public class AlbumModelo {

    public int imagemAlbum;
    public String nomeAlbum;
    public Fragment fragmentAlbum;

    public AlbumModelo(int imagemAlbum, String nomeAlbum, Fragment fragmentAlbum) {
        this.imagemAlbum = imagemAlbum;
        this.nomeAlbum = nomeAlbum;
        this.fragmentAlbum = fragmentAlbum;
    }

    //02//
    public AlbumModelo(String nomeAlbum, Fragment fragmentAlbum) {
        this.nomeAlbum = nomeAlbum;
        this.fragmentAlbum = fragmentAlbum;
    }

    public int getImagemAlbum() {
        return imagemAlbum;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public Fragment getFragmentAlbum() {
        return fragmentAlbum;
    }

    public void setImagemAlbum(int imagemAlbum) {
        this.imagemAlbum = imagemAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public void setFragmentAlbum(Fragment fragmentAlbum) {
        this.fragmentAlbum = fragmentAlbum;
    }


}



