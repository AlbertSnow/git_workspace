package com.wandoujia.ripple_framework.ripple.b;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.base.utils.IntentUtils;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class m extends h
{
  m(l paraml, Model paramModel1, Model paramModel2, Action paramAction)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if ((this.a.m() != null) && (this.a.m().F() != null));
    for (String str1 = this.a.m().F().package_name; ; str1 = null)
    {
      String str2 = this.b.intent;
      Logger.Module localModule = Logger.Module.ITEM;
      ViewLogPackage.Element localElement = ViewLogPackage.Element.BUTTON;
      ViewLogPackage.Action localAction = ViewLogPackage.Action.REDIRECT;
      String str3;
      if (this.a.t().intent != null)
        str3 = this.a.t().intent;
      while (true)
      {
        a(paramView, localModule, localElement, localAction, str3, null);
        if (this.b.intent != null)
          try
          {
            Intent localIntent2 = Intent.parseUri(str2, 1);
            if (IntentUtils.canHandleIntent(this.c.f(), localIntent2, str1))
            {
              localIntent2.setPackage(str1);
              l.a(this.c, this.a, localIntent2);
              return true;
              str3 = this.a.t().url;
            }
          }
          catch (Exception localException2)
          {
          }
      }
      if (this.b.url != null)
        try
        {
          Intent localIntent1 = new Intent("android.intent.action.VIEW");
          localIntent1.setData(Uri.parse(this.b.url));
          localIntent1.setPackage(str1);
          if (IntentUtils.canHandleIntent(this.c.f(), localIntent1, str1))
          {
            l.a(this.c, this.a, localIntent1);
            return true;
          }
        }
        catch (Exception localException1)
        {
        }
      if (this.b.url != null)
      {
        l locall = this.c;
        ((c)i.k().a("navigation")).c(locall.f(), locall.i().t().url);
        return true;
      }
      Toast.makeText(this.c.f(), R.string.feed_url_null, 0).show();
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.m
 * JD-Core Version:    0.6.0
 */