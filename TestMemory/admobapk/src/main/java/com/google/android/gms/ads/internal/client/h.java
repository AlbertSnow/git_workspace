package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@com.google.android.gms.ads.internal.report.client.a
public final class h
{
  public static final h a = new h();

  public static AdRequestParcel a(Context paramContext, bi parambi)
  {
    Date localDate = parambi.b;
    long l;
    String str1;
    int i;
    List localList;
    label56: boolean bool1;
    int j;
    Location localLocation;
    Bundle localBundle;
    boolean bool2;
    String str2;
    com.google.android.gms.ads.search.a locala;
    if (localDate != null)
    {
      l = localDate.getTime();
      str1 = parambi.c;
      i = parambi.d;
      Set localSet = parambi.e;
      if (localSet.isEmpty())
        break label251;
      localList = Collections.unmodifiableList(new ArrayList(localSet));
      bool1 = parambi.n.contains(q.a().a.a(paramContext));
      j = parambi.m;
      localLocation = parambi.f;
      localBundle = parambi.h.getBundle(AdMobAdapter.class.getName());
      bool2 = parambi.g;
      str2 = parambi.j;
      locala = parambi.l;
      if (locala == null)
        break label257;
    }
    label257: for (SearchAdRequestParcel localSearchAdRequestParcel = new SearchAdRequestParcel(locala); ; localSearchAdRequestParcel = null)
    {
      Context localContext = paramContext.getApplicationContext();
      String str3 = null;
      if (localContext != null)
      {
        String str4 = localContext.getPackageName();
        str3 = q.a().a.a(Thread.currentThread().getStackTrace(), str4);
      }
      boolean bool3 = parambi.q;
      return new AdRequestParcel(7, l, localBundle, i, localList, bool1, j, bool2, str2, localSearchAdRequestParcel, localLocation, str1, parambi.h, parambi.o, Collections.unmodifiableList(new ArrayList(parambi.p)), parambi.k, str3, bool3);
      l = -1L;
      break;
      label251: localList = null;
      break label56;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.h
 * JD-Core Version:    0.6.0
 */