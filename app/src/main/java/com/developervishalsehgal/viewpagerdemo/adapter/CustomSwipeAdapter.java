package com.developervishalsehgal.viewpagerdemo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.developervishalsehgal.viewpagerdemo.R;
import com.developervishalsehgal.viewpagerdemo.model.MyData;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by VishaL SehgaL on 16-04-2017.
 */

public class CustomSwipeAdapter extends PagerAdapter {

    private ArrayList<MyData> myData;
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx, ArrayList<MyData> myData) {
        this.myData = myData;
        this.ctx = ctx;

    }

    @Override
    public int getCount() {
        return myData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater != null;
        View item_view = layoutInflater.inflate(R.layout.list_item, container, false);

        ImageView imageView = item_view.findViewById(R.id.item_image);
        TextView titleTv = item_view.findViewById(R.id.item_title);
        TextView bodyTv = item_view.findViewById(R.id.item_body);

        //Setting the text of Title and Body
        titleTv.setText(myData.get(position).getTitle());
        bodyTv.setText(myData.get(position).getBody());
        //Setting the Image.
        Glide.with(ctx).load(myData.get(position).getUrl()).into(imageView);
        container.addView(item_view);
        return item_view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}

