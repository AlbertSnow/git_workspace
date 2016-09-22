package com.wandoujia.p4.views.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.support.v7.app.i;
import android.support.v7.app.j;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.base.utils.SystemUtil;

public final class a
{
  private final Context a;
  private i b;
  private final j c;
  private final View d;

  public a(Context paramContext)
  {
    this.a = paramContext;
    this.c = new j(paramContext, 2131689616);
    this.d = b();
    this.c.b(this.d);
  }

  private View b()
  {
    View localView = com.wandoujia.p4.utils.c.a(this.a, 2130903133);
    TextView localTextView = (TextView)localView.findViewById(2131493320);
    PackageManager localPackageManager = this.a.getPackageManager();
    int i = SystemUtil.getVersionCode(this.a);
    Object localObject = this.a.getResources().getString(2131623958);
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(this.a.getPackageName(), 0);
      String str = (String)localObject + localPackageInfo.versionName + "." + i;
      localObject = str;
      label104: localTextView.setText((CharSequence)localObject);
      return localView;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label104;
    }
  }

  public final void a()
  {
    this.b = this.c.c();
    ImageView localImageView = (ImageView)this.d.findViewById(2131493319);
    new com.wandoujia.phoenix2.av.view.a().a(localImageView, new b(this));
    new com.wandoujia.phoenix2.av.view.a().a(this.d.findViewById(2131493321), new c(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.a.a
 * JD-Core Version:    0.6.0
 */