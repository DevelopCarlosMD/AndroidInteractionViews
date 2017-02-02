package com.example.android.androidinteractionviews.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.androidinteractionviews.R;

/**
 * Created by mac on 2/1/17.
 */

public class FragmentInsertComplement extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootVIew = inflater.inflate(R.layout.fragment_explanation, container, false);

        return rootVIew;
    }
}
