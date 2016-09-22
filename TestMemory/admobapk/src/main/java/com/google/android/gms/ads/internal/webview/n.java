package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.report.client.a;

@a
public final class n extends MutableContextWrapper
{
  Activity a;
  Context b;
  private Context c;

  public n(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }

  public final Object getSystemService(String paramString)
  {
    return this.b.getSystemService(paramString);
  }

  public final void setBaseContext(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
    if ((paramContext instanceof Activity));
    for (Activity localActivity = (Activity)paramContext; ; localActivity = null)
    {
      this.a = localActivity;
      this.b = paramContext;
      super.setBaseContext(this.c);
      return;
    }
  }

  public final void startActivity(Intent paramIntent)
  {
    if (this.a != null)
    {
      this.a.startActivity(paramIntent);
      return;
    }
    paramIntent.setFlags(268435456);
    this.c.startActivity(paramIntent);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.n
 * JD-Core Version:    0.6.0
 */