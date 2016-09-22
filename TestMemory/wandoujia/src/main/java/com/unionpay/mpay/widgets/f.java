package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.c.c;
import com.unionpay.mpay.utils.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f
{
  private static final int a = a.m;
  private static final int b = a.g;
  private static List<Integer> i = new ArrayList(10);
  private Context c = null;
  private View.OnClickListener d = null;
  private PopupWindow e = null;
  private View f = null;
  private ScrollView g = null;
  private int h = -1;
  private PopupWindow.OnDismissListener j = new i(this);

  static
  {
    for (int k = 0; k < 10; k++)
      i.add(Integer.valueOf(k));
  }

  public f(Context paramContext, View.OnClickListener paramOnClickListener, View paramView)
  {
    this.c = paramContext;
    this.d = paramOnClickListener;
    for (ViewParent localViewParent = (ViewParent)paramView; ; localViewParent = localViewParent.getParent())
    {
      if (localViewParent != null)
      {
        if (!(localViewParent instanceof ScrollView))
          continue;
        this.g = ((ScrollView)localViewParent);
        new StringBuilder("mSV : ").append(this.g.toString());
        new StringBuilder(" mSV H:").append(this.g.getHeight());
        this.f = ((ScrollView)localViewParent).getChildAt(0);
      }
      RelativeLayout localRelativeLayout1 = new RelativeLayout(paramContext);
      new RelativeLayout.LayoutParams(-1, -2).setMargins(0, 0, 0, 0);
      localRelativeLayout1.setBackgroundColor(-1342177280);
      RelativeLayout localRelativeLayout2 = new RelativeLayout(paramContext);
      localRelativeLayout2.setBackgroundColor(-13290188);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.setMargins(0, 0, 0, 0);
      localRelativeLayout1.addView(localRelativeLayout2, localLayoutParams);
      localRelativeLayout2.addView(a(paramContext), localLayoutParams);
      this.e = new PopupWindow(localRelativeLayout1, -1, -2, true);
      new RelativeLayout.LayoutParams(-1, -2);
      this.e.setBackgroundDrawable(new BitmapDrawable());
      this.e.setOutsideTouchable(false);
      this.e.setFocusable(false);
      this.e.setOnDismissListener(this.j);
      return;
    }
  }

  private LinearLayout a(Context paramContext)
  {
    LinearLayout localLinearLayout1 = new LinearLayout(paramContext);
    localLinearLayout1.setOrientation(1);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    localLinearLayout1.setPadding(b, b, b, b);
    localLinearLayout1.setLayoutParams(localLayoutParams1);
    for (int k = 0; k < 4; k++)
    {
      LinearLayout localLinearLayout2 = new LinearLayout(paramContext);
      localLinearLayout2.setOrientation(0);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
      a(localLinearLayout2, k);
      localLinearLayout1.addView(localLinearLayout2, localLayoutParams2);
    }
    b(localLinearLayout1);
    return localLinearLayout1;
  }

  private void a(LinearLayout paramLinearLayout, int paramInt)
  {
    int k = a.B / 3;
    RelativeLayout localRelativeLayout = new RelativeLayout(this.c);
    paramLinearLayout.addView(localRelativeLayout, new RelativeLayout.LayoutParams(-1, a));
    int m = 0;
    if (m < 3)
    {
      TextView localTextView = new TextView(this.c);
      localTextView.setTextSize(30.0F);
      localTextView.setGravity(17);
      int n = m + paramInt * 3;
      localTextView.setTag(Integer.valueOf(n));
      c localc = c.a(this.c);
      label121: RelativeLayout.LayoutParams localLayoutParams;
      if (n == 9)
      {
        localTextView.setBackgroundDrawable(localc.a(2011, -1, -1));
        localTextView.setTextColor(d.a(-1, -12747087));
        localTextView.setOnClickListener(this.d);
        localLayoutParams = new RelativeLayout.LayoutParams(k, a);
        switch (m)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
      }
      while (true)
      {
        m++;
        break;
        if (n == 11)
        {
          localTextView.setBackgroundDrawable(localc.a(2012, -1, -1));
          break label121;
        }
        localTextView.setBackgroundDrawable(localc.a(2010, -1, -1));
        break label121;
        localLayoutParams.addRule(9, -1);
        localLayoutParams.leftMargin = 0;
        localRelativeLayout.addView(localTextView, localLayoutParams);
        continue;
        localLayoutParams.addRule(13, -1);
        localRelativeLayout.addView(localTextView, localLayoutParams);
        continue;
        localLayoutParams.addRule(11, -1);
        localLayoutParams.rightMargin = 0;
        localRelativeLayout.addView(localTextView, localLayoutParams);
      }
    }
  }

  private static void b(View paramView)
  {
    Collections.shuffle(i);
    int k = 0;
    if (k < 12)
    {
      TextView localTextView = (TextView)paramView.findViewWithTag(Integer.valueOf(k));
      if (k == 9)
        localTextView.setId(10);
      while (true)
      {
        k++;
        break;
        if (k == 11)
        {
          localTextView.setId(20);
          continue;
        }
        if (k == 10)
        {
          localTextView.setText(String.valueOf(i.get(k - 1)));
          localTextView.setId(((Integer)i.get(k - 1)).intValue());
          continue;
        }
        localTextView.setText(String.valueOf(i.get(k)));
        localTextView.setId(((Integer)i.get(k)).intValue());
      }
    }
  }

  private static int c()
  {
    return 4 * a + 5 * b + b;
  }

  public final void a()
  {
    if (this.e != null)
      this.e.dismiss();
  }

  public final void a(View paramView)
  {
    if (this.e != null)
    {
      this.e.showAtLocation(paramView, 80, 0, 0);
      this.e.update();
      if (this.f != null)
      {
        paramView.setVisibility(0);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.g.getLayoutParams();
        this.h = localMarginLayoutParams.height;
        Rect localRect = new Rect();
        paramView.getWindowVisibleDisplayFrame(localRect);
        localMarginLayoutParams.height = (a.n - localRect.top - a.i - 2 * a.a - c());
        new StringBuilder("height = ").append(localMarginLayoutParams.height);
        localMarginLayoutParams.bottomMargin = c();
        this.g.setLayoutParams(localMarginLayoutParams);
      }
    }
  }

  public final boolean b()
  {
    return this.e.isShowing();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.f
 * JD-Core Version:    0.6.0
 */