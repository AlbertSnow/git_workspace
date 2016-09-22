package com.wandoujia.logv3.toolkit;

import android.text.TextUtils;
import com.wandoujia.logv3.model.packages.CardPackage;
import com.wandoujia.logv3.model.packages.ContentPackage;
import com.wandoujia.logv3.model.packages.DeviceStatusPackage;
import com.wandoujia.logv3.model.packages.DownloadPackage;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.FeedPackage;
import com.wandoujia.logv3.model.packages.GameLauncherPackage;
import com.wandoujia.logv3.model.packages.OpenTypePackage;
import com.wandoujia.logv3.model.packages.ResourcePackage;
import com.wandoujia.logv3.model.packages.UrlPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ac
{
  private ak a(ab paramab, j paramj, UrlPackage.Builder paramBuilder)
  {
    if ((paramab.c() != null) && (!TextUtils.isEmpty(paramab.c().a())))
      j.a(paramj, paramab.c());
    if (!TextUtils.isEmpty(paramab.d()))
      j.a(paramj, paramab.d());
    if (paramab.e() != null)
      j.a(paramj, paramab.e());
    if (paramab.j() != null)
      paramBuilder.vertical(paramab.j());
    int i = -1;
    for (int j = 0; j < paramab.a().size(); j++)
    {
      ak localak = a((ab)paramab.a().get(j), paramj, paramBuilder);
      if ((localak == null) || (TextUtils.isEmpty(localak.a())))
        continue;
      if (i >= 0)
        throw new RuntimeException("Found sibling node with page uri in log tree, uri=" + localak.a());
      i = j;
    }
    return paramab.c();
  }

  private static ExtraPackage.Builder b(ab paramab)
  {
    Object localObject1 = new ExtraPackage.Builder();
    CardPackage localCardPackage;
    label34: ContentPackage localContentPackage;
    label53: ResourcePackage localResourcePackage;
    label72: OpenTypePackage localOpenTypePackage;
    label91: FeedPackage localFeedPackage;
    label110: DeviceStatusPackage localDeviceStatusPackage;
    label129: DownloadPackage localDownloadPackage;
    label148: GameLauncherPackage localGameLauncherPackage;
    if (paramab != null)
    {
      ExtraPackage.Builder localBuilder = paramab.h();
      if (localBuilder == null)
        break label259;
      if (((ExtraPackage.Builder)localObject1).card_package == null)
      {
        localCardPackage = localBuilder.card_package;
        ((ExtraPackage.Builder)localObject1).card_package = localCardPackage;
        if (((ExtraPackage.Builder)localObject1).content_package != null)
          break label194;
        localContentPackage = localBuilder.content_package;
        ((ExtraPackage.Builder)localObject1).content_package = localContentPackage;
        if (((ExtraPackage.Builder)localObject1).resource_package != null)
          break label203;
        localResourcePackage = localBuilder.resource_package;
        ((ExtraPackage.Builder)localObject1).resource_package = localResourcePackage;
        if (((ExtraPackage.Builder)localObject1).open_type_package != null)
          break label212;
        localOpenTypePackage = localBuilder.open_type_package;
        ((ExtraPackage.Builder)localObject1).open_type_package = localOpenTypePackage;
        if (((ExtraPackage.Builder)localObject1).feed_package != null)
          break label221;
        localFeedPackage = localBuilder.feed_package;
        ((ExtraPackage.Builder)localObject1).feed_package = localFeedPackage;
        if (((ExtraPackage.Builder)localObject1).device_status_package != null)
          break label230;
        localDeviceStatusPackage = localBuilder.device_status_package;
        ((ExtraPackage.Builder)localObject1).device_status_package = localDeviceStatusPackage;
        if (((ExtraPackage.Builder)localObject1).download_package != null)
          break label239;
        localDownloadPackage = localBuilder.download_package;
        ((ExtraPackage.Builder)localObject1).download_package = localDownloadPackage;
        if (((ExtraPackage.Builder)localObject1).game_launcher_package != null)
          break label248;
        localGameLauncherPackage = localBuilder.game_launcher_package;
        label167: ((ExtraPackage.Builder)localObject1).game_launcher_package = localGameLauncherPackage;
      }
    }
    label259: for (Object localObject2 = localObject1; ; localObject2 = localObject1)
    {
      paramab = paramab.f();
      localObject1 = localObject2;
      break;
      localCardPackage = ((ExtraPackage.Builder)localObject1).card_package;
      break label34;
      label194: localContentPackage = ((ExtraPackage.Builder)localObject1).content_package;
      break label53;
      label203: localResourcePackage = ((ExtraPackage.Builder)localObject1).resource_package;
      break label72;
      label212: localOpenTypePackage = ((ExtraPackage.Builder)localObject1).open_type_package;
      break label91;
      label221: localFeedPackage = ((ExtraPackage.Builder)localObject1).feed_package;
      break label110;
      label230: localDeviceStatusPackage = ((ExtraPackage.Builder)localObject1).device_status_package;
      break label129;
      label239: localDownloadPackage = ((ExtraPackage.Builder)localObject1).download_package;
      break label148;
      label248: localGameLauncherPackage = ((ExtraPackage.Builder)localObject1).game_launcher_package;
      break label167;
      return localObject1;
    }
  }

  public final ad a(ab paramab)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramab);
    while (!localArrayList.isEmpty())
    {
      ab localab = (ab)localArrayList.remove(0);
      if (localab.g() != null)
      {
        String str = localab.b();
        al localal = localab.g();
        ViewLogPackage.IndexPackage localIndexPackage = localab.i();
        ExtraPackage.Builder localBuilder = b(localab);
        ViewLogPackage.Builder localBuilder1 = new ViewLogPackage.Builder();
        ViewLogPackage.Builder localBuilder2 = localBuilder1.module(str).name(localal.c).action(localal.b).element(localal.a).value(localal.d);
        j localj = new j(0);
        UrlPackage.Builder localBuilder3 = new UrlPackage.Builder();
        a(paramab, localj, localBuilder3);
        aa localaa = j.a(localj);
        localBuilder2.url_package(localBuilder3.url(localaa.a).normalized_url(localaa.b).build());
        if (localIndexPackage != null)
          localBuilder1.index(localIndexPackage);
        return new ad(localBuilder1, localBuilder);
      }
      Iterator localIterator = localab.a().iterator();
      while (localIterator.hasNext())
        localArrayList.add((ab)localIterator.next());
    }
    throw new RuntimeException("There is no view set with ViewPackage found in the log tree.");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.ac
 * JD-Core Version:    0.6.0
 */