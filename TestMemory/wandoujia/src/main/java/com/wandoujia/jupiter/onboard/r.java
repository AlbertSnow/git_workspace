package com.wandoujia.jupiter.onboard;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.view.CustomViewPager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class r
  implements View.OnClickListener
{
  r(StoryFragment paramStoryFragment)
  {
  }

  public final void onClick(View paramView)
  {
    long l = 0L;
    if (StoryFragment.g(this.a) == -1 + StoryFragment.b(this.a).size())
    {
      Logger localLogger2 = i.k().h();
      Logger.Module localModule2 = Logger.Module.WELCOME;
      ViewLogPackage.Action localAction2 = ViewLogPackage.Action.ENTER;
      if (CollectionUtils.isEmpty(StoryFragment.h(this.a)));
      while (true)
      {
        localLogger2.a(localModule2, localAction2, "onboard_click_install", Long.valueOf(l), StoryFragment.a(StoryFragment.h(this.a)));
        if (!CollectionUtils.isEmpty(StoryFragment.h(this.a)))
          ((AppTaskManager)i.k().a("app_task")).a(new ArrayList(StoryFragment.h(this.a)), this.a.getCurrentPagePackage());
        if (b.a(this.a.getActivity()))
          this.a.getActivity().finish();
        return;
        l = StoryFragment.h(this.a).size();
      }
    }
    Logger localLogger1 = i.k().h();
    Logger.Module localModule1 = Logger.Module.WELCOME;
    ViewLogPackage.Action localAction1 = ViewLogPackage.Action.SELECT;
    String str = "onboard_click_next_" + StoryFragment.g(this.a);
    if (CollectionUtils.isEmpty(StoryFragment.h(this.a)));
    while (true)
    {
      localLogger1.a(localModule1, localAction1, str, Long.valueOf(l), StoryFragment.a(StoryFragment.h(this.a)));
      StoryFragment.i(this.a).a(1 + StoryFragment.g(this.a), true);
      return;
      l = StoryFragment.h(this.a).size();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.r
 * JD-Core Version:    0.6.0
 */