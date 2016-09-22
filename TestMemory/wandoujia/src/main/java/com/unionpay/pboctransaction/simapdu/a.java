package com.unionpay.pboctransaction.simapdu;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.support.v4.app.i;
import android.text.TextUtils;
import com.unionpay.pboctransaction.AppIdentification;
import com.unionpay.pboctransaction.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simalliance.openmobileapi.Channel;
import org.simalliance.openmobileapi.Reader;
import org.simalliance.openmobileapi.SEService;
import org.simalliance.openmobileapi.SEService.CallBack;
import org.simalliance.openmobileapi.Session;

public final class a
  implements com.unionpay.pboctransaction.c, SEService.CallBack
{
  private static a d = new a();
  private SEService a = null;
  private Channel[] b = new Channel[3];
  private com.unionpay.pboctransaction.b c;
  private Handler.Callback e = new b(this);
  private Handler f = new Handler(this.e);

  private String a(String paramString, int paramInt)
  {
    monitorenter;
    Object localObject1 = null;
    if (paramString == null)
    {
      monitorexit;
      return localObject1;
    }
    while (true)
    {
      while (true)
      {
        String str1;
        try
        {
          str1 = paramString.toUpperCase(Locale.CHINA);
          if (paramInt <= this.b.length)
            continue;
          paramInt = 0;
          if ((str1.startsWith("00A40400")) || (str1.startsWith("01A40400")))
            break label210;
          boolean bool = str1.startsWith("02A40400");
          i = 0;
          if (bool)
            break label210;
          if (i != 0)
          {
            a(paramInt);
            localObject1 = b(i.b(str1.substring(10, 10 + 2 * (16 * Integer.parseInt(str1.substring(8, 9), 16) + Integer.parseInt(str1.substring(9, 10), 16)))), paramInt);
            if (!TextUtils.isEmpty((CharSequence)localObject1))
              break;
            throw new a.a();
          }
        }
        finally
        {
          monitorexit;
        }
        try
        {
          byte[] arrayOfByte = i.b(str1);
          localObject1 = null;
          if (arrayOfByte == null)
            break;
          String str2 = i.a(this.b[paramInt].transmit(arrayOfByte));
          localObject1 = str2;
        }
        catch (IOException localIOException)
        {
          throw new a.a();
        }
        catch (Exception localException)
        {
          localObject1 = null;
        }
      }
      break;
      label210: int i = 1;
    }
  }

  private void a(int paramInt)
  {
    if ((this.b[paramInt] != null) && (paramInt <= this.b.length));
    try
    {
      this.b[paramInt].close();
      label27: this.b[paramInt] = null;
      return;
    }
    catch (Exception localException)
    {
      break label27;
    }
  }

  private String b(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      Reader[] arrayOfReader = this.a.getReaders();
      if (arrayOfReader.length > 0)
      {
        Channel localChannel = arrayOfReader[0].openSession().openLogicalChannel(paramArrayOfByte);
        if (localChannel != null)
        {
          this.b[paramInt] = localChannel;
          byte[] arrayOfByte = localChannel.getSelectResponse();
          String str = i.a(arrayOfByte, arrayOfByte.length);
          return str;
        }
      }
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public static a d()
  {
    monitorenter;
    try
    {
      a locala = d;
      monitorexit;
      return locala;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final ArrayList<com.unionpay.pboctransaction.model.b> a(e parame)
  {
    ArrayList localArrayList1 = new ArrayList(1);
    String str1 = parame.a("A0000003330101");
    if ((str1 == null) || (str1.length() < 16));
    do
    {
      return null;
      localArrayList1.add(new AppIdentification(str1, null));
    }
    while (localArrayList1.size() <= 0);
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
    {
      AppIdentification localAppIdentification = (AppIdentification)localIterator.next();
      if ("06".equalsIgnoreCase(localAppIdentification.b()))
        continue;
      String str2 = i.d(parame.a(localAppIdentification));
      if ((str2 == null) || (str2.length() <= 0))
        continue;
      localArrayList2.add(new com.unionpay.pboctransaction.model.a(16, localAppIdentification.a(), "", str2, 1));
    }
    return localArrayList2;
  }

  public final void a()
  {
  }

  public final void a(com.unionpay.pboctransaction.b paramb, Context paramContext)
  {
    this.c = paramb;
    try
    {
      this.a = new SEService(paramContext, this);
      new c(this).start();
      return;
    }
    catch (Exception localException)
    {
      this.f.sendEmptyMessage(2);
    }
  }

  public final byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      byte[] arrayOfByte = i.b(a(i.a(paramArrayOfByte, paramArrayOfByte.length), paramInt));
      return arrayOfByte;
    }
    catch (a.a locala)
    {
    }
    return null;
  }

  public final void b()
  {
    c();
  }

  public final void c()
  {
    for (int i = 0; i < this.b.length; i++)
      a(i);
  }

  public final boolean e()
  {
    new StringBuilder("isConnected:").append(this.a);
    new StringBuilder("isConnected:").append(this.a.isConnected());
    return (this.a != null) && (this.a.isConnected());
  }

  public final void f()
  {
    new StringBuilder(" mSEService = ").append(this.a);
    c();
    if ((this.a != null) && (this.a.isConnected()))
      this.a.shutdown();
  }

  public final void serviceConnected(SEService paramSEService)
  {
    new StringBuilder("mSEService:").append(this.a);
    new StringBuilder("mSEService.isConnected:").append(this.a.isConnected());
    this.f.sendEmptyMessage(1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.simapdu.a
 * JD-Core Version:    0.6.0
 */