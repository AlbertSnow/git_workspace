package android.support.v7.internal.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.support.v7.app.j;
import android.support.v7.appcompat.R.layout;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;

public final class l
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, y
{
  private i a;
  private android.support.v7.app.i b;
  private g c;

  public l(i parami)
  {
    this.a = parami;
  }

  public final void a()
  {
    i locali = this.a;
    j localj = new j(locali.e());
    this.c = new g(localj.a(), R.layout.abc_list_menu_item_layout);
    this.c.a(this);
    this.a.a(this.c);
    localj.a(this.c.a(), this);
    View localView = locali.c;
    if (localView != null)
      localj.a(localView);
    while (true)
    {
      localj.a(this);
      this.b = localj.b();
      this.b.setOnDismissListener(this);
      WindowManager.LayoutParams localLayoutParams = this.b.getWindow().getAttributes();
      localLayoutParams.type = 1003;
      localLayoutParams.flags = (0x20000 | localLayoutParams.flags);
      this.b.show();
      return;
      localj.a(locali.b).a(locali.a);
    }
  }

  public final void a(i parami, boolean paramBoolean)
  {
    if (((paramBoolean) || (parami == this.a)) && (this.b != null))
      this.b.dismiss();
  }

  public final boolean a(i parami)
  {
    return false;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.b((m)this.c.a().getItem(paramInt));
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    this.c.a(this.a, true);
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) || (paramInt == 4))
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        Window localWindow2 = this.b.getWindow();
        if (localWindow2 != null)
        {
          View localView2 = localWindow2.getDecorView();
          if (localView2 != null)
          {
            KeyEvent.DispatcherState localDispatcherState2 = localView2.getKeyDispatcherState();
            if (localDispatcherState2 != null)
            {
              localDispatcherState2.startTracking(paramKeyEvent, this);
              return true;
            }
          }
        }
      }
      else if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Window localWindow1 = this.b.getWindow();
        if (localWindow1 != null)
        {
          View localView1 = localWindow1.getDecorView();
          if (localView1 != null)
          {
            KeyEvent.DispatcherState localDispatcherState1 = localView1.getKeyDispatcherState();
            if ((localDispatcherState1 != null) && (localDispatcherState1.isTracking(paramKeyEvent)))
            {
              this.a.a(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    return this.a.performShortcut(paramInt, paramKeyEvent, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.l
 * JD-Core Version:    0.6.0
 */