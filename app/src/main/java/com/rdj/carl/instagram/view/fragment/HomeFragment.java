package com.rdj.carl.instagram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdj.carl.instagram.R;
import com.rdj.carl.instagram.adapter.PictureAdapterRecyclerView;
import com.rdj.carl.instagram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerView rvPicture = (RecyclerView) view.findViewById(R.id.rvPicture);
        rvPicture.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView( buildPicture() , R.layout.cardview_picture, getActivity());
        rvPicture.setAdapter(pictureAdapterRecyclerView);
        showToolbar(view.getResources().getString(R.string.tab_home), false, view);
        return view;
    }

    private ArrayList<Picture> buildPicture() {
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://lorempixel.com/400/200/nightlife/7", "Camila", "1 dias", "10"));
        pictures.add(new Picture("http://lorempixel.com/400/200/cats/1", "Lady", "2 dias", "10"));
        pictures.add(new Picture("http://lorempixel.com/400/200/animals/2", "Carl RDJ", "3 dias", "10"));
        pictures.add(new Picture("http://lorempixel.com/400/200/animals/3", "Carl RDJ", "4 dias", "10"));
        pictures.add(new Picture("http://lorempixel.com/400/200/animals/4", "Carl RDJ", "5 dias", "10"));
        pictures.add(new Picture("http://lorempixel.com/400/200/animals/5", "Carl RDJ", "6 dias", "10"));
        return pictures;
    }

    private void showToolbar(String title, boolean upButtom, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.tToolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButtom);
    }

}
