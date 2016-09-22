package com.wandoujia.jupiter.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.webkit.WebView;
import com.sina.weibo.sdk.api.share.c;
import com.sina.weibo.sdk.api.share.e;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.h;
import com.wandoujia.jupiter.share.SharePlatformEnum;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public class EntryWeiboActivity extends Activity
  implements com.sina.weibo.sdk.api.share.d
{
  private static String b;
  private static WebView c;
  private e a;
  private Runnable d = new d(this);

  public static void a(WebView paramWebView)
  {
    c = paramWebView;
  }

  public static void a(String paramString)
  {
    b = paramString;
  }

  private static void a(boolean paramBoolean)
  {
    Logger localLogger = (Logger)h.k().a("log");
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.SHARE);
    if (paramBoolean);
    StringBuilder localStringBuilder;
    for (TaskEvent.Result localResult = TaskEvent.Result.SUCCESS; ; localResult = TaskEvent.Result.FAIL)
    {
      localLogger.a(localBuilder.result(localResult).result_info(SharePlatformEnum.WEIBO.name()), new ExtraPackage.Builder());
      localStringBuilder = new StringBuilder("javascript:").append(b).append("(").append(String.valueOf(paramBoolean)).append(")");
      if (c != null)
        break;
      return;
    }
    c.loadUrl(localStringBuilder.toString());
  }

  public final void a(c paramc)
  {
    switch (paramc.b)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      finish();
      return;
      a(true);
      continue;
      a(false);
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    JupiterApplication.a().postDelayed(this.d, 200L);
  }

  // ERROR //
  protected void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 157	android/app/Activity:onCreate	(Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: aload_0
    //   7: ldc 159
    //   9: invokestatic 164	com/sina/weibo/sdk/api/share/i:a	(Landroid/content/Context;Ljava/lang/String;)Lcom/sina/weibo/sdk/api/share/e;
    //   12: putfield 166	com/wandoujia/jupiter/activity/EntryWeiboActivity:a	Lcom/sina/weibo/sdk/api/share/e;
    //   15: aload_0
    //   16: getfield 166	com/wandoujia/jupiter/activity/EntryWeiboActivity:a	Lcom/sina/weibo/sdk/api/share/e;
    //   19: invokeinterface 171 1 0
    //   24: pop
    //   25: aload_1
    //   26: ifnull +18 -> 44
    //   29: aload_0
    //   30: getfield 166	com/wandoujia/jupiter/activity/EntryWeiboActivity:a	Lcom/sina/weibo/sdk/api/share/e;
    //   33: aload_0
    //   34: invokevirtual 175	com/wandoujia/jupiter/activity/EntryWeiboActivity:getIntent	()Landroid/content/Intent;
    //   37: aload_0
    //   38: invokeinterface 178 3 0
    //   43: pop
    //   44: aload_0
    //   45: invokevirtual 175	com/wandoujia/jupiter/activity/EntryWeiboActivity:getIntent	()Landroid/content/Intent;
    //   48: invokevirtual 184	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   51: astore_3
    //   52: aload_3
    //   53: ifnonnull +7 -> 60
    //   56: aload_0
    //   57: invokevirtual 130	com/wandoujia/jupiter/activity/EntryWeiboActivity:finish	()V
    //   60: invokestatic 38	com/wandoujia/jupiter/h:k	()Lcom/wandoujia/ripple_framework/i;
    //   63: ldc 186
    //   65: invokevirtual 45	com/wandoujia/ripple_framework/i:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   68: checkcast 188	com/wandoujia/ripple_framework/navigation/b
    //   71: astore 4
    //   73: aload 4
    //   75: ldc 190
    //   77: aload_3
    //   78: invokevirtual 193	com/wandoujia/ripple_framework/navigation/b:a	(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;
    //   81: checkcast 195	android/graphics/Bitmap
    //   84: astore 5
    //   86: aload 4
    //   88: ldc 197
    //   90: aload_3
    //   91: invokevirtual 193	com/wandoujia/ripple_framework/navigation/b:a	(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;
    //   94: checkcast 104	java/lang/String
    //   97: astore 6
    //   99: aload 6
    //   101: invokestatic 203	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   104: ifeq +7 -> 111
    //   107: aload_0
    //   108: invokevirtual 130	com/wandoujia/jupiter/activity/EntryWeiboActivity:finish	()V
    //   111: aload_0
    //   112: getfield 166	com/wandoujia/jupiter/activity/EntryWeiboActivity:a	Lcom/sina/weibo/sdk/api/share/e;
    //   115: invokeinterface 205 1 0
    //   120: ifeq +221 -> 341
    //   123: aload_0
    //   124: getfield 166	com/wandoujia/jupiter/activity/EntryWeiboActivity:a	Lcom/sina/weibo/sdk/api/share/e;
    //   127: invokeinterface 171 1 0
    //   132: pop
    //   133: aload_0
    //   134: getfield 166	com/wandoujia/jupiter/activity/EntryWeiboActivity:a	Lcom/sina/weibo/sdk/api/share/e;
    //   137: invokeinterface 207 1 0
    //   142: ifeq +183 -> 325
    //   145: new 209	com/sina/weibo/sdk/api/h
    //   148: dup
    //   149: invokespecial 210	com/sina/weibo/sdk/api/h:<init>	()V
    //   152: astore 8
    //   154: aload 5
    //   156: ifnull +56 -> 212
    //   159: new 212	com/sina/weibo/sdk/api/ImageObject
    //   162: dup
    //   163: invokespecial 213	com/sina/weibo/sdk/api/ImageObject:<init>	()V
    //   166: astore 9
    //   168: new 215	java/io/ByteArrayOutputStream
    //   171: dup
    //   172: invokespecial 216	java/io/ByteArrayOutputStream:<init>	()V
    //   175: astore 10
    //   177: aload 5
    //   179: getstatic 222	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   182: bipush 85
    //   184: aload 10
    //   186: invokevirtual 226	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   189: pop
    //   190: aload 9
    //   192: aload 10
    //   194: invokevirtual 230	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   197: putfield 233	com/sina/weibo/sdk/api/ImageObject:b	[B
    //   200: aload 10
    //   202: invokevirtual 236	java/io/ByteArrayOutputStream:close	()V
    //   205: aload 8
    //   207: aload 9
    //   209: putfield 239	com/sina/weibo/sdk/api/h:b	Lcom/sina/weibo/sdk/api/ImageObject;
    //   212: new 241	com/sina/weibo/sdk/api/TextObject
    //   215: dup
    //   216: invokespecial 242	com/sina/weibo/sdk/api/TextObject:<init>	()V
    //   219: astore 14
    //   221: aload 6
    //   223: invokestatic 203	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   226: ifne +10 -> 236
    //   229: aload 14
    //   231: aload 6
    //   233: putfield 243	com/sina/weibo/sdk/api/TextObject:b	Ljava/lang/String;
    //   236: aload 8
    //   238: aload 14
    //   240: putfield 246	com/sina/weibo/sdk/api/h:a	Lcom/sina/weibo/sdk/api/TextObject;
    //   243: new 248	com/sina/weibo/sdk/api/share/g
    //   246: dup
    //   247: invokespecial 249	com/sina/weibo/sdk/api/share/g:<init>	()V
    //   250: astore 15
    //   252: aload 15
    //   254: invokestatic 255	java/lang/System:currentTimeMillis	()J
    //   257: invokestatic 258	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   260: putfield 260	com/sina/weibo/sdk/api/share/g:a	Ljava/lang/String;
    //   263: aload 15
    //   265: aload 8
    //   267: putfield 263	com/sina/weibo/sdk/api/share/g:b	Lcom/sina/weibo/sdk/api/h;
    //   270: aload_0
    //   271: getfield 166	com/wandoujia/jupiter/activity/EntryWeiboActivity:a	Lcom/sina/weibo/sdk/api/share/e;
    //   274: aload_0
    //   275: aload 15
    //   277: invokeinterface 266 3 0
    //   282: pop
    //   283: return
    //   284: astore 21
    //   286: aconst_null
    //   287: astore 12
    //   289: aload 12
    //   291: ifnull -86 -> 205
    //   294: aload 12
    //   296: invokevirtual 236	java/io/ByteArrayOutputStream:close	()V
    //   299: goto -94 -> 205
    //   302: astore 13
    //   304: goto -99 -> 205
    //   307: astore 17
    //   309: aconst_null
    //   310: astore 10
    //   312: aload 10
    //   314: ifnull +8 -> 322
    //   317: aload 10
    //   319: invokevirtual 236	java/io/ByteArrayOutputStream:close	()V
    //   322: aload 17
    //   324: athrow
    //   325: aload_0
    //   326: ldc_w 268
    //   329: iconst_0
    //   330: invokestatic 274	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   333: invokevirtual 277	android/widget/Toast:show	()V
    //   336: aload_0
    //   337: invokevirtual 130	com/wandoujia/jupiter/activity/EntryWeiboActivity:finish	()V
    //   340: return
    //   341: invokestatic 38	com/wandoujia/jupiter/h:k	()Lcom/wandoujia/ripple_framework/i;
    //   344: ldc_w 279
    //   347: invokevirtual 45	com/wandoujia/ripple_framework/i:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   350: checkcast 281	com/wandoujia/jupiter/navigation/NavigationManager
    //   353: aload_0
    //   354: ldc_w 283
    //   357: invokevirtual 286	com/wandoujia/jupiter/navigation/NavigationManager:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   360: aload_0
    //   361: ldc_w 287
    //   364: iconst_0
    //   365: invokestatic 290	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   368: invokevirtual 277	android/widget/Toast:show	()V
    //   371: aload_0
    //   372: invokevirtual 130	com/wandoujia/jupiter/activity/EntryWeiboActivity:finish	()V
    //   375: return
    //   376: astore 18
    //   378: goto -56 -> 322
    //   381: astore 20
    //   383: goto -178 -> 205
    //   386: astore 17
    //   388: goto -76 -> 312
    //   391: astore 11
    //   393: aload 10
    //   395: astore 12
    //   397: goto -108 -> 289
    //
    // Exception table:
    //   from	to	target	type
    //   168	177	284	java/lang/Exception
    //   294	299	302	java/io/IOException
    //   168	177	307	finally
    //   317	322	376	java/io/IOException
    //   200	205	381	java/io/IOException
    //   177	200	386	finally
    //   177	200	391	java/lang/Exception
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    JupiterApplication.a().removeCallbacks(this.d);
    this.a.a(paramIntent, this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.EntryWeiboActivity
 * JD-Core Version:    0.6.0
 */