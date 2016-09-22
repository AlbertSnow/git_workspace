package com.wandoujia.phoenix2.av.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;
import com.wandoujia.phoenix2.R.styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PairTextContainer extends LinearLayout
{
  private Integer a;
  private Integer b;
  private Integer c;
  private int d = -1;
  private List<View> e = new ArrayList();

  public PairTextContainer(Context paramContext)
  {
    super(paramContext);
  }

  public PairTextContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.PairTextContainer);
    this.a = Integer.valueOf(localTypedArray.getDimensionPixelSize(0, getResources().getDimensionPixelSize(2131427718)));
    this.b = Integer.valueOf(localTypedArray.getColor(1, getResources().getColor(2131362021)));
    this.c = Integer.valueOf(localTypedArray.getColor(2, getResources().getColor(2131362131)));
  }

  private void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean)
  {
    LinearLayout localLinearLayout = (LinearLayout)c.a(this, 2130903504);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(2131493939);
    if (this.b != null)
      localTextView1.setTextColor(this.b.intValue());
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(2131493940);
    if (this.c != null)
      localTextView2.setTextColor(this.c.intValue());
    localTextView1.setText(paramCharSequence1);
    localTextView1.setSingleLine(true);
    localTextView2.setText(paramCharSequence2);
    localTextView2.setSingleLine(paramBoolean);
    localTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    if (this.a != null)
    {
      ((LinearLayout.LayoutParams)localTextView1.getLayoutParams()).topMargin = this.a.intValue();
      ((LinearLayout.LayoutParams)localTextView2.getLayoutParams()).topMargin = this.a.intValue();
    }
    if (this.d > 0)
      localTextView1.setWidth(this.d);
    addView(localLinearLayout);
    this.e.add(localLinearLayout);
  }

  public final void a(int paramInt, String paramString, View.OnClickListener paramOnClickListener)
  {
    if (paramInt < this.e.size());
    for (LinearLayout localLinearLayout = (LinearLayout)this.e.get(paramInt); ; localLinearLayout = null)
    {
      if (localLinearLayout != null)
      {
        TextView localTextView = (TextView)localLinearLayout.findViewById(2131493941);
        localTextView.setText(paramString);
        localTextView.setVisibility(0);
        localTextView.setOnClickListener(paramOnClickListener);
        localTextView.post(new e(localTextView, paramString, localLinearLayout));
      }
      return;
    }
  }

  public void setData(List<? extends Pair<? extends CharSequence, ? extends CharSequence>> paramList)
  {
    removeAllViews();
    this.e.clear();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      a((CharSequence)localPair.first, (CharSequence)localPair.second, true);
    }
  }

  public final void setData$2e5c089a(List<? extends Pair<? extends CharSequence, ? extends CharSequence>> paramList)
  {
    removeAllViews();
    this.e.clear();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      a((CharSequence)localPair.first, (CharSequence)localPair.second, false);
    }
  }

  public void setLeftMiniWidth(int paramInt)
  {
    this.d = paramInt;
  }

  public void setSpannableData(List<Pair<CharSequence, CharSequence>> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      a((CharSequence)localPair.first, (CharSequence)localPair.second, true);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.view.PairTextContainer
 * JD-Core Version:    0.6.0
 */