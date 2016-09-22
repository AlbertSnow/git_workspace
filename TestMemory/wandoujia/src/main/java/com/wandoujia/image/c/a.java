package com.wandoujia.image.c;

import android.content.Context;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.alipay.android.app.d;
import com.alipay.wandoujia.y;
import com.wandoujia.image.ImageUri;
import com.wandoujia.image.ImageUri.ImageUriType;
import com.wandoujia.image.view.AsyncImageView;
import java.io.File;
import java.util.Random;

public final class a
{
  private static a a;
  private Context b;
  private d c;

  public static a a()
  {
    if (a == null)
      a = new a();
    return a;
  }

  // ERROR //
  private static String a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: new 23	java/lang/ProcessBuilder
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 26	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   8: astore_1
    //   9: aload_1
    //   10: iconst_0
    //   11: invokevirtual 30	java/lang/ProcessBuilder:redirectErrorStream	(Z)Ljava/lang/ProcessBuilder;
    //   14: pop
    //   15: aload_1
    //   16: invokevirtual 34	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   19: astore 10
    //   21: aload 10
    //   23: astore_3
    //   24: new 36	java/io/DataOutputStream
    //   27: dup
    //   28: aload_3
    //   29: invokevirtual 42	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   32: invokespecial 45	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   35: astore 11
    //   37: new 47	java/io/DataInputStream
    //   40: dup
    //   41: aload_3
    //   42: invokevirtual 51	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   45: invokespecial 54	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: invokevirtual 58	java/io/DataInputStream:readLine	()Ljava/lang/String;
    //   51: astore 13
    //   53: aload 13
    //   55: astore 7
    //   57: aload 11
    //   59: ldc 60
    //   61: invokevirtual 64	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   64: aload 11
    //   66: invokevirtual 67	java/io/DataOutputStream:flush	()V
    //   69: aload_3
    //   70: invokevirtual 71	java/lang/Process:waitFor	()I
    //   73: pop
    //   74: aload_3
    //   75: invokevirtual 74	java/lang/Process:destroy	()V
    //   78: aload 7
    //   80: areturn
    //   81: astore 6
    //   83: aconst_null
    //   84: astore_3
    //   85: ldc 76
    //   87: astore 7
    //   89: aload_3
    //   90: invokevirtual 74	java/lang/Process:destroy	()V
    //   93: aload 7
    //   95: areturn
    //   96: astore 8
    //   98: aload 7
    //   100: areturn
    //   101: astore_2
    //   102: aconst_null
    //   103: astore_3
    //   104: aload_2
    //   105: astore 4
    //   107: aload_3
    //   108: invokevirtual 74	java/lang/Process:destroy	()V
    //   111: aload 4
    //   113: athrow
    //   114: astore 5
    //   116: goto -5 -> 111
    //   119: astore 16
    //   121: aload 7
    //   123: areturn
    //   124: astore 4
    //   126: goto -19 -> 107
    //   129: astore 12
    //   131: ldc 76
    //   133: astore 7
    //   135: goto -46 -> 89
    //   138: astore 14
    //   140: goto -51 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   0	21	81	java/lang/Exception
    //   89	93	96	java/lang/Exception
    //   0	21	101	finally
    //   107	111	114	java/lang/Exception
    //   74	78	119	java/lang/Exception
    //   24	53	124	finally
    //   57	74	124	finally
    //   24	53	129	java/lang/Exception
    //   57	74	138	java/lang/Exception
  }

  public static void a(AsyncImageView paramAsyncImageView, ImageUri paramImageUri, int paramInt)
  {
    if ((paramImageUri.getImageUri() == null) || (paramImageUri.getImageUriType() == null))
    {
      paramAsyncImageView.setStaticImageResource(paramInt);
      return;
    }
    String str1 = paramImageUri.getImageUri();
    ImageUri.ImageUriType localImageUriType = paramImageUri.getImageUriType();
    switch (b.a[localImageUriType.ordinal()])
    {
    default:
      paramAsyncImageView.setStaticImageResource(paramInt);
      return;
    case 1:
      paramAsyncImageView.a(str1, paramInt);
      return;
    case 2:
      try
      {
        paramAsyncImageView.setStaticImageResource(Integer.parseInt(str1));
        return;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        paramAsyncImageView.setStaticImageResource(paramInt);
        return;
      }
    case 3:
      paramAsyncImageView.d(str1, paramInt);
      return;
    case 4:
      paramAsyncImageView.c(str1, paramInt);
      return;
    case 5:
      paramAsyncImageView.b(str1, paramInt);
      return;
    case 6:
    }
    String str2 = paramImageUri.getImageUri();
    if (b.E(str2))
    {
      paramAsyncImageView.a(str2, paramInt);
      return;
    }
    boolean bool1;
    if (TextUtils.isEmpty(str2))
    {
      bool1 = false;
      if (!bool1)
        break label199;
      try
      {
        paramAsyncImageView.setStaticImageResource(Integer.parseInt(str2));
        return;
      }
      catch (NumberFormatException localNumberFormatException1)
      {
      }
    }
    label199: int i;
    do
    {
      paramAsyncImageView.setStaticImageResource(paramInt);
      return;
      bool1 = str2.matches("^[1-9]\\d*$");
      break;
      if (TextUtils.isEmpty(str2));
      for (boolean bool2 = false; bool2; bool2 = str2.matches("^([a-zA-Z]+[.][a-zA-Z]+)[.]*.*"))
      {
        paramAsyncImageView.b(str2, paramInt);
        return;
      }
      boolean bool3 = TextUtils.isEmpty(str2);
      i = 0;
      if (bool3)
        continue;
      if (!str2.startsWith("/"))
      {
        boolean bool4 = str2.endsWith(".apk");
        i = 0;
        if (!bool4)
          continue;
      }
      i = 1;
    }
    while (i == 0);
    paramAsyncImageView.c(str2, paramInt);
  }

  public static boolean e()
  {
    int i = 1;
    String[] arrayOfString = new String[5];
    arrayOfString[0] = "/system/xbin/";
    arrayOfString[i] = "/system/bin/";
    arrayOfString[2] = "/system/sbin/";
    arrayOfString[3] = "/sbin/";
    arrayOfString[4] = "/vendor/bin/";
    int j = 0;
    if (j >= 5);
    while (true)
      while (true)
      {
        i = 0;
        label41: return i;
        try
        {
          String str1 = arrayOfString[j] + "su";
          if (new File(str1).exists())
          {
            String str2 = a(new String[] { "ls", "-l", str1 });
            if (!TextUtils.isEmpty(str2))
            {
              int k = str2.indexOf("root");
              int m = str2.lastIndexOf("root");
              if (k != m)
                break label41;
            }
            return false;
          }
          j++;
        }
        catch (Exception localException)
        {
        }
      }
  }

  public static String f()
  {
    Random localRandom = new Random();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    if (i >= 24)
      return localStringBuffer.toString();
    switch (localRandom.nextInt(3))
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      i++;
      break;
      localStringBuffer.append(String.valueOf((char)(int)Math.round(65.0D + 25.0D * Math.random())));
      continue;
      localStringBuffer.append(String.valueOf((char)(int)Math.round(97.0D + 25.0D * Math.random())));
      continue;
      localStringBuffer.append(String.valueOf(new Random().nextInt(10)));
    }
  }

  public final String a(int paramInt)
  {
    return this.b.getString(paramInt);
  }

  public final void a(Context paramContext, d paramd)
  {
    this.b = paramContext.getApplicationContext();
    this.c = paramd;
    try
    {
      y.a(this.b);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final Context b()
  {
    return this.b;
  }

  public final d c()
  {
    return this.c;
  }

  public final boolean d()
  {
    d locald = this.c;
    boolean bool = false;
    if (locald != null)
      bool = this.c.d();
    return bool;
  }

  public final String g()
  {
    return b.b(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.c.a
 * JD-Core Version:    0.6.0
 */