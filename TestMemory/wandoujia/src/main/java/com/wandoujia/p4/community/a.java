package com.wandoujia.p4.community;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.card.models.CardViewModel.SubBadgeType;
import com.wandoujia.p4.utils.x;
import com.wandoujia.phoenix2.R.styleable;
import java.util.Iterator;
import java.util.List;

public class a<T>
{
  private final x<T> a = new x();

  public static CharSequence a(Context paramContext, int paramInt, List<CardViewModel.SubBadgeType> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator1 = paramList.iterator();
      if (localIterator1.hasNext())
      {
        CardViewModel.SubBadgeType localSubBadgeType2 = (CardViewModel.SubBadgeType)localIterator1.next();
        if (localSubBadgeType2.isText())
          localStringBuilder.append(localSubBadgeType2.getText());
        while (true)
        {
          localStringBuilder.append(" ");
          break;
          localStringBuilder.append(" ");
        }
      }
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(localStringBuilder.toString());
      Iterator localIterator2 = paramList.iterator();
      int i = 0;
      while (localIterator2.hasNext())
      {
        CardViewModel.SubBadgeType localSubBadgeType1 = (CardViewModel.SubBadgeType)localIterator2.next();
        if (localSubBadgeType1.isText())
        {
          int k;
          if (localSubBadgeType1.isVerticalColor())
          {
            TypedArray localTypedArray = paramContext.obtainStyledAttributes(R.styleable.NirvanaTheme);
            int m = localTypedArray.getResourceId(5, 2131361951);
            k = paramContext.getResources().getColor(m);
            localTypedArray.recycle();
          }
          while (true)
          {
            localSpannableStringBuilder.setSpan(new ForegroundColorSpan(k), i, i + localSubBadgeType1.getText().length(), 17);
            i += 1 + localSubBadgeType1.getText().length();
            break;
            k = localSubBadgeType1.getTextColor();
          }
        }
        int j = localSubBadgeType1.getImageResId();
        Drawable localDrawable = JupiterApplication.d().getApplicationContext().getResources().getDrawable(j);
        if ((localDrawable != null) && (localDrawable.getIntrinsicHeight() != 0))
        {
          float f = paramInt;
          localDrawable.setBounds(0, 0, (int)(f * localDrawable.getIntrinsicWidth() / localDrawable.getIntrinsicHeight()), (int)f);
        }
        localSpannableStringBuilder.setSpan(new c(localDrawable), i, i + 1, 17);
        i += 2;
      }
      return localSpannableStringBuilder;
    }
    return "";
  }

  protected final void a(b<T> paramb)
  {
    Iterator localIterator = this.a.b().iterator();
    while (localIterator.hasNext())
    {
      localIterator.next();
      paramb.a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.a
 * JD-Core Version:    0.6.0
 */