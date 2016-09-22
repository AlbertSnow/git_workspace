package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.widget.au;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import com.tencent.mm.sdk.channel.a;

public class AppCompatCheckedTextView extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private au b;

  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }

  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (au.a)
    {
      a locala = a.a(getContext(), paramAttributeSet, a, paramInt);
      setCheckMarkDrawable(locala.a(0));
      locala.b();
      this.b = locala.c();
    }
  }

  public void setCheckMarkDrawable(int paramInt)
  {
    if (this.b != null)
    {
      setCheckMarkDrawable(this.b.a(paramInt));
      return;
    }
    super.setCheckMarkDrawable(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.AppCompatCheckedTextView
 * JD-Core Version:    0.6.0
 */