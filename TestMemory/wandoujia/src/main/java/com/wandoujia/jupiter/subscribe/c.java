package com.wandoujia.jupiter.subscribe;

import android.content.Context;
import android.os.Handler;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.p4.subscribe.core.b;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class c extends b
{
  private Context a;
  private Model b;

  public c(Model paramModel, Context paramContext)
  {
    this.b = paramModel;
    this.a = paramContext;
  }

  private static void b(CountDownLatch paramCountDownLatch, h paramh, boolean paramBoolean)
  {
    paramh.a(paramBoolean);
    paramCountDownLatch.countDown();
  }

  public final boolean doSubscribe()
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(this.b.I().id);
    SubscribeManager.a();
    return SubscribeManager.a(getSource(), localArrayList);
  }

  public final boolean doUnsubscribe()
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(this.b.I().id);
    SubscribeManager.a();
    return SubscribeManager.b(getSource(), localArrayList);
  }

  protected final Context getContext()
  {
    return this.a;
  }

  public final String getId()
  {
    return this.b.I().id;
  }

  public final boolean hasSubscribed()
  {
    return com.wandoujia.jupiter.subscribe.a.a.a(this.b);
  }

  public final void setSubscribeStatus(boolean paramBoolean)
  {
    com.wandoujia.jupiter.subscribe.a.a.a(this.b, paramBoolean);
  }

  public final boolean unsubscribe()
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    boolean[] arrayOfBoolean = { false };
    h localh = new h(arrayOfBoolean);
    com.wandoujia.p4.a.d().post(new d(this, localCountDownLatch, localh));
    try
    {
      localCountDownLatch.await();
      label47: return (arrayOfBoolean[0] != 0) && (super.unsubscribe());
    }
    catch (InterruptedException localInterruptedException)
    {
      break label47;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.c
 * JD-Core Version:    0.6.0
 */