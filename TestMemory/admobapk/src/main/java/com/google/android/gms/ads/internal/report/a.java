package com.google.android.gms.ads.internal.report;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.e;
import com.google.android.gms.ads.internal.util.y;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

@com.google.android.gms.ads.internal.report.client.a
public final class a
  implements Thread.UncaughtExceptionHandler
{
  private Thread.UncaughtExceptionHandler a;
  private Thread.UncaughtExceptionHandler b;
  private Context c;
  private VersionInfoParcel d;

  public a(Context paramContext, VersionInfoParcel paramVersionInfoParcel, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler1, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler2)
  {
    this.a = paramUncaughtExceptionHandler1;
    this.b = paramUncaughtExceptionHandler2;
    this.c = paramContext;
    this.d = paramVersionInfoParcel;
  }

  public static a a(Context paramContext, Thread paramThread, VersionInfoParcel paramVersionInfoParcel)
  {
    if ((paramContext == null) || (paramThread == null) || (paramVersionInfoParcel == null))
      return null;
    if (!a())
      return null;
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = paramThread.getUncaughtExceptionHandler();
    a locala = new a(paramContext, paramVersionInfoParcel, localUncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
    if ((localUncaughtExceptionHandler == null) || (!(localUncaughtExceptionHandler instanceof a)))
      try
      {
        paramThread.setUncaughtExceptionHandler(locala);
        return locala;
      }
      catch (SecurityException localSecurityException)
      {
        if (e.a(4))
          Log.i("Ads", "Fail to set UncaughtExceptionHandler.", localSecurityException);
        return null;
      }
    return (a)localUncaughtExceptionHandler;
  }

  private static boolean a()
  {
    return ((Boolean)m.b.a()).booleanValue();
  }

  private static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    if (paramString.startsWith((String)m.d.a()))
      return true;
    String str1;
    try
    {
      boolean bool = Class.forName(paramString).isAnnotationPresent(com.google.android.gms.ads.internal.report.client.a.class);
      return bool;
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0);
    }
    for (String str2 = "Fail to check class type for class ".concat(str1); ; str2 = new String("Fail to check class type for class "))
    {
      c.a(str2, localException);
      return false;
    }
  }

  public final void a(Throwable paramThrowable, boolean paramBoolean)
  {
    if (!a());
    while (true)
    {
      return;
      if (!((Boolean)m.c.a()).booleanValue())
        break;
      localObject1 = paramThrowable;
      if (localObject1 == null)
        continue;
      Class localClass = paramThrowable.getClass();
      ArrayList localArrayList2 = new ArrayList();
      StringWriter localStringWriter = new StringWriter();
      ((Throwable)localObject1).printStackTrace(new PrintWriter(localStringWriter));
      Uri.Builder localBuilder = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
      localArrayList2.add(localBuilder.appendQueryParameter("device", y.c()).appendQueryParameter("js", this.d.b).appendQueryParameter("appid", this.c.getApplicationContext().getPackageName()).appendQueryParameter("exceptiontype", localClass.getName()).appendQueryParameter("stacktrace", localStringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", m.a())).appendQueryParameter("trapped", String.valueOf(paramBoolean)).toString());
      y.a(localArrayList2, bc.a().h.f());
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    for (Throwable localThrowable1 = paramThrowable; localThrowable1 != null; localThrowable1 = localThrowable1.getCause())
      localLinkedList.push(localThrowable1);
    Object localObject1 = null;
    label265: Throwable localThrowable2;
    label440: Object localObject2;
    if (!localLinkedList.isEmpty())
    {
      localThrowable2 = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = localThrowable2.getStackTrace();
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.add(new StackTraceElement(localThrowable2.getClass().getName(), "<filtered>", "<filtered>", 1));
      int i = arrayOfStackTraceElement.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[j];
        if (a(localStackTraceElement.getClassName()))
        {
          k = 1;
          localArrayList1.add(localStackTraceElement);
        }
        while (true)
        {
          j++;
          break;
          String str = localStackTraceElement.getClassName();
          if ((!TextUtils.isEmpty(str)) && ((str.startsWith("android.")) || (str.startsWith("java."))));
          for (int m = 1; ; m = 0)
          {
            if (m == 0)
              break label440;
            localArrayList1.add(localStackTraceElement);
            break;
          }
          localArrayList1.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
        }
      }
      if (k == 0)
        break label533;
      if (localObject1 != null)
        break label514;
      localObject2 = new Throwable(localThrowable2.getMessage());
      label490: ((Throwable)localObject2).setStackTrace((StackTraceElement[])localArrayList1.toArray(new StackTraceElement[0]));
    }
    while (true)
    {
      localObject1 = localObject2;
      break label265;
      break;
      label514: localObject2 = new Throwable(localThrowable2.getMessage(), (Throwable)localObject1);
      break label490;
      label533: localObject2 = localObject1;
    }
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    int i;
    if (paramThrowable != null)
    {
      int j = 0;
      int k = 0;
      for (Throwable localThrowable = paramThrowable; localThrowable != null; localThrowable = localThrowable.getCause())
        for (StackTraceElement localStackTraceElement : localThrowable.getStackTrace())
        {
          if (a(localStackTraceElement.getClassName()))
            k = 1;
          if (!getClass().getName().equals(localStackTraceElement.getClassName()))
            continue;
          j = 1;
        }
      if ((k != 0) && (j == 0))
      {
        i = 1;
        if (i == 0)
          break label142;
        if (Looper.getMainLooper().getThread() == paramThread)
          break label136;
        a(paramThrowable, true);
      }
    }
    label136: label142: 
    do
    {
      return;
      i = 0;
      break;
      a(paramThrowable, false);
      if (this.a == null)
        continue;
      this.a.uncaughtException(paramThread, paramThrowable);
      return;
    }
    while (this.b == null);
    this.b.uncaughtException(paramThread, paramThrowable);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.report.a
 * JD-Core Version:    0.6.0
 */