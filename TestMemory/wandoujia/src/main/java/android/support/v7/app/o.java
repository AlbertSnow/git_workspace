package android.support.v7.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.Window;

class o extends AppCompatDelegateImplV7
{
  o(Context paramContext, Window paramWindow, k paramk)
  {
    super(paramContext, paramWindow);
  }

  final View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = super.b(paramView, paramString, paramContext, paramAttributeSet);
    if (localView != null)
      return localView;
    if ((this.c instanceof LayoutInflater.Factory2))
      return ((LayoutInflater.Factory2)this.c).onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.o
 * JD-Core Version:    0.6.0
 */