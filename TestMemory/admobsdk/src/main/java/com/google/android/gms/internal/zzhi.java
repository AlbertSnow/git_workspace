package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@zzhb
class zzhi
{
  private final List<String> zzJI;
  private final List<String> zzJJ;
  private final String zzJK;
  private final String zzJL;
  private final String zzJM;
  private final String zzJN;
  private final boolean zzJO;
  private final boolean zzJP;
  private final String zzEY;
  private String zzF;
  private int zzGu;

  private static boolean parseBoolean(String bool)
  {
    return (bool != null) && ((bool.equals("1")) || (bool.equals("true")));
  }

  private List<String> zzav(String paramString)
  {
    return paramString == null ? null : Arrays.asList(paramString.split(","));
  }

  public zzhi(int paramInt, Map<String, String> paramMap)
  {
    this.zzF = ((String)paramMap.get("url"));
    this.zzJL = ((String)paramMap.get("base_uri"));
    this.zzJM = ((String)paramMap.get("post_parameters"));
    this.zzJO = parseBoolean((String)paramMap.get("drt_include"));
    this.zzJP = parseBoolean((String)paramMap.get("pan_include"));
    this.zzJK = ((String)paramMap.get("activation_overlay_url"));
    this.zzJJ = zzav((String)paramMap.get("check_packages"));
    this.zzEY = ((String)paramMap.get("request_id"));
    this.zzJN = ((String)paramMap.get("type"));
    this.zzJI = zzav((String)paramMap.get("errors"));
    this.zzGu = paramInt;
  }

  public void setUrl(String url)
  {
    this.zzF = url;
  }

  public int getErrorCode()
  {
    return this.zzGu;
  }

  public List<String> zzgE()
  {
    return this.zzJI;
  }

  public String zzgF()
  {
    return this.zzJM;
  }

  public String getUrl()
  {
    return this.zzF;
  }

  public String getType()
  {
    return this.zzJN;
  }

  public boolean zzgG()
  {
    return this.zzJO;
  }

  public String getRequestId()
  {
    return this.zzEY;
  }

  public boolean zzgH()
  {
    return this.zzJP;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhi
 * JD-Core Version:    0.6.0
 */