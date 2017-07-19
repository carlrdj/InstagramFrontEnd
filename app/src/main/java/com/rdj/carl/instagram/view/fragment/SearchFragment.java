package com.rdj.carl.instagram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvPicture);
        recyclerView.setLayoutManager(gridLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPicture(), R.layout.cardview_picture, getActivity());
        recyclerView.setAdapter(pictureAdapterRecyclerView);
        return view;


    }

    private ArrayList<Picture> buildPicture() {
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://lorempixel.com/400/200/food/1", "Carl RDJ", "1 dias", "1108"));
        pictures.add(new Picture("http://lorempixel.com/400/200/food/6", "Julia S.", "2 dias", "897"));
        pictures.add(new Picture("http://lorempixel.com/400/200/food/2", "Lady", "3 dias", "246"));
        pictures.add(new Picture("http://lorempixel.com/400/200/food/3", "Luis", "4 dias", "879"));
        pictures.add(new Picture("http://lorempixel.com/400/200/food/4", "Camila", "5 dias", "665"));
        pictures.add(new Picture("http://lorempixel.com/400/200/food/5", "Sr. Code", "6 dias", "14"));
        return pictures;
    }
}
