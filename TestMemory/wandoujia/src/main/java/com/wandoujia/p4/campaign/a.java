package com.wandoujia.p4.campaign;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.l;
import android.text.TextUtils;
import android.view.MenuItem;
import android.webkit.WebView;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.search.activity.SearchQueryHistoryActivity;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;

final class a
  implements l
{
  a(CampaignFragment paramCampaignFragment)
  {
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    if (CampaignFragment.a(this.a) == null)
      return false;
    switch (paramMenuItem.getItemId())
    {
    case 2131494118:
    case 2131494119:
    case 2131494120:
    case 2131494121:
    default:
      return false;
    case 2131494117:
      SearchQueryHistoryActivity.a(JupiterApplication.e(), SearchTypeForHint.ALL);
    case 2131494122:
    case 2131494123:
    case 2131494124:
    }
    while (true)
    {
      return true;
      CampaignFragment.a(this.a, false);
      CampaignFragment.a(this.a).loadUrl(this.a.a);
      continue;
      if (TextUtils.isEmpty(CampaignFragment.a(this.a).getUrl()))
        continue;
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(CampaignFragment.a(this.a).getUrl()));
      try
      {
        this.a.startActivity(localIntent);
      }
      catch (Exception localException)
      {
      }
      continue;
      if (SystemUtil.aboveApiLevel(11))
      {
        ((android.content.ClipboardManager)this.a.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label", CampaignFragment.a(this.a).getUrl()));
        continue;
      }
      ((android.text.ClipboardManager)this.a.getActivity().getSystemService("clipboard")).setText(CampaignFragment.a(this.a).getUrl());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.a
 * JD-Core Version:    0.6.0
 */