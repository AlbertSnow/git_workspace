package com.wandoujia.p4.imagepicker.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.b.b;
import com.wandoujia.p4.imagepicker.a.a;
import com.wandoujia.p4.imagepicker.a.d;
import com.wandoujia.p4.views.r;
import com.wandoujia.ripple_framework.view.slidingtab.e;
import java.util.ArrayList;

public class CameraImageFragment extends BaseImageTabFragment
{
  private ArrayList<com.wandoujia.p4.b.j> e;

  public static e d()
  {
    return new r(CameraImageFragment.class.getName(), GlobalConfig.getAppContext().getString(2131624946));
  }

  protected final a b()
  {
    return new d(getActivity(), this.c, this.d);
  }

  public final void c()
  {
    if (!SystemUtil.checkSdCardStatusOk())
      return;
    if (com.wandoujia.jupiter.j.a().j().f() != null)
    {
      this.e = new ArrayList();
      this.e.addAll(com.wandoujia.jupiter.j.a().j().f());
      this.b.a(this.e);
    }
    if (this.e == null)
    {
      a(0);
      return;
    }
    if (this.e.isEmpty())
    {
      a(1);
      return;
    }
    a(2);
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    c();
  }

  public void onStop()
  {
    super.onStop();
    if (this.b != null)
      this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.fragment.CameraImageFragment
 * JD-Core Version:    0.6.0
 */