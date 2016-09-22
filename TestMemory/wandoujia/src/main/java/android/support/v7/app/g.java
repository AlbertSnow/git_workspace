package android.support.v7.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class g extends Handler
{
  private WeakReference<DialogInterface> a;

  public g(DialogInterface paramDialogInterface)
  {
    this.a = new WeakReference(paramDialogInterface);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    case 0:
    default:
      return;
    case -3:
    case -2:
    case -1:
      ((DialogInterface.OnClickListener)paramMessage.obj).onClick((DialogInterface)this.a.get(), paramMessage.what);
      return;
    case 1:
    }
    ((DialogInterface)paramMessage.obj).dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.g
 * JD-Core Version:    0.6.0
 */