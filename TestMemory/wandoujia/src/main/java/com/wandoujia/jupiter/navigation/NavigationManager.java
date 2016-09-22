package com.wandoujia.jupiter.navigation;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.ApkDetail.Builder;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.api.proto.DownloadUrl.Builder;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.IntentUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.activity.CommonActivity;
import com.wandoujia.jupiter.activity.ShareActivity;
import com.wandoujia.jupiter.search.activity.InAppCampaignActivity;
import com.wandoujia.jupiter.search.activity.SearchQueryHistoryActivity;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.p4.campaign.CampaignActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.DetailInfo;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.ripple.activity.DetailActivity;
import com.wandoujia.ripple_framework.view.Anchor;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public final class NavigationManager extends com.wandoujia.ripple_framework.navigation.a
{
  public static void a(Context paramContext)
  {
    Uri localUri = Uri.parse("wdj://explore/homepage");
    Intent localIntent = new Intent();
    localIntent.setData(localUri);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    localIntent.addFlags(67141632);
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  public static void a(Context paramContext, Model paramModel, ShareUtil.ShareContentType paramShareContentType)
  {
    Intent localIntent = new Intent(paramContext, ShareActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("share_model", paramModel);
    localBundle.putString("share_type", paramShareContentType.name());
    localIntent.addFlags(65536);
    localIntent.putExtras(localBundle);
    paramContext.startActivity(localIntent);
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      Intent localIntent = Intent.parseUri("wdj://search/result", 1);
      localIntent.putExtra("extra_query", paramString1);
      localIntent.putExtra("source", paramString2);
      paramContext.startActivity(localIntent);
      if ((paramContext instanceof Activity))
      {
        ((Activity)paramContext).overridePendingTransition(0, 0);
        if ((paramContext instanceof SearchQueryHistoryActivity))
          ((Activity)paramContext).finish();
      }
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
    }
  }

  private static void a(Model paramModel)
  {
    Context localContext = JupiterApplication.e();
    String str1 = paramModel.n();
    String str2 = paramModel.t().url;
    Model localModel = null;
    if (paramModel == null)
    {
      InAppCampaignActivity.a(localContext, str1, str2, localModel);
      return;
    }
    if ((paramModel.b().detail != null) && (paramModel.b().detail.app_detail != null));
    while (true)
    {
      localModel = null;
      if (paramModel == null)
        break;
      ArrayList localArrayList = new ArrayList();
      ApkDetail.Builder localBuilder = new ApkDetail.Builder();
      if (!CollectionUtils.isEmpty(paramModel.F().apk))
        localBuilder.download_url(new DownloadUrl.Builder().url(((ApkDetail)paramModel.F().apk.get(0)).download_url.url).build()).version_code(((ApkDetail)paramModel.F().apk.get(0)).version_code).version_name(((ApkDetail)paramModel.F().apk.get(0)).version_name).md5(((ApkDetail)paramModel.F().apk.get(0)).md5).bytes_(((ApkDetail)paramModel.F().apk.get(0)).bytes_);
      localArrayList.add(localBuilder.build());
      localModel = new Model(new Entity.Builder().id(Long.valueOf(1L)).type(Integer.valueOf(paramModel.f().getValue())).template_type(paramModel.g()).action(new Action.Builder().url(paramModel.t().url).intent("wdj://apps/" + paramModel.F().package_name).build()).title(paramModel.n()).sub_title(paramModel.o()).description(paramModel.q()).tag_line(paramModel.b().tag_line).icon(paramModel.i()).detail(new Detail.Builder().app_detail(new AppDetail.Builder().package_name(paramModel.F().package_name).apk(localArrayList).installed_count_str(paramModel.F().installed_count_str).build()).build()).build());
      break;
      if ((paramModel.c() != null) && (paramModel.c().F() != null))
      {
        paramModel = paramModel.c();
        continue;
      }
      paramModel = null;
    }
  }

  public final void a()
  {
  }

  public final void a(Context paramContext, View paramView, Model paramModel, int paramInt)
  {
    if (paramModel.f() == ContentTypeEnum.ContentType.FEED)
    {
      com.wandoujia.nirvana.framework.network.page.a locala = DetailActivity.a(paramModel);
      Intent localIntent = new Intent(paramContext, DetailActivity.class);
      Bundle localBundle = new Bundle();
      ((com.wandoujia.ripple_framework.navigation.b)i.k().a("holder")).a(locala, "object", localBundle);
      localBundle.putParcelable("detail", new DetailInfo(locala.a(), paramView, paramModel.e(), paramInt));
      localIntent.putExtras(localBundle);
      localIntent.setAction("view_list");
      if (!(paramContext instanceof Activity))
        localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
      return;
    }
    a(paramContext, paramModel, paramView, paramModel.F().package_name);
  }

  public final void a(Context paramContext, Action paramAction)
  {
    if (paramAction == null)
      return;
    com.wandoujia.ripple_framework.navigation.a.a(paramContext, paramAction.intent, android.support.v4.app.b.F(paramAction.url), CommonActivity.class);
  }

  public final void a(Context paramContext, Model paramModel, View paramView)
  {
    Action localAction = paramModel.t();
    String str1 = localAction.intent;
    if (TextUtils.isEmpty(str1))
      a(paramContext, localAction);
    while (true)
    {
      return;
      List localList = Uri.parse(str1).getPathSegments();
      if (((str1.startsWith("wdj://apps")) || (str1.startsWith("wdj://games"))) && (localList.size() == 1) && (((String)localList.get(0)).indexOf('.') > 0))
      {
        a(paramContext, paramModel, paramView, (String)localList.get(-1 + localList.size()));
        return;
      }
      if (!str1.startsWith("wdj://review/article/detail"))
        break;
      if ((paramModel.t() == null) || (TextUtils.isEmpty(paramModel.t().intent)))
        continue;
      String str2 = paramModel.t().intent;
      if (paramModel.t() == null);
      for (String str3 = ""; ; str3 = paramModel.t().url)
      {
        Intent localIntent = b(paramContext, str2, str3);
        if (localIntent == null)
          break;
        if (paramView != null)
        {
          Anchor localAnchor = new Anchor(paramView, null);
          if (localAnchor.c > 0)
            localIntent.putExtra("anchor", localAnchor);
        }
        paramContext.startActivity(localIntent);
        return;
      }
    }
    a(paramContext, localAction);
  }

  public final void a(Context paramContext, Model paramModel, View paramView, String paramString)
  {
    String str1;
    if ((paramModel.t() != null) && (!TextUtils.isEmpty(paramModel.t().intent)))
    {
      str1 = paramModel.t().intent;
      if (paramModel.t() != null)
        break label81;
    }
    Intent localIntent;
    label81: for (String str2 = ""; ; str2 = paramModel.t().url)
    {
      localIntent = b(paramContext, str1, str2);
      if (localIntent != null)
        break label93;
      return;
      str1 = "wdj://apps/" + paramString;
      break;
    }
    label93: if (paramView != null)
    {
      View localView = (View)paramView.getTag(2131492903);
      if (localView == null)
        localView = paramView.findViewById(2131492903);
      Anchor localAnchor = new Anchor(paramView, localView);
      if (localAnchor.c > 0)
      {
        localIntent.putExtra("anchor", localAnchor);
        if (paramModel != null)
        {
          if (!TextUtils.isEmpty(paramModel.i()))
            break label247;
          if ((localView != null) && ((localView instanceof ImageView)))
          {
            Drawable localDrawable = ((ImageView)localView).getDrawable();
            if ((localDrawable != null) && ((localDrawable instanceof BitmapDrawable)))
            {
              Bitmap localBitmap = ((BitmapDrawable)localDrawable).getBitmap();
              localIntent.putExtra("iconBitmapKey", ((com.wandoujia.ripple_framework.navigation.b)i.k().a("holder")).a(localBitmap));
            }
          }
        }
      }
    }
    while (true)
    {
      paramContext.startActivity(localIntent);
      return;
      label247: localIntent.putExtra("iconUrl", paramModel.i());
    }
  }

  public final void a(Context paramContext, String paramString)
  {
    a(paramContext, new Action.Builder().intent("wdj://apps/detail/" + paramString).build());
  }

  public final void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, CampaignActivity.class);
    localIntent.putExtra("phoenix.intent.extra.URL", paramString);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    localIntent.putExtra("phoenix.intent.extra.SHOW_MORE_MENU", paramBoolean);
    paramContext.startActivity(localIntent);
  }

  public final Intent b(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = super.b(paramContext, paramString1, paramString2);
    if ((localIntent == null) && (paramString1.startsWith("ripple")))
    {
      i.k().a("app");
      localIntent = AppManager.c("com.wandoujia");
    }
    if ((localIntent != null) && (!"com.wandoujia.phoenix2".equals(localIntent.getPackage())))
      localIntent.addFlags(268435456);
    return localIntent;
  }

  public final void b()
  {
  }

  public final void b(Context paramContext)
  {
    Action.Builder localBuilder = new Action.Builder();
    localBuilder.intent("wdj://follow/categories");
    a(paramContext, localBuilder.build());
  }

  public final void b(Context paramContext, Model paramModel, View paramView)
  {
    Action localAction = paramModel.t();
    if (localAction == null)
      return;
    try
    {
      if (IntentUtils.canHandleIntent(paramContext, Intent.parseUri(localAction.intent, 1)))
      {
        if (localAction.intent.startsWith("wdj://search/ias"))
        {
          a(paramModel);
          return;
        }
        a(paramContext, paramModel, paramView);
        return;
      }
      if ((localAction.intent.startsWith("wdj://video")) && (paramModel.c() != null) && (paramModel.c().F() != null) && (!TextUtils.isEmpty(paramModel.c().F().package_name)))
      {
        a(paramContext, paramModel.c().F().package_name);
        return;
      }
      a(paramModel);
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
    }
  }

  public final void b(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, CampaignActivity.class);
    localIntent.putExtra("phoenix.intent.extra.URL", paramString);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public final void c(Context paramContext, String paramString)
  {
    b(paramContext, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.navigation.NavigationManager
 * JD-Core Version:    0.6.0
 */