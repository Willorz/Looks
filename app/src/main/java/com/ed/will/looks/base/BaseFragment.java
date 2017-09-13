package com.ed.will.looks.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by will on 17-9-13.
 */

public abstract class BaseFragment extends Fragment {
    public View view;
    public Context context;
    private AppCompatActivity appCompatActivity;

    //创建
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=(Context)getActivity();
    }


    //加载view
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=initView();
        return view;
    }


    //加载数据
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    //将每一个子fragment对象中的布局转换成view对象
    public abstract View initView();

    //拿数据填充onCreateView返回的view对象
    public abstract void initData();
}
