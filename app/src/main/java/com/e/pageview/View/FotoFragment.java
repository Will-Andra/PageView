package com.e.pageview.View;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.pageview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FotoFragment extends Fragment {


    //01//

    //Crio uma constante privada (utilizado no fragment)
    private static final String NOME = "nome";
    private static final String IMAGEM = "imagem";
    private TextView txtNomealbum;
    private ImageView imagAlbum;



    public FotoFragment() {
        // Required empty public constructor
    }

    //passando dados para o Fragmento e retornar um fragmento
    public static Fragment novaInstancia(int imagem, String nomeAlbum){
        //static - não precisa de instancia para ser chamado

        //criou uma própria instancia
        FotoFragment fotoFragment = new FotoFragment();
        Bundle bundle = new Bundle();

        bundle.putInt(IMAGEM, imagem);
        bundle.putString(NOME, nomeAlbum);
        fotoFragment.setArguments(bundle);
        // = set intent

        return fotoFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foto, container, false);

        initViews(view);

        if (getArguments() != null) {

            int imagemRecebida = getArguments().getInt(IMAGEM);
            String nomeRecebido = getArguments().getString(NOME);

            Drawable drawable = getResources().getDrawable(imagemRecebida);

            imagAlbum.setImageDrawable(drawable);
            txtNomealbum.setText(nomeRecebido);




        }

        return view;
    }

    private void initViews(View view){

        txtNomealbum = view.findViewById(R.id.textNomeAlbum);
        imagAlbum = view.findViewById(R.id.imageAlbum);

    }



}
