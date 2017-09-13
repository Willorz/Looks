package com.ed.will.looks.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by will on 17-9-13.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVariables();
        initView();
        loadData();
    }


    /**
     *
     * 初始化变量
     **/
    protected abstract void initVariables();

    /**
     * 初始化界面
     */
    protected abstract void initView();

    /**
     * 加载数据
     */
    protected abstract void loadData();

}
