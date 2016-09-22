package com.wandoujia.jupiter.morph;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.volley.toolbox.x;
import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.ripple_framework.model.Model;

public class MorphLoadingView extends FrameLayout
{
  private Model a;
  private MorphDetail b;
  private FrameLayout c;
  private ViewGroup d;

  public MorphLoadingView(Context paramContext)
  {
    super(paramContext);
  }

  public MorphLoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MorphLoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.d == null)
    {
      x localx = new x(this.b.url, new a(this), new b(this), 0);
      ((com.wandoujia.nirvana.framework.network.a)com.wandoujia.ripple_framework.i.k().a("api_context")).a().a(localx);
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((FrameLayout)findViewById(2131493174));
  }

  public void setModel(Model paramModel)
  {
    this.a = paramModel;
    if (this.d != null)
    {
      com.wandoujia.nirvana.framework.ui.a locala = c.a(this.b, this.d, null);
      if (locala != null)
        locala.a(paramModel);
    }
  }

  public void setMorphDetail(MorphDetail paramMorphDetail)
  {
    this.b = paramMorphDetail;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.morph.MorphLoadingView
 * JD-Core Version:    0.6.0
 */