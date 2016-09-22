package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.base.utils.UrlExtractor;
import com.wandoujia.jupiter.fragment.TabListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.util.Iterator;
import java.util.Set;

public class CommonActivity extends BaseActivity
{
  private static Bundle a(Intent paramIntent)
  {
    Bundle localBundle = new Bundle();
    if ((paramIntent != null) && (!TextUtils.isEmpty(paramIntent.getDataString())))
    {
      String str1 = paramIntent.getDataString();
      Uri localUri = Uri.parse(str1);
      Iterator localIterator = UrlExtractor.getQueryParameterNames(localUri).iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        localBundle.putString(str2, localUri.getQueryParameter(str2));
      }
      localBundle.putString("page_intent_uri", str1);
    }
    return localBundle;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
    TabListFragment localTabListFragment = new TabListFragment();
    Bundle localBundle = a(getIntent());
    if ((getIntent() != null) && (getIntent().getExtras() != null))
      localBundle.putAll(getIntent().getExtras());
    localTabListFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(16908290, localTabListFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.CommonActivity
 * JD-Core Version:    0.6.0
 */