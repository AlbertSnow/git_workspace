package com.wandoujia.account.b;

import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.account.dto.DeviceBean;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.d;

final class s
  implements d
{
  private String b;
  private DeviceBean c;

  s(a parama)
  {
  }

  public final void a(DeviceBean paramDeviceBean)
  {
    this.c = paramDeviceBean;
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    a.g(this.a).post(new w(this, paramWandouResponse));
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  public final void b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.a.d(paramString);
      if (a.f(this.a) != null);
    }
    else
    {
      return;
    }
    a.g(this.a).post(new t(this));
    new u(this).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.s
 * JD-Core Version:    0.6.0
 */