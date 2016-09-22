package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.sdk.channel.a;

public class TintImageView extends ImageView
{
  private static final int[] a = { 16842964, 16843033 };
  private final au b;

  public TintImageView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TintImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TintImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a locala = a.a(getContext(), paramAttributeSet, a, paramInt);
    if (locala.a() > 0)
    {
      if (locala.f(0))
        setBackgroundDrawable(locala.a(0));
      if (locala.f(1))
        setImageDrawable(locala.a(1));
    }
    locala.b();
    this.b = locala.c();
  }

  public void setImageResource(int paramInt)
  {
    setImageDrawable(this.b.a(paramInt));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.TintImageView
 * JD-Core Version:    0.6.0
 */