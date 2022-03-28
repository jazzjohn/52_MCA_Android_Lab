package com.example.gridimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    private int[] imageList;
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(int[] imageList, Context context) {
        this.imageList = imageList;
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imageList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view1, ViewGroup viewGroup) {
        if(view1==null){
            view1=layoutInflater.inflate(R.layout.imagedata,viewGroup,false);
        }

        ImageView image=view1.findViewById(R.id.imageView);
        image.setImageResource(imageList[i]);
        return view1;
    }
}
