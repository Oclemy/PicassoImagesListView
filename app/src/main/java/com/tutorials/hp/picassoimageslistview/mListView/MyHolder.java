package com.tutorials.hp.picassoimageslistview.mListView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.picassoimageslistview.R;

/**
 * Created by Oclemmy on 4/25/2016 for ProgrammingWizards Channel.
 */
public class MyHolder {

    TextView nameTxt;
    ImageView img;

    public MyHolder(View v) {

        nameTxt= (TextView) v.findViewById(R.id.nameTxt);
        img= (ImageView) v.findViewById(R.id.movieImage);

    }
}
