import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ai extends ag
{
  final Activity a;
  final Context b;
  final Handler c;
  final ak d = new ak();
  dh e;
  boolean f;
  be g;
  boolean h;
  boolean i;
  private int j;

  ai(ac paramac)
  {
    this(paramac, paramac, paramac.a, 0);
  }

  private ai(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    this.a = paramActivity;
    this.b = paramContext;
    this.c = paramHandler;
    this.j = 0;
  }

  public View a(int paramInt)
  {
    return null;
  }

  final be a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e == null)
      this.e = new dh();
    be localbe = (be)this.e.get(paramString);
    if (localbe != null)
      localbe.f = this;
    return localbe;
  }

  final void a(String paramString)
  {
    if (this.e != null)
    {
      be localbe = (be)this.e.get(paramString);
      if ((localbe != null) && (!localbe.e))
      {
        localbe.g();
        this.e.remove(paramString);
      }
    }
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
  }

  public void a(z paramz, Intent paramIntent, int paramInt)
  {
    if (paramInt != -1)
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    this.b.startActivity(paramIntent);
  }

  public boolean a()
  {
    return true;
  }

  public boolean b()
  {
    return true;
  }

  public LayoutInflater c()
  {
    return (LayoutInflater)this.b.getSystemService("layout_inflater");
  }

  public void d()
  {
  }

  public boolean e()
  {
    return true;
  }

  public int f()
  {
    return this.j;
  }

  final dh g()
  {
    int k = 0;
    int m;
    if (this.e != null)
    {
      int n = this.e.size();
      be[] arrayOfbe = new be[n];
      for (int i1 = n - 1; i1 >= 0; i1--)
        arrayOfbe[i1] = ((be)this.e.c(i1));
      m = 0;
      if (k < n)
      {
        be localbe = arrayOfbe[k];
        if (localbe.e)
          m = 1;
        while (true)
        {
          k++;
          break;
          localbe.g();
          this.e.remove(localbe.c);
        }
      }
    }
    else
    {
      m = 0;
    }
    if (m != 0)
      return this.e;
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ai
 * JD-Core Version:    0.6.0
 */