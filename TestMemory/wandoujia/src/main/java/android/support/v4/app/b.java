package android.support.v4.app;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.SharedElementCallback;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.StatFs;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.android.app.exception.NetErrorException;
import com.android.volley.toolbox.w;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.nineoldandroids.animation.ObjectAnimator;
import com.org.apache.http.entity.mime.HttpMultipartMode;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.tencent.mm.sdk.openapi.WXMediaMessage;
import com.wandoujia.account.AccountErrorType;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.AccountParams.Type;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.dto.AccountBean;
import com.wandoujia.account.dto.DeviceBean;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.dto.RegisterSource;
import com.wandoujia.account.dto.SocialBean;
import com.wandoujia.account.fragment.AccountBaseFragment;
import com.wandoujia.account.fragment.WebViewFragment;
import com.wandoujia.account.storage.AccountStorageType;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.ApkDetail.Builder;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.DownloadUrl.Builder;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.ExtensionPack;
import com.wandoujia.api.proto.Image.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.reflect.JavaCalls;
import com.wandoujia.base.utils.CipherUtil;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.base.utils.Phoenix2Util;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.entities.app.AppLiteInfo;
import com.wandoujia.entities.app.IAppLiteInfo;
import com.wandoujia.game_launcher.models.GameRecommendModel;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.launcher.LauncherConfig;
import com.wandoujia.launcher.LauncherConfig.LauncherType;
import com.wandoujia.launcher.launcher.models.LauncherSuggestions;
import com.wandoujia.launcher.launcher.models.SimpleAppInfo;
import com.wandoujia.log.LogReporter;
import com.wandoujia.log.LogReporterFactory;
import com.wandoujia.log.toolkit.LaunchLogger;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.GameLauncherPackage;
import com.wandoujia.logv3.model.packages.GameLauncherPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.ai;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.treebuilder.PopupLogTreeBuilder;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.morph.a.r;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.p4.campaign.CampaignActivity;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.model.GoldenCardModel;
import com.wandoujia.p4.settings.FollowUsTipsTransparentActivity;
import com.wandoujia.push.protocol.PushEntityV1.Intent;
import com.wandoujia.push.protocol.PushEntityV1.Intent.Extra;
import com.wandoujia.ripple_framework.action.ActionType;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.h;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.rpc.http.client.DataApi;
import com.wandoujia.udid.UDIDUtil;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
@SuppressLint({"CommitPrefEdits"})
public final class b
{
  private static String b;
  private static com.wandoujia.download2.g c;
  private static Context d;
  private static com.wandoujia.accessibility.autoinstall.b e;
  private static Context f;
  private static com.wandoujia.account.f.b g;
  private static com.wandoujia.launcher.c.a h;
  private static SharedPreferences i;
  private static SharedPreferences j;
  private static GameLauncherPackage k;
  private static DataApi l;
  private static de.greenrobot.event.c m;
  private static boolean n;
  private static PackageManager o;
  private static SharedPreferences p;
  private static WeakReference<AbsListView> q;
  private bn a;

  public b()
  {
  }

  public b(bn parambn)
  {
    this();
    this.a = parambn;
  }

  public static Context A()
  {
    return f;
  }

  public static String A(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      String str = com.wandoujia.base.utils.Base64.encodeToString(CipherUtil.encrypt(paramString, CipherUtil.getAESKey(GlobalConfig.getAppContext())), 10);
      return str;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      return null;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    return null;
  }

  public static void A(Context paramContext)
  {
    p = paramContext.getSharedPreferences("update_config", 0);
  }

