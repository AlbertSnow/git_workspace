package com.wandoujia.p4.imagepicker.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.j;
import com.wandoujia.p4.b.b;
import com.wandoujia.p4.b.i;
import com.wandoujia.p4.imagepicker.a.a;
import com.wandoujia.p4.views.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImageFolderFragment extends BaseImageTabFragment
{
  private List<i> e;

  public static com.wandoujia.ripple_framework.view.slidingtab.e d()
  {
    return new r(ImageFolderFragment.class.getName(), GlobalConfig.getAppContext().getString(2131624947));
  }

  private void e()
  {
    Iterator localIterator = this.e.iterator();
    int i = 0;
    while (localIterator.hasNext())
      i += ((i)localIterator.next()).a.size();
    if (i == 0)
    {
      a(1);
      return;
    }
    a(2);
  }

  protected final a b()
  {
    return new com.wandoujia.p4.imagepicker.a.e(getActivity(), this.c, this.d);
  }

  public final void c()
  {
    if (this.e != null);
    do
      return;
    while (!SystemUtil.checkSdCardStatusOk());
    if (j.a().j().e() != null)
    {
      ArrayList localArrayList = j.a().j().e();
      this.e = new ArrayList();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        if ((locali == null) || (locali.a.isEmpty()))
          continue;
        this.e.add(locali);
      }
      e();
      this.b.a(this.e);
      return;
    }
    a(0);
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    this.a.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.fragment.ImageFolderFragment
 * JD-Core Version:    0.6.0
 */