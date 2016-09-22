package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzay extends n
{
  private static final String a;
  private static final String b;
  private static final String c;
  private static final String d;

  static
  {
    zzad.zzbM.toString();
    a = zzae.zzdw.toString();
    b = zzae.zzfu.toString();
    c = zzae.zzfy.toString();
    d = zzae.zzeR.toString();
  }

  private static String a(String paramString, zzay.zza paramzza, Set<Character> paramSet)
  {
    switch (p.a[paramzza.ordinal()])
    {
    default:
      return paramString;
    case 1:
      try
      {
        String str4 = a.b(paramString);
        return str4;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        q.b();
        return paramString;
      }
    case 2:
    }
    String str1 = paramString.replace("\\", "\\\\");
    Iterator localIterator = paramSet.iterator();
    String str3;
    for (String str2 = str1; localIterator.hasNext(); str2 = str2.replace(str3, "\\" + str3))
      str3 = ((Character)localIterator.next()).toString();
    return str2;
  }

  private static void a(StringBuilder paramStringBuilder, String paramString, zzay.zza paramzza, Set<Character> paramSet)
  {
    paramStringBuilder.append(a(paramString, paramzza, paramSet));
  }

  private static void a(Set<Character> paramSet, String paramString)
  {
    for (int i = 0; i < paramString.length(); i++)
      paramSet.add(Character.valueOf(paramString.charAt(i)));
  }

  public final com.google.android.gms.internal.a a(Map<String, com.google.android.gms.internal.a> paramMap)
  {
    com.google.android.gms.internal.a locala1 = (com.google.android.gms.internal.a)paramMap.get(a);
    if (locala1 == null)
      return ah.a();
    com.google.android.gms.internal.a locala2 = (com.google.android.gms.internal.a)paramMap.get(b);
    String str1;
    String str2;
    label70: zzay.zza localzza1;
    String str5;
    zzay.zza localzza2;
    Object localObject;
    if (locala2 != null)
    {
      str1 = ah.a(locala2);
      com.google.android.gms.internal.a locala3 = (com.google.android.gms.internal.a)paramMap.get(c);
      if (locala3 == null)
        break label185;
      str2 = ah.a(locala3);
      localzza1 = zzay.zza.zzaMa;
      com.google.android.gms.internal.a locala4 = (com.google.android.gms.internal.a)paramMap.get(d);
      if (locala4 == null)
        break label406;
      str5 = ah.a(locala4);
      if (!"url".equals(str5))
        break label192;
      localzza2 = zzay.zza.zzaMb;
      localObject = null;
    }
    while (true)
    {
      label119: StringBuilder localStringBuilder = new StringBuilder();
      switch (locala1.a)
      {
      default:
        a(localStringBuilder, ah.a(locala1), localzza2, (Set)localObject);
      case 2:
      case 3:
      }
      while (true)
      {
        return ah.a(localStringBuilder.toString());
        str1 = "";
        break;
        label185: str2 = "=";
        break label70;
        label192: if ("backslash".equals(str5))
        {
          localzza2 = zzay.zza.zzaMc;
          localObject = new HashSet();
          a((Set)localObject, str1);
          a((Set)localObject, str2);
          ((Set)localObject).remove(Character.valueOf('\\'));
          break label119;
        }
        q.a();
        return ah.a();
        int j = 1;
        com.google.android.gms.internal.a[] arrayOfa = locala1.c;
        int k = arrayOfa.length;
        int m = 0;
        while (m < k)
        {
          com.google.android.gms.internal.a locala5 = arrayOfa[m];
          if (j == 0)
            localStringBuilder.append(str1);
          a(localStringBuilder, ah.a(locala5), localzza2, (Set)localObject);
          m++;
          j = 0;
        }
        for (int i = 0; i < locala1.d.length; i++)
        {
          if (i > 0)
            localStringBuilder.append(str1);
          String str3 = ah.a(locala1.d[i]);
          String str4 = ah.a(locala1.e[i]);
          a(localStringBuilder, str3, localzza2, (Set)localObject);
          localStringBuilder.append(str2);
          a(localStringBuilder, str4, localzza2, (Set)localObject);
        }
      }
      label406: localzza2 = localzza1;
      localObject = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.zzay
 * JD-Core Version:    0.6.0
 */