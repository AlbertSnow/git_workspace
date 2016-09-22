package com.alipay.ut.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

final class d
  implements b
{
  private final File a;
  private final File b;
  private Map c;
  private boolean d = false;
  private WeakHashMap<b.b, Object> e;

  static
  {
    new Object();
  }

  d(File paramFile, Map paramMap)
  {
    this.a = paramFile;
    this.b = c.a(paramFile);
    if (paramMap != null);
    while (true)
    {
      this.c = paramMap;
      this.e = new WeakHashMap();
      return;
      paramMap = new HashMap();
    }
  }

  private static FileOutputStream a(File paramFile)
  {
    try
    {
      FileOutputStream localFileOutputStream1 = new FileOutputStream(paramFile);
      return localFileOutputStream1;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      if (!paramFile.getParentFile().mkdir())
        return null;
      try
      {
        FileOutputStream localFileOutputStream2 = new FileOutputStream(paramFile);
        return localFileOutputStream2;
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
      }
    }
    return null;
  }

  private boolean c()
  {
    if (this.a.exists())
      if (!this.b.exists())
        if (this.a.renameTo(this.b))
          break label44;
    while (true)
    {
      return false;
      this.a.delete();
      try
      {
        label44: FileOutputStream localFileOutputStream = a(this.a);
        if (localFileOutputStream == null)
          continue;
        Map localMap = this.c;
        a locala = new a();
        locala.setOutput(localFileOutputStream, "utf-8");
        locala.startDocument(null, Boolean.valueOf(true));
        locala.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        com.wandoujia.p4.community.utils.a.a(localMap, null, locala);
        locala.endDocument();
        localFileOutputStream.close();
        this.b.delete();
        return true;
      }
      catch (IOException localIOException)
      {
        if (!this.a.exists())
          continue;
        this.a.delete();
        return false;
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        label137: break label137;
      }
    }
  }

  public final void a()
  {
    monitorenter;
    try
    {
      this.d = true;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(Map paramMap)
  {
    if (paramMap != null)
    {
      monitorenter;
      try
      {
        this.c = paramMap;
        return;
      }
      finally
      {
        monitorexit;
      }
    }
  }

  public final boolean b()
  {
    monitorenter;
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Map<String, ?> getAll()
  {
    monitorenter;
    try
    {
      HashMap localHashMap = new HashMap(this.c);
      return localHashMap;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final long getLong(String paramString, long paramLong)
  {
    monitorenter;
    try
    {
      Long localLong = (Long)this.c.get(paramString);
      if (localLong != null)
        paramLong = localLong.longValue();
      return paramLong;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final String getString(String paramString1, String paramString2)
  {
    monitorenter;
    while (true)
    {
      try
      {
        str = (String)this.c.get(paramString1);
        if (str != null)
          return str;
      }
      finally
      {
        monitorexit;
      }
      String str = paramString2;
    }
  }

  public final boolean l()
  {
    return (this.a != null) && (new File(this.a.getAbsolutePath()).exists());
  }

  public final b.a m()
  {
    return new e(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.b.d
 * JD-Core Version:    0.6.0
 */