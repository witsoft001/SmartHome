package com.xuhong.smarthome.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.gyf.barlibrary.ImmersionBar;
import com.xuhong.smarthome.R;


public class LifeHelperFragment extends BaseFragment {


    private Toolbar toolbarl;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImmersionBar.setTitleBar(getActivity(), toolbarl);

    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_life_helper;
    }

    @Override
    protected void initView(View view) {
        toolbarl = (Toolbar) view.findViewById(R.id.toolbar);
    }
}