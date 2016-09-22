package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.attr;
import android.support.v7.internal.widget.au;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.tencent.mm.sdk.channel.a;

public class AppCompatRadioButton extends RadioButton
{
  private static final int[] a = { 16843015 };
  private au b;
  private Drawable c;

  public AppCompatRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.radioButtonStyle);
  }

  public AppCompatRadioButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (au.a)
    {
      a locala = a.a(getContext(), paramAttributeSet, a, paramInt);
      setButtonDrawable(locala.a(0));
      locala.b();
      this.b = locala.c();
    }
  }

  public int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    if ((Build.VERSION.SDK_INT < 17) && (this.c != null))
      i += this.c.getIntrinsicWidth();
    return i;
  }

  public void setButtonDrawable(int paramInt)
  {
    if (this.b != null)
    {
      setButtonDrawable(this.b.a(paramInt));
      return;
    }
    super.setButtonDrawable(paramInt);
  }

  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    this.c = paramDrawable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.AppCompatRadioButton
 * JD-Core Version:    0.6.0
 */