package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@zzhb
public class zziu
{
  private final Context mContext;
  private String zzMh;
  private final float zzDB;
  private float zzMi;
  private float zzMj;
  private float zzMk;
  private int mState = 0;

  public zziu(Context paramContext)
  {
    this.mContext = paramContext;
    this.zzDB = paramContext.getResources().getDisplayMetrics().density;
  }

  public zziu(Context paramContext, String paramString)
  {
    this(paramContext);
    this.zzMh = paramString;
  }

  public void zze(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getHistorySize();
    for (int j = 0; j < i; j++)
      zza(paramMotionEvent.getActionMasked(), paramMotionEvent.getHistoricalX(0, j), paramMotionEvent.getHistoricalY(0, j));
    zza(paramMotionEvent.getActionMasked(), paramMotionEvent.getX(), paramMotionEvent.getY());
  }

  void zza(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      this.mState = 0;
      this.zzMi = paramFloat1;
      this.zzMj = paramFloat2;
      this.zzMk = paramFloat2;
    }
    else
    {
      if (this.mState == -1)
        return;
      if (paramInt == 2)
      {
        if (paramFloat2 > this.zzMj)
          this.zzMj = paramFloat2;
        else if (paramFloat2 < this.zzMk)
          this.zzMk = paramFloat2;
        if (this.zzMj - this.zzMk > 30.0F * this.zzDB)
        {
          this.mState = -1;
          return;
        }
        if ((this.mState == 0) || (this.mState == 2))
        {
          if (paramFloat1 - this.zzMi >= 50.0F * this.zzDB)
          {
            this.zzMi = paramFloat1;
            this.mState += 1;
          }
        }
        else if (((this.mState == 1) || (this.mState == 3)) && (paramFloat1 - this.zzMi <= -50.0F * this.zzDB))
        {
          this.zzMi = paramFloat1;
          this.mState += 1;
        }
        if ((this.mState == 1) || (this.mState == 3))
        {
          if (paramFloat1 > this.zzMi)
            this.zzMi = paramFloat1;
        }
        else if ((this.mState == 2) && (paramFloat1 < this.zzMi))
          this.zzMi = paramFloat1;
      }
      else if ((paramInt == 1) && (this.mState == 4))
      {
        showDialog();
      }
    }
  }

  public void zzaF(String paramString)
  {
    this.zzMh = paramString;
  }

  private void showDialog()
  {
    if (!(this.mContext instanceof Activity))
    {
      zzin.zzaJ("Can not create dialog without Activity Context");
      return;
    }
    String str = zzaG(this.zzMh);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.mContext);
    localBuilder.setMessage(str);
    localBuilder.setTitle("Ad Information");
    localBuilder.setPositiveButton("Share", new DialogInterface.OnClickListener(str)
    {
      public void onClick(DialogInterface dialog, int which)
      {
        zzr.zzbC().zzb(zziu.zza(zziu.this), Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.zzMl), "Share via"));
      }
    });
    localBuilder.setNegativeButton("Close", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface dialog, int which)
      {
      }
    });
    AlertDialog localAlertDialog = localBuilder.create();
    localAlertDialog.show();
  }

  static String zzaG(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return "No debug information";
    paramString = paramString.replaceAll("\\+", "%20");
    Uri localUri = new Uri.Builder().encodedQuery(paramString).build();
    StringBuilder localStringBuilder = new StringBuilder();
    Map localMap = zzr.zzbC().zze(localUri);
    Object localObject = localMap.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuilder.append(str).append(" = ").append((String)localMap.get(str)).append("\n\n");
    }
    localObject = localStringBuilder.toString().trim();
    return !TextUtils.isEmpty((CharSequence)localObject) ? localObject : (String)"No debug information";
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zziu
 * JD-Core Version:    0.6.0
 */