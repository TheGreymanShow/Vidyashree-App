package com.theGreymanShow.vidyashree;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class CustomSwipeAdapter2 extends PagerAdapter {

    private int []toppers = {R.drawable.fe1,R.drawable.fe2,R.drawable.fe3,R.drawable.fe4,R.drawable.fe5,R.drawable.fe6};
    private Context context;
    private LayoutInflater inflater;

    public CustomSwipeAdapter2(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return toppers.length;
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
        image.setImageResource(toppers[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
