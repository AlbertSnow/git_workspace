package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Map;

@zzhb
public abstract class zzby
{

  @zzhb
  public static final zzby zzxs = new zzby()
  {
    public String zzb(@Nullable String paramString1, String paramString2)
    {
      return paramString2;
    }
  };

  @zzhb
  public static final zzby zzxt = new zzby()
  {
    public String zzb(@Nullable String paramString1, String paramString2)
    {
      return paramString1 != null ? paramString1 : paramString2;
    }
  };

  @zzhb
  public static final zzby zzxu = new zzby()
  {
    public String zzb(@Nullable String paramString1, String paramString2)
    {
      paramString1 = zzM(paramString1);
      paramString2 = zzM(paramString2);
      if (TextUtils.isEmpty(paramString1))
        return paramString2;
      if (TextUtils.isEmpty(paramString2))
        return paramString1;
      return paramString1 + "," + paramString2;
    }

    @Nullable
    private String zzM(@Nullable String paramString)
    {
      if (TextUtils.isEmpty(paramString))
        return paramString;
      int i = 0;
      int j = paramString.length();
      while ((i < paramString.length()) && (paramString.charAt(i) == ','))
        i++;
      while ((j > 0) && (paramString.charAt(j - 1) == ','))
        j--;
      return (i == 0) && (j == paramString.length()) ? paramString : paramString.substring(i, j);
    }
  };

  public abstract String zzb(@Nullable String paramString1, String paramString2);

  public final void zza(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    paramMap.put(paramString1, zzb((String)paramMap.get(paramString1), paramString2));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzby
 * JD-Core Version:    0.6.0
 */