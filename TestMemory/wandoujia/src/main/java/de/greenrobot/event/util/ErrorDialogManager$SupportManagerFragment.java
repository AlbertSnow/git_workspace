package de.greenrobot.event.util;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.q;
import de.greenrobot.event.c;

public class ErrorDialogManager$SupportManagerFragment extends Fragment
{
  private c a;
  private boolean b;

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = c.a();
    this.a.a(this);
    this.b = true;
  }

  public void onEventMainThread$109a46f2(a parama)
  {
    q localq = getFragmentManager();
    localq.b();
    DialogFragment localDialogFragment1 = (DialogFragment)localq.a("de.greenrobot.eventbus.error_dialog");
    if (localDialogFragment1 != null)
      localDialogFragment1.dismiss();
    DialogFragment localDialogFragment2 = (DialogFragment)b.a(parama);
    if (localDialogFragment2 != null)
      localDialogFragment2.show(localq, "de.greenrobot.eventbus.error_dialog");
  }

  public void onPause()
  {
    this.a.c(this);
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    if (this.b)
    {
      this.b = false;
      return;
    }
    this.a = c.a();
    this.a.a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.util.ErrorDialogManager.SupportManagerFragment
 * JD-Core Version:    0.6.0
 */