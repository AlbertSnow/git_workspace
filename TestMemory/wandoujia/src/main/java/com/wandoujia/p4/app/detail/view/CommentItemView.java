package com.wandoujia.p4.app.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.mvc.BaseView;
import com.wandoujia.p4.utils.c;

public class CommentItemView extends LinearLayout
  implements BaseView
{
  private ImageView a;
  private TextView b;
  private TextView c;
  private ImageView d;
  private TextView e;

  public CommentItemView(Context paramContext)
  {
    super(paramContext);
  }

  public CommentItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CommentItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static CommentItemView a(ViewGroup paramViewGroup)
  {
    return (CommentItemView)c.a(paramViewGroup, 2130903486);
  }

  public ImageView getAuthorIconView()
  {
    return this.a;
  }

  public TextView getAuthorNameView()
  {
    return this.b;
  }

  public TextView getContentView()
  {
    return this.e;
  }

  public TextView getDateView()
  {
    return this.c;
  }

  public ImageView getHeartView()
  {
    return this.d;
  }

  public View getView()
  {
    return this;
  }

  protected void onFinishInflate()
  {
    this.a = ((ImageView)findViewById(2131493622));
    this.b = ((TextView)findViewById(2131492875));
    this.c = ((TextView)findViewById(2131493623));
    this.d = ((ImageView)findViewById(2131493624));
    this.e = ((TextView)findViewById(2131492888));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.view.CommentItemView
 * JD-Core Version:    0.6.0
 */