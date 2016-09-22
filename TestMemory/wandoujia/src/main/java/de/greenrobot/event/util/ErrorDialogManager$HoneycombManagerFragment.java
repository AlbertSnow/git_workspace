package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import de.greenrobot.event.c;

@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment extends Fragment
{
  private c a;

  public void onEventMainThread$109a46f2(a parama)
  {
    FragmentManager localFragmentManager = getFragmentManager();
    localFragmentManager.executePendingTransactions();
    DialogFragment localDialogFragment1 = (DialogFragment)localFragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
    if (localDialogFragment1 != null)
      localDialogFragment1.dismiss();
    DialogFragment localDialogFragment2 = (DialogFragment)b.a(parama);
    if (localDialogFragment2 != null)
      localDialogFragment2.show(localFragmentManager, "de.greenrobot.eventbus.error_dialog");
  }

  public void onPause()
  {
    this.a.c(this);
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.a = c.a();
    this.a.a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.util.ErrorDialogManager.HoneycombManagerFragment
 * JD-Core Version:    0.6.0
 */