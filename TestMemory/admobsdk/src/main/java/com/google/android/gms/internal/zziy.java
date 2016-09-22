package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzhb
public final class zziy extends zzim
{
  private final String zzsy;
  private final Context mContext;
  private final String zzF;
  private String zzzN = null;

  public zziy(Context paramContext, String paramString1, String paramString2)
  {
    this.mContext = paramContext;
    this.zzsy = paramString1;
    this.zzF = paramString2;
  }

  public zziy(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.mContext = paramContext;
    this.zzsy = paramString1;
    this.zzF = paramString2;
    this.zzzN = paramString3;
  }

  public void onStop()
  {
  }

  public void zzbr()
  {
    try
    {
      zzin.v("Pinging URL: " + this.zzF);
      URL localURL = new URL(this.zzF);
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
      try
      {
        if (TextUtils.isEmpty(this.zzzN))
          zzr.zzbC().zza(this.mContext, this.zzsy, true, localHttpURLConnection);
        else
          zzr.zzbC().zza(this.mContext, this.zzsy, true, localHttpURLConnection, this.zzzN);
        int i = localHttpURLConnection.getResponseCode();
        if ((i < 200) || (i >= 300))
          zzin.zzaK("Received non-success response code " + i + " from pinging URL: " + this.zzF);
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      zzin.zzaK("Error while parsing ping URL: " + this.zzF + ". " + localIndexOutOfBoundsException.getMessage());
    }
    catch (IOException localIOException)
    {
      zzin.zzaK("Error while pinging URL: " + this.zzF + ". " + localIOException.getMessage());
    }
    catch (RuntimeException localRuntimeException)
    {
      zzin.zzaK("Error while pinging URL: " + this.zzF + ". " + localRuntimeException.getMessage());
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zziy
 * JD-Core Version:    0.6.0
 */