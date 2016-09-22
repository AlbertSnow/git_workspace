package com.alipay.android.app.pay;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.support.v4.app.b;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.Properties;

public final class c
{
  public static int a;
  public static int b;
  public static int c;
  public static boolean d;
  public static boolean e;
  public static int f;
  public static String g;
  public static String h;
  public static String i;
  public static String j;
  public static String k;
  public static String l;
  public static String m = "com.alipay.android.app";
  private static String n;
  private static String o;
  private static String p;
  private static String q;
  private static String r;
  private static String s;
  private static String t;
  private static String u;
  private static String v;
  private static String w;
  private static String x;

  public static void a(Context paramContext)
  {
    try
    {
      a = Integer.parseInt(n);
    }
    catch (NumberFormatException localNumberFormatException4)
    {
      try
      {
        b = Integer.parseInt(o);
      }
      catch (NumberFormatException localNumberFormatException4)
      {
        try
        {
          c = Integer.parseInt(p);
        }
        catch (NumberFormatException localNumberFormatException4)
        {
          try
          {
            d = Boolean.parseBoolean(q);
          }
          catch (NumberFormatException localNumberFormatException4)
          {
            try
            {
              e = Boolean.parseBoolean(r);
              new StringBuilder("[GlobalConstant]Boolean.parseBoolean(PRE_TEXT) = ").append(e);
              b.d();
            }
            catch (NumberFormatException localNumberFormatException4)
            {
              try
              {
                f = Integer.parseInt(s);
              }
              catch (NumberFormatException localNumberFormatException4)
              {
                try
                {
                  while (true)
                  {
                    Integer.parseInt(t);
                    try
                    {
                      label80: Boolean.parseBoolean(u);
                      try
                      {
                        label87: Boolean.parseBoolean(v);
                        label94: if (TextUtils.isEmpty(w))
                          w = "https://alipay.com";
                        if (TextUtils.isEmpty(h))
                          h = "https://mclient.alipay.com/gateway.do";
                        if (TextUtils.isEmpty(x))
                          x = "RELEASE";
                        if (TextUtils.isEmpty(i))
                          i = "com.alipay.mobilecashier";
                        if (TextUtils.isEmpty(j))
                          j = "main";
                        if (TextUtils.isEmpty(k))
                          k = "1.0.0";
                        if (TextUtils.isEmpty(l))
                          l = "1";
                        if (TextUtils.isEmpty(g))
                          g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
                        if (d)
                        {
                          String str = paramContext.getSharedPreferences("global_settings", 0).getString("url", "");
                          if (!TextUtils.isEmpty(str))
                            h = str;
                        }
                        return;
                        localNumberFormatException1 = localNumberFormatException1;
                        a = 20000;
                        continue;
                        localNumberFormatException2 = localNumberFormatException2;
                        b = 20000;
                        continue;
                        localNumberFormatException3 = localNumberFormatException3;
                        c = 16384;
                        continue;
                        localException1 = localException1;
                        d = false;
                        continue;
                        localException2 = localException2;
                        e = false;
                        new StringBuilder("[GlobalConstant]Exception = ").append(e);
                        b.d();
                        continue;
                        localNumberFormatException4 = localNumberFormatException4;
                        f = 14;
                      }
                      catch (Exception localException4)
                      {
                        break label94;
                      }
                    }
                    catch (Exception localException3)
                    {
                      break label87;
                    }
                  }
                }
                catch (NumberFormatException localNumberFormatException5)
                {
                  break label80;
                }
              }
            }
          }
        }
      }
    }
  }

  public static void a(Context paramContext, InputStream paramInputStream)
  {
    try
    {
      Properties localProperties = new Properties();
      localProperties.load(paramInputStream);
      if (TextUtils.isEmpty(n))
        n = localProperties.getProperty("http_connection_timeout", "");
      if (TextUtils.isEmpty(o))
        o = localProperties.getProperty("http_so_timeout", "");
      if (TextUtils.isEmpty(p))
        p = localProperties.getProperty("http_socket_buffer_size", "");
      if (TextUtils.isEmpty(q))
        q = localProperties.getProperty("debug", "");
      if (TextUtils.isEmpty(r))
      {
        r = localProperties.getProperty("pre", "");
        new StringBuilder("[GlobalConstant]prop.getProperty = ").append(r);
        b.d();
      }
      if (TextUtils.isEmpty(s))
        s = localProperties.getProperty("tid_count", "");
      if (TextUtils.isEmpty(t))
        t = localProperties.getProperty("rsa_get_count", "");
      SharedPreferences localSharedPreferences;
      if (TextUtils.isEmpty(g))
      {
        localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
        String str = localSharedPreferences.getString("trideskey", null);
        if (TextUtils.isEmpty(str))
          break label409;
        g = str;
      }
      while (true)
      {
        new StringBuilder("RSA_PUBLIC = ").append(g);
        if (TextUtils.isEmpty(u))
          u = localProperties.getProperty("draw_row_frame", "");
        if (TextUtils.isEmpty(v))
          v = localProperties.getProperty("draw_column_frame", "");
        if (TextUtils.isEmpty(w))
          w = localProperties.getProperty("monitor_url", "");
        if (TextUtils.isEmpty(h))
          h = localProperties.getProperty("http_url", "");
        if (TextUtils.isEmpty(x))
          x = localProperties.getProperty("default_server_name", "");
        if (TextUtils.isEmpty(i))
          i = localProperties.getProperty("namespace", "");
        if (TextUtils.isEmpty(j))
          j = localProperties.getProperty("api_name", "");
        if (TextUtils.isEmpty(k))
          k = localProperties.getProperty("api_version", "");
        if (!TextUtils.isEmpty(l))
          break;
        l = localProperties.getProperty("sid", "1");
        return;
        label409: g = localProperties.getProperty("rsa_public", "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB");
        localSharedPreferences.edit().putString("trideskey", g);
      }
    }
    catch (Exception localException)
    {
      b.b(localException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.c
 * JD-Core Version:    0.6.0
 */