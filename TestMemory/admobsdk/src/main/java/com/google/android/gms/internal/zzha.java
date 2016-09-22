package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

@zzhb
public class zzha
  implements Thread.UncaughtExceptionHandler
{
  private Thread.UncaughtExceptionHandler zzHe;
  private Thread.UncaughtExceptionHandler zzHf;
  private Context mContext;
  private VersionInfoParcel zzEZ;

  public static zzha zza(Context paramContext, Thread paramThread, VersionInfoParcel paramVersionInfoParcel)
  {
    if ((paramContext == null) || (paramThread == null) || (paramVersionInfoParcel == null))
      return null;
    if (!zzA(paramContext))
      return null;
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler1 = paramThread.getUncaughtExceptionHandler();
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
    zzha localzzha = new zzha(paramContext, paramVersionInfoParcel, localUncaughtExceptionHandler1, localUncaughtExceptionHandler2);
    if ((localUncaughtExceptionHandler1 == null) || (!(localUncaughtExceptionHandler1 instanceof zzha)))
      try
      {
        paramThread.setUncaughtExceptionHandler(localzzha);
        return localzzha;
      }
      catch (SecurityException localSecurityException)
      {
        zzin.zzc("Fail to set UncaughtExceptionHandler.", localSecurityException);
      }
    else
      return (zzha)localUncaughtExceptionHandler1;
    return null;
  }

  private static boolean zzA(Context paramContext)
  {
    return ((Boolean)zzbt.zzvG.get()).booleanValue();
  }

  public zzha(Context paramContext, VersionInfoParcel paramVersionInfoParcel, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler1, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler2)
  {
    this.zzHe = paramUncaughtExceptionHandler1;
    this.zzHf = paramUncaughtExceptionHandler2;
    this.mContext = paramContext;
    this.zzEZ = paramVersionInfoParcel;
  }

  public void uncaughtException(Thread thread, Throwable exception)
  {
    if (zza(exception))
    {
      if (Looper.getMainLooper().getThread() != thread)
      {
        zza(exception, true);
        return;
      }
      zza(exception, false);
    }
    if (this.zzHe != null)
      this.zzHe.uncaughtException(thread, exception);
    else if (this.zzHf != null)
      this.zzHf.uncaughtException(thread, exception);
  }

  protected boolean zza(Throwable paramThrowable)
  {
    if (paramThrowable == null)
      return false;
    int i = 0;
    int j = 0;
    while (paramThrowable != null)
    {
      StackTraceElement[] arrayOfStackTraceElement1 = paramThrowable.getStackTrace();
      for (StackTraceElement localStackTraceElement : arrayOfStackTraceElement1)
      {
        if (zzat(localStackTraceElement.getClassName()))
          i = 1;
        if (!getClass().getName().equals(localStackTraceElement.getClassName()))
          continue;
        j = 1;
      }
      paramThrowable = paramThrowable.getCause();
    }
    return (i != 0) && (j == 0);
  }

  protected boolean zzat(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    if (paramString.startsWith("com.google.android.gms.ads"))
      return true;
    if (paramString.startsWith("com.google.ads"))
      return true;
    try
    {
      Class localClass = Class.forName(paramString);
      return localClass.isAnnotationPresent(zzhb.class);
    }
    catch (Exception localException)
    {
      zzin.zza("Fail to check class type for class " + paramString, localException);
    }
    return false;
  }

  protected boolean zzau(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    return (paramString.startsWith("android.")) || (paramString.startsWith("java."));
  }

  public void zza(Throwable paramThrowable, boolean paramBoolean)
  {
    if (!zzA(this.mContext))
      return;
    Throwable localThrowable = zzb(paramThrowable);
    if (localThrowable == null)
      return;
    Class localClass = paramThrowable.getClass();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(zza(localClass, localThrowable, paramBoolean));
    zzr.zzbC().zza(this.mContext, this.zzEZ.afmaVersion, localArrayList, zzr.zzbF().zzhe());
  }

  String zza(Class paramClass, Throwable paramThrowable, boolean paramBoolean)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    Uri.Builder localBuilder = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", zzr.zzbC().zzht()).appendQueryParameter("js", this.zzEZ.afmaVersion).appendQueryParameter("appid", this.mContext.getApplicationContext().getPackageName()).appendQueryParameter("exceptiontype", paramClass.getName()).appendQueryParameter("stacktrace", localStringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", zzbt.zzdr())).appendQueryParameter("trapped", String.valueOf(paramBoolean));
    return localBuilder.toString();
  }

  private Throwable zzb(Throwable paramThrowable)
  {
    if (((Boolean)zzbt.zzvH.get()).booleanValue())
      return paramThrowable;
    LinkedList localLinkedList = new LinkedList();
    for (Throwable localThrowable1 = paramThrowable; localThrowable1 != null; localThrowable1 = localThrowable1.getCause())
      localLinkedList.push(localThrowable1);
    Throwable localThrowable2 = null;
    while (!localLinkedList.isEmpty())
    {
      localThrowable1 = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement1 = localThrowable1.getStackTrace();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new StackTraceElement(localThrowable1.getClass().getName(), "<filtered>", "<filtered>", 1));
      int i = 0;
      for (StackTraceElement localStackTraceElement1 : arrayOfStackTraceElement1)
        if (zzat(localStackTraceElement1.getClassName()))
        {
          i = 1;
          localArrayList.add(localStackTraceElement1);
        }
        else if (zzau(localStackTraceElement1.getClassName()))
        {
          localArrayList.add(localStackTraceElement1);
        }
        else
        {
          StackTraceElement localStackTraceElement2 = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
          localArrayList.add(localStackTraceElement2);
        }
      if (i != 0)
      {
        if (localThrowable2 == null)
          localThrowable2 = new Throwable(localThrowable1.getMessage());
        else
          localThrowable2 = new Throwable(localThrowable1.getMessage(), localThrowable2);
        localThrowable2.setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
      }
    }
    return localThrowable2;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzha
 * JD-Core Version:    0.6.0
 */