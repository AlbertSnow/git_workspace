package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@a
public final class AutoClickProtectionConfigurationParcel extends AbstractSafeParcelable
{
  public static final u CREATOR = new u();
  public final int a;
  public final boolean b;
  public final List c;

  public AutoClickProtectionConfigurationParcel()
  {
    this(1, false, Collections.emptyList());
  }

  public AutoClickProtectionConfigurationParcel(int paramInt, boolean paramBoolean, List paramList)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramList;
  }

  public AutoClickProtectionConfigurationParcel(boolean paramBoolean)
  {
    this(1, paramBoolean, Collections.emptyList());
  }

  public AutoClickProtectionConfigurationParcel(boolean paramBoolean, List paramList)
  {
    this(1, paramBoolean, paramList);
  }

  public static AutoClickProtectionConfigurationParcel a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      return new AutoClickProtectionConfigurationParcel();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("reporting_urls");
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray != null)
    {
      int i = 0;
      while (true)
        if (i < localJSONArray.length())
          try
          {
            localArrayList.add(localJSONArray.getString(i));
            i++;
          }
          catch (JSONException localJSONException)
          {
            while (true)
              c.c("Error grabbing url from json.", localJSONException);
          }
    }
    return new AutoClickProtectionConfigurationParcel(paramJSONObject.optBoolean("enable_protection"), localArrayList);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel
 * JD-Core Version:    0.6.0
 */