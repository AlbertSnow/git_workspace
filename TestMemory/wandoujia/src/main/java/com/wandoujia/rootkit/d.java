package com.wandoujia.rootkit;

import com.wandoujia.rootkit.a.b;
import com.wandoujia.rootkit.b.a;

final class d extends a
{
  d(int paramInt1, String[] paramArrayOfString, int paramInt2, b paramb)
  {
    super(paramInt1, paramArrayOfString, 0);
  }

  public final void a(int paramInt)
  {
    super.a(paramInt);
    String str = "";
    if (this.d.b() != null)
      str = this.d.b();
    if ((str.contains("Success")) || (str.contains("success")))
    {
      this.d.a(true);
      this.d.a(str);
      return;
    }
    if ((str.contains("failed")) || (str.contains("FAILED")))
    {
      this.d.a(false);
      this.d.a(str);
      return;
    }
    this.d.a(false);
    this.d.a("Unhandle Return Str " + str);
  }

  public final void a(int paramInt, String paramString)
  {
    if (this.c == paramInt)
      this.d.a(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.d
 * JD-Core Version:    0.6.0
 */