  public static GameRecommendModel B(String paramString)
  {
    com.wandoujia.launcher.c.a.a.b localb = new com.wandoujia.launcher.c.a.a.b();
    try
    {
      GameRecommendModel localGameRecommendModel = (GameRecommendModel)T().a(localb.a(paramString).build(), GameRecommendModel.class);
      return localGameRecommendModel;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }

  public static File B(Context paramContext)
  {
    File localFile;
    if (("mounted".equals(Environment.getExternalStorageState())) && (paramContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0))
    {
      localFile = SystemUtil.getDeviceExternalCacheDir();
      if ((localFile != null) && (!localFile.exists()) && (!localFile.mkdirs()))
        localFile = null;
      if (localFile != null)
        break label50;
    }
    label50: 
    do
    {
      return null;
      if (localFile.exists())
        return localFile;
    }
    while (!localFile.mkdirs());
    return localFile;
  }

  public static boolean B()
  {
    String str = com.wandoujia.account.a.s();
    if (TextUtils.isEmpty(str));
    do
      return true;
    while ((str.equals(RegisterSource.QQ.name())) || (str.equals(RegisterSource.RENREN.name())) || (str.equals(RegisterSource.SINA.name())));
    return false;
  }

  public static Model C()
  {
    ArrayList localArrayList = new ArrayList();
    ApkDetail.Builder localBuilder1 = new ApkDetail.Builder();
    DownloadUrl.Builder localBuilder = new DownloadUrl.Builder();
    com.wandoujia.online_config.c.a();
    ApkDetail.Builder localBuilder2 = localBuilder1.download_url(localBuilder.url(com.wandoujia.online_config.c.d()).build());
    com.wandoujia.online_config.c.a();
    localArrayList.add(localBuilder2.version_code(Integer.valueOf(com.wandoujia.online_config.c.e())).bytes_(Integer.valueOf(0)).build());
    Entity.Builder localBuilder3 = new Entity.Builder().title(GlobalConfig.getAppContext().getString(2131625000)).tag_line(GlobalConfig.getAppContext().getString(2131624999)).sub_title(GlobalConfig.getAppContext().getString(2131624999));
    com.wandoujia.online_config.c.a();
    return new Model(localBuilder3.icon(com.wandoujia.online_config.c.f()).template_type(TemplateTypeEnum.TemplateType.SINGLE_SMALL).detail(new Detail.Builder().app_detail(new AppDetail.Builder().apk(localArrayList).package_name("com.wandoujia.game_launcher").build()).build()).build());
  }

  public static boolean C(Context paramContext)
  {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
  }

  public static boolean C(String paramString)
  {
    return (paramString != null) && (paramString.startsWith("offline://hack?"));
  }

  public static SharedPreferences D()
  {
    monitorenter;
    try
    {
      if (i == null)
        i = GlobalConfig.getAppContext().getSharedPreferences("com.wandoujia.phoenix2", 2);
      SharedPreferences localSharedPreferences = i;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static String D(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null);
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 0);
      if (localApplicationInfo != null)
      {
        String str = localApplicationInfo.sourceDir;
        return str;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label36: break label36;
    }
  }

  public static String D(String paramString)
  {
    int i1;
    if (C(paramString))
    {
      i1 = paramString.indexOf("url=");
      if (i1 >= 0);
    }
    else
    {
      return paramString;
    }
    return paramString.substring(i1 + 4);
  }

  public static long E()
  {
    return D().getLong("KEY_FIRST_LAUNCH_GL_DAY", 0L);
  }

  public static boolean E(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
      return false;
    while ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://")));
    return true;
  }

  public static String F(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      paramString = "";
    do
      return paramString;
    while (!paramString.startsWith("/"));
    return "http://apis.wandoujia.com" + paramString;
  }

  public static void F()
  {
    com.wandoujia.launcher.e.g.a(U(), "launcher-disk-pref");
  }

  public static Object G(String paramString)
  {
    boolean bool = j(GlobalConfig.getAppContext(), paramString);
    Object localObject1 = null;
    if (bool);
    try
    {
      Object localObject2 = l(GlobalConfig.getAppContext(), paramString);
      localObject1 = localObject2;
      return localObject1;
    }
    catch (ClassCastException localClassCastException)
    {
      X(paramString);
      return null;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      X(paramString);
    }
    return null;
  }

  public static void G()
  {
    SharedPreferences.Editor localEditor = U().edit();
    localEditor.putBoolean("game_shortcut_generated", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static String H(String paramString)
  {
    try
    {
      Date localDate = new SimpleDateFormat("yyyyMMdd").parse(paramString);
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.setTime(localDate);
      Context localContext = GlobalConfig.getAppContext();
      int i1 = com.wandoujia.game_launcher.lib.R.string.date_day;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(1 + localCalendar.get(2));
      arrayOfObject[1] = Integer.valueOf(localCalendar.get(5));
      String str = localContext.getString(i1, arrayOfObject);
      return str;
    }
    catch (ParseException localParseException)
    {
    }
    return "";
  }

  public static boolean H()
  {
    return U().getBoolean("game_shortcut_generated", false);
  }

  public static String I()
  {
    Calendar localCalendar = Calendar.getInstance();
    Context localContext = GlobalConfig.getAppContext();
    int i1 = com.wandoujia.game_launcher.lib.R.string.date_day;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(1 + localCalendar.get(2));
    arrayOfObject[1] = Integer.valueOf(localCalendar.get(5));
    return localContext.getString(i1, arrayOfObject);
  }

  public static String I(String paramString)
  {
    while (true)
    {
      int i1;
      try
      {
        byte[] arrayOfByte = MessageDigest.getInstance("SHA-1").digest(paramString.getBytes());
        String str1 = "";
        i1 = 0;
        if (i1 >= arrayOfByte.length)
          continue;
        String str3 = Integer.toHexString(0xFF & arrayOfByte[i1]);
        if (str3.length() != 1)
          continue;
        str1 = str1 + "0" + str3;
        break label114;
        str1 = str1 + str3;
        break label114;
        String str2 = str1.toLowerCase();
        return str2;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        return null;
      }
      label114: i1++;
    }
  }

  public static LauncherSuggestions J()
  {
    try
    {
      com.wandoujia.launcher.d.a.d locald = new com.wandoujia.launcher.d.a.d();
      com.wandoujia.launcher.d.b.b localb = ((com.wandoujia.launcher.d.b.b)locald.getRequestBuilder()).a();
      com.wandoujia.launcher.launcher.b.c localc = com.wandoujia.launcher.launcher.b.c.a();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localc.b().iterator();
      while (localIterator.hasNext())
      {
        SimpleAppInfo localSimpleAppInfo = (SimpleAppInfo)localIterator.next();
        if (TextUtils.isEmpty(localSimpleAppInfo.getPackageName()))
          continue;
        localArrayList.add(localSimpleAppInfo.getPackageName());
      }
      localb.a(localArrayList);
      LauncherSuggestions localLauncherSuggestions = (LauncherSuggestions)com.wandoujia.launcher_base.b.a.d().execute(locald);
      return localLauncherSuggestions;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }

  public static String J(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return paramString;
    if ((paramString.startsWith("V")) || (paramString.startsWith("v")))
      paramString = paramString.substring(1);
    return "v" + paramString;
  }

  public static PackageInfo K(String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = X().getPackageInfo(paramString, 0);
      return localPackageInfo;
    }
    catch (RuntimeException localRuntimeException)
    {
      return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  public static void K()
  {
    String str1 = com.wandoujia.launcher.e.a.a(GlobalConfig.getAppContext(), LauncherConfig.LauncherType.APK_GL);
    String str2 = com.wandoujia.launcher.e.a.a(GlobalConfig.getAppContext(), LauncherConfig.LauncherType.NATIVE_GL);
    boolean bool1 = a(GlobalConfig.getAppContext(), str1, false);
    boolean bool2 = a(GlobalConfig.getAppContext(), str2, false);
    if ((bool1) && (bool2) && (!TextUtils.equals(str1, str2)))
    {
      if (LauncherConfig.b() != LauncherConfig.LauncherType.APK_GL)
        break label69;
      com.wandoujia.launcher_base.utils.f.b(str2);
    }
    label69: 
    do
      return;
    while (LauncherConfig.b() != LauncherConfig.LauncherType.NATIVE_GL);
    if (((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).h("com.wandoujia.game_launcher"))
    {
      com.wandoujia.launcher_base.utils.f.b(str2);
      return;
    }
    com.wandoujia.launcher_base.utils.f.b(str1);
  }

  public static com.wandoujia.launcher_base.app_usage_stats.a.a L()
  {
    if (Build.VERSION.SDK_INT >= 21)
      return W();
    return V();
  }

  public static String L(String paramString)
  {
    PackageInfo localPackageInfo = Y(paramString);
    if (localPackageInfo != null)
      try
      {
        String str = (String)localPackageInfo.applicationInfo.loadLabel(o);
        return str;
      }
      catch (Exception localException)
      {
      }
    return "";
  }

  public static GameLauncherPackage M()
  {
    return k;
  }

  public static String M(String paramString)
  {
    PackageInfo localPackageInfo = Y(paramString);
    if (localPackageInfo != null)
      try
      {
        String str = localPackageInfo.applicationInfo.packageName;
        return str;
      }
      catch (Exception localException)
      {
      }
    return "";
  }

  public static DataApi N()
  {
    monitorenter;
    try
    {
      Object localObject2;
      if (l == null)
      {
        if (!SystemUtil.isExternalSDCardMounted())
          break label99;
        File localFile = SystemUtil.getDeviceExternalCacheDir();
        if (localFile == null)
          break label70;
        localObject2 = localFile.getAbsolutePath() + "/DataCache";
      }
      while (true)
      {
        l = new com.wandoujia.online_config.a((String)localObject2);
        DataApi localDataApi = l;
        return localDataApi;
        label70: localObject2 = GlobalConfig.getAppContext().getCacheDir() + "/DataCache";
        continue;
        label99: String str = GlobalConfig.getAppContext().getCacheDir() + "/DataCache";
        localObject2 = str;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  public static void N(String paramString)
  {
    p.edit().putString("key_last_ignore_update_version", paramString).apply();
  }

  public static de.greenrobot.event.c O()
  {
    monitorenter;
    try
    {
      if (m == null)
        m = new de.greenrobot.event.c();
      de.greenrobot.event.c localc = m;
      return localc;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void O(String paramString)
  {
    p.edit().putString("last_selfupdate_result", paramString).apply();
  }

  public static long P()
  {
    return p.getLong("key_first_check_update_date", -1L);
  }

  public static String P(String paramString)
  {
    return p.getString(paramString, "");
  }

  public static long Q(String paramString)
  {
    return p.getLong(paramString, 0L);
  }

  public static String Q()
  {
    return p.getString("key_last_ignore_update_version", "");
  }

  private static int R(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      int i1;
      for (int i2 = 0; ; i2 = i1)
      {
        return i2;
        i1 = paramString.hashCode();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static long R()
  {
    return p.getLong("key_last_ignore_update_time", -1L);
  }

  public static String S()
  {
    return p.getString("last_selfupdate_result", "");
  }

  // ERROR //
  private static String S(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 701
    //   4: invokevirtual 704	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   7: istore_2
    //   8: iload_2
    //   9: ifle +57 -> 66
    //   12: iload_2
    //   13: ldc_w 701
    //   16: invokevirtual 492	java/lang/String:length	()I
    //   19: iadd
    //   20: istore_3
    //   21: aload_0
    //   22: iload_3
    //   23: iload_3
    //   24: iconst_1
    //   25: iadd
    //   26: invokevirtual 707	java/lang/String:substring	(II)Ljava/lang/String;
    //   29: astore 4
    //   31: aload 4
    //   33: ldc_w 709
    //   36: invokevirtual 712	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   39: ifne +16 -> 55
    //   42: invokestatic 717	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   45: pop
    //   46: aload 4
    //   48: invokestatic 720	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   51: invokevirtual 723	java/lang/Integer:intValue	()I
    //   54: pop
    //   55: aload_0
    //   56: iconst_0
    //   57: iload_2
    //   58: invokevirtual 707	java/lang/String:substring	(II)Ljava/lang/String;
    //   61: astore 6
    //   63: aload 6
    //   65: astore_0
    //   66: aload_0
    //   67: areturn
    //   68: astore_1
    //   69: aload_0
    //   70: areturn
    //   71: astore 5
    //   73: goto -18 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	68	java/lang/Exception
    //   12	31	68	java/lang/Exception
    //   55	63	68	java/lang/Exception
    //   31	55	71	java/lang/Exception
  }

  private static com.wandoujia.launcher.c.a T()
  {
    monitorenter;
    try
    {
      if (h == null)
        h = new com.wandoujia.launcher.c.a(com.wandoujia.launcher_base.b.a.d());
      com.wandoujia.launcher.c.a locala = h;
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static String T(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    if (i1 < paramString.length())
    {
      char c1 = paramString.charAt(i1);
      if (i1 == 0)
        localStringBuffer.append(Character.toLowerCase(c1));
      while (true)
      {
        i1++;
        break;
        if (Character.isUpperCase(c1))
        {
          localStringBuffer.append('_').append(Character.toLowerCase(c1));
          continue;
        }
        localStringBuffer.append(c1);
      }
    }
    return localStringBuffer.toString();
  }

  private static SharedPreferences U()
  {
    if (j == null)
      j = GlobalConfig.getAppContext().getSharedPreferences("launcher-disk-pref", 0);
    return j;
  }

  private static String U(String paramString)
  {
    int i1 = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i1);
    int i2 = 0;
    if (i2 < i1)
    {
      char c1 = paramString.charAt(i2);
      if ((c1 >= ' ') && (c1 <= '~') && (c1 != '"') && (c1 != '\''))
        localStringBuilder.append(c1);
      while (true)
      {
        i2++;
        break;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(c1);
        localStringBuilder.append(String.format("\\u%04x", arrayOfObject));
      }
    }
    return localStringBuilder.toString();
  }

  private static Bundle V(String paramString)
  {
    int i1 = 0;
    Bundle localBundle = new Bundle();
    String[] arrayOfString1;
    int i2;
    if (paramString != null)
    {
      arrayOfString1 = paramString.split("&");
      i2 = arrayOfString1.length;
    }
    while (true)
    {
      if (i1 >= i2)
        return localBundle;
      String[] arrayOfString2 = arrayOfString1[i1].split("=");
      try
      {
        localBundle.putString(URLDecoder.decode(arrayOfString2[0], "UTF-8"), URLDecoder.decode(arrayOfString2[1], "UTF-8"));
        label69: i1++;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label69;
      }
    }
  }

  private static com.wandoujia.launcher_base.app_usage_stats.a.a V()
  {
    try
    {
      List localList = ((ActivityManager)GlobalConfig.getAppContext().getSystemService("activity")).getRecentTasks(1, 0);
      if (CollectionUtils.isEmpty(localList))
        return null;
      com.wandoujia.launcher_base.app_usage_stats.a.a locala = new com.wandoujia.launcher_base.app_usage_stats.a.a(((ActivityManager.RecentTaskInfo)localList.get(0)).baseIntent.getComponent().getPackageName());
      return locala;
    }
    catch (AssertionError localAssertionError)
    {
      return null;
    }
    catch (RuntimeException localRuntimeException)
    {
      break label59;
    }
    catch (SecurityException localSecurityException)
    {
      label59: break label59;
    }
  }

  @TargetApi(21)
  private static com.wandoujia.launcher_base.app_usage_stats.a.a W()
  {
    while (true)
    {
      try
      {
        Object localObject1 = GlobalConfig.getAppContext().getSystemService("usagestats");
        long l1 = System.currentTimeMillis();
        l2 = l1 - 5000L;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(0);
        arrayOfObject[1] = Long.valueOf(l2);
        arrayOfObject[2] = Long.valueOf(l1);
        List localList = (List)JavaCalls.callMethodOrThrow(localObject1, "queryUsageStats", arrayOfObject);
        if ((localList != null) && (!localList.isEmpty()))
        {
          Iterator localIterator = localList.iterator();
          localObject2 = null;
          if (!localIterator.hasNext())
            continue;
          Object localObject3 = localIterator.next();
          Long localLong = (Long)JavaCalls.callMethodOrThrow(localObject3, "getLastTimeUsed", new Object[0]);
          if (localLong.longValue() < l2)
            break label189;
          l4 = localLong.longValue();
          localObject4 = localObject3;
          break label201;
          if (localObject2 != null)
          {
            com.wandoujia.launcher_base.app_usage_stats.a.a locala = new com.wandoujia.launcher_base.app_usage_stats.a.a((String)JavaCalls.callMethodOrThrow(localObject2, "getPackageName", new Object[0]));
            return locala;
          }
        }
      }
      catch (Exception localException)
      {
      }
      return null;
      label189: long l3 = l2;
      Object localObject4 = localObject2;
      long l4 = l3;
      label201: long l5 = l4;
      Object localObject2 = localObject4;
      long l2 = l5;
    }
  }

  private static String W(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return paramString;
    try
    {
      new URL(paramString);
      return paramString.replaceAll("\\|", "%7C");
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return "";
  }

  private static PackageManager X()
  {
    if (o == null)
      o = com.wandoujia.ripple_framework.i.k().g().getPackageManager();
    return o;
  }

  private static void X(String paramString)
  {
    if (j(GlobalConfig.getAppContext(), paramString))
      GlobalConfig.getAppContext().deleteFile(paramString);
  }

  private static PackageInfo Y(String paramString)
  {
    PackageInfo localPackageInfo = X().getPackageArchiveInfo(paramString, 0);
    if ((localPackageInfo != null) && (localPackageInfo.applicationInfo != null))
    {
      localPackageInfo.applicationInfo.sourceDir = paramString;
      localPackageInfo.applicationInfo.publicSourceDir = paramString;
      return localPackageInfo;
    }
    return null;
  }

  public static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = paramFloat1 - paramFloat3;
    float f2 = paramFloat2 - paramFloat4;
    return (float)Math.sqrt(f1 * f1 + f2 * f2);
  }

  public static float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt1 - paramInt3;
    int i2 = paramInt2 - paramInt4;
    return (float)Math.sqrt(i1 * i1 + i2 * i2);
  }

  public static int a(float paramFloat)
  {
    float f1;
    if (paramFloat < 0.0F)
      f1 = -0.5F;
    while (true)
    {
      return (int)(f1 + paramFloat);
      f1 = 0.5F;
    }
  }

  public static int a(float paramFloat, Context paramContext)
  {
    return (int)(0.5F + paramFloat * paramContext.getResources().getDisplayMetrics().density);
  }

  public static int a(int paramInt1, int paramInt2)
  {
    int i1 = Color.alpha(paramInt2);
    int i2 = Color.alpha(paramInt1);
    int i3 = 255 - (255 - i1) * (255 - i2) / 255;
    return Color.argb(i3, a(Color.red(paramInt1), i2, Color.red(paramInt2), i1, i3), a(Color.green(paramInt1), i2, Color.green(paramInt2), i1, i3), a(Color.blue(paramInt1), i2, Color.blue(paramInt2), i1, i3));
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0)
      return 0;
    return (paramInt2 * (paramInt1 * 255) + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255);
  }

  public static int a(Context paramContext, float paramFloat)
  {
    return (int)(0.5F + paramFloat * paramContext.getResources().getDisplayMetrics().density);
  }

  public static int a(Parcel paramParcel)
  {
    int i1 = paramParcel.readInt();
    int i2 = a(paramParcel, i1);
    int i3 = paramParcel.dataPosition();
    if ((0xFFFF & i1) != 20293)
      throw new zza.zza("Expected object header. Got 0x" + Integer.toHexString(i1), paramParcel);
    int i4 = i3 + i2;
    if ((i4 < i3) || (i4 > paramParcel.dataSize()))
      throw new zza.zza("Size read is invalid start=" + i3 + " end=" + i4, paramParcel);
    return i4;
  }

  public static int a(Parcel paramParcel, int paramInt)
  {
    if ((paramInt & 0xFFFF0000) != -65536)
      return 0xFFFF & paramInt >> 16;
    return paramParcel.readInt();
  }

  public static int a(GridView paramGridView)
  {
    try
    {
      Field localField = GridView.class.getDeclaredField("mColumnWidth");
      localField.setAccessible(true);
      int i1 = localField.getInt(paramGridView);
      return i1;
    }
    catch (Exception localException)
    {
      Log.d("ugc", "unable to get ColumnWidth", new Object[0]);
    }
    return i.a(80.0F, com.wandoujia.p4.a.a());
  }

  public static int a(com.unionpay.uppay.b paramb, JSONObject paramJSONObject)
  {
    paramb.o = com.unionpay.mpay.utils.e.c(paramJSONObject, "rules");
    paramb.s = com.unionpay.mpay.utils.e.c(paramJSONObject, "entrust_rules");
    paramb.t = com.unionpay.mpay.utils.e.a(paramJSONObject, "pre_cmd");
    paramb.p = com.unionpay.mpay.utils.e.a(paramJSONObject, "title");
    paramb.r = com.unionpay.mpay.utils.e.b(paramJSONObject, "rules_button");
    paramb.U = com.unionpay.mpay.utils.e.b(paramJSONObject, "service_checkbox");
    paramb.V = com.unionpay.mpay.utils.e.b(paramJSONObject, "bind_card_checkbox");
    paramb.T = com.unionpay.mpay.utils.e.a(paramJSONObject, "timeout_msg");
    paramb.g = new HashMap();
    JSONObject localJSONObject = com.unionpay.mpay.utils.e.b(paramJSONObject, "f55");
    String str1 = com.unionpay.mpay.utils.e.a(localJSONObject, "order_amount");
    HashMap localHashMap1 = paramb.g;
    String str2;
    label170: String str3;
    label209: String str4;
    HashMap localHashMap4;
    if ((str1 != null) && (str1.length() > 0))
    {
      localHashMap1.put("trans_amt", str1);
      str2 = com.unionpay.mpay.utils.e.a(localJSONObject, "order_currency");
      HashMap localHashMap2 = paramb.g;
      if ((str2 == null) || (str2.length() <= 0))
        break label343;
      localHashMap2.put("trans currcy code", str2);
      str3 = com.unionpay.mpay.utils.e.a(localJSONObject, "trans_type");
      HashMap localHashMap3 = paramb.g;
      if ((str3 == null) || (str3.length() <= 0))
        break label351;
      localHashMap3.put("trans_type", str3);
      str4 = com.unionpay.mpay.utils.e.a(localJSONObject, "mer_name");
      localHashMap4 = paramb.g;
      if ((str4 == null) || (str4.length() <= 0))
        break label359;
    }
    while (true)
    {
      localHashMap4.put("mer_name", str4);
      paramb.aa = com.unionpay.mpay.utils.e.a(paramJSONObject, "pan");
      String str5 = com.unionpay.mpay.utils.e.a(paramJSONObject, "fail_continue");
      if ((str5 != null) && (str5.equalsIgnoreCase("0")))
        paramb.u = true;
      if (((paramb.o != null) && (paramb.o.length() > 0)) || ((paramb.s != null) && (paramb.s.length() > 0)))
        break label367;
      return 2;
      str1 = "000000000000";
      break;
      label343: str2 = "0156";
      break label170;
      label351: str3 = "00";
      break label209;
      label359: str4 = "";
    }
    label367: return 0;
  }

  public static int a(com.unionpay.uppay.b paramb, JSONObject paramJSONObject, boolean paramBoolean)
  {
    if (!paramBoolean)
      paramb.v = paramJSONObject;
    return a(paramb, paramJSONObject);
  }

  public static int a(com.wandoujia.nirvana.framework.network.page.a parama, Model paramModel)
  {
    int i1 = -1;
    if ((parama != null) && (!CollectionUtils.isEmpty(parama.c())))
      i1 = parama.c().indexOf(paramModel);
    return i1;
  }

  public static int a(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    int i1 = paramArrayOfInt.length;
    int i2 = paramArrayOfInt.length;
    int i3 = 0;
    int i17;
    for (int i4 = 0; i3 < i2; i4 = i17)
    {
      i17 = i4 + paramArrayOfInt[i3];
      i3++;
    }
    int i5 = 0;
    int i6 = 0;
    int i7 = i4;
    int i8 = 0;
    while (i5 < i1 - 1)
    {
      int i9 = i8 | 1 << i5;
      int i10 = i6;
      int i11 = i9;
      int i12 = 1;
      if (i12 < paramArrayOfInt[i5])
      {
        int i14 = c(-1 + (i7 - i12), -2 + (i1 - i5));
        if ((paramBoolean) && (i11 == 0) && (i7 - i12 - (-1 + (i1 - i5)) >= -1 + (i1 - i5)))
          i14 -= c(i7 - i12 - (i1 - i5), -2 + (i1 - i5));
        if (-1 + (i1 - i5) > 1)
        {
          int i15 = i7 - i12 - (-2 + (i1 - i5));
          int i16 = 0;
          while (i15 > paramInt)
          {
            i16 += c(-1 + (i7 - i12 - i15), -3 + (i1 - i5));
            i15--;
          }
          i14 -= i16 * (i1 - 1 - i5);
        }
        while (true)
        {
          i10 += i14;
          i12++;
          i11 &= (0xFFFFFFFF ^ 1 << i5);
          break;
          if (i7 - i12 <= paramInt)
            continue;
          i14--;
        }
      }
      int i13 = i7 - i12;
      i5++;
      i7 = i13;
      i8 = i11;
      i6 = i10;
    }
    return i6;
  }

  public static Dialog a(Context paramContext, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    localBuilder.setTitle(paramBundle.getString("de.greenrobot.eventbus.errordialog.title"));
    localBuilder.setMessage(paramBundle.getString("de.greenrobot.eventbus.errordialog.message"));
    localBuilder.setPositiveButton(17039370, paramOnClickListener);
    return localBuilder.create();
  }

  private static SharedElementCallback a(b paramb)
  {
    c localc = null;
    if (paramb != null)
      localc = new c(paramb);
    return localc;
  }

  public static Intent a(PushEntityV1.Intent paramIntent)
  {
    if (paramIntent == null)
      return new Intent();
    Intent localIntent = new Intent();
    try
    {
      if (!TextUtils.isEmpty(paramIntent.getComponent()))
        localIntent.setComponent(ComponentName.unflattenFromString(paramIntent.getComponent()));
      localIntent.setAction(paramIntent.getAction());
      if (!TextUtils.isEmpty(paramIntent.getCategory()))
        localIntent.addCategory(paramIntent.getCategory());
      if (!TextUtils.isEmpty(paramIntent.getData()));
      for (Uri localUri = Uri.parse(paramIntent.getData()); ; localUri = null)
      {
        boolean bool = TextUtils.isEmpty(paramIntent.getType());
        String str1 = null;
        if (!bool)
          str1 = paramIntent.getType();
        Iterator localIterator;
        if ((localUri != null) && (str1 != null))
        {
          localIntent.setDataAndType(localUri, str1);
          if (paramIntent.getExtras() != null)
            localIterator = paramIntent.getExtras().iterator();
        }
        else
        {
          while (true)
          {
            label149: if (!localIterator.hasNext())
              break label384;
            PushEntityV1.Intent.Extra localExtra = (PushEntityV1.Intent.Extra)localIterator.next();
            if (localExtra.getType() == null);
            for (String str2 = "string"; ; str2 = localExtra.getType().toLowerCase())
            {
              if (!"string".equals(str2))
                break label256;
              localIntent.putExtra(localExtra.getKey(), localExtra.getValue());
              break label149;
              if (localUri != null)
              {
                localIntent.setData(localUri);
                break;
              }
              if (str1 == null)
                break;
              localIntent.setType(str1);
              break;
            }
            label256: if ("int".equals(str2))
            {
              localIntent.putExtra(localExtra.getKey(), Integer.valueOf(localExtra.getValue()));
              continue;
            }
            if ("double".equals(str2))
            {
              localIntent.putExtra(localExtra.getKey(), Double.valueOf(localExtra.getValue()));
              continue;
            }
            if ("boolean".equals(str2))
            {
              localIntent.putExtra(localExtra.getKey(), Boolean.valueOf(localExtra.getValue()));
              continue;
            }
            if (!"long".equals(str2))
              continue;
            localIntent.putExtra(localExtra.getKey(), Long.parseLong(localExtra.getValue()));
          }
        }
        label384: return localIntent;
      }
    }
    catch (Exception localException)
    {
    }
    return localIntent;
  }

  public static Bitmap a(Context paramContext, List<Drawable> paramList, int paramInt1, int paramInt2)
  {
    if (CollectionUtils.isEmpty(paramList))
      return d(paramContext, paramInt1);
    Iterator localIterator = paramList.iterator();
    do
      if (!localIterator.hasNext())
        break;
    while ((Drawable)localIterator.next() == null);
    for (int i1 = 1; ; i1 = 0)
    {
      if (i1 == 0)
        return d(paramContext, paramInt1);
      Bitmap localBitmap = d(paramContext, paramInt2);
      if (localBitmap == null)
        return d(paramContext, paramInt1);
      Canvas localCanvas = new Canvas(localBitmap);
      int i2 = localBitmap.getWidth();
      int i3 = localBitmap.getHeight();
      int i4 = a(6.0F, paramContext);
      int i5 = a(3.0F, paramContext);
      int i6 = (i2 - i4 * 2 - i5 * 1) / 2;
      int i7 = (i3 - i4 * 2 - i5 * 1) / 2;
      for (int i8 = 0; i8 < paramList.size(); i8++)
      {
        Drawable localDrawable = (Drawable)paramList.get(i8);
        if (localDrawable == null)
          continue;
        int i9 = i8 / 2;
        int i10 = i4 + i8 % 2 * (i5 + i6);
        int i11 = i4 + i9 * (i5 + i7);
        localDrawable.setBounds(new Rect(i10, i11, i10 + i6, i11 + i7));
        localDrawable.draw(localCanvas);
      }
      return localBitmap;
    }
  }

  public static Bundle a(WXMediaMessage paramWXMediaMessage)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("_wxobject_sdkVer", paramWXMediaMessage.sdkVer);
    localBundle.putString("_wxobject_title", paramWXMediaMessage.title);
    localBundle.putString("_wxobject_description", paramWXMediaMessage.description);
    localBundle.putByteArray("_wxobject_thumbdata", paramWXMediaMessage.thumbData);
    if (paramWXMediaMessage.mediaObject != null)
    {
      localBundle.putString("_wxobject_identifier_", paramWXMediaMessage.mediaObject.getClass().getName());
      paramWXMediaMessage.mediaObject.serialize(localBundle);
    }
    return localBundle;
  }

  public static <T extends Parcelable> T a(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    Parcelable localParcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i1 + i2);
    return localParcelable;
  }

  public static View a(Context paramContext, int paramInt)
  {
    return LayoutInflater.from(paramContext).inflate(paramInt, null);
  }

  public static View a(Context paramContext, com.wandoujia.morph.engine.i parami, ViewGroup paramViewGroup, MoWidgetType paramMoWidgetType)
  {
    if (parami == null)
      paramViewGroup = null;
    View localView;
    do
    {
      do
      {
        return paramViewGroup;
        localView = com.wandoujia.morph.a.a().c().a(paramContext, parami.a(), parami);
      }
      while (localView == null);
      int i1 = parami.b();
      for (int i2 = 0; i2 < i1; i2++)
        a(paramContext, parami.a(i2), (ViewGroup)localView, parami.a());
      if (paramViewGroup == null)
        continue;
      paramViewGroup.addView(localView, r.a(paramMoWidgetType, parami));
    }
    while (paramViewGroup != null);
    return localView;
  }

  public static View a(ViewPager paramViewPager)
  {
    at localat = paramViewPager.getAdapter();
    if ((localat != null) && ((localat instanceof ai)))
    {
      Fragment localFragment = ((ai)localat).e(paramViewPager.getCurrentItem());
      if (localFragment == null)
        return null;
      return localFragment.getView();
    }
    int i1 = paramViewPager.getScrollX();
    int i2 = i1 + paramViewPager.getWidth();
    for (int i3 = 0; i3 < paramViewPager.getChildCount(); i3++)
    {
      View localView = paramViewPager.getChildAt(i3);
      int i4 = localView.getLeft();
      int i5 = localView.getRight();
      if ((i4 >= i1) && (i5 <= i2))
        return localView;
    }
    return null;
  }

  public static <T extends View> T a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(paramInt, paramViewGroup, false);
    com.wandoujia.nirvana.framework.ui.c.b.a(localView, paramInt);
    return localView;
  }

  @TargetApi(16)
  public static AccessibilityNodeInfo a(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    Iterator localIterator = paramAccessibilityNodeInfo.findAccessibilityNodeInfosByText(paramString).iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = (AccessibilityNodeInfo)localIterator.next();
      CharSequence localCharSequence = localAccessibilityNodeInfo.getText();
      if ((!TextUtils.isEmpty(localCharSequence)) && (localCharSequence.toString().equals(paramString)))
      {
        localObject = localAccessibilityNodeInfo;
        continue;
      }
      localAccessibilityNodeInfo.recycle();
    }
    return localObject;
  }

  public static LinearLayout a(Context paramContext, JSONArray paramJSONArray, int paramInt1, int paramInt2)
  {
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    new LinearLayout.LayoutParams(-1, -2).topMargin = com.unionpay.mpay.a.a.c;
    JSONObject localJSONObject = null;
    while (true)
    {
      if ((paramInt1 < paramInt2) && (paramInt1 < paramJSONArray.length()));
      try
      {
        localJSONObject = paramJSONArray.getJSONObject(paramInt1);
        if ((localJSONObject != null) && (localJSONObject.get("label") != "") && (!localJSONObject.get("label").toString().contains(":")))
          localJSONObject.put("label", localJSONObject.get("label") + ":");
        label130: localLinearLayout.addView(new com.unionpay.mpay.widgets.q(paramContext, com.unionpay.mpay.a.a.B, localJSONObject));
        paramInt1++;
        continue;
        return localLinearLayout;
      }
      catch (JSONException localJSONException)
      {
        break label130;
      }
    }
  }

  public static com.android.volley.i a(Context paramContext, com.android.volley.toolbox.g paramg)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    try
    {
      String str = paramContext.getPackageName();
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(str, 0);
      new StringBuilder().append(str).append("/").append(localPackageInfo.versionCode);
      label60: com.android.volley.toolbox.a locala = new com.android.volley.toolbox.a(paramg);
      com.android.volley.i locali = new com.android.volley.i(new com.android.volley.toolbox.d(localFile), locala);
      locali.a();
      return locali;
    }
    catch (RuntimeException localRuntimeException)
    {
      break label60;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label60;
    }
  }

  public static ObjectAnimator a(Object paramObject, float paramFloat1, float paramFloat2)
  {
    return ObjectAnimator.ofFloat(paramObject, "alpha", new float[] { paramFloat1, paramFloat2 });
  }

  public static WXMediaMessage a(Bundle paramBundle)
  {
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.sdkVer = paramBundle.getInt("_wxobject_sdkVer");
    localWXMediaMessage.title = paramBundle.getString("_wxobject_title");
    localWXMediaMessage.description = paramBundle.getString("_wxobject_description");
    localWXMediaMessage.thumbData = paramBundle.getByteArray("_wxobject_thumbdata");
    String str = paramBundle.getString("_wxobject_identifier_");
    if ((str == null) || (str.length() <= 0))
      return localWXMediaMessage;
    try
    {
      localWXMediaMessage.mediaObject = ((com.tencent.mm.sdk.openapi.l)Class.forName(str).newInstance());
      localWXMediaMessage.mediaObject.unserialize(paramBundle);
      return localWXMediaMessage;
    }
    catch (Exception localException)
    {
      new StringBuilder("get media object from bundle failed: unknown ident ").append(str);
      com.tencent.mm.sdk.platformtools.b.a("MicroMsg.SDK.WXMediaMessage");
    }
    return localWXMediaMessage;
  }

  @TargetApi(16)
  public static com.wandoujia.accessibility.autoinstall.b a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (paramAccessibilityNodeInfo.getPackageName() == null)
      throw new NullPointerException();
    if (e != null)
      return e;
    if (SystemUtil.isMIUI())
      e = new com.wandoujia.accessibility.autoinstall.a.e();
    while (true)
    {
      return e;
      if (SystemUtil.isFlymeOs())
      {
        e = new com.wandoujia.accessibility.autoinstall.a.b();
        continue;
      }
      if (paramAccessibilityNodeInfo.getPackageName().equals("com.lenovo.safecenter"))
      {
        e = new com.wandoujia.accessibility.autoinstall.a.c();
        continue;
      }
      if (paramAccessibilityNodeInfo.getPackageName().equals("com.lenovo.security"))
      {
        e = new com.wandoujia.accessibility.autoinstall.a.d();
        continue;
      }
      e = new com.wandoujia.accessibility.autoinstall.a.a();
    }
  }

  public static LocalAppInfo.UpgradeInfo a(Model paramModel)
  {
    String str = paramModel.F().package_name;
    if (TextUtils.isEmpty(str))
      return null;
    LocalAppInfo localLocalAppInfo = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).f(str);
    if (localLocalAppInfo != null)
      return localLocalAppInfo.getUpgradeInfo();
    return null;
  }

  public static LaunchLogger a(com.wandoujia.nirvana.framework.network.a.a parama)
  {
    long l1 = 0L;
    long l2 = System.currentTimeMillis();
    Map localMap = parama.b;
    String str1 = (String)localMap.get("Date");
    long l3;
    if (str1 != null)
      l3 = j(str1);
    while (true)
    {
      String str2 = (String)localMap.get("Cache-Control");
      int i2;
      long l6;
      String str5;
      if (str2 != null)
      {
        String[] arrayOfString = str2.split(",");
        i2 = 0;
        l6 = l1;
        if (i2 < arrayOfString.length)
        {
          str5 = arrayOfString[i2].trim();
          if ((str5.equals("no-cache")) || (str5.equals("no-store")))
            return null;
          if (!str5.startsWith("max-age="));
        }
      }
      while (true)
      {
        try
        {
          long l7 = Long.parseLong(str5.substring(8));
          l6 = l7;
          i2++;
          break;
          if ((!str5.equals("must-revalidate")) && (!str5.equals("proxy-revalidate")))
            continue;
          l6 = l1;
          continue;
          l4 = l6;
          i1 = 1;
          String str3 = (String)localMap.get("Expires");
          if (str3 == null)
            continue;
          l5 = j(str3);
          String str4 = (String)localMap.get("ETag");
          if (i1 == 0)
            continue;
          l1 = l2 + 1000L * l4;
          LaunchLogger localLaunchLogger = new LaunchLogger();
          localLaunchLogger.a = parama.a;
          localLaunchLogger.b = str4;
          localLaunchLogger.e = l1;
          localLaunchLogger.d = localLaunchLogger.e;
          localLaunchLogger.c = l3;
          localLaunchLogger.f = localMap;
          return localLaunchLogger;
          if ((l3 <= l1) || (l5 < l3))
            continue;
          l1 = l2 + (l5 - l3);
          continue;
        }
        catch (Exception localException)
        {
          continue;
          long l5 = l1;
          continue;
        }
        long l4 = l1;
        int i1 = 0;
      }
      l3 = l1;
    }
  }

  public static ViewLogPackage a(String paramString1, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString2)
  {
    ViewLogPackage.Builder localBuilder = new ViewLogPackage.Builder();
    localBuilder.module(paramString1).element(paramElement).action(paramAction).name(paramString2);
    return localBuilder.build();
  }

  public static com.wandoujia.p4.app.button.model.a a(IAppLiteInfo paramIAppLiteInfo)
  {
    return new com.wandoujia.p4.app.button.model.b(paramIAppLiteInfo);
  }

  public static CharSequence a(Context paramContext, AppDetail paramAppDetail)
  {
    String str1 = paramAppDetail.installed_count_str;
    String str2 = a(paramAppDetail);
    if ((TextUtils.isEmpty(str1)) || ("0".equals(str2)))
      return "";
    return String.format(paramContext.getString(com.wandoujia.ripple_framework.R.string.app_detail_meta_others), new Object[] { str1, str2 });
  }

  private static IllegalStateException a(String paramString, UnsupportedEncodingException paramUnsupportedEncodingException)
  {
    return new IllegalStateException(paramString + ": " + paramUnsupportedEncodingException);
  }

  public static Object a(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
      try
      {
        com.tencent.mm.sdk.platformtools.b.a("MicroMsg.SDK.PluginProvider.Resolver");
        break label77;
        return Integer.valueOf(paramString);
        return Long.valueOf(paramString);
        return Boolean.valueOf(paramString);
        return Float.valueOf(paramString);
        Double localDouble = Double.valueOf(paramString);
        return localDouble;
      }
      catch (Exception localException)
      {
        label77: paramString = null;
      }
    case 3:
    }
    return paramString;
  }

  public static Object a(Object paramObject)
  {
    if (paramObject != null)
      paramObject = ((Transition)paramObject).clone();
    return paramObject;
  }

  public static Object a(Object paramObject, View paramView1, ArrayList<View> paramArrayList, Map<String, View> paramMap, View paramView2)
  {
    if (paramObject != null)
    {
      b(paramArrayList, paramView1);
      if (paramMap != null)
        paramArrayList.removeAll(paramMap.values());
      if (paramArrayList.isEmpty())
        paramObject = null;
    }
    else
    {
      return paramObject;
    }
    paramArrayList.add(paramView2);
    b((Transition)paramObject, paramArrayList);
    return paramObject;
  }

  public static String a(int paramInt, String paramString1, String paramString2)
  {
    return "resultStatus={" + paramInt + "};memo={" + paramString1 + "};result={" + paramString2 + "}";
  }

  public static String a(long paramLong)
  {
    Context localContext = com.wandoujia.p4.a.a();
    long l1 = System.currentTimeMillis();
    if (paramLong - l1 > 0L)
    {
      if (a(l1, paramLong))
        return new SimpleDateFormat("MM月dd日").format(Long.valueOf(paramLong));
      return new SimpleDateFormat("yyyy年MM月dd日").format(Long.valueOf(paramLong));
    }
    if (!a(l1, paramLong))
      return new SimpleDateFormat("yyyy年MM月dd日").format(Long.valueOf(paramLong));
    long l2 = l1 - paramLong;
    Log.d("ugc", l1 + " " + paramLong + " " + l2, new Object[0]);
    if (l2 < 5000L)
    {
      int i2 = (int)(l2 / 1000L);
      if (i2 == 0)
        return localContext.getString(2131625091);
      String str7 = localContext.getString(2131625357);
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = Integer.valueOf(i2);
      return String.format(str7, arrayOfObject7);
    }
    if (l2 < 10000L)
    {
      String str6 = localContext.getString(2131625357);
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = Integer.valueOf(5);
      return String.format(str6, arrayOfObject6);
    }
    if (l2 < 60000L)
    {
      int i1 = 10 * (int)(l2 / 10000L);
      String str5 = localContext.getString(2131625357);
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf(i1);
      return String.format(str5, arrayOfObject5);
    }
    if (l2 < 3600000L)
    {
      String str4 = localContext.getString(2131625076);
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf((int)(l2 / 60000L));
      return String.format(str4, arrayOfObject4);
    }
    if (l2 < 4200000L)
    {
      String str3 = localContext.getString(2131624935);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(1);
      return String.format(str3, arrayOfObject3);
    }
    if (b(l1, paramLong) == 0)
    {
      SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("HH:mm");
      String str1 = localContext.getString(2131625521);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localSimpleDateFormat1.format(Long.valueOf(paramLong));
      return String.format(str1, arrayOfObject1);
    }
    if (b(l1, paramLong) == 1)
    {
      SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("HH:mm");
      String str2 = localContext.getString(2131625776);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localSimpleDateFormat2.format(Long.valueOf(paramLong));
      return String.format(str2, arrayOfObject2);
    }
    return new SimpleDateFormat("MM月dd日").format(Long.valueOf(paramLong));
  }

  public static String a(Context paramContext, int paramInt, String paramString)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default:
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
    case 1:
      int i2;
      int i3;
      if (localResources != null)
        if ((0xF & localResources.getConfiguration().screenLayout) > 3)
        {
          i2 = 1;
          if ((!p(11)) || (i2 == 0))
          {
            Configuration localConfiguration = localResources.getConfiguration();
            if (!p(13))
              break label219;
            if (((0xF & localConfiguration.screenLayout) > 3) || (localConfiguration.smallestScreenWidthDp < 600))
              break label213;
            i3 = 1;
            if (i3 == 0)
              break label225;
          }
        }
      for (int i1 = 1; ; i1 = 0)
      {
        if (i1 == 0)
          break label231;
        return localResources.getString(com.google.android.gms.R.string.common_google_play_services_install_text_tablet, new Object[] { paramString });
        i2 = 0;
        break;
        i3 = 0;
        break label178;
        i3 = 0;
        break label178;
      }
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_install_text_phone, new Object[] { paramString });
    case 3:
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_enable_text, new Object[] { paramString });
    case 18:
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_updating_text, new Object[] { paramString });
    case 2:
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_update_text, new Object[] { paramString });
    case 42:
      return localResources.getString(com.google.android.gms.R.string.common_android_wear_update_text, new Object[] { paramString });
    case 9:
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_unsupported_text, new Object[] { paramString });
    case 7:
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_network_error_text);
    case 5:
      return localResources.getString(com.google.android.gms.R.string.common_google_play_services_invalid_account_text);
    case 16:
      label178: label213: label219: label225: label231: return localResources.getString(com.google.android.gms.R.string.common_google_play_services_api_unavailable_text, new Object[] { paramString });
    case 17:
    }
    return localResources.getString(com.google.android.gms.R.string.common_google_play_services_sign_in_failed_text);
  }

  public static String a(Context paramContext, Map<String, String> paramMap)
  {
    monitorenter;
    try
    {
      String str = new com.alipay.mobilesecuritysdk.deviceID.d(paramContext).a(paramMap);
      monitorexit;
      return str;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public static String a(Uri paramUri, ContentResolver paramContentResolver)
  {
    String[] arrayOfString = { "_data" };
    Cursor localCursor = paramContentResolver.query(paramUri, arrayOfString, null, null, null);
    if (localCursor != null)
      try
      {
        localCursor.moveToFirst();
        String str = localCursor.getString(localCursor.getColumnIndex(arrayOfString[0]));
        return str;
      }
      finally
      {
        localCursor.close();
      }
    return "";
  }

  public static <T extends com.google.android.gms.internal.aw> String a(T paramT)
  {
    if (paramT == null)
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      a(null, paramT, new StringBuffer(), localStringBuffer);
      return localStringBuffer.toString();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return "Error printing proto: " + localIllegalAccessException.getMessage();
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    return "Error printing proto: " + localInvocationTargetException.getMessage();
  }

  public static String a(AppDetail paramAppDetail)
  {
    if ((!CollectionUtils.isEmpty(paramAppDetail.extension_pack)) && (((ExtensionPack)paramAppDetail.extension_pack.get(0)).size != null))
      return String.valueOf(TextUtil.formatSizeInfo(((ExtensionPack)paramAppDetail.extension_pack.get(0)).size.longValue()));
    if ((!paramAppDetail.apk.isEmpty()) && (((ApkDetail)paramAppDetail.apk.get(0)).bytes_ != null))
      return String.valueOf(TextUtil.formatSizeInfo(((ApkDetail)paramAppDetail.apk.get(0)).bytes_.intValue()));
    return "0";
  }

  public static String a(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      StringBuffer localStringBuffer = new StringBuffer(2 * arrayOfByte.length);
      for (int i1 = 0; ; i1++)
      {
        if (i1 >= arrayOfByte.length)
          return localStringBuffer.toString();
        localStringBuffer.append(Character.forDigit((0xF0 & arrayOfByte[i1]) >> 4, 16));
        localStringBuffer.append(Character.forDigit(0xF & arrayOfByte[i1], 16));
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return "";
  }

  private static String a(String paramString, int paramInt)
  {
    if (paramInt <= 0)
    {
      com.google.android.gms.analytics.internal.f.a("index out of range for prefix", paramString);
      return "";
    }
    return paramString + paramInt;
  }

  public static String a(String paramString, Context paramContext, int paramInt1, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString));
    do
    {
      return paramString;
      if (paramString.startsWith("http://img.wdjimg.com/image/orion/"))
        return b(paramString, paramContext, paramInt1, paramInt2);
    }
    while (!paramString.startsWith("http://imgcdn.guoku.com/images/"));
    String str1 = paramString.substring(31);
    int i1 = str1.indexOf('/');
    if (i1 == -1);
    for (String str2 = "/" + str1; ; str2 = str1.substring(i1))
      return "http://imgcdn.guoku.com/images/" + Math.max(paramInt1, paramInt2) + str2;
  }

  public static String a(String paramString1, String paramString2)
  {
    return b(1, paramString1, paramString2);
  }

  public static String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("resultStatus=");
    localStringBuilder.append("{");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("};");
    localStringBuilder.append("memo=");
    localStringBuilder.append("{");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("};");
    localStringBuilder.append("result=");
    localStringBuilder.append("{");
    localStringBuilder.append(paramString3);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return String.format("\"first_pay_flag\":\"%s\",\"card\":\"%s\",\"pay_type\":\"%s\",\"pay_mode\":\"%s\"", new Object[] { paramString1, paramString2, paramString3, paramString4 });
  }

  public static String a(String paramString1, Map<String, String> paramMap1, Map<String, String> paramMap2, File paramFile, String paramString2, String paramString3, int paramInt)
  {
    HttpPost localHttpPost = new HttpPost(paramString1);
    localHttpPost.addHeader("Connection", "Keep-Alive");
    localHttpPost.addHeader("Charset", "UTF-8");
    com.org.apache.http.entity.mime.g localg = new com.org.apache.http.entity.mime.g(HttpMultipartMode.BROWSER_COMPATIBLE);
    if (paramMap2 != null)
    {
      Iterator localIterator2 = paramMap2.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry2 = (Map.Entry)localIterator2.next();
        localHttpPost.addHeader((String)localEntry2.getKey(), (String)localEntry2.getValue());
      }
    }
    if (paramMap1 != null)
    {
      Iterator localIterator1 = paramMap1.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator1.next();
        localg.a((String)localEntry1.getKey(), new com.org.apache.http.entity.mime.a.c((String)localEntry1.getValue(), "text/plain", Charset.forName("UTF-8")));
      }
    }
    if (paramFile != null)
      localg.a(paramString3, new com.org.apache.http.entity.mime.a.b(paramFile, paramString2, '\000'));
    localHttpPost.setEntity(localg);
    HttpClient localHttpClient = com.wandoujia.account.e.a.a(paramInt, 30000);
    try
    {
      localHttpResponse = localHttpClient.execute(localHttpPost);
      if ((localHttpResponse == null) || (localHttpResponse.getStatusLine().getStatusCode() != 200))
        throw new IOException("upload image got error response code");
    }
    catch (Exception localException1)
    {
      while (true)
      {
        HttpResponse localHttpResponse;
        return null;
        HttpEntity localHttpEntity = localHttpResponse.getEntity();
        InputStream localInputStream;
        if (localHttpEntity != null)
          localInputStream = localHttpEntity.getContent();
        try
        {
          BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream, "utf-8"));
          localStringBuilder = new StringBuilder();
          while (true)
          {
            String str1 = localBufferedReader.readLine();
            if (str1 == null)
              break;
            localStringBuilder.append(str1 + "\n");
          }
        }
        catch (Exception localException2)
        {
          StringBuilder localStringBuilder;
          localInputStream.close();
          localHttpClient.getConnectionManager().closeExpiredConnections();
          localHttpClient.getConnectionManager().shutdown();
          continue;
          String str2 = localStringBuilder.toString();
          localInputStream.close();
          localHttpClient.getConnectionManager().closeExpiredConnections();
          localHttpClient.getConnectionManager().shutdown();
          return str2;
        }
        finally
        {
          localInputStream.close();
        }
      }
    }
    finally
    {
      localHttpClient.getConnectionManager().closeExpiredConnections();
      localHttpClient.getConnectionManager().shutdown();
    }
    throw localObject1;
  }

  public static String a(Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("Content-Type");
    if (str != null)
    {
      String[] arrayOfString1 = str.split(";");
      for (int i1 = 1; i1 < arrayOfString1.length; i1++)
      {
        String[] arrayOfString2 = arrayOfString1[i1].trim().split("=");
        if ((arrayOfString2.length == 2) && (arrayOfString2[0].equals("charset")))
          return arrayOfString2[1];
      }
    }
    return "ISO-8859-1";
  }

  public static String a(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    int i1 = localStatusLine.getStatusCode();
    HttpEntity localHttpEntity = paramHttpResponse.getEntity();
    Object localObject1 = null;
    try
    {
      localObject1 = localHttpEntity.getContent();
      if ((localStatusLine.getStatusCode() != 200) || (localObject1 == null))
        throw new NetErrorException(i1 + " " + localStatusLine.getReasonPhrase());
    }
    catch (Exception localException2)
    {
      b(localException2);
      throw new NetErrorException();
    }
    finally
    {
    }
    try
    {
      ((InputStream)localObject1).close();
      throw localObject2;
      Header localHeader = localHttpEntity.getContentEncoding();
      if ((localHeader != null) && (localHeader.getValue().contains("gzip")))
        localObject1 = new GZIPInputStream((InputStream)localObject1);
      i2 = (int)localHttpEntity.getContentLength();
      if (i2 < 0)
      {
        i3 = 4096;
        String str1 = EntityUtils.getContentCharSet(localHttpEntity);
        if (str1 == null)
          str1 = "UTF-8";
        InputStreamReader localInputStreamReader = new InputStreamReader((InputStream)localObject1, str1);
        CharArrayBuffer localCharArrayBuffer = new CharArrayBuffer(i3);
        char[] arrayOfChar = new char[1024];
        while (true)
        {
          int i4 = localInputStreamReader.read(arrayOfChar);
          String str2;
          if (i4 == -1)
            str2 = localCharArrayBuffer.toString();
          try
          {
            ((InputStream)localObject1).close();
            return str2;
            localCharArrayBuffer.append(arrayOfChar, 0, i4);
          }
          catch (Exception localException3)
          {
            return str2;
          }
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        int i2;
        continue;
        int i3 = i2;
      }
    }
  }

  public static String a(JSONObject paramJSONObject)
  {
    new StringBuilder("action:").append(com.unionpay.mpay.utils.e.a(paramJSONObject, "action"));
    return com.unionpay.mpay.utils.e.a(paramJSONObject, "action");
  }

  public static String a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, "UTF-8");
  }

  private static String a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte == null)
      return null;
    try
    {
      String str = new String(paramArrayOfByte, paramString);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw a(paramString, localUnsupportedEncodingException);
  }

  public static HashMap<String, String> a(String paramString, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("package_name", paramString);
    localHashMap.put("status", String.valueOf(paramBoolean));
    return localHashMap;
  }

  public static List<String> a(Intent paramIntent)
  {
    if (paramIntent == null)
      return Collections.emptyList();
    String str = paramIntent.getDataString();
    if (!TextUtils.isEmpty(str))
      return CollectionUtils.notNull(Uri.parse(str).getPathSegments());
    return Collections.emptyList();
  }

  public static List<SimpleAppInfo> a(Set<String> paramSet)
  {
    try
    {
      new StringBuilder("getAppInfosWithType  ").append(paramSet.toString());
      com.wandoujia.launcher.d.a.a locala = new com.wandoujia.launcher.d.a.a();
      ((com.wandoujia.launcher.d.b.a)locala.getRequestBuilder()).a(paramSet);
      List localList = (List)com.wandoujia.launcher_base.b.a.d().execute(locala);
      return localList;
    }
    catch (ExecutionException localExecutionException)
    {
      localExecutionException.getMessage();
      return null;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }

  public static List<DownloadInfo> a(boolean paramBoolean, List<DownloadInfo> paramList)
  {
    if (CollectionUtils.isEmpty(paramList))
      paramList = null;
    Set localSet1;
    HashSet localHashSet;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    Iterator localIterator1;
    while (true)
    {
      return paramList;
      if (!paramBoolean)
        break;
      localSet1 = Config.i();
      Set localSet2 = Config.h();
      localHashSet = new HashSet();
      if (localSet1 != null)
        localHashSet.addAll(localSet1);
      if (localSet2 != null)
        localHashSet.addAll(localSet2);
      if (CollectionUtils.isEmpty(localHashSet))
        continue;
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      localIterator1 = paramList.iterator();
    }
    label274: 
    while (true)
    {
      label92: DownloadInfo localDownloadInfo;
      if (localIterator1.hasNext())
      {
        localDownloadInfo = (DownloadInfo)localIterator1.next();
        Iterator localIterator2 = localHashSet.iterator();
        do
          if (!localIterator2.hasNext())
            break;
        while (!((String)localIterator2.next()).equals(localDownloadInfo.b));
      }
      for (int i1 = 1; ; i1 = 0)
      {
        if ((localDownloadInfo.d == null) || (localDownloadInfo.d.a == null) || (localDownloadInfo.d.a.e == null) || (localArrayList2.contains(localDownloadInfo.b)) || (i1 != 0) || (!new File(localDownloadInfo.d.a.e).exists()))
          break label274;
        localArrayList1.add(localDownloadInfo);
        localArrayList2.add(localDownloadInfo.b);
        break label92;
        localSet1 = Config.g();
        break;
        return localArrayList1;
      }
    }
  }

  public static HttpResponse a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, paramString1, paramString2, null);
  }

  public static HttpResponse a(Context paramContext, String paramString1, String paramString2, com.wandoujia.clean.b.a parama)
  {
    long l1 = System.currentTimeMillis();
    if (c == null)
    {
      c = new com.wandoujia.download2.g(paramContext, paramString1);
      if (parama == null)
        break label80;
    }
    label80: for (HttpResponse localHttpResponse = c.a(paramString2, parama); ; localHttpResponse = c.a(paramString2, null))
    {
      long l2 = System.currentTimeMillis() - l1;
      com.alipay.wandoujia.i.a().a(l2, paramString1);
      return localHttpResponse;
      if (TextUtils.equals(paramString1, c.a()))
        break;
      c.a(paramString1);
      break;
    }
  }

  public static JSONObject a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    JSONObject localJSONObject1 = new JSONObject();
    while (true)
    {
      try
      {
        JSONObject[] arrayOfJSONObject = { paramJSONObject1, paramJSONObject2 };
        int i1 = 0;
        break label96;
        JSONObject localJSONObject2 = arrayOfJSONObject[i1];
        if (localJSONObject2 != null)
        {
          Iterator localIterator = localJSONObject2.keys();
          if (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            localJSONObject1.put(str, localJSONObject2.get(str));
            continue;
          }
        }
      }
      catch (JSONException localJSONException)
      {
        b(localJSONException);
        return localJSONObject1;
      }
      label96: 
      while (i1 >= 2)
      {
        return localJSONObject1;
        i1++;
      }
    }
  }

  public static void a()
  {
    b = com.alipay.android.app.i.b();
  }

  public static void a(Activity paramActivity, int paramInt, String paramString)
  {
    View localView = paramActivity.getLayoutInflater().inflate(d.b("mini_ui_custom_toast", "layout"), null);
    ((ImageView)localView.findViewById(d.b("mini_toast_icon", "id"))).setImageResource(paramInt);
    ((TextView)localView.findViewById(d.b("mini_toast_text", "id"))).setText(paramString);
    localView.getBackground().setAlpha(192);
    Toast localToast = new Toast(paramActivity.getApplicationContext());
    localToast.setGravity(17, 0, 0);
    localToast.setDuration(1);
    localToast.setView(localView);
    localToast.show();
  }

  public static void a(Activity paramActivity, Bundle paramBundle)
  {
    if ((paramBundle.getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false)) && (paramActivity != null))
      paramActivity.finish();
  }

  public static void a(Activity paramActivity, b paramb)
  {
    paramActivity.setEnterSharedElementCallback(a(paramb));
  }

  public static void a(Notification.Builder paramBuilder, bi parambi)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(parambi.a(), parambi.b(), parambi.c());
    if (parambi.d() != null)
      localBuilder.addExtras(parambi.d());
    paramBuilder.addAction(localBuilder.build());
  }

  public static void a(Context paramContext, View paramView)
  {
    ((WindowManager)paramContext.getSystemService("window")).removeView(paramView);
  }

  public static void a(Context paramContext, View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    if (Build.VERSION.SDK_INT >= 19);
    for (localLayoutParams.type = 2005; ; localLayoutParams.type = 2003)
    {
      localLayoutParams.format = -3;
      localLayoutParams.flags = 32;
      localLayoutParams.flags = (0x8 | localLayoutParams.flags);
      localLayoutParams.gravity = paramInt1;
      localLayoutParams.width = paramInt2;
      localLayoutParams.height = paramInt3;
      if (paramBoolean)
        localLayoutParams.width = -1;
      localWindowManager.addView(paramView, localLayoutParams);
      return;
    }
  }

  public static void a(Context paramContext, AccountParams.Type paramType)
  {
    Context localContext = paramContext.getApplicationContext();
    f = localContext;
    localContext.getApplicationContext();
    if (paramType == AccountParams.Type.PHOENIX)
      com.wandoujia.account.a.a(f, AccountStorageType.SYSTEM);
    while (true)
    {
      com.wandoujia.account.a.b();
      return;
      if (paramType == AccountParams.Type.FIVE)
      {
        com.wandoujia.account.a.a(f, AccountStorageType.FIVE);
        continue;
      }
      if (p(paramContext))
      {
        com.wandoujia.account.a.a(paramContext, AccountStorageType.SDK);
        continue;
      }
      com.wandoujia.account.a.a(paramContext, AccountStorageType.SHARED_PREFERENCE);
    }
  }

  public static void a(Context paramContext, com.wandoujia.account.f.b paramb, AccountParams paramAccountParams, Class<?> paramClass)
  {
    if (paramb == null)
      throw new IllegalArgumentException("wdjAccountManager must not be null");
    g = paramb;
    AccountBaseFragment.a(paramb);
    Intent localIntent = new Intent(paramContext, paramClass);
    localIntent.putExtra("account.intent.extra.ACCOUNT_PARAMS", paramAccountParams);
    localIntent.putExtra("account.intent.extra.ACCOUNT_MANAGER_KEY", paramb.f());
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    if (paramAccountParams.o() != -1)
      localIntent.setFlags(paramAccountParams.o());
    if (paramAccountParams.f() != -1)
    {
      if ((paramContext instanceof Activity))
      {
        ((Activity)paramContext).startActivityForResult(localIntent, paramAccountParams.f());
        return;
      }
      paramContext.startActivity(localIntent);
      return;
    }
    paramContext.startActivity(localIntent);
  }

  public static void a(Context paramContext, String paramString)
  {
    Toast localToast = Toast.makeText(paramContext, paramString, 1);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }

  // ERROR //
  public static void a(Context paramContext, String paramString, Object paramObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 2488	java/io/ObjectOutputStream
    //   5: dup
    //   6: aload_0
    //   7: aload_1
    //   8: iconst_0
    //   9: invokevirtual 2492	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   12: invokespecial 2495	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   15: astore 4
    //   17: aload 4
    //   19: aload_2
    //   20: invokevirtual 2498	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   23: aload 4
    //   25: invokevirtual 2501	java/io/ObjectOutputStream:flush	()V
    //   28: aload 4
    //   30: invokevirtual 2502	java/io/ObjectOutputStream:close	()V
    //   33: return
    //   34: astore 14
    //   36: aconst_null
    //   37: astore 4
    //   39: aload 4
    //   41: ifnull -8 -> 33
    //   44: aload 4
    //   46: invokevirtual 2501	java/io/ObjectOutputStream:flush	()V
    //   49: aload 4
    //   51: invokevirtual 2502	java/io/ObjectOutputStream:close	()V
    //   54: return
    //   55: astore 6
    //   57: return
    //   58: astore 13
    //   60: aload_3
    //   61: ifnull -28 -> 33
    //   64: aload_3
    //   65: invokevirtual 2501	java/io/ObjectOutputStream:flush	()V
    //   68: aload_3
    //   69: invokevirtual 2502	java/io/ObjectOutputStream:close	()V
    //   72: return
    //   73: astore 8
    //   75: return
    //   76: astore 10
    //   78: aload_3
    //   79: ifnull +11 -> 90
    //   82: aload_3
    //   83: invokevirtual 2501	java/io/ObjectOutputStream:flush	()V
    //   86: aload_3
    //   87: invokevirtual 2502	java/io/ObjectOutputStream:close	()V
    //   90: aload 10
    //   92: athrow
    //   93: astore 11
    //   95: goto -5 -> 90
    //   98: astore 9
    //   100: aload 4
    //   102: astore_3
    //   103: aload 9
    //   105: astore 10
    //   107: goto -29 -> 78
    //   110: astore 7
    //   112: aload 4
    //   114: astore_3
    //   115: goto -55 -> 60
    //   118: astore 5
    //   120: goto -81 -> 39
    //   123: astore 12
    //   125: return
    //
    // Exception table:
    //   from	to	target	type
    //   2	17	34	java/io/FileNotFoundException
    //   44	54	55	java/io/IOException
    //   2	17	58	java/io/IOException
    //   64	72	73	java/io/IOException
    //   2	17	76	finally
    //   82	90	93	java/io/IOException
    //   17	23	98	finally
    //   17	23	110	java/io/IOException
    //   17	23	118	java/io/FileNotFoundException
    //   23	33	123	java/io/IOException
  }

  public static void a(Context paramContext, HashSet<String> paramHashSet)
  {
    File localFile1 = B(paramContext);
    if (localFile1 == null);
    while (true)
    {
      return;
      for (File localFile2 : localFile1.listFiles())
      {
        if ((!localFile2.isFile()) || (!localFile2.getName().toLowerCase().endsWith(".apk")) || (paramHashSet.contains(localFile2.getName())))
          continue;
        localFile2.delete();
      }
    }
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    boolean bool = true;
    try
    {
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
      Field localField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
      if (localField != null)
      {
        localField.setAccessible(true);
        n = localField.getBoolean(localViewConfiguration);
        if (paramBoolean)
          break label53;
      }
      while (true)
      {
        localField.setBoolean(localViewConfiguration, bool);
        return;
        label53: bool = false;
      }
    }
    catch (Exception localException)
    {
    }
  }

  @TargetApi(11)
  public static <T> void a(AsyncTask<T, ?, ?> paramAsyncTask, T[] paramArrayOfT)
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        paramAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramArrayOfT);
        return;
      }
      paramAsyncTask.execute(paramArrayOfT);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
    }
  }

  public static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    c(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }

  public static void a(Parcel paramParcel, int paramInt, long paramLong)
  {
    c(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }

  public static void a(Parcel paramParcel, int paramInt, Bundle paramBundle)
  {
    if (paramBundle == null)
      return;
    int i1 = s(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    t(paramParcel, i1);
  }

  public static void a(Parcel paramParcel, int paramInt, IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return;
    int i1 = s(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    t(paramParcel, i1);
  }

  public static void a(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2)
  {
    if (paramParcelable == null)
      return;
    int i1 = s(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    t(paramParcel, i1);
  }

  public static void a(Parcel paramParcel, int paramInt, String paramString)
  {
    if (paramString == null)
      return;
    int i1 = s(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    t(paramParcel, i1);
  }

  public static <T extends Parcelable> void a(Parcel paramParcel, int paramInt, List<T> paramList)
  {
    if (paramList == null)
      return;
    int i1 = s(paramParcel, paramInt);
    int i2 = paramList.size();
    paramParcel.writeInt(i2);
    int i3 = 0;
    if (i3 < i2)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(i3);
      if (localParcelable == null)
        paramParcel.writeInt(0);
      while (true)
      {
        i3++;
        break;
        a(paramParcel, localParcelable, 0);
      }
    }
    t(paramParcel, i1);
  }

  public static void a(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    c(paramParcel, paramInt, 4);
    if (paramBoolean);
    for (int i1 = 1; ; i1 = 0)
    {
      paramParcel.writeInt(i1);
      return;
    }
  }

  public static void a(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return;
    int i1 = s(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfByte);
    t(paramParcel, i1);
  }

  public static <T extends Parcelable> void a(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2)
  {
    if (paramArrayOfT == null)
      return;
    int i1 = s(paramParcel, paramInt1);
    int i2 = paramArrayOfT.length;
    paramParcel.writeInt(i2);
    int i3 = 0;
    if (i3 < i2)
    {
      T ? = paramArrayOfT[i3];
      if (? == null)
        paramParcel.writeInt(0);
      while (true)
      {
        i3++;
        break;
        a(paramParcel, ?, paramInt2);
      }
    }
    t(paramParcel, i1);
  }

  public static void a(Parcel paramParcel, int paramInt, String[] paramArrayOfString)
  {
    if (paramArrayOfString == null)
      return;
    int i1 = s(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    t(paramParcel, i1);
  }

  public static void a(Parcel paramParcel1, Parcel paramParcel2)
  {
    if (paramParcel2 == null)
      return;
    int i1 = s(paramParcel1, 2);
    paramParcel1.appendFrom(paramParcel2, 0, paramParcel2.dataSize());
    t(paramParcel1, i1);
  }

  private static <T extends Parcelable> void a(Parcel paramParcel, T paramT, int paramInt)
  {
    int i1 = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int i2 = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    int i3 = paramParcel.dataPosition();
    paramParcel.setDataPosition(i1);
    paramParcel.writeInt(i3 - i2);
    paramParcel.setDataPosition(i3);
  }

  public static void a(FragmentActivity paramFragmentActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramFragmentActivity == null);
    com.wandoujia.account.f.b localb;
    do
    {
      String str;
      do
      {
        return;
        str = paramFragmentActivity.getIntent().getStringExtra("account.intent.extra.ACCOUNT_MANAGER_KEY");
      }
      while (TextUtils.isEmpty(str));
      localb = AccountBaseFragment.c(str);
    }
    while ((localb == null) || (localb.c() == null));
    localb.c().a(paramInt1, paramInt2, paramIntent);
  }

  public static void a(View paramView, int paramInt)
  {
    a(paramView, "games/game_launcher/pages/" + paramInt);
    q(paramView.getContext());
  }

  @TargetApi(16)
  public static void a(View paramView, Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView.setBackground(paramDrawable);
      return;
    }
    paramView.setBackgroundDrawable(paramDrawable);
  }

  public static void a(View paramView, Model paramModel)
  {
    if ((paramModel.t() != null) && (paramModel.t().type != null) && (paramModel.t().type.intValue() == ActionType.DOWNLOAD_APP.ordinal()))
    {
      String str = paramModel.F().package_name;
      if (!((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).h(str))
      {
        AppTaskManager localAppTaskManager = (AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task");
        if (localAppTaskManager != null)
          localAppTaskManager.a(paramModel, w(paramView.getContext()));
      }
    }
    ((NavigationManager)com.wandoujia.ripple_framework.i.k().a("navigation")).a(paramView.getContext(), paramModel, paramView);
  }

  public static void a(View paramView, String paramString)
  {
    v.b().a(paramView, new ak(paramString));
  }

  public static void a(View paramView, String paramString1, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString2)
  {
    if (k != null)
      v.b().a(paramView, k);
    v.b().a(paramView, paramString1).a(paramView, paramElement, paramAction, paramString2).d(paramView);
  }

  public static void a(View paramView, String paramString1, String paramString2, ContentPackage.Type paramType)
  {
    v.b().a(paramView, new ContentPackage.Builder().identity(paramString1).title(paramString2).type(paramType).build());
  }

  public static void a(Window paramWindow, int paramInt)
  {
    int i1 = b("CT", paramInt);
    if ((i1 != 0) && (paramWindow != null))
      paramWindow.setBackgroundDrawableResource(i1);
  }

  public static void a(AbsListView paramAbsListView)
  {
    if (paramAbsListView == null)
    {
      if (q != null)
      {
        q.clear();
        q = null;
      }
      return;
    }
    q = new WeakReference(paramAbsListView);
  }

  public static void a(TextView paramTextView, int paramInt)
  {
    Resources localResources = com.wandoujia.ripple_framework.i.k().g().getResources();
    int i1 = b("CT", paramInt);
    if ((i1 != 0) && (paramTextView != null))
      paramTextView.setTextColor(localResources.getColor(i1));
  }

  public static void a(AccountBean paramAccountBean, String paramString)
  {
    if (com.wandoujia.account.a.g())
      if ((com.wandoujia.account.a.a() != null) && (paramAccountBean != null))
        break label37;
    while (true)
    {
      if ((paramAccountBean != null) && (!TextUtils.isEmpty(paramString)))
        com.wandoujia.account.a.a(paramAccountBean.getUsername(), paramString);
      return;
      label37: if (paramAccountBean.getSocials() != null)
      {
        Set localSet = paramAccountBean.getSocials();
        com.wandoujia.account.a.a(0L);
        com.wandoujia.account.a.b(0L);
        com.wandoujia.account.a.c(0L);
        Iterator localIterator = localSet.iterator();
        while (localIterator.hasNext())
        {
          SocialBean localSocialBean = (SocialBean)localIterator.next();
          if (localSocialBean.getPlatform().equals(Platform.SINA))
          {
            com.wandoujia.account.a.a(localSocialBean.getBindTime().getTime());
            com.wandoujia.account.a.i(localSocialBean.getNick());
            continue;
          }
          if (localSocialBean.getPlatform().equals(Platform.QQ))
          {
            com.wandoujia.account.a.b(localSocialBean.getBindTime().getTime());
            com.wandoujia.account.a.j(localSocialBean.getNick());
            continue;
          }
          if (localSocialBean.getPlatform().equals(Platform.RENREN))
          {
            com.wandoujia.account.a.c(localSocialBean.getBindTime().getTime());
            com.wandoujia.account.a.k(localSocialBean.getNick());
            continue;
          }
          if (!localSocialBean.getPlatform().equals(Platform.WECHAT))
            continue;
          com.wandoujia.account.a.d(localSocialBean.getBindTime().getTime());
          com.wandoujia.account.a.l(localSocialBean.getNick());
        }
      }
      com.wandoujia.account.a.d(String.valueOf(paramAccountBean.getUid()));
      if (paramAccountBean.getAvatar() != null)
        com.wandoujia.account.a.e(paramAccountBean.getAvatar());
      com.wandoujia.account.a.f(paramAccountBean.getNick());
      com.wandoujia.account.a.a(paramAccountBean.getUsername());
      com.wandoujia.account.a.g(paramAccountBean.getEmail());
      com.wandoujia.account.a.h(paramAccountBean.getTelephone());
      com.wandoujia.account.a.a(paramAccountBean.isEmailValidated());
      com.wandoujia.account.a.c(paramAccountBean.isTelephoneValidated());
      com.wandoujia.account.a.m(paramAccountBean.getRegisterSource().name());
      com.wandoujia.account.a.b(paramAccountBean.isComplete());
      com.wandoujia.account.a.d(paramAccountBean.isNeedUpdatePassword());
      com.wandoujia.account.a.f(paramAccountBean.isTrusted());
      com.wandoujia.account.a.a(paramAccountBean.getRoles());
    }
  }

  public static void a(com.wandoujia.account.f.b paramb)
  {
    com.wandoujia.account.a.D();
    new Thread(new com.wandoujia.account.g.n(paramb)).start();
  }

  public static void a(SimpleAppInfo paramSimpleAppInfo)
  {
    String str = paramSimpleAppInfo.getTitle();
    if (!TextUtils.isEmpty(str))
      paramSimpleAppInfo.setPinyinName(TextUtil.convert2Pinyin(GlobalConfig.getAppContext(), str.trim()));
  }

  public static void a(GameLauncherPackage paramGameLauncherPackage)
  {
    k = paramGameLauncherPackage;
  }

  public static void a(TaskEvent.Status paramStatus, TaskEvent.Result paramResult, TaskEvent.Action paramAction, ViewLogPackage paramViewLogPackage, String paramString)
  {
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().status(paramStatus).result(paramResult).action(paramAction).view_log_package(paramViewLogPackage).result_info(paramString);
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
    List localList = com.wandoujia.launcher.launcher.b.c.a().c();
    if (localList != null)
    {
      GameLauncherPackage.Builder localBuilder2 = new GameLauncherPackage.Builder();
      localBuilder2.game_count(Integer.valueOf(localList.size()));
      localBuilder1.game_launcher_package(localBuilder2.build());
    }
    v.b().a(localBuilder, localBuilder1);
  }

  public static void a(Object paramObject, View paramView)
  {
    ((Transition)paramObject).setEpicenterCallback(new ad(e(paramView)));
  }

  public static void a(Object paramObject, View paramView, boolean paramBoolean)
  {
    ((Transition)paramObject).excludeTarget(paramView, paramBoolean);
  }

  public static void a(Object paramObject1, Object paramObject2, View paramView1, ah paramah, View paramView2, com.tencent.open.yyb.a parama, Map<String, String> paramMap, ArrayList<View> paramArrayList1, Map<String, View> paramMap1, ArrayList<View> paramArrayList2)
  {
    if ((paramObject1 != null) || (paramObject2 != null))
    {
      Transition localTransition = (Transition)paramObject1;
      if (localTransition != null)
        localTransition.addTarget(paramView2);
      if (paramObject2 != null)
        b((Transition)paramObject2, paramArrayList2);
      paramView1.getViewTreeObserver().addOnPreDrawListener(new ae(paramView1, paramah, paramMap, paramMap1, localTransition, paramArrayList1, paramView2));
      if (localTransition != null)
        localTransition.setEpicenterCallback(new af(parama));
    }
  }

  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("null");
      return;
    }
    String str = paramObject.getClass().getSimpleName();
    if ((str == null) || (str.length() <= 0))
    {
      str = paramObject.getClass().getName();
      int i1 = str.lastIndexOf('.');
      if (i1 > 0)
        str = str.substring(i1 + 1);
    }
    paramStringBuilder.append(str);
    paramStringBuilder.append('{');
    paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
  }

  public static void a(Object paramObject, ArrayList<View> paramArrayList)
  {
    Transition localTransition = (Transition)paramObject;
    if ((localTransition instanceof TransitionSet))
    {
      TransitionSet localTransitionSet = (TransitionSet)localTransition;
      int i2 = localTransitionSet.getTransitionCount();
      for (int i3 = 0; i3 < i2; i3++)
        a(localTransitionSet.getTransitionAt(i3), paramArrayList);
    }
    if (!a(localTransition))
    {
      List localList = localTransition.getTargets();
      if ((localList != null) && (localList.size() == paramArrayList.size()) && (localList.containsAll(paramArrayList)))
        for (int i1 = -1 + paramArrayList.size(); i1 >= 0; i1--)
          localTransition.removeTarget((View)paramArrayList.get(i1));
    }
  }

  public static void a(String paramString, long paramLong)
  {
    p.edit().putLong(paramString, paramLong).apply();
  }

  public static void a(String paramString1, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString2, String paramString3)
  {
    ViewLogPackage.Builder localBuilder = new ViewLogPackage.Builder();
    localBuilder.module(paramString1).element(paramElement).action(paramAction).name(paramString2);
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().status(TaskEvent.Status.END).result(TaskEvent.Result.SUCCESS).action(TaskEvent.Action.OPEN).view_log_package(localBuilder.build()).result_info("");
    ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
    localBuilder2.content_package(new ContentPackage.Builder().identity(paramString3).build());
    v.b().a(localBuilder1, localBuilder2);
  }

  private static void a(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    int i1;
    Class localClass1;
    Method[] arrayOfMethod;
    int i4;
    int i5;
    if (paramObject != null)
    {
      if (!(paramObject instanceof com.google.android.gms.internal.aw))
        break label408;
      i1 = paramStringBuffer1.length();
      if (paramString != null)
      {
        paramStringBuffer2.append(paramStringBuffer1).append(T(paramString)).append(" <\n");
        paramStringBuffer1.append("  ");
      }
      localClass1 = paramObject.getClass();
      for (Field localField : localClass1.getFields())
      {
        int i6 = localField.getModifiers();
        String str6 = localField.getName();
        if (((i6 & 0x1) != 1) || ((i6 & 0x8) == 8) || (str6.startsWith("_")) || (str6.endsWith("_")))
          continue;
        Class localClass2 = localField.getType();
        Object localObject = localField.get(paramObject);
        int i7;
        if ((localClass2.isArray()) && (localClass2.getComponentType() != Byte.TYPE))
          if (localObject == null)
            i7 = 0;
        while (true)
        {
          int i8 = 0;
          while (true)
            if (i8 < i7)
            {
              a(str6, Array.get(localObject, i8), paramStringBuffer1, paramStringBuffer2);
              i8++;
              continue;
              i7 = Array.getLength(localObject);
              break;
              a(str6, localObject, paramStringBuffer1, paramStringBuffer2);
            }
        }
      }
      arrayOfMethod = localClass1.getMethods();
      i4 = arrayOfMethod.length;
      i5 = 0;
    }
    while (true)
    {
      String str5;
      if (i5 < i4)
      {
        String str4 = arrayOfMethod[i5].getName();
        if (str4.startsWith("set"))
          str5 = str4.substring(3);
      }
      try
      {
        Method localMethod1 = localClass1.getMethod("has" + str5, new Class[0]);
        if (((Boolean)localMethod1.invoke(paramObject, new Object[0])).booleanValue());
        try
        {
          Method localMethod2 = localClass1.getMethod("get" + str5, new Class[0]);
          a(str5, localMethod2.invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
          label379: i5++;
          continue;
          if (paramString != null)
          {
            paramStringBuffer1.setLength(i1);
            paramStringBuffer2.append(paramStringBuffer1).append(">\n");
          }
          return;
          label408: String str1 = T(paramString);
          paramStringBuffer2.append(paramStringBuffer1).append(str1).append(": ");
          if ((paramObject instanceof String))
          {
            String str2 = (String)paramObject;
            if ((!str2.startsWith("http")) && (str2.length() > 200))
              str2 = str2.substring(0, 200) + "[...]";
            String str3 = U(str2);
            paramStringBuffer2.append("\"").append(str3).append("\"");
          }
          while (true)
          {
            paramStringBuffer2.append("\n");
            return;
            if ((paramObject instanceof byte[]))
            {
              a((byte[])paramObject, paramStringBuffer2);
              continue;
            }
            paramStringBuffer2.append(paramObject);
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          break label379;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        break label379;
      }
    }
  }

  public static void a(String paramString, Map<String, String> paramMap)
  {
    LogReporter localLogReporter = LogReporterFactory.getLogReporter();
    if (localLogReporter == null)
      return;
    localLogReporter.onEvent(paramString, paramMap);
  }

  public static void a(StringBuilder paramStringBuilder, HashMap<String, String> paramHashMap)
  {
    paramStringBuilder.append("{");
    Iterator localIterator = paramHashMap.keySet().iterator();
    int i1 = 1;
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (i1 == 0)
        paramStringBuilder.append(",");
      String str2;
      for (int i2 = i1; ; i2 = 0)
      {
        str2 = (String)paramHashMap.get(str1);
        paramStringBuilder.append("\"").append(str1).append("\":");
        if (str2 != null)
          break label114;
        paramStringBuilder.append("null");
        i1 = i2;
        break;
      }
      label114: paramStringBuilder.append("\"").append(str2).append("\"");
      i1 = i2;
    }
    paramStringBuilder.append("}");
  }

  public static void a(StringBuilder paramStringBuilder, double[] paramArrayOfDouble)
  {
    int i1 = paramArrayOfDouble.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      if (i2 != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Double.toString(paramArrayOfDouble[i2]));
    }
  }

  public static void a(StringBuilder paramStringBuilder, float[] paramArrayOfFloat)
  {
    int i1 = paramArrayOfFloat.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      if (i2 != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Float.toString(paramArrayOfFloat[i2]));
    }
  }

  public static void a(StringBuilder paramStringBuilder, long[] paramArrayOfLong)
  {
    int i1 = paramArrayOfLong.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      if (i2 != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Long.toString(paramArrayOfLong[i2]));
    }
  }

  public static <T> void a(StringBuilder paramStringBuilder, T[] paramArrayOfT)
  {
    int i1 = paramArrayOfT.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      if (i2 != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(paramArrayOfT[i2].toString());
    }
  }

  public static void a(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    int i1 = paramArrayOfString.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      if (i2 != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append("\"").append(paramArrayOfString[i2]).append("\"");
    }
  }

  public static void a(StringBuilder paramStringBuilder, boolean[] paramArrayOfBoolean)
  {
    int i1 = paramArrayOfBoolean.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      if (i2 != 0)
        paramStringBuilder.append(",");
      paramStringBuilder.append(Boolean.toString(paramArrayOfBoolean[i2]));
    }
  }

  public static void a(List<SimpleAppInfo> paramList)
  {
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        a((SimpleAppInfo)localIterator.next());
    }
  }

  public static void a(Map<String, View> paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = paramView.getTransitionName();
      if (str != null)
        paramMap.put(str, paramView);
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i1 = localViewGroup.getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
          a(paramMap, localViewGroup.getChildAt(i2));
      }
    }
  }

  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException();
  }

  private static void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Exception paramException)
  {
    TaskEvent.Status localStatus;
    TaskEvent.Result localResult;
    String str1;
    String str2;
    if (paramBoolean1)
    {
      localStatus = TaskEvent.Status.START;
      localResult = TaskEvent.Result.SUCCESS;
      str1 = "start";
      str2 = "start";
    }
    while (true)
    {
      ViewLogPackage localViewLogPackage = a("has_shortcut", ViewLogPackage.Element.ICON, ViewLogPackage.Action.OPEN, str1);
      a(localStatus, localResult, TaskEvent.Action.VIEW_EVENT, localViewLogPackage, str2);
      return;
      localStatus = TaskEvent.Status.END;
      if (paramBoolean2)
      {
        localResult = TaskEvent.Result.SUCCESS;
        str1 = "success";
        str2 = "result:" + paramBoolean3;
        continue;
      }
      localResult = TaskEvent.Result.FAIL;
      str1 = "failed";
      if (paramException != null)
      {
        str2 = "exception:" + paramException.getMessage();
        continue;
      }
      str2 = "authority empty";
    }
  }

  private static void a(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    if (paramArrayOfByte == null)
    {
      paramStringBuffer.append("\"\"");
      return;
    }
    paramStringBuffer.append('"');
    int i1 = 0;
    if (i1 < paramArrayOfByte.length)
    {
      int i2 = 0xFF & paramArrayOfByte[i1];
      if ((i2 == 92) || (i2 == 34))
        paramStringBuffer.append('\\').append((char)i2);
      while (true)
      {
        i1++;
        break;
        if ((i2 >= 32) && (i2 < 127))
        {
          paramStringBuffer.append((char)i2);
          continue;
        }
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i2);
        paramStringBuffer.append(String.format("\\%03o", arrayOfObject));
      }
    }
    paramStringBuffer.append('"');
  }

  private static boolean a(long paramLong1, long paramLong2)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTimeInMillis(paramLong1);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTimeInMillis(paramLong2);
    return localCalendar1.get(1) == localCalendar2.get(1);
  }

  @TargetApi(17)
  public static boolean a(Activity paramActivity)
  {
    if (paramActivity != null);
    try
    {
      if (!paramActivity.isFinishing())
      {
        if (SystemUtil.aboveApiLevel(17))
        {
          boolean bool = paramActivity.isDestroyed();
          if (!bool);
        }
      }
      else
        return false;
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
    }
    return true;
  }

  public static boolean a(ContentValues paramContentValues, Object paramObject)
  {
    int i1;
    if (paramObject == null)
    {
      com.tencent.mm.sdk.platformtools.b.a("MicroMsg.SDK.PluginProvider.Resolver");
      i1 = 0;
    }
    while (i1 == 0)
    {
      return false;
      if ((paramObject instanceof Integer))
      {
        i1 = 1;
        continue;
      }
      if ((paramObject instanceof Long))
      {
        i1 = 2;
        continue;
      }
      if ((paramObject instanceof String))
      {
        i1 = 3;
        continue;
      }
      if ((paramObject instanceof Boolean))
      {
        i1 = 4;
        continue;
      }
      if ((paramObject instanceof Float))
      {
        i1 = 5;
        continue;
      }
      if ((paramObject instanceof Double))
      {
        i1 = 6;
        continue;
      }
      new StringBuilder("unresolve failed, unknown type=").append(paramObject.getClass().toString());
      com.tencent.mm.sdk.platformtools.b.a("MicroMsg.SDK.PluginProvider.Resolver");
      i1 = 0;
    }
    paramContentValues.put("type", Integer.valueOf(i1));
    paramContentValues.put("value", paramObject.toString());
    return true;
  }

  public static boolean a(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected()) && ((localNetworkInfo.getType() == 1) || (localNetworkInfo.getType() == 0));
  }

  public static boolean a(Context paramContext, Intent paramIntent)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager == null);
    while (true)
    {
      return false;
      ResolveInfo localResolveInfo = localPackageManager.resolveActivity(paramIntent, 0);
      if (localResolveInfo == null)
        continue;
      String str = localResolveInfo.activityInfo.packageName;
      try
      {
        Signature[] arrayOfSignature = localPackageManager.getPackageInfo(str, 64).signatures;
        if (arrayOfSignature == null)
          continue;
        int i1 = arrayOfSignature.length;
        for (int i2 = 0; i2 < i1; i2++)
        {
          boolean bool = "18da2bf10352443a00a5e046d9fca6bd".equals(com.sina.weibo.sdk.a.f.a(arrayOfSignature[i2].toByteArray()));
          if (bool)
            return true;
        }
      }
      catch (Exception localException)
      {
        return false;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
    return false;
  }

  public static boolean a(Context paramContext, com.sina.weibo.sdk.g paramg, Intent paramIntent)
  {
    if ((paramg != null) && (paramg.b() <= 10352));
    while (true)
    {
      return true;
      if (paramg == null)
        continue;
      if (paramIntent != null);
      for (String str = paramIntent.getStringExtra("_weibo_appPackage"); (str == null) || (paramIntent.getStringExtra("_weibo_transaction") == null) || (!com.sina.weibo.sdk.a.a(paramContext, str)); str = null)
        return false;
    }
  }

  // ERROR //
  private static boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokestatic 63	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +9 -> 15
    //   9: iconst_0
    //   10: istore 8
    //   12: iload 8
    //   14: ireturn
    //   15: iload_2
    //   16: ifeq +10 -> 26
    //   19: iconst_1
    //   20: iconst_1
    //   21: iconst_1
    //   22: aconst_null
    //   23: invokestatic 3320	android/support/v4/app/b:a	(ZZZLjava/lang/Exception;)V
    //   26: aload_0
    //   27: ldc_w 3322
    //   30: invokestatic 3327	com/wandoujia/base/utils/LauncherUtil:getAuthorityFromPermission	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   33: astore 4
    //   35: aload 4
    //   37: invokestatic 63	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   40: ifeq +16 -> 56
    //   43: iload_2
    //   44: ifeq +10 -> 54
    //   47: iconst_0
    //   48: iconst_0
    //   49: iconst_0
    //   50: aconst_null
    //   51: invokestatic 3320	android/support/v4/app/b:a	(ZZZLjava/lang/Exception;)V
    //   54: iconst_0
    //   55: ireturn
    //   56: new 375	java/lang/StringBuilder
    //   59: dup
    //   60: ldc_w 3329
    //   63: invokespecial 380	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   66: aload 4
    //   68: invokevirtual 384	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc_w 3331
    //   74: invokevirtual 384	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 387	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokestatic 1177	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   83: astore 9
    //   85: aload_0
    //   86: invokevirtual 3335	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   89: aload 9
    //   91: aconst_null
    //   92: ldc_w 3337
    //   95: iconst_1
    //   96: anewarray 131	java/lang/String
    //   99: dup
    //   100: iconst_0
    //   101: aload_1
    //   102: aastore
    //   103: aconst_null
    //   104: invokevirtual 1863	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   107: astore 10
    //   109: aload 10
    //   111: astore 7
    //   113: aload 7
    //   115: ifnull +117 -> 232
    //   118: aload 7
    //   120: invokeinterface 3340 1 0
    //   125: istore 11
    //   127: iload 11
    //   129: iconst_1
    //   130: if_icmpne +102 -> 232
    //   133: iconst_1
    //   134: istore 8
    //   136: aload 7
    //   138: ifnull +10 -> 148
    //   141: aload 7
    //   143: invokeinterface 1875 1 0
    //   148: iload_2
    //   149: ifeq -137 -> 12
    //   152: iconst_0
    //   153: iconst_1
    //   154: iload 8
    //   156: aconst_null
    //   157: invokestatic 3320	android/support/v4/app/b:a	(ZZZLjava/lang/Exception;)V
    //   160: iload 8
    //   162: ireturn
    //   163: astore 6
    //   165: aconst_null
    //   166: astore 7
    //   168: iload_2
    //   169: ifeq +11 -> 180
    //   172: iconst_0
    //   173: iconst_0
    //   174: iconst_0
    //   175: aload 6
    //   177: invokestatic 3320	android/support/v4/app/b:a	(ZZZLjava/lang/Exception;)V
    //   180: aload 7
    //   182: ifnull +44 -> 226
    //   185: aload 7
    //   187: invokeinterface 1875 1 0
    //   192: iconst_0
    //   193: istore 8
    //   195: goto -47 -> 148
    //   198: astore 5
    //   200: aload_3
    //   201: ifnull +9 -> 210
    //   204: aload_3
    //   205: invokeinterface 1875 1 0
    //   210: aload 5
    //   212: athrow
    //   213: astore 5
    //   215: aload 7
    //   217: astore_3
    //   218: goto -18 -> 200
    //   221: astore 6
    //   223: goto -55 -> 168
    //   226: iconst_0
    //   227: istore 8
    //   229: goto -81 -> 148
    //   232: iconst_0
    //   233: istore 8
    //   235: goto -99 -> 136
    //
    // Exception table:
    //   from	to	target	type
    //   56	109	163	java/lang/Exception
    //   56	109	198	finally
    //   118	127	213	finally
    //   172	180	213	finally
    //   118	127	221	java/lang/Exception
  }

  public static boolean a(FragmentActivity paramFragmentActivity, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0)
    {
      switch (paramInt)
      {
      default:
      case 4:
      }
      while (true)
      {
        return false;
        if ((paramFragmentActivity == null) || (paramFragmentActivity.getSupportFragmentManager() == null))
          return false;
        WebViewFragment localWebViewFragment = (WebViewFragment)paramFragmentActivity.getSupportFragmentManager().a("forgetPasswordWebView");
        if ((localWebViewFragment != null) && (localWebViewFragment.g() != null) && (!TextUtils.isEmpty(localWebViewFragment.g().getUrl())) && (localWebViewFragment.g().canGoBack()) && (!localWebViewFragment.g().getUrl().startsWith("http://www.wandoujia.com/account")))
        {
          localWebViewFragment.g().loadUrl(String.format("http://www.wandoujia.com/account/?source=p3&username=%s#find", new Object[] { "" }));
          localWebViewFragment.g().clearHistory();
          return true;
        }
        if ((!(paramFragmentActivity instanceof com.wandoujia.account.fragment.c)) || (paramFragmentActivity.getSupportFragmentManager() == null) || (paramFragmentActivity.getSupportFragmentManager().e() > 0))
          continue;
        ((com.wandoujia.account.fragment.c)paramFragmentActivity).a(paramFragmentActivity, AccountParamConstants.FinishType.CANCEL, null);
      }
    }
    return false;
  }

  private static boolean a(Transition paramTransition)
  {
    return (!c(paramTransition.getTargetIds())) || (!c(paramTransition.getTargetNames())) || (!c(paramTransition.getTargetTypes()));
  }

  @TargetApi(16)
  public static boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo, TaskEvent.Action paramAction)
  {
    int i1 = 0;
    boolean bool3;
    String str;
    TaskEvent.Builder localBuilder1;
    if (paramAccessibilityNodeInfo != null)
    {
      boolean bool1 = paramAccessibilityNodeInfo.isClickable();
      i1 = 0;
      if (bool1)
      {
        boolean bool2 = paramAccessibilityNodeInfo.isEnabled();
        i1 = 0;
        if (bool2)
        {
          bool3 = paramAccessibilityNodeInfo.performAction(16);
          paramAccessibilityNodeInfo.recycle();
          str = "";
          if (paramAccessibilityNodeInfo.getText() != null)
            str = paramAccessibilityNodeInfo.getText().toString();
          localBuilder1 = new TaskEvent.Builder().status(TaskEvent.Status.READY);
          if (!bool3)
            break label157;
        }
      }
    }
    label157: for (TaskEvent.Result localResult = TaskEvent.Result.SUCCESS; ; localResult = TaskEvent.Result.FAIL)
    {
      TaskEvent.Builder localBuilder2 = localBuilder1.result(localResult).result_info("{\"button_name\" : \"" + str + "\"}");
      if (paramAction != null)
        localBuilder2.action(paramAction);
      v.b().a(localBuilder2, new ExtraPackage.Builder());
      i1 = bool3;
      return i1;
    }
  }

  public static boolean a(CharSequence paramCharSequence)
  {
    if (TextUtils.isEmpty(paramCharSequence))
      return false;
    int i1 = paramCharSequence.length();
    for (int i2 = 0; ; i2++)
    {
      if (i2 >= i1)
        return true;
      if (!Character.isDigit(paramCharSequence.charAt(i2)))
        break;
    }
  }

  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[3] = (byte)(paramInt % 256);
    int i1 = paramInt >> 8;
    arrayOfByte[2] = (byte)(i1 % 256);
    int i2 = i1 >> 8;
    arrayOfByte[1] = (byte)(i2 % 256);
    arrayOfByte[0] = (byte)((i2 >> 8) % 256);
    return arrayOfByte;
  }

  public static byte[] a(com.android.volley.toolbox.b paramb, InputStream paramInputStream, int paramInt, boolean paramBoolean)
  {
    if (paramInt >= 0)
      return b(paramb, paramInputStream, paramInt, paramBoolean);
    return c(paramb, paramInputStream, paramInt, paramBoolean);
  }

  private static int b(long paramLong1, long paramLong2)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTimeInMillis(paramLong1);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTimeInMillis(paramLong2);
    return localCalendar1.get(6) - localCalendar2.get(6);
  }

  public static int b(Context paramContext, float paramFloat)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, paramContext.getResources().getDisplayMetrics());
  }

  public static int b(Parcel paramParcel)
  {
    return s(paramParcel, 20293);
  }

  public static int b(com.unionpay.uppay.b paramb, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null);
    for (int i1 = 2; ; i1 = 0)
    {
      List localList = com.unionpay.mpay.utils.e.d(paramJSONObject, "user_cards");
      if (localList.size() > 0)
      {
        paramb.O = new ArrayList();
        for (int i2 = 0; i2 < localList.size(); i2++)
        {
          com.unionpay.pboctransaction.model.a locala = new com.unionpay.pboctransaction.model.a(com.unionpay.mpay.utils.e.a((JSONArray)localList.get(i2), 0), com.unionpay.mpay.utils.e.a((JSONArray)localList.get(i2), 1), com.unionpay.mpay.utils.e.a((JSONArray)localList.get(i2), 2), 0);
          paramb.O.add(locala);
        }
      }
      paramb.P = com.unionpay.mpay.utils.e.c(paramJSONObject, "user_info");
      paramb.o = com.unionpay.mpay.utils.e.c(paramJSONObject, "rules");
      paramb.M = com.unionpay.mpay.utils.e.b(paramJSONObject, "service_url");
      paramb.N = com.unionpay.mpay.utils.e.b(paramJSONObject, "bind_url");
      paramb.aa = com.unionpay.mpay.utils.e.a(paramJSONObject, "pan");
      return i1;
    }
  }

  private static int b(String paramString, int paramInt)
  {
    if (paramInt == 0);
    String str1;
    do
    {
      return paramInt;
      str1 = com.wandoujia.ripple_framework.i.k().e();
    }
    while (TextUtils.isEmpty(str1));
    Resources localResources = com.wandoujia.ripple_framework.i.k().g().getResources();
    String str2 = localResources.getResourcePackageName(paramInt);
    String str3 = localResources.getResourceTypeName(paramInt);
    String str4 = String.format("%s_%s_%s", new Object[] { paramString, str1, localResources.getResourceEntryName(paramInt) });
    int i1 = localResources.getIdentifier(str4, str3, str2);
    if ((i1 == 0) && (GlobalConfig.isDebug()))
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localResources.getResourceName(paramInt);
      arrayOfObject[1] = str1;
      arrayOfObject[2] = str4;
      String str5 = String.format("找不到%s在%s主题下对应的资源%s", arrayOfObject);
      Toast.makeText(com.wandoujia.ripple_framework.i.k().g(), str5, 0).show();
      Log.e("ColorThemeUtil", str5, new Object[0]);
    }
    return i1;
  }

  public static <T extends View> T b(Context paramContext, int paramInt)
  {
    return LayoutInflater.from(paramContext).inflate(paramInt, null);
  }

  public static ObjectAnimator b(Object paramObject, float paramFloat1, float paramFloat2)
  {
    return ObjectAnimator.ofFloat(paramObject, "translationX", new float[] { paramFloat1, paramFloat2 });
  }

  public static String b()
  {
    return b;
  }

  public static String b(int paramInt)
  {
    return a("cd", paramInt);
  }

  private static String b(int paramInt, String paramString1, String paramString2)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString2.getBytes(), "DES");
      Cipher localCipher = Cipher.getInstance("DES");
      localCipher.init(paramInt, localSecretKeySpec);
      if (paramInt == 2);
      byte[] arrayOfByte2;
      for (byte[] arrayOfByte1 = com.alipay.android.app.a.a.a(paramString1); ; arrayOfByte1 = paramString1.getBytes("UTF-8"))
      {
        arrayOfByte2 = localCipher.doFinal(arrayOfByte1);
        if (paramInt != 2)
          break;
        return new String(arrayOfByte2);
      }
      String str = com.alipay.android.app.a.a.a(arrayOfByte2);
      return str;
    }
    catch (Exception localException)
    {
      b(localException);
    }
    return null;
  }

  public static String b(Context paramContext)
  {
    com.alipay.ut.device.a locala = com.alipay.ut.device.b.b(paramContext);
    if (locala == null)
      return "ffffffffffffffffffffffff";
    return locala.f();
  }

  @TargetApi(16)
  public static String b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    Iterator localIterator = com.wandoujia.accessibility.autoinstall.a.d().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramAccessibilityNodeInfo.findAccessibilityNodeInfosByText(str).size() > 0)
        return str;
    }
    return null;
  }

  // ERROR //
  public static String b(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: invokestatic 836	java/lang/System:currentTimeMillis	()J
    //   5: lstore_2
    //   6: invokestatic 3545	com/alipay/wandoujia/b:a	()Lcom/alipay/wandoujia/b;
    //   9: astore 4
    //   11: aload_0
    //   12: invokestatic 3547	android/support/v4/app/b:S	(Ljava/lang/String;)Ljava/lang/String;
    //   15: astore 5
    //   17: aload 5
    //   19: invokestatic 3549	android/support/v4/app/b:R	(Ljava/lang/String;)I
    //   22: istore 6
    //   24: aload 4
    //   26: iload 6
    //   28: invokevirtual 3551	com/alipay/wandoujia/b:a	(I)Z
    //   31: istore 18
    //   33: aload 4
    //   35: iload 6
    //   37: invokevirtual 3554	com/alipay/wandoujia/b:c	(I)Lcom/alipay/wandoujia/a;
    //   40: astore 19
    //   42: aload 19
    //   44: ifnull +112 -> 156
    //   47: iload_1
    //   48: ifeq +15 -> 63
    //   51: aload 19
    //   53: ifnull +10 -> 63
    //   56: aload 4
    //   58: aload 19
    //   60: invokestatic 3557	com/alipay/wandoujia/b:a	(Lcom/alipay/wandoujia/b;Lcom/alipay/wandoujia/a;)V
    //   63: aload 4
    //   65: iload 6
    //   67: invokevirtual 3559	com/alipay/wandoujia/b:b	(I)Lcom/alipay/wandoujia/a;
    //   70: astore 21
    //   72: aload 21
    //   74: astore 9
    //   76: iload 18
    //   78: ifeq +83 -> 161
    //   81: iload_1
    //   82: ifne +79 -> 161
    //   85: aload 9
    //   87: invokevirtual 3564	com/alipay/wandoujia/a:i	()Lcom/alipay/wandoujia/aj;
    //   90: invokevirtual 3568	com/alipay/wandoujia/aj:c	()Z
    //   93: ifeq +68 -> 161
    //   96: invokestatic 717	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   99: invokevirtual 3571	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   102: invokeinterface 3574 1 0
    //   107: ldc_w 3576
    //   110: ldc_w 371
    //   113: invokestatic 3578	android/support/v4/app/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   116: astore 27
    //   118: aload 9
    //   120: ifnull +8 -> 128
    //   123: aload 9
    //   125: invokevirtual 3580	com/alipay/wandoujia/a:h	()V
    //   128: aload 4
    //   130: iload 6
    //   132: invokevirtual 3582	com/alipay/wandoujia/b:d	(I)V
    //   135: invokestatic 3587	com/alipay/a/a/a:a	()Lcom/alipay/a/a/a;
    //   138: getstatic 3593	com/alipay/test/ui/core/EventObject:OnDestroy	Lcom/alipay/test/ui/core/EventObject;
    //   141: iconst_1
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload 5
    //   149: aastore
    //   150: invokevirtual 3597	com/alipay/a/a/a:onChangeEvent	(Lcom/alipay/test/ui/core/EventObject;[Ljava/lang/Object;)V
    //   153: aload 27
    //   155: areturn
    //   156: iconst_0
    //   157: istore_1
    //   158: goto -111 -> 47
    //   161: aload 9
    //   163: invokevirtual 3564	com/alipay/wandoujia/a:i	()Lcom/alipay/wandoujia/aj;
    //   166: invokevirtual 3598	com/alipay/wandoujia/aj:a	()V
    //   169: aload 4
    //   171: invokevirtual 3599	com/alipay/wandoujia/b:b	()V
    //   174: aload 9
    //   176: invokevirtual 3602	com/alipay/wandoujia/a:c	()Lcom/alipay/wandoujia/c;
    //   179: astore 23
    //   181: aload 23
    //   183: aload 5
    //   185: invokevirtual 3605	com/alipay/wandoujia/c:a	(Ljava/lang/String;)V
    //   188: aload 9
    //   190: invokevirtual 3608	com/alipay/wandoujia/a:l	()Lcom/alipay/wandoujia/bc;
    //   193: astore 24
    //   195: aload 24
    //   197: astore 8
    //   199: aload 8
    //   201: ifnull +12 -> 213
    //   204: aload 8
    //   206: aload 9
    //   208: invokeinterface 3613 2 0
    //   213: aload 23
    //   215: invokevirtual 3614	com/alipay/wandoujia/c:c	()Z
    //   218: ifeq +93 -> 311
    //   221: aload 23
    //   223: invokevirtual 3615	com/alipay/wandoujia/c:a	()Ljava/lang/String;
    //   226: astore 25
    //   228: aload 25
    //   230: astore 13
    //   232: aload 8
    //   234: ifnull +12 -> 246
    //   237: aload 8
    //   239: aload 9
    //   241: invokeinterface 3617 2 0
    //   246: aload 9
    //   248: ifnull +8 -> 256
    //   251: aload 9
    //   253: invokevirtual 3580	com/alipay/wandoujia/a:h	()V
    //   256: aload 4
    //   258: iload 6
    //   260: invokevirtual 3582	com/alipay/wandoujia/b:d	(I)V
    //   263: invokestatic 3587	com/alipay/a/a/a:a	()Lcom/alipay/a/a/a;
    //   266: getstatic 3593	com/alipay/test/ui/core/EventObject:OnDestroy	Lcom/alipay/test/ui/core/EventObject;
    //   269: iconst_1
    //   270: anewarray 4	java/lang/Object
    //   273: dup
    //   274: iconst_0
    //   275: aload 5
    //   277: aastore
    //   278: invokevirtual 3597	com/alipay/a/a/a:onChangeEvent	(Lcom/alipay/test/ui/core/EventObject;[Ljava/lang/Object;)V
    //   281: invokestatic 836	java/lang/System:currentTimeMillis	()J
    //   284: lload_2
    //   285: lsub
    //   286: lstore 14
    //   288: invokestatic 2251	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   291: lload 14
    //   293: ldc_w 3619
    //   296: invokevirtual 3621	com/alipay/wandoujia/i:b	(JLjava/lang/String;)V
    //   299: aload 13
    //   301: invokevirtual 1637	java/lang/String:trim	()Ljava/lang/String;
    //   304: pop
    //   305: aload 13
    //   307: invokevirtual 1637	java/lang/String:trim	()Ljava/lang/String;
    //   310: areturn
    //   311: aload 9
    //   313: invokevirtual 3623	com/alipay/wandoujia/a:d	()V
    //   316: goto -103 -> 213
    //   319: astore 7
    //   321: aload 7
    //   323: invokestatic 2111	android/support/v4/app/b:b	(Ljava/lang/Object;)V
    //   326: invokestatic 2251	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   329: aload 7
    //   331: ldc_w 3625
    //   334: invokevirtual 3628	com/alipay/wandoujia/i:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   337: aload 8
    //   339: ifnull +12 -> 351
    //   342: aload 8
    //   344: aload 9
    //   346: invokeinterface 3617 2 0
    //   351: aload 9
    //   353: ifnull +8 -> 361
    //   356: aload 9
    //   358: invokevirtual 3580	com/alipay/wandoujia/a:h	()V
    //   361: aload 4
    //   363: iload 6
    //   365: invokevirtual 3582	com/alipay/wandoujia/b:d	(I)V
    //   368: invokestatic 3587	com/alipay/a/a/a:a	()Lcom/alipay/a/a/a;
    //   371: getstatic 3593	com/alipay/test/ui/core/EventObject:OnDestroy	Lcom/alipay/test/ui/core/EventObject;
    //   374: iconst_1
    //   375: anewarray 4	java/lang/Object
    //   378: dup
    //   379: iconst_0
    //   380: aload 5
    //   382: aastore
    //   383: invokevirtual 3597	com/alipay/a/a/a:onChangeEvent	(Lcom/alipay/test/ui/core/EventObject;[Ljava/lang/Object;)V
    //   386: aconst_null
    //   387: astore 13
    //   389: goto -108 -> 281
    //   392: astore 12
    //   394: aconst_null
    //   395: astore 13
    //   397: goto -116 -> 281
    //   400: astore 17
    //   402: aconst_null
    //   403: astore 8
    //   405: aconst_null
    //   406: astore 9
    //   408: aload 17
    //   410: astore 10
    //   412: aload 8
    //   414: ifnull +12 -> 426
    //   417: aload 8
    //   419: aload 9
    //   421: invokeinterface 3617 2 0
    //   426: aload 9
    //   428: ifnull +8 -> 436
    //   431: aload 9
    //   433: invokevirtual 3580	com/alipay/wandoujia/a:h	()V
    //   436: aload 4
    //   438: iload 6
    //   440: invokevirtual 3582	com/alipay/wandoujia/b:d	(I)V
    //   443: invokestatic 3587	com/alipay/a/a/a:a	()Lcom/alipay/a/a/a;
    //   446: getstatic 3593	com/alipay/test/ui/core/EventObject:OnDestroy	Lcom/alipay/test/ui/core/EventObject;
    //   449: iconst_1
    //   450: anewarray 4	java/lang/Object
    //   453: dup
    //   454: iconst_0
    //   455: aload 5
    //   457: aastore
    //   458: invokevirtual 3597	com/alipay/a/a/a:onChangeEvent	(Lcom/alipay/test/ui/core/EventObject;[Ljava/lang/Object;)V
    //   461: aload 10
    //   463: athrow
    //   464: astore 26
    //   466: goto -185 -> 281
    //   469: astore 11
    //   471: goto -10 -> 461
    //   474: astore 20
    //   476: aload 19
    //   478: astore 9
    //   480: aload 20
    //   482: astore 10
    //   484: aconst_null
    //   485: astore 8
    //   487: goto -75 -> 412
    //   490: astore 22
    //   492: aload 22
    //   494: astore 10
    //   496: aconst_null
    //   497: astore 8
    //   499: goto -87 -> 412
    //   502: astore 10
    //   504: goto -92 -> 412
    //   507: astore 7
    //   509: aconst_null
    //   510: astore 8
    //   512: aconst_null
    //   513: astore 9
    //   515: goto -194 -> 321
    //   518: astore 7
    //   520: aload 19
    //   522: astore 9
    //   524: aconst_null
    //   525: astore 8
    //   527: goto -206 -> 321
    //   530: astore 7
    //   532: aconst_null
    //   533: astore 8
    //   535: goto -214 -> 321
    //   538: astore 28
    //   540: aload 27
    //   542: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   204	213	319	java/lang/Exception
    //   213	228	319	java/lang/Exception
    //   311	316	319	java/lang/Exception
    //   368	386	392	java/lang/Exception
    //   24	42	400	finally
    //   263	281	464	java/lang/Exception
    //   443	461	469	java/lang/Exception
    //   56	63	474	finally
    //   63	72	474	finally
    //   85	118	490	finally
    //   161	195	490	finally
    //   204	213	502	finally
    //   213	228	502	finally
    //   311	316	502	finally
    //   321	337	502	finally
    //   24	42	507	java/lang/Exception
    //   56	63	518	java/lang/Exception
    //   63	72	518	java/lang/Exception
    //   85	118	530	java/lang/Exception
    //   161	195	530	java/lang/Exception
    //   135	153	538	java/lang/Exception
  }

  private static String b(String paramString, Context paramContext, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
      paramInt1 = paramContext.getResources().getDisplayMetrics().widthPixels;
    int i1 = paramString.lastIndexOf('.');
    if (i1 == -1);
    while (true)
    {
      return paramString;
      String str1 = paramString.substring(i1);
      String str2 = paramString.substring(0, i1);
      int i2 = str2.lastIndexOf('_');
      if (i2 == -1)
        continue;
      int i3 = i2 + 1;
      try
      {
        int i4 = Integer.parseInt(str2.substring(i3));
        String str3 = str2.substring(0, i2);
        int i5 = str3.lastIndexOf('_');
        if (i5 == -1)
          continue;
        int i6 = i5 + 1;
        try
        {
          int i7 = Integer.parseInt(str3.substring(i6));
          String str4 = str3.substring(0, i5);
          if ((i4 == 0) || (i7 == 0))
            continue;
          double d1 = paramInt2 / i4;
          double d2 = paramInt1 / i7;
          if (d1 > d2);
          while (d1 <= 1.0D)
          {
            int i8 = (int)(d1 * i4);
            int i9 = (int)(d1 * i7);
            String str5 = str4 + '_' + i9 + "_" + i8 + str1;
            Log.d("ImageUrlBuilder", "Generate thumbnail from " + paramString + " into " + str5, new Object[0]);
            return str5;
            d1 = d2;
          }
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          return paramString;
        }
      }
      catch (NumberFormatException localNumberFormatException1)
      {
      }
    }
    return paramString;
  }

  public static String b(String paramString1, String paramString2)
  {
    return b(2, paramString1, paramString2);
  }

  public static String b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return String.format("\"first_pay_flag\":\"%s\",%s,\"pay_type\":\"%s\",\"pay_mode\":\"%s\"", new Object[] { paramString1, paramString2, paramString3, paramString4 });
  }

  public static String b(HttpResponse paramHttpResponse)
  {
    Header[] arrayOfHeader = paramHttpResponse.getHeaders("Set-Cookie");
    if (arrayOfHeader != null)
    {
      int i1 = arrayOfHeader.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        Header localHeader = arrayOfHeader[i2];
        if (!localHeader.getValue().startsWith("wdj_auth"))
          continue;
        Matcher localMatcher = Pattern.compile("wdj_auth=([^;]*?);").matcher(localHeader.getValue());
        if (localMatcher.find())
          return localMatcher.group(1);
      }
    }
    return "";
  }

  public static String b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    return android.util.Base64.encodeToString(paramArrayOfByte, 0);
  }

  public static List<Model> b(List<String> paramList)
  {
    if (CollectionUtils.isEmpty(paramList))
      return null;
    if (Looper.myLooper() == Looper.getMainLooper())
      throw new IllegalStateException("Must Not Call on UI Thread");
    com.wandoujia.p4.http.b.n localn = new com.wandoujia.p4.http.b.n();
    ((com.wandoujia.p4.http.request.g)localn.getRequestBuilder()).a(paramList).b().c(1);
    try
    {
      List localList = d((List)com.wandoujia.p4.a.b().execute(localn));
      return localList;
    }
    catch (Throwable localThrowable)
    {
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      label76: break label76;
    }
  }

  public static void b(long paramLong)
  {
    p.edit().putLong("key_first_check_update_date", paramLong).apply();
  }

  public static void b(Activity paramActivity, b paramb)
  {
    paramActivity.setExitSharedElementCallback(a(paramb));
  }

  public static void b(Context paramContext, String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
      return;
    NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
    String str = com.sina.weibo.sdk.a.g.a("Weibo", "微博", "微博");
    aw localaw = new aw(paramContext);
    localaw.a();
    localaw.a(System.currentTimeMillis());
    localaw.f = ((BitmapDrawable)com.sina.weibo.sdk.a.g.a(paramContext, "ic_com_sina_weibo_sdk_weibo_logo.png")).getBitmap();
    int i1 = e(paramContext, "com_sina_weibo_sdk_weibo_logo", "drawable");
    Intent localIntent;
    if (i1 > 0)
    {
      localaw.a(i1);
      localaw.a(str);
      localaw.c(paramString1);
      localaw.b(paramString1);
      if (TextUtils.isEmpty(paramString2))
        break label199;
      localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.fromFile(new File(paramString2)), "application/vnd.android.package-archive");
    }
    label199: for (PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 0, localIntent, 16); ; localPendingIntent = PendingIntent.getActivity(paramContext, 0, new Intent(), 16))
    {
      localaw.d = localPendingIntent;
      localNotificationManager.notify(1, localaw.b());
      return;
      i1 = 17301659;
      break;
    }
  }

  public static void b(Parcel paramParcel, int paramInt)
  {
    paramParcel.setDataPosition(a(paramParcel, paramInt) + paramParcel.dataPosition());
  }

  private static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    int i1 = a(paramParcel, paramInt1);
    if (i1 != paramInt2)
      throw new zza.zza("Expected size " + paramInt2 + " got " + i1 + " (0x" + Integer.toHexString(i1) + ")", paramParcel);
  }

  public static void b(View paramView, int paramInt)
  {
    v.b().a(paramView, paramInt);
  }

  public static void b(Object paramObject)
  {
    if (!(paramObject instanceof Exception))
      return;
    com.wandoujia.image.c.a.a().d();
  }

  public static void b(Object paramObject, ArrayList<View> paramArrayList)
  {
    int i1 = 0;
    Transition localTransition = (Transition)paramObject;
    if ((localTransition instanceof TransitionSet))
    {
      TransitionSet localTransitionSet = (TransitionSet)localTransition;
      int i4 = localTransitionSet.getTransitionCount();
      while (i1 < i4)
      {
        b(localTransitionSet.getTransitionAt(i1), paramArrayList);
        i1++;
      }
    }
    if ((!a(localTransition)) && (c(localTransition.getTargets())))
    {
      int i2 = paramArrayList.size();
      for (int i3 = 0; i3 < i2; i3++)
        localTransition.addTarget((View)paramArrayList.get(i3));
    }
  }

  private static void b(ArrayList<View> paramArrayList, View paramView)
  {
    ViewGroup localViewGroup;
    if (paramView.getVisibility() == 0)
    {
      if (!(paramView instanceof ViewGroup))
        break label65;
      localViewGroup = (ViewGroup)paramView;
      if (!localViewGroup.isTransitionGroup())
        break label33;
      paramArrayList.add(localViewGroup);
    }
    while (true)
    {
      return;
      label33: int i1 = localViewGroup.getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
        b(paramArrayList, localViewGroup.getChildAt(i2));
    }
    label65: paramArrayList.add(paramView);
  }

  public static void b(boolean paramBoolean)
  {
    if ((!paramBoolean) && (q != null))
    {
      AbsListView localAbsListView = (AbsListView)q.get();
      if (localAbsListView != null)
        localAbsListView.invalidate();
    }
  }

  public static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt2 == (paramInt1 & paramInt2);
  }

  public static boolean b(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null);
    do
      return false;
    while (paramContext.getPackageManager().queryIntentActivities(paramIntent, 0).size() == 0);
    return true;
  }

  public static boolean b(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i1 = localPackageManager.getApplicationInfo(paramString, 0).flags;
      int i2 = i1 & 0x200000;
      int i3 = 0;
      if (i2 != 0)
        i3 = 1;
      return i3;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static boolean b(View paramView)
  {
    if (!(paramView.getContext() instanceof Activity))
      return true;
    View localView = ((Activity)paramView.getContext()).getWindow().getDecorView();
    if (paramView == localView)
      return true;
    if ((paramView.getWindowToken() != null) && (paramView.getWindowToken() != localView.getWindowToken()))
      return true;
    for (ViewParent localViewParent = paramView.getParent(); localViewParent != null; localViewParent = localViewParent.getParent())
      if (localViewParent == localView)
        return true;
    return false;
  }

  private static byte[] b(com.android.volley.toolbox.b paramb, InputStream paramInputStream, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = new byte[paramInt];
    try
    {
      byte[] arrayOfByte3 = paramb.a(1024);
      int i1 = 0;
      localObject3 = arrayOfByte1;
      while (true)
      {
        if (paramBoolean);
        try
        {
          bool = Thread.interrupted();
          if (!bool)
          {
            int i2 = paramInputStream.read(arrayOfByte3);
            if (i2 != -1)
            {
              if (i2 + i1 > localObject3.length)
              {
                byte[] arrayOfByte4 = new byte[Math.max(2 * (i2 + i1), 1024)];
                System.arraycopy(localObject3, 0, arrayOfByte4, 0, i1);
                localObject3 = arrayOfByte4;
              }
              System.arraycopy(arrayOfByte3, 0, localObject3, i1, i2);
              i1 += i2;
              continue;
            }
          }
          if (!bool)
            break label145;
          throw new InterruptedException();
        }
        finally
        {
          arrayOfByte2 = arrayOfByte3;
        }
      }
      paramb.a(arrayOfByte2);
      throw localObject1;
      label145: if (localObject3.length > i1)
      {
        localObject4 = new byte[i1];
        System.arraycopy(localObject3, 0, localObject4, 0, i1);
        paramb.a(arrayOfByte3);
        return localObject4;
      }
    }
    finally
    {
      while (true)
      {
        Object localObject3;
        byte[] arrayOfByte2 = null;
        continue;
        Object localObject4 = localObject3;
      }
    }
  }

  public static <T> T[] b(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    Object[] arrayOfObject = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i1 + i2);
    return arrayOfObject;
  }

  public static float c(Context paramContext, float paramFloat)
  {
    if (paramContext == null)
      return -1.0F;
    return paramFloat * paramContext.getResources().getDisplayMetrics().density;
  }

  private static int c(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    int i3;
    if (paramInt1 - paramInt2 > paramInt2)
      i3 = paramInt1 - paramInt2;
    int i4;
    while (true)
    {
      i4 = i1;
      while (paramInt1 > i3)
      {
        i4 *= paramInt1;
        if (i1 <= paramInt2)
        {
          i4 /= i1;
          i1++;
        }
        paramInt1--;
      }
      int i2 = paramInt1 - paramInt2;
      i3 = paramInt2;
      paramInt2 = i2;
    }
    while (true)
    {
      if (i1 <= paramInt2)
      {
        i5 /= i1;
        i1++;
        continue;
      }
      return i5;
      int i5 = i4;
    }
  }

  public static Bitmap c(Context paramContext, int paramInt)
  {
    Bitmap localBitmap1 = BitmapFactory.decodeResource(paramContext.getResources(), 2130838053);
    Paint localPaint1 = new Paint();
    localPaint1.setAntiAlias(true);
    Bitmap localBitmap2 = ImageUtil.creatBitmapSafty(localBitmap1.getWidth(), localBitmap1.getHeight(), Bitmap.Config.ARGB_8888);
    if (localBitmap2 == null)
      return localBitmap1;
    Canvas localCanvas1 = new Canvas(localBitmap2);
    localCanvas1.drawBitmap(localBitmap1, 0.0F, 0.0F, localPaint1);
    float f1 = (int)(0.525F * localBitmap2.getHeight());
    String str = String.valueOf(paramInt);
    float f2 = 0.65F * f1;
    Paint localPaint2 = new Paint();
    localPaint2.setColor(-1);
    localPaint2.setTextSize(f2);
    localPaint2.setAntiAlias(true);
    Rect localRect = new Rect();
    localPaint2.getTextBounds(str, 0, str.length(), localRect);
    float f3 = 0.4F * localRect.width();
    float f4 = 0.4F * localRect.width() + (f3 + localRect.width());
    if (f4 < 1.2F * f1)
      f4 = 1.2F * f1;
    Bitmap localBitmap3 = BitmapFactory.decodeResource(paramContext.getResources(), 2130837540);
    NinePatch localNinePatch = new NinePatch(localBitmap3, localBitmap3.getNinePatchChunk(), null);
    Bitmap localBitmap4 = ImageUtil.creatBitmapSafty((int)f4, (int)f1, Bitmap.Config.ARGB_8888);
    if (localBitmap4 == null);
    for (Bitmap localBitmap5 = localBitmap3; ; localBitmap5 = localBitmap4)
    {
      localCanvas1.drawBitmap(localBitmap5, localBitmap2.getWidth() - localBitmap5.getWidth(), 0.0F, localPaint1);
      return localBitmap2;
      Canvas localCanvas2 = new Canvas(localBitmap4);
      localNinePatch.draw(localCanvas2, new Rect(0, 0, (int)f4, (int)f1));
      localCanvas2.drawText(str, f4 / 2.0F - localRect.centerX(), f1 / 2.0F - localRect.centerY(), localPaint2);
    }
  }

  // ERROR //
  private static com.wandoujia.a.b c(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokestatic 3938	android/support/v4/app/b:d	(Ljava/lang/String;I)Lcom/wandoujia/a/a;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnonnull +5 -> 12
    //   10: aconst_null
    //   11: areturn
    //   12: new 3940	java/io/FileInputStream
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 3941	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual 3944	java/io/FileInputStream:available	()I
    //   25: istore 13
    //   27: aload_2
    //   28: invokevirtual 3948	com/wandoujia/a/a:c	()I
    //   31: newarray byte
    //   33: astore 14
    //   35: aload_3
    //   36: iload 13
    //   38: bipush 16
    //   40: isub
    //   41: aload_2
    //   42: invokevirtual 3948	com/wandoujia/a/a:c	()I
    //   45: isub
    //   46: iload_1
    //   47: isub
    //   48: i2l
    //   49: invokevirtual 3952	java/io/FileInputStream:skip	(J)J
    //   52: pop2
    //   53: aload_3
    //   54: aload 14
    //   56: invokevirtual 3953	java/io/FileInputStream:read	([B)I
    //   59: pop
    //   60: new 3955	com/wandoujia/a/b
    //   63: dup
    //   64: aload_2
    //   65: new 131	java/lang/String
    //   68: dup
    //   69: aload 14
    //   71: invokespecial 3522	java/lang/String:<init>	([B)V
    //   74: invokespecial 3958	com/wandoujia/a/b:<init>	(Lcom/wandoujia/a/a;Ljava/lang/String;)V
    //   77: astore 18
    //   79: aload_3
    //   80: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   83: aload 18
    //   85: areturn
    //   86: astore 23
    //   88: aconst_null
    //   89: astore 5
    //   91: aload 5
    //   93: ifnull -83 -> 10
    //   96: aload 5
    //   98: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   101: aconst_null
    //   102: areturn
    //   103: astore 6
    //   105: aconst_null
    //   106: areturn
    //   107: astore 22
    //   109: aconst_null
    //   110: astore_3
    //   111: aload_3
    //   112: ifnull -102 -> 10
    //   115: aload_3
    //   116: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   119: aconst_null
    //   120: areturn
    //   121: astore 8
    //   123: aconst_null
    //   124: areturn
    //   125: astore 21
    //   127: aconst_null
    //   128: astore_3
    //   129: aload_3
    //   130: ifnull -120 -> 10
    //   133: aload_3
    //   134: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   137: aconst_null
    //   138: areturn
    //   139: astore 10
    //   141: aconst_null
    //   142: areturn
    //   143: astore 20
    //   145: aconst_null
    //   146: astore_3
    //   147: aload 20
    //   149: astore 11
    //   151: aload_3
    //   152: ifnull +7 -> 159
    //   155: aload_3
    //   156: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   159: aload 11
    //   161: athrow
    //   162: astore 19
    //   164: goto -81 -> 83
    //   167: astore 12
    //   169: goto -10 -> 159
    //   172: astore 11
    //   174: goto -23 -> 151
    //   177: astore 9
    //   179: goto -50 -> 129
    //   182: astore 7
    //   184: goto -73 -> 111
    //   187: astore 4
    //   189: aload_3
    //   190: astore 5
    //   192: goto -101 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   12	21	86	java/io/FileNotFoundException
    //   96	101	103	java/io/IOException
    //   12	21	107	java/io/IOException
    //   115	119	121	java/io/IOException
    //   12	21	125	java/lang/Exception
    //   133	137	139	java/io/IOException
    //   12	21	143	finally
    //   79	83	162	java/io/IOException
    //   155	159	167	java/io/IOException
    //   21	79	172	finally
    //   21	79	177	java/lang/Exception
    //   21	79	182	java/io/IOException
    //   21	79	187	java/io/FileNotFoundException
  }

  public static com.wandoujia.p4.community.utils.a c(Context paramContext)
  {
    if (paramContext != null)
      return new com.wandoujia.p4.community.utils.a(paramContext, com.alipay.ut.a.a, "Alvin2");
    return null;
  }

  public static <T> T c(T paramT)
  {
    if (paramT == null)
      throw new NullPointerException();
    return paramT;
  }

  public static String c(int paramInt)
  {
    return a("cm", paramInt);
  }

  private static String c(Context paramContext, Intent paramIntent)
  {
    Iterator localIterator = paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      if ((localResolveInfo != null) && (localResolveInfo.activityInfo != null) && (localResolveInfo.activityInfo.applicationInfo != null) && (JupiterApplication.d().getApplicationContext().getPackageName().equals(localResolveInfo.activityInfo.applicationInfo.packageName)))
        return localResolveInfo.activityInfo.name;
    }
    return null;
  }

  public static String c(Context paramContext, String paramString)
  {
    while (true)
    {
      PackageInfo localPackageInfo;
      int i1;
      try
      {
        localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 64);
        i1 = 0;
        if (i1 >= localPackageInfo.signatures.length)
          return null;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        return null;
      }
      byte[] arrayOfByte = localPackageInfo.signatures[i1].toByteArray();
      if (arrayOfByte != null)
        return com.sina.weibo.sdk.a.f.a(arrayOfByte);
      i1++;
    }
  }

  public static String c(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
      return paramString2;
    String str1 = d.a(paramString1, com.wandoujia.image.c.a.a().c().f());
    com.wandoujia.image.c.a.a().d();
    String str2 = com.alipay.android.app.a.b.a(paramString1, paramString2);
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(str1.length());
    arrayOfObject[1] = str1;
    arrayOfObject[2] = Integer.valueOf(str2.length());
    arrayOfObject[3] = str2;
    return String.format(localLocale, "%08X%s%08X%s", arrayOfObject);
  }

  public static String c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if ((paramString3 != null) && (paramString3.length() > 0))
      return String.format("\"pay_type\":\"%s\",\"pay_mode\":\"%s\",%s,%s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    return String.format("\"pay_type\":\"%s\",\"pay_mode\":\"%s\",%s", new Object[] { paramString1, paramString2, paramString4 });
  }

  public static String c(HttpResponse paramHttpResponse)
  {
    Header[] arrayOfHeader = paramHttpResponse.getHeaders("Set-Cookie");
    if (arrayOfHeader != null)
    {
      int i1 = arrayOfHeader.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        String str = arrayOfHeader[i2].getValue();
        if (str.startsWith("seccode_key"))
          return str.substring(12, str.length());
      }
    }
    return "";
  }

  public static String c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    return android.util.Base64.encodeToString(paramArrayOfByte, 10);
  }

  public static <T> ArrayList<T> c(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    ArrayList localArrayList = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i1 + i2);
    return localArrayList;
  }

  public static void c()
  {
    com.wandoujia.image.c.a.a().d();
  }

  public static void c(long paramLong)
  {
    p.edit().putLong("key_last_ignore_update_time", paramLong).apply();
  }

  public static void c(Context paramContext, String paramString1, String paramString2)
  {
    if (paramContext != null)
      new AlertDialog.Builder(paramContext).setTitle(paramString1).setMessage(paramString2).create().show();
  }

  private static void c(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(0xFFFF0000 | paramInt1);
      paramParcel.writeInt(paramInt2);
      return;
    }
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }

  public static void c(View paramView)
  {
    if (PopupLogTreeBuilder.b(paramView) != null);
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      PopupLogTreeBuilder.b(paramView);
      throw new IllegalStateException("The anchor view of popup window must be specified.");
    }
    if (!b(paramView))
      throw new IllegalStateException("View must be attached to decor view.");
  }

  public static void c(View paramView, int paramInt)
  {
    int i1 = b("CT", paramInt);
    if ((i1 != 0) && (paramView != null))
      paramView.setBackgroundResource(i1);
  }

  public static boolean c(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 4);
    return paramParcel.readInt() != 0;
  }

  public static boolean c(String paramString)
  {
    if (paramString != null)
      paramString = paramString.trim();
    return (paramString == null) || ("".equals(paramString)) || (paramString.length() == 0);
  }

  private static boolean c(List paramList)
  {
    return (paramList == null) || (paramList.isEmpty());
  }

  private static byte[] c(com.android.volley.toolbox.b paramb, InputStream paramInputStream, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    w localw = new w(paramb, paramInt);
    byte[] arrayOfByte1 = null;
    try
    {
      arrayOfByte1 = paramb.a(1024);
      while (true)
      {
        if (paramBoolean)
        {
          bool = Thread.interrupted();
          if (bool)
            break;
        }
        int i1 = paramInputStream.read(arrayOfByte1);
        if (i1 == -1)
          break;
        localw.write(arrayOfByte1, 0, i1);
        if (paramInt <= 0)
          continue;
      }
      if (bool)
        throw new InterruptedException();
    }
    finally
    {
      paramb.a(arrayOfByte1);
      localw.close();
    }
    byte[] arrayOfByte2 = localw.toByteArray();
    paramb.a(arrayOfByte1);
    localw.close();
    return arrayOfByte2;
  }

  public static int d(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }

  private static Bitmap d(Context paramContext, int paramInt)
  {
    return com.wandoujia.launcher_base.utils.f.a(ImageUtil.decodeBitmapFromDrawble(paramContext.getResources().getDrawable(paramInt), new Bitmap.Config[0]), paramContext);
  }

  // ERROR //
  private static com.wandoujia.a.a d(String paramString, int paramInt)
  {
    // Byte code:
    //   0: new 3940	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 3941	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: aload_2
    //   10: invokevirtual 3944	java/io/FileInputStream:available	()I
    //   13: istore 10
    //   15: bipush 16
    //   17: newarray byte
    //   19: astore 11
    //   21: aload_2
    //   22: iload 10
    //   24: bipush 16
    //   26: isub
    //   27: iload_1
    //   28: isub
    //   29: i2l
    //   30: invokevirtual 3952	java/io/FileInputStream:skip	(J)J
    //   33: pop2
    //   34: aload_2
    //   35: aload 11
    //   37: invokevirtual 3953	java/io/FileInputStream:read	([B)I
    //   40: pop
    //   41: aload 11
    //   43: invokestatic 4056	com/wandoujia/a/a:a	([B)Lcom/wandoujia/a/a;
    //   46: astore 15
    //   48: aload 15
    //   50: astore 4
    //   52: aload_2
    //   53: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   56: aload 4
    //   58: areturn
    //   59: astore 19
    //   61: aconst_null
    //   62: astore_2
    //   63: aconst_null
    //   64: astore 4
    //   66: aload_2
    //   67: ifnull -11 -> 56
    //   70: aload_2
    //   71: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   74: aconst_null
    //   75: areturn
    //   76: astore 5
    //   78: aconst_null
    //   79: areturn
    //   80: astore 18
    //   82: aconst_null
    //   83: astore_2
    //   84: aconst_null
    //   85: astore 4
    //   87: aload_2
    //   88: ifnull -32 -> 56
    //   91: aload_2
    //   92: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   95: aconst_null
    //   96: areturn
    //   97: astore 7
    //   99: aconst_null
    //   100: areturn
    //   101: astore 17
    //   103: aconst_null
    //   104: astore_2
    //   105: aload 17
    //   107: astore 8
    //   109: aload_2
    //   110: ifnull +7 -> 117
    //   113: aload_2
    //   114: invokevirtual 3959	java/io/FileInputStream:close	()V
    //   117: aload 8
    //   119: athrow
    //   120: astore 16
    //   122: aload 4
    //   124: areturn
    //   125: astore 9
    //   127: goto -10 -> 117
    //   130: astore 8
    //   132: goto -23 -> 109
    //   135: astore 6
    //   137: goto -53 -> 84
    //   140: astore_3
    //   141: goto -78 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	59	java/io/FileNotFoundException
    //   70	74	76	java/io/IOException
    //   0	9	80	java/io/IOException
    //   91	95	97	java/io/IOException
    //   0	9	101	finally
    //   52	56	120	java/io/IOException
    //   113	117	125	java/io/IOException
    //   9	48	130	finally
    //   9	48	135	java/io/IOException
    //   9	48	140	java/io/FileNotFoundException
  }

  public static Boolean d(View paramView)
  {
    ViewParent localViewParent;
    for (Object localObject = paramView.getParent(); (localObject != null) && ((localObject instanceof ViewGroup)); localObject = localViewParent)
    {
      if (v.s((ViewGroup)localObject))
        return Boolean.valueOf(false);
      if (((localObject instanceof ViewPager)) && (a((ViewPager)localObject) != paramView))
        return Boolean.valueOf(false);
      View localView = (View)localObject;
      localViewParent = localView.getParent();
      paramView = localView;
    }
    return (Boolean)null;
  }

  public static String d(int paramInt)
  {
    return a("&pr", paramInt);
  }

  public static String d(Context paramContext, String paramString)
  {
    com.sina.weibo.sdk.a.a locala = com.sina.weibo.sdk.a.a.a(paramContext);
    String str = locala.a();
    if (!TextUtils.isEmpty(str))
      return str;
    locala.a(paramString);
    return "";
  }

  public static String d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    try
    {
      String str = URLEncoder.encode(paramString2, "UTF-8");
      paramString2 = str;
      label12: return String.format("http://www.wandoujia.com/report?packageName=%1$s&title=%2$s&defaultApk=%3$s&versionName=%4$s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    }
    catch (Exception localException)
    {
      break label12;
    }
  }

  public static String d(byte[] paramArrayOfByte)
  {
    int i1 = 0;
    char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      byte[] arrayOfByte = localMessageDigest.digest();
      int i2 = arrayOfByte.length;
      char[] arrayOfChar2 = new char[i2 * 2];
      int i3 = 0;
      while (i1 < i2)
      {
        int i4 = arrayOfByte[i1];
        int i5 = i3 + 1;
        arrayOfChar2[i3] = arrayOfChar1[(0xF & i4 >>> 4)];
        i3 = i5 + 1;
        arrayOfChar2[i5] = arrayOfChar1[(i4 & 0xF)];
        i1++;
      }
      String str = new String(arrayOfChar2);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private static List<Model> d(List<GoldenCardModel> paramList)
  {
    if (CollectionUtils.isEmpty(paramList))
      return null;
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      GoldenCardModel localGoldenCardModel = (GoldenCardModel)localIterator.next();
      Entity.Builder localBuilder = new Entity.Builder();
      AppDetail localAppDetail = new AppDetail.Builder().package_name(localGoldenCardModel.getApp().getPackageName()).build();
      localBuilder.detail(new Detail.Builder().app_detail(localAppDetail).build());
      localBuilder.content_type(ContentTypeEnum.ContentType.BANNER);
      localBuilder.template_type(TemplateTypeEnum.TemplateType.INTRODUCTION);
      localBuilder.id(Long.valueOf(localGoldenCardModel.getId()));
      ArrayList localArrayList2 = new ArrayList();
      localArrayList2.add(new Image.Builder().url(localGoldenCardModel.getImage()).build());
      localBuilder.cover(localArrayList2);
      localBuilder.title(localGoldenCardModel.getTitle());
      localBuilder.sub_title(localGoldenCardModel.getSubtitle());
      localBuilder.action(new Action.Builder().intent(localGoldenCardModel.getUri()).build());
      localArrayList1.add(new Model(localBuilder.build()));
    }
    return localArrayList1;
  }

  public static void d()
  {
    com.wandoujia.image.c.a.a().d();
  }

  public static void d(Context paramContext)
  {
    com.wandoujia.image.c.a.a().a(paramContext, com.alipay.wandoujia.g.z());
  }

  public static void d(Context paramContext, String paramString1, String paramString2)
  {
    paramContext.startActivity(f(paramContext, paramString1, paramString2));
  }

  // ERROR //
  public static void d(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 149	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 2230	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: new 4176	java/io/FileWriter
    //   12: dup
    //   13: aload_2
    //   14: iconst_0
    //   15: invokespecial 4179	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   18: astore_3
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 4181	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   24: aload_3
    //   25: invokevirtual 4182	java/io/FileWriter:close	()V
    //   28: return
    //   29: astore 4
    //   31: aconst_null
    //   32: astore_3
    //   33: aload 4
    //   35: invokevirtual 4185	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   38: pop
    //   39: aload_3
    //   40: invokevirtual 4182	java/io/FileWriter:close	()V
    //   43: return
    //   44: astore 5
    //   46: aconst_null
    //   47: astore_3
    //   48: aload_3
    //   49: invokevirtual 4182	java/io/FileWriter:close	()V
    //   52: aload 5
    //   54: athrow
    //   55: astore 5
    //   57: goto -9 -> 48
    //   60: astore 4
    //   62: goto -29 -> 33
    //
    // Exception table:
    //   from	to	target	type
    //   9	19	29	java/lang/Exception
    //   9	19	44	finally
    //   19	24	55	finally
    //   33	39	55	finally
    //   19	24	60	java/lang/Exception
  }

  public static boolean d(String paramString)
  {
    int i2;
    int i1;
    if (paramString != null)
    {
      i2 = paramString.length();
      if (i2 != 0);
    }
    else
    {
      i1 = 1;
      return i1;
    }
    for (int i3 = 0; ; i3++)
    {
      if (i3 >= i2)
        return true;
      boolean bool = Character.isWhitespace(paramString.charAt(i3));
      i1 = 0;
      if (!bool)
        break;
    }
  }

  private static int e(Context paramContext, String paramString1, String paramString2)
  {
    String str = paramContext.getApplicationContext().getPackageName();
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i1 = localPackageManager.getResourcesForApplication(str).getIdentifier(paramString1, paramString2, str);
      return i1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return 0;
  }

  public static long e(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }

  private static Rect e(View paramView)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    localRect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
    return localRect;
  }

  public static String e(int paramInt)
  {
    return a("pr", paramInt);
  }

  public static String e(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      String str = localPackageManager.getPackageInfo(paramString, 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  public static String e(String paramString)
  {
    int i1 = 0;
    try
    {
      if (d(paramString))
        return null;
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes("UTF-8"));
      byte[] arrayOfByte = localMessageDigest.digest();
      StringBuilder localStringBuilder = new StringBuilder();
      while (true)
      {
        if (i1 >= 16)
          return localStringBuilder.toString();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Byte.valueOf(arrayOfByte[i1]);
        localStringBuilder.append(String.format("%02x", arrayOfObject));
        i1++;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String e(String paramString1, String paramString2)
  {
    try
    {
      byte[] arrayOfByte2 = h(paramString1.getBytes());
      byte[] arrayOfByte3 = paramString2.getBytes();
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(arrayOfByte2, "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(1, localSecretKeySpec, new IvParameterSpec(new byte[localCipher.getBlockSize()]));
      byte[] arrayOfByte4 = localCipher.doFinal(arrayOfByte3);
      arrayOfByte1 = arrayOfByte4;
      String str = null;
      if (arrayOfByte1 != null)
        str = i(arrayOfByte1);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
        byte[] arrayOfByte1 = null;
    }
  }

  public static void e()
  {
    com.wandoujia.image.c.a.a().d();
  }

  public static boolean e(Context paramContext)
  {
    return (paramContext == null) || (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0);
  }

  public static boolean e(byte[] paramArrayOfByte)
  {
    File localFile1 = new File(Environment.getExternalStorageDirectory(), "UPPay");
    localFile1.mkdir();
    File localFile2 = new File(localFile1, "UPPayPluginEx.apk");
    try
    {
      localFile2.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
      localFileOutputStream.write(paramArrayOfByte);
      localFileOutputStream.close();
      return true;
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }

  public static int f(Context paramContext, String paramString)
  {
    return g(e(paramContext, "com.tencent.mobileqq"), paramString);
  }

  public static int f(byte[] paramArrayOfByte)
  {
    return (0xFF & paramArrayOfByte[0]) << 24 | (0xFF & paramArrayOfByte[1]) << 16 | (0xFF & paramArrayOfByte[2]) << 8 | (0xFF & paramArrayOfByte[3]) << 0;
  }

  private static Intent f(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
    String str = c(paramContext, localIntent);
    if (!TextUtils.isEmpty(str));
    try
    {
      localIntent.setClass(paramContext, Class.forName(str));
      while (true)
      {
        label41: if (!TextUtils.isEmpty(paramString2))
          localIntent.putExtra("phoenix.intent.extra.TITLE", paramString2);
        localIntent.putExtra("phoenix.intent.extra.URL", paramString1);
        return localIntent;
        localIntent.setClass(paramContext, CampaignActivity.class);
        localIntent.setAction("phoenix.intent.action.CAMPAIGN_WEBVIEW");
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label41;
    }
  }

  public static String f(int paramInt)
  {
    return a("&promo", paramInt);
  }

  public static String f(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(paramString), "UTF-8"));
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
        {
          localBufferedReader.close();
          label49: return localStringBuilder.toString();
        }
        localStringBuilder.append(str);
      }
    }
    catch (IOException localIOException)
    {
      break label49;
    }
  }

  public static String f(String paramString1, String paramString2)
  {
    try
    {
      byte[] arrayOfByte1 = h(paramString1.getBytes());
      int i1 = paramString2.length() / 2;
      byte[] arrayOfByte2 = new byte[i1];
      for (int i2 = 0; i2 < i1; i2++)
        arrayOfByte2[i2] = Integer.valueOf(paramString2.substring(i2 * 2, 2 + i2 * 2), 16).byteValue();
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(arrayOfByte1, "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(2, localSecretKeySpec, new IvParameterSpec(new byte[localCipher.getBlockSize()]));
      String str = new String(localCipher.doFinal(arrayOfByte2));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static BigInteger f(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i1 + i2);
    return new BigInteger(arrayOfByte);
  }

  public static void f()
  {
    com.wandoujia.image.c.a.a().d();
  }

  public static boolean f(Context paramContext)
  {
    if (paramContext != null)
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      return (localNetworkInfo != null) && (1 == localNetworkInfo.getType()) && (localNetworkInfo.isConnected());
    }
    return false;
  }

  public static float g(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }

  public static int g(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null))
      return 0;
    if ((paramString1 != null) && (paramString2 == null))
      return 1;
    if ((paramString1 == null) && (paramString2 != null))
      return -1;
    String[] arrayOfString1 = paramString1.split("\\.");
    String[] arrayOfString2 = paramString2.split("\\.");
    for (int i1 = 0; ; i1++)
    {
      int i3;
      int i4;
      try
      {
        if ((i1 < arrayOfString1.length) && (i1 < arrayOfString2.length))
        {
          i3 = Integer.parseInt(arrayOfString1[i1]);
          i4 = Integer.parseInt(arrayOfString2[i1]);
          if (i3 < i4)
            return -1;
        }
        else
        {
          if (arrayOfString1.length > i1)
            return 1;
          int i2 = arrayOfString2.length;
          if (i2 <= i1)
            break;
          return -1;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        return paramString1.compareTo(paramString2);
      }
      if (i3 > i4)
        return 1;
    }
  }

  public static com.unipay.e.a.a g(byte[] paramArrayOfByte)
  {
    com.unipay.e.a.a locala = new com.unipay.e.a.a();
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
    while (true)
    {
      try
      {
        int i1 = localDataInputStream.readInt();
        if (i1 > 1000)
        {
          return null;
          if (i2 >= i1)
            continue;
          com.unipay.e.a.e locale = com.unipay.e.a.e.a(localDataInputStream);
          if (locale == null)
            break label89;
          locala.a(locale);
          break label89;
          localByteArrayInputStream.close();
          localDataInputStream.close();
          return locala;
        }
      }
      catch (IOException localIOException)
      {
        return locala;
      }
      int i2 = 0;
      continue;
      label89: i2++;
    }
  }

  public static String g(int paramInt)
  {
    return a("promo", paramInt);
  }

  public static String g(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      paramString = "";
    do
      return paramString;
    while (C(paramString));
    String str = W(paramString);
    if (TextUtils.isEmpty(str))
      return "";
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(true);
    arrayOfObject[1] = a(str, paramContext, 0, 0);
    return String.format("offline://hack?force=%b&url=%s", arrayOfObject);
  }

  public static String g(String paramString)
  {
    try
    {
      byte[] arrayOfByte1 = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(paramString.length()).array();
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramString.length());
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramString.getBytes("UTF-8"));
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      byte[] arrayOfByte2 = new byte[4 + localByteArrayOutputStream.toByteArray().length];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 4);
      System.arraycopy(localByteArrayOutputStream.toByteArray(), 0, arrayOfByte2, 4, localByteArrayOutputStream.toByteArray().length);
      String str = android.util.Base64.encodeToString(arrayOfByte2, 8);
      return str;
    }
    catch (Exception localException)
    {
      localException.getMessage();
    }
    return "";
  }

  public static void g()
  {
    com.wandoujia.image.c.a.a().d();
  }

  public static void g(Context paramContext)
  {
    CookieSyncManager.createInstance(paramContext);
    CookieManager.getInstance().removeAllCookie();
    CookieSyncManager.getInstance().sync();
  }

  public static double h(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 8);
    return paramParcel.readDouble();
  }

  public static String h(int paramInt)
  {
    return a("pi", paramInt);
  }

  public static String h(Context paramContext)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Android");
    localStringBuilder.append("__");
    localStringBuilder.append("weibo");
    localStringBuilder.append("__");
    localStringBuilder.append("sdk");
    localStringBuilder.append("__");
    try
    {
      localStringBuilder.append(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 16).versionName.replaceAll("\\s+", "_"));
      return localStringBuilder.toString();
    }
    catch (Exception localException)
    {
      while (true)
        localStringBuilder.append("unknown");
    }
  }

  public static HashMap<String, String> h(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(paramString1))
      localHashMap.put(paramString1, paramString2);
    return localHashMap;
  }

  public static void h()
  {
    com.wandoujia.image.c.a.a().d();
  }

  public static boolean h(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, false);
  }

  public static byte[] h(String paramString)
  {
    return l(paramString, "UTF-8");
  }

  private static byte[] h(byte[] paramArrayOfByte)
  {
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
    SecureRandom localSecureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
    localSecureRandom.setSeed(paramArrayOfByte);
    localKeyGenerator.init(128, localSecureRandom);
    return localKeyGenerator.generateKey().getEncoded();
  }

  public static String i(int paramInt)
  {
    return a("&il", paramInt);
  }

  public static String i(String paramString1, String paramString2)
  {
    String str1 = AppManager.a(paramString1);
    if (TextUtils.isEmpty(str1))
    {
      FileUtil.deletePath(paramString1);
      return null;
    }
    PackageInfo localPackageInfo = K(paramString2);
    if (localPackageInfo == null)
    {
      FileUtil.deletePath(paramString1);
      return null;
    }
    String str2 = localPackageInfo.applicationInfo.sourceDir;
    try
    {
      com.wandoujia.appmanager.a.a().a(str2, paramString1, str1);
      LocalAppInfo localLocalAppInfo = AppManager.a().f(paramString2);
      if ((localLocalAppInfo != null) && (localLocalAppInfo.getUpgradeInfo() != null) && (localLocalAppInfo.getUpgradeInfo().hasPatch()))
      {
        localLocalAppInfo.getUpgradeInfo().getFullSize();
        localLocalAppInfo.getUpgradeInfo().getPatchSize();
      }
      return str1;
    }
    catch (Exception localException)
    {
      FileUtil.deletePath(paramString1);
    }
    return null;
  }

  private static String i(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return "";
    StringBuffer localStringBuffer = new StringBuffer(2 * paramArrayOfByte.length);
    for (int i1 = 0; i1 < paramArrayOfByte.length; i1++)
    {
      int i2 = paramArrayOfByte[i1];
      localStringBuffer.append("0123456789ABCDEF".charAt(0xF & i2 >> 4)).append("0123456789ABCDEF".charAt(i2 & 0xF));
    }
    return localStringBuffer.toString();
  }

  public static BigDecimal i(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    byte[] arrayOfByte = paramParcel.createByteArray();
    int i3 = paramParcel.readInt();
    paramParcel.setDataPosition(i1 + i2);
    return new BigDecimal(new BigInteger(arrayOfByte), i3);
  }

  public static void i()
  {
    com.wandoujia.image.c.a.a().d();
  }

  public static boolean i(Context paramContext)
  {
    try
    {
      Locale localLocale = paramContext.getResources().getConfiguration().locale;
      boolean bool;
      if ((!Locale.CHINA.equals(localLocale)) && (!Locale.CHINESE.equals(localLocale)) && (!Locale.SIMPLIFIED_CHINESE.equals(localLocale)))
        bool = Locale.TAIWAN.equals(localLocale);
      return bool;
    }
    catch (Exception localException)
    {
    }
    return true;
  }

  public static boolean i(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, true);
  }

  public static boolean i(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }

  public static long j(String paramString)
  {
    try
    {
      long l1 = DateUtils.parseDate(paramString).getTime();
      return l1;
    }
    catch (DateParseException localDateParseException)
    {
    }
    return 0L;
  }

  public static String j(int paramInt)
  {
    return a("il", paramInt);
  }

  public static String j(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i1 + i2);
    return str;
  }

  public static void j(Context paramContext)
  {
    d = paramContext;
  }

  public static boolean j()
  {
    String str = Environment.getExternalStorageState();
    if ((str != null) && (str.length() > 0));
    for (int i1 = 0; (i1 == 0) && ((str.equals("mounted")) || (str.equals("mounted_ro"))) && (Environment.getExternalStorageDirectory() != null); i1 = 1)
      return true;
    return false;
  }

  public static boolean j(Context paramContext, String paramString)
  {
    String[] arrayOfString = paramContext.fileList();
    for (int i1 = 0; ; i1++)
    {
      int i2 = arrayOfString.length;
      int i3 = 0;
      if (i1 < i2)
      {
        if (!arrayOfString[i1].equals(paramString))
          continue;
        i3 = 1;
      }
      return i3;
    }
  }

  public static boolean j(String paramString1, String paramString2)
  {
    int i1;
    if (TextUtils.equals(paramString1, paramString2))
      i1 = 1;
    do
    {
      do
      {
        return i1;
        i1 = 0;
      }
      while (paramString1 == null);
      i1 = 0;
    }
    while (paramString2 == null);
    int i2 = paramString1.indexOf("?");
    if (i2 != -1)
      paramString1 = paramString1.substring(0, i2);
    int i3 = paramString2.indexOf("?");
    if (i3 != -1)
      paramString2 = paramString2.substring(0, i3);
    return TextUtils.equals(paramString1, paramString2);
  }

  public static Bundle k(String paramString)
  {
    try
    {
      URL localURL = new URL(paramString);
      Bundle localBundle = V(localURL.getQuery());
      localBundle.putAll(V(localURL.getRef()));
      return localBundle;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return new Bundle();
  }

  public static IBinder k(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    IBinder localIBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i1 + i2);
    return localIBinder;
  }

  public static String k(int paramInt)
  {
    if (paramInt == 10103)
      return "shareToQQ";
    if (paramInt == 10104)
      return "shareToQzone";
    if (paramInt == 10105)
      return "addToQQFavorites";
    if (paramInt == 10106)
      return "sendToMyComputer";
    if (paramInt == 10107)
      return "shareToTroopBar";
    if (paramInt == 11101)
      return "action_login";
    if (paramInt == 10100)
      return "action_request";
    return null;
  }

  public static String k(Context paramContext)
  {
    Activity localActivity = (Activity)paramContext;
    PackageManager localPackageManager = localActivity.getPackageManager();
    try
    {
      String str = localPackageManager.getPackageInfo(localActivity.getPackageName(), 4160).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return "1.8.0";
  }

  public static String k(Context paramContext, String paramString)
  {
    try
    {
      String str2;
      if (!SystemUtil.isSDCardMounted())
      {
        String str3 = paramContext.getFilesDir().getAbsolutePath();
        str2 = str3;
      }
      String str1;
      boolean bool;
      do
      {
        return str2;
        str1 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + paramString + "/";
        File localFile = new File(str1);
        if (localFile.exists())
          break;
        bool = localFile.mkdirs();
        str2 = null;
      }
      while (!bool);
      return str1;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static void k(String paramString1, String paramString2)
  {
    p.edit().putString(paramString1, paramString2).apply();
  }

  public static boolean k()
  {
    String str = Environment.getExternalStorageState();
    if ((!i(str)) && ((str.equals("mounted")) || (str.equals("mounted_ro"))))
    {
      File localFile = Environment.getExternalStorageDirectory();
      if ((localFile != null) && (new File(localFile, com.alipay.ut.a.a + File.separator + "Alvin2.xml").exists()))
        return true;
    }
    return false;
  }

  public static int l()
  {
    try
    {
      int i1 = Integer.parseInt(Build.VERSION.SDK);
      return i1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      com.google.android.gms.analytics.internal.f.a("Invalid version number", Build.VERSION.SDK);
    }
    return 0;
  }

  public static Bundle l(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    Bundle localBundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i1 + i2);
    return localBundle;
  }

  public static Bundle l(String paramString)
  {
    try
    {
      Bundle localBundle = V(new URI(paramString).getQuery());
      return localBundle;
    }
    catch (Exception localException)
    {
    }
    return new Bundle();
  }

  // ERROR //
  private static Object l(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 4585	java/io/ObjectInputStream
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual 4589	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   9: invokespecial 4590	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   12: astore_2
    //   13: aload_2
    //   14: invokevirtual 4593	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   17: astore 13
    //   19: aload 13
    //   21: astore 4
    //   23: aload_2
    //   24: invokevirtual 4594	java/io/ObjectInputStream:close	()V
    //   27: aload 4
    //   29: areturn
    //   30: astore 18
    //   32: aconst_null
    //   33: astore_2
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_2
    //   38: ifnull -11 -> 27
    //   41: aload_2
    //   42: invokevirtual 4594	java/io/ObjectInputStream:close	()V
    //   45: aconst_null
    //   46: areturn
    //   47: astore 5
    //   49: aconst_null
    //   50: areturn
    //   51: astore 17
    //   53: aconst_null
    //   54: astore_2
    //   55: aconst_null
    //   56: astore 4
    //   58: aload_2
    //   59: ifnull -32 -> 27
    //   62: aload_2
    //   63: invokevirtual 4594	java/io/ObjectInputStream:close	()V
    //   66: aconst_null
    //   67: areturn
    //   68: astore 7
    //   70: aconst_null
    //   71: areturn
    //   72: astore 16
    //   74: aconst_null
    //   75: astore_2
    //   76: aload_0
    //   77: aload_1
    //   78: invokevirtual 876	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   81: pop
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: ifnull -59 -> 27
    //   89: aload_2
    //   90: invokevirtual 4594	java/io/ObjectInputStream:close	()V
    //   93: aconst_null
    //   94: areturn
    //   95: astore 12
    //   97: aconst_null
    //   98: areturn
    //   99: astore 15
    //   101: aconst_null
    //   102: astore_2
    //   103: aload 15
    //   105: astore 9
    //   107: aload_2
    //   108: ifnull +7 -> 115
    //   111: aload_2
    //   112: invokevirtual 4594	java/io/ObjectInputStream:close	()V
    //   115: aload 9
    //   117: athrow
    //   118: astore 14
    //   120: aload 4
    //   122: areturn
    //   123: astore 10
    //   125: goto -10 -> 115
    //   128: astore 9
    //   130: goto -23 -> 107
    //   133: astore 8
    //   135: goto -59 -> 76
    //   138: astore 6
    //   140: goto -85 -> 55
    //   143: astore_3
    //   144: goto -110 -> 34
    //
    // Exception table:
    //   from	to	target	type
    //   0	13	30	java/io/FileNotFoundException
    //   41	45	47	java/io/IOException
    //   0	13	51	java/io/IOException
    //   62	66	68	java/io/IOException
    //   0	13	72	java/lang/ClassNotFoundException
    //   89	93	95	java/io/IOException
    //   0	13	99	finally
    //   23	27	118	java/io/IOException
    //   111	115	123	java/io/IOException
    //   13	19	128	finally
    //   76	82	128	finally
    //   13	19	133	java/lang/ClassNotFoundException
    //   13	19	138	java/io/IOException
    //   13	19	143	java/io/FileNotFoundException
  }

  public static String l(int paramInt)
  {
    if (com.wandoujia.account.a.a() != null)
      return com.wandoujia.account.a.a().getString(paramInt);
    return null;
  }

  public static String l(Context paramContext)
  {
    WifiInfo localWifiInfo = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
    if ((localWifiInfo != null) && (localWifiInfo.getMacAddress() != null))
      return localWifiInfo.getMacAddress().replaceAll(":", "");
    return "";
  }

  private static byte[] l(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      return null;
    try
    {
      byte[] arrayOfByte = paramString1.getBytes(paramString2);
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw a(paramString2, localUnsupportedEncodingException);
  }

  public static int m(int paramInt)
  {
    return b("CT", paramInt);
  }

  public static String m()
  {
    return a("&cd", 2);
  }

  public static String m(Context paramContext)
  {
    String str;
    if (paramContext == null)
      str = null;
    do
    {
      do
      {
        return str;
        str = ((TelephonyManager)paramContext.getSystemService("phone")).getLine1Number();
      }
      while (TextUtils.isEmpty(str));
      str = com.wandoujia.account.h.l.a(str.trim());
      if (str.length() <= 11)
        continue;
      str = str.substring(-11 + str.length(), str.length());
    }
    while (u(str));
    return "";
  }

  @SuppressLint({"SimpleDateFormat"})
  public static SimpleDateFormat m(String paramString)
  {
    return new SimpleDateFormat(paramString);
  }

  public static byte[] m(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i1 + i2);
    return arrayOfByte;
  }

  public static int n(int paramInt)
  {
    return b("CT_Text", paramInt);
  }

  public static int n(String paramString)
  {
    if ("shareToQQ".equals(paramString))
      return 10103;
    if ("shareToQzone".equals(paramString))
      return 10104;
    if ("addToQQFavorites".equals(paramString))
      return 10105;
    if ("sendToMyComputer".equals(paramString))
      return 10106;
    if ("shareToTroopBar".equals(paramString))
      return 10107;
    if ("action_login".equals(paramString))
      return 11101;
    if ("action_request".equals(paramString))
      return 10100;
    return -1;
  }

  @TargetApi(8)
  public static String n(Context paramContext)
  {
    Pattern localPattern = Patterns.EMAIL_ADDRESS;
    for (Account localAccount : AccountManager.get(paramContext).getAccounts())
      if (localPattern.matcher(localAccount.name).matches())
        return localAccount.name;
    return null;
  }

  public static boolean n()
  {
    return p(11);
  }

  public static BigDecimal[] n(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    int i3 = paramParcel.readInt();
    BigDecimal[] arrayOfBigDecimal = new BigDecimal[i3];
    for (int i4 = 0; i4 < i3; i4++)
    {
      byte[] arrayOfByte = paramParcel.createByteArray();
      int i5 = paramParcel.readInt();
      arrayOfBigDecimal[i4] = new BigDecimal(new BigInteger(arrayOfByte), i5);
    }
    paramParcel.setDataPosition(i2 + i1);
    return arrayOfBigDecimal;
  }

  public static Drawable o(int paramInt)
  {
    Resources localResources = com.wandoujia.ripple_framework.i.k().g().getResources();
    try
    {
      int i1 = b("CT", paramInt);
      if (i1 != 0)
      {
        Drawable localDrawable = localResources.getDrawable(i1);
        return localDrawable;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static boolean o()
  {
    return p(14);
  }

  public static boolean o(Context paramContext)
  {
    if (paramContext == null)
      return false;
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager.getSimState() == 0)
      return false;
    return localTelephonyManager.getSimState() != 1;
  }

  public static boolean o(String paramString)
  {
    try
    {
      File localFile1 = new File(com.unipay.log.c.a);
      if (!localFile1.exists())
        localFile1.mkdirs();
      File localFile2 = new File(com.unipay.log.c.a + "/unicom_bn");
      if (!localFile2.exists())
        localFile2.createNewFile();
      FileInputStream localFileInputStream = new FileInputStream(localFile2);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      while (true)
      {
        int i1 = localFileInputStream.read(arrayOfByte);
        if (i1 == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, i1);
      }
      localByteArrayOutputStream.flush();
      String[] arrayOfString = com.unipay.a.b.b(new String(localByteArrayOutputStream.toByteArray()), "blackname").split("##");
      localFileInputStream.close();
      localByteArrayOutputStream.close();
      for (int i2 = 0; i2 < arrayOfString.length; i2++)
      {
        boolean bool = paramString.equals(arrayOfString[i2]);
        if (bool)
          return true;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static String[] o(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    String[] arrayOfString = paramParcel.createStringArray();
    paramParcel.setDataPosition(i1 + i2);
    return arrayOfString;
  }

  public static Parcel p(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    Parcel localParcel = Parcel.obtain();
    localParcel.appendFrom(paramParcel, i2, i1);
    paramParcel.setDataPosition(i1 + i2);
    return localParcel;
  }

  public static void p(String paramString)
  {
    int i1 = 0;
    try
    {
      File localFile1 = new File(com.unipay.log.c.a);
      if (!localFile1.exists())
        localFile1.mkdirs();
      File localFile2 = new File(com.unipay.log.c.a + "/unicom_bn");
      if (!localFile2.exists())
        localFile2.createNewFile();
      FileInputStream localFileInputStream = new FileInputStream(localFile2);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      while (true)
      {
        int i2 = localFileInputStream.read(arrayOfByte);
        if (i2 == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, i2);
      }
      localByteArrayOutputStream.flush();
      String[] arrayOfString = com.unipay.a.b.b(new String(localByteArrayOutputStream.toByteArray()), "blackname").split("##");
      localFileInputStream.close();
      localByteArrayOutputStream.close();
      localFile2.delete();
      localFile2.createNewFile();
      while (i1 < arrayOfString.length)
      {
        if (!paramString.equals(arrayOfString[i1]))
          q(arrayOfString[i1]);
        i1++;
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean p()
  {
    return p(19);
  }

  private static boolean p(int paramInt)
  {
    return Build.VERSION.SDK_INT >= paramInt;
  }

  public static boolean p(Context paramContext)
  {
    try
    {
      String str = Phoenix2Util.resolvePhoenix2PackageName(paramContext);
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(str, 0);
      int i1 = 0;
      if (localPackageInfo != null)
      {
        int i2 = localPackageInfo.versionName.compareToIgnoreCase("3.40.0");
        i1 = 0;
        if (i2 >= 0)
          i1 = 1;
      }
      return i1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static void q(Context paramContext)
  {
    if (((paramContext instanceof Activity)) && (k != null))
    {
      View localView = ((Activity)paramContext).getWindow().getDecorView();
      v.b().a(localView, k);
    }
    v.b().a(paramContext);
  }

  public static void q(String paramString)
  {
    try
    {
      if (!o(paramString))
      {
        File localFile1 = new File(com.unipay.log.c.a);
        if (!localFile1.exists())
          localFile1.mkdirs();
        File localFile2 = new File(com.unipay.log.c.a + "/unicom_bn");
        if (!localFile2.exists())
          localFile2.createNewFile();
        String str = com.unipay.a.b.a(paramString + "##", "blackname");
        FileOutputStream localFileOutputStream = new FileOutputStream(localFile2, true);
        localFileOutputStream.write(str.getBytes("utf-8"));
        localFileOutputStream.close();
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean q()
  {
    return p(21);
  }

  public static Parcel[] q(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0)
      return null;
    int i3 = paramParcel.readInt();
    Parcel[] arrayOfParcel = new Parcel[i3];
    int i4 = 0;
    if (i4 < i3)
    {
      int i5 = paramParcel.readInt();
      if (i5 != 0)
      {
        int i6 = paramParcel.dataPosition();
        Parcel localParcel = Parcel.obtain();
        localParcel.appendFrom(paramParcel, i6, i5);
        arrayOfParcel[i4] = localParcel;
        paramParcel.setDataPosition(i5 + i6);
      }
      while (true)
      {
        i4++;
        break;
        arrayOfParcel[i4] = null;
      }
    }
    paramParcel.setDataPosition(i2 + i1);
    return arrayOfParcel;
  }

  public static int r(Context paramContext)
  {
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int i1 = Integer.parseInt(localClass.getField("status_bar_height").get(localObject).toString());
      int i2 = paramContext.getResources().getDimensionPixelSize(i1);
      return i2;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public static String r()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Build.MANUFACTURER).append("-").append(Build.MODEL);
    localStringBuilder.append("_");
    localStringBuilder.append(Build.VERSION.RELEASE);
    localStringBuilder.append("_");
    localStringBuilder.append("weibosdk");
    localStringBuilder.append("_");
    localStringBuilder.append("0030105000");
    localStringBuilder.append("_android");
    return localStringBuilder.toString();
  }

  public static void r(Parcel paramParcel, int paramInt)
  {
    t(paramParcel, paramInt);
  }

  public static boolean r(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
      return false;
    while ((!paramString.matches("(\\+?86)?1[0-9]{10}")) && (!paramString.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")));
    return true;
  }

  private static int s(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(0xFFFF0000 | paramInt);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }

  public static com.tencent.open.a.d s()
  {
    String str = Environment.getExternalStorageState();
    if (("mounted".equals(str)) || ("mounted_ro".equals(str)));
    for (int i1 = 1; i1 == 0; i1 = 0)
      return null;
    File localFile = Environment.getExternalStorageDirectory();
    com.tencent.open.a.d locald = new com.tencent.open.a.d();
    locald.a(localFile);
    StatFs localStatFs = new StatFs(localFile.getAbsolutePath());
    long l1 = localStatFs.getBlockSize();
    long l2 = localStatFs.getBlockCount();
    long l3 = localStatFs.getAvailableBlocks();
    locald.a(l2 * l1);
    locald.b(l3 * l1);
    return locald;
  }

  public static AccountErrorType s(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return AccountErrorType.EMAIL_EMPTY;
    if (!paramString.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"))
      return AccountErrorType.EMAIL_INVALID;
    return AccountErrorType.OK;
  }

  public static DeviceBean s(Context paramContext)
  {
    DeviceBean localDeviceBean = new DeviceBean();
    localDeviceBean.setBrand(Build.BRAND);
    localDeviceBean.setModel(Build.MODEL);
    localDeviceBean.setSdk(String.valueOf(Build.VERSION.SDK_INT));
    localDeviceBean.setSource("mobile");
    localDeviceBean.setUdid(UDIDUtil.a(paramContext));
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      localDeviceBean.setVersionCode(String.valueOf(localPackageInfo.versionCode));
      localDeviceBean.setVersionName(localPackageInfo.versionName);
      return localDeviceBean;
    }
    catch (Exception localException)
    {
      return localDeviceBean;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return localDeviceBean;
  }

  public static Context t()
  {
    if (d == null)
      return null;
    return d;
  }

  public static AccountErrorType t(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return AccountErrorType.TEL_EMPTY;
    if (!paramString.matches("(\\+?86)?1[0-9]{10}"))
      return AccountErrorType.TEL_INVALID;
    return AccountErrorType.OK;
  }

  public static void t(Context paramContext)
  {
    AccountParams localAccountParams = new AccountParams("community", 0);
    localAccountParams.a(AccountParams.Page.LOG_IN);
    localAccountParams.n();
    localAccountParams.a(false);
    AccountUtil.a(paramContext, localAccountParams);
  }

  private static void t(Parcel paramParcel, int paramInt)
  {
    int i1 = paramParcel.dataPosition();
    int i2 = i1 - paramInt;
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i2);
    paramParcel.setDataPosition(i1);
  }

  public static String u()
  {
    if (t() == null)
      return "";
    return t().getPackageName();
  }

  public static void u(Context paramContext)
  {
    if (!n);
    for (boolean bool = true; ; bool = false)
    {
      a(paramContext, bool);
      return;
    }
  }

  public static boolean u(String paramString)
  {
    return t(paramString) == AccountErrorType.OK;
  }

  public static File v()
  {
    if (t() == null)
      return null;
    return t().getFilesDir();
  }

  public static void v(Context paramContext)
  {
    Intent localIntent1 = paramContext.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
    if (localIntent1 == null)
    {
      p.a(paramContext, 2131625402, p.b).a();
      ((NavigationManager)com.wandoujia.ripple_framework.i.k().a("navigation")).a(paramContext, null, null, "com.tencent.mm");
      return;
    }
    if (SystemUtil.aboveApiLevel(11))
    {
      paramContext.startActivity(localIntent1);
      paramContext.startActivity(new Intent(paramContext, FollowUsTipsTransparentActivity.class));
      return;
    }
    Intent localIntent2 = new Intent(paramContext, CampaignActivity.class);
    localIntent2.putExtra("phoenix.intent.extra.TITLE", paramContext.getString(2131625403));
    localIntent2.putExtra("phoenix.intent.extra.URL", "http://wandou.im/followwxwap");
    paramContext.startActivity(localIntent2);
  }

  public static boolean v(String paramString)
  {
    return Pattern.compile("[0-9]*").matcher(paramString).matches();
  }

  public static int w()
  {
    try
    {
      int i1 = Integer.valueOf(Build.VERSION.SDK).intValue();
      return i1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0;
  }

  public static ViewLogPackage w(Context paramContext)
  {
    if ((paramContext instanceof BaseActivity))
      return ((BaseActivity)paramContext).getCurrentPagePackage();
    if ((paramContext instanceof Activity))
      return h.j().h().f(((Activity)paramContext).getWindow().getDecorView());
    return null;
  }

  public static String w(String paramString)
  {
    String str;
    if (!TextUtils.isEmpty(paramString))
    {
      str = paramString + "/wandoujia/";
      File localFile = new File(str);
      if ((localFile.exists()) || (localFile.mkdirs()));
    }
    else
    {
      return null;
    }
    return str;
  }

  public static int x(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().widthPixels;
  }

  public static String x(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return paramString;
    char[] arrayOfChar = paramString.toCharArray();
    int i1 = 0;
    if (i1 < arrayOfChar.length)
    {
      if (arrayOfChar[i1] == '　')
        arrayOfChar[i1] = ' ';
      while (true)
      {
        i1++;
        break;
        if ((arrayOfChar[i1] <= 65280) || (arrayOfChar[i1] >= 65375))
          continue;
        arrayOfChar[i1] = (char)(arrayOfChar[i1] - 65248);
      }
    }
    return new String(arrayOfChar);
  }

  public static boolean x()
  {
    Method[] arrayOfMethod = MotionEvent.class.getDeclaredMethods();
    int i1 = arrayOfMethod.length;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    while (i2 < i1)
    {
      Method localMethod = arrayOfMethod[i2];
      if (localMethod.getName().equals("getPointerCount"))
        i4 = 1;
      if (localMethod.getName().equals("getPointerId"))
        i3 = 1;
      i2++;
    }
    return (w() >= 7) || ((i4 != 0) && (i3 != 0));
  }

  public static int y(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().heightPixels;
  }

  public static com.wandoujia.account.f.b y()
  {
    return g;
  }

  public static void y(String paramString)
  {
    Log.d("Clean", paramString, new Object[0]);
  }

  public static List<com.wandoujia.a.b> z(Context paramContext)
  {
    String str = D(paramContext);
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (true)
    {
      com.wandoujia.a.b localb = c(str, i1);
      if (localb == null)
        break;
      localArrayList.add(localb);
      i1 += 16 + localb.a().c();
    }
    return localArrayList;
  }

  public static void z()
  {
    g = null;
  }

  public static void z(String paramString)
  {
    Log.e("Clean", paramString, new Object[0]);
  }

  public final Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return this.a.a(paramView, paramMatrix, paramRectF);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.b
 * JD-Core Version:    0.6.0
 */