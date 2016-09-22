package com.wandoujia.p4.community.b;

import android.content.Context;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.activity.CommunityBallotStatusActivity;

public final class ai
  implements Action
{
  private Context a;
  private String b;

  public ai(String paramString, Context paramContext)
  {
    this.b = paramString;
    this.a = paramContext;
  }

  public final void execute()
  {
    CommunityBallotStatusActivity.a(this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ai
 * JD-Core Version:    0.6.0
 */