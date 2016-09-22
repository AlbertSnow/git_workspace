package com.wandoujia.jupiter.library.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.p4.app.upgrade.a;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.view.StatefulButton;
import com.wandoujia.ripple_framework.view.ab;

final class n
  implements ab
{
  n(AppUpgradeFragment paramAppUpgradeFragment)
  {
  }

  public final void a(View paramView)
  {
    boolean bool;
    StatefulButton localStatefulButton;
    int i;
    if (!BadgeUtil.e(i.k().g()))
    {
      bool = true;
      localStatefulButton = (StatefulButton)paramView.findViewById(2131492866);
      if (!bool)
        break label127;
      i = 2131624981;
    }
    for (int j = 2131625527; ; j = 2131624624)
    {
      ((TextView)paramView.findViewById(2131492998)).setText(i);
      ((ImageView)paramView.findViewById(2131492905)).setImageResource(2130838045);
      localStatefulButton.setText(j);
      a.b(AppUpgradeFragment.b(this.a));
      AppUpgradeFragment.a(this.a, new o(this, localStatefulButton));
      a.a(AppUpgradeFragment.b(this.a));
      localStatefulButton.setOnClickListener(new q(bool, localStatefulButton));
      return;
      bool = false;
      break;
      label127: i = 2131625565;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.n
 * JD-Core Version:    0.6.0
 */