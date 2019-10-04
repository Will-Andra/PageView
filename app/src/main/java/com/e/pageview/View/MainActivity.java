package com.e.pageview.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.e.pageview.Adapter.AlbumAdapter;
import com.e.pageview.Model.AlbumModelo;
import com.e.pageview.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //03//
        //definindo a lista e passando para o nosso gerenciador de conteúdo

        List<AlbumModelo> listaAlbum = new ArrayList<>();

        listaAlbum.add(new AlbumModelo("Big Ones",
                FotoFragment.novaInstancia(R.drawable.aero_novo,"Big Ones")));

        listaAlbum.add(new AlbumModelo("Big Two",
                FotoFragment.novaInstancia(R.drawable.aero_novo_dois,"Big Two")));

        listaAlbum.add(new AlbumModelo("Big Three",
                FotoFragment.novaInstancia(R.drawable.aero_novo_tres,"Big Three")));

        listaAlbum.add(new AlbumModelo("Dream On",
                FotoFragment.novaInstancia(R.drawable.dream_on,"Dream On")));

        AlbumAdapter adapter = new AlbumAdapter(getSupportFragmentManager(), listaAlbum);

        //mesma coisa que declarar la em cima
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        //tamanho do newpager
        viewPager.setOffscreenPageLimit(listaAlbum.size());

        //vincular c tab layout nosso viw pager
        tabLayout.setupWithViewPager(viewPager);



    }
}
