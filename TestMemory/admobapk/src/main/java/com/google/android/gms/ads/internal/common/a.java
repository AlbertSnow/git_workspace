package com.google.android.gms.ads.internal.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Environment;
import anw;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  private final Context a;

  public a(Context paramContext)
  {
    anw.a(paramContext, "Context can not be null");
    this.a = paramContext;
  }

  public final boolean a()
  {
    return ("mounted".equals(Environment.getExternalStorageState())) && (this.a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }

  public final boolean a(Intent paramIntent)
  {
    anw.a(paramIntent, "Intent can not be null");
    boolean bool = this.a.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty();
    int i = 0;
    if (!bool)
      i = 1;
    return i;
  }

  @TargetApi(14)
  public final boolean b()
  {
    Intent localIntent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
    return (Build.VERSION.SDK_INT >= 14) && (a(localIntent));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.common.a
 * JD-Core Version:    0.6.0
 */