import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class ox extends oy
{
  public static final ox a = new ox();

  public static Dialog a(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    ProgressBar localProgressBar = new ProgressBar(paramActivity, null, 16842874);
    localProgressBar.setIndeterminate(true);
    localProgressBar.setVisibility(0);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setView(localProgressBar);
    String str = ahv.e(paramActivity);
    localBuilder.setMessage(paramActivity.getResources().getString(mb.common_google_play_services_updating_text, new Object[] { str }));
    localBuilder.setTitle(mb.common_google_play_services_updating_title);
    localBuilder.setPositiveButton("", null);
    AlertDialog localAlertDialog = localBuilder.create();
    ahv.a(paramActivity, paramOnCancelListener, "GooglePlayServicesUpdatingDialog", localAlertDialog);
    return localAlertDialog;
  }

  public static boolean a(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return ahv.a(paramInt1, paramActivity, 2, paramOnCancelListener);
  }

  public final int a(Context paramContext)
  {
    return super.a(paramContext);
  }

  public final aky a(Context paramContext, akz paramakz)
  {
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    localIntentFilter.addDataScheme("package");
    aky localaky = new aky(paramakz);
    paramContext.registerReceiver(localaky, localIntentFilter);
    localaky.a = paramContext;
    if (!ahw.a(paramContext, "com.google.android.gms"))
    {
      paramakz.a();
      localaky.a();
      localaky = null;
    }
    return localaky;
  }

  public final PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return super.a(paramContext, paramInt1, paramInt2);
  }

  public final PendingIntent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    return super.a(paramContext, paramInt1, paramInt2, paramString);
  }

  public final Intent a(Context paramContext, int paramInt, String paramString)
  {
    return super.a(paramContext, paramInt, paramString);
  }

  public final void a(Context paramContext, ConnectionResult paramConnectionResult, int paramInt)
  {
    if (paramConnectionResult.a());
    int i;
    for (PendingIntent localPendingIntent = paramConnectionResult.d; ; localPendingIntent = super.a(paramContext, i, 0))
    {
      if (localPendingIntent != null)
        ahv.a(paramConnectionResult.c, paramContext, PendingIntent.getActivity(paramContext, 0, GoogleApiActivity.a(paramContext, localPendingIntent, paramInt, true), 134217728));
      return;
      i = paramConnectionResult.c;
      if ((!aoo.a(paramContext)) || (i != 2))
        continue;
      i = 42;
    }
  }

  public final boolean a(int paramInt)
  {
    return super.a(paramInt);
  }

  public final boolean a(Activity paramActivity, ald paramald, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = ahv.a(paramInt1, paramActivity, new amo(paramald, super.a(paramActivity, paramInt1, "d"), 2), paramOnCancelListener);
    if (localDialog == null)
      return false;
    ahv.a(paramActivity, paramOnCancelListener, "GooglePlayServicesErrorDialog", localDialog);
    return true;
  }

  public final boolean a(Context paramContext, int paramInt)
  {
    return super.a(paramContext, paramInt);
  }

  public final int b(Context paramContext)
  {
    return super.b(paramContext);
  }

  @Deprecated
  public final Intent b(int paramInt)
  {
    return super.b(paramInt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ox
 * JD-Core Version:    0.6.0
 */