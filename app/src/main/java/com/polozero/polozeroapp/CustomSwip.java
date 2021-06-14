package com.polozero.polozeroapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;


public class CustomSwip extends PagerAdapter {
    private int [] imageResources ={R.drawable.produtodasemana,R.drawable.newsletter};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwip(Context c) {
        ctx=c;
    }

    @Override
    public int getCount() {

        return imageResources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image_view);
        TextView textView=(TextView) itemView.findViewById(R.id.imageCount);
        imageView.setImageResource(imageResources[position]);
        textView.setText("Deslize para ver mais!");
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return  (view==object);
    }
}

