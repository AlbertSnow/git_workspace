import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

final class ajj
  implements Runnable
{
  ajj(aji paramaji)
  {
  }

  public final void run()
  {
    if (!this.a.b)
      return;
    if (this.a.d.a())
    {
      this.a.g.startActivityForResult(GoogleApiActivity.a(this.a.e(), this.a.d.d, this.a.e, false), 1);
      return;
    }
    if (this.a.f.a(this.a.d.c))
    {
      this.a.f.a(this.a.e(), this.a.g, this.a.d.c, 2, this.a);
      return;
    }
    if (this.a.d.c == 18)
    {
      Dialog localDialog = ox.a(this.a.e(), this.a);
      this.a.f.a(this.a.e().getApplicationContext(), new ajk(this, localDialog));
      return;
    }
    this.a.a(this.a.d, this.a.e);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajj
 * JD-Core Version:    0.6.0
 */