package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzi
{
  public int zzd(Intent paramIntent)
  {
    if (paramIntent == null)
      return 5;
    Object localObject = paramIntent.getExtras().get("RESPONSE_CODE");
    if (localObject == null)
    {
      zzin.zzaK("Intent with no response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    zzin.zzaK("Unexpected type for intent response code. " + localObject.getClass().getName());
    return 5;
  }

  public int zzd(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    if (localObject == null)
    {
      zzin.zzaK("Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    zzin.zzaK("Unexpected type for intent response code. " + localObject.getClass().getName());
    return 5;
  }

  public String zze(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
  }

  public String zzf(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
  }

  public String zzaq(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      return localJSONObject.getString("developerPayload");
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Fail to parse purchase data");
    }
    return null;
  }

  public String zzar(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      return localJSONObject.getString("purchaseToken");
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Fail to parse purchase data");
    }
    return null;
  }

  public void zza(Context paramContext, boolean paramBoolean, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", paramBoolean);
    GInAppPurchaseManagerInfoParcel.zza(localIntent, paramGInAppPurchaseManagerInfoParcel);
    zzr.zzbC().zzb(paramContext, localIntent);
  }

  public void zzz(Context paramContext)
  {
    1 local1 = new ServiceConnection(paramContext)
    {
      public void onServiceDisconnected(ComponentName name)
      {
      }

      public void onServiceConnected(ComponentName name, IBinder service)
      {
        zzb localzzb = new zzb(this.zzxh.getApplicationContext(), false);
        localzzb.zzN(service);
        int i = localzzb.zzb(3, this.zzxh.getPackageName(), "inapp");
        zzr.zzbF().zzC(i == 0);
        this.zzxh.unbindService(this);
        localzzb.destroy();
      }
    };
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    paramContext.bindService(localIntent, local1, 1);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzi
 * JD-Core Version:    0.6.0
 */