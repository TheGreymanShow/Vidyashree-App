package com.theGreymanShow.vidyashree;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by akshay dangare on 9/8/2016.
 */

public class CustomSwipeAdapter extends PagerAdapter {

    private int images[]={R.drawable.start3,R.drawable.slide2,R.drawable.slide1,R.drawable.slide3,R.drawable.slide6,R.drawable.slide4,R.drawable.slide7};
    private Context context;
    private LayoutInflater inflater;

    public CustomSwipeAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = (View) inflater.inflate(R.layout.swipe_layout,container,false);

        ImageView image = (ImageView) view.findViewById(R.id.image);
        image.setImageResource(images[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
