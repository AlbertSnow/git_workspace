package com.google.android.gms.ads.internal.interstitial;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.g;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.c;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

@com.google.android.gms.ads.internal.report.client.a
public final class ac
{
  final Map a = new HashMap();
  final LinkedList b = new LinkedList();
  a c;

  static Bundle a(AdRequestParcel paramAdRequestParcel)
  {
    Bundle localBundle = paramAdRequestParcel.m;
    if (localBundle == null)
      return null;
    return localBundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
  }

  private static void a(Bundle paramBundle, String paramString)
  {
    while (true)
    {
      String[] arrayOfString = paramString.split("/", 2);
      if (arrayOfString.length == 0);
      do
      {
        return;
        String str = arrayOfString[0];
        if (arrayOfString.length == 1)
        {
          paramBundle.remove(str);
          return;
        }
        paramBundle = paramBundle.getBundle(str);
      }
      while (paramBundle == null);
      paramString = arrayOfString[1];
    }
  }

  static void a(String paramString, ad paramad)
  {
    if (c.a(2))
      c.a(String.format(paramString, new Object[] { paramad }));
  }

  static String[] a(String paramString)
  {
    String[] arrayOfString;
    try
    {
      arrayOfString = paramString.split("");
      for (int i = 0; i < arrayOfString.length; i++)
        arrayOfString[i] = new String(Base64.decode(arrayOfString[i], 0), "UTF-8");
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      arrayOfString = new String[0];
    }
    return arrayOfString;
  }

  static AdRequestParcel b(AdRequestParcel paramAdRequestParcel)
  {
    Parcel localParcel = Parcel.obtain();
    paramAdRequestParcel.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    AdRequestParcel localAdRequestParcel = g.a(localParcel);
    localParcel.recycle();
    for (String str : ((String)m.R.a()).split(","))
      a(localAdRequestParcel.m, str);
    return localAdRequestParcel;
  }

  private final String b()
  {
    StringBuilder localStringBuilder;
    try
    {
      localStringBuilder = new StringBuilder();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localStringBuilder.append(Base64.encodeToString(((ad)localIterator.next()).toString().getBytes("UTF-8"), 0));
        if (!localIterator.hasNext())
          continue;
        localStringBuilder.append("");
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return "";
    }
    String str = localStringBuilder.toString();
    return str;
  }

  static boolean b(String paramString)
  {
    try
    {
      boolean bool = Pattern.matches((String)m.V.a(), paramString);
      return bool;
    }
    catch (RuntimeException localRuntimeException)
    {
      bc.a().h.a(localRuntimeException, true);
    }
    return false;
  }

  final void a()
  {
    if (this.c == null)
      return;
    Iterator localIterator1 = this.a.entrySet().iterator();
    label23: ad localad2;
    ae localae2;
    int i;
    int j;
    if (localIterator1.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
      localad2 = (ad)localEntry2.getKey();
      localae2 = (ae)localEntry2.getValue();
      if (c.a(2))
      {
        i = localae2.a.size();
        Iterator localIterator4 = localae2.a.iterator();
        j = 0;
        label97: if (localIterator4.hasNext())
          if (!((af)localIterator4.next()).e)
            break label453;
      }
    }
    label453: for (int k = j + 1; ; k = j)
    {
      j = k;
      break label97;
      if (j < i)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(i - j);
        arrayOfObject[1] = Integer.valueOf(i);
        arrayOfObject[2] = localad2;
        c.a(String.format("Loading %s/%s pooled interstitials for %s.", arrayOfObject));
      }
      Iterator localIterator3 = localae2.a.iterator();
      while (localIterator3.hasNext())
        ((af)localIterator3.next()).a();
      while (localae2.a.size() < ((Integer)m.T.a()).intValue())
      {
        a("Pooling and loading one new interstitial for %s.", localad2);
        af localaf = new af(localae2, this.c);
        localae2.a.add(localaf);
        localaf.a();
      }
      break label23;
      if (this.c == null)
        break;
      SharedPreferences.Editor localEditor = this.c.a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
      localEditor.clear();
      Iterator localIterator2 = this.a.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
        ad localad1 = (ad)localEntry1.getKey();
        ae localae1 = (ae)localEntry1.getValue();
        if (!localae1.e)
          continue;
        String str = new ah(localae1).a();
        localEditor.putString(localad1.toString(), str);
        a("Saved interstitial queue for %s.", localad1);
      }
      localEditor.putString("PoolKeys", b());
      localEditor.apply();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.ac
 * JD-Core Version:    0.6.0
 */