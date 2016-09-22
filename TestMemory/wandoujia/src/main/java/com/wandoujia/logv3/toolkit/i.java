package com.wandoujia.logv3.toolkit;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.LauncherUtil;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.LogSender.SenderPolicyModel;
import com.wandoujia.logv3.LogSender.TimePolicy;
import com.wandoujia.logv3.c;
import com.wandoujia.logv3.model.packages.AccountPackage.Builder;
import com.wandoujia.logv3.model.packages.ClientPackage;
import com.wandoujia.logv3.model.packages.ClientPackage.Builder;
import com.wandoujia.logv3.model.packages.ClientPackage.Language;
import com.wandoujia.logv3.model.packages.ClientPackage.Platform;
import com.wandoujia.logv3.model.packages.ClientPackage.Product;
import com.wandoujia.logv3.model.packages.CommonPackage;
import com.wandoujia.logv3.model.packages.CommonPackage.Builder;
import com.wandoujia.logv3.model.packages.DevicePackage;
import com.wandoujia.logv3.model.packages.DevicePackage.Builder;
import com.wandoujia.logv3.model.packages.IdPackage;
import com.wandoujia.logv3.model.packages.IdPackage.Builder;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.NetworkPackage.Builder;
import com.wandoujia.logv3.model.packages.NetworkPackage.Subtype;
import com.wandoujia.logv3.model.packages.NetworkPackage.Type;
import com.wandoujia.logv3.model.packages.TimePackage.Builder;
import java.util.List;
import java.util.Locale;

