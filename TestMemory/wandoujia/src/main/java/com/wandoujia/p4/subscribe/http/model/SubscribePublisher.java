package com.wandoujia.p4.subscribe.http.model;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.wandoujia.p4.subscribe.SubscribeConstants.Source;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.ripple_framework.view.a.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SubscribePublisher extends com.wandoujia.p4.subscribe.core.b
  implements Serializable
{
  private static final long serialVersionUID = -7574754817905333939L;
  public String avatar;
  public String circleAvatar;
  public long createTime;
  public boolean defaultSelected;
  public String description;
  public int feedCount;
  public String fullDescription;
  public String id;
  public String nick;
  public SubscribePublisher.RelatedApp relatedApp;
  public boolean subscribed;
  public int subscribedCount;
  public List<String> tags;
  public String type;
  public String uid;

  private void notifyCaller(CountDownLatch paramCountDownLatch, e parame, boolean paramBoolean)
  {
    parame.a(paramBoolean);
    paramCountDownLatch.countDown();
  }

  private void showUnsubscribeTips(CountDownLatch paramCountDownLatch, e parame)
  {
    com.wandoujia.p4.a.d().post(new a(this, paramCountDownLatch, parame));
  }

  private void showUnsubscribeTipsInMainThread(CountDownLatch paramCountDownLatch, e parame)
  {
    if (!android.support.v4.app.b.a(null))
    {
      notifyCaller(paramCountDownLatch, parame, false);
      return;
    }
    h localh = new h(null);
    localh.a(2131624552, new b(this, paramCountDownLatch, parame));
    localh.b(2131624330, new c(this, paramCountDownLatch, parame));
    localh.a(new d(this, paramCountDownLatch, parame));
    TextView localTextView = (TextView)LayoutInflater.from(null).inflate(2130903586, null);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.nick;
    localTextView.setText(null.getString(2131625538, arrayOfObject));
    localh.a(localTextView);
    localh.b();
  }

  public boolean doSubscribe()
  {
    SubscribeManager.a();
    SubscribeConstants.Source localSource = getSource();
    SubscribePublisher[] arrayOfSubscribePublisher = { this };
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i <= 0; i++)
      localArrayList.add(arrayOfSubscribePublisher[0].id);
    return SubscribeManager.a(localSource, localArrayList);
  }

  public boolean doUnsubscribe()
  {
    SubscribeManager.a();
    SubscribeConstants.Source localSource = getSource();
    SubscribePublisher[] arrayOfSubscribePublisher = { this };
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i <= 0; i++)
      localArrayList.add(arrayOfSubscribePublisher[0].id);
    return SubscribeManager.b(localSource, localArrayList);
  }

  public String getId()
  {
    return this.id;
  }

  public List<String> getTags()
  {
    if (this.tags != null)
      return this.tags;
    return Collections.emptyList();
  }

  public boolean hasSubscribed()
  {
    return this.subscribed;
  }

  public void setSubscribeStatus(boolean paramBoolean)
  {
    this.subscribed = paramBoolean;
  }

  public boolean unsubscribe()
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    boolean[] arrayOfBoolean = { false };
    showUnsubscribeTips(localCountDownLatch, new e(arrayOfBoolean));
    try
    {
      localCountDownLatch.await();
      label34: return (arrayOfBoolean[0] != 0) && (super.unsubscribe());
    }
    catch (InterruptedException localInterruptedException)
    {
      break label34;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.model.SubscribePublisher
 * JD-Core Version:    0.6.0
 */