package com.wandoujia.jupiter.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;

public class SearchHotQueryItem extends LinearLayout
{
  private TextView a;
  private View b;

  public SearchHotQueryItem(Context paramContext)
  {
    super(paramContext);
  }

  public SearchHotQueryItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static SearchHotQueryItem a(ViewGroup paramViewGroup)
  {
    return (SearchHotQueryItem)c.a(paramViewGroup, 2130903597);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.setText(paramString1);
    boolean bool = "new".equalsIgnoreCase(paramString2);
    View localView = this.b;
    if (bool);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131492998));
    this.b = findViewById(2131493689);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((View.MeasureSpec.getMode(paramInt1) != 0) && (this.b.getVisibility() == 0))
    {
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)this.a.getLayoutParams();
      this.b.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), -2147483648), View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), 1073741824));
      int i = getMeasuredWidth() - getPaddingLeft() - getPaddingRight() - this.b.getMeasuredWidth() - localLayoutParams1.leftMargin - localLayoutParams1.rightMargin - localLayoutParams2.leftMargin - localLayoutParams2.rightMargin;
      this.a.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), 1073741824));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.SearchHotQueryItem
 * JD-Core Version:    0.6.0
 */