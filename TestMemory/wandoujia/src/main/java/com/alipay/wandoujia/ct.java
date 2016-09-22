package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.jupiter.notification.NotificationActionHandler;

public final class ct
{
  private boolean a = false;
  private NotificationActionHandler b = new NotificationActionHandler();
  private ao c;

  public final ao a()
  {
    return this.c;
  }

  public final void a(ao paramao)
  {
    this.c = paramao;
  }

  public final void a(ao paramao, f paramf)
  {
    if (this.a)
      return;
    b.c();
    this.a = true;
    String str1 = paramao.a("rules");
    String str2 = paramao.a("temp");
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
    {
      this.a = false;
      return;
    }
    new Thread(new cu(this, Integer.parseInt(paramao.a("read_time")), paramao, str1.split(","), str2, Integer.parseInt(paramao.a("tmp_group")), paramf)).start();
  }

  public final void b()
  {
    this.a = false;
    this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ct
 * JD-Core Version:    0.6.0
 */