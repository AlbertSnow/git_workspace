package com.wandoujia.p4.app.detail.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.mvc.BaseView;

public class CommentBar extends LinearLayout
  implements BaseView
{
  private TextView a;
  private TextView b;
  private EditText c;
  private final View.OnClickListener d = new a();
  private final View.OnTouchListener e = new b();

  public CommentBar(Context paramContext)
  {
    super(paramContext);
  }

  public CommentBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  @TargetApi(11)
  public CommentBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public TextView getDislikeView()
  {
    return this.b;
  }

  public EditText getInputView()
  {
    return this.c;
  }

  public TextView getLikeView()
  {
    return this.a;
  }

  public View getView()
  {
    return this;
  }

  protected void onFinishInflate()
  {
    this.a = ((TextView)findViewById(2131493903));
    this.b = ((TextView)findViewById(2131493905));
    findViewById(2131493902);
    findViewById(2131493904);
    this.c = ((EditText)findViewById(2131493906));
    this.a.setOnClickListener(this.d);
    this.b.setOnClickListener(this.d);
    this.c.setOnTouchListener(this.e);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.view.CommentBar
 * JD-Core Version:    0.6.0
 */