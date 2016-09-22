package com.wandoujia.accessibility.hibernation.view;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;

public final class b
{
  private Context a;
  private String b;
  private String c;
  private String d;
  private DialogInterface.OnClickListener e;

  public b(Context paramContext)
  {
    this.a = paramContext;
  }

  public final a a()
  {
    a locala = new a(this.a, 0);
    if (!TextUtils.isEmpty(this.b))
    {
      a.a(locala).setText(this.b);
      if (TextUtils.isEmpty(this.c))
        break label135;
      a.b(locala).setText(this.c);
      label55: if (TextUtils.isEmpty(this.d))
        break label147;
      a.c(locala).setText(this.d);
      a.c(locala).setOnClickListener(new c(this, locala));
    }
    while (true)
    {
      if (TextUtils.isEmpty(null))
        break label159;
      a.d(locala).setText(null);
      a.d(locala).setOnClickListener(new d());
      return locala;
      a.a(locala).setVisibility(8);
      break;
      label135: a.b(locala).setVisibility(8);
      break label55;
      label147: a.c(locala).setVisibility(8);
    }
    label159: a.d(locala).setVisibility(8);
    return locala;
  }

  public final b a(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final b a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.d = paramString;
    this.e = paramOnClickListener;
    return this;
  }

  public final b b(String paramString)
  {
    this.c = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.b
 * JD-Core Version:    0.6.0
 */