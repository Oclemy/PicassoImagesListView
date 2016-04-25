package com.tutorials.hp.picassoimageslistview.mListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.tutorials.hp.picassoimageslistview.R;
import com.tutorials.hp.picassoimageslistview.mData.TVShow;
import com.tutorials.hp.picassoimageslistview.mPicasso.PicassoClient;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/25/2016 for ProgrammingWizards Channel.
 */
public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<TVShow> tvShows;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<TVShow> tvShows) {
        this.c = c;
        this.tvShows = tvShows;
    }

    @Override
    public int getCount() {
        return tvShows.size();
    }

    @Override
    public Object getItem(int position) {
        return tvShows.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.model,parent,false);

        }

        //BIND DATA
        MyHolder holder=new MyHolder(convertView);
        holder.nameTxt.setText(tvShows.get(position).getName());
        PicassoClient.downloadImage(c,tvShows.get(position).getUrl(),holder.img);

        return convertView;
    }
}
