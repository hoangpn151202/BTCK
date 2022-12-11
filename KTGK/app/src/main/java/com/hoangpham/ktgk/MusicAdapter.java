package com.hoangpham.ktgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Music> musicList;

    public MusicAdapter(Context context, int layout, List<Music> musicList) {
        this.context = context;
        this.layout = layout;
        this.musicList = musicList;
    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgThumb;
        TextView txtName, txtSinger, txtDuration;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //anh xa view
            holder.imgThumb = (ImageView) view.findViewById(R.id.imageviewThumb);
            holder.txtName = (TextView) view.findViewById(R.id.textviewName);
            holder.txtSinger = (TextView) view.findViewById(R.id.textviewSinger);
            holder.txtDuration = (TextView) view.findViewById(R.id.textViewDuration);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        //gan gia tri
        Music music = musicList.get(i);
        holder.imgThumb.setImageResource(music.getThumb());
        holder.txtName.setText(music.getName());
        holder.txtSinger.setText(music.getSinger());
        holder.txtDuration.setText(music.getDuration());

        return view;
    }
}
