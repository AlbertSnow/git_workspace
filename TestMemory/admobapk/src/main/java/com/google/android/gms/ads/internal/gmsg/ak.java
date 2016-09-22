package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

@a
public final class ak
  implements t
{
  private final al a;

  public ak(al paramal)
  {
    this.a = paramal;
  }

  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    if ("grant".equals(str1));
    do
      try
      {
        int i = Integer.parseInt((String)paramMap.get("amount"));
        String str2 = (String)paramMap.get("type");
        if (!TextUtils.isEmpty(str2))
        {
          RewardItemParcel localRewardItemParcel2 = new RewardItemParcel(str2, i);
          localRewardItemParcel1 = localRewardItemParcel2;
          this.a.b(localRewardItemParcel1);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          c.c("Unable to parse reward amount.", localNumberFormatException);
          RewardItemParcel localRewardItemParcel1 = null;
        }
      }
    while (!"video_start".equals(str1));
    this.a.N();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ak
 * JD-Core Version:    0.6.0
 */