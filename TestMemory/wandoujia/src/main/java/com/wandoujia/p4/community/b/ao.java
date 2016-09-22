package com.wandoujia.p4.community.b;

import android.content.Context;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.activity.CommunityTopicListActivity;

public final class ao
  implements Action
{
  private final String a;
  private final Context b;

  public ao(String paramString, Context paramContext)
  {
    this.a = paramString;
    this.b = paramContext;
  }

  public final void execute()
  {
    CommunityTopicListActivity.a(this.b, this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ao
 * JD-Core Version:    0.6.0
 */