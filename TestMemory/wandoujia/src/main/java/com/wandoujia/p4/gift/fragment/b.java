package com.wandoujia.p4.gift.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.a;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.p4.gift.activity.MyGiftBeansActivity;

final class b
  implements View.OnClickListener
{
  b(GiftListFragment paramGiftListFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (a.z())
    {
      MyGiftBeansActivity.a(this.a.getActivity(), IAppLiteInfo.AppType.APP);
      return;
    }
    AccountParams localAccountParams = new AccountParams("gift", 0);
    AccountUtil.a(this.a.getActivity(), localAccountParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.fragment.b
 * JD-Core Version:    0.6.0
 */