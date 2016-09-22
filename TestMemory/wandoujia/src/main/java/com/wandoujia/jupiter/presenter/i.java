package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class i extends c
{
  private static void b(View paramView, List<View> paramList)
  {
    if (v.p(paramView))
    {
      paramList.add(paramView);
      v.b();
      if (v.r(paramView));
    }
    while (true)
    {
      return;
      if (!(paramView instanceof ViewGroup))
        continue;
      ViewGroup localViewGroup = (ViewGroup)paramView;
      for (int i = 0; i < localViewGroup.getChildCount(); i++)
        b(localViewGroup.getChildAt(i), paramList);
    }
  }

  protected void a(Model paramModel)
  {
    e().setTag(2131492933, paramModel);
    e().post(new j(this));
  }

  protected boolean b(Model paramModel)
  {
    return (paramModel.a(2131492882) != null) && (((Boolean)paramModel.a(2131492882)).booleanValue());
  }

  protected void c(Model paramModel)
  {
    paramModel.a(2131492882, Boolean.valueOf(true));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.i
 * JD-Core Version:    0.6.0
 */