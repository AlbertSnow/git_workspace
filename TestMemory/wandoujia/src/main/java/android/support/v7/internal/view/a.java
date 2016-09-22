package android.support.v7.internal.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.appcompat.R.style;
import android.view.LayoutInflater;

public final class a extends ContextWrapper
{
  private int a;
  private Resources.Theme b;
  private LayoutInflater c;

  public a(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = paramInt;
  }

  private void b()
  {
    if (this.b == null);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.b = getResources().newTheme();
        Resources.Theme localTheme = getBaseContext().getTheme();
        if (localTheme != null)
          this.b.setTo(localTheme);
      }
      this.b.applyStyle(this.a, true);
      return;
    }
  }

  public final int a()
  {
    return this.a;
  }

  public final Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (this.c == null)
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      return this.c;
    }
    return getBaseContext().getSystemService(paramString);
  }

  public final Resources.Theme getTheme()
  {
    if (this.b != null)
      return this.b;
    if (this.a == 0)
      this.a = R.style.Theme_AppCompat_Light;
    b();
    return this.b;
  }

  public final void setTheme(int paramInt)
  {
    this.a = paramInt;
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.a
 * JD-Core Version:    0.6.0
 */