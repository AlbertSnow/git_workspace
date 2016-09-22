package com.wandoujia.p4.app_launcher.fragment;

import com.wandoujia.p4.app_launcher.manager.l;
import com.wandoujia.p4.app_launcher.model.ALSuggestion;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class b
  implements l
{
  b(ALHomeFragment paramALHomeFragment)
  {
  }

  public final void a(ALSuggestion paramALSuggestion, List<Model> paramList)
  {
    if (paramALSuggestion != null)
      ALHomeFragment.a(this.a, paramALSuggestion);
    if (paramList != null)
      ALHomeFragment.a(this.a, paramList);
    ALHomeFragment.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.fragment.b
 * JD-Core Version:    0.6.0
 */