package com.wandoujia.ripple_framework.ripple.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.fragment.JupiterDetailPagerFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.model.DetailInfo;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.navigation.c;
import com.wandoujia.ripple_framework.ripple.fragment.DetailPagerFragment;
import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends BaseActivity
  implements c
{
  private int a = -1;
  private com.wandoujia.nirvana.framework.network.page.a<Model> b;
  private DetailInfo c;

  private static int a(Uri paramUri, String paramString)
  {
    List localList = paramUri.getPathSegments();
    if (CollectionUtils.isEmpty(localList))
      return -1;
    return localList.indexOf(paramString);
  }

  public static com.wandoujia.nirvana.framework.network.page.a<Model> a(Model paramModel)
  {
    return new com.wandoujia.ripple_framework.model.i(paramModel, "ripple://detail/" + paramModel.e());
  }

  private boolean a(Uri paramUri)
  {
    String str1;
    if (("apps".equals(paramUri.getHost())) || (a(paramUri, "apps") >= 0))
    {
      str1 = paramUri.getLastPathSegment();
      if (str1 != null);
    }
    String str2;
    do
    {
      do
      {
        return false;
        AppDetail localAppDetail = new AppDetail.Builder().package_name(str1).build();
        Detail localDetail = new Detail.Builder().app_detail(localAppDetail).build();
        Model localModel1 = new Model(new Entity.Builder().id(Long.valueOf(-1L)).content_type(ContentTypeEnum.ContentType.APP).type(Integer.valueOf(ContentTypeEnum.ContentType.APP.getValue())).detail(localDetail).build());
        new ArrayList().add(localModel1);
        this.b = a(localModel1);
        this.c = new DetailInfo(this.b.a(), null, localModel1.e(), 262);
        return true;
      }
      while ((!"items".equals(paramUri.getHost())) && (a(paramUri, "items") < 0) && (!"article".equals(paramUri.getHost())));
      str2 = paramUri.getLastPathSegment();
    }
    while (str2 == null);
    try
    {
      Long localLong = Long.valueOf(Long.parseLong(str2));
      long l = localLong.longValue();
      Model localModel2 = new Model(new Entity.Builder().id(Long.valueOf(l)).content_type(ContentTypeEnum.ContentType.FEED).type(Integer.valueOf(ContentTypeEnum.ContentType.FEED.getValue())).build());
      new ArrayList().add(localModel2);
      this.b = a(localModel2);
      this.c = new DetailInfo(this.b.a(), null, localModel2.e(), 262);
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  protected void applyTheme()
  {
  }

  public void finish()
  {
    super.finish();
    overridePendingTransition(0, 0);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getSupportFragmentManager().a(new a(this));
    Intent localIntent = getIntent();
    int i;
    if (localIntent == null)
      i = 0;
    while (true)
    {
      if (i == 0)
        finish();
      return;
      String str = localIntent.getAction();
      if ("android.intent.action.VIEW".equals(str))
      {
        Uri localUri = localIntent.getData();
        if (localUri == null)
        {
          i = 0;
          continue;
        }
        if (!a(localUri))
        {
          i = 0;
          continue;
        }
      }
      else if ("view_list".equals(str))
      {
        com.wandoujia.ripple_framework.navigation.b localb = (com.wandoujia.ripple_framework.navigation.b)com.wandoujia.ripple_framework.i.k().a("holder");
        this.a = getIntent().getExtras().getInt("object", -1);
        if (this.a >= 0)
          this.b = ((com.wandoujia.nirvana.framework.network.page.a)localb.a(this.a));
        this.c = ((DetailInfo)getIntent().getParcelableExtra("detail"));
      }
      if ((this.b == null) || (this.c == null))
      {
        i = 0;
        continue;
      }
      addList(this.b);
      this.c.a(this.b.c());
      if (!this.c.a())
      {
        i = 0;
        continue;
      }
      if ((com.wandoujia.ripple_framework.b.b)com.wandoujia.ripple_framework.i.k().a("component") == null)
      {
        i = 0;
        continue;
      }
      JupiterDetailPagerFragment localJupiterDetailPagerFragment = new JupiterDetailPagerFragment();
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("detail", this.c);
      localJupiterDetailPagerFragment.setArguments(localBundle);
      getSupportFragmentManager().a().b(16908290, localJupiterDetailPagerFragment).a(null).a();
      i = 1;
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.a >= 0)
      ((com.wandoujia.ripple_framework.navigation.b)com.wandoujia.ripple_framework.i.k().a("holder")).a(this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.activity.DetailActivity
 * JD-Core Version:    0.6.0
 */