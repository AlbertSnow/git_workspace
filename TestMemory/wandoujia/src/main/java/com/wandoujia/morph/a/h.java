package com.wandoujia.morph.a;

import android.os.Build.VERSION;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.d;
import com.wandoujia.morph.engine.i;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

public class h
  implements t<LinearLayout>
{
  private static h a;

  private h()
  {
  }

  public h(d paramd)
  {
    paramd.a(MoWidgetType.ViewGroup);
  }

  public static LinearLayout.LayoutParams a(i parami)
  {
    int i = 0;
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 0;
    r.a(parami, localLayoutParams);
    a locala = parami.a(MoStyleable.LinearLayout_Layout);
    if (locala != null)
    {
      int j = locala.a();
      if (i < j)
      {
        switch (i.a[locala.a(i).ordinal()])
        {
        default:
        case 10:
        case 11:
        case 12:
        case 13:
        }
        while (true)
        {
          i++;
          break;
          localLayoutParams.weight = locala.e(i).floatValue();
          continue;
          localLayoutParams.gravity |= locala.d(i);
          continue;
          if (!locala.c(i))
            continue;
          localLayoutParams.gravity = (0x1 | localLayoutParams.gravity);
          continue;
          if (!locala.c(i))
            continue;
          localLayoutParams.gravity = (0x10 | localLayoutParams.gravity);
        }
      }
    }
    return localLayoutParams;
  }

  public static h a()
  {
    if (a == null)
      a = new h();
    return a;
  }

  // ERROR //
  private static String a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 100	java/io/BufferedReader
    //   3: dup
    //   4: new 102	java/io/InputStreamReader
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 105	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: invokespecial 108	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   15: astore_1
    //   16: new 110	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   23: astore_2
    //   24: aload_1
    //   25: invokevirtual 115	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   28: astore 7
    //   30: aload 7
    //   32: ifnull +24 -> 56
    //   35: aload_2
    //   36: aload 7
    //   38: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: goto -18 -> 24
    //   45: astore 5
    //   47: aload_0
    //   48: invokevirtual 124	java/io/InputStream:close	()V
    //   51: aload_2
    //   52: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: areturn
    //   56: aload_0
    //   57: invokevirtual 124	java/io/InputStream:close	()V
    //   60: goto -9 -> 51
    //   63: astore 9
    //   65: goto -14 -> 51
    //   68: astore_3
    //   69: aload_0
    //   70: invokevirtual 124	java/io/InputStream:close	()V
    //   73: aload_3
    //   74: athrow
    //   75: astore 6
    //   77: goto -26 -> 51
    //   80: astore 4
    //   82: goto -9 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   24	30	45	java/io/IOException
    //   35	42	45	java/io/IOException
    //   56	60	63	java/io/IOException
    //   24	30	68	finally
    //   35	42	68	finally
    //   47	51	75	java/io/IOException
    //   69	73	80	java/io/IOException
  }

  public static String a(String paramString1, String paramString2)
  {
    try
    {
      HttpPost localHttpPost = new HttpPost(paramString1);
      localHttpPost.addHeader("Content-Type", "application/json;charset=utf-8");
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      HttpConnectionParams.setSoTimeout(localBasicHttpParams, 12000);
      HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 12000);
      HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
      HttpProtocolParams.setHttpElementCharset(localBasicHttpParams, "UTF-8");
      DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(localBasicHttpParams);
      localHttpPost.setEntity(new StringEntity(paramString2, "UTF-8"));
      HttpResponse localHttpResponse = localDefaultHttpClient.execute(localHttpPost);
      if (localHttpResponse.getStatusLine().getStatusCode() != 200)
        return "";
      String str = a(localHttpResponse.getEntity().getContent());
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static void a(LinearLayout paramLinearLayout, i parami)
  {
    r.a(paramLinearLayout, parami);
    a locala = parami.a(MoStyleable.LinearLayout);
    int i = Build.VERSION.SDK_INT;
    if (locala != null)
    {
      int j = locala.a();
      int k = 0;
      if (k < j)
      {
        switch (i.a[locala.a(k).ordinal()])
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        }
        while (true)
        {
          k++;
          break;
          paramLinearLayout.setOrientation(locala.d(k));
          continue;
          paramLinearLayout.setGravity(locala.d(k));
          continue;
          paramLinearLayout.setBaselineAligned(locala.c(k));
          continue;
          paramLinearLayout.setWeightSum(locala.e(k).floatValue());
          continue;
          paramLinearLayout.setBaselineAlignedChildIndex(locala.d(k));
          continue;
          if (i < 11)
            continue;
          paramLinearLayout.setMeasureWithLargestChildEnabled(locala.c(k));
          continue;
          if (i < 11)
            continue;
          paramLinearLayout.setDividerDrawable(locala.a(paramLinearLayout.getContext(), k));
          continue;
          if (i < 11)
            continue;
          paramLinearLayout.setShowDividers(locala.d(k));
          continue;
          if (i < 14)
            continue;
          paramLinearLayout.setDividerPadding(locala.d(k));
        }
      }
    }
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.LinearLayout;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.h
 * JD-Core Version:    0.6.0
 */