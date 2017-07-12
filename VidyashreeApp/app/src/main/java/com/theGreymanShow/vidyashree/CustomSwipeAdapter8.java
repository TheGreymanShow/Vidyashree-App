package com.theGreymanShow.vidyashree;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by akshay dangare on 11/24/2016.
 */
public class CustomSwipeAdapter8 extends PagerAdapter {

    private int []toppers = {R.drawable.se1,R.drawable.se2,R.drawable.se3,R.drawable.se4,R.drawable.se5,R.drawable.se6};
    private Context context;
    private LayoutInflater inflater;

    public CustomSwipeAdapter8(Context context) {
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
