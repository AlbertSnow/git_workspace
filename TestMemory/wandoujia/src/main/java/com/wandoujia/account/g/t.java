package com.wandoujia.account.g;

import android.text.TextUtils;
import com.wandoujia.account.dto.FIELDS;
import com.wandoujia.account.f.b;

public final class t extends a
  implements Runnable
{
  private final FIELDS[] e;
  private String f;

  public t(String paramString1, com.wandoujia.account.listener.a parama, String paramString2, b paramb, FIELDS[] paramArrayOfFIELDS)
  {
    super(paramString1, parama, paramb);
    this.e = paramArrayOfFIELDS;
    this.f = paramString2;
  }

  public final void run()
  {
    if ((a()) && (!TextUtils.isEmpty(com.wandoujia.account.a.i())))
    {
      if (this.d != null)
      {
        a(this.d.a(this.f, this.e));
        return;
      }
      b();
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.t
 * JD-Core Version:    0.6.0
 */