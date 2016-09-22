package com.wandoujia.accessibility.hibernation.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.d;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.wandoujia.accessibility.hibernation.activity.b;
import com.wandoujia.accessibility.hibernation.view.PageDotIndicator;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.accessibility.R.array;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.layout;

public class OnBoardFragment extends Fragment
{
  private ViewPager a;
  private PageDotIndicator b;
  private Button c;
  private String[] d;
  private String[] e;
  private b f;

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    if ((paramActivity instanceof b))
      this.f = ((b)paramActivity);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = d.a(getActivity(), R.layout.fragment_hibernation_onboard);
    this.a = ((ViewPager)localView.findViewById(R.id.onboard_tips));
    this.b = ((PageDotIndicator)localView.findViewById(R.id.onboard_indicator));
    this.c = ((Button)localView.findViewById(R.id.onboard_start));
    return localView;
  }

  public void onDetach()
  {
    super.onDetach();
    this.f = null;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.d = getResources().getStringArray(R.array.hibernation_onboard_tips_title);
    this.e = getResources().getStringArray(R.array.hibernation_onboard_tips_content);
    this.a.setAdapter(new m(this, 0));
    this.b.setPageCount(this.d.length);
    this.b.setCurrentPage(0);
    this.a.a(new k(this));
    this.c.setOnClickListener(new l(this));
    v.b().a(getView(), new ak("apps/app_launcher/superboost/onboard")).a(getView());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.OnBoardFragment
 * JD-Core Version:    0.6.0
 */