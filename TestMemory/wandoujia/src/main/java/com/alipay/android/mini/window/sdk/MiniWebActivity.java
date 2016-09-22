package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.android.app.i;
import com.alipay.test.ui.core.EventObject;
import com.alipay.wandoujia.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MiniWebActivity extends Activity
{
  private WebView a = null;
  private FrameLayout b = null;
  private ImageView c;
  private ImageView d;
  private ImageView e;
  private String f = "";
  private ProgressBar g = null;
  private String h = "";
  private TextView i = null;
  private View j = null;
  private Map k;
  private boolean l = false;

  // ERROR //
  private boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: new 53	android/webkit/WebView
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 56	android/webkit/WebView:<init>	(Landroid/content/Context;)V
    //   9: putfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   12: aload_0
    //   13: aload_0
    //   14: ldc 58
    //   16: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   19: invokevirtual 67	com/alipay/android/mini/window/sdk/MiniWebActivity:findViewById	(I)Landroid/view/View;
    //   22: checkcast 69	android/widget/FrameLayout
    //   25: putfield 33	com/alipay/android/mini/window/sdk/MiniWebActivity:b	Landroid/widget/FrameLayout;
    //   28: aload_0
    //   29: getfield 33	com/alipay/android/mini/window/sdk/MiniWebActivity:b	Landroid/widget/FrameLayout;
    //   32: aload_0
    //   33: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   36: invokevirtual 73	android/widget/FrameLayout:addView	(Landroid/view/View;)V
    //   39: aload_0
    //   40: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   43: sipush 6666
    //   46: invokevirtual 77	android/webkit/WebView:setId	(I)V
    //   49: aload_0
    //   50: getfield 79	com/alipay/android/mini/window/sdk/MiniWebActivity:k	Ljava/util/Map;
    //   53: astore_2
    //   54: iconst_1
    //   55: newarray int
    //   57: astore_3
    //   58: aload_3
    //   59: iconst_0
    //   60: aload_0
    //   61: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   64: invokevirtual 83	android/webkit/WebView:getId	()I
    //   67: iastore
    //   68: aload_2
    //   69: ldc 85
    //   71: aload_3
    //   72: invokeinterface 91 3 0
    //   77: pop
    //   78: aload_0
    //   79: aload_0
    //   80: ldc 93
    //   82: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   85: invokevirtual 67	com/alipay/android/mini/window/sdk/MiniWebActivity:findViewById	(I)Landroid/view/View;
    //   88: checkcast 95	android/widget/ImageView
    //   91: putfield 97	com/alipay/android/mini/window/sdk/MiniWebActivity:c	Landroid/widget/ImageView;
    //   94: aload_0
    //   95: getfield 79	com/alipay/android/mini/window/sdk/MiniWebActivity:k	Ljava/util/Map;
    //   98: astore 5
    //   100: iconst_1
    //   101: newarray int
    //   103: astore 6
    //   105: aload 6
    //   107: iconst_0
    //   108: ldc 93
    //   110: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   113: iastore
    //   114: aload 5
    //   116: ldc 93
    //   118: aload 6
    //   120: invokeinterface 91 3 0
    //   125: pop
    //   126: aload_0
    //   127: aload_0
    //   128: ldc 99
    //   130: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   133: invokevirtual 67	com/alipay/android/mini/window/sdk/MiniWebActivity:findViewById	(I)Landroid/view/View;
    //   136: checkcast 95	android/widget/ImageView
    //   139: putfield 101	com/alipay/android/mini/window/sdk/MiniWebActivity:d	Landroid/widget/ImageView;
    //   142: aload_0
    //   143: getfield 79	com/alipay/android/mini/window/sdk/MiniWebActivity:k	Ljava/util/Map;
    //   146: astore 8
    //   148: iconst_1
    //   149: newarray int
    //   151: astore 9
    //   153: aload 9
    //   155: iconst_0
    //   156: ldc 99
    //   158: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   161: iastore
    //   162: aload 8
    //   164: ldc 99
    //   166: aload 9
    //   168: invokeinterface 91 3 0
    //   173: pop
    //   174: aload_0
    //   175: aload_0
    //   176: ldc 103
    //   178: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   181: invokevirtual 67	com/alipay/android/mini/window/sdk/MiniWebActivity:findViewById	(I)Landroid/view/View;
    //   184: checkcast 95	android/widget/ImageView
    //   187: putfield 105	com/alipay/android/mini/window/sdk/MiniWebActivity:e	Landroid/widget/ImageView;
    //   190: aload_0
    //   191: getfield 79	com/alipay/android/mini/window/sdk/MiniWebActivity:k	Ljava/util/Map;
    //   194: astore 11
    //   196: iconst_1
    //   197: newarray int
    //   199: astore 12
    //   201: aload 12
    //   203: iconst_0
    //   204: ldc 103
    //   206: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   209: iastore
    //   210: aload 11
    //   212: ldc 103
    //   214: aload 12
    //   216: invokeinterface 91 3 0
    //   221: pop
    //   222: aload_0
    //   223: aload_0
    //   224: ldc 107
    //   226: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   229: invokevirtual 67	com/alipay/android/mini/window/sdk/MiniWebActivity:findViewById	(I)Landroid/view/View;
    //   232: checkcast 109	android/widget/TextView
    //   235: putfield 43	com/alipay/android/mini/window/sdk/MiniWebActivity:i	Landroid/widget/TextView;
    //   238: aload_0
    //   239: aload_0
    //   240: ldc 111
    //   242: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   245: invokevirtual 67	com/alipay/android/mini/window/sdk/MiniWebActivity:findViewById	(I)Landroid/view/View;
    //   248: putfield 45	com/alipay/android/mini/window/sdk/MiniWebActivity:j	Landroid/view/View;
    //   251: aload_0
    //   252: getfield 41	com/alipay/android/mini/window/sdk/MiniWebActivity:h	Ljava/lang/String;
    //   255: invokestatic 117	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   258: ifeq +437 -> 695
    //   261: aload_0
    //   262: getfield 43	com/alipay/android/mini/window/sdk/MiniWebActivity:i	Landroid/widget/TextView;
    //   265: bipush 8
    //   267: invokevirtual 120	android/widget/TextView:setVisibility	(I)V
    //   270: aload_0
    //   271: getfield 45	com/alipay/android/mini/window/sdk/MiniWebActivity:j	Landroid/view/View;
    //   274: iconst_0
    //   275: invokevirtual 123	android/view/View:setVisibility	(I)V
    //   278: aload_0
    //   279: getfield 79	com/alipay/android/mini/window/sdk/MiniWebActivity:k	Ljava/util/Map;
    //   282: astore 14
    //   284: iconst_1
    //   285: newarray int
    //   287: astore 15
    //   289: aload 15
    //   291: iconst_0
    //   292: ldc 111
    //   294: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   297: iastore
    //   298: aload 14
    //   300: ldc 111
    //   302: aload 15
    //   304: invokeinterface 91 3 0
    //   309: pop
    //   310: aload_0
    //   311: getfield 79	com/alipay/android/mini/window/sdk/MiniWebActivity:k	Ljava/util/Map;
    //   314: astore 17
    //   316: iconst_1
    //   317: newarray int
    //   319: astore 18
    //   321: aload 18
    //   323: iconst_0
    //   324: ldc 107
    //   326: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   329: iastore
    //   330: aload 17
    //   332: ldc 107
    //   334: aload 18
    //   336: invokeinterface 91 3 0
    //   341: pop
    //   342: aload_0
    //   343: aload_0
    //   344: ldc 125
    //   346: invokestatic 63	android/support/v4/app/d:a	(Ljava/lang/String;)I
    //   349: invokevirtual 67	com/alipay/android/mini/window/sdk/MiniWebActivity:findViewById	(I)Landroid/view/View;
    //   352: checkcast 127	android/widget/ProgressBar
    //   355: putfield 39	com/alipay/android/mini/window/sdk/MiniWebActivity:g	Landroid/widget/ProgressBar;
    //   358: aload_0
    //   359: getfield 39	com/alipay/android/mini/window/sdk/MiniWebActivity:g	Landroid/widget/ProgressBar;
    //   362: iconst_0
    //   363: invokevirtual 130	android/widget/ProgressBar:setSecondaryProgress	(I)V
    //   366: aload_0
    //   367: getfield 97	com/alipay/android/mini/window/sdk/MiniWebActivity:c	Landroid/widget/ImageView;
    //   370: iconst_0
    //   371: invokevirtual 134	android/widget/ImageView:setEnabled	(Z)V
    //   374: aload_0
    //   375: getfield 101	com/alipay/android/mini/window/sdk/MiniWebActivity:d	Landroid/widget/ImageView;
    //   378: iconst_0
    //   379: invokevirtual 134	android/widget/ImageView:setEnabled	(Z)V
    //   382: aload_0
    //   383: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   386: invokevirtual 138	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   389: iconst_1
    //   390: invokevirtual 143	android/webkit/WebSettings:setSupportMultipleWindows	(Z)V
    //   393: aload_0
    //   394: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   397: invokevirtual 138	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   400: iconst_1
    //   401: invokevirtual 146	android/webkit/WebSettings:setJavaScriptEnabled	(Z)V
    //   404: aload_0
    //   405: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   408: invokevirtual 138	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   411: iconst_0
    //   412: invokevirtual 149	android/webkit/WebSettings:setSavePassword	(Z)V
    //   415: aload_0
    //   416: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   419: invokevirtual 138	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   422: iconst_1
    //   423: invokevirtual 152	android/webkit/WebSettings:setJavaScriptCanOpenWindowsAutomatically	(Z)V
    //   426: aload_0
    //   427: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   430: iconst_1
    //   431: invokevirtual 155	android/webkit/WebView:setVerticalScrollbarOverlay	(Z)V
    //   434: aload_0
    //   435: getfield 47	com/alipay/android/mini/window/sdk/MiniWebActivity:l	Z
    //   438: ifeq +51 -> 489
    //   441: aload_0
    //   442: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   445: new 157	com/alipay/android/mini/window/sdk/a
    //   448: dup
    //   449: invokespecial 158	com/alipay/android/mini/window/sdk/a:<init>	()V
    //   452: ldc 160
    //   454: invokevirtual 164	android/webkit/WebView:addJavascriptInterface	(Ljava/lang/Object;Ljava/lang/String;)V
    //   457: aload_0
    //   458: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   461: invokevirtual 138	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   464: astore 30
    //   466: aload 30
    //   468: invokestatic 170	com/alipay/wandoujia/g:z	()Lcom/alipay/wandoujia/g;
    //   471: aload_0
    //   472: invokevirtual 174	com/alipay/android/mini/window/sdk/MiniWebActivity:getApplicationContext	()Landroid/content/Context;
    //   475: invokevirtual 177	com/alipay/wandoujia/g:d	(Landroid/content/Context;)Ljava/lang/String;
    //   478: invokevirtual 181	android/webkit/WebSettings:setUserAgentString	(Ljava/lang/String;)V
    //   481: aload 30
    //   483: getstatic 187	android/webkit/WebSettings$RenderPriority:HIGH	Landroid/webkit/WebSettings$RenderPriority;
    //   486: invokevirtual 191	android/webkit/WebSettings:setRenderPriority	(Landroid/webkit/WebSettings$RenderPriority;)V
    //   489: getstatic 197	android/os/Build$VERSION:SDK_INT	I
    //   492: bipush 7
    //   494: if_icmplt +77 -> 571
    //   497: aload_0
    //   498: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   501: invokevirtual 138	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   504: invokevirtual 203	java/lang/Object:getClass	()Ljava/lang/Class;
    //   507: astore 24
    //   509: iconst_1
    //   510: anewarray 205	java/lang/Class
    //   513: astore 25
    //   515: aload 25
    //   517: iconst_0
    //   518: getstatic 211	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   521: aastore
    //   522: aload 24
    //   524: ldc 213
    //   526: aload 25
    //   528: invokevirtual 217	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   531: astore 26
    //   533: aload 26
    //   535: ifnull +36 -> 571
    //   538: aload_0
    //   539: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   542: invokevirtual 138	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   545: astore 27
    //   547: iconst_1
    //   548: anewarray 199	java/lang/Object
    //   551: astore 28
    //   553: aload 28
    //   555: iconst_0
    //   556: iconst_1
    //   557: invokestatic 221	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   560: aastore
    //   561: aload 26
    //   563: aload 27
    //   565: aload 28
    //   567: invokevirtual 227	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   570: pop
    //   571: aload_0
    //   572: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   575: new 229	com/alipay/android/mini/window/sdk/u
    //   578: dup
    //   579: aload_0
    //   580: invokespecial 232	com/alipay/android/mini/window/sdk/u:<init>	(Lcom/alipay/android/mini/window/sdk/MiniWebActivity;)V
    //   583: invokevirtual 236	android/webkit/WebView:setWebChromeClient	(Landroid/webkit/WebChromeClient;)V
    //   586: aload_0
    //   587: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   590: new 238	com/alipay/android/mini/window/sdk/bi
    //   593: dup
    //   594: aload_0
    //   595: invokespecial 239	com/alipay/android/mini/window/sdk/bi:<init>	(Lcom/alipay/android/mini/window/sdk/MiniWebActivity;)V
    //   598: invokevirtual 243	android/webkit/WebView:setWebViewClient	(Landroid/webkit/WebViewClient;)V
    //   601: aload_0
    //   602: getfield 97	com/alipay/android/mini/window/sdk/MiniWebActivity:c	Landroid/widget/ImageView;
    //   605: new 245	com/alipay/android/mini/window/sdk/bj
    //   608: dup
    //   609: aload_0
    //   610: invokespecial 246	com/alipay/android/mini/window/sdk/bj:<init>	(Lcom/alipay/android/mini/window/sdk/MiniWebActivity;)V
    //   613: invokevirtual 250	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   616: aload_0
    //   617: getfield 101	com/alipay/android/mini/window/sdk/MiniWebActivity:d	Landroid/widget/ImageView;
    //   620: new 252	com/alipay/android/mini/window/sdk/bk
    //   623: dup
    //   624: aload_0
    //   625: invokespecial 253	com/alipay/android/mini/window/sdk/bk:<init>	(Lcom/alipay/android/mini/window/sdk/MiniWebActivity;)V
    //   628: invokevirtual 250	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   631: aload_0
    //   632: getfield 105	com/alipay/android/mini/window/sdk/MiniWebActivity:e	Landroid/widget/ImageView;
    //   635: new 255	com/alipay/android/mini/window/sdk/bl
    //   638: dup
    //   639: aload_0
    //   640: invokespecial 256	com/alipay/android/mini/window/sdk/bl:<init>	(Lcom/alipay/android/mini/window/sdk/MiniWebActivity;)V
    //   643: invokevirtual 250	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   646: aload_0
    //   647: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   650: invokevirtual 203	java/lang/Object:getClass	()Ljava/lang/Class;
    //   653: ldc_w 258
    //   656: iconst_0
    //   657: anewarray 205	java/lang/Class
    //   660: invokevirtual 217	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   663: astore 21
    //   665: aload 21
    //   667: ifnull +23 -> 690
    //   670: aload 21
    //   672: aload_0
    //   673: getfield 31	com/alipay/android/mini/window/sdk/MiniWebActivity:a	Landroid/webkit/WebView;
    //   676: iconst_1
    //   677: anewarray 199	java/lang/Object
    //   680: dup
    //   681: iconst_0
    //   682: ldc_w 260
    //   685: aastore
    //   686: invokevirtual 227	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   689: pop
    //   690: iconst_1
    //   691: ireturn
    //   692: astore_1
    //   693: iconst_0
    //   694: ireturn
    //   695: aload_0
    //   696: getfield 43	com/alipay/android/mini/window/sdk/MiniWebActivity:i	Landroid/widget/TextView;
    //   699: iconst_0
    //   700: invokevirtual 120	android/widget/TextView:setVisibility	(I)V
    //   703: aload_0
    //   704: getfield 45	com/alipay/android/mini/window/sdk/MiniWebActivity:j	Landroid/view/View;
    //   707: bipush 8
    //   709: invokevirtual 123	android/view/View:setVisibility	(I)V
    //   712: aload_0
    //   713: getfield 43	com/alipay/android/mini/window/sdk/MiniWebActivity:i	Landroid/widget/TextView;
    //   716: aload_0
    //   717: getfield 41	com/alipay/android/mini/window/sdk/MiniWebActivity:h	Ljava/lang/String;
    //   720: invokevirtual 264	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   723: goto -445 -> 278
    //   726: astore 20
    //   728: aload 20
    //   730: invokestatic 269	android/support/v4/app/b:b	(Ljava/lang/Object;)V
    //   733: goto -43 -> 690
    //   736: astore 23
    //   738: goto -167 -> 571
    //
    // Exception table:
    //   from	to	target	type
    //   0	12	692	java/lang/Exception
    //   646	665	726	java/lang/Exception
    //   670	690	726	java/lang/Exception
    //   497	533	736	java/lang/Exception
    //   538	571	736	java/lang/Exception
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().requestFeature(1);
    com.wandoujia.image.c.a.a().a(getApplicationContext(), g.z());
    setContentView(d.f("mini_web_view"));
    getWindow().getAttributes().height = -1;
    getWindow().getAttributes().width = -1;
    getWindow().getAttributes().horizontalMargin = 0.0F;
    this.k = new HashMap();
    this.f = getIntent().getExtras().getString("url");
    this.l = getIntent().getBooleanExtra("from_mcashier", false);
    this.h = getIntent().getExtras().getString("title");
    if (!a())
    {
      finish();
      return;
    }
    try
    {
      String str1 = "URL:" + this.f;
      Iterator localIterator = this.k.keySet().iterator();
      String str3;
      for (Object localObject = str1; ; localObject = str3)
      {
        if (!localIterator.hasNext())
        {
          com.alipay.a.a.a locala = com.alipay.a.a.a.a();
          EventObject localEventObject = EventObject.OnResume;
          Object[] arrayOfObject = new Object[4];
          arrayOfObject[0] = this;
          arrayOfObject[1] = "mini-webview";
          arrayOfObject[2] = localObject;
          arrayOfObject[3] = this.k;
          locala.onChangeEvent(localEventObject, arrayOfObject);
          this.a.loadUrl(this.f);
          return;
        }
        String str2 = (String)localIterator.next();
        str3 = localObject + "," + str2 + ":" + ((int[])this.k.get(str2))[0];
      }
    }
    catch (Exception localException)
    {
      while (true)
        b.b(localException);
    }
  }

  protected void onDestroy()
  {
    if (this.b != null)
    {
      this.b.removeAllViews();
      this.b = null;
    }
    if (this.a != null)
    {
      this.a.setWebViewClient(null);
      this.a.setWebChromeClient(null);
      this.a.setDownloadListener(null);
      this.a.removeAllViews();
      this.a.destroy();
      this.a = null;
    }
    if (this.c != null)
    {
      this.c.setOnClickListener(null);
      this.c = null;
    }
    if (this.d != null)
    {
      this.d.setOnClickListener(null);
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.setOnClickListener(null);
      this.e = null;
    }
    if (this.l);
    synchronized (i.a)
    {
      try
      {
        ???.notify();
        super.onDestroy();
        return;
      }
      catch (Exception localException)
      {
        while (true)
          b.b(localException);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.MiniWebActivity
 * JD-Core Version:    0.6.0
 */