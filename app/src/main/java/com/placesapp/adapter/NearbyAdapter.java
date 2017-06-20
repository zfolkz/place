package com.placesapp.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.placesapp.activity.MapActivity;
import com.placesapp.common.MetadataCommon;
import com.placesapp.fragment.NearbyFragment;
import com.placesapp.interfaces.OnFavCallBack;
import com.placesapp.R;
import com.placesapp.model.PlaceData;
import com.placesapp.service.PlacesManager;

import java.util.ArrayList;

/**
 * Created by zfolkz on 6/16/2017 AD.
 */

public class NearbyAdapter extends RecyclerView.Adapter<NearbyAdapter.NearbyViewHolder> {

    ArrayList<PlaceData> placeDataArrayList = new ArrayList<>();
    Activity mActivity;
    private OnFavCallBack onFavCallBack;
    public NearbyAdapter(Activity activity, ArrayList<PlaceData> placeDataArrayList) {
        this.placeDataArrayList = placeDataArrayList;
        this.mActivity = activity;
    }

    @Override
    public NearbyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row, parent, false);
        return new NearbyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NearbyViewHolder holder, final int position) {
        final PlaceData p = placeDataArrayList.get(position);

        holder.txt1.setText(p.getName());
        if (p.isFav()){
            holder.favImage.setImageResource(R.drawable.icon_favorite_active);
        }else{
            holder.favImage.setImageResource(R.drawable.icon_favorite);
        }
        holder.favImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onFavCallBack.callbackCall(p,position);
            }
        });
        holder.url.setText(p.getUrlLink());
        holder.nearbyRecyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mActivity,MapActivity.class);
                i.putExtra("locationData",placeDataArrayList.get(position));
                mActivity.startActivityForResult(i, NearbyFragment.REQUEST_CODE);
            }
        });
        Glide.with(mActivity).load(PlacesManager.BaseUrl+"maps/api/place/photo?maxwidth=400&photoreference="+p.getImageRef()+"&key="+ MetadataCommon.getInstance().getPlaceAPIKey(mActivity)).placeholder(R.mipmap.ic_launcher).into(holder.nearbyImage);
       // Glide.with(mActivity).load(p.getImageRef()).into(holder.nearbyImage);

    }


    @Override
    public int getItemCount() {
        return placeDataArrayList.size();
    }


    public static class NearbyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt1,url;
        private ImageView favImage,nearbyImage;
        private View nearbyRecyclerview;
        private NearbyViewHolder(View v) {
            super(v);
            this.txt1 = (TextView) v.findViewById(R.id.txt1);
            this.url = (TextView) v.findViewById(R.id.url);
            this.favImage = (ImageView) v.findViewById(R.id.fav);
            nearbyRecyclerview = v.findViewById(R.id.nearby_recyclerview);
            nearbyImage = (ImageView)v.findViewById(R.id.nearby_image);
        }
    }
    public void setFavClickListenner(OnFavCallBack onFavCallBack){
        this.onFavCallBack = onFavCallBack;
    }

}
