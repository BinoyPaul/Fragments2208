package com.example.binoypaul.fragments;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

/**
 * Created by binoy.paul on 5/23/2016.
 */
public class BottomFragment extends Fragment {

    TextView TopMeme;
    TextView BottomMeme;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.bottom_fragment , container, false);
        TopMeme = (TextView) view.findViewById(R.id.topMeme);
        BottomMeme = (TextView) view.findViewById(R.id.bottomMeme );
        return view;
    }
    public void setTheText(String s1, String s2)
    {
    TopMeme.setText(s1);
    BottomMeme.setText(s2);
    }
}
