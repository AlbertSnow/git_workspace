package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.UrlExtractor;
import com.wandoujia.jupiter.category.fragment.CategoryDetailFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CategoryDetailActivity extends BaseActivity
{
  private Bundle a;

  private String a()
  {
    List localList = b.a(getIntent());
    if (CollectionUtils.isEmpty(localList))
      return null;
    Uri localUri = Uri.parse(getIntent().getDataString());
    Set localSet = UrlExtractor.getQueryParameterNames(localUri);
    this.a = new Bundle();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      this.a.putString(str3, localUri.getQueryParameter(str3));
    }
    String str1 = "http://apis.wandoujia.com/apps/v1/categories/%s?format=proto";
    if (getIntent().getDataString().startsWith("wdj://games"))
      str1 = "http://apis.wandoujia.com/games/v1/categories/%s?format=proto";
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = URLEncoder.encode((String)localList.get(-1 + localList.size()), "UTF-8");
      String str2 = String.format(str1, arrayOfObject);
      return str2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return str1;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    CategoryDetailFragment localCategoryDetailFragment = new CategoryDetailFragment();
    String str = getIntent().getStringExtra("page_api_url");
    if (TextUtils.isEmpty(str))
      str = a();
    if (this.a == null)
      this.a = new Bundle();
    this.a.putString("page_api_url", str);
    if ((getIntent() != null) && (getIntent().getExtras() != null))
      this.a.putAll(getIntent().getExtras());
    if (this.a.getString("title") == null)
    {
      List localList = b.a(getIntent());
      if (!CollectionUtils.isEmpty(localList))
        this.a.putString("title", (String)localList.get(-1 + localList.size()));
    }
    localCategoryDetailFragment.setArguments(this.a);
    getSupportFragmentManager().a().b(16908290, localCategoryDetailFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.CategoryDetailActivity
 * JD-Core Version:    0.6.0
 */