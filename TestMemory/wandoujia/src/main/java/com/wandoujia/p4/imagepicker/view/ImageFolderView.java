package com.wandoujia.p4.imagepicker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.mvc.BaseView;
import com.wandoujia.p4.utils.c;
import com.wandoujia.p4.views.LocalThumbnailAsyncImageView;

public class ImageFolderView extends FrameLayout
  implements BaseView
{
  public LocalThumbnailAsyncImageView a;
  public View b;
  public TextView c;
  public TextView d;

  public ImageFolderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static ImageFolderView a(ViewGroup paramViewGroup)
  {
    return (ImageFolderView)c.a(paramViewGroup, 2130903495);
  }

  public View getView()
  {
    return this;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((LocalThumbnailAsyncImageView)findViewById(2131492905));
    this.b = findViewById(2131493925);
    this.c = ((TextView)this.b.findViewById(2131493926));
    this.d = ((TextView)this.b.findViewById(2131493927));
    findViewById(2131493928);
  }

  public void setImageLayoutParams(FrameLayout.LayoutParams paramLayoutParams)
  {
    setLayoutParams(paramLayoutParams);
    this.a.setLayoutParams(paramLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.view.ImageFolderView
 * JD-Core Version:    0.6.0
 */