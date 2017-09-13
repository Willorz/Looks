package com.ed.will.looks.mvp.mvp_cardtop.view;

import android.os.Bundle;
import android.view.View;

import com.ed.will.looks.base.BaseFragment;
import com.ed.will.looks.mvp.mvp_cardtop.model.TopModel;

/**
 * Created by will on 17-9-14.
 */

public class CardTopFragment extends BaseFragment implements CardTopView{


    public CardTopFragment(){}

    public static CardTopFragment newInstance(String title){
        CardTopFragment fragment=new CardTopFragment();
        Bundle b=new Bundle();
        b.putString("msg",title);
        fragment.setArguments(b);
        return fragment;
    }


    @Override
    public void GetcardTopSuccess(TopModel topModel) {

    }

    @Override
    public void GetcardTopError(Throwable e) {

    }

    @Override
    public View initView() {
        return null;
    }

    @Override
    public void initData() {

    }
}
