package com.e.pageview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.e.pageview.Model.AlbumModelo;

import java.util.List;

public class AlbumAdapter extends FragmentStatePagerAdapter {

    //Construtor fazemos na mão

    private List<AlbumModelo> albumList;

    public AlbumAdapter(FragmentManager fm, List<AlbumModelo> albumList){
        super(fm);
        this.albumList = albumList;
    }

    //Set o nome das guias
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return albumList.get(position).getNomeAlbum();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return albumList.get(position).getFragmentAlbum();
    }

    @Override
    public int getCount() {
        return albumList.size();
    }
}
