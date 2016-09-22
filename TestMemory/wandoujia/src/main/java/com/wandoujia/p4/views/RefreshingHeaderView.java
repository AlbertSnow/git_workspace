package com.wandoujia.p4.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;
import java.util.Calendar;

public class RefreshingHeaderView extends RelativeLayout
{
  private TextView a;

  public RefreshingHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static RefreshingHeaderView a(ViewGroup paramViewGroup)
  {
    return (RefreshingHeaderView)c.a(paramViewGroup, 2130903506);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131493943));
    findViewById(2131493942);
    measure(0, 0);
    getMeasuredHeight();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    getMeasuredHeight();
  }

  public void setLastCacheTime(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    int i = localCalendar.get(2);
    int j = localCalendar.get(5);
    String str1 = getContext().getString(2131625238);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i + 1);
    arrayOfObject[1] = Integer.valueOf(j);
    String str2 = String.format(str1, arrayOfObject);
    this.a.setText(str2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.RefreshingHeaderView
 * JD-Core Version:    0.6.0
 */