public abstract class i
  implements c
{
  private ClientPackage c(Context paramContext)
  {
    ClientPackage.Builder localBuilder1 = new ClientPackage.Builder();
    ClientPackage.Builder localBuilder2 = localBuilder1.product(b());
    if (SystemUtil.isDeviceTablet(paramContext));
    for (ClientPackage.Platform localPlatform = ClientPackage.Platform.ANDROID_TABLET; ; localPlatform = ClientPackage.Platform.ANDROID_PHONE)
    {
      localBuilder2.platform(localPlatform).first_source(c()).last_source(d()).locale(SystemUtil.getLocale(paramContext).toString()).language(ClientPackage.Language.SIMPLE_CHINESE).version_name(SystemUtil.getVersionName(paramContext)).version_code(Integer.valueOf(SystemUtil.getVersionCode(paramContext)));
      return localBuilder1.build();
    }
  }

  private IdPackage n()
  {
    IdPackage.Builder localBuilder = new IdPackage.Builder();
    localBuilder.udid(a()).identity(localBuilder.udid);
    return localBuilder.build();
  }

  public final CommonPackage a(Context paramContext, CommonPackage paramCommonPackage)
  {
    CommonPackage.Builder localBuilder = new CommonPackage.Builder(paramCommonPackage);
    TimePackage.Builder localBuilder1 = new TimePackage.Builder();
    localBuilder1.local_elapsed_time(Long.valueOf(SystemClock.elapsedRealtime())).local_timestamp(Long.valueOf(System.currentTimeMillis()));
    localBuilder.time_package(localBuilder1.build());
    NetworkPackage.Builder localBuilder2 = new NetworkPackage.Builder();
    int[] arrayOfInt = NetworkUtil.getNetworkTypeInfo(paramContext);
    NetworkPackage.Builder localBuilder3;
    switch (arrayOfInt[0])
    {
    default:
      localBuilder2.type(NetworkPackage.Type.UNKNOWN_TYPE);
      switch (arrayOfInt[1])
      {
      default:
        localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.UNKNOWN);
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
      }
    case 0:
    case 1:
    case -1:
    }
    while (true)
    {
      localBuilder3.isp(NetworkUtil.getISP(paramContext));
      localBuilder.network_package(localBuilder3.build());
      AccountPackage.Builder localBuilder4 = new AccountPackage.Builder();
      localBuilder4.uid(e());
      localBuilder4.telephone(f());
      localBuilder4.email(g());
      localBuilder.account_package(localBuilder4.build());
      if (localBuilder.id_package == null)
        localBuilder.id_package(n());
      if (localBuilder.client_package == null)
        localBuilder.client_package(c(paramContext));
      return localBuilder.build();
      localBuilder2.type(NetworkPackage.Type.MOBILE);
      break;
      localBuilder2.type(NetworkPackage.Type.WIFI);
      break;
      localBuilder2.type(NetworkPackage.Type.UNKNOWN_TYPE);
      break;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.GPRS);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.EDGE);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.UMTS);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.CDMA);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.EVDO_0);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.EVDO_A);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.CDMA_1xRTT);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.HSDPA);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.HSUPA);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.HSPA);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.IDEN);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.EVDO_B);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.LTE);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.EHRPD);
      continue;
      localBuilder3 = localBuilder2.sub_type(NetworkPackage.Subtype.HSPAP);
    }
  }

  public final CommonPackage a(LaunchSourcePackage paramLaunchSourcePackage, CommonPackage paramCommonPackage)
  {
    CommonPackage.Builder localBuilder = new CommonPackage.Builder(paramCommonPackage);
    localBuilder.launch_source_package(paramLaunchSourcePackage);
    return localBuilder.build();
  }

  public final DevicePackage a(Context paramContext)
  {
    DevicePackage.Builder localBuilder = new DevicePackage.Builder();
    localBuilder.os("android").os_version(Build.VERSION.RELEASE).sdk_int(Integer.valueOf(Build.VERSION.SDK_INT)).model(Build.MODEL).brand(Build.BRAND).rom_version(Build.VERSION.CODENAME).rom_name(Build.DISPLAY).launcher_name(LauncherUtil.getDefaultLauncher(paramContext)).cpu(SystemUtil.getCPU()).screen(SystemUtil.getScreenResolution(paramContext)).mac(SystemUtil.getMacAddress(paramContext)).imei(SystemUtil.getImei(paramContext)).imsi(SystemUtil.getImsi(paramContext)).android_id(SystemUtil.getAndroidId(paramContext)).memory_size(Long.valueOf(SystemUtil.getTotalInternalMemorySize()));
    List localList = StorageManager.getInstance().getExternalStorageDirectories();
    if (localList != null)
    {
      if (!localList.isEmpty())
        localBuilder.sdcard1_size(Long.valueOf(FileUtil.getAllBytes((String)localList.get(0))));
      if (localList.size() > 1)
        localBuilder.sdcard2_size(Long.valueOf(FileUtil.getAllBytes((String)localList.get(1))));
    }
    return localBuilder.build();
  }

  protected abstract String a();

  protected abstract ClientPackage.Product b();

  public final CommonPackage b(Context paramContext)
  {
    CommonPackage.Builder localBuilder = new CommonPackage.Builder();
    localBuilder.id_package(n());
    localBuilder.client_package(c(paramContext));
    TimePackage.Builder localBuilder1 = new TimePackage.Builder();
    localBuilder1.local_elapsed_time(Long.valueOf(0L)).local_timestamp(Long.valueOf(0L));
    localBuilder.time_package(localBuilder1.build());
    return localBuilder.build();
  }

  protected abstract String c();

  protected abstract String d();

  protected abstract String e();

  protected abstract String f();

  protected abstract String g();

  public final String i()
  {
    return "2";
  }

  public final String j()
  {
    return "2";
  }

  public com.wandoujia.logv3.i k()
  {
    return null;
  }

  public final LogSender.SenderPolicyModel l()
  {
    return new LogSender.SenderPolicyModel(LogSender.TimePolicy.REAL_TIME, 0L);
  }

  public final LogSender.SenderPolicyModel m()
  {
    return new LogSender.SenderPolicyModel(LogSender.TimePolicy.SCHEDULE, 3600000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.i
 * JD-Core Version:    0.6.0
 */