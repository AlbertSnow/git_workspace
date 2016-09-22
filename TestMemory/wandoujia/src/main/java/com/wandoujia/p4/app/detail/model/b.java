package com.wandoujia.p4.app.detail.model;

import com.android.volley.VolleyError;
import com.wandoujia.log.toolkit.LaunchLogger;

public final class b<T>
{
  public final T a;
  public final LaunchLogger b;
  public final VolleyError c;
  public boolean d = false;

  private b(VolleyError paramVolleyError)
  {
    this.a = null;
    this.b = null;
    this.c = paramVolleyError;
  }

  private b(T paramT, LaunchLogger paramLaunchLogger)
  {
    this.a = paramT;
    this.b = paramLaunchLogger;
    this.c = null;
  }

  public static a a(CommentJson paramCommentJson)
  {
    return new a(paramCommentJson);
  }

  public static <T> b<T> a(VolleyError paramVolleyError)
  {
    return new b(paramVolleyError);
  }

  public static <T> b<T> a(T paramT, LaunchLogger paramLaunchLogger)
  {
    return new b(paramT, paramLaunchLogger);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.model.b
 * JD-Core Version:    0.6.0
 */