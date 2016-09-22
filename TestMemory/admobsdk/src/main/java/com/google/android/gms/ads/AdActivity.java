package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfu;
import com.google.android.gms.internal.zzfv;

public class AdActivity extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
  public static final String SIMPLE_CLASS_NAME = "AdActivity";
  private zzfv zzoA;

  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    this.zzoA = zzfu.createAdOverlay(this);
    if (this.zzoA == null)
    {
      zzb.zzaK("Could not create ad overlay.");
      finish();
      return;
    }
    try
    {
      this.zzoA.onCreate(savedInstanceState);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onCreate to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected void onRestart()
  {
    super.onRestart();
    try
    {
      if (this.zzoA != null)
        this.zzoA.onRestart();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onRestart to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected void onStart()
  {
    super.onStart();
    try
    {
      if (this.zzoA != null)
        this.zzoA.onStart();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onStart to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected void onResume()
  {
    super.onResume();
    try
    {
      if (this.zzoA != null)
        this.zzoA.onResume();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onResume to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected void onPause()
  {
    try
    {
      if (this.zzoA != null)
        this.zzoA.onPause();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onPause to ad overlay:", localRemoteException);
      finish();
    }
    super.onPause();
  }

  protected void onSaveInstanceState(Bundle outState)
  {
    try
    {
      if (this.zzoA != null)
        this.zzoA.onSaveInstanceState(outState);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onSaveInstanceState to ad overlay:", localRemoteException);
      finish();
    }
    super.onSaveInstanceState(outState);
  }

  protected void onStop()
  {
    try
    {
      if (this.zzoA != null)
        this.zzoA.onStop();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onStop to ad overlay:", localRemoteException);
      finish();
    }
    super.onStop();
  }

  protected void onDestroy()
  {
    try
    {
      if (this.zzoA != null)
        this.zzoA.onDestroy();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onDestroy to ad overlay:", localRemoteException);
    }
    super.onDestroy();
  }

  private void zzaD()
  {
    if (this.zzoA != null)
      try
      {
        this.zzoA.zzaD();
      }
      catch (RemoteException localRemoteException)
      {
        zzb.zzd("Could not forward setContentViewSet to ad overlay:", localRemoteException);
      }
  }

  public void setContentView(int layoutResID)
  {
    super.setContentView(layoutResID);
    zzaD();
  }

  public void setContentView(View view)
  {
    super.setContentView(view);
    zzaD();
  }

  public void setContentView(View view, ViewGroup.LayoutParams params)
  {
    super.setContentView(view, params);
    zzaD();
  }

  public void onBackPressed()
  {
    boolean bool = true;
    try
    {
      if (this.zzoA != null)
        bool = this.zzoA.zzfn();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward onBackPressed to ad overlay:", localRemoteException);
    }
    if (bool)
      super.onBackPressed();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.AdActivity
 * JD-Core Version:    0.6.0
 */