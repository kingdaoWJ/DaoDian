package com.mirsfang.daodian.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mirsfang.daodian.R;
import com.mirsfang.daodian.base.BaseFramgent;

/**
 * A simple {@link Fragment} subclass.
 */
public class WoDeFragment extends BaseFramgent {


    public WoDeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wo_de, container, false);
    }

}