package com.wandoujia.p4.community.b;

import android.content.Context;
import android.content.Intent;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.activity.CommunityCampaignActivity;

public final class aj
  implements Action
{
  private final String a;
  private final Context b;
  private final String c;
  private final String d;

  public aj(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.b = paramContext;
    this.a = paramString2;
    this.c = paramString3;
    this.d = paramString1;
  }

  public final void execute()
  {
    Intent localIntent = new Intent("phoenix.intent.action.CAMPAIGN_WEBVIEW");
    localIntent.setClass(this.b, CommunityCampaignActivity.class);
    localIntent.putExtra("phoenix.intent.extra.TITLE", this.a);
    localIntent.putExtra("phoenix.intent.extra.URL", this.c);
    localIntent.putExtra("group_id", this.d);
    this.b.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.aj
 * JD-Core Version:    0.6.0
 */