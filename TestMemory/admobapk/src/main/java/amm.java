import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;

public abstract class amm
  implements DialogInterface.OnClickListener
{
  public abstract void a();

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      a();
      paramDialogInterface.dismiss();
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services");
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amm
 * JD-Core Version:    0.6.0
 */