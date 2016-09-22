package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzhb;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public final class RewardItemParcel
  implements SafeParcelable
{
  public static final zzc CREATOR = new zzc();
  public final int versionCode;
  public final String type;
  public final int zzKS;

  public RewardItemParcel(RewardItem rewardItem)
  {
    this(1, rewardItem.getType(), rewardItem.getAmount());
  }

  public RewardItemParcel(String rewardType, int rewardAmount)
  {
    this(1, rewardType, rewardAmount);
  }

  public RewardItemParcel(int versionCode, String type, int amount)
  {
    this.versionCode = versionCode;
    this.type = type;
    this.zzKS = amount;
  }

  @Nullable
  public static RewardItemParcel zza(JSONArray paramJSONArray)
    throws JSONException
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
      return null;
    return new RewardItemParcel(paramJSONArray.getJSONObject(0).optString("rb_type"), paramJSONArray.getJSONObject(0).optInt("rb_amount"));
  }

  public JSONArray zzgR()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("rb_type", this.type);
    localJSONObject.put("rb_amount", this.zzKS);
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put(localJSONObject);
    return localJSONArray;
  }

  @Nullable
  public static RewardItemParcel zzay(@Nullable String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      return zza(new JSONArray(paramString));
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel out, int flags)
  {
    zzc.zza(this, out, flags);
  }

  public boolean equals(Object other)
  {
    if ((other == null) || (!(other instanceof RewardItemParcel)))
      return false;
    RewardItemParcel localRewardItemParcel = (RewardItemParcel)other;
    return (zzw.equal(this.type, localRewardItemParcel.type)) && (zzw.equal(Integer.valueOf(this.zzKS), Integer.valueOf(localRewardItemParcel.zzKS)));
  }

  public int hashCode()
  {
    return zzw.hashCode(new Object[] { this.type, Integer.valueOf(this.zzKS) });
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel
 * JD-Core Version:    0.6.0
 */