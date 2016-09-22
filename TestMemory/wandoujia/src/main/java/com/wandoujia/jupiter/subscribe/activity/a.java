package com.wandoujia.jupiter.subscribe.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.subscribe.fragment.SubscribeListFragment;

final class a extends SubscribeListFragment
{
  public final void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(JupiterApplication.e().getString(2131624322));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.activity.a
 * JD-Core Version:    0.6.0
 */