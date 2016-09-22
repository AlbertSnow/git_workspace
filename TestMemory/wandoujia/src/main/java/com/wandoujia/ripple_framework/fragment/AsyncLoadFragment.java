package com.wandoujia.ripple_framework.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class AsyncLoadFragment extends BaseFragment
{
  private View a;
  private boolean b = false;
  protected boolean d = true;

  protected abstract int a();

  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    if ((paramBoolean) && (this.b))
    {
      this.b = false;
      d_();
    }
  }

  protected abstract void d_();

  protected void k()
  {
  }

  protected boolean l()
  {
    return this.d;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    k();
    this.a.post(new a(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.a == null)
      this.a = paramLayoutInflater.inflate(a(), paramViewGroup, false);
    while (true)
    {
      return this.a;
      ViewGroup localViewGroup = (ViewGroup)this.a.getParent();
      if (localViewGroup == null)
        continue;
      localViewGroup.removeView(this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.AsyncLoadFragment
 * JD-Core Version:    0.6.0
 */