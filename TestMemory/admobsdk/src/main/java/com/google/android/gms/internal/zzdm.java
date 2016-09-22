package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzr;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzhb
public final class zzdm
  implements zzdf
{
  private final zzdh zzzD;
  private final zze zzzA;
  private final zzfn zzzB;

  public zzdm(zzdh paramzzdh, zze paramzze, zzfn paramzzfn)
  {
    this.zzzD = paramzzdh;
    this.zzzA = paramzze;
    this.zzzB = paramzzfn;
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("a");
    if (str1 == null)
    {
      zzin.zzaK("Action missing from an open GMSG.");
      return;
    }
    if ((this.zzzA != null) && (!this.zzzA.zzbh()))
    {
      this.zzzA.zzq((String)paramMap.get("u"));
      return;
    }
    zzjq localzzjq = paramzzjp.zzhU();
    if ("expand".equalsIgnoreCase(str1))
    {
      if (paramzzjp.zzhY())
      {
        zzin.zzaK("Cannot expand WebView that is already expanded.");
        return;
      }
      zzo(false);
      localzzjq.zza(zzc(paramMap), zzd(paramMap));
    }
    else
    {
      String str2;
      if ("webapp".equalsIgnoreCase(str1))
      {
        str2 = (String)paramMap.get("u");
        zzo(false);
        if (str2 != null)
          localzzjq.zza(zzc(paramMap), zzd(paramMap), str2);
        else
          localzzjq.zza(zzc(paramMap), zzd(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"));
      }
      else if ("in_app_purchase".equalsIgnoreCase(str1))
      {
        str2 = (String)paramMap.get("product_id");
        String str3 = (String)paramMap.get("report_urls");
        if (this.zzzD == null)
          return;
        if ((str3 != null) && (!str3.isEmpty()))
        {
          String[] arrayOfString = str3.split(" ");
          this.zzzD.zza(str2, new ArrayList(Arrays.asList(arrayOfString)));
        }
        else
        {
          this.zzzD.zza(str2, new ArrayList());
        }
      }
      else if (("app".equalsIgnoreCase(str1)) && ("true".equalsIgnoreCase((String)paramMap.get("play_store"))))
      {
        zze(paramzzjp, paramMap);
      }
      else if (("app".equalsIgnoreCase(str1)) && ("true".equalsIgnoreCase((String)paramMap.get("system_browser"))))
      {
        zzo(true);
        zzf(paramzzjp, paramMap);
      }
      else
      {
        zzo(true);
        str2 = (String)paramMap.get("u");
        if (!TextUtils.isEmpty(str2))
          str2 = zzr.zzbC().zza(paramzzjp, str2);
        localzzjq.zza(new AdLauncherIntentInfoParcel((String)paramMap.get("i"), str2, (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
      }
    }
  }

  private static void zze(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("u");
    if (TextUtils.isEmpty(str))
    {
      zzin.zzaK("Destination url cannot be empty.");
      return;
    }
    zza localzza = new zza(paramzzjp, str);
    localzza.zzhn();
  }

  private static void zzf(zzjp paramzzjp, Map<String, String> paramMap)
  {
    Context localContext = paramzzjp.getContext();
    String str = (String)paramMap.get("u");
    if (TextUtils.isEmpty(str))
    {
      zzin.zzaK("Destination url cannot be empty.");
      return;
    }
    zzjq localzzjq = paramzzjp.zzhU();
    zzb localzzb = new zzb(paramzzjp);
    Intent localIntent = localzzb.zza(localContext, paramMap);
    try
    {
      localzzjq.zza(new AdLauncherIntentInfoParcel(localIntent));
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      zzin.zzaK(localActivityNotFoundException.getMessage());
    }
  }

  private static boolean zzc(Map<String, String> paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }

  private static int zzd(Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("o");
    if (str != null)
    {
      if ("p".equalsIgnoreCase(str))
        return zzr.zzbE().zzhw();
      if ("l".equalsIgnoreCase(str))
        return zzr.zzbE().zzhv();
      if ("c".equalsIgnoreCase(str))
        return zzr.zzbE().zzhx();
    }
    return -1;
  }

  private void zzo(boolean paramBoolean)
  {
    if (this.zzzB != null)
      this.zzzB.zzp(paramBoolean);
  }

  public static class zzb
  {
    private final zzjp zzpD;

    public zzb(zzjp paramzzjp)
    {
      this.zzpD = paramzzjp;
    }

    public Intent zzd(Uri paramUri)
    {
      if (paramUri == null)
        return null;
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setData(paramUri);
      localIntent.setAction("android.intent.action.VIEW");
      return localIntent;
    }

    public ResolveInfo zza(Context paramContext, Intent paramIntent)
    {
      return zza(paramContext, paramIntent, new ArrayList());
    }

    public ResolveInfo zza(Context paramContext, Intent paramIntent, ArrayList<ResolveInfo> paramArrayList)
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null)
        return null;
      List localList = localPackageManager.queryIntentActivities(paramIntent, 65536);
      ResolveInfo localResolveInfo1 = localPackageManager.resolveActivity(paramIntent, 65536);
      ResolveInfo localResolveInfo2 = null;
      if ((localList != null) && (localResolveInfo1 != null))
        for (int i = 0; i < localList.size(); i++)
        {
          ResolveInfo localResolveInfo3 = (ResolveInfo)localList.get(i);
          if ((localResolveInfo1 == null) || (!localResolveInfo1.activityInfo.name.equals(localResolveInfo3.activityInfo.name)))
            continue;
          localResolveInfo2 = localResolveInfo1;
          break;
        }
      paramArrayList.addAll(localList);
      return localResolveInfo2;
    }

    public Intent zza(Intent paramIntent, ResolveInfo paramResolveInfo)
    {
      Intent localIntent = new Intent(paramIntent);
      localIntent.setClassName(paramResolveInfo.activityInfo.packageName, paramResolveInfo.activityInfo.name);
      return localIntent;
    }

    public Intent zza(Context paramContext, Map<String, String> paramMap)
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      String str = (String)paramMap.get("u");
      if (TextUtils.isEmpty(str))
        return null;
      if (this.zzpD != null)
        str = zzr.zzbC().zza(this.zzpD, str);
      Uri localUri1 = Uri.parse(str);
      boolean bool1 = Boolean.parseBoolean((String)paramMap.get("use_first_package"));
      boolean bool2 = Boolean.parseBoolean((String)paramMap.get("use_running_process"));
      Uri localUri2 = null;
      if ("http".equalsIgnoreCase(localUri1.getScheme()))
        localUri2 = localUri1.buildUpon().scheme("https").build();
      else if ("https".equalsIgnoreCase(localUri1.getScheme()))
        localUri2 = localUri1.buildUpon().scheme("http").build();
      ArrayList localArrayList = new ArrayList();
      Intent localIntent1 = zzd(localUri1);
      Intent localIntent2 = zzd(localUri2);
      ResolveInfo localResolveInfo1 = zza(paramContext, localIntent1, localArrayList);
      if (localResolveInfo1 != null)
        return zza(localIntent1, localResolveInfo1);
      Object localObject1;
      Object localObject2;
      ResolveInfo localResolveInfo2;
      if (localIntent2 != null)
      {
        localObject1 = zza(paramContext, localIntent2);
        if (localObject1 != null)
        {
          localObject2 = zza(localIntent1, (ResolveInfo)localObject1);
          localResolveInfo2 = zza(paramContext, (Intent)localObject2);
          if (localResolveInfo2 != null)
            return localObject2;
        }
      }
      if (localArrayList.size() == 0)
        return localIntent1;
      if ((bool2) && (localActivityManager != null))
      {
        localObject1 = localActivityManager.getRunningAppProcesses();
        if (localObject1 != null)
        {
          localObject2 = localArrayList.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localResolveInfo2 = (ResolveInfo)((Iterator)localObject2).next();
            Iterator localIterator = ((List)localObject1).iterator();
            while (localIterator.hasNext())
            {
              ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
              if (localRunningAppProcessInfo.processName.equals(localResolveInfo2.activityInfo.packageName))
                return zza(localIntent1, localResolveInfo2);
            }
          }
        }
      }
      if (bool1)
        return zza(localIntent1, (ResolveInfo)localArrayList.get(0));
      return (Intent)(Intent)localIntent1;
    }
  }

  public static class zza extends zzim
  {
    private final String zzzE = "play.google.com";
    private final String zzzF = "market";
    private final int zzzG = 10;
    private final String zzF;
    private final zzjp zzpD;

    public zza(zzjp paramzzjp, String paramString)
    {
      this.zzpD = paramzzjp;
      this.zzF = paramString;
    }

    public Intent zzT(String paramString)
    {
      Uri localUri = Uri.parse(paramString);
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setData(localUri);
      return localIntent;
    }

    public void zzbr()
    {
      Object localObject1 = this.zzF;
      int i = 0;
      while (true)
        if (i < 10)
        {
          i++;
          try
          {
            URL localURL = new URL((String)localObject1);
            if ((!"play.google.com".equalsIgnoreCase(localURL.getHost())) && (!"market".equalsIgnoreCase(localURL.getProtocol())))
            {
              HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
              try
              {
                zzr.zzbC().zza(this.zzpD.getContext(), this.zzpD.zzhX().afmaVersion, false, localHttpURLConnection);
                int j = localHttpURLConnection.getResponseCode();
                Map localMap = localHttpURLConnection.getHeaderFields();
                String str = "";
                if ((j >= 300) && (j <= 399))
                {
                  List localList = null;
                  if (localMap.containsKey("Location"))
                    localList = (List)localMap.get("Location");
                  else if (localMap.containsKey("location"))
                    localList = (List)localMap.get("location");
                  if ((localList != null) && (localList.size() > 0))
                    str = (String)localList.get(0);
                }
                if (TextUtils.isEmpty(str))
                {
                  zzin.zzaK("Arrived at landing page, this ideally should not happen. Will open it in browser.");
                  localHttpURLConnection.disconnect();
                }
                else
                {
                  localObject1 = str;
                }
              }
              finally
              {
                localHttpURLConnection.disconnect();
              }
            }
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
          {
            zzin.zzd("Error while parsing ping URL: " + (String)localObject1, localIndexOutOfBoundsException);
          }
          catch (IOException localIOException)
          {
            zzin.zzd("Error while pinging URL: " + (String)localObject1, localIOException);
          }
          catch (RuntimeException localRuntimeException)
          {
            zzin.zzd("Error while pinging URL: " + (String)localObject1, localRuntimeException);
          }
        }
      Intent localIntent = zzT((String)localObject1);
      zzr.zzbC().zzb(this.zzpD.getContext(), localIntent);
    }

    public void onStop()
    {
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdm
 * JD-Core Version:    0.6.0
 */