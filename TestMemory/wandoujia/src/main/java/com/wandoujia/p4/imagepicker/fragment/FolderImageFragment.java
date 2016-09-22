package com.wandoujia.p4.imagepicker.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.b.i;
import com.wandoujia.p4.imagepicker.a.a;
import com.wandoujia.p4.imagepicker.a.d;
import java.util.ArrayList;

public class FolderImageFragment extends BaseImageTabFragment
{
  private i e;

  public final void a(i parami)
  {
    this.e = parami;
  }

  protected final boolean a()
  {
    return true;
  }

  protected final a b()
  {
    return new d(getActivity(), this.c, this.d);
  }

  public final void c()
  {
    if (this.b.b() != null);
    do
      return;
    while (!SystemUtil.checkSdCardStatusOk());
    if (this.e != null)
    {
      this.toolbar.setTitle(this.e.c + "(" + this.e.a.size() + ")");
      this.b.a(this.e.a);
      if (this.e.a == null)
      {
        a(0);
        return;
      }
      if (this.e.a.isEmpty())
      {
        a(1);
        return;
      }
      a(2);
      return;
    }
    getActivity().finish();
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.fragment.FolderImageFragment
 * JD-Core Version:    0.6.0
 */