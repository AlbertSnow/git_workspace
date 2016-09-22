package com.android.volley;

import android.content.Intent;
import com.wandoujia.nirvana.framework.network.a.a;

public class AuthFailureError extends VolleyError
{
  private Intent mResolutionIntent;

  public AuthFailureError()
  {
  }

  public AuthFailureError(Intent paramIntent)
  {
    this.mResolutionIntent = paramIntent;
  }

  public AuthFailureError(a parama)
  {
    super(parama);
  }

  public AuthFailureError(String paramString)
  {
    super(paramString);
  }

  public AuthFailureError(String paramString, Exception paramException)
  {
    super(paramString, paramException);
  }

  public String getMessage()
  {
    if (this.mResolutionIntent != null)
      return "User needs to (re)enter credentials.";
    return super.getMessage();
  }

  public Intent getResolutionIntent()
  {
    return this.mResolutionIntent;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.AuthFailureError
 * JD-Core Version:    0.6.0
 */