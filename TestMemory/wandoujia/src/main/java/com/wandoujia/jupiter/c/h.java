package com.wandoujia.jupiter.c;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.utils.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.concurrent.CountDownLatch;

public final class h extends a
{
  private Model a;
  private Context b;

  public h(Context paramContext, Model paramModel)
  {
    this.b = paramContext;
    this.a = paramModel;
  }

  private boolean a(int paramInt)
  {
    if (this.a == null)
      return false;
    boolean[] arrayOfBoolean = new boolean[1];
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    String str1;
    if (TextUtils.isEmpty(this.a.F().package_name))
      str1 = "";
    while (true)
    {
      String str2 = ContentTypeEnum.ContentType.APP.toString().toUpperCase();
      i locali = new i(arrayOfBoolean, localCountDownLatch);
      j localj = new j(arrayOfBoolean, localCountDownLatch);
      if (paramInt == 1)
        g.a(str2, str1, (com.wandoujia.nirvana.framework.network.a)com.wandoujia.ripple_framework.i.k().a("api_context"), locali, localj).u();
      try
      {
        while (true)
        {
          localCountDownLatch.await();
          int i = arrayOfBoolean[0];
          return i;
          str1 = this.a.F().package_name;
          break;
          g.b(str2, str1, (com.wandoujia.nirvana.framework.network.a)com.wandoujia.ripple_framework.i.k().a("api_context"), locali, localj).u();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
    return false;
  }

  protected final boolean doSubscribe()
  {
    return a(1);
  }

  protected final boolean doUnsubscribe()
  {
    return a(2);
  }

  public final Context getContext()
  {
    return this.b;
  }

  public final String getId()
  {
    if (this.a != null)
      return this.a.F().package_name;
    return "";
  }

  protected final void promptSubscribeResult(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      if (paramBoolean2)
      {
        c.a(getContext(), 2131624178, p.b);
        return;
      }
      c.a(getContext(), 2131624177, p.b);
      return;
    }
    if (paramBoolean2)
    {
      c.a(getContext(), 2131625326, p.b);
      return;
    }
    c.a(getContext(), 2131625325, p.b);
  }

  public final void setSubscribeStatus(boolean paramBoolean)
  {
    com.wandoujia.jupiter.subscribe.a.a.b(this.a, paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.h
 * JD-Core Version:    0.6.0
 */