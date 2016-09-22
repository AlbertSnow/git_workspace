package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;

@zzhb
public class zza
{
  public boolean zza(Context paramContext, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, zzp paramzzp)
  {
    if (paramAdLauncherIntentInfoParcel == null)
    {
      zzin.zzaK("No intent data for launcher overlay.");
      return false;
    }
    if (paramAdLauncherIntentInfoParcel.intent != null)
      return zza(paramContext, paramAdLauncherIntentInfoParcel.intent, paramzzp);
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.url))
    {
      zzin.zzaK("Open GMSG did not contain a URL.");
      return false;
    }
    if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.mimeType))
      localIntent.setDataAndType(Uri.parse(paramAdLauncherIntentInfoParcel.url), paramAdLauncherIntentInfoParcel.mimeType);
    else
      localIntent.setData(Uri.parse(paramAdLauncherIntentInfoParcel.url));
    localIntent.setAction("android.intent.action.VIEW");
    if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.packageName))
      localIntent.setPackage(paramAdLauncherIntentInfoParcel.packageName);
    if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.zzDK))
    {
      localObject = paramAdLauncherIntentInfoParcel.zzDK.split("/", 2);
      if (localObject.length < 2)
      {
        zzin.zzaK("Could not parse component name from open GMSG: " + paramAdLauncherIntentInfoParcel.zzDK);
        return false;
      }
      localIntent.setClassName(localObject[0], localObject[1]);
    }
    Object localObject = paramAdLauncherIntentInfoParcel.zzDL;
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      int i = 0;
      try
      {
        i = Integer.parseInt((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzin.zzaK("Could not parse intent flags.");
      }
      localIntent.addFlags(i);
    }
    return zza(paramContext, localIntent, paramzzp);
  }

  public boolean zza(Context paramContext, Intent paramIntent, zzp paramzzp)
  {
    try
    {
      zzin.v("Launching an intent: " + paramIntent.toURI());
      zzr.zzbC().zzb(paramContext, paramIntent);
      if (paramzzp != null)
        paramzzp.zzaO();
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      zzin.zzaK(localActivityNotFoundException.getMessage());
      return false;
    }
    return true;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zza
 * JD-Core Version:    0.6.0
 */