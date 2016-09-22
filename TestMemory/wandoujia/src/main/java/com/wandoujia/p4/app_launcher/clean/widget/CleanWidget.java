package com.wandoujia.p4.app_launcher.clean.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.mvc.BaseView;
import com.wandoujia.p4.utils.c;

public class CleanWidget extends RelativeLayout
  implements BaseView
{
  private TextView a;
  private TextView b;
  private ImageView c;
  private CircleProgressBar d;

  public CleanWidget(Context paramContext)
  {
    super(paramContext);
  }

  public CleanWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CleanWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static CleanWidget a(ViewGroup paramViewGroup)
  {
    return (CleanWidget)c.a(paramViewGroup, 2130903157);
  }

  public CircleProgressBar getCircleProgressBar()
  {
    return this.d;
  }

  public ImageView getProgressImg()
  {
    return this.c;
  }

  public TextView getProgressText()
  {
    return this.a;
  }

  public TextView getStatusText()
  {
    return this.b;
  }

  public View getView()
  {
    return this;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131493407));
    this.b = ((TextView)findViewById(2131493409));
    this.c = ((ImageView)findViewById(2131493408));
    this.d = ((CircleProgressBar)findViewById(2131493406));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.CleanWidget
 * JD-Core Version:    0.6.0
 */