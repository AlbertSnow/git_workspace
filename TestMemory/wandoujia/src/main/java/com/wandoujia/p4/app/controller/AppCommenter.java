package com.wandoujia.p4.app.controller;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.base.utils.ThreadPool.Priority;
import com.wandoujia.entities.app.comment.Comment;
import java.lang.ref.WeakReference;

public final class AppCommenter
{
  private String a;
  private String b;
  private long c = -1L;
  private String d;
  private AppCommenter.Enjoy e;
  private Comment f;
  private final Context g;
  private WeakReference<h> h;

  public AppCommenter(Activity paramActivity)
  {
    if (this.f == null)
      ThreadPool.execute(new g(this, 0), ThreadPool.Priority.LOW);
    this.g = paramActivity;
  }

  public final AppCommenter a(long paramLong)
  {
    this.c = paramLong;
    return this;
  }

  public final AppCommenter a(AppCommenter.Enjoy paramEnjoy)
  {
    this.e = paramEnjoy;
    return this;
  }

  public final AppCommenter a(h paramh)
  {
    this.h = new WeakReference(paramh);
    return this;
  }

  public final AppCommenter a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final String a()
  {
    return this.b;
  }

  public final AppCommenter b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final void b()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(this.a))
        throw new IllegalArgumentException("commentContent cannot be empty");
    }
    finally
    {
      monitorexit;
    }
    if (TextUtils.isEmpty(this.b))
      throw new IllegalArgumentException("packageName cannot be empty");
    if (this.c == -1L)
      throw new IllegalArgumentException("versionCode must be assigned");
    ThreadPool.execute(new f(this), ThreadPool.Priority.LOW);
    monitorexit;
  }

  public final AppCommenter c(String paramString)
  {
    this.d = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.controller.AppCommenter
 * JD-Core Version:    0.6.0
 */