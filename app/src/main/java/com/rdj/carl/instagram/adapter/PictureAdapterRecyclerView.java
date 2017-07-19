package com.rdj.carl.instagram.adapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rdj.carl.instagram.R;
import com.rdj.carl.instagram.model.Picture;
import com.rdj.carl.instagram.view.PictureDetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by SEVEN on 7/11/2017.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.tvCardViewNickname.setText(picture.getNickname());
        holder.tvCardViewTimeNumber.setText(picture.getDate());
        holder.tvCardViewLikesNumber.setText(picture.getLikes());
        Picasso.with(activity).load(picture.getPicture()).into(holder.ivCardViewPicture);
        holder.ivCardViewPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PictureDetailActivity.class);

                //activity.startActivity(intent);
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    Explode explode = new Explode();
                    explode.setDuration(100);
                    activity.getWindow().setExitTransition(explode);
                    activity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(activity, v, activity.getString(R.string.picture_transition)).toBundle());
                }else{
                    activity.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivCardViewPicture;
        private TextView tvCardViewNickname;
        private TextView tvCardViewTimeNumber;
        private TextView tvCardViewLikesNumber;

        public PictureViewHolder(View itemView) {
            super(itemView);

            ivCardViewPicture = (ImageView) itemView.findViewById(R.id.ivCardViewPicture);
            tvCardViewNickname = (TextView) itemView.findViewById(R.id.tvCardViewNickname);
            tvCardViewTimeNumber = (TextView) itemView.findViewById(R.id.tvCardViewTimeNumber);
            tvCardViewLikesNumber = (TextView) itemView.findViewById(R.id.tvCardViewLikesNumber);
        }
    }
}
