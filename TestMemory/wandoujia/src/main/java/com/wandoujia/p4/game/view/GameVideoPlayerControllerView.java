package com.wandoujia.p4.game.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Button;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.phoenix2.videoplayer.SimplePlayerControllerView;

public class GameVideoPlayerControllerView extends SimplePlayerControllerView
{
  private Button a;
  private AsyncImageView b;

  public GameVideoPlayerControllerView(Context paramContext)
  {
    super(paramContext);
  }

  public GameVideoPlayerControllerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public GameVideoPlayerControllerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final void a()
  {
    super.a();
    this.b = ((AsyncImageView)findViewById(2131493570));
    this.a = ((Button)findViewById(2131493571));
  }

  protected int getLayoutResourceId()
  {
    return 2130903241;
  }

  public void setIcon(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (this.b != null))
      this.b.a(paramString, 2131361864);
  }

  public void setPackageName(String paramString)
  {
    if (this.a != null)
    {
      if (!TextUtils.isEmpty(paramString))
        this.a.setOnClickListener(new a(paramString));
    }
    else
      return;
    this.a.setVisibility(4);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.view.GameVideoPlayerControllerView
 * JD-Core Version:    0.6.0
 */