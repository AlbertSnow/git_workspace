package com.wandoujia.p4.pay.fragment;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketCategoryItem;
import java.util.Iterator;
import java.util.List;

class FeedbackFragment$CategorySpinnerSelectedListener
  implements ExpandableListView.OnChildClickListener
{
  FeedbackFragment$CategorySpinnerSelectedListener(FeedbackFragment paramFeedbackFragment)
  {
  }

  public boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    String str2;
    int i;
    int j;
    label272: label300: FeedbackFragment localFeedbackFragment;
    if (FeedbackFragment.access$600(this.this$0) != null)
    {
      if (paramInt2 == -2)
        break label376;
      String str1 = (String)((List)FeedbackFragment.access$700(this.this$0).get(paramInt1)).get(paramInt2);
      Iterator localIterator = FeedbackFragment.access$800(this.this$0).iterator();
      while (localIterator.hasNext())
      {
        ZendeskModels.TicketCategoryItem localTicketCategoryItem = (ZendeskModels.TicketCategoryItem)localIterator.next();
        if ((str1 == null) || (!str1.equals(localTicketCategoryItem.getName())))
          continue;
        FeedbackFragment.access$902(this.this$0, localTicketCategoryItem.getValue());
      }
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      str2 = ((ZendeskModels.TicketCategoryItem)FeedbackFragment.access$600(this.this$0).get(paramInt1)).getName();
      localSpannableStringBuilder.append(str2);
      localSpannableStringBuilder.append("\n");
      localSpannableStringBuilder.append((CharSequence)((List)FeedbackFragment.access$700(this.this$0).get(paramInt1)).get(paramInt2));
      AbsoluteSizeSpan localAbsoluteSizeSpan = new AbsoluteSizeSpan((int)(FeedbackFragment.access$1000(this.this$0).getTextSize() - 5.0F));
      if (!TextUtils.isEmpty(str2))
        break label356;
      i = 0;
      localSpannableStringBuilder.setSpan(localAbsoluteSizeSpan, i, localSpannableStringBuilder.length(), 33);
      ForegroundColorSpan localForegroundColorSpan = new ForegroundColorSpan(this.this$0.getResources().getColor(2131362210));
      if (!TextUtils.isEmpty(str2))
        break label366;
      j = 0;
      localSpannableStringBuilder.setSpan(localForegroundColorSpan, j, localSpannableStringBuilder.length(), 33);
      FeedbackFragment.access$1000(this.this$0).setText(localSpannableStringBuilder);
      this.this$0.currentMainCategoryValue = ((ZendeskModels.TicketCategoryItem)FeedbackFragment.access$600(this.this$0).get(paramInt1)).getValue();
      localFeedbackFragment = this.this$0;
      if (paramInt1 == 0)
        break label435;
    }
    label435: for (boolean bool = true; ; bool = false)
    {
      FeedbackFragment.access$1102(localFeedbackFragment, bool);
      this.this$0.updateFeedbackDescriptionUI();
      return false;
      label356: i = str2.length();
      break;
      label366: j = str2.length();
      break label272;
      label376: FeedbackFragment.access$902(this.this$0, ((ZendeskModels.TicketCategoryItem)FeedbackFragment.access$600(this.this$0).get(paramInt1)).getValue());
      FeedbackFragment.access$1000(this.this$0).setText(((ZendeskModels.TicketCategoryItem)FeedbackFragment.access$600(this.this$0).get(paramInt1)).getName());
      break label300;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.FeedbackFragment.CategorySpinnerSelectedListener
 * JD-Core Version:    0.6.0
 */