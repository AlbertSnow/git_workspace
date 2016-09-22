package com.alipay.wandoujia;

import android.content.Context;
import android.support.v4.app.b;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.android.app.d;
import com.wandoujia.image.c.a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

final class k
{
  private static Object d = new Object();
  private static int e = 0;
  private String a;
  private fa b;
  private StringBuilder c;

  public k(fa paramfa, String paramString)
  {
    try
    {
      this.b = paramfa;
      this.c = new StringBuilder();
      this.c.append(paramString);
      this.a = a("yyyy-MM-dd HH:mm:ss.SSS");
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static File a(String paramString, fa paramfa)
  {
    Calendar localCalendar = Calendar.getInstance();
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(localCalendar.get(11));
    arrayOfObject[1] = Integer.valueOf(localCalendar.get(12));
    arrayOfObject[2] = Integer.valueOf(localCalendar.get(13));
    arrayOfObject[3] = paramfa.a();
    String str = String.format(localLocale, "%s-%s-%s.%s", arrayOfObject);
    File localFile = new File(paramString + str);
    localFile.getParentFile().mkdirs();
    localFile.getAbsoluteFile().createNewFile();
    return localFile;
  }

  public static String a(String paramString)
  {
    return new SimpleDateFormat(paramString, Locale.getDefault()).format(new Date());
  }

  static void a()
  {
    synchronized (d)
    {
      e = 1 + e;
      return;
    }
  }

  private static void a(File paramFile, String paramString)
  {
    if (paramFile.canWrite())
    {
      FileWriter localFileWriter = new FileWriter(paramFile, true);
      localFileWriter.write(paramString + "\r\n");
      localFileWriter.flush();
      localFileWriter.close();
    }
  }

  private static void a(String paramString1, String paramString2, fa paramfa)
  {
    while (true)
    {
      int k;
      try
      {
        File localFile1 = new File(paramString1);
        localFile1.mkdirs();
        File[] arrayOfFile = localFile1.listFiles();
        if ((arrayOfFile != null) && (arrayOfFile.length != 0))
          continue;
        a(a(paramString1, paramfa), paramString2);
        return;
        int i = arrayOfFile.length;
        j = 0;
        k = 0;
        continue;
        if (localObject != null)
          continue;
        switch (c()[paramfa.ordinal()])
        {
        default:
          if (localObject == null)
            continue;
          a((File)localObject, paramString2);
          return;
          File localFile2 = arrayOfFile[k];
          if (j != 0)
            continue;
          if (localFile2.getName().indexOf(paramfa.a()) <= 0)
            break label275;
          j = 1;
          if ((localFile2.length() >= a.a().c().b()) || (localFile2.getName().indexOf(paramfa.a()) <= 0))
            break label281;
          m = j;
          localObject = localFile2;
          break;
        case 2:
        case 6:
        case 7:
        case 8:
        case 13:
          localObject = a(paramString1, paramfa);
          break;
        case 1:
        case 3:
        case 4:
        case 5:
        case 9:
        case 10:
        case 11:
        case 12:
          if (m != 0)
            continue;
          File localFile3 = a(paramString1, paramfa);
          localObject = localFile3;
          continue;
          return;
        }
        if (k < i)
          continue;
        int m = j;
        Object localObject = null;
        continue;
      }
      catch (IOException localIOException)
      {
        return;
      }
      label275: int j = 0;
      continue;
      label281: k++;
    }
  }

  protected final void b()
  {
    switch (c()[this.b.ordinal()])
    {
    case 2:
    case 6:
    case 7:
    case 8:
    default:
    case 1:
    case 3:
    case 4:
    case 5:
    case 9:
    case 10:
    case 11:
    case 12:
    }
    while (true)
    {
      if (!x.f())
        return;
      try
      {
        long l = Long.parseLong(((TelephonyManager)a.a().b().getSystemService("phone")).getSubscriberId()) % 8L;
        if (l != 0L)
        {
          return;
          String str1 = a("yyyy-MM-dd");
          String str2 = a.a().c().a() + str1 + File.separator;
          try
          {
            JSONObject localJSONObject = new JSONObject();
            localJSONObject.put("datetime", this.a);
            localJSONObject.put("monitorType", this.b.name());
            Context localContext = a.a().b();
            x localx = x.a(localContext);
            String str3 = localx.a();
            if (TextUtils.equals(localContext.getPackageName(), "com.alipay.android.app"));
            for (String str4 = "msp"; ; str4 = "sdk")
            {
              localJSONObject.put("message", "==android(" + str4 + ":" + str3 + ")" + this.c);
              localJSONObject.put("tid", localx.b());
              a(str2, localJSONObject.toString(), this.b);
              synchronized (d)
              {
                e = -1 + e;
                return;
              }
            }
          }
          catch (Exception localException2)
          {
            while (true)
              b.b(localException2);
          }
        }
      }
      catch (Exception localException1)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.k
 * JD-Core Version:    0.6.0
 */