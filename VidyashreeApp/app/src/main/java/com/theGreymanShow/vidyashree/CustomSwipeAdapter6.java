package com.theGreymanShow.vidyashree;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by akshay dangare on 10/31/2016.
 */
public class CustomSwipeAdapter6 extends PagerAdapter {

    private int brochure[] = {R.drawable.enggbro1,R.drawable.enggbro2,R.drawable.enggbro3,R.drawable.enggbro4};
    private LayoutInflater inflater;
    private Context context;

    CustomSwipeAdapter6(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return brochure.length;
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
        image.setImageResource(brochure[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

}
