package com.wandoujia.p4.feedback;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.TicketCategoryItem;
import java.util.Iterator;
import java.util.List;

final class j
  implements ExpandableListView.OnChildClickListener
{
  j(FeedbackActivity paramFeedbackActivity)
  {
  }

  public final boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    String str1;
    SpannableStringBuilder localSpannableStringBuilder;
    String str2;
    int i;
    label274: ForegroundColorSpan localForegroundColorSpan;
    if (FeedbackActivity.e(this.a) != null)
    {
      if (paramInt2 == -2)
        break label444;
      str1 = (String)((List)FeedbackActivity.g(this.a).get(paramInt1)).get(paramInt2);
      if ((!this.a.getString(2131624743).equals(str1)) && (!this.a.getString(2131624744).equals(str1)))
        break label352;
      FeedbackActivity.b(this.a, this.a.getString(2131625140));
      Iterator localIterator = FeedbackActivity.f(this.a).iterator();
      while (localIterator.hasNext())
      {
        ZendeskModels.TicketCategoryItem localTicketCategoryItem = (ZendeskModels.TicketCategoryItem)localIterator.next();
        if ((str1 == null) || (!str1.equals(localTicketCategoryItem.getName())))
          continue;
        FeedbackActivity.a(this.a, localTicketCategoryItem.getValue());
      }
      localSpannableStringBuilder = new SpannableStringBuilder();
      str2 = ((ZendeskModels.TicketCategoryItem)FeedbackActivity.e(this.a).get(paramInt1)).getName();
      localSpannableStringBuilder.append(str2);
      localSpannableStringBuilder.append("\n");
      localSpannableStringBuilder.append((CharSequence)((List)FeedbackActivity.g(this.a).get(paramInt1)).get(paramInt2));
      AbsoluteSizeSpan localAbsoluteSizeSpan = new AbsoluteSizeSpan((int)(FeedbackActivity.h(this.a).getTextSize() - 5.0F));
      if (!TextUtils.isEmpty(str2))
        break label424;
      i = 0;
      localSpannableStringBuilder.setSpan(localAbsoluteSizeSpan, i, localSpannableStringBuilder.length(), 33);
      localForegroundColorSpan = new ForegroundColorSpan(this.a.getResources().getColor(2131361991));
      if (!TextUtils.isEmpty(str2))
        break label434;
    }
    label424: label434: for (int j = 0; ; j = str2.length())
    {
      localSpannableStringBuilder.setSpan(localForegroundColorSpan, j, localSpannableStringBuilder.length(), 33);
      FeedbackActivity.h(this.a).setText(localSpannableStringBuilder);
      return false;
      label352: if (this.a.getString(2131624793).equals(str1))
      {
        FeedbackActivity.b(this.a, this.a.getString(2131625146));
        break;
      }
      if (!this.a.getString(2131624784).equals(str1))
        break;
      FeedbackActivity.b(this.a, this.a.getString(2131625141));
      break;
      i = str2.length();
      break label274;
    }
    label444: FeedbackActivity.a(this.a, ((ZendeskModels.TicketCategoryItem)FeedbackActivity.e(this.a).get(paramInt1)).getValue());
    FeedbackActivity.h(this.a).setText(((ZendeskModels.TicketCategoryItem)FeedbackActivity.e(this.a).get(paramInt1)).getName());
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.j
 * JD-Core Version:    0.6.0
 */