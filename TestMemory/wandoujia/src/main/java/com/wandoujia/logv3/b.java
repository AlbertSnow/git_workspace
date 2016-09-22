package com.wandoujia.logv3;

import android.content.Context;
import android.database.Cursor;
import com.squareup.wire.Wire;
import com.wandoujia.logv3.model.packages.LogReportBatchEvent;
import com.wandoujia.logv3.model.packages.LogReportBatchEvent.Builder;
import com.wandoujia.logv3.model.packages.LogReportEvent;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private static WeakReference<f> b;
  private d a;

  private b(Context paramContext, String paramString)
  {
    this.a = new d(paramContext, paramString);
  }

  public static f a(Context paramContext, c paramc)
  {
    monitorenter;
    try
    {
      Context localContext = paramContext.getApplicationContext();
      f localf;
      if ((b != null) && (b.get() != null))
        localf = (f)b.get();
      while (true)
      {
        return localf;
        b localb = new b(localContext, paramc.h());
        localf = new f(localContext, localb, paramc, new LogSender(localContext, localb, paramc));
        b = new WeakReference(localf);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final int a()
  {
    return this.a.c();
  }

  public final long a(OutputStream paramOutputStream)
  {
    Cursor localCursor = this.a.b();
    long l2;
    if (localCursor == null)
      l2 = -1L;
    long l1;
    while (true)
    {
      return l2;
      l1 = 0L;
      try
      {
        Wire localWire = new Wire(new Class[0]);
        LogReportBatchEvent.Builder localBuilder = new LogReportBatchEvent.Builder();
        ArrayList localArrayList = new ArrayList();
        while (localCursor.moveToNext())
        {
          localArrayList.add((LogReportEvent)localWire.parseFrom(localCursor.getBlob(localCursor.getColumnIndex("log_content")), LogReportEvent.class));
          l1 += 1L;
        }
        localBuilder.event(localArrayList);
        paramOutputStream.write(localBuilder.build().toByteArray());
        return l1;
      }
      catch (Throwable localThrowable)
      {
        l2 = l1;
        return l2;
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
    }
    return l1;
  }

  public final void a(long paramLong)
  {
    this.a.a(paramLong);
    e.a().a(paramLong);
  }

  public final void a(LogReportEvent paramLogReportEvent)
  {
    e.a().b();
    File localFile = new File(this.a.d());
    if (localFile.length() >= 1048576L)
    {
      e.a().b(this.a.a());
      if (localFile.length() < 1048576L);
    }
    for (int i = 0; i == 0; i = 1)
    {
      e.a().b(1L);
      return;
    }
    byte[] arrayOfByte = paramLogReportEvent.toByteArray();
    this.a.a(arrayOfByte, paramLogReportEvent.real_time.booleanValue());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.b
 * JD-Core Version:    0.6.0
 */