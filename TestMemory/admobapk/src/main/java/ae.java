import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class ae extends ai
{
  public ae(ac paramac)
  {
    super(paramac);
  }

  public final View a(int paramInt)
  {
    return this.j.findViewById(paramInt);
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.j.dump(paramString, null, paramPrintWriter, paramArrayOfString);
  }

  public final void a(z paramz, Intent paramIntent, int paramInt)
  {
    this.j.a(paramz, paramIntent, paramInt);
  }

  public final boolean a()
  {
    Window localWindow = this.j.getWindow();
    return (localWindow != null) && (localWindow.peekDecorView() != null);
  }

  public final boolean b()
  {
    return !this.j.isFinishing();
  }

  public final LayoutInflater c()
  {
    return this.j.getLayoutInflater().cloneInContext(this.j);
  }

  public final void d()
  {
    ac localac = this.j;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localac.invalidateOptionsMenu();
      return;
    }
    localac.d = true;
  }

  public final boolean e()
  {
    return this.j.getWindow() != null;
  }

  public final int f()
  {
    Window localWindow = this.j.getWindow();
    if (localWindow == null)
      return 0;
    return localWindow.getAttributes().windowAnimations;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ae
 * JD-Core Version:    0.6.0
 */