import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;

public abstract class aji extends alc
  implements DialogInterface.OnCancelListener
{
  private final Handler a = new Handler(Looper.getMainLooper());
  public boolean b;
  public boolean c;
  ConnectionResult d;
  int e = -1;
  public final ox f;

  protected aji(ald paramald)
  {
    this(paramald, ox.a);
  }

  private aji(ald paramald, ox paramox)
  {
    super(paramald);
    this.f = paramox;
  }

  public void a()
  {
    super.a();
    this.b = true;
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    label31: int k;
    switch (paramInt1)
    {
    default:
      i = 0;
      if (i == 0)
        break;
      d();
      return;
    case 2:
      k = this.f.a(e());
      if (k != 0);
    case 1:
    }
    while (true)
    {
      if ((this.d.c != 18) || (k != 18))
        break label31;
      return;
      if (paramInt2 == -1)
        break label31;
      if (paramInt2 != 0)
        break;
      if (paramIntent != null);
      for (int j = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13); ; j = 13)
      {
        this.d = new ConnectionResult(j, null);
        break;
        a(this.d, this.e);
        return;
      }
      i = 0;
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.c = paramBundle.getBoolean("resolving_error", false);
      if (this.c)
      {
        this.e = paramBundle.getInt("failed_client_id", -1);
        this.d = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }

  protected abstract void a(ConnectionResult paramConnectionResult, int paramInt);

  public void b()
  {
    super.b();
    this.b = false;
  }

  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    paramBundle.putBoolean("resolving_error", this.c);
    if (this.c)
    {
      paramBundle.putInt("failed_client_id", this.e);
      paramBundle.putInt("failed_status", this.d.c);
      paramBundle.putParcelable("failed_resolution", this.d.d);
    }
  }

  public final void b(ConnectionResult paramConnectionResult, int paramInt)
  {
    if (!this.c)
    {
      this.c = true;
      this.e = paramInt;
      this.d = paramConnectionResult;
      this.a.post(new ajj(this));
    }
  }

  protected abstract void c();

  protected final void d()
  {
    this.e = -1;
    this.c = false;
    this.d = null;
    c();
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    a(new ConnectionResult(13, null), this.e);
    d();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aji
 * JD-Core Version:    0.6.0
 */