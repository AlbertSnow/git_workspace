package com.wandoujia.p4.pay.feedback;

import android.app.AlertDialog.Builder;
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
import java.util.List;

public class FeedbackCategorySpinner extends TextView
{
  private AlertDialog.Builder builder;
  private boolean defaultExpanded = true;
  private ExpandableListView.OnChildClickListener mOnItemSelectedListener;
  private FeedbackCategorySpinner.SpinnerPopup mPopup;

  public FeedbackCategorySpinner(Context paramContext)
  {
    super(paramContext);
    initView(paramContext);
  }

  public FeedbackCategorySpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView(paramContext);
  }

  public FeedbackCategorySpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView(paramContext);
  }

  private void initView(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903067, null);
    localView.setBackgroundDrawable(getResources().getDrawable(2130838050));
    if (SystemUtil.aboveApiLevel(11));
    for (this.mPopup = new FeedbackCategorySpinner.DropdownPopup(this, localView); ; this.mPopup = new FeedbackCategorySpinner.CategoryAlertDialog(this, localView))
    {
      setClickable(true);
      setSelected(true);
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.mPopup != null) && (this.mPopup.isShowing()))
      this.mPopup.dismiss();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.defaultExpanded)
    {
      if (!this.mPopup.isShowing())
        this.mPopup.show();
      this.defaultExpanded = false;
    }
    super.onDraw(paramCanvas);
  }

  public boolean performClick()
  {
    if (!this.mPopup.isShowing())
      this.mPopup.show();
    return super.performClick();
  }

  public void setData(List<String> paramList, List<List<String>> paramList1, String paramString)
  {
    if (this.mPopup != null)
    {
      if ((!TextUtils.isEmpty(paramString)) && (!TextUtils.isEmpty(getText())))
        this.defaultExpanded = false;
      this.mPopup.setData(paramList, paramList1, paramString);
    }
  }

  public void setOnChildClickListener(ExpandableListView.OnChildClickListener paramOnChildClickListener)
  {
    this.mOnItemSelectedListener = paramOnChildClickListener;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner
 * JD-Core Version:    0.6.0
 */