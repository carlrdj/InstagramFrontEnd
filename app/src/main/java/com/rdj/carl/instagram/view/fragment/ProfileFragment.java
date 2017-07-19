package com.rdj.carl.instagram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;

import com.rdj.carl.instagram.R;
import com.rdj.carl.instagram.adapter.PictureAdapterRecyclerView;
import com.rdj.carl.instagram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        RecyclerView rvPicture = (RecyclerView) view.findViewById(R.id.rvPicture);
        rvPicture.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPicture(), R.layout.cardview_picture, getActivity());
        rvPicture.setAdapter(pictureAdapterRecyclerView);


        return view;


    }

    private ArrayList<Picture> buildPicture() {
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://lorempixel.com/400/200/cats/1", "Carl RDJ", "1 dias", "12"));
        pictures.add(new Picture("http://lorempixel.com/400/200/cats/6", "Carl RDJ", "2 dias", "30"));
        pictures.add(new Picture("http://lorempixel.com/400/200/cats/2", "Carl RDJ", "3 dias", "11"));
        pictures.add(new Picture("http://lorempixel.com/400/200/cats/3", "Carl RDJ", "4 dias", "21"));
        pictures.add(new Picture("http://lorempixel.com/400/200/cats/4", "Carl RDJ", "5 dias", "5"));
        pictures.add(new Picture("http://lorempixel.com/400/200/cats/5", "Carl RDJ", "6 dias", "7"));
        return pictures;
    }

}
