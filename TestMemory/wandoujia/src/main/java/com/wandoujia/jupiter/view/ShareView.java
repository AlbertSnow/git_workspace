package com.wandoujia.jupiter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.ripple_framework.model.Model;

public class ShareView extends LinearLayout
{
  private Button a;
  private Button b;
  private Button c;
  private Model d;
  private ShareUtil.ShareContentType e;

  public ShareView(Context paramContext)
  {
    super(paramContext);
  }

  public ShareView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(Model paramModel)
  {
    this.d = paramModel;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((Button)findViewById(2131493597));
    this.c = ((Button)findViewById(2131493598));
    this.b = ((Button)findViewById(2131493599));
    this.e = ShareUtil.ShareContentType.APP;
    m localm = new m(this);
    this.a.setOnClickListener(localm);
    this.c.setOnClickListener(localm);
    this.b.setOnClickListener(localm);
  }

  public void setContentType(ShareUtil.ShareContentType paramShareContentType)
  {
    this.e = paramShareContentType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.ShareView
 * JD-Core Version:    0.6.0
 */