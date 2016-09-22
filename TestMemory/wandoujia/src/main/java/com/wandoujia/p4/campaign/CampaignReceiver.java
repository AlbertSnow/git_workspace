package com.wandoujia.p4.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.wandoujia.jupiter.j;

public class CampaignReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("packageName");
    if (!TextUtils.isEmpty(str))
      p.d(j.a().c(), str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.CampaignReceiver
 * JD-Core Version:    0.6.0
 */