package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.sina.weibo.sdk.a.f;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MusicObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.VideoObject;
import com.sina.weibo.sdk.api.VoiceObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.auth.c;
import com.sina.weibo.sdk.net.g;

public final class e extends d
{
  private c d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private byte[] k;

  public e(Context paramContext)
  {
    super(paramContext);
    this.c = BrowserLauncher.SHARE;
  }

  private static void a(Activity paramActivity, int paramInt, String paramString)
  {
    Bundle localBundle = paramActivity.getIntent().getExtras();
    if (localBundle == null)
      return;
    Intent localIntent = new Intent("com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY");
    localIntent.setFlags(131072);
    localIntent.setPackage(localBundle.getString("_weibo_appPackage"));
    localIntent.putExtras(localBundle);
    localIntent.putExtra("_weibo_appPackage", paramActivity.getPackageName());
    localIntent.putExtra("_weibo_resp_errcode", paramInt);
    localIntent.putExtra("_weibo_resp_errstr", paramString);
    try
    {
      paramActivity.startActivityForResult(localIntent, 765);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  public static void a(Activity paramActivity, String paramString)
  {
    a(paramActivity, 2, paramString);
  }

  // ERROR //
  private void a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 105	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifne +101 -> 105
    //   7: new 107	java/io/File
    //   10: dup
    //   11: aload_1
    //   12: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   15: astore 4
    //   17: aload 4
    //   19: invokevirtual 112	java/io/File:exists	()Z
    //   22: ifeq +83 -> 105
    //   25: aload 4
    //   27: invokevirtual 115	java/io/File:canRead	()Z
    //   30: ifeq +75 -> 105
    //   33: aload 4
    //   35: invokevirtual 119	java/io/File:length	()J
    //   38: lconst_0
    //   39: lcmp
    //   40: ifle +65 -> 105
    //   43: aload 4
    //   45: invokevirtual 119	java/io/File:length	()J
    //   48: l2i
    //   49: newarray byte
    //   51: astore 5
    //   53: aconst_null
    //   54: astore 6
    //   56: new 121	java/io/FileInputStream
    //   59: dup
    //   60: aload 4
    //   62: invokespecial 124	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   65: astore 7
    //   67: aload 7
    //   69: aload 5
    //   71: invokevirtual 128	java/io/FileInputStream:read	([B)I
    //   74: pop
    //   75: aload_0
    //   76: aload 5
    //   78: invokestatic 134	com/sina/weibo/sdk/a/e:b	([B)[B
    //   81: putfield 136	com/sina/weibo/sdk/component/e:k	[B
    //   84: aload 7
    //   86: invokevirtual 140	java/io/FileInputStream:close	()V
    //   89: return
    //   90: astore 15
    //   92: aconst_null
    //   93: astore 7
    //   95: aload 7
    //   97: ifnull +8 -> 105
    //   100: aload 7
    //   102: invokevirtual 140	java/io/FileInputStream:close	()V
    //   105: aload_2
    //   106: ifnull -17 -> 89
    //   109: aload_2
    //   110: arraylength
    //   111: ifle -22 -> 89
    //   114: aload_0
    //   115: aload_2
    //   116: invokestatic 134	com/sina/weibo/sdk/a/e:b	([B)[B
    //   119: putfield 136	com/sina/weibo/sdk/component/e:k	[B
    //   122: return
    //   123: astore 11
    //   125: aload 6
    //   127: ifnull +8 -> 135
    //   130: aload 6
    //   132: invokevirtual 140	java/io/FileInputStream:close	()V
    //   135: aload 11
    //   137: athrow
    //   138: astore_3
    //   139: goto -34 -> 105
    //   142: astore 14
    //   144: return
    //   145: astore 9
    //   147: goto -42 -> 105
    //   150: astore 12
    //   152: goto -17 -> 135
    //   155: astore 10
    //   157: aload 7
    //   159: astore 6
    //   161: aload 10
    //   163: astore 11
    //   165: goto -40 -> 125
    //   168: astore 8
    //   170: goto -75 -> 95
    //
    // Exception table:
    //   from	to	target	type
    //   56	67	90	java/io/IOException
    //   56	67	123	finally
    //   0	53	138	java/lang/SecurityException
    //   84	89	138	java/lang/SecurityException
    //   100	105	138	java/lang/SecurityException
    //   130	135	138	java/lang/SecurityException
    //   135	138	138	java/lang/SecurityException
    //   84	89	142	java/lang/Exception
    //   100	105	145	java/lang/Exception
    //   130	135	150	java/lang/Exception
    //   67	84	155	finally
    //   67	84	168	java/io/IOException
  }

  public static void b(Activity paramActivity)
  {
    a(paramActivity, 1, "send cancel!!!");
  }

  public static void c(Activity paramActivity)
  {
    a(paramActivity, 0, "send ok!!!");
  }

  public final g a(g paramg)
  {
    if (!a())
      return paramg;
    paramg.a("img", new String(this.k));
    return paramg;
  }

  public final void a(Activity paramActivity)
  {
    b(paramActivity);
    WeiboSdkBrowser.a(paramActivity, this.e, null);
  }

  protected final void a(Bundle paramBundle)
  {
    this.h = paramBundle.getString("source");
    this.f = paramBundle.getString("packagename");
    this.i = paramBundle.getString("key_hash");
    this.g = paramBundle.getString("access_token");
    this.e = paramBundle.getString("key_listener");
    if (!TextUtils.isEmpty(this.e))
      this.d = h.a().a(this.e);
    com.sina.weibo.sdk.api.h localh = new com.sina.weibo.sdk.api.h();
    localh.b(paramBundle);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((localh.a instanceof TextObject))
      localStringBuilder.append(localh.a.b);
    if ((localh.b instanceof ImageObject))
    {
      ImageObject localImageObject2 = localh.b;
      a(localImageObject2.c, localImageObject2.b);
    }
    if ((localh.c instanceof TextObject))
      localStringBuilder.append(((TextObject)localh.c).b);
    if ((localh.c instanceof ImageObject))
    {
      ImageObject localImageObject1 = (ImageObject)localh.c;
      a(localImageObject1.c, localImageObject1.b);
    }
    if ((localh.c instanceof WebpageObject))
    {
      WebpageObject localWebpageObject = (WebpageObject)localh.c;
      localStringBuilder.append(" ").append(localWebpageObject.a);
    }
    if ((localh.c instanceof MusicObject))
    {
      MusicObject localMusicObject = (MusicObject)localh.c;
      localStringBuilder.append(" ").append(localMusicObject.a);
    }
    if ((localh.c instanceof VideoObject))
    {
      VideoObject localVideoObject = (VideoObject)localh.c;
      localStringBuilder.append(" ").append(localVideoObject.a);
    }
    if ((localh.c instanceof VoiceObject))
    {
      VoiceObject localVoiceObject = (VoiceObject)localh.c;
      localStringBuilder.append(" ").append(localVoiceObject.a);
    }
    this.j = localStringBuilder.toString();
    this.b = c("");
  }

  public final boolean a()
  {
    return (this.k != null) && (this.k.length > 0);
  }

  public final String b()
  {
    return this.h;
  }

  public final void b(Bundle paramBundle)
  {
    if (!TextUtils.isEmpty(this.f))
      this.i = f.a(b.c(this.a, this.f));
    paramBundle.putString("access_token", this.g);
    paramBundle.putString("source", this.h);
    paramBundle.putString("packagename", this.f);
    paramBundle.putString("key_hash", this.i);
    paramBundle.putString("_weibo_appPackage", this.f);
    paramBundle.putString("_weibo_appKey", this.h);
    paramBundle.putInt("_weibo_flag", 538116905);
    paramBundle.putString("_weibo_sign", this.i);
    if (this.d != null)
    {
      h localh = h.a();
      this.e = String.valueOf(System.currentTimeMillis());
      localh.a(this.e, this.d);
      paramBundle.putString("key_listener", this.e);
    }
  }

  public final c c()
  {
    return this.d;
  }

  public final String c(String paramString)
  {
    Uri.Builder localBuilder = Uri.parse("http://service.weibo.com/share/mobilesdk.php").buildUpon();
    localBuilder.appendQueryParameter("title", this.j);
    localBuilder.appendQueryParameter("version", "0030105000");
    if (!TextUtils.isEmpty(this.h))
      localBuilder.appendQueryParameter("source", this.h);
    if (!TextUtils.isEmpty(this.g))
      localBuilder.appendQueryParameter("access_token", this.g);
    String str = b.d(this.a, this.h);
    if (!TextUtils.isEmpty(str))
      localBuilder.appendQueryParameter("aid", str);
    if (!TextUtils.isEmpty(this.f))
      localBuilder.appendQueryParameter("packagename", this.f);
    if (!TextUtils.isEmpty(this.i))
      localBuilder.appendQueryParameter("key_hash", this.i);
    if (!TextUtils.isEmpty(paramString))
      localBuilder.appendQueryParameter("picinfo", paramString);
    return localBuilder.build().toString();
  }

  public final String h()
  {
    return this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.e
 * JD-Core Version:    0.6.0
 */