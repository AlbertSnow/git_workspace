import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class y extends z
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  private int W = 0;
  private int X = 0;
  private boolean Y = true;
  private int Z = -1;
  public boolean a = true;
  private Dialog aa;
  private boolean ab;
  private boolean ac;
  private boolean ad;

  public void a(aj paramaj, String paramString)
  {
    this.ac = false;
    this.ad = true;
    au localau = paramaj.a();
    localau.a(this, paramString);
    localau.a();
  }

  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (!this.ad)
      this.ac = false;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (this.z == 0);
    for (boolean bool = true; ; bool = false)
    {
      this.a = bool;
      if (paramBundle != null)
      {
        this.W = paramBundle.getInt("android:style", 0);
        this.X = paramBundle.getInt("android:theme", 0);
        this.Y = paramBundle.getBoolean("android:cancelable", true);
        this.a = paramBundle.getBoolean("android:showsDialog", this.a);
        this.Z = paramBundle.getInt("android:backStackId", -1);
      }
      return;
    }
  }

  public Dialog b()
  {
    return new Dialog(f(), this.X);
  }

  public final LayoutInflater b(Bundle paramBundle)
  {
    if (!this.a)
      return super.b(paramBundle);
    this.aa = b();
    if (this.aa != null)
    {
      Dialog localDialog = this.aa;
      switch (this.W)
      {
      default:
      case 3:
      case 1:
      case 2:
      }
      while (true)
      {
        return (LayoutInflater)this.aa.getContext().getSystemService("layout_inflater");
        localDialog.getWindow().addFlags(24);
        localDialog.requestWindowFeature(1);
      }
    }
    return (LayoutInflater)this.v.b.getSystemService("layout_inflater");
  }

  public final void c()
  {
    super.c();
    if (this.aa != null)
    {
      this.ab = false;
      this.aa.show();
    }
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    if (!this.a);
    Bundle localBundle;
    do
    {
      do
      {
        return;
        View localView = this.K;
        if (localView != null)
        {
          if (localView.getParent() != null)
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
          this.aa.setContentView(localView);
        }
        this.aa.setOwnerActivity(f());
        this.aa.setCancelable(this.Y);
        this.aa.setOnCancelListener(this);
        this.aa.setOnDismissListener(this);
      }
      while (paramBundle == null);
      localBundle = paramBundle.getBundle("android:savedDialogState");
    }
    while (localBundle == null);
    this.aa.onRestoreInstanceState(localBundle);
  }

  public final void d()
  {
    super.d();
    if (this.aa != null)
      this.aa.hide();
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (this.aa != null)
    {
      Bundle localBundle = this.aa.onSaveInstanceState();
      if (localBundle != null)
        paramBundle.putBundle("android:savedDialogState", localBundle);
    }
    if (this.W != 0)
      paramBundle.putInt("android:style", this.W);
    if (this.X != 0)
      paramBundle.putInt("android:theme", this.X);
    if (!this.Y)
      paramBundle.putBoolean("android:cancelable", this.Y);
    if (!this.a)
      paramBundle.putBoolean("android:showsDialog", this.a);
    if (this.Z != -1)
      paramBundle.putInt("android:backStackId", this.Z);
  }

  public final void d_()
  {
    super.d_();
    if ((!this.ad) && (!this.ac))
      this.ac = true;
  }

  public final void e()
  {
    super.e();
    if (this.aa != null)
    {
      this.ab = true;
      this.aa.dismiss();
      this.aa = null;
    }
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if ((!this.ab) && (!this.ac))
    {
      this.ac = true;
      this.ad = false;
      if (this.aa != null)
      {
        this.aa.dismiss();
        this.aa = null;
      }
      this.ab = true;
      if (this.Z >= 0)
      {
        this.u.a(this.Z, 1);
        this.Z = -1;
      }
    }
    else
    {
      return;
    }
    au localau = this.u.a();
    localau.a(this);
    localau.b();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     y
 * JD-Core Version:    0.6.0
 */