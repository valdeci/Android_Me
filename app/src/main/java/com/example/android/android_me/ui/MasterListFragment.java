package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by gemeos_valdeci on 18/11/2017.
 */

public class MasterListFragment extends Fragment {

    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_master_list,container);

        GridView grid =(GridView) rootView.findViewById(R.id.grid_master_list);
        MasterListAdapter masterListAdapter = new MasterListAdapter(rootView.getContext() ,AndroidImageAssets.getAll() );
        grid.setAdapter(masterListAdapter);

        return rootView;
    }
}
