package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class aa extends Dialog
  implements k
{
  private l a;

  public aa(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    b().a(null);
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    b().b(paramView, paramLayoutParams);
  }

  public final l b()
  {
    if (this.a == null)
      this.a = l.a(this, this);
    return this.a;
  }

  public void invalidateOptionsMenu()
  {
    b().g();
  }

  protected void onCreate(Bundle paramBundle)
  {
    b().j();
    super.onCreate(paramBundle);
    b().a(paramBundle);
  }

  protected void onStop()
  {
    super.onStop();
    b().e();
  }

  public void setContentView(int paramInt)
  {
    b().a(paramInt);
  }

  public void setContentView(View paramView)
  {
    b().a(paramView);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    b().a(paramView, paramLayoutParams);
  }

  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    b().a(getContext().getString(paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    b().a(paramCharSequence);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.aa
 * JD-Core Version:    0.6.0
 */