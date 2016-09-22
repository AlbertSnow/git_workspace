package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public class TagListActivity extends BaseActivity
{
  private String a;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getIntent().getStringExtra("argument");
    if (TextUtils.isEmpty(this.a))
    {
      List localList = b.a(getIntent());
      if (!CollectionUtils.isEmpty(localList))
        this.a = ((String)localList.get(-1 + localList.size()));
    }
    ListFragment localListFragment = new ListFragment();
    Bundle localBundle = null;
    try
    {
      String str = "wdj://apps/tags/" + this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = URLEncoder.encode(this.a, "UTF-8");
      localBundle = ListFragment.b(str, String.format("http://apis.wandoujia.com/apps/v1/search?tag=%s", arrayOfObject));
      localBundle.putString("title", this.a);
      label141: if ((localBundle != null) && (getIntent() != null) && (getIntent().getExtras() != null))
        localBundle.putAll(getIntent().getExtras());
      localListFragment.setArguments(localBundle);
      getSupportFragmentManager().a().b(16908290, localListFragment).a();
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label141;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.TagListActivity
 * JD-Core Version:    0.6.0
 */