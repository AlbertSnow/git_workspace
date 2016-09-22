package com.wandoujia.p4.button.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import com.wandoujia.p4.views.NirvanaListPopupWindow;
import com.wandoujia.phoenix2.R.styleable;
import java.util.List;

public class SubActionButton extends ImageButton
{
  private final View.OnClickListener a = new e(this);
  private final AdapterView.OnItemClickListener b = new f(this);
  private List<i> c;
  private h d;
  private NirvanaListPopupWindow e;
  private boolean f;
  private int g;

  public SubActionButton(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public SubActionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public SubActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    setBackgroundDrawable(null);
    this.e = new NirvanaListPopupWindow(getContext());
    this.e.a(this);
    this.d = new h(this);
    this.e.a(this.d);
    this.e.d(-2);
    this.e.a(this.b);
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.SubActionButton, 0, 0);
      this.f = localTypedArray.getBoolean(0, false);
      this.g = localTypedArray.getResourceId(1, 2130838284);
      localTypedArray.recycle();
    }
  }

  public void setAlwaysShowAsAction(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void setData(List<i> paramList)
  {
    this.c = paramList;
    this.d.notifyDataSetChanged();
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      if ((this.f) || (paramList.size() > 1))
      {
        setImageResource(this.g);
        setOnClickListener(this.a);
      }
    }
    else
      return;
    paramList.get(0);
    setImageResource(0);
    setOnClickListener(new g(paramList));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.SubActionButton
 * JD-Core Version:    0.6.0
 */