package com.google.android.gms.ads.internal.state;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@a
public final class c
{
  public final h a;
  public final LinkedList b;
  public final Object c = new Object();
  public long d = -1L;
  public long e = -1L;
  public boolean f = false;
  public long g = -1L;
  public long h = 0L;
  public long i = -1L;
  public long j = -1L;
  private final String k;
  private final String l;

  private c(h paramh, String paramString1, String paramString2)
  {
    this.a = paramh;
    this.k = paramString1;
    this.l = paramString2;
    this.b = new LinkedList();
  }

  public c(String paramString1, String paramString2)
  {
    this(bc.a().h, paramString1, paramString2);
  }

  public final Bundle a()
  {
    Bundle localBundle1;
    ArrayList localArrayList;
    synchronized (this.c)
    {
      localBundle1 = new Bundle();
      localBundle1.putString("seq_num", this.k);
      localBundle1.putString("slotid", this.l);
      localBundle1.putBoolean("ismediation", this.f);
      localBundle1.putLong("treq", this.i);
      localBundle1.putLong("tresponse", this.j);
      localBundle1.putLong("timp", this.e);
      localBundle1.putLong("tload", this.g);
      localBundle1.putLong("pcc", this.h);
      localBundle1.putLong("tfetch", this.d);
      localArrayList = new ArrayList();
      Iterator localIterator = this.b.iterator();
      if (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        Bundle localBundle2 = new Bundle();
        localBundle2.putLong("topen", locald.a);
        localBundle2.putLong("tclose", locald.b);
        localArrayList.add(localBundle2);
      }
    }
    localBundle1.putParcelableArrayList("tclick", localArrayList);
    monitorexit;
    return localBundle1;
  }

  public final void a(long paramLong)
  {
    synchronized (this.c)
    {
      this.j = paramLong;
      if (this.j != -1L)
        this.a.a(this);
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.j != -1L)
      {
        this.g = SystemClock.elapsedRealtime();
        if (!paramBoolean)
        {
          this.e = this.g;
          this.a.a(this);
        }
      }
      return;
    }
  }

  public final void b(long paramLong)
  {
    synchronized (this.c)
    {
      if (this.j != -1L)
      {
        this.d = paramLong;
        this.a.a(this);
      }
      return;
    }
  }

  public final void b(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.j != -1L)
      {
        this.f = paramBoolean;
        this.a.a(this);
      }
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.c
 * JD-Core Version:    0.6.0
 */