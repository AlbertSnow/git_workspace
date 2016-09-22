package com.wandoujia.jupiter.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.fragment.DetailAppHistoryFragment;
import com.wandoujia.jupiter.fragment.DetailExpandInfoFragment;
import com.wandoujia.jupiter.fragment.DetailFragment;
import com.wandoujia.logv3.model.packages.ContentPackage;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.p4.app.upgrade.a;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.view.Anchor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DetailActivity extends BaseActivity
{
  private String a;

  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, DetailActivity.class);
    localIntent.putExtra("key_package_name", paramString);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    int i = -1;
    List localList = b.a(paramIntent);
    String str1;
    Anchor localAnchor;
    String str2;
    if (!localList.isEmpty())
    {
      str1 = (String)localList.get(-1 + localList.size());
      if (TextUtils.isEmpty(str1))
        str1 = paramIntent.getStringExtra("key_package_name");
      if (paramIntent == null)
        break label299;
      localAnchor = (Anchor)paramIntent.getParcelableExtra("anchor");
      str2 = paramIntent.getStringExtra("iconUrl");
      i = paramIntent.getIntExtra("iconBitmapKey", i);
    }
    for (String str3 = paramIntent.getStringExtra("page_api_url"); ; str3 = null)
    {
      if (TextUtils.isEmpty(str1))
      {
        finish();
        return;
        if (!TextUtils.isEmpty(paramIntent.getDataString()))
        {
          str1 = Uri.parse(paramIntent.getDataString()).getQueryParameter("id");
          break;
        }
        str1 = null;
        break;
      }
      this.a = str1;
      String str4 = paramIntent.getStringExtra("launch_keyword");
      if (("notification_push".equals(paramIntent.getStringExtra("launch_from"))) && (("notification_ripple_app_uninstall".equals(str4)) || ("notification_ripple_app_install".equals(str4))))
      {
        ContentPackage localContentPackage = new ContentPackage.Builder().type(ContentPackage.Type.APP).identity(str1).build();
        ExtraPackage.Builder localBuilder = new ExtraPackage.Builder().content_package(localContentPackage);
        TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.PUSH).status(TaskEvent.Status.TRIGGER).result(TaskEvent.Result.SUCCESS).result_info(str4);
        i.k().h().a(localBuilder1, localBuilder);
      }
      getSupportFragmentManager().a().b(16908290, DetailFragment.a(str1, localAnchor, str2, i, str3, getIntentUri())).a();
      return;
      label299: localAnchor = null;
      str2 = null;
    }
  }

  protected boolean customSystemTintBar()
  {
    return true;
  }

  protected int getSystemBarColor()
  {
    return getResources().getColor(2131362159);
  }

  protected boolean navigateTo(String paramString, int paramInt)
  {
    if (super.navigateTo(paramString, paramInt))
      return true;
    if (TextUtils.equals(paramString, "wdj://detail/app/expand_info"))
    {
      BaseFragment localBaseFragment2 = findCurrentFragment();
      if ((localBaseFragment2 instanceof DetailFragment))
      {
        String str3 = ((DetailFragment)localBaseFragment2).d();
        Iterator localIterator2 = this.allList.keySet().iterator();
        String str4;
        do
        {
          if (!localIterator2.hasNext())
            break;
          str4 = (String)localIterator2.next();
        }
        while (!str4.startsWith(str3));
        getSupportFragmentManager().a().a(16908290, DetailExpandInfoFragment.a(str4)).a("wdj://detail/app/expand_info").a();
        return true;
      }
    }
    else if (TextUtils.equals(paramString, "wdj://detail/app/history_info"))
    {
      BaseFragment localBaseFragment1 = findCurrentFragment();
      if ((localBaseFragment1 instanceof DetailFragment))
      {
        String str1 = ((DetailFragment)localBaseFragment1).d();
        Iterator localIterator1 = this.allList.keySet().iterator();
        while (localIterator1.hasNext())
        {
          String str2 = (String)localIterator1.next();
          if (!str2.startsWith(str1))
            continue;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.a;
          if (str2.startsWith(String.format("http://apis.wandoujia.com/five/v2/apps/%s/history?format=proto", arrayOfObject)))
            continue;
          getSupportFragmentManager().a().a(16908290, DetailAppHistoryFragment.b(str2)).a("wdj://detail/app/history_info").a();
          return true;
        }
      }
    }
    return false;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
    a.a(false, false);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.DetailActivity
 * JD-Core Version:    0.6.0
 */