package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

@zzhb
public class zzbl
{
  private final Context mContext;

  public zzbl(Context paramContext)
  {
    zzx.zzb(paramContext, "Context can not be null");
    this.mContext = paramContext;
  }

  public boolean zzdj()
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:"));
    return zza(localIntent);
  }

  public boolean zzdk()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("sms:"));
    return zza(localIntent);
  }

  public boolean zzdl()
  {
    return (zzdn()) && (this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }

  public boolean zzdm()
  {
    return true;
  }

  public static boolean zzdn()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }

  @TargetApi(14)
  public boolean zzdo()
  {
    Intent localIntent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
    return (Build.VERSION.SDK_INT >= 14) && (zza(localIntent));
  }

  public boolean zza(Intent paramIntent)
  {
    zzx.zzb(paramIntent, "Intent can not be null");
    PackageManager localPackageManager = this.mContext.getPackageManager();
    List localList = localPackageManager.queryIntentActivities(paramIntent, 0);
    return !localList.isEmpty();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbl
 * JD-Core Version:    0.6.0
 */