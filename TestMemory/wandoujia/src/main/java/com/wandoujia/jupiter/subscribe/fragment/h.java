package com.wandoujia.jupiter.subscribe.fragment;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.subscribe.b;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.p4.subscribe.http.model.SubscribeOnBoardModel.OnBoardType;
import java.util.List;

final class h
  implements View.OnClickListener
{
  h(SubscribeOnBoardFragment paramSubscribeOnBoardFragment, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    List localList = SubscribeOnBoardFragment.a(this.b);
    if (CollectionUtils.isEmpty(localList))
    {
      Toast.makeText(JupiterApplication.e(), JupiterApplication.e().getString(2131624341), 0).show();
      return;
    }
    b localb = new b(this.a.getContext(), SubscribeOnBoardModel.OnBoardType.BUNDLE_PUBLISHER, localList);
    SubscribeManager.a().a(SubscribeOnBoardFragment.b(this.b));
    SubscribeManager.a().d(this.a.getContext(), localb);
    SubscribeOnBoardFragment.c(this.b).setEnabled(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.h
 * JD-Core Version:    0.6.0
 */