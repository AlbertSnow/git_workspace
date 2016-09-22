package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.attr;
import android.support.v7.internal.widget.au;
import android.util.AttributeSet;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import com.tencent.mm.sdk.channel.MMessage;
import com.tencent.mm.sdk.channel.a;
import java.lang.reflect.Field;

public class AppCompatSpinner extends Spinner
{
  private static final int[] a = { 16842964, 16843126 };
  private MMessage b;
  private MMessage c;
  private au d;

  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.spinnerStyle);
  }

  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a locala;
    Drawable localDrawable;
    if (au.a)
    {
      locala = a.a(getContext(), paramAttributeSet, a, paramInt);
      if (locala.f(0))
      {
        ColorStateList localColorStateList = locala.c().b(locala.f(0, -1));
        if (localColorStateList != null)
          setInternalBackgroundTint(localColorStateList);
      }
      if (locala.f(1))
      {
        localDrawable = locala.a(1);
        if (Build.VERSION.SDK_INT < 16)
          break label110;
        setPopupBackgroundDrawable(localDrawable);
      }
    }
    while (true)
    {
      this.d = locala.c();
      locala.b();
      return;
      label110: if (Build.VERSION.SDK_INT < 11)
        continue;
      try
      {
        Field localField = Spinner.class.getDeclaredField("mPopup");
        localField.setAccessible(true);
        Object localObject = localField.get(this);
        if (!(localObject instanceof ListPopupWindow))
          continue;
        ((ListPopupWindow)localObject).setBackgroundDrawable(localDrawable);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
      }
    }
  }

  private void a()
  {
    if (getBackground() != null)
    {
      if (this.c == null)
        break label23;
      au.a(this, this.c);
    }
    label23: 
    do
      return;
    while (this.b == null);
    au.a(this, this.b);
  }

  private void setInternalBackgroundTint(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.b == null)
        this.b = new MMessage();
      this.b.a = paramColorStateList;
      this.b.d = true;
    }
    while (true)
    {
      a();
      return;
      this.b = null;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    a();
  }

  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.c != null)
      return this.c.a;
    return null;
  }

  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.c != null)
      return this.c.b;
    return null;
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    setInternalBackgroundTint(null);
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.d != null);
    for (ColorStateList localColorStateList = this.d.b(paramInt); ; localColorStateList = null)
    {
      setInternalBackgroundTint(localColorStateList);
      return;
    }
  }

  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.c == null)
      this.c = new MMessage();
    this.c.a = paramColorStateList;
    this.c.d = true;
    a();
  }

  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.c == null)
      this.c = new MMessage();
    this.c.b = paramMode;
    this.c.c = true;
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.AppCompatSpinner
 * JD-Core Version:    0.6.0
 */