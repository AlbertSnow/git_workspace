package com.wandoujia.jupiter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.ripple_framework.AppMd5Manager;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.TypefaceManager;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.installer.m;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.g;
import de.greenrobot.event.c;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class j
{
  private static j a = new j();
  private Boolean b = Boolean.valueOf(false);
  private Context c;
  private Logger d;
  private Class<?> e;
  private Map<String, Object> f = new HashMap();
  private com.wandoujia.appmanager.config.a g;
  private String h;
  private String i;
  private Class<?> j;
  private com.wandoujia.ripple_framework.log.b k;
  private Boolean l;
  private InstallSuccessMonitor m;
  private com.wandoujia.jupiter.search.manage.a n;
  private com.wandoujia.p4.b.b o;
  private com.wandoujia.jupiter.e.a p;
  private com.wandoujia.image.b q;
  private com.android.volley.toolbox.j r;

  private i A()
  {
    Object localObject = this.f.get("list_adapter_creator");
    if (localObject == null)
    {
      localObject = new i();
      a("list_adapter_creator", localObject);
    }
    return (i)(i)localObject;
  }

  private com.wandoujia.image.b B()
  {
    if (this.q == null)
    {
      this.q = new com.wandoujia.image.b(this.c, new a(this.c));
      this.q.d();
      a("image", this.q);
    }
    return this.q;
  }

  private com.android.volley.toolbox.j C()
  {
    if (this.r == null)
    {
      this.r = new com.android.volley.toolbox.j(B().b(), B().a());
      a("image_load", this.r);
    }
    return this.r;
  }

  private LocalFeedManager D()
  {
    Object localObject = this.f.get("local_feed");
    if (localObject == null)
    {
      localObject = new LocalFeedManager();
      a("local_feed", localObject);
    }
    return (LocalFeedManager)(LocalFeedManager)localObject;
  }

  private AccessibilityManager E()
  {
    Object localObject = this.f.get("accessibility");
    if (localObject == null)
    {
      localObject = new AccessibilityManager();
      a("accessibility", localObject);
    }
    return (AccessibilityManager)(AccessibilityManager)localObject;
  }

  private com.wandoujia.jupiter.homepage.b.a F()
  {
    Object localObject = this.f.get("splash_ad_cache");
    if (localObject == null)
    {
      localObject = new com.wandoujia.jupiter.homepage.b.a(this.c);
      a("splash_ad_cache", localObject);
    }
    return (com.wandoujia.jupiter.homepage.b.a)(com.wandoujia.jupiter.homepage.b.a)localObject;
  }

  public static j a()
  {
    return a;
  }

  private void a(String paramString, Object paramObject)
  {
    this.f.put(paramString, paramObject);
  }

  private AppMd5Manager n()
  {
    Object localObject = this.f.get("app_md5");
    if (localObject == null)
    {
      localObject = new AppMd5Manager();
      a("app_md5", localObject);
    }
    return (AppMd5Manager)(AppMd5Manager)localObject;
  }

  private AppManager o()
  {
    if (!this.f.containsKey("app"))
      a("app", AppManager.a());
    return AppManager.a();
  }

  private com.wandoujia.ripple_framework.navigation.b p()
  {
    Object localObject = this.f.get("holder");
    if (localObject == null)
    {
      localObject = new com.wandoujia.ripple_framework.navigation.b();
      a("holder", localObject);
    }
    return (com.wandoujia.ripple_framework.navigation.b)(com.wandoujia.ripple_framework.navigation.b)localObject;
  }

  private StorageManager q()
  {
    if (!this.f.containsKey("storage"))
      a("storage", StorageManager.getInstance());
    return StorageManager.getInstance();
  }

  private c r()
  {
    if (!this.f.containsKey("event_bus"))
      a("event_bus", c.a());
    return c.a();
  }

  private DownloadManager s()
  {
    Object localObject = this.f.get("download");
    if (localObject == null)
    {
      ThreadPool.execute(new n());
      AppManager localAppManager = AppManager.a();
      DownloadManager localDownloadManager = new DownloadManager(this.c, this.g.j(), localAppManager, c.a());
      localDownloadManager.a();
      a("download", localDownloadManager);
      return localDownloadManager;
    }
    return (DownloadManager)localObject;
  }

  private InstallManager t()
  {
    Object localObject = this.f.get("install");
    if (localObject == null)
    {
      localObject = new InstallManager(this.c, s(), c.a());
      a("install", localObject);
    }
    return (InstallManager)(InstallManager)localObject;
  }

  private AppTaskManager u()
  {
    Object localObject = this.f.get("app_task");
    if (localObject == null)
    {
      AppTaskManager localAppTaskManager = new AppTaskManager(s(), c.a(), t(), AppManager.a());
      localAppTaskManager.a(new m());
      localAppTaskManager.a(new com.wandoujia.ripple_framework.installer.k());
      a("app_task", localAppTaskManager);
      return localAppTaskManager;
    }
    return (AppTaskManager)localObject;
  }

  private com.wandoujia.nirvana.framework.network.a v()
  {
    Object localObject = this.f.get("api_context");
    if (localObject == null)
    {
      localObject = new com.wandoujia.nirvana.framework.network.a();
      a("api_context", localObject);
    }
    return (com.wandoujia.nirvana.framework.network.a)(com.wandoujia.nirvana.framework.network.a)localObject;
  }

  private NavigationManager w()
  {
    Object localObject = this.f.get("navigation");
    if (localObject == null)
    {
      localObject = new NavigationManager();
      a("navigation", localObject);
    }
    return (NavigationManager)(NavigationManager)localObject;
  }

  private com.wandoujia.ripple_framework.b.a x()
  {
    Object localObject = this.f.get("presenter");
    if (localObject == null)
    {
      localObject = new com.wandoujia.ripple_framework.b.a();
      a("presenter", localObject);
    }
    return (com.wandoujia.ripple_framework.b.a)(com.wandoujia.ripple_framework.b.a)localObject;
  }

  private com.wandoujia.ripple_framework.b.b y()
  {
    Object localObject = this.f.get("component");
    if (localObject == null)
    {
      localObject = new com.wandoujia.ripple_framework.b.b();
      a("component", localObject);
    }
    return (com.wandoujia.ripple_framework.b.b)(com.wandoujia.ripple_framework.b.b)localObject;
  }

  private TypefaceManager z()
  {
    Object localObject = this.f.get("type_face");
    if (localObject == null)
    {
      localObject = new TypefaceManager(this.c, new com.wandoujia.ripple_framework.o());
      a("type_face", localObject);
    }
    return (TypefaceManager)(TypefaceManager)localObject;
  }

  public final <T> T a(String paramString)
  {
    if (!this.b.booleanValue())
    {
      Looper.getMainLooper();
      Looper.myLooper();
    }
    Object localObject = this.f.get(paramString);
    if (localObject != null)
      return localObject;
    int i1 = -1;
    switch (paramString.hashCode())
    {
    default:
    case 107332:
    case -793618848:
    case 96801:
    case -1211707988:
    case -1884274053:
    case 31736667:
    case 1427818632:
    case 1957569947:
    case 1167827171:
    case -534668150:
    case 1862666772:
    case -921943384:
    case -1399907075:
    case 518943810:
    case 1340151195:
    case 100313435:
    case -1443007158:
    case 1303292402:
    case -213139122:
    case -1943731394:
    }
    while (true)
      switch (i1)
      {
      default:
        return null;
        if (!paramString.equals("log"))
          continue;
        i1 = 0;
        continue;
        if (!paramString.equals("app_md5"))
          continue;
        i1 = 1;
        continue;
        if (!paramString.equals("app"))
          continue;
        i1 = 2;
        continue;
        if (!paramString.equals("holder"))
          continue;
        i1 = 3;
        continue;
        if (!paramString.equals("storage"))
          continue;
        i1 = 4;
        continue;
        if (!paramString.equals("event_bus"))
          continue;
        i1 = 5;
        continue;
        if (!paramString.equals("download"))
          continue;
        i1 = 6;
        continue;
        if (!paramString.equals("install"))
          continue;
        i1 = 7;
        continue;
        if (!paramString.equals("app_task"))
          continue;
        i1 = 8;
        continue;
        if (!paramString.equals("api_context"))
          continue;
        i1 = 9;
        continue;
        if (!paramString.equals("navigation"))
          continue;
        i1 = 10;
        continue;
        if (!paramString.equals("presenter"))
          continue;
        i1 = 11;
        continue;
        if (!paramString.equals("component"))
          continue;
        i1 = 12;
        continue;
        if (!paramString.equals("type_face"))
          continue;
        i1 = 13;
        continue;
        if (!paramString.equals("list_adapter_creator"))
          continue;
        i1 = 14;
        continue;
        if (!paramString.equals("image"))
          continue;
        i1 = 15;
        continue;
        if (!paramString.equals("image_load"))
          continue;
        i1 = 16;
        continue;
        if (!paramString.equals("local_feed"))
          continue;
        i1 = 17;
        continue;
        if (!paramString.equals("accessibility"))
          continue;
        i1 = 18;
        continue;
        if (!paramString.equals("splash_ad_cache"))
          continue;
        i1 = 19;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      }
    return m();
    return n();
    return o();
    return p();
    return q();
    return r();
    return s();
    return t();
    return u();
    return v();
    return w();
    return x();
    return y();
    return z();
    return A();
    return B();
    return C();
    return D();
    return E();
    return F();
  }

  public final void a(Context paramContext, com.wandoujia.appmanager.config.a parama)
  {
    this.c = paramContext;
    this.g = parama;
    this.e = parama.k();
    this.i = parama.o();
    this.j = parama.n();
    String str1 = android.support.v4.app.b.k(paramContext, parama.m());
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      str2 = str1 + "cache" + "/";
      File localFile = new File(str2);
      if ((!localFile.exists()) && (!localFile.mkdirs()));
    }
    while (true)
    {
      this.h = str2;
      if (TextUtils.isEmpty(this.h))
        this.h = paramContext.getCacheDir().getPath();
      com.wandoujia.jupiter.util.o.a().d();
      com.wandoujia.jupiter.util.o.a().a("initFrescoImageLoader");
      v.a(new o(this, 0), paramContext);
      com.wandoujia.jupiter.util.o.a().d();
      this.m = new InstallSuccessMonitor();
      AppManager.a(paramContext, ThreadPool.NORMAL_PRIOR_EXECUTOR, parama);
      AppManager.a().a(this.m);
      com.wandoujia.jupiter.util.o.a().a("AppManager");
      com.wandoujia.jupiter.util.o.a().d();
      this.n = new com.wandoujia.jupiter.search.manage.a();
      this.o = new com.wandoujia.p4.b.b();
      this.p = new com.wandoujia.jupiter.e.a();
      com.wandoujia.jupiter.util.o.a().a("searchHintCache");
      ReceiverMonitor.a().a(this.p);
      LocalStorage.init(paramContext);
      AsyncImageView.setImageManagerHolder(new k(this));
      JupiterApplication.a().postDelayed(new l(this), 1000L);
      return;
      str2 = null;
    }
  }

  public final Class<?> b()
  {
    return this.e;
  }

  public final Context c()
  {
    return this.c;
  }

  public final Logger d()
  {
    if (this.d == null)
      return m();
    return this.d;
  }

  public final String e()
  {
    return this.h;
  }

  public final String f()
  {
    return this.i;
  }

  public final String g()
  {
    return new File(this.h).getParent();
  }

  public final Class<?> h()
  {
    return this.j;
  }

  public final com.wandoujia.jupiter.search.manage.a i()
  {
    return this.n;
  }

  public final com.wandoujia.p4.b.b j()
  {
    return this.o;
  }

  public final boolean k()
  {
    if (this.l == null)
      if (MemoryUtil.getAvailMemory(this.c) <= 64L)
        break label39;
    label39: for (boolean bool = true; ; bool = false)
    {
      this.l = Boolean.valueOf(bool);
      return this.l.booleanValue();
    }
  }

  public final boolean l()
  {
    return this.b.booleanValue();
  }

  public final Logger m()
  {
    if (this.k == null)
      this.k = this.g.l();
    g localg = new g(this.g.i(), this.g.j(), this.k, this.g.f());
    this.d = new Logger(this.c, localg);
    a("log", this.d);
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.j
 * JD-Core Version:    0.6.0
 */