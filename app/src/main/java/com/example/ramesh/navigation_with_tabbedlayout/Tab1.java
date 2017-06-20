package com.example.ramesh.navigation_with_tabbedlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by J.yugandhar on 19-06-2017.
 */

public class Tab1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1, container, false);
    }
}
