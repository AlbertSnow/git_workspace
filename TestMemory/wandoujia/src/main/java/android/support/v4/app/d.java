package android.support.v4.app;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import com.alipay.wandoujia.ac;
import com.alipay.wandoujia.md;
import com.alipay.wandoujia.r;
import com.alipay.wandoujia.x;
import com.google.android.gms.common.api.g;
import com.redstone.sdk.enabler.remote.IRsServiceObserver;
import com.redstone.sdk.enabler.remote.IRsSystemService;
import com.wandoujia.api.proto.ApkDetail.Builder;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.DownloadUrl.Builder;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.ExtensionPack;
import com.wandoujia.api.proto.ExtensionPack.Builder;
import com.wandoujia.api.proto.ExtensionPack.PacketType;
import com.wandoujia.api.proto.Image.Builder;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.entities.app.ApkObbInfo;
import com.wandoujia.entities.app.DownloadUrl;
import com.wandoujia.launcher.launcher.models.RecommendListModel;
import com.wandoujia.log.toolkit.LaunchLogger;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.p4.app_launcher.model.ALBaseIconModel;
import com.wandoujia.p4.app_launcher.model.ALBaseIconModel.Type;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.shared_storage.SharedSettings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"CommitPrefEdits"})
public class d
  implements com.wandoujia.morph.a.t<Button>
{
  private static SharedPreferences a;
  private static SharedPreferences b;
  private static com.wandoujia.launcher.c.a c;
  private static SharedPreferences d;

  protected d()
  {
  }

  public d(Context paramContext)
  {
    com.redstone.a.a.a();
    com.redstone.a.a.a(paramContext);
    com.redstone.a.a.a().b();
  }

  public d(g paramg)
  {
    new WeakReference(paramg);
  }

  public d(com.wandoujia.morph.engine.d paramd)
  {
    paramd.a(MoWidgetType.TextView);
  }

  public d(Field paramField)
  {
    b.c(paramField);
  }

  public static int a(Context paramContext, float paramFloat)
  {
    return (int)(0.5F + paramFloat * paramContext.getResources().getDisplayMetrics().density);
  }

  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      int i = paramContext.getResources().getIdentifier(paramString1, paramString2, paramContext.getPackageName());
      return i;
    }
    catch (Exception localException)
    {
      b.b(localException);
    }
    return -1;
  }

  public static int a(String paramString)
  {
    return b(paramString, "id");
  }

  public static int a(String paramString, IRsServiceObserver paramIRsServiceObserver)
  {
    IRsSystemService localIRsSystemService = com.redstone.a.a.a().c();
    if (localIRsSystemService == null)
      return -1;
    try
    {
      int i = localIRsSystemService.a("b2VuaXgyLnVzYnByb3h5", paramString, paramIRsServiceObserver);
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return -1;
  }

  public static Intent a(Context paramContext, Class<?> paramClass, String paramString)
  {
    Intent localIntent = new Intent(paramContext, paramClass);
    localIntent.setAction("com.wandoujia.update.toolkit.install");
    localIntent.putExtra("FILE_PATH", paramString);
    return localIntent;
  }

  public static View a(Context paramContext, int paramInt)
  {
    return LayoutInflater.from(paramContext).inflate(paramInt, null);
  }

  public static View a(ViewGroup paramViewGroup, int paramInt)
  {
    return LayoutInflater.from(paramViewGroup.getContext()).inflate(paramInt, paramViewGroup, false);
  }

  public static com.alipay.wandoujia.t a(com.wandoujia.clean.b.a parama, String paramString, JSONObject paramJSONObject)
  {
    com.wandoujia.image.c.a locala = com.wandoujia.image.c.a.a();
    ac localac = ac.e();
    JSONObject localJSONObject = b.a(null, paramJSONObject);
    try
    {
      if (!TextUtils.isEmpty(localac.a()))
        localJSONObject.put("tid", localac.a());
      while (true)
      {
        localJSONObject.put("user_agent", locala.c().a(localac));
        localJSONObject.put("has_alipay", x.c(locala.b()));
        localJSONObject.put("external_info", paramString);
        localJSONObject.put("utdid", locala.g());
        if (!paramJSONObject.has("protocol"))
          break label747;
        localmd = (md)paramJSONObject.opt("protocol");
        if (localmd == null)
          localmd = locala.c().v();
        if (localmd != md.b)
          break;
        localt = b(localJSONObject);
        if ((localt != null) && (!TextUtils.isEmpty(paramString)))
        {
          arrayOfString = paramString.split("&");
          if (arrayOfString.length != 0)
          {
            int i = arrayOfString.length;
            j = 0;
            localObject1 = null;
            localObject2 = null;
            localObject3 = null;
            localObject4 = null;
            if (j < i)
              break label534;
            StringBuilder localStringBuilder = new StringBuilder();
            if (!TextUtils.isEmpty((CharSequence)localObject4))
              localStringBuilder.append("biz_type=" + (String)localObject4 + ";");
            if (!TextUtils.isEmpty((CharSequence)localObject3))
              localStringBuilder.append("biz_no=" + (String)localObject3 + ";");
            if (!TextUtils.isEmpty((CharSequence)localObject2))
              localStringBuilder.append("trade_no=" + (String)localObject2 + ";");
            if (!TextUtils.isEmpty((CharSequence)localObject1))
              localStringBuilder.append("app_userid=" + (String)localObject1 + ";");
            if (localStringBuilder.length() != 0)
            {
              String str1 = localStringBuilder.toString();
              if (str1.endsWith(";"))
                str1 = str1.substring(0, -1 + str1.length());
              Header[] arrayOfHeader = new Header[1];
              arrayOfHeader[0] = new BasicHeader("Msp-Param", str1);
              parama.a(arrayOfHeader);
              localt.a(parama);
            }
          }
        }
        return localt;
        localac.c();
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        String[] arrayOfString;
        int j;
        Object localObject2;
        Object localObject3;
        Object localObject4;
        b.b(localJSONException);
        continue;
        com.alipay.android.app.d locald = com.wandoujia.image.c.a.a().c();
        r localr = new r();
        localr.a(locald.h());
        localr.b(locald.m());
        localr.c(locald.n());
        localr.d(locald.o());
        com.alipay.wandoujia.t localt = new com.alipay.wandoujia.t(localr, localJSONObject, md.a);
        continue;
        label534: String str2 = arrayOfString[j];
        if (TextUtils.isEmpty((CharSequence)localObject4))
        {
          if (!str2.contains("biz_type"))
            localObject4 = null;
        }
        else
        {
          label563: if (TextUtils.isEmpty((CharSequence)localObject3))
          {
            if (str2.contains("biz_no"))
              break label663;
            localObject3 = null;
          }
          label585: if (TextUtils.isEmpty((CharSequence)localObject2))
          {
            if (str2.contains("trade_no"))
              break label691;
            localObject2 = null;
          }
          label607: if (TextUtils.isEmpty((CharSequence)localObject1))
            if (str2.contains("app_userid"))
              break label719;
        }
        label663: label691: label719: for (Object localObject1 = null; ; localObject1 = str2.substring(1 + str2.indexOf("\""), str2.lastIndexOf("\"")))
        {
          j++;
          break;
          localObject4 = str2.substring(1 + str2.indexOf("\""), str2.lastIndexOf("\""));
          break label563;
          localObject3 = str2.substring(1 + str2.indexOf("\""), str2.lastIndexOf("\""));
          break label585;
          localObject2 = str2.substring(1 + str2.indexOf("\""), str2.lastIndexOf("\""));
          break label607;
        }
        label747: md localmd = null;
      }
    }
  }

  private static ExtensionPack a(ApkObbInfo paramApkObbInfo)
  {
    ExtensionPack.Builder localBuilder = new ExtensionPack.Builder();
    localBuilder.dst_path(paramApkObbInfo.getDstPath());
    localBuilder.cpu_type(Integer.valueOf(paramApkObbInfo.getCpuType()));
    localBuilder.pf5(paramApkObbInfo.getPf5());
    localBuilder.md5(paramApkObbInfo.getMd5());
    localBuilder.description(paramApkObbInfo.getDescription());
    if (paramApkObbInfo.getDownloadUrls() != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramApkObbInfo.getDownloadUrls().iterator();
      while (localIterator.hasNext())
      {
        DownloadUrl localDownloadUrl = (DownloadUrl)localIterator.next();
        DownloadUrl.Builder localBuilder1 = new DownloadUrl.Builder();
        localBuilder1.aggr_weight(Integer.valueOf(localDownloadUrl.getAggrWeight()));
        localBuilder1.market(localDownloadUrl.getMarket());
        localBuilder1.refer_url(localDownloadUrl.getReferUrl());
        localBuilder1.url(localDownloadUrl.getUrl());
        localArrayList.add(localBuilder1.build());
      }
      localBuilder.download_urls(localArrayList);
    }
    localBuilder.src_path(paramApkObbInfo.getSrcPath());
    localBuilder.humansize(paramApkObbInfo.getHumanSize());
    localBuilder.matched(Boolean.valueOf(paramApkObbInfo.getMatched()));
    localBuilder.size(Long.valueOf(paramApkObbInfo.getSize()));
    localBuilder.supported_cpu_types(paramApkObbInfo.getSupportedCpuTypes());
    try
    {
      localBuilder.type(ExtensionPack.PacketType.valueOf(paramApkObbInfo.getType()));
      localBuilder.version_code(Integer.valueOf(paramApkObbInfo.getVersionCode()));
      label259: return localBuilder.build();
    }
    catch (Exception localException)
    {
      break label259;
    }
  }

  public static LaunchLogger a(com.wandoujia.nirvana.framework.network.a.a parama)
  {
    long l1 = System.currentTimeMillis();
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    localTreeMap.putAll(parama.b);
    String str1 = (String)localTreeMap.get("Date");
    long l2;
    if (str1 != null)
      l2 = b.j(str1);
    while (true)
    {
      String str2 = (String)localTreeMap.get("Cache-Control");
      int j;
      long l6;
      String str5;
      if (str2 != null)
      {
        String[] arrayOfString = str2.split(",");
        j = 0;
        l6 = 0L;
        if (j < arrayOfString.length)
        {
          str5 = arrayOfString[j].trim();
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
          j++;
          break;
          if ((!str5.equals("must-revalidate")) && (!str5.equals("proxy-revalidate")))
            continue;
          l6 = 0L;
          continue;
          l3 = l6;
          i = 1;
          String str3 = (String)localTreeMap.get("Expires");
          if (str3 == null)
            continue;
          l4 = b.j(str3);
          String str4 = (String)localTreeMap.get("ETag");
          if (i == 0)
            continue;
          l5 = l1 + 1000L * l3;
          LaunchLogger localLaunchLogger = new LaunchLogger();
          localLaunchLogger.a = parama.a;
          localLaunchLogger.b = str4;
          localLaunchLogger.e = l5;
          localLaunchLogger.d = localLaunchLogger.e;
          localLaunchLogger.c = l2;
          localLaunchLogger.f = localTreeMap;
          return localLaunchLogger;
          if ((l2 <= 0L) || (l4 < l2))
            continue;
          l5 = l1 + (l4 - l2);
          continue;
        }
        catch (Exception localException)
        {
          continue;
          long l5 = l1;
          continue;
          long l4 = 0L;
          continue;
        }
        long l3 = 0L;
        int i = 0;
      }
      l2 = 0L;
    }
  }

  public static Model a(com.wandoujia.launcher_base.view.button.a.a parama)
  {
    Entity.Builder localBuilder = new Entity.Builder();
    Detail.Builder localBuilder1 = new Detail.Builder();
    AppDetail.Builder localBuilder2 = new AppDetail.Builder();
    localBuilder2.package_name(parama.d());
    ArrayList localArrayList1 = new ArrayList();
    ApkDetail.Builder localBuilder3 = new ApkDetail.Builder();
    localBuilder3.version_code(Integer.valueOf(parama.f()));
    int i;
    if (parama.h())
      i = 1;
    while (true)
    {
      localBuilder3.compatible(Integer.valueOf(i));
      localBuilder3.incompatible_detail(parama.i());
      localBuilder3.md5(parama.g());
      localBuilder3.download_url(new DownloadUrl.Builder().url(parama.e()).build());
      localBuilder3.bytes_(Integer.valueOf((int)parama.c()));
      localArrayList1.add(localBuilder3.build());
      localBuilder2.apk(localArrayList1);
      if (parama.j() == null)
        break;
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = parama.j().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localArrayList2.add(a((ApkObbInfo)localIterator.next()));
          continue;
          i = 0;
          break;
        }
      localBuilder2.extension_pack(localArrayList2);
    }
    localBuilder1.app_detail(localBuilder2.build());
    localBuilder.detail(localBuilder1.build());
    localBuilder.content_type(ContentTypeEnum.ContentType.APP);
    localBuilder.icon(parama.b());
    localBuilder.icon_image(new Image.Builder().url(parama.b()).build());
    Model localModel = new Model(localBuilder.build());
    localModel.a(parama.a());
    return localModel;
  }

  public static Model a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    Entity.Builder localBuilder = new Entity.Builder();
    Detail.Builder localBuilder1 = new Detail.Builder();
    AppDetail.Builder localBuilder2 = new AppDetail.Builder();
    localBuilder2.package_name(paramString1);
    ArrayList localArrayList = new ArrayList();
    ApkDetail.Builder localBuilder3 = new ApkDetail.Builder();
    localBuilder3.version_code(Integer.valueOf(paramInt));
    localBuilder3.compatible(Integer.valueOf(1));
    localBuilder3.download_url(new DownloadUrl.Builder().url(paramString2).build());
    localBuilder3.bytes_(Integer.valueOf(0));
    localArrayList.add(localBuilder3.build());
    localBuilder2.apk(localArrayList);
    localBuilder1.app_detail(localBuilder2.build());
    localBuilder.detail(localBuilder1.build());
    localBuilder.content_type(ContentTypeEnum.ContentType.APP);
    localBuilder.icon(paramString4);
    localBuilder.icon_image(new Image.Builder().url(paramString4).build());
    Model localModel = new Model(localBuilder.build());
    localModel.a(paramString3);
    return localModel;
  }

  public static <T> T a(T paramT)
  {
    if (paramT == null)
      throw new NullPointerException("null reference");
    return paramT;
  }

  public static <T> T a(T paramT, Object paramObject)
  {
    if (paramT == null)
      throw new NullPointerException(String.valueOf(paramObject));
    return paramT;
  }

  public static String a()
  {
    String str = q();
    int i = str.indexOf("-");
    if (i != -1)
      str = str.substring(0, i);
    int j = str.indexOf("\n");
    if (j != -1)
      str = str.substring(0, j);
    return "Linux " + str;
  }

  public static String a(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().locale.toString();
  }

  public static String a(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException(String.valueOf(paramObject));
    return paramString;
  }

  // ERROR //
  public static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 769	java/security/spec/X509EncodedKeySpec
    //   5: dup
    //   6: aload_1
    //   7: invokestatic 774	com/alipay/android/app/a/a:a	(Ljava/lang/String;)[B
    //   10: invokespecial 777	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   13: astore_3
    //   14: ldc_w 779
    //   17: invokestatic 785	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   20: aload_3
    //   21: invokevirtual 789	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   24: astore 9
    //   26: ldc_w 791
    //   29: invokestatic 796	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   32: astore 10
    //   34: aload 10
    //   36: iconst_1
    //   37: aload 9
    //   39: invokevirtual 800	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   42: aload_0
    //   43: ldc_w 802
    //   46: invokevirtual 805	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   49: astore 11
    //   51: aload 10
    //   53: invokevirtual 808	javax/crypto/Cipher:getBlockSize	()I
    //   56: istore 12
    //   58: new 810	java/io/ByteArrayOutputStream
    //   61: dup
    //   62: invokespecial 811	java/io/ByteArrayOutputStream:<init>	()V
    //   65: astore 13
    //   67: iconst_0
    //   68: istore 14
    //   70: iload 14
    //   72: aload 11
    //   74: arraylength
    //   75: if_icmplt +28 -> 103
    //   78: new 234	java/lang/String
    //   81: dup
    //   82: aload 13
    //   84: invokevirtual 815	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   87: invokestatic 818	com/alipay/android/app/a/a:a	([B)Ljava/lang/String;
    //   90: invokespecial 819	java/lang/String:<init>	(Ljava/lang/String;)V
    //   93: astore 16
    //   95: aload 13
    //   97: invokevirtual 822	java/io/ByteArrayOutputStream:close	()V
    //   100: aload 16
    //   102: areturn
    //   103: aload 11
    //   105: arraylength
    //   106: iload 14
    //   108: isub
    //   109: iload 12
    //   111: if_icmpge +37 -> 148
    //   114: aload 11
    //   116: arraylength
    //   117: iload 14
    //   119: isub
    //   120: istore 18
    //   122: aload 13
    //   124: aload 10
    //   126: aload 11
    //   128: iload 14
    //   130: iload 18
    //   132: invokevirtual 826	javax/crypto/Cipher:doFinal	([BII)[B
    //   135: invokevirtual 829	java/io/ByteArrayOutputStream:write	([B)V
    //   138: iload 14
    //   140: iload 12
    //   142: iadd
    //   143: istore 14
    //   145: goto -75 -> 70
    //   148: iload 12
    //   150: istore 18
    //   152: goto -30 -> 122
    //   155: astore 6
    //   157: aconst_null
    //   158: astore 7
    //   160: aload 7
    //   162: ifnull +54 -> 216
    //   165: aload 7
    //   167: invokevirtual 822	java/io/ByteArrayOutputStream:close	()V
    //   170: aconst_null
    //   171: areturn
    //   172: astore 8
    //   174: aconst_null
    //   175: areturn
    //   176: astore 4
    //   178: aload_2
    //   179: ifnull +7 -> 186
    //   182: aload_2
    //   183: invokevirtual 822	java/io/ByteArrayOutputStream:close	()V
    //   186: aload 4
    //   188: athrow
    //   189: astore 5
    //   191: goto -5 -> 186
    //   194: astore 17
    //   196: aload 16
    //   198: areturn
    //   199: astore 4
    //   201: aload 13
    //   203: astore_2
    //   204: goto -26 -> 178
    //   207: astore 15
    //   209: aload 13
    //   211: astore 7
    //   213: goto -53 -> 160
    //   216: aconst_null
    //   217: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   2	67	155	java/lang/Exception
    //   165	170	172	java/io/IOException
    //   2	67	176	finally
    //   182	186	189	java/io/IOException
    //   95	100	194	java/io/IOException
    //   70	95	199	finally
    //   103	122	199	finally
    //   122	138	199	finally
    //   70	95	207	java/lang/Exception
    //   103	122	207	java/lang/Exception
    //   122	138	207	java/lang/Exception
  }

  public static void a(int paramInt)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putInt("folder_suggestion_count", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(long paramLong)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putLong("last_generate_gamelist_time", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(Context paramContext, View paramView)
  {
    ((WindowManager)paramContext.getSystemService("window")).removeView(paramView);
  }

  public static void a(Context paramContext, View paramView, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt1, int paramInt2)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    if (paramBoolean2);
    for (int i = 2005; ; i = 2003)
    {
      localLayoutParams.type = i;
      localLayoutParams.format = -3;
      localLayoutParams.flags = 32;
      if (!paramBoolean3)
        localLayoutParams.flags = (0x8 | localLayoutParams.flags);
      localLayoutParams.gravity = 17;
      localLayoutParams.width = paramInt1;
      localLayoutParams.height = paramInt2;
      if (paramBoolean4)
        localLayoutParams.screenOrientation = 1;
      if (paramBoolean1)
        localLayoutParams.width = -1;
      localWindowManager.addView(paramView, localLayoutParams);
      return;
    }
  }

  public static void a(View paramView)
  {
    a(paramView, "app_launcher", ViewLogPackage.Element.TEXT_LINK, ViewLogPackage.Action.REDIRECT, paramView.getContext().getResources().getString(2131624292));
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

  public static void a(View paramView, ALBaseIconModel paramALBaseIconModel)
  {
    String str = "commonapp";
    if (paramALBaseIconModel.a() == ALBaseIconModel.Type.Function)
      str = "commonfunction";
    b.b(paramView, paramALBaseIconModel.e());
    a(paramView, str, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, paramALBaseIconModel.b());
  }

  private static void a(View paramView, String paramString1, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString2)
  {
    v.b().a(paramView, paramString1).a(paramView, paramElement, paramAction, paramString2).d(paramView);
  }

  public static void a(com.wandoujia.clean.b.a parama, HttpResponse paramHttpResponse)
  {
    Header[] arrayOfHeader = paramHttpResponse.getHeaders("Msp-Param");
    if ((parama != null) && (arrayOfHeader.length > 0))
      parama.a(arrayOfHeader);
  }

  private static void a(String paramString1, ViewLogPackage.Element paramElement, String paramString2, String paramString3)
  {
    ViewLogPackage localViewLogPackage = new ViewLogPackage.Builder().module(paramString1).element(paramElement).name(paramString2).build();
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().view_log_package(localViewLogPackage).result_info(paramString3);
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
    v.b().a(localBuilder, localBuilder1);
  }

  public static void a(JSONObject paramJSONObject)
  {
    String str1;
    String str2;
    if ((paramJSONObject.has("client_key")) && (paramJSONObject.has("tid")))
    {
      str1 = paramJSONObject.optString("client_key");
      str2 = paramJSONObject.optString("tid");
      if ((!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2)));
    }
    else
    {
      return;
    }
    Context localContext = com.wandoujia.image.c.a.a().b();
    ac localac = ac.e();
    localac.a(str2);
    localac.b(str1);
    localac.a(localContext);
  }

  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalStateException();
  }

  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalStateException(String.valueOf(paramObject));
  }

  public static void a(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    if (!paramBoolean)
      throw new IllegalStateException(String.format(paramString, paramArrayOfObject));
  }

  public static boolean a(Context paramContext, String paramString)
  {
    if (!FileUtil.exists(paramString))
      return false;
    if (paramString.startsWith("file://"));
    for (Uri localUri = Uri.parse(paramString); ; localUri = Uri.fromFile(new File(paramString)))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setFlags(268435457);
      localIntent.setDataAndType(localUri, "application/vnd.android.package-archive");
      paramContext.startActivity(localIntent);
      return true;
    }
  }

  public static int b(String paramString)
  {
    return b(paramString, "anim");
  }

  public static int b(String paramString1, String paramString2)
  {
    return a(com.wandoujia.image.c.a.a().b(), paramString1, paramString2);
  }

  private static com.alipay.wandoujia.t b(JSONObject paramJSONObject)
  {
    com.alipay.android.app.d locald = com.wandoujia.image.c.a.a().c();
    r localr = new r();
    localr.a(locald.h());
    localr.b("com.alipay.mobilecashier");
    localr.c("/cashier/main");
    localr.d("3.0.0");
    com.alipay.wandoujia.t localt = null;
    if (paramJSONObject != null);
    try
    {
      paramJSONObject.put("new_client_key", ac.h());
      paramJSONObject.put("app_key", "2013122500002449");
      label74: localt = new com.alipay.wandoujia.t(localr, paramJSONObject, md.b);
      return localt;
    }
    catch (JSONException localJSONException)
    {
      break label74;
    }
  }

  public static String b()
  {
    return "https";
  }

  public static String b(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localDisplayMetrics.widthPixels);
    localStringBuilder.append("*");
    localStringBuilder.append(localDisplayMetrics.heightPixels);
    return localStringBuilder.toString();
  }

  public static void b(int paramInt)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putInt("folder_message_num", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(long paramLong)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putLong("last_generate_suggestionlist_time", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(View paramView)
  {
    a(paramView, "app_launcher", ViewLogPackage.Element.TEXT_LINK, ViewLogPackage.Action.REDIRECT, paramView.getContext().getResources().getString(2131624279));
  }

  public static void b(View paramView, ALBaseIconModel paramALBaseIconModel)
  {
    b.b(paramView, paramALBaseIconModel.e());
    a(paramView, "commonapp", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "long_click_app");
  }

  public static void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException();
  }

  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.valueOf(paramObject));
  }

  public static int c(String paramString)
  {
    return b(paramString, "color");
  }

  public static com.alipay.wandoujia.t c()
  {
    r localr = new r();
    localr.a(com.wandoujia.image.c.a.a().c().h());
    localr.b("com.alipay.mobilecashier");
    localr.c("/device/findAccount");
    localr.d("3.0.0");
    com.wandoujia.image.c.a locala = com.wandoujia.image.c.a.a();
    ac localac = ac.e();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (!TextUtils.isEmpty(localac.a()))
        localJSONObject.put("tid", localac.a());
      while (true)
      {
        localJSONObject.put("utdid", locala.g());
        localJSONObject.put("app_key", "2013122500002449");
        localJSONObject.put("new_client_key", ac.h());
        return new com.alipay.wandoujia.t(localr, localJSONObject, md.b);
        localac.c();
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
        b.b(localJSONException);
    }
  }

  public static String c(Context paramContext)
  {
    try
    {
      GsmCellLocation localGsmCellLocation = (GsmCellLocation)((TelephonyManager)paramContext.getSystemService("phone")).getCellLocation();
      if (localGsmCellLocation != null)
      {
        int i = localGsmCellLocation.getCid();
        int j = localGsmCellLocation.getLac();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(j);
        localStringBuilder.append(";");
        localStringBuilder.append(i);
        String str = localStringBuilder.toString();
        return str;
      }
    }
    catch (Exception localException)
    {
      b.b(localException);
    }
    return "-1;-1";
  }

  public static void c(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "unknown";
    case 1:
    case 0:
    }
    while (true)
    {
      a("app_launcher", ViewLogPackage.Element.ICON, "check_shortcut_icon_exists", str);
      return;
      str = "existed";
      continue;
      str = "gone";
    }
  }

  public static void c(long paramLong)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putLong("last_check_launcher_user_time", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void c(View paramView)
  {
    a(paramView, "app_launcher", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, paramView.getContext().getResources().getString(2131624285));
  }

  public static void c(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putBoolean("oem_can_create_icon", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static int d(String paramString)
  {
    return b(paramString, "dimen");
  }

  public static View d(View paramView)
  {
    while (true)
    {
      if (!(paramView.getParent() instanceof RecyclerView))
      {
        if ((paramView.getParent() == null) || (!(paramView.getParent() instanceof View)))
          paramView = null;
      }
      else
        return paramView;
      paramView = (View)paramView.getParent();
    }
  }

  public static String d()
  {
    return a.getString("gpu_Type", "");
  }

  public static void d(int paramInt)
  {
    a("app_launcher", ViewLogPackage.Element.ICON, "check_app_count", String.valueOf(paramInt));
  }

  public static void d(long paramLong)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putLong("game_launcher_last_time", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void d(Context paramContext)
  {
    a = paramContext.getSharedPreferences("game_packet_pref", 0);
  }

  public static void d(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putBoolean("game_shortcut_generated", paramBoolean);
    if (paramBoolean)
      localEditor.putLong("game_shortcut_generated_date", System.currentTimeMillis());
    SharePrefSubmitor.submit(localEditor);
  }

  public static int e(String paramString)
  {
    return b(paramString, "drawable");
  }

  public static void e(boolean paramBoolean)
  {
    SharedSettings.a().a("setting_wifi_auto_connect", paramBoolean);
  }

  public static boolean e()
  {
    return r().getBoolean("game_shortcut_generated", false);
  }

  public static int f(String paramString)
  {
    return b(paramString, "layout");
  }

  public static long f()
  {
    return r().getLong("last_generate_gamelist_time", 0L);
  }

  public static int g(String paramString)
  {
    return b(paramString, "string");
  }

  public static long g()
  {
    return r().getLong("last_generate_suggestionlist_time", 0L);
  }

  public static int h(String paramString)
  {
    return b(paramString, "style");
  }

  public static long h()
  {
    return r().getLong("last_check_launcher_user_time", 0L);
  }

  public static int i()
  {
    return r().getInt("folder_message_num", 0);
  }

  public static String i(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Given String is empty or null");
    return paramString;
  }

  public static void j()
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putBoolean("folder_suggestion_updated", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void j(String paramString)
  {
    if (Looper.myLooper() != Looper.getMainLooper())
      throw new IllegalStateException(paramString);
  }

  public static void k()
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putBoolean("folder_local_game_loaded", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void k(String paramString)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
      throw new IllegalStateException(paramString);
  }

  public static void l(String paramString)
  {
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putString("gpu_Type", paramString);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean l()
  {
    return r().getBoolean("folder_local_game_loaded", false);
  }

  public static RecommendListModel m()
  {
    com.wandoujia.launcher.c.a.a.a locala = new com.wandoujia.launcher.c.a.a.a();
    try
    {
      RecommendListModel localRecommendListModel = (RecommendListModel)s().a(locala.a().b().build(), RecommendListModel.class);
      return localRecommendListModel;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }

  public static void m(String paramString)
  {
    SharedPreferences.Editor localEditor = r().edit();
    localEditor.putString("folder_suggestion_title", paramString);
    SharePrefSubmitor.submit(localEditor);
  }

  public static String n(String paramString)
  {
    return t().getString(paramString, "");
  }

  public static void n()
  {
    a("app_launcher", ViewLogPackage.Element.ICON, "create_shortcut_icon", "");
  }

  public static void o()
  {
    a("app_launcher", ViewLogPackage.Element.ICON, "update_shortcut_icon", "");
  }

  private static String q()
  {
    Matcher localMatcher;
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
      try
      {
        String str1 = localBufferedReader.readLine();
        localBufferedReader.close();
        localMatcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(str1);
        boolean bool = localMatcher.matches();
        if (!bool)
          return "Unavailable";
      }
      finally
      {
        localBufferedReader.close();
      }
    }
    catch (IOException localIOException)
    {
      return "Unavailable";
    }
    int i = localMatcher.groupCount();
    if (i < 4)
      return "Unavailable";
    String str2 = localMatcher.group(1) + "\n" + localMatcher.group(2) + " " + localMatcher.group(3) + "\n" + localMatcher.group(4);
    return str2;
  }

  private static SharedPreferences r()
  {
    if (b == null)
      b = GlobalConfig.getAppContext().getSharedPreferences("wan-user-prefs", 0);
    return b;
  }

  private static com.wandoujia.launcher.c.a s()
  {
    monitorenter;
    try
    {
      if (c == null)
        c = new com.wandoujia.launcher.c.a(com.wandoujia.launcher_base.b.a.d());
      com.wandoujia.launcher.c.a locala = c;
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static SharedPreferences t()
  {
    monitorenter;
    try
    {
      if (d == null)
        d = GlobalConfig.getAppContext().getSharedPreferences("com.wandoujia.phoenix2.config", 2);
      SharedPreferences localSharedPreferences = d;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public MoWidgetType p()
  {
    return MoWidgetType.Button;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.d
 * JD-Core Version:    0.6.0
 */