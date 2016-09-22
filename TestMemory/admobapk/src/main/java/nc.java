import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.appstreaming.AppStreamingInfo;

public abstract interface nc extends IInterface
{
  public abstract void initialize(apg paramapg, apj paramapj, AppStreamingInfo paramAppStreamingInfo, ni paramni);

  public abstract void mute();

  public abstract boolean onBackPressed();

  public abstract void onCreate(Bundle paramBundle);

  public abstract apj onCreateView(apj paramapj1, apj paramapj2, Bundle paramBundle);

  public abstract void onDestroy();

  public abstract void onPause();

  public abstract void onResume();

  public abstract void onSaveInstanceState(Bundle paramBundle);

  public abstract void onStart();

  public abstract void onStop();

  public abstract void unmute();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nc
 * JD-Core Version:    0.6.0
 */