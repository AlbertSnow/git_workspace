package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class l
{
  public static l a(Activity paramActivity, k paramk)
  {
    return a(paramActivity, paramActivity.getWindow(), paramk);
  }

  public static l a(Dialog paramDialog, k paramk)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramk);
  }

  private static l a(Context paramContext, Window paramWindow, k paramk)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
      return new p(paramContext, paramWindow, paramk);
    if (i >= 11)
      return new o(paramContext, paramWindow, paramk);
    return new AppCompatDelegateImplV7(paramContext, paramWindow);
  }

  public abstract ActionBar a();

  public abstract void a(int paramInt);

  public abstract void a(Bundle paramBundle);

  public abstract void a(View paramView);

  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  public abstract void a(CharSequence paramCharSequence);

  public abstract MenuInflater b();

  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  public abstract void c();

  public abstract void d();

  public abstract void e();

  public abstract void f();

  public abstract void g();

  public abstract void h();

  public abstract boolean i();

  public abstract void j();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.l
 * JD-Core Version:    0.6.0
 */