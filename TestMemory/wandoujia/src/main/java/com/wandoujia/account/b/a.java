package com.wandoujia.account.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.dto.DeviceBean;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.account.listener.IAccountListener.LoginType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public final class a
{
  private String a;
  private SsoHandler b;
  private String c;
  private String d;
  private com.sina.weibo.sdk.auth.b e;
  private com.wandoujia.account.listener.b f;
  private com.wandoujia.gson.c g = new com.wandoujia.gson.j().a(Date.class, new b()).a();
  private int h = 5;
  private Handler i = new Handler(Looper.getMainLooper());
  private final List<IAccountListener> j = new ArrayList();
  private final s k = new s(this);
  private com.wandoujia.account.f.a l = new com.wandoujia.account.f.a();

  // ERROR //
  private AccountResponse a(String paramString, List<NameValuePair> paramList)
  {
    // Byte code:
    //   0: new 93	org/apache/http/client/methods/HttpPost
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 96	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   8: astore_3
    //   9: aconst_null
    //   10: astore 4
    //   12: invokestatic 99	com/wandoujia/account/b/a:a	()Lorg/apache/http/client/HttpClient;
    //   15: astore 5
    //   17: aload_3
    //   18: ldc 101
    //   20: aload_0
    //   21: invokespecial 104	com/wandoujia/account/b/a:j	()Ljava/lang/String;
    //   24: invokevirtual 108	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: invokestatic 112	com/wandoujia/account/a:h	()Ljava/lang/String;
    //   30: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   33: ifne +27 -> 60
    //   36: aload_3
    //   37: ldc 101
    //   39: new 120	java/lang/StringBuilder
    //   42: dup
    //   43: ldc 122
    //   45: invokespecial 123	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: invokestatic 112	com/wandoujia/account/a:h	()Ljava/lang/String;
    //   51: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: invokevirtual 133	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload_3
    //   61: new 135	org/apache/http/client/entity/UrlEncodedFormEntity
    //   64: dup
    //   65: aload_2
    //   66: ldc 137
    //   68: invokespecial 140	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   71: invokevirtual 144	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   74: aload 5
    //   76: aload_3
    //   77: invokeinterface 150 2 0
    //   82: astore 11
    //   84: aload 11
    //   86: invokeinterface 156 1 0
    //   91: invokeinterface 162 1 0
    //   96: istore 12
    //   98: iload 12
    //   100: sipush 200
    //   103: if_icmpne +92 -> 195
    //   106: aload 11
    //   108: invokeinterface 166 1 0
    //   113: ldc 168
    //   115: invokestatic 173	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   118: astore 18
    //   120: aload_0
    //   121: getfield 79	com/wandoujia/account/b/a:g	Lcom/wandoujia/gson/c;
    //   124: aload 18
    //   126: ldc 175
    //   128: invokevirtual 180	com/wandoujia/gson/c:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   131: checkcast 175	com/wandoujia/account/dto/AccountResponse
    //   134: astore 8
    //   136: aload 11
    //   138: invokestatic 185	android/support/v4/app/b:b	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   141: astore 23
    //   143: aload 23
    //   145: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   148: ifne +9 -> 157
    //   151: aload_0
    //   152: aload 23
    //   154: putfield 187	com/wandoujia/account/b/a:a	Ljava/lang/String;
    //   157: aload 8
    //   159: ifnull +23 -> 182
    //   162: aload 8
    //   164: invokevirtual 191	com/wandoujia/account/dto/AccountResponse:getMember	()Lcom/wandoujia/account/dto/AccountBean;
    //   167: ifnull +15 -> 182
    //   170: aload 8
    //   172: invokevirtual 191	com/wandoujia/account/dto/AccountResponse:getMember	()Lcom/wandoujia/account/dto/AccountBean;
    //   175: aload_0
    //   176: getfield 187	com/wandoujia/account/b/a:a	Ljava/lang/String;
    //   179: invokestatic 194	android/support/v4/app/b:a	(Lcom/wandoujia/account/dto/AccountBean;Ljava/lang/String;)V
    //   182: aload 5
    //   184: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   187: aload 8
    //   189: ifnull +106 -> 295
    //   192: aload 8
    //   194: areturn
    //   195: iload 12
    //   197: sipush 403
    //   200: if_icmpne +38 -> 238
    //   203: aload_0
    //   204: aload 11
    //   206: invokeinterface 166 1 0
    //   211: ldc 168
    //   213: invokestatic 173	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   216: invokespecial 200	com/wandoujia/account/b/a:i	(Ljava/lang/String;)Lcom/wandoujia/account/dto/AccountResponse;
    //   219: astore 15
    //   221: aload 15
    //   223: astore 8
    //   225: goto -43 -> 182
    //   228: astore 14
    //   230: aconst_null
    //   231: astore 8
    //   233: goto -51 -> 182
    //   236: astore 13
    //   238: aconst_null
    //   239: astore 8
    //   241: goto -59 -> 182
    //   244: astore 10
    //   246: aload 5
    //   248: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   251: aload 4
    //   253: astore 8
    //   255: goto -68 -> 187
    //   258: astore 9
    //   260: aload 5
    //   262: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   265: aload 4
    //   267: astore 8
    //   269: goto -82 -> 187
    //   272: astore 7
    //   274: aload 5
    //   276: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   279: aconst_null
    //   280: astore 8
    //   282: goto -95 -> 187
    //   285: astore 6
    //   287: aload 5
    //   289: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   292: aload 6
    //   294: athrow
    //   295: new 175	com/wandoujia/account/dto/AccountResponse
    //   298: dup
    //   299: invokespecial 201	com/wandoujia/account/dto/AccountResponse:<init>	()V
    //   302: areturn
    //   303: astore 22
    //   305: aload 8
    //   307: astore 4
    //   309: goto -49 -> 260
    //   312: astore 21
    //   314: aload 8
    //   316: astore 4
    //   318: goto -72 -> 246
    //   321: astore 17
    //   323: aconst_null
    //   324: astore 8
    //   326: goto -144 -> 182
    //   329: astore 20
    //   331: goto -149 -> 182
    //   334: astore 16
    //   336: aconst_null
    //   337: astore 8
    //   339: goto -157 -> 182
    //   342: astore 19
    //   344: goto -162 -> 182
    //
    // Exception table:
    //   from	to	target	type
    //   203	221	228	com/wandoujia/gson/JsonParseException
    //   203	221	236	java/io/IOException
    //   60	98	244	org/apache/http/client/ClientProtocolException
    //   106	136	244	org/apache/http/client/ClientProtocolException
    //   203	221	244	org/apache/http/client/ClientProtocolException
    //   60	98	258	java/io/UnsupportedEncodingException
    //   106	136	258	java/io/UnsupportedEncodingException
    //   203	221	258	java/io/UnsupportedEncodingException
    //   60	98	272	java/io/IOException
    //   60	98	285	finally
    //   106	136	285	finally
    //   136	157	285	finally
    //   162	182	285	finally
    //   203	221	285	finally
    //   136	157	303	java/io/UnsupportedEncodingException
    //   162	182	303	java/io/UnsupportedEncodingException
    //   136	157	312	org/apache/http/client/ClientProtocolException
    //   162	182	312	org/apache/http/client/ClientProtocolException
    //   106	136	321	java/io/IOException
    //   136	157	329	java/io/IOException
    //   162	182	329	java/io/IOException
    //   106	136	334	com/wandoujia/gson/JsonParseException
    //   136	157	342	com/wandoujia/gson/JsonParseException
    //   162	182	342	com/wandoujia/gson/JsonParseException
  }

  public static HttpClient a()
  {
    return com.wandoujia.account.e.a.a(10000, 10000);
  }

  private void a(Context paramContext, String paramString, DeviceBean paramDeviceBean)
  {
    if ((paramContext instanceof Activity));
    try
    {
      com.sina.weibo.sdk.auth.a locala = new com.sina.weibo.sdk.auth.a(paramContext, this.l.a(), "http://account.wandoujia.com/v1/user/?do=platform_sina", "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write");
      this.b = new SsoHandler((Activity)paramContext, locala);
      this.b.a(new j(this, paramString, paramDeviceBean));
      return;
    }
    catch (Error localError)
    {
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void a(IAccountListener.LoginType paramLoginType)
  {
    this.i.post(new c(this, paramLoginType));
  }

  private void a(boolean paramBoolean)
  {
    com.wandoujia.account.a.D();
    this.i.post(new f(this, paramBoolean));
  }

  public static Bitmap b()
  {
    HttpGet localHttpGet = new HttpGet("https://account.wandoujia.com/v4/api/seccode");
    HttpClient localHttpClient = a();
    try
    {
      HttpResponse localHttpResponse = localHttpClient.execute(localHttpGet);
      if (localHttpResponse.getStatusLine().getStatusCode() == 200)
      {
        com.wandoujia.account.a.c(android.support.v4.app.b.c(localHttpResponse));
        HttpEntity localHttpEntity = localHttpResponse.getEntity();
        if (localHttpEntity != null)
        {
          ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(EntityUtils.toByteArray(localHttpEntity));
          Bitmap localBitmap = BitmapFactory.decodeStream(localByteArrayInputStream);
          localByteArrayInputStream.reset();
          localByteArrayInputStream.close();
          return localBitmap;
        }
      }
      return null;
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      while (true)
        b(localHttpClient);
    }
    catch (IOException localIOException)
    {
      while (true)
        b(localHttpClient);
    }
    catch (Exception localException)
    {
      while (true)
        b(localHttpClient);
    }
    finally
    {
      b(localHttpClient);
    }
    throw localObject;
  }

  public static Bitmap b(String paramString)
  {
    HttpGet localHttpGet = new HttpGet("https://account.wandoujia.com/avatar.php?uid=" + paramString);
    HttpClient localHttpClient = a();
    try
    {
      HttpResponse localHttpResponse = localHttpClient.execute(localHttpGet);
      if (localHttpResponse.getStatusLine().getStatusCode() == 200)
      {
        HttpEntity localHttpEntity = localHttpResponse.getEntity();
        if (localHttpEntity != null)
        {
          ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(EntityUtils.toByteArray(localHttpEntity));
          Bitmap localBitmap = BitmapFactory.decodeStream(localByteArrayInputStream);
          localByteArrayInputStream.reset();
          localByteArrayInputStream.close();
          return localBitmap;
        }
      }
      return null;
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      while (true)
        b(localHttpClient);
    }
    catch (IOException localIOException)
    {
      while (true)
        b(localHttpClient);
    }
    catch (Exception localException)
    {
      while (true)
        b(localHttpClient);
    }
    finally
    {
      b(localHttpClient);
    }
    throw localObject;
  }

  private static List<NameValuePair> b(DeviceBean paramDeviceBean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramDeviceBean != null)
    {
      localArrayList.add(new BasicNameValuePair("st_model", paramDeviceBean.getModel()));
      localArrayList.add(new BasicNameValuePair("st_brand", paramDeviceBean.getBrand()));
      localArrayList.add(new BasicNameValuePair("st_sdk_int", paramDeviceBean.getSdk()));
      localArrayList.add(new BasicNameValuePair("st_dev_id", paramDeviceBean.getUdid()));
      localArrayList.add(new BasicNameValuePair("st_ver_code", paramDeviceBean.getVersionCode()));
      localArrayList.add(new BasicNameValuePair("st_ver_name", paramDeviceBean.getVersionName()));
      localArrayList.add(new BasicNameValuePair("from", paramDeviceBean.getSource()));
    }
    return localArrayList;
  }

  private static void b(HttpClient paramHttpClient)
  {
    if ((paramHttpClient != null) && (paramHttpClient.getConnectionManager() != null))
    {
      paramHttpClient.getConnectionManager().closeExpiredConnections();
      paramHttpClient.getConnectionManager().shutdown();
    }
  }

  private static String c(DeviceBean paramDeviceBean)
  {
    if (paramDeviceBean != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      try
      {
        localStringBuilder.append("st_model=").append(URLEncoder.encode(paramDeviceBean.getModel(), "UTF-8")).append("&st_brand=").append(URLEncoder.encode(paramDeviceBean.getBrand(), "UTF-8")).append("&st_dev_id=").append(URLEncoder.encode(paramDeviceBean.getUdid(), "UTF-8")).append("&st_sdk_int=").append(URLEncoder.encode(paramDeviceBean.getSdk(), "UTF-8")).append("&st_ver_code=").append(URLEncoder.encode(paramDeviceBean.getVersionCode(), "UTF-8")).append("&st_ver_name=").append(URLEncoder.encode(paramDeviceBean.getVersionName(), "UTF-8"));
        String str = localStringBuilder.toString();
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        return "";
      }
    }
    return "";
  }

  private static String d(DeviceBean paramDeviceBean)
  {
    if (paramDeviceBean == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      localStringBuilder.append("&version=").append(paramDeviceBean.getVersionName()).append("&versionCode=").append(paramDeviceBean.getVersionCode()).append("&udid=").append(URLEncoder.encode(paramDeviceBean.getUdid(), "utf-8"));
      label62: return localStringBuilder.toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label62;
    }
  }

  private String e()
  {
    if (TextUtils.isEmpty(this.a))
      this.a = com.wandoujia.account.a.i();
    return this.a;
  }

  private void f()
  {
    this.i.post(new d(this));
  }

  private void g()
  {
    this.i.post(new e(this));
  }

  // ERROR //
  private static String h()
  {
    // Byte code:
    //   0: new 269	org/apache/http/client/methods/HttpGet
    //   3: dup
    //   4: ldc_w 410
    //   7: invokespecial 272	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   10: astore_0
    //   11: invokestatic 99	com/wandoujia/account/b/a:a	()Lorg/apache/http/client/HttpClient;
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: invokeinterface 150 2 0
    //   22: astore 6
    //   24: aload 6
    //   26: invokeinterface 156 1 0
    //   31: invokeinterface 162 1 0
    //   36: sipush 200
    //   39: if_icmpne +24 -> 63
    //   42: aload 6
    //   44: invokeinterface 166 1 0
    //   49: ldc 137
    //   51: invokestatic 173	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   54: astore 7
    //   56: aload_1
    //   57: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   60: aload 7
    //   62: areturn
    //   63: aload_1
    //   64: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   67: aconst_null
    //   68: areturn
    //   69: astore 5
    //   71: aload_1
    //   72: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   75: goto -8 -> 67
    //   78: astore 4
    //   80: aload_1
    //   81: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   84: goto -17 -> 67
    //   87: astore_3
    //   88: aload_1
    //   89: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   92: goto -25 -> 67
    //   95: astore_2
    //   96: aload_1
    //   97: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   100: aload_2
    //   101: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   15	56	69	org/apache/http/client/ClientProtocolException
    //   15	56	78	java/io/IOException
    //   15	56	87	java/lang/Exception
    //   15	56	95	finally
  }

  // ERROR //
  private static String h(String paramString)
  {
    // Byte code:
    //   0: new 269	org/apache/http/client/methods/HttpGet
    //   3: dup
    //   4: new 120	java/lang/StringBuilder
    //   7: dup
    //   8: ldc_w 413
    //   11: invokespecial 123	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   21: invokespecial 272	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   24: astore_1
    //   25: invokestatic 99	com/wandoujia/account/b/a:a	()Lorg/apache/http/client/HttpClient;
    //   28: astore_2
    //   29: aload_2
    //   30: aload_1
    //   31: invokeinterface 150 2 0
    //   36: astore 7
    //   38: aload 7
    //   40: invokeinterface 156 1 0
    //   45: invokeinterface 162 1 0
    //   50: sipush 200
    //   53: if_icmpne +24 -> 77
    //   56: aload 7
    //   58: invokeinterface 166 1 0
    //   63: ldc 137
    //   65: invokestatic 173	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   68: astore 8
    //   70: aload_2
    //   71: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   74: aload 8
    //   76: areturn
    //   77: aload_2
    //   78: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   81: aconst_null
    //   82: areturn
    //   83: astore 6
    //   85: aload_2
    //   86: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   89: goto -8 -> 81
    //   92: astore 5
    //   94: aload_2
    //   95: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   98: goto -17 -> 81
    //   101: astore 4
    //   103: aload_2
    //   104: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   107: goto -26 -> 81
    //   110: astore_3
    //   111: aload_2
    //   112: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   115: aload_3
    //   116: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   29	70	83	org/apache/http/client/ClientProtocolException
    //   29	70	92	java/io/IOException
    //   29	70	101	java/lang/Exception
    //   29	70	110	finally
  }

  private AccountResponse i(String paramString)
  {
    if (paramString != null)
      try
      {
        AccountResponse localAccountResponse = (AccountResponse)this.g.a(paramString, AccountResponse.class);
        return localAccountResponse;
      }
      catch (Exception localException)
      {
      }
    return null;
  }

  private String i()
  {
    String str1 = h();
    String str2 = "";
    if (!TextUtils.isEmpty(str1))
      SmsManager.getDefault().sendTextMessage("106", null, str1, null, null);
    try
    {
      Thread.sleep(5000L);
      str2 = h(str1);
      if ((this.h > 0) && (TextUtils.isEmpty(str2)))
        this.h = (-1 + this.h);
    }
    catch (InterruptedException localInterruptedException1)
    {
      try
      {
        while (true)
        {
          Thread.sleep(2 * (1000 * this.h));
          label77: str2 = h(str1);
        }
        this.h = 5;
        return str2;
        localInterruptedException1 = localInterruptedException1;
      }
      catch (InterruptedException localInterruptedException2)
      {
        break label77;
      }
    }
  }

  private String j()
  {
    return "wdj_auth=" + e();
  }

  public final AccountResponse a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("username", paramString));
    return a("https://account.wandoujia.com/v4/api/findpassword", localArrayList);
  }

  // ERROR //
  public final AccountResponse a(String paramString, DeviceBean paramDeviceBean, com.wandoujia.account.dto.FIELDS[] paramArrayOfFIELDS)
  {
    // Byte code:
    //   0: new 175	com/wandoujia/account/dto/AccountResponse
    //   3: dup
    //   4: getstatic 454	com/wandoujia/account/dto/AccountError:SUCCESS	Lcom/wandoujia/account/dto/AccountError;
    //   7: invokespecial 457	com/wandoujia/account/dto/AccountResponse:<init>	(Lcom/wandoujia/account/dto/AccountError;)V
    //   10: astore 4
    //   12: aload_3
    //   13: ifnull +321 -> 334
    //   16: ldc_w 389
    //   19: astore 23
    //   21: aload_3
    //   22: arraylength
    //   23: istore 24
    //   25: iconst_0
    //   26: istore 25
    //   28: iload 25
    //   30: iload 24
    //   32: if_icmpge +46 -> 78
    //   35: aload_3
    //   36: iload 25
    //   38: aaload
    //   39: astore 26
    //   41: new 120	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 369	java/lang/StringBuilder:<init>	()V
    //   48: aload 23
    //   50: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: aload 26
    //   55: invokevirtual 462	com/wandoujia/account/dto/FIELDS:name	()Ljava/lang/String;
    //   58: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: ldc_w 464
    //   64: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: astore 23
    //   72: iinc 25 1
    //   75: goto -47 -> 28
    //   78: new 120	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 369	java/lang/StringBuilder:<init>	()V
    //   85: ldc_w 466
    //   88: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: ldc_w 468
    //   94: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: aload 23
    //   99: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore 5
    //   107: aload_1
    //   108: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   111: ifne +57 -> 168
    //   114: new 120	java/lang/StringBuilder
    //   117: dup
    //   118: ldc_w 470
    //   121: invokespecial 123	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: aload_1
    //   125: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc_w 472
    //   131: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload_2
    //   135: invokestatic 474	com/wandoujia/account/b/a:c	(Lcom/wandoujia/account/dto/DeviceBean;)Ljava/lang/String;
    //   138: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: astore 22
    //   146: new 120	java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial 369	java/lang/StringBuilder:<init>	()V
    //   153: aload 5
    //   155: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: aload 22
    //   160: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: astore 5
    //   168: new 269	org/apache/http/client/methods/HttpGet
    //   171: dup
    //   172: aload 5
    //   174: invokespecial 272	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   177: astore 6
    //   179: aload 6
    //   181: ldc 101
    //   183: aload_0
    //   184: invokespecial 104	com/wandoujia/account/b/a:j	()Ljava/lang/String;
    //   187: invokevirtual 475	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: invokestatic 99	com/wandoujia/account/b/a:a	()Lorg/apache/http/client/HttpClient;
    //   193: astore 7
    //   195: aload 7
    //   197: aload 6
    //   199: invokeinterface 150 2 0
    //   204: astore 13
    //   206: aload 13
    //   208: invokeinterface 156 1 0
    //   213: invokeinterface 162 1 0
    //   218: istore 14
    //   220: iload 14
    //   222: sipush 200
    //   225: if_icmpne +142 -> 367
    //   228: aload 13
    //   230: invokeinterface 166 1 0
    //   235: ldc 137
    //   237: invokestatic 173	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   240: astore 15
    //   242: aload 13
    //   244: invokestatic 185	android/support/v4/app/b:b	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   247: astore 16
    //   249: aload 16
    //   251: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   254: ifne +9 -> 263
    //   257: aload_0
    //   258: aload 16
    //   260: putfield 187	com/wandoujia/account/b/a:a	Ljava/lang/String;
    //   263: aload_0
    //   264: getfield 79	com/wandoujia/account/b/a:g	Lcom/wandoujia/gson/c;
    //   267: aload 15
    //   269: ldc 175
    //   271: invokevirtual 180	com/wandoujia/gson/c:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   274: checkcast 175	com/wandoujia/account/dto/AccountResponse
    //   277: astore 10
    //   279: aload 10
    //   281: invokevirtual 478	com/wandoujia/account/dto/AccountResponse:getError	()I
    //   284: getstatic 454	com/wandoujia/account/dto/AccountError:SUCCESS	Lcom/wandoujia/account/dto/AccountError;
    //   287: invokevirtual 479	com/wandoujia/account/dto/AccountError:getError	()I
    //   290: if_icmpne +36 -> 326
    //   293: aload 10
    //   295: invokevirtual 191	com/wandoujia/account/dto/AccountResponse:getMember	()Lcom/wandoujia/account/dto/AccountBean;
    //   298: ifnull +28 -> 326
    //   301: aload 10
    //   303: invokevirtual 191	com/wandoujia/account/dto/AccountResponse:getMember	()Lcom/wandoujia/account/dto/AccountBean;
    //   306: aload_0
    //   307: invokespecial 366	com/wandoujia/account/b/a:e	()Ljava/lang/String;
    //   310: invokestatic 194	android/support/v4/app/b:a	(Lcom/wandoujia/account/dto/AccountBean;Ljava/lang/String;)V
    //   313: aload 10
    //   315: invokevirtual 191	com/wandoujia/account/dto/AccountResponse:getMember	()Lcom/wandoujia/account/dto/AccountBean;
    //   318: pop
    //   319: aload_0
    //   320: getstatic 485	com/wandoujia/account/listener/IAccountListener$LoginType:AUTO_LOGIN	Lcom/wandoujia/account/listener/IAccountListener$LoginType;
    //   323: invokespecial 248	com/wandoujia/account/b/a:a	(Lcom/wandoujia/account/listener/IAccountListener$LoginType;)V
    //   326: aload 7
    //   328: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   331: aload 10
    //   333: areturn
    //   334: new 120	java/lang/StringBuilder
    //   337: dup
    //   338: invokespecial 369	java/lang/StringBuilder:<init>	()V
    //   341: ldc_w 466
    //   344: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: ldc_w 468
    //   350: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: getstatic 489	com/wandoujia/account/dto/FIELDS:BASIC_SOCIAL	Lcom/wandoujia/account/dto/FIELDS;
    //   356: invokevirtual 492	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: astore 5
    //   364: goto -257 -> 107
    //   367: iload 14
    //   369: sipush 403
    //   372: if_icmpne +15 -> 387
    //   375: aload_0
    //   376: iconst_1
    //   377: invokespecial 494	com/wandoujia/account/b/a:a	(Z)V
    //   380: aload 4
    //   382: astore 10
    //   384: goto -58 -> 326
    //   387: aload 13
    //   389: invokeinterface 166 1 0
    //   394: ldc 137
    //   396: invokestatic 173	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   399: pop
    //   400: aload 4
    //   402: astore 10
    //   404: goto -78 -> 326
    //   407: astore 12
    //   409: aload 4
    //   411: astore 10
    //   413: aload 7
    //   415: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   418: aload 10
    //   420: areturn
    //   421: astore 11
    //   423: aload 4
    //   425: astore 10
    //   427: aload 7
    //   429: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   432: aload 10
    //   434: areturn
    //   435: astore 9
    //   437: aload 4
    //   439: astore 10
    //   441: aload 7
    //   443: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   446: aload 10
    //   448: areturn
    //   449: astore 8
    //   451: aload 7
    //   453: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   456: aload 8
    //   458: athrow
    //   459: astore 19
    //   461: goto -20 -> 441
    //   464: astore 18
    //   466: goto -39 -> 427
    //   469: astore 17
    //   471: goto -58 -> 413
    //
    // Exception table:
    //   from	to	target	type
    //   195	220	407	org/apache/http/client/ClientProtocolException
    //   228	263	407	org/apache/http/client/ClientProtocolException
    //   263	279	407	org/apache/http/client/ClientProtocolException
    //   375	380	407	org/apache/http/client/ClientProtocolException
    //   387	400	407	org/apache/http/client/ClientProtocolException
    //   195	220	421	java/io/IOException
    //   228	263	421	java/io/IOException
    //   263	279	421	java/io/IOException
    //   375	380	421	java/io/IOException
    //   387	400	421	java/io/IOException
    //   195	220	435	java/lang/Exception
    //   228	263	435	java/lang/Exception
    //   263	279	435	java/lang/Exception
    //   375	380	435	java/lang/Exception
    //   387	400	435	java/lang/Exception
    //   195	220	449	finally
    //   228	263	449	finally
    //   263	279	449	finally
    //   279	326	449	finally
    //   375	380	449	finally
    //   387	400	449	finally
    //   279	326	459	java/lang/Exception
    //   279	326	464	java/io/IOException
    //   279	326	469	org/apache/http/client/ClientProtocolException
  }

  public final AccountResponse a(String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("passcode", paramString2));
    localArrayList.add(new BasicNameValuePair("password", paramString3));
    localArrayList.add(new BasicNameValuePair("username", paramString1));
    return a("https://account.wandoujia.com/v4/api/resetpassword", localArrayList);
  }

  public final AccountResponse a(String paramString1, String paramString2, String paramString3, DeviceBean paramDeviceBean)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("username", paramString1));
    localArrayList.add(new BasicNameValuePair("password", paramString2));
    if (TextUtils.isEmpty(paramString3))
      paramString3 = "p3";
    localArrayList.add(new BasicNameValuePair("source", paramString3));
    if (paramDeviceBean != null)
      localArrayList.addAll(b(paramDeviceBean));
    AccountResponse localAccountResponse = a("https://account.wandoujia.com/v4/api/login", localArrayList);
    if (localAccountResponse.getError() == AccountError.SUCCESS.getError())
    {
      android.support.v4.app.b.a(localAccountResponse.getMember(), e());
      localAccountResponse.getMember();
      a(IAccountListener.LoginType.LOGIN);
      return localAccountResponse;
    }
    new WandouResponse(localAccountResponse.getError(), localAccountResponse.getMsg());
    g();
    return localAccountResponse;
  }

  public final AccountResponse a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ArrayList localArrayList = new ArrayList();
    if (!TextUtils.isEmpty(paramString2))
      localArrayList.add(new BasicNameValuePair("password", paramString2));
    if (!TextUtils.isEmpty(paramString3))
      localArrayList.add(new BasicNameValuePair("origin_password", paramString3));
    localArrayList.add(new BasicNameValuePair("type", paramString4));
    localArrayList.add(new BasicNameValuePair("account", paramString1));
    return a("https://account.wandoujia.com/v4/api/bindAccount", localArrayList);
  }

  public final AccountResponse a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, DeviceBean paramDeviceBean)
  {
    if ((TextUtils.isEmpty(paramString1)) && (android.support.v4.app.b.o(com.wandoujia.account.a.a())))
      paramString1 = i();
    if (TextUtils.isEmpty(paramString1))
      return new AccountResponse(1000001, android.support.v4.app.b.l(R.string.account_sdk_send_sms_failure));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("username", paramString1));
    localArrayList.add(new BasicNameValuePair("password", paramString2));
    localArrayList.add(new BasicNameValuePair("nick", paramString3));
    if (TextUtils.isEmpty(paramString5))
      paramString5 = "phoenix2,unknown";
    if (!TextUtils.isEmpty(com.wandoujia.account.a.p("SDK_CHANNEL")))
      paramString5 = paramString5 + "," + com.wandoujia.account.a.p("SDK_CHANNEL");
    localArrayList.add(new BasicNameValuePair("source", paramString5));
    if (!TextUtils.isEmpty(paramString4))
      localArrayList.add(new BasicNameValuePair("seccode", paramString4));
    if (paramDeviceBean != null)
      localArrayList.addAll(b(paramDeviceBean));
    AccountResponse localAccountResponse = a("https://account.wandoujia.com/v4/api/register", localArrayList);
    if (localAccountResponse.getError() == AccountError.SUCCESS.getError())
    {
      localAccountResponse.getMember();
      f();
      return localAccountResponse;
    }
    new WandouResponse(localAccountResponse.getError(), localAccountResponse.getMsg());
    g();
    return localAccountResponse;
  }

  public final void a(Platform paramPlatform, Context paramContext, com.wandoujia.account.listener.b paramb, String paramString, DeviceBean paramDeviceBean)
  {
    this.f = paramb;
    try
    {
      if (paramPlatform.equals(Platform.SINA))
      {
        a(paramContext, paramString, paramDeviceBean);
        return;
      }
      String str = "https://account.wandoujia.com/web/oauth2/%s/login?auth=%s&source=" + paramString + d(paramDeviceBean);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramPlatform.getPlatform();
      arrayOfObject[1] = com.wandoujia.account.a.i();
      new com.wandoujia.account.c.a(paramContext, String.format(str, arrayOfObject), e(), this.k).show();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(IAccountListener paramIAccountListener)
  {
    synchronized (this.j)
    {
      if (this.j.contains(paramIAccountListener))
        return;
      this.j.add(paramIAccountListener);
      return;
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    new g(this, paramString1, paramString2).execute(new Void[0]);
  }

  public final AccountResponse b(String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("passcode", paramString2));
    localArrayList.add(new BasicNameValuePair("password", paramString3));
    localArrayList.add(new BasicNameValuePair("username", paramString1));
    return a("https://account.wandoujia.com/v4/api/modifypassword", localArrayList);
  }

  public final AccountResponse b(String paramString1, String paramString2, String paramString3, DeviceBean paramDeviceBean)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("username", paramString1));
    localArrayList.add(new BasicNameValuePair("password", ""));
    localArrayList.add(new BasicNameValuePair("oneKeyRegister", "true"));
    if (TextUtils.isEmpty(paramString3))
      paramString3 = "phoenix2,unknown";
    if (!TextUtils.isEmpty(com.wandoujia.account.a.p("SDK_CHANNEL")))
      paramString3 = paramString3 + "," + com.wandoujia.account.a.p("SDK_CHANNEL");
    localArrayList.add(new BasicNameValuePair("source", paramString3));
    if (!TextUtils.isEmpty(paramString2))
      localArrayList.add(new BasicNameValuePair("seccode", paramString2));
    if (paramDeviceBean != null)
      localArrayList.addAll(b(paramDeviceBean));
    AccountResponse localAccountResponse = a("https://account.wandoujia.com/v4/api/register", localArrayList);
    if (localAccountResponse.getError() == AccountError.SUCCESS.getError())
    {
      localAccountResponse.getMember();
      f();
      return localAccountResponse;
    }
    new WandouResponse(localAccountResponse.getError(), localAccountResponse.getMsg());
    g();
    return localAccountResponse;
  }

  public final void b(Platform paramPlatform, Context paramContext, com.wandoujia.account.listener.b paramb, String paramString, DeviceBean paramDeviceBean)
  {
    this.f = paramb;
    if (paramPlatform.equals(Platform.SINA))
    {
      a(paramContext, paramString, paramDeviceBean);
      return;
    }
    if (paramPlatform.equals(Platform.WECHAT))
    {
      if (!this.l.c().a())
      {
        Toast.makeText(android.support.v4.app.b.A(), R.string.account_sdk_need_install_wechat_first, 0).show();
        return;
      }
      com.tencent.mm.sdk.openapi.f localf = new com.tencent.mm.sdk.openapi.f();
      localf.b = "snsapi_userinfo";
      localf.c = "wdj_account_sdk_android";
      this.l.c().a(localf);
      return;
    }
    String str1 = "https://account.wandoujia.com/web/oauth2/%s/login?source=" + paramString + d(paramDeviceBean);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramPlatform.getPlatform();
    String str2 = String.format(str1, arrayOfObject);
    this.k.a(paramString);
    this.k.a(paramDeviceBean);
    new com.wandoujia.account.c.a(paramContext, str2, this.k).show();
  }

  public final void b(IAccountListener paramIAccountListener)
  {
    synchronized (this.j)
    {
      if (this.j.contains(paramIAccountListener))
        this.j.remove(paramIAccountListener);
      return;
    }
  }

  public final boolean b(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    if (!TextUtils.isEmpty(paramString2))
      localArrayList.add(new BasicNameValuePair("account", paramString2));
    AccountResponse localAccountResponse = a("https://account.wandoujia.com/v4/api/activation/initialization?type=" + paramString1, localArrayList);
    int m = 0;
    if (localAccountResponse != null)
    {
      int n = localAccountResponse.getError();
      m = 0;
      if (n == 0)
        m = 1;
    }
    return m;
  }

  // ERROR //
  public final AccountResponse c(String paramString)
  {
    // Byte code:
    //   0: new 269	org/apache/http/client/methods/HttpGet
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 272	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: aload_0
    //   10: invokespecial 366	com/wandoujia/account/b/a:e	()Ljava/lang/String;
    //   13: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   16: ifne +13 -> 29
    //   19: aload_2
    //   20: ldc 101
    //   22: aload_0
    //   23: invokespecial 104	com/wandoujia/account/b/a:j	()Ljava/lang/String;
    //   26: invokevirtual 475	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: new 175	com/wandoujia/account/dto/AccountResponse
    //   32: dup
    //   33: invokespecial 201	com/wandoujia/account/dto/AccountResponse:<init>	()V
    //   36: astore_3
    //   37: invokestatic 99	com/wandoujia/account/b/a:a	()Lorg/apache/http/client/HttpClient;
    //   40: astore 4
    //   42: aload 4
    //   44: aload_2
    //   45: invokeinterface 150 2 0
    //   50: astore 10
    //   52: aload 10
    //   54: invokeinterface 166 1 0
    //   59: ldc 137
    //   61: invokestatic 173	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   64: astore 11
    //   66: aload_0
    //   67: getfield 79	com/wandoujia/account/b/a:g	Lcom/wandoujia/gson/c;
    //   70: aload 11
    //   72: ldc 175
    //   74: invokevirtual 180	com/wandoujia/gson/c:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   77: checkcast 175	com/wandoujia/account/dto/AccountResponse
    //   80: astore 7
    //   82: aload 10
    //   84: invokestatic 185	android/support/v4/app/b:b	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   87: astore 15
    //   89: aload 15
    //   91: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   94: ifne +9 -> 103
    //   97: aload_0
    //   98: aload 15
    //   100: putfield 187	com/wandoujia/account/b/a:a	Ljava/lang/String;
    //   103: aload 4
    //   105: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   108: aload 7
    //   110: areturn
    //   111: astore 9
    //   113: aload_3
    //   114: astore 7
    //   116: aload 4
    //   118: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   121: aload 7
    //   123: areturn
    //   124: astore 8
    //   126: aload_3
    //   127: astore 7
    //   129: aload 4
    //   131: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   134: aload 7
    //   136: areturn
    //   137: astore 6
    //   139: aload_3
    //   140: astore 7
    //   142: aload 4
    //   144: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   147: aload 7
    //   149: areturn
    //   150: astore 5
    //   152: aload 4
    //   154: invokestatic 197	com/wandoujia/account/b/a:b	(Lorg/apache/http/client/HttpClient;)V
    //   157: aload 5
    //   159: athrow
    //   160: astore 14
    //   162: goto -20 -> 142
    //   165: astore 13
    //   167: goto -38 -> 129
    //   170: astore 12
    //   172: goto -56 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   42	82	111	org/apache/http/client/ClientProtocolException
    //   42	82	124	java/io/IOException
    //   42	82	137	java/lang/Exception
    //   42	82	150	finally
    //   82	103	150	finally
    //   82	103	160	java/lang/Exception
    //   82	103	165	java/io/IOException
    //   82	103	170	org/apache/http/client/ClientProtocolException
  }

  public final AccountResponse c(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("old_password", paramString1));
    localArrayList.add(new BasicNameValuePair("new_password", paramString2));
    return a("https://account.wandoujia.com/v4/api/profile/password", localArrayList);
  }

  public final AccountResponse c(String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("code", paramString3));
    localArrayList.add(new BasicNameValuePair("method", paramString2));
    localArrayList.add(new BasicNameValuePair("token", paramString1));
    return a("https://account.wandoujia.com/v4/api/verification/confirm", localArrayList);
  }

  public final boolean c()
  {
    com.wandoujia.account.a.D();
    this.a = null;
    a(false);
    return true;
  }

  public final SsoHandler d()
  {
    return this.b;
  }

  public final AccountResponse d(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("type", paramString1));
    localArrayList.add(new BasicNameValuePair("code", paramString2));
    return a("https://account.wandoujia.com/v4/api/activation/validation", localArrayList);
  }

  public final void d(String paramString)
  {
    this.a = paramString;
  }

  public final AccountResponse e(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if ((!TextUtils.isEmpty("")) && (!TextUtils.isEmpty("")))
    {
      localArrayList.add(new BasicNameValuePair("username", ""));
      localArrayList.add(new BasicNameValuePair("password", ""));
    }
    if (!TextUtils.isEmpty(paramString))
      localArrayList.add(new BasicNameValuePair("nick", paramString));
    if (!TextUtils.isEmpty(""))
      localArrayList.add(new BasicNameValuePair("telephone", ""));
    if (!TextUtils.isEmpty(""))
      localArrayList.add(new BasicNameValuePair("email", ""));
    return a("https://account.wandoujia.com/v4/api/completeProfile", localArrayList);
  }

  public final AccountResponse e(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("account", paramString2));
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = URLEncoder.encode(paramString1, "UTF-8");
      AccountResponse localAccountResponse = a(String.format("https://account.wandoujia.com/v4/api/profile/%s", arrayOfObject), localArrayList);
      return localAccountResponse;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return null;
  }

  public final AccountResponse f(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("passcode", paramString));
    return a("https://account.wandoujia.com/v4/api/activation/telephone", localArrayList);
  }

  public final AccountResponse f(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("token", paramString1));
    localArrayList.add(new BasicNameValuePair("method", paramString2));
    return a("https://account.wandoujia.com/v4/api/verification/send", localArrayList);
  }

  public final AccountResponse g(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("token", paramString));
    return a("https://account.wandoujia.com/v4/api/needresetpassword", localArrayList);
  }

  public final AccountResponse g(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("method", paramString2));
    localArrayList.add(new BasicNameValuePair("token", paramString1));
    return a("https://account.wandoujia.com/v4/api/verification/check", localArrayList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.a
 * JD-Core Version:    0.6.0
 */