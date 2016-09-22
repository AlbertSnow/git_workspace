package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.Toast;
import com.wandoujia.mvc.Action;

public final class ba
  implements Action
{
  private final Activity a;
  private final String b;
  private final String c;

  public ba(Activity paramActivity, String paramString1, String paramString2)
  {
    this.a = paramActivity;
    this.b = paramString1;
    this.c = paramString2;
  }

  public final void execute()
  {
    if ("GROUP_ADMIN".equals(this.c))
    {
      Toast.makeText(com.wandoujia.p4.a.a(), 2131624528, 1).show();
      return;
    }
    com.wandoujia.p4.community.utils.a.a(this.a, this.a.getString(2131624507), this.a.getResources().getString(2131624510), this.a.getString(2131624508), new bb(), this.a.getString(2131624507), new bc(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ba
 * JD-Core Version:    0.6.0
 */