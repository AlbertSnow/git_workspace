package com.wandoujia.jupiter.library.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.appmanager.model.MarketAppInfo.ImportantUpgradeInfo;
import com.wandoujia.appmanager.model.MarketAppInfo.NotRecommendReason;
import com.wandoujia.p4.views.ExpandablePanel;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Calendar;
import java.util.Locale;

public final class q extends c
{
  private static String b(boolean paramBoolean, Model paramModel)
  {
    LocalAppInfo.UpgradeInfo localUpgradeInfo = b.a(paramModel);
    if (localUpgradeInfo == null)
      return "";
    if (localUpgradeInfo == null);
    for (boolean bool1 = false; bool1; bool1 = TextUtils.equals(localUpgradeInfo.getRecommendedType(), "NOT_RECOMMEND"))
    {
      SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder();
      localSpannableStringBuilder1.append(com.wandoujia.p4.a.a().getString(2131625189));
      localSpannableStringBuilder1.append("  ");
      localSpannableStringBuilder1.append(localUpgradeInfo.getNotRecommendReason().getDescription());
      return localSpannableStringBuilder1.toString();
    }
    SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder();
    Resources localResources = com.wandoujia.p4.a.a().getResources();
    int i = 0;
    if (localUpgradeInfo != null)
    {
      MarketAppInfo.ImportantUpgradeInfo localImportantUpgradeInfo = localUpgradeInfo.getImportantUpdate();
      i = 0;
      if (localImportantUpgradeInfo != null)
      {
        Calendar localCalendar = Calendar.getInstance(Locale.CHINA);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        boolean bool3 = localImportantUpgradeInfo.getExpireTime() < localCalendar.getTimeInMillis();
        i = 0;
        if (!bool3)
          i = 1;
      }
    }
    if (i != 0)
    {
      String str4 = localUpgradeInfo.getImportantUpdate().getDetail();
      if (!str4.endsWith("\n"))
        str4 = str4 + "\n";
      if (paramBoolean)
        str4 = str4.replace("\n", "  ");
      localSpannableStringBuilder2.append(str4);
      if (!paramBoolean)
        localSpannableStringBuilder2.append("\n");
    }
    String str1 = localUpgradeInfo.getChangeLog();
    if (!TextUtils.isEmpty(str1))
    {
      if (paramBoolean)
        str1 = str1.replace("\n", "  ");
      localSpannableStringBuilder2.append(str1);
      if (!str1.endsWith("\n"))
        localSpannableStringBuilder2.append("\n");
    }
    if (!paramBoolean)
      localSpannableStringBuilder2.append("\n");
    String str2 = localUpgradeInfo.getLastModifiedTime();
    boolean bool2 = localUpgradeInfo.isSuperior();
    String str3 = localUpgradeInfo.getMarket();
    localSpannableStringBuilder2.append(str2).append(localResources.getString(2131625544));
    if ((!bool2) && (!TextUtils.isEmpty(str3)))
      localSpannableStringBuilder2.append("\t").append(localResources.getString(2131624806)).append(str3);
    return localSpannableStringBuilder2.toString().replaceAll("\\n", "<br>");
  }

  protected final void a(Model paramModel)
  {
    ExpandablePanel localExpandablePanel = (ExpandablePanel)e();
    TextView localTextView = h().b(2131493710).j();
    if (TextUtils.isEmpty(b(true, paramModel)))
    {
      localExpandablePanel.setVisibility(8);
      d().b().b(2131493458).f(8);
    }
    do
    {
      return;
      localExpandablePanel.setVisibility(0);
      d().b().b(2131493458).f(0);
      localExpandablePanel.setCollapseHeight(localTextView.getPaddingTop() + 2 * localTextView.getLineHeight());
      localExpandablePanel.setExpandStateListener(new r(this, localTextView, paramModel));
      localExpandablePanel.setExpanded(false);
    }
    while ((Boolean)paramModel.a(2131492879) != Boolean.TRUE);
    localExpandablePanel.setExpanded(true);
    paramModel.a(2131492879, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.q
 * JD-Core Version:    0.6.0
 */