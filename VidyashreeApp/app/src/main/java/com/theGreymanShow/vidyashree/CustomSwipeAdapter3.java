package com.theGreymanShow.vidyashree;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class CustomSwipeAdapter3 extends PagerAdapter {

    private int []vidyashree = {R.drawable.vidya1,R.drawable.vidya2,R.drawable.vidya3,R.drawable.vidya4,R.drawable.vidya5,R.drawable.vidya6,R.drawable.vidya7,R.drawable.vidya8,R.drawable.vidya9,R.drawable.vidya10,R.drawable.vidya11,R.drawable.vidya12,R.drawable.vidya13};
    private Context context;
    private LayoutInflater inflater;

    public CustomSwipeAdapter3(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return vidyashree.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = (View) inflater.inflate(R.layout.swipe_layout2,container,false);

        ImageView image = (ImageView) view.findViewById(R.id.image1);
        image.setImageResource(vidyashree[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}

