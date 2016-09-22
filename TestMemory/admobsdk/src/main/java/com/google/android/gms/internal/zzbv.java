package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzhb
public class zzbv
{
  BlockingQueue<zzcb> zzxl;
  ExecutorService zzxm;
  LinkedHashMap<String, String> zzxn = new LinkedHashMap();
  Map<String, zzby> zzxo = new HashMap();
  String zzxj;
  final Context mContext;
  final String zzsy;
  private AtomicBoolean zzxp;
  private File zzxq;

  public zzbv(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    this.mContext = paramContext;
    this.zzsy = paramString1;
    this.zzxj = paramString2;
    this.zzxp = new AtomicBoolean(false);
    this.zzxp.set(((Boolean)zzbt.zzwi.get()).booleanValue());
    if (this.zzxp.get())
    {
      localObject = Environment.getExternalStorageDirectory();
      if (localObject != null)
        this.zzxq = new File((File)localObject, "sdk_csi_data.txt");
    }
    Object localObject = paramMap.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      this.zzxn.put(localEntry.getKey(), localEntry.getValue());
    }
    this.zzxl = new ArrayBlockingQueue(30);
    this.zzxm = Executors.newSingleThreadExecutor();
    this.zzxm.execute(new Runnable()
    {
      public void run()
      {
        zzbv.zza(zzbv.this);
      }
    });
    this.zzxo.put("action", zzby.zzxt);
    this.zzxo.put("ad_format", zzby.zzxt);
    this.zzxo.put("e", zzby.zzxu);
  }

  public void zzb(List<String> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
      this.zzxn.put("e", TextUtils.join(",", paramList));
  }

  public boolean zza(zzcb paramzzcb)
  {
    return this.zzxl.offer(paramzzcb);
  }

  private void zzdx()
  {
    while (true)
    {
      zzcb localzzcb = null;
      String str = null;
      try
      {
        localzzcb = (zzcb)this.zzxl.take();
        str = localzzcb.zzdD();
      }
      catch (InterruptedException localInterruptedException)
      {
        zzin.zzd("CsiReporter:reporter interrupted", localInterruptedException);
        break;
      }
      if (TextUtils.isEmpty(str))
        continue;
      zzc(zza(this.zzxn, localzzcb.zzn()), str);
    }
  }

  private void zzc(Map<String, String> paramMap, String paramString)
  {
    String str = zza(this.zzxj, paramMap, paramString);
    if (this.zzxp.get())
      zza(this.zzxq, str);
    else
      zzr.zzbC().zzc(this.mContext, this.zzsy, str);
  }

  String zza(String paramString1, Map<String, String> paramMap, @NonNull String paramString2)
  {
    Uri.Builder localBuilder = Uri.parse(paramString1).buildUpon();
    Object localObject = paramMap.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      localBuilder.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    localObject = new StringBuilder(localBuilder.build().toString());
    ((StringBuilder)localObject).append("&").append("it").append("=").append(paramString2);
    return (String)((StringBuilder)localObject).toString();
  }

  private void zza(File paramFile, String paramString)
  {
    if (paramFile != null)
    {
      FileOutputStream localFileOutputStream = null;
      try
      {
        localFileOutputStream = new FileOutputStream(paramFile, true);
        localFileOutputStream.write(paramString.getBytes());
        localFileOutputStream.write(10);
      }
      catch (IOException localIOException3)
      {
        zzin.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", localIOException2);
      }
      finally
      {
        try
        {
          if (localFileOutputStream != null)
            localFileOutputStream.close();
        }
        catch (IOException localIOException4)
        {
          zzin.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", localIOException4);
        }
      }
    }
    else
    {
      zzin.zzaK("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
    }
  }

  Map<String, String> zza(Map<String, String> paramMap1, @Nullable Map<String, String> paramMap2)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(paramMap1);
    if (paramMap2 == null)
      return localLinkedHashMap;
    Iterator localIterator = paramMap2.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getKey();
      String str2 = (String)localEntry.getValue();
      String str3 = (String)localLinkedHashMap.get(str1);
      localLinkedHashMap.put(str1, zzL(str1).zzb(str3, str2));
    }
    return localLinkedHashMap;
  }

  public zzby zzL(String paramString)
  {
    zzby localzzby = (zzby)this.zzxo.get(paramString);
    return localzzby != null ? localzzby : zzby.zzxs;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbv
 * JD-Core Version:    0.6.0
 */