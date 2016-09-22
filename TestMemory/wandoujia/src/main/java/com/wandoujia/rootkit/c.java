package com.wandoujia.rootkit;

import android.text.TextUtils;
import com.wandoujia.rootkit.a.b;
import com.wandoujia.rootkit.b.a;

final class c extends a
{
  c(int paramInt, String[] paramArrayOfString, b paramb)
  {
    super(paramInt, paramArrayOfString, 0);
  }

  public final void a(int paramInt)
  {
    String str;
    if (!TextUtils.isEmpty(this.c.b()))
    {
      str = this.c.b();
      if ((!str.contains("Success")) && (!str.contains("success")))
        break label53;
      this.c.a(true);
    }
    while (true)
    {
      super.a(paramInt);
      return;
      label53: if ((str.contains("Success")) || (str.contains("success")))
      {
        this.c.a(false);
        continue;
      }
      this.c.a(false);
    }
  }

  public final void a(int paramInt, String paramString)
  {
    this.c.a(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.c
 * JD-Core Version:    0.6.0
 */