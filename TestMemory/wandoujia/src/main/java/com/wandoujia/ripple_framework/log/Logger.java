package com.wandoujia.ripple_framework.log;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.AppPlatform;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.UrlExtractor;
import com.wandoujia.logv3.c;
import com.wandoujia.logv3.model.packages.AppStatusPackage;
import com.wandoujia.logv3.model.packages.CardPackage.Builder;
import com.wandoujia.logv3.model.packages.ConsumptionEvent;
import com.wandoujia.logv3.model.packages.ConsumptionEvent.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.DownloadPackage.Builder;
import com.wandoujia.logv3.model.packages.DownloadPackage.Status;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.FeedPackage.Builder;
import com.wandoujia.logv3.model.packages.ResourcePackage;
import com.wandoujia.logv3.model.packages.ResourcePackage.Builder;
import com.wandoujia.logv3.model.packages.ResourcePackage.Type;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.message.BasicNameValuePair;

public final class Logger
{
  private v a;

  public Logger(Context paramContext, c paramc)
  {
    v.a(paramContext, paramc);
    this.a = v.b();
  }

  private static ContentPackage a(Model paramModel)
  {
    ContentPackage.Builder localBuilder = new ContentPackage.Builder().title(paramModel.n()).sub_type(paramModel.f().name());
    if (paramModel.D())
    {
      localBuilder.identity(paramModel.F().package_name);
      switch (e.a[paramModel.f().ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    }
    while (true)
    {
      if ((paramModel.R() != null) && ((0x20 & paramModel.R().intValue()) == 32))
        localBuilder.is_free(Boolean.valueOf(false));
      return localBuilder.build();
      localBuilder.identity(paramModel.a());
      break;
      localBuilder.type(ContentPackage.Type.APP);
      continue;
      localBuilder.type(ContentPackage.Type.GAME);
      continue;
      localBuilder.type(ContentPackage.Type.VIDEO);
      continue;
      localBuilder.type(ContentPackage.Type.SUGGESTION);
      continue;
      localBuilder.type(ContentPackage.Type.IAS);
    }
  }

  public final Logger a(Activity paramActivity, String paramString)
  {
    return a(paramActivity.getWindow().getDecorView(), paramString);
  }

  public final Logger a(View paramView, ContentPackage paramContentPackage)
  {
    this.a.a(paramView, paramContentPackage);
    return this;
  }

  public final Logger a(View paramView, DownloadPackage.Status paramStatus)
  {
    DownloadPackage.Builder localBuilder = new DownloadPackage.Builder().status(paramStatus);
    this.a.a(paramView, localBuilder.build());
    return this;
  }

  public final Logger a(View paramView, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction)
  {
    this.a.a(paramView, paramElement, paramAction, null, null);
    if ((ViewLogPackage.Element.CARD == paramElement) || (ViewLogPackage.Element.LIST_ITEM == paramElement))
      this.a.o(paramView);
    return this;
  }

  public final Logger a(View paramView, Logger.Module paramModule, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString, Long paramLong)
  {
    this.a.a(paramView, paramModule.toString().toLowerCase()).a(paramView, paramElement, paramAction, paramString, paramLong);
    if ((ViewLogPackage.Element.CARD == paramElement) || (ViewLogPackage.Element.LIST_ITEM == paramElement))
      this.a.o(paramView);
    return this;
  }

  public final Logger a(View paramView, Model paramModel)
  {
    if (paramModel == null)
      return this;
    v localv1 = this.a;
    CardPackage.Builder localBuilder = new CardPackage.Builder().identity(paramModel.a()).type(paramModel.g().name());
    if (paramModel.g() != paramModel.h())
      localBuilder.sub_type(paramModel.h().name());
    if (paramModel.c() != null)
      localBuilder.parent_id(paramModel.c().a());
    if (!paramModel.B().isEmpty())
      localBuilder.num(Integer.valueOf(paramModel.B().size()));
    if (paramModel.R() != null)
      localBuilder.status(String.valueOf(paramModel.R()));
    if (paramModel.F() != null)
      localBuilder.sub_status(paramModel.F().impr_url);
    localBuilder.tag(null);
    localv1.a(paramView, localBuilder.build()).a(paramView, a(paramModel));
    v localv2 = this.a;
    FeedPackage.Builder localBuilder1 = new FeedPackage.Builder().identity(paramModel.a());
    if (!TextUtils.isEmpty(paramModel.M()))
      localBuilder1.template(paramModel.M());
    if (!TextUtils.isEmpty(paramModel.l()))
      localBuilder1.detail(paramModel.l());
    localv2.a(paramView, localBuilder1.build());
    Model localModel = paramModel.m();
    ResourcePackage localResourcePackage = null;
    if (localModel != null)
    {
      AppDetail localAppDetail1 = localModel.F();
      localResourcePackage = null;
      if (localAppDetail1 != null);
    }
    else
    {
      label280: if (localResourcePackage == null)
        break label408;
      this.a.a(paramView, localResourcePackage);
      return this;
    }
    AppDetail localAppDetail2 = localModel.F();
    ResourcePackage.Builder localBuilder2 = new ResourcePackage.Builder().identity(localAppDetail2.package_name).provider_name(localAppDetail2.title).sub_type(localModel.f().name());
    if ((localAppDetail2.apk != null) && (!localAppDetail2.apk.isEmpty()))
      localBuilder2.can_download(Boolean.valueOf(true));
    if ((localAppDetail2.app_platform != null) && (localAppDetail2.app_platform == AppDetail.AppPlatform.IOS))
      localBuilder2.type(ResourcePackage.Type.PARTNER_PRIVATE);
    while (true)
    {
      localResourcePackage = localBuilder2.build();
      break label280;
      label408: break;
      localBuilder2.type(ResourcePackage.Type.WDJ_HOSTED);
    }
  }

  public final Logger a(View paramView, String paramString)
  {
    Uri localUri;
    ArrayList localArrayList1;
    try
    {
      localUri = Uri.parse(paramString);
      Set localSet = UrlExtractor.getQueryParameterNames(localUri);
      if ((localSet != null) && (!localSet.isEmpty()))
      {
        localArrayList1 = new ArrayList(localSet.size());
        Iterator localIterator = localSet.iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = localUri.getQueryParameter(str1);
          if (str2 == null)
            continue;
          localArrayList1.add(new Logger.PageParameter(str1, str2));
        }
      }
    }
    catch (Exception localException)
    {
      return a(paramView, paramString, null);
    }
    for (ArrayList localArrayList2 = localArrayList1; ; localArrayList2 = null)
    {
      Logger localLogger = a(paramView, localUri.buildUpon().query(null).toString(), localArrayList2);
      return localLogger;
    }
  }

  public final Logger a(View paramView, String paramString1, String paramString2)
  {
    ContentPackage.Builder localBuilder = new ContentPackage.Builder().title(paramString1).type(ContentPackage.Type.APP).identity(paramString2);
    this.a.a(paramView, localBuilder.build());
    return this;
  }

  public final Logger a(View paramView, String paramString, List<Logger.PageParameter> paramList)
  {
    this.a.a(paramView, new ak(paramString));
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Logger.PageParameter localPageParameter = (Logger.PageParameter)localIterator.next();
        localArrayList.add(new BasicNameValuePair(localPageParameter.a, localPageParameter.b));
      }
      this.a.a(paramView, localArrayList);
    }
    return this;
  }

  public final void a()
  {
    this.a.e();
  }

  public final void a(Context paramContext)
  {
    this.a.a(paramContext);
  }

  public final void a(View paramView)
  {
    this.a.a(paramView);
  }

  public final void a(View paramView1, View paramView2)
  {
    this.a.b(paramView1, paramView2);
  }

  public final void a(ConsumptionEvent paramConsumptionEvent, ContentPackage paramContentPackage, AppStatusPackage paramAppStatusPackage)
  {
    ConsumptionEvent.Builder localBuilder = new ConsumptionEvent.Builder(paramConsumptionEvent);
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder().content_package(paramContentPackage).app_status_package(paramAppStatusPackage);
    this.a.a(localBuilder, localBuilder1);
  }

  public final void a(ConsumptionEvent paramConsumptionEvent, ContentPackage paramContentPackage, AppStatusPackage paramAppStatusPackage, ViewLogPackage paramViewLogPackage)
  {
    ConsumptionEvent.Builder localBuilder = new ConsumptionEvent.Builder(paramConsumptionEvent);
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder().content_package(paramContentPackage).app_status_package(paramAppStatusPackage);
    this.a.a(localBuilder, localBuilder1, paramViewLogPackage);
  }

  public final void a(TaskEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    this.a.a(paramBuilder, paramBuilder1);
  }

  public final void a(TaskEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1, Model paramModel)
  {
    if ((paramModel != null) && (paramBuilder1 != null))
      paramBuilder1.content_package(a(paramModel));
    this.a.a(paramBuilder, paramBuilder1);
  }

  public final void a(Logger.Module paramModule, ViewLogPackage.Action paramAction, String paramString, Long paramLong)
  {
    a(paramModule, paramAction, paramString, paramLong, null);
  }

  public final void a(Logger.Module paramModule, ViewLogPackage.Action paramAction, String paramString1, Long paramLong, String paramString2)
  {
    ViewLogPackage.Builder localBuilder = new ViewLogPackage.Builder();
    localBuilder.module(paramModule.name().toLowerCase()).action(paramAction).name(paramString1).value(paramLong);
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder();
    localBuilder1.action(TaskEvent.Action.VIEW_EVENT).view_log_package(localBuilder.build()).result_info(paramString2);
    ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
    this.a.a(localBuilder1, localBuilder2);
  }

  public final void b(View paramView)
  {
    this.a.b(paramView);
  }

  public final void b(View paramView1, View paramView2)
  {
    this.a.a(paramView1, paramView2);
  }

  public final void c(View paramView)
  {
    this.a.d(paramView);
  }

  public final void d(View paramView)
  {
    this.a.c(paramView);
  }

  public final void e(View paramView)
  {
    this.a.e(paramView);
  }

  public final ViewLogPackage f(View paramView)
  {
    return this.a.f(paramView);
  }

  public final Logger g(View paramView)
  {
    this.a.q(paramView);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.log.Logger
 * JD-Core Version:    0.6.0
 */