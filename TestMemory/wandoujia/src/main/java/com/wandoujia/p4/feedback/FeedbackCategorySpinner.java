package com.wandoujia.p4.feedback;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.TextView;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.view.a.h;
import java.util.List;

public class FeedbackCategorySpinner extends TextView
{
  private w a;
  private boolean b = true;
  private ExpandableListView.OnChildClickListener c;
  private h d;

  public FeedbackCategorySpinner(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public FeedbackCategorySpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  public FeedbackCategorySpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903067, null);
    localView.setBackgroundDrawable(getResources().getDrawable(2130838050));
    if (SystemUtil.aboveApiLevel(11));
    for (this.a = new s(this, localView); ; this.a = new n(this, localView))
    {
      setClickable(true);
      setSelected(true);
      return;
    }
  }

  public final void a(List<String> paramList, List<List<String>> paramList1, String paramString)
  {
    if (this.a != null)
    {
      if ((!TextUtils.isEmpty(paramString)) && (!TextUtils.isEmpty(getText())))
        this.b = false;
      this.a.a(paramList, paramList1, paramString);
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.a != null) && (this.a.isShowing()))
      this.a.dismiss();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.b)
    {
      if (!this.a.isShowing())
        this.a.a();
      this.b = false;
    }
    super.onDraw(paramCanvas);
  }

  public boolean performClick()
  {
    if (!this.a.isShowing())
      this.a.a();
    return super.performClick();
  }

  public void setOnChildClickListener(ExpandableListView.OnChildClickListener paramOnChildClickListener)
  {
    this.c = paramOnChildClickListener;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.FeedbackCategorySpinner
 * JD-Core Version:    0.6.0
 */