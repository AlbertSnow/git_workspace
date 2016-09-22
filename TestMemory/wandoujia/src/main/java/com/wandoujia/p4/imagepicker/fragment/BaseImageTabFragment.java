package com.wandoujia.p4.imagepicker.fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import com.wandoujia.jupiter.toolbar.JupiterToolbar;
import com.wandoujia.p4.fragment.AsyncLoadFragment;
import com.wandoujia.p4.imagepicker.a.c;
import com.wandoujia.p4.tips.TipsType;

public abstract class BaseImageTabFragment extends AsyncLoadFragment
{
  protected View a;
  protected com.wandoujia.p4.imagepicker.a.a b;
  protected int c;
  protected final c d = new a(this);
  private JupiterToolbar e;
  private GridView f;
  private Button g;

  private static void a(View paramView)
  {
    if (paramView == null)
      return;
    TipsType[] arrayOfTipsType = new TipsType[2];
    arrayOfTipsType[0] = TipsType.LOADING;
    arrayOfTipsType[1] = TipsType.NO_IMAGES;
    com.wandoujia.p4.tips.a.a(paramView, arrayOfTipsType);
  }

  private void b(int paramInt)
  {
    if (paramInt == 2)
    {
      this.f.setNumColumns(4);
      return;
    }
    this.f.setNumColumns(3);
  }

  protected final void a(int paramInt)
  {
    View localView = getContentView();
    if (localView != null);
    switch (paramInt)
    {
    default:
      return;
    case 0:
      com.wandoujia.p4.tips.a.a(localView, TipsType.LOADING);
      return;
    case 1:
      a(localView);
      com.wandoujia.p4.tips.a.a(localView, TipsType.NO_IMAGES);
      return;
    case 2:
    }
    a(localView);
  }

  protected boolean a()
  {
    return false;
  }

  protected abstract com.wandoujia.p4.imagepicker.a.a b();

  public abstract void c();

  protected int getLayoutResId()
  {
    return 2130903496;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    b(paramConfiguration.orientation);
    this.b.b(paramConfiguration.orientation);
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    this.c = getActivity().getIntent().getIntExtra("max_count", 2147483647);
    this.b = b();
    this.f = ((GridView)paramView.findViewById(2131493929));
    this.f.setAdapter(this.b);
    this.a = paramView.findViewById(2131493930);
    this.g = ((Button)paramView.findViewById(2131493931));
    this.g.setOnClickListener(new b(this));
    this.e = ((JupiterToolbar)paramView.findViewById(2131493121));
    if (a())
      this.e.setVisibility(0);
    while (true)
    {
      b(getActivity().getResources().getConfiguration().orientation);
      a(0);
      return;
      this.e.setVisibility(8);
    }
  }

  protected void onPrepareLoading()
  {
  }

  protected void onStartLoading()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.fragment.BaseImageTabFragment
 * JD-Core Version:    0.6.0
 */