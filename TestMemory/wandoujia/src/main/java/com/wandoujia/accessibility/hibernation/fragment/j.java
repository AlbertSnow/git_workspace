package com.wandoujia.accessibility.hibernation.fragment;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.string;
import com.wandoujia.ripple_framework.log.Logger.Module;
import java.util.List;

final class j
  implements View.OnClickListener
{
  private String a;
  private boolean b;

  public j(BoosterHomeFragment paramBoosterHomeFragment, String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }

  public final void onClick(View paramView)
  {
    label117: boolean bool;
    label146: long l;
    if (((CheckBox)paramView).isChecked())
    {
      BoosterHomeFragment.m(this.c).add(this.a);
      if (this.b)
      {
        BoosterHomeFragment.n(this.c);
        BoosterHomeFragment.p(this.c);
        if (!this.b)
          break label296;
        ((TextView)BoosterHomeFragment.t(this.c).findViewById(R.id.white_list_title)).setText(BoosterHomeFragment.u(this.c) + " " + this.c.getResources().getString(R.string.hibernation_white_list_header));
        BoosterHomeFragment.e(this.c);
        Button localButton = BoosterHomeFragment.x(this.c);
        if (BoosterHomeFragment.w(this.c) == 0)
          break label359;
        bool = true;
        localButton.setEnabled(bool);
        if (!((CheckBox)paramView).isChecked())
          break label365;
        l = 1L;
      }
    }
    while (true)
    {
      v.b().a(paramView, Logger.Module.APP_LAUNCHER.name()).a(paramView, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SELECT, String.valueOf(this.b) + " " + this.a, Long.valueOf(l)).d(paramView);
      return;
      BoosterHomeFragment.o(this.c);
      break;
      BoosterHomeFragment.m(this.c).remove(this.a);
      if (this.b)
        BoosterHomeFragment.q(this.c);
      while (true)
      {
        BoosterHomeFragment.s(this.c);
        break;
        BoosterHomeFragment.r(this.c);
      }
      label296: ((TextView)BoosterHomeFragment.t(this.c).findViewById(R.id.black_list_title)).setText(BoosterHomeFragment.v(this.c) + " " + this.c.getResources().getString(R.string.hibernation_black_list_header));
      break label117;
      label359: bool = false;
      break label146;
      label365: l = 0L;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.j
 * JD-Core Version:    0.6.0
 */