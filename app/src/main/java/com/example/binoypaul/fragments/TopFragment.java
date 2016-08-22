package com.example.binoypaul.fragments;

import android.app.Activity;
//import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.Fragment;

import java.util.zip.Inflater;

/**
 * Created by binoy.paul on 5/23/2016.
 */
public class TopFragment extends Fragment {
    TopFragmentIntf actionCmd;

    public interface TopFragmentIntf
    {
        public void memeCreate(String s1, String s2);
    }


    @Override
    public void onAttach(Activity activity) {
        actionCmd = (TopFragmentIntf) activity;

        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment , container, false );
        final EditText topText = (EditText) view.findViewById(R.id.topText);
        final EditText bottomText = (EditText) view.findViewById(R.id.bottomText);
        Button memeButton = (Button) view.findViewById(R.id.memeButton);

        memeButton.setOnClickListener(
                new View.OnClickListener()
                    {
                            public void onClick(View v)
                            {
                                actionCmd.memeCreate(topText.getText().toString(), bottomText.getText().toString());
                            }
                    }
            );

        return view;
        }



}
