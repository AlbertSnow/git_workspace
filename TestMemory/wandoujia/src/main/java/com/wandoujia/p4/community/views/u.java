package com.wandoujia.p4.community.views;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.wandoujia.p4.a;

final class u extends ClickableSpan
{
  private String a;

  public u(String paramString)
  {
    this.a = paramString;
  }

  public final void onClick(View paramView)
  {
    String str;
    if (!TextUtils.isEmpty(this.a))
    {
      str = this.a;
      if (!this.a.startsWith("http://"))
        break label82;
      str = this.a.replace("http://apps.wandoujia.com/apps/", "wdj://apps/");
    }
    while (true)
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str));
      localIntent.putExtra("phoenix.intent.extra.AUTO_DOWNLOAD", InternalLinkTextView.a(this.a));
      localIntent.setFlags(268435456);
      try
      {
        a.a().startActivity(localIntent);
        return;
        label82: if (!this.a.startsWith("https://"))
          continue;
        str = this.a.replace("https://apps.wandoujia.com/apps/", "wdj://apps/");
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        localIntent.setAction("android.intent.category.BROWSABLE");
        a.a().startActivity(localIntent);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.u
 * JD-Core Version:    0.6.0
 */