package com.ed.will.looks.mvp.mvp_cardtop.view;

import com.ed.will.looks.mvp.mvp_cardtop.model.TopModel;

/**
 * Created by will on 17-9-13.
 */

public interface CardTopView {
    void GetcardTopSuccess(TopModel topModel);
    void GetcardTopError(Throwable e);
}
