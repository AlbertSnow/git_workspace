package com.google.android.ads.tasks;

import aio;
import ali;
import android.content.Context;
import android.os.Looper;
import anw;
import awb;
import com.google.ads.afma.nano.b;
import com.google.ads.afma.nano.d;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import gu;
import hf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import np;
import nr;
import ns;
import nv;

public abstract class r
  implements Callable
{
  public final hf a;
  public final d b;
  public Method c;
  private String d;
  private String e;
  private int f;
  private int g;

  public r(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    getClass().getSimpleName();
    this.a = paramhf;
    this.d = paramString1;
    this.e = paramString2;
    this.b = paramd;
    this.f = paramInt1;
    this.g = paramInt2;
  }

  private Void b()
  {
    try
    {
      long l1 = System.nanoTime();
      this.c = this.a.a(this.d, this.e);
      if (this.c == null)
        return null;
      a();
      localgu = this.a.h;
      if ((localgu != null) && (this.f != -2147483648))
      {
        i = this.g;
        j = this.f;
        l2 = (System.nanoTime() - l1) / 1000L;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      try
      {
        gu localgu;
        int i;
        int j;
        long l2;
        if ((localgu.c) && (gu.b != null) && (localgu.a.k))
        {
          b localb = new b();
          localb.a = localgu.a.a.getPackageName();
          localb.b = Long.valueOf(l2);
          nr localnr = new nr(gu.b, awb.a(localb));
          localnr.a.d = j;
          localnr.a.c = i;
          aio localaio = localgu.a.i;
          if (localnr.b)
            throw new IllegalStateException("do not reuse LogEventBuilder");
          localnr.b = true;
          PlayLoggerContext localPlayLoggerContext = localnr.a().b;
          if (localnr.c.n.a(localPlayLoggerContext.h, localPlayLoggerContext.d))
          {
            localnr.c.j.a(localaio, localnr.a());
            return null;
          }
          Status localStatus = Status.a;
          anw.a(localStatus, "Result must not be null");
          new ali(Looper.getMainLooper()).a(localStatus);
          return null;
          localInvocationTargetException = localInvocationTargetException;
        }
        return null;
      }
      catch (Exception localException)
      {
        return null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    return null;
  }

  protected abstract void a();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.r
 * JD-Core Version:    0.6.0
 */