package com.ed.will.looks.mvp.mvp_home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ed.will.looks.R;
import com.ed.will.looks.adapter.HomePagerAdapter;
import com.ed.will.looks.base.BaseActivity;
import com.ed.will.looks.mvp.mvp_cardtop.view.CardTopFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by will on 17-9-13.
 */

public class HomeActivity extends BaseActivity {

    public static final int DEFAULT_PAGES = 1;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.main_content)
    CoordinatorLayout mainContent;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawlayout)
    DrawerLayout drawlayout;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @Override
    protected void loadData() {
        setSupportActionBar(toolbar);
        final ActionBar ab=getSupportActionBar();
        if (ab!=null){
            ab.setHomeAsUpIndicator(R.mipmap.ic_menu);
            ab.setTitle("QZS");
            ab.setDisplayHomeAsUpEnabled(true);
        }

        if (navView!=null){
            setupDrawerContent(navView);
        }

        if (viewpager!=null){
            setupViewPager(viewpager);
            tabs.setupWithViewPager(viewpager);
            tabs.setTabMode(TabLayout.MODE_FIXED);
        }

    }

    private void setupViewPager(ViewPager viewpager) {
        HomePagerAdapter adapter=new HomePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(CardTopFragment.newInstance("头条"),"头条");
        adapter.addFragment(CardTopFragment.newInstance("头条"),"头条");
        adapter.addFragment(CardTopFragment.newInstance("头条"),"头条");
        adapter.addFragment(CardTopFragment.newInstance("头条"),"头条");
        adapter.addFragment(CardTopFragment.newInstance("头条"),"头条");
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(DEFAULT_PAGES);

    }

    @OnClick(R.id.toolbar)
    public void onClick(View view){
        Snackbar.make(view, "Here's a Snackbar1111", Snackbar.LENGTH_LONG).show();
    }

    private void setupDrawerContent(final NavigationView navView) {
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_photo:

                        break;

                    case R.id.nav_video:

                        break;

                    case R.id.nav_music:

                        break;

                    case R.id.nav_about:

                        break;
                }

                drawlayout.closeDrawers();
                drawlayout.setSelected(true);
                return true;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.more, menu);
        return true;
    }


}
