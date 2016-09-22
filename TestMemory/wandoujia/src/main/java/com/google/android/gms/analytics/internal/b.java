package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a.a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class b extends u
{
  private static boolean a;
  private com.google.android.gms.a.a.b b;
  private final l c;
  private String d;
  private boolean e = false;
  private Object f = new Object();

  b(w paramw)
  {
    super(paramw);
    this.c = new l(paramw.c());
  }

  private static String a(String paramString)
  {
    MessageDigest localMessageDigest = m.f("MD5");
    if (localMessageDigest == null)
      return null;
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = new BigInteger(1, localMessageDigest.digest(paramString.getBytes()));
    return String.format(localLocale, "%032X", arrayOfObject);
  }

  private boolean a(com.google.android.gms.a.a.b paramb1, com.google.android.gms.a.a.b paramb2)
  {
    if (paramb2 == null);
    for (Object localObject1 = null; TextUtils.isEmpty((CharSequence)localObject1); localObject1 = paramb2.a())
      return true;
    String str1 = t().b();
    String str3;
    while (true)
    {
      synchronized (this.f)
      {
        if (!this.e)
        {
          this.d = f();
          this.e = true;
          str3 = a((String)localObject1 + str1);
          if (!TextUtils.isEmpty(str3))
            break;
          return false;
        }
      }
      if (!TextUtils.isEmpty(this.d))
        continue;
      String str2 = null;
      if (paramb1 == null);
      while (str2 == null)
      {
        boolean bool1 = b((String)localObject1 + str1);
        monitorexit;
        return bool1;
        str2 = paramb1.a();
      }
      this.d = a(str2 + str1);
    }
    if (str3.equals(this.d))
    {
      monitorexit;
      return true;
    }
    String str4;
    if (!TextUtils.isEmpty(this.d))
    {
      c("Resetting the client id because Advertising Id changed.");
      str4 = t().c();
      a("New client Id", str4);
    }
    while (true)
    {
      boolean bool2 = b((String)localObject1 + str4);
      monitorexit;
      return bool2;
      str4 = str1;
    }
  }

  private boolean b(String paramString)
  {
    try
    {
      String str = a(paramString);
      c("Storing hashed adid.");
      FileOutputStream localFileOutputStream = k().openFileOutput("gaClientIdData", 0);
      localFileOutputStream.write(str.getBytes());
      localFileOutputStream.close();
      this.d = str;
      return true;
    }
    catch (IOException localIOException)
    {
      e("Error creating hash file", localIOException);
    }
    return false;
  }

  private com.google.android.gms.a.a.b d()
  {
    monitorenter;
    try
    {
      com.google.android.gms.a.a.b localb2;
      if (this.c.a(1000L))
      {
        this.c.a();
        localb2 = e();
        if (!a(this.b, localb2))
          break label53;
      }
      for (this.b = localb2; ; this.b = new com.google.android.gms.a.a.b("", false))
      {
        com.google.android.gms.a.a.b localb1 = this.b;
        return localb1;
        label53: g("Failed to reset client id on adid change. Not using adid");
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private com.google.android.gms.a.a.b e()
  {
    try
    {
      com.google.android.gms.a.a.b localb2 = a.a(k());
      localb1 = localb2;
      return localb1;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      f("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
      return null;
    }
    catch (Throwable localThrowable)
    {
      boolean bool;
      do
      {
        bool = a;
        com.google.android.gms.a.a.b localb1 = null;
      }
      while (bool);
      a = true;
      d("Error getting advertiser id", localThrowable);
    }
    return null;
  }

  private String f()
  {
    Object localObject1 = null;
    try
    {
      localFileInputStream = k().openFileInput("gaClientIdData");
      byte[] arrayOfByte = new byte[''];
      int i = localFileInputStream.read(arrayOfByte, 0, 128);
      if (localFileInputStream.available() > 0)
      {
        f("Hash file seems corrupted, deleting it.");
        localFileInputStream.close();
        k().deleteFile("gaClientIdData");
        return null;
      }
      if (i <= 0)
      {
        c("Hash file is empty.");
        localFileInputStream.close();
        return null;
      }
      str = new String(arrayOfByte, 0, i);
    }
    catch (IOException localObject2)
    {
      try
      {
        FileInputStream localFileInputStream;
        localFileInputStream.close();
        return str;
        localIOException1 = localIOException1;
        d("Error reading Hash file, deleting it", localIOException1);
        k().deleteFile("gaClientIdData");
        return localObject1;
      }
      catch (IOException localIOException2)
      {
        while (true)
        {
          localObject1 = str;
          Object localObject2 = localIOException2;
        }
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        String str;
        return str;
      }
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
    }
    return null;
  }

  protected final void a()
  {
  }

  public final boolean b()
  {
    z();
    com.google.android.gms.a.a.b localb = d();
    int i = 0;
    if (localb != null)
    {
      boolean bool = localb.b();
      i = 0;
      if (!bool)
        i = 1;
    }
    return i;
  }

  public final String c()
  {
    z();
    com.google.android.gms.a.a.b localb = d();
    if (localb != null);
    for (String str = localb.a(); ; str = null)
    {
      if (TextUtils.isEmpty(str))
        return null;
      return str;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.b
 * JD-Core Version:    0.6.0
 */