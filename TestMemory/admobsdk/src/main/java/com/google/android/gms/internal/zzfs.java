package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzfs
{
  private final zzjp zzpD;
  private final String zzDJ;

  public zzfs(zzjp paramzzjp)
  {
    this(paramzzjp, "");
  }

  public zzfs(zzjp paramzzjp, String paramString)
  {
    this.zzpD = paramzzjp;
    this.zzDJ = paramString;
  }

  public void zzam(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("message", paramString).put("action", this.zzDJ);
      this.zzpD.zzb("onError", localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occurred while dispatching error event.", localJSONException);
    }
  }

  public void zzan(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("js", paramString);
      this.zzpD.zzb("onReadyEventReceived", localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occured while dispatching ready Event.", localJSONException);
    }
  }

  public void zzb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.zzpD.zzb("onSizeChanged", localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occured while dispatching size change.", localJSONException);
    }
  }

  public void zzc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.zzpD.zzb("onDefaultPositionReceived", localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occured while dispatching default position.", localJSONException);
    }
  }

  public void zzao(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("state", paramString);
      this.zzpD.zzb("onStateChanged", localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occured while dispatching state change.", localJSONException);
    }
  }

  public void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("width", paramInt1).put("height", paramInt2).put("maxSizeWidth", paramInt3).put("maxSizeHeight", paramInt4).put("density", paramFloat).put("rotation", paramInt5);
      this.zzpD.zzb("onScreenInfoChanged", localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occured while obtaining screen information.", localJSONException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfs
 * JD-Core Version:    0.6.0
 */