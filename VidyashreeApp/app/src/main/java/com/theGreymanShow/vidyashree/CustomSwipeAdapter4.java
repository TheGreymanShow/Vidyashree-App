package com.theGreymanShow.vidyashree;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class CustomSwipeAdapter4 extends PagerAdapter {

    private int []events = {R.drawable.events1,R.drawable.events2,R.drawable.events3,R.drawable.events4,R.drawable.events5,R.drawable.events6,R.drawable.events7,R.drawable.events8,R.drawable.events9,R.drawable.events9a,R.drawable.events9b,R.drawable.events10,R.drawable.events10a,R.drawable.events11,R.drawable.events12};
    private Context context;
    private LayoutInflater inflater;

    public CustomSwipeAdapter4(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return events.length;
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
        image.setImageResource(events[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}

