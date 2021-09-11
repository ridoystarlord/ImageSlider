package com.ridoy.imageslider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter ;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderViewHolder>  {


    private int[] images;
    private String[] description;

    public SliderAdapter(int[] images, String[] description) {
        this.images = images;
        this.description = description;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item,null);
        return new SliderViewHolder(root);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.images.setImageResource(images[position]);
        viewHolder.tdescription.setText(description[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class SliderViewHolder extends SliderViewAdapter.ViewHolder {
        ImageView images;
        TextView tdescription;

        public SliderViewHolder(View itemView) {
            super(itemView);
            images = itemView.findViewById(R.id.image);
            tdescription = itemView.findViewById(R.id.description);
        }
    }
}
