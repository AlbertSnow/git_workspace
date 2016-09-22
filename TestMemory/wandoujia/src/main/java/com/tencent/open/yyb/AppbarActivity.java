package com.tencent.open.yyb;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ZoomButtonsController;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class AppbarActivity extends Activity
  implements View.OnClickListener
{
  private static ArrayList<String> k;
  protected ProgressDialog a;
  private com.tencent.open.c.b b;
  private LinearLayout c;
  private TitleBar d;
  private i e;
  private h f;
  private com.tencent.tauth.c g;
  private com.tencent.connect.b.c h;
  private String i;
  private String j;
  private final DownloadListener l = new d(this);

  static
  {
    ArrayList localArrayList = new ArrayList();
    k = localArrayList;
    localArrayList.add("MT870");
    k.add("XT910");
    k.add("XT928");
    k.add("MT917");
    k.add("Lenovo A60");
  }

  private com.tencent.connect.b.c b()
  {
    if (this.h == null)
    {
      if (this.g == null)
        this.g = com.tencent.tauth.c.a(this.i, this);
      this.h = this.g.a();
    }
    return this.h;
  }

  private String c()
  {
    if (e());
    File localFile1;
    for (String str1 = Environment.getExternalStorageDirectory().getPath() + "/tencent/tassistant"; ; str1 = localFile1.getAbsolutePath() + "/tencent/tassistant")
    {
      File localFile2 = new File(str1);
      if (!localFile2.exists())
        localFile2.mkdirs();
      for (String str2 = localFile2.getAbsolutePath(); ; str2 = "")
      {
        if (!TextUtils.isEmpty("/webview_cache"))
          str2 = str2 + "/webview_cache";
        File localFile3 = new File(str2);
        if (!localFile3.exists())
          localFile3.mkdirs();
        return localFile3.getAbsolutePath();
        localFile1 = getFilesDir();
        if (localFile1 != null)
          break;
      }
    }
  }

  private i d()
  {
    if (this.e == null)
    {
      this.e = new i(this);
      this.e.setCanceledOnTouchOutside(true);
      this.e.a().setOnClickListener(this);
      this.e.b().setOnClickListener(this);
    }
    return this.e;
  }

  private static boolean e()
  {
    try
    {
      boolean bool1 = "mounted".equals(Environment.getExternalStorageState());
      int m = 0;
      if (bool1)
      {
        boolean bool2 = Environment.getExternalStorageDirectory().canWrite();
        m = 0;
        if (bool2)
          m = 1;
      }
      return m;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private void f()
  {
    com.tencent.open.a.f.a("openSDK_LOG.AppbarActivity", "-->shareToWX : wx_appid = wx8e8dc60535c9cd93");
    if (!TextUtils.isEmpty(null.c))
    {
      String str1 = "";
      String str2 = "";
      if (TextUtils.isEmpty(str1))
        str1 = "请稍候";
      if (TextUtils.isEmpty(str2))
        str2 = "正在加载...";
      this.a = ProgressDialog.show(this, str1, str2);
      this.a.setCancelable(true);
      f localf = new f(new e(this));
      String[] arrayOfString = new String[1];
      arrayOfString[0] = null.c;
      localf.execute(arrayOfString);
    }
  }

  public void onBackPressed()
  {
    i locali = d();
    if ((locali != null) && (locali.isShowing()))
    {
      locali.dismiss();
      return;
    }
    super.onBackPressed();
  }

  public void onClick(View paramView)
  {
    i locali = d();
    if (paramView == this.d.getSharBtn())
      this.f.a("clickCallback", 0, "");
    do
    {
      while (true)
      {
        return;
        if (paramView == locali.a())
        {
          com.tencent.connect.b.c localc2 = b();
          if (localc2 == null)
            continue;
          com.tencent.connect.c.a locala = new com.tencent.connect.c.a(localc2);
          Bundle localBundle2 = new Bundle();
          localBundle2.putString("title", null.a);
          localBundle2.putString("targetUrl", null.d);
          localBundle2.putString("summary", null.b);
          localBundle2.putString("imageUrl", null.c);
          com.tencent.open.a.f.a("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQQ : model.mTitle = " + null.a);
          com.tencent.open.a.f.a("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQQ : model.mTargetUrl = " + null.d);
          com.tencent.open.a.f.a("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQQ : model.mDescription = " + null.b);
          com.tencent.open.a.f.a("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQQ : model.mIconUrl = " + null.c);
          locala.a(this, localBundle2, new b(this, localc2));
          a.a(localc2.b(), "200", "SDK.APPBAR.HOME.SHARE.QQ");
          return;
        }
        if (paramView != locali.b())
          break;
        com.tencent.connect.b.c localc1 = b();
        if (localc1 == null)
          continue;
        com.tencent.connect.c.d locald = new com.tencent.connect.c.d(localc1);
        Bundle localBundle1 = new Bundle();
        localBundle1.putInt("req_type", 1);
        localBundle1.putString("title", null.a);
        localBundle1.putString("summary", null.b);
        localBundle1.putString("targetUrl", null.d);
        ArrayList localArrayList = new ArrayList();
        com.tencent.open.a.f.a("openSDK_LOG.AppbarActivity", "-->shareToQzone : mIconUrl = " + null.c);
        localArrayList.add(null.c);
        localBundle1.putStringArrayList("imageUrl", localArrayList);
        locald.a(this, localBundle1, new c(this, localc1));
        a.a(localc1.b(), "200", "SDK.APPBAR.HOME.SHARE.QZ");
        return;
      }
      if (paramView == locali.c())
      {
        f();
        return;
      }
      if (paramView != locali.d())
        continue;
      f();
      return;
    }
    while (paramView != this.d.getBackBtn());
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.i = getIntent().getStringExtra("appid");
    this.j = getIntent().getStringExtra("url");
    com.tencent.open.a.f.a("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)onCreate : appid = " + this.i + " url = " + this.j);
    this.b = new com.tencent.open.c.b(this);
    this.f = new h(this.b);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    this.b.setLayoutParams(localLayoutParams);
    this.c = new LinearLayout(this);
    localLayoutParams.gravity = 17;
    this.c.setLayoutParams(localLayoutParams);
    this.c.setOrientation(1);
    this.d = new TitleBar(this);
    this.d.getBackBtn().setOnClickListener(this);
    this.d.getSharBtn().setOnClickListener(this);
    this.c.addView(this.d);
    this.c.addView(this.b);
    setContentView(this.c);
    WebSettings localWebSettings1 = this.b.getSettings();
    localWebSettings1.setBuiltInZoomControls(true);
    localWebSettings1.setUserAgentString(localWebSettings1.getUserAgentString() + "/qqdownloader/1/sdk");
    localWebSettings1.setJavaScriptEnabled(true);
    Class localClass1 = localWebSettings1.getClass();
    try
    {
      Class[] arrayOfClass4 = new Class[1];
      arrayOfClass4[0] = Boolean.TYPE;
      Method localMethod4 = localClass1.getMethod("setPluginsEnabled", arrayOfClass4);
      if (localMethod4 != null)
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Boolean.valueOf(true);
        localMethod4.invoke(localWebSettings1, arrayOfObject4);
      }
      try
      {
        label318: Class[] arrayOfClass3 = new Class[1];
        arrayOfClass3[0] = Boolean.TYPE;
        Method localMethod3 = localClass1.getMethod("setDomStorageEnabled", arrayOfClass3);
        if (localMethod3 != null)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Boolean.valueOf(true);
          localMethod3.invoke(localWebSettings1, arrayOfObject3);
        }
        label371: localWebSettings1.setAppCachePath(c());
        localWebSettings1.setDatabasePath(c());
        localWebSettings1.setDatabaseEnabled(true);
        localWebSettings1.setAppCacheEnabled(true);
        String str = Build.MODEL;
        int m;
        if ((!str.contains("vivo")) && (!k.contains(str)))
          m = 1;
        while (true)
        {
          if (m != 0)
          {
            localWebSettings1.setUseWideViewPort(true);
            if (Build.VERSION.SDK_INT < 7);
          }
          try
          {
            Class[] arrayOfClass2 = new Class[1];
            arrayOfClass2[0] = Boolean.TYPE;
            Method localMethod2 = localClass1.getMethod("setLoadWithOverviewMode", arrayOfClass2);
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Boolean.valueOf(true);
            localMethod2.invoke(localWebSettings1, arrayOfObject2);
            label493: if ((!android.support.v4.app.b.x()) || (android.support.v4.app.b.w() < 11));
            try
            {
              Field localField = WebView.class.getDeclaredField("mZoomButtonsController");
              localField.setAccessible(true);
              ZoomButtonsController localZoomButtonsController = new ZoomButtonsController(this.b);
              localZoomButtonsController.getZoomControls().setVisibility(8);
              localField.set(this.b, localZoomButtonsController);
              while (true)
              {
                label558: this.b.setWebViewClient(new g(this, 0));
                this.b.setWebChromeClient(new AppbarActivity.c(this, null));
                this.b.setDownloadListener(this.l);
                this.b.loadUrl(this.j);
                return;
                m = 0;
                break;
                try
                {
                  Class localClass2 = this.b.getSettings().getClass();
                  Class[] arrayOfClass1 = new Class[1];
                  arrayOfClass1[0] = Boolean.TYPE;
                  Method localMethod1 = localClass2.getMethod("setDisplayZoomControls", arrayOfClass1);
                  WebSettings localWebSettings2 = this.b.getSettings();
                  Object[] arrayOfObject1 = new Object[1];
                  arrayOfObject1[0] = Boolean.valueOf(false);
                  localMethod1.invoke(localWebSettings2, arrayOfObject1);
                }
                catch (Exception localException1)
                {
                }
              }
            }
            catch (Exception localException2)
            {
              break label558;
            }
          }
          catch (Exception localException3)
          {
            break label493;
          }
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        break label371;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label371;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        break label371;
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        break label371;
      }
      catch (SecurityException localSecurityException)
      {
        break label371;
      }
    }
    catch (Throwable localThrowable)
    {
      break label318;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      break label318;
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.b != null)
    {
      this.b.removeAllViews();
      this.b.setVisibility(8);
      this.b.stopLoading();
      this.b.clearHistory();
      this.b.destroy();
    }
  }

  protected void onPause()
  {
    super.onPause();
    i locali = d();
    if ((locali != null) && (locali.isShowing()))
      locali.dismiss();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.AppbarActivity
 * JD-Core Version:    0.6.0
 */