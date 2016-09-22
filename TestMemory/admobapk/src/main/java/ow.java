import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

@TargetApi(11)
public final class ow extends DialogFragment
{
  Dialog a = null;
  DialogInterface.OnCancelListener b = null;

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.b != null)
      this.b.onCancel(paramDialogInterface);
  }

  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.a == null)
      setShowsDialog(false);
    return this.a;
  }

  public final void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ow
 * JD-Core Version:    0.6.0
 */