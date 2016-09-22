package com.wandoujia.ripple_framework.util;

import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.ApkDetail.Builder;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.DownloadUrl.Builder;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;

public final class j
{
  private static final ContentTypeEnum.ContentType a = ContentTypeEnum.ContentType.APP;

  public static Model a(LocalAppInfo paramLocalAppInfo, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    DownloadUrl.Builder localBuilder = new DownloadUrl.Builder();
    if (paramLocalAppInfo.getUpgradeInfo() != null)
      localBuilder.url(paramLocalAppInfo.getUpgradeInfo().getFullUrl());
    ApkDetail localApkDetail = new ApkDetail.Builder().bytes_(Integer.valueOf((int)paramLocalAppInfo.getSize())).version_name(paramLocalAppInfo.getVersionName()).version_code(Integer.valueOf(paramLocalAppInfo.getVersionCode())).md5(paramLocalAppInfo.getMD5()).download_url(localBuilder.build()).build();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localApkDetail);
    AppDetail localAppDetail = new AppDetail.Builder().apk(localArrayList).package_name(paramLocalAppInfo.getPackageName()).build();
    Detail localDetail = new Detail.Builder().app_detail(localAppDetail).build();
    Action localAction = new Action.Builder().intent("wdj://apps/" + paramLocalAppInfo.getPackageName()).build();
    return new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(a.getValue())).title(paramLocalAppInfo.getTitle()).content_type(ContentTypeEnum.ContentType.APP).template(Integer.valueOf(paramTemplateType.getValue())).action(localAction).detail(localDetail).build());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.j
 * JD-Core Version:    0.6.0
 */