package com.group.yztcedu.fblife.main.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.group.yztcedu.fblife.R;
import com.group.yztcedu.fblife.base.BaseFragment;

/**
 * Created by Administrator on 2016/8/2.
 */
public class HomeFragment extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
        return view;
    }
}
