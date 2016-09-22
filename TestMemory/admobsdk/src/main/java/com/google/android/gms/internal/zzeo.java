package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public final class zzeo
{
  public final List<zzen> zzBO;
  public final long zzBP;
  public final List<String> zzBQ;
  public final List<String> zzBR;
  public final List<String> zzBS;
  public final String zzBT;
  public final long zzBU;
  public final String zzBV;
  public final int zzBW;
  public final int zzBX;
  public final long zzBY;
  public int zzBZ;
  public int zzCa;

  public zzeo(List<zzen> paramList, long paramLong1, List<String> paramList1, List<String> paramList2, List<String> paramList3, String paramString1, long paramLong2, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, long paramLong3)
  {
    this.zzBO = paramList;
    this.zzBP = paramLong1;
    this.zzBQ = paramList1;
    this.zzBR = paramList2;
    this.zzBS = paramList3;
    this.zzBT = paramString1;
    this.zzBU = paramLong2;
    this.zzBZ = paramInt1;
    this.zzCa = paramInt2;
    this.zzBV = paramString2;
    this.zzBW = paramInt3;
    this.zzBX = paramInt4;
    this.zzBY = paramLong3;
  }

  public zzeo(String paramString)
    throws JSONException
  {
    JSONObject localJSONObject1 = new JSONObject(paramString);
    if (zzin.zzQ(2))
      zzin.v("Mediation Response JSON: " + localJSONObject1.toString(2));
    JSONArray localJSONArray = localJSONObject1.getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    int i = -1;
    for (int j = 0; j < localJSONArray.length(); j++)
    {
      zzen localzzen = new zzen(localJSONArray.getJSONObject(j));
      localArrayList.add(localzzen);
      if ((i >= 0) || (!zza(localzzen)))
        continue;
      i = j;
    }
    this.zzBZ = i;
    this.zzCa = localJSONArray.length();
    this.zzBO = Collections.unmodifiableList(localArrayList);
    this.zzBT = localJSONObject1.getString("qdata");
    this.zzBX = localJSONObject1.optInt("fs_model_type", -1);
    this.zzBY = localJSONObject1.optLong("timeout_ms", -1L);
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("settings");
    if (localJSONObject2 != null)
    {
      this.zzBP = localJSONObject2.optLong("ad_network_timeout_millis", -1L);
      this.zzBQ = zzr.zzbP().zza(localJSONObject2, "click_urls");
      this.zzBR = zzr.zzbP().zza(localJSONObject2, "imp_urls");
      this.zzBS = zzr.zzbP().zza(localJSONObject2, "nofill_urls");
      long l = localJSONObject2.optLong("refresh", -1L);
      this.zzBU = (l > 0L ? l * 1000L : -1L);
      RewardItemParcel localRewardItemParcel = RewardItemParcel.zza(localJSONObject2.optJSONArray("rewards"));
      if (localRewardItemParcel == null)
      {
        this.zzBV = null;
        this.zzBW = 0;
      }
      else
      {
        this.zzBV = localRewardItemParcel.type;
        this.zzBW = localRewardItemParcel.zzKS;
      }
    }
    else
    {
      this.zzBP = -1L;
      this.zzBQ = null;
      this.zzBR = null;
      this.zzBS = null;
      this.zzBU = -1L;
      this.zzBV = null;
      this.zzBW = 0;
    }
  }

  private boolean zza(zzen paramzzen)
  {
    Iterator localIterator = paramzzen.zzBB.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.equals("com.google.ads.mediation.admob.AdMobAdapter"))
        return true;
    }
    return false;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzeo
 * JD-Core Version:    0.6.0
 */