import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

public final class ahy extends y
{
  Dialog W = null;
  DialogInterface.OnCancelListener X = null;

  public final void a(aj paramaj, String paramString)
  {
    super.a(paramaj, paramString);
  }

  public final Dialog b()
  {
    if (this.W == null)
      this.a = false;
    return this.W;
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.X != null)
      this.X.onCancel(paramDialogInterface);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ahy
 * JD-Core Version:    0.6.0
 */