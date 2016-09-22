package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.ads.afma.nano.NanoAdshieldEvent.AdShieldEvent;
import com.google.ads.afma.nano.NanoAfmaSignals.AFMASignals;
import com.google.ads.afma.nano.NanoAfmaSignals.AFMASignals.TouchInfo;
import com.google.android.gms.clearcut.zzb;
import com.google.android.gms.clearcut.zzb.zza;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.zzc;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class zzal extends zzak
{
  private static Method zznH;
  private static Method zznI;
  private static Method zznJ;
  private static Method zznK;
  private static Method zznL;
  private static Method zznM;
  private static Method zznN;
  private static Method zznO;
  private static Method zznP;
  private static Method zznQ;
  private static Method zznR;
  private static Method zznS;
  private static Method zznT;
  private static String zznU;
  private static String zznV;
  private static String zznW;
  private static long startTime = 0L;
  private static zzaq zznX;
  static boolean zznY = false;
  protected static zzb zznZ = null;
  protected static NanoAdshieldEvent.AdShieldEvent zzoa;
  protected static int zzob;
  private static Random zzoc = new Random();
  private static zzc zzod = zzc.zzoK();
  private static boolean zzoe;
  protected static boolean zzof = false;
  protected static boolean zzog = false;
  protected static boolean zzoh = false;
  protected static boolean zzoi = false;
  private static boolean zzoj = false;

  protected static synchronized void zza(String paramString, Context paramContext, zzap paramzzap)
  {
    if (!zznY)
      try
      {
        zznX = new zzaq(paramzzap, null);
        zznU = paramString;
        zzbt.initialize(paramContext);
        zzm(paramContext);
        startTime = zzV().longValue();
        zzoc = new Random();
        try
        {
          zznG = new GoogleApiClient.Builder(paramContext).addApi(zzb.API).build();
          zzod = zzc.zzoK();
          zzoe = zzod.isGooglePlayServicesAvailable(paramContext) == 0;
          zzbt.initialize(paramContext);
          zzof = ((Boolean)zzbt.zzwZ.get()).booleanValue();
          zznZ = new zzb(paramContext, "ADSHIELD", null, null);
        }
        catch (NoClassDefFoundError localNoClassDefFoundError)
        {
        }
        zzoj = zzod.zzaj(paramContext) > 0;
        zznY = true;
      }
      catch (zza localzza)
      {
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
      }
  }

  protected zzal(Context paramContext, zzap paramzzap)
  {
    super(paramContext, paramzzap);
    zzoa = new NanoAdshieldEvent.AdShieldEvent();
    zzoa.appId = paramContext.getPackageName();
  }

  protected boolean zzS()
  {
    return zzoj;
  }

  private void zze(Context paramContext)
  {
    if (zzoe)
    {
      zznG.connect();
      zzoi = true;
    }
    else
    {
      zzoi = false;
    }
  }

  private void zzT()
  {
    if ((zzoi) && (zznZ != null))
    {
      zznZ.zza(zznG, 100L, TimeUnit.MILLISECONDS);
      zznG.disconnect();
    }
  }

  protected NanoAfmaSignals.AFMASignals zzc(Context paramContext)
  {
    NanoAfmaSignals.AFMASignals localAFMASignals = new NanoAfmaSignals.AFMASignals();
    try
    {
      zze(paramContext);
      zzob = zzoc.nextInt();
      zza(0, zzob);
      try
      {
        localAFMASignals.osVersion = zzW();
        zza(1, zzob);
      }
      catch (zza localzza1)
      {
      }
      try
      {
        localAFMASignals.afmaVersion = zzU();
        zza(2, zzob);
      }
      catch (zza localzza2)
      {
      }
      try
      {
        long l1 = zzV().longValue();
        localAFMASignals.evtTime = Long.valueOf(l1);
        if (startTime != 0L)
        {
          localAFMASignals.uptSignal = Long.valueOf(l1 - startTime);
          localAFMASignals.usgSignal = Long.valueOf(startTime);
        }
        zza(25, zzob);
      }
      catch (zza localzza3)
      {
      }
      try
      {
        ArrayList localArrayList = zzi(paramContext);
        localAFMASignals.uwSignal = Long.valueOf(((Long)localArrayList.get(0)).longValue());
        localAFMASignals.uhSignal = Long.valueOf(((Long)localArrayList.get(1)).longValue());
        zza(31, zzob);
      }
      catch (zza localzza4)
      {
      }
      try
      {
        localAFMASignals.utzSignal = zzX();
        zza(33, zzob);
      }
      catch (zza localzza5)
      {
      }
      try
      {
        if ((!zzog) || (!zzoh))
        {
          localAFMASignals.intSignal = zza(paramContext, this.zznF);
          zza(27, zzob);
        }
      }
      catch (zza localzza6)
      {
      }
      try
      {
        localAFMASignals.cerSignal = zzb(paramContext, this.zznF);
        zza(29, zzob);
      }
      catch (zza localzza7)
      {
      }
      try
      {
        int[] arrayOfInt = zzj(paramContext);
        localAFMASignals.btsSignal = Long.valueOf(arrayOfInt[0]);
        localAFMASignals.btlSignal = Long.valueOf(arrayOfInt[1]);
        zza(5, zzob);
      }
      catch (zza localzza8)
      {
      }
      try
      {
        long l2 = zzk(paramContext);
        localAFMASignals.ornSignal = Long.valueOf(l2);
        zza(12, zzob);
      }
      catch (zza localzza9)
      {
      }
      try
      {
        long l3 = zzl(paramContext);
        localAFMASignals.atvSignal = Long.valueOf(l3);
        zza(3, zzob);
      }
      catch (zza localzza10)
      {
      }
      try
      {
        localAFMASignals.vnmSignal = zzg(paramContext);
        zza(34, zzob);
      }
      catch (zza localzza11)
      {
      }
      try
      {
        localAFMASignals.vcdSignal = zzh(paramContext);
        zza(35, zzob);
      }
      catch (zza localzza12)
      {
      }
      zzT();
    }
    catch (IOException localIOException)
    {
    }
    return localAFMASignals;
  }

  protected NanoAfmaSignals.AFMASignals zzd(Context paramContext)
  {
    NanoAfmaSignals.AFMASignals localAFMASignals = new NanoAfmaSignals.AFMASignals();
    try
    {
      zze(paramContext);
      zzob = zzoc.nextInt();
      try
      {
        localAFMASignals.afmaVersion = zzU();
      }
      catch (zza localzza1)
      {
      }
      try
      {
        localAFMASignals.osVersion = zzW();
      }
      catch (zza localzza2)
      {
      }
      try
      {
        localAFMASignals.evtTime = zzV();
      }
      catch (zza localzza3)
      {
      }
      zza(0, zzob);
      try
      {
        ArrayList localArrayList1 = zza(this.zznx, this.zznE);
        localAFMASignals.tcxSignal = ((Long)localArrayList1.get(0));
        localAFMASignals.tcySignal = ((Long)localArrayList1.get(1));
        if (((Long)localArrayList1.get(2)).longValue() >= 0L)
          localAFMASignals.tctSignal = ((Long)localArrayList1.get(2));
        localAFMASignals.tcpSignal = ((Long)localArrayList1.get(3));
        localAFMASignals.tcdSignal = ((Long)localArrayList1.get(4));
        zza(14, zzob);
      }
      catch (zza localzza4)
      {
      }
      if (this.zznz > 0L)
        localAFMASignals.tcdnSignal = Long.valueOf(this.zznz);
      if (this.zznA > 0L)
        localAFMASignals.tcmSignal = Long.valueOf(this.zznA);
      if (this.zznB > 0L)
        localAFMASignals.tcuSignal = Long.valueOf(this.zznB);
      if (this.zznC > 0L)
        localAFMASignals.tccSignal = Long.valueOf(this.zznC);
      try
      {
        int i = this.zzny.size() - 1;
        if (i > 0)
        {
          localAFMASignals.previousTouches = new NanoAfmaSignals.AFMASignals.TouchInfo[i];
          for (int j = 0; j < i; j++)
          {
            ArrayList localArrayList2 = zza((MotionEvent)this.zzny.get(j), this.zznE);
            NanoAfmaSignals.AFMASignals.TouchInfo localTouchInfo = new NanoAfmaSignals.AFMASignals.TouchInfo();
            localTouchInfo.tcxSignal = ((Long)localArrayList2.get(0));
            localTouchInfo.tcySignal = ((Long)localArrayList2.get(1));
            localAFMASignals.previousTouches[j] = localTouchInfo;
          }
        }
      }
      catch (zza localzza5)
      {
        localAFMASignals.previousTouches = null;
      }
      try
      {
        localAFMASignals.vnmSignal = zzg(paramContext);
      }
      catch (zza localzza6)
      {
      }
      try
      {
        localAFMASignals.vcdSignal = zzh(paramContext);
      }
      catch (zza localzza7)
      {
      }
      zzT();
    }
    catch (IOException localIOException)
    {
    }
    return localAFMASignals;
  }

  static String zzU()
    throws zzal.zza
  {
    if (zznU == null)
      throw new zza();
    return zznU;
  }

  static Long zzV()
    throws zzal.zza
  {
    if (zznH == null)
      throw new zza();
    try
    {
      return (Long)zznH.invoke(null, new Object[0]);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static String zzf(Context paramContext)
    throws zzal.zza
  {
    if (zznM == null)
      throw new zza();
    try
    {
      String str = (String)zznM.invoke(null, new Object[] { paramContext });
      if (str == null)
        throw new zza();
      return str;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static String zzW()
    throws zzal.zza
  {
    if (zznJ == null)
      throw new zza();
    try
    {
      return (String)zznJ.invoke(null, new Object[0]);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static ArrayList<Long> zza(MotionEvent paramMotionEvent, DisplayMetrics paramDisplayMetrics)
    throws zzal.zza
  {
    if ((zznL == null) || (paramMotionEvent == null))
      throw new zza();
    try
    {
      ArrayList localArrayList = (ArrayList)zznL.invoke(null, new Object[] { paramMotionEvent, paramDisplayMetrics });
      return localArrayList;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static String zzg(Context paramContext)
    throws zzal.zza
  {
    if (zznQ == null)
      throw new zza();
    try
    {
      String str = (String)zznQ.invoke(null, new Object[] { paramContext });
      return str;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static Long zzh(Context paramContext)
    throws zzal.zza
  {
    if (zznR == null)
      throw new zza();
    try
    {
      Long localLong = (Long)zznR.invoke(null, new Object[] { paramContext });
      return localLong;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static String zza(Context paramContext, zzap paramzzap)
    throws zzal.zza
  {
    if (zznV != null)
      return zznV;
    if (zznK == null)
      throw new zza();
    try
    {
      ByteBuffer localByteBuffer = (ByteBuffer)zznK.invoke(null, new Object[] { paramContext });
      if (localByteBuffer == null)
        throw new zza();
      zznV = paramzzap.zza(localByteBuffer.array(), true);
      return zznV;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static ArrayList<Long> zzi(Context paramContext)
    throws zzal.zza
  {
    if (zznO == null)
      throw new zza();
    try
    {
      ArrayList localArrayList = (ArrayList)zznO.invoke(null, new Object[] { paramContext });
      if ((localArrayList == null) || (localArrayList.size() != 2))
        throw new zza();
      return localArrayList;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static String zzb(Context paramContext, zzap paramzzap)
    throws zzal.zza
  {
    if (zznW != null)
      return zznW;
    if (zznN == null)
      throw new zza();
    try
    {
      ByteBuffer localByteBuffer = (ByteBuffer)zznN.invoke(null, new Object[] { paramContext });
      if (localByteBuffer == null)
        throw new zza();
      zznW = paramzzap.zza(localByteBuffer.array(), true);
      return zznW;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static Long zzX()
    throws zzal.zza
  {
    if (zznI == null)
      throw new zza();
    try
    {
      return (Long)zznI.invoke(null, new Object[0]);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static int[] zzj(Context paramContext)
    throws zzal.zza
  {
    if (zznP == null)
      throw new zza();
    try
    {
      return (int[])zznP.invoke(null, new Object[] { paramContext });
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static int zzk(Context paramContext)
    throws zzal.zza
  {
    if (zznS == null)
      throw new zza();
    try
    {
      return ((Integer)zznS.invoke(null, new Object[] { paramContext })).intValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  static int zzl(Context paramContext)
    throws zzal.zza
  {
    if (zznT == null)
      throw new zza();
    try
    {
      return ((Integer)zznT.invoke(null, new Object[] { paramContext })).intValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new zza(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new zza(localInvocationTargetException);
  }

  private static String zzb(byte[] paramArrayOfByte, String paramString)
    throws zzal.zza
  {
    try
    {
      return new String(zznX.zzc(paramArrayOfByte, paramString), "UTF-8");
    }
    catch (zzaq.zza localzza)
    {
      throw new zza(localzza);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new zza(localUnsupportedEncodingException);
  }

  private static void zzm(Context paramContext)
    throws zzal.zza
  {
    try
    {
      byte[] arrayOfByte1 = zznX.zzl(zzar.getKey());
      byte[] arrayOfByte2 = zznX.zzc(arrayOfByte1, zzar.zzac());
      File localFile1 = paramContext.getCacheDir();
      if (localFile1 == null)
      {
        localFile1 = paramContext.getDir("dex", 0);
        if (localFile1 == null)
          throw new zza();
      }
      File localFile2 = File.createTempFile("ads", ".jar", localFile1);
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
      localFileOutputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
      localFileOutputStream.close();
      try
      {
        localObject1 = new DexClassLoader(localFile2.getAbsolutePath(), localFile1.getAbsolutePath(), null, paramContext.getClassLoader());
        Class localClass1 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzal()));
        Class localClass2 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzaz()));
        Class localClass3 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzat()));
        Class localClass4 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzap()));
        Class localClass5 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzaB()));
        Class localClass6 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzan()));
        Class localClass7 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzax()));
        Class localClass8 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzav()));
        Class localClass9 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzaj()));
        Class localClass10 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzah()));
        Class localClass11 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzaf()));
        Class localClass12 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzar()));
        Class localClass13 = ((DexClassLoader)localObject1).loadClass(zzb(arrayOfByte1, zzar.zzad()));
        zznH = localClass1.getMethod(zzb(arrayOfByte1, zzar.zzam()), new Class[0]);
        zznI = localClass2.getMethod(zzb(arrayOfByte1, zzar.zzaA()), new Class[0]);
        zznJ = localClass3.getMethod(zzb(arrayOfByte1, zzar.zzau()), new Class[0]);
        zznK = localClass4.getMethod(zzb(arrayOfByte1, zzar.zzaq()), new Class[] { Context.class });
        zznL = localClass5.getMethod(zzb(arrayOfByte1, zzar.zzaC()), new Class[] { MotionEvent.class, DisplayMetrics.class });
        zznM = localClass6.getMethod(zzb(arrayOfByte1, zzar.zzao()), new Class[] { Context.class });
        zznN = localClass7.getMethod(zzb(arrayOfByte1, zzar.zzay()), new Class[] { Context.class });
        zznO = localClass8.getMethod(zzb(arrayOfByte1, zzar.zzaw()), new Class[] { Context.class });
        zznP = localClass9.getMethod(zzb(arrayOfByte1, zzar.zzak()), new Class[] { Context.class });
        zznQ = localClass10.getMethod(zzb(arrayOfByte1, zzar.zzai()), new Class[] { Context.class });
        zznR = localClass11.getMethod(zzb(arrayOfByte1, zzar.zzag()), new Class[] { Context.class });
        zznS = localClass12.getMethod(zzb(arrayOfByte1, zzar.zzas()), new Class[] { Context.class });
        zznT = localClass13.getMethod(zzb(arrayOfByte1, zzar.zzae()), new Class[] { Context.class });
      }
      finally
      {
        Object localObject1;
        String str = localFile2.getName();
        localFile2.delete();
        new File(localFile1, str.replace(".jar", ".dex")).delete();
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      throw new zza(localFileNotFoundException);
    }
    catch (IOException localIOException)
    {
      throw new zza(localIOException);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new zza(localClassNotFoundException);
    }
    catch (zzaq.zza localzza)
    {
      throw new zza(localzza);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new zza(localNoSuchMethodException);
    }
    catch (NullPointerException localNullPointerException)
    {
      throw new zza(localNullPointerException);
    }
  }

  protected static void zza(int paramInt1, int paramInt2)
    throws IOException
  {
    if ((zzoi) && (zzof) && (zznZ != null))
    {
      zzb.zza localzza = zznZ.zzi(zzsu.toByteArray(zzoa));
      localzza.zzbr(paramInt2);
      localzza.zzbq(paramInt1);
      localzza.zzd(zznG);
    }
  }

  static class zza extends Exception
  {
    public zza()
    {
    }

    public zza(Throwable paramThrowable)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzal
 * JD-Core Version:    0.6.0
 */