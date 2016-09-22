package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgc.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzii;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

@zzhb
public class zzd extends zzgc.zza
{
  private String zzsy;
  private Context mContext;
  private String zzFI;
  private ArrayList<String> zzFJ;

  public zzd(String paramString1, ArrayList<String> paramArrayList, Context paramContext, String paramString2)
  {
    this.zzFI = paramString1;
    this.zzFJ = paramArrayList;
    this.zzsy = paramString2;
    this.mContext = paramContext;
  }

  public String getProductId()
  {
    return this.zzFI;
  }

  protected int zzB(int paramInt)
  {
    if (paramInt == 0)
      return 1;
    if (paramInt == 1)
      return 2;
    if (paramInt == 4)
      return 3;
    return 0;
  }

  protected String zza(String paramString, HashMap<String, String> paramHashMap)
  {
    String str1 = this.mContext.getPackageName();
    String str2 = "";
    try
    {
      str2 = this.mContext.getPackageManager().getPackageInfo(str1, 0).versionName;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      zzin.zzd("Error to retrieve app version", localNameNotFoundException);
    }
    long l1 = zzr.zzbF().zzha().zzhl();
    long l2 = SystemClock.elapsedRealtime() - l1;
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      paramString = paramString.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { str3 }), String.format("$1%s$2", new Object[] { paramHashMap.get(str3) }));
    }
    return paramString.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "sessionid" }), String.format("$1%s$2", new Object[] { zzr.zzbF().getSessionId() })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "appid" }), String.format("$1%s$2", new Object[] { str1 })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "osversion" }), String.format("$1%s$2", new Object[] { String.valueOf(Build.VERSION.SDK_INT) })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "sdkversion" }), String.format("$1%s$2", new Object[] { this.zzsy })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "appversion" }), String.format("$1%s$2", new Object[] { str2 })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "timestamp" }), String.format("$1%s$2", new Object[] { String.valueOf(l2) })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "[^@]+" }), String.format("$1%s$2", new Object[] { "" })).replaceAll("@@", "@");
  }

  public void recordResolution(int resolution)
  {
    if (resolution == 1)
      zzfX();
    HashMap localHashMap = new HashMap();
    localHashMap.put("status", String.valueOf(resolution));
    localHashMap.put("sku", this.zzFI);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.zzFJ.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(zza(str, localHashMap));
    }
    zzr.zzbC().zza(this.mContext, this.zzsy, localLinkedList);
  }

  public void recordPlayBillingResolution(int billingResponseCode)
  {
    if (billingResponseCode == 0)
      zzfX();
    HashMap localHashMap = new HashMap();
    localHashMap.put("google_play_status", String.valueOf(billingResponseCode));
    localHashMap.put("sku", this.zzFI);
    localHashMap.put("status", String.valueOf(zzB(billingResponseCode)));
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.zzFJ.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(zza(str, localHashMap));
    }
    zzr.zzbC().zza(this.mContext, this.zzsy, localLinkedList);
  }

  void zzfX()
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter");
      Method localMethod = localClass.getDeclaredMethod("reportWithProductId", new Class[] { Context.class, String.class, String.class, Boolean.TYPE });
      localMethod.invoke(null, new Object[] { this.mContext, this.zzFI, "", Boolean.valueOf(true) });
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      zzin.zzaK("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      zzin.zzaK("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
    }
    catch (Exception localException)
    {
      zzin.zzd("Fail to report a conversion.", localException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzd
 * JD-Core Version:    0.6.0
 */