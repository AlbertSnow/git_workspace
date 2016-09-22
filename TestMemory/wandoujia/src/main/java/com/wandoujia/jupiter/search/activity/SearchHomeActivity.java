package com.wandoujia.jupiter.search.activity;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.base.utils.UrlExtractor;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.search.fragment.SearchHomeFragment;
import com.wandoujia.jupiter.search.manage.SearchHistoryManager;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.log.Logger.PageParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class SearchHomeActivity extends BaseActivity
{
  private SearchHomeFragment a;
  private String b;
  private String c;
  private ArrayList<Logger.PageParameter> d;
  private String e;

  private void a(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      finish();
      return;
    }
    Bundle localBundle = new Bundle();
    b(paramIntent);
    localBundle.putString("extra_query", this.e);
    localBundle.putString("page_api_url", this.b);
    localBundle.putString("page_intent_uri", this.c);
    localBundle.putParcelableArrayList("page_uri_param", this.d);
    localBundle.putBoolean("extra_from_spinner", paramIntent.getBooleanExtra("extra_from_spinner", false));
    if (this.a != null)
      this.a.e();
    this.a = new SearchHomeFragment();
    this.a.setArguments(localBundle);
    getSupportFragmentManager().a().b(16908290, this.a).a();
  }

  private boolean b(Intent paramIntent)
  {
    if (paramIntent == null)
      return false;
    this.e = null;
    if (!TextUtils.isEmpty(paramIntent.getStringExtra("extra_query")))
    {
      this.e = paramIntent.getStringExtra("extra_query");
      label33: if (this.e == null)
        break label205;
      JupiterApplication.d().f().a(this.e);
      if (TextUtils.isEmpty(paramIntent.getStringExtra("page_api_url")))
        break label207;
    }
    label205: label207: Uri.Builder localBuilder;
    for (this.b = paramIntent.getStringExtra("page_api_url"); ; this.b = localBuilder.toString())
    {
      this.c = ("wdj://search/result/" + this.e);
      this.d = new ArrayList();
      Uri localUri2 = Uri.parse(this.b);
      String str2 = localUri2.getQueryParameter("sid");
      if (str2 != null)
        this.d.add(new Logger.PageParameter("sid", str2));
      String str3 = localUri2.getQueryParameter("from");
      if (str3 != null)
        this.d.add(new Logger.PageParameter("from", str3));
      return true;
      if (paramIntent.getData() == null)
        break label33;
      this.e = paramIntent.getData().getLastPathSegment();
      break label33;
      break;
      Uri localUri1 = paramIntent.getData();
      localBuilder = new Uri.Builder();
      localBuilder.encodedPath("http://ias.wandoujia.com/api/v3/search");
      Iterator localIterator = UrlExtractor.getQueryParameterNames(localUri1).iterator();
      while (localIterator.hasNext())
      {
        String str4 = (String)localIterator.next();
        localBuilder.appendQueryParameter(str4, localUri1.getQueryParameter(str4));
      }
      localBuilder.appendQueryParameter("query", this.e);
      localBuilder.appendQueryParameter("sid", String.valueOf(UUID.randomUUID().getMostSignificantBits()));
      localBuilder.appendQueryParameter("id", "wandoujia_android");
      String str1 = paramIntent.getStringExtra("source");
      if (str1 == null)
        continue;
      localBuilder.appendQueryParameter("from", str1);
    }
  }

  public final String a()
  {
    return this.e;
  }

  protected boolean customSystemTintBar()
  {
    return true;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.activity.SearchHomeActivity
 * JD-Core Version:    0.6.0
 */