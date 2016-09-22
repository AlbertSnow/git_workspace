package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@a
public final class ao
{
  final Context a;
  public String b;
  private final float c;
  private float d;
  private float e;
  private float f;
  private int g = 0;

  public ao(Context paramContext)
  {
    this.a = paramContext;
    this.c = paramContext.getResources().getDisplayMetrics().density;
  }

  public ao(Context paramContext, String paramString)
  {
    this(paramContext);
    this.b = paramString;
  }

  private void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      this.g = 0;
      this.d = paramFloat1;
      this.e = paramFloat2;
      this.f = paramFloat2;
    }
    label24: label224: 
    do
      while (true)
      {
        break label24;
        do
          return;
        while (this.g == -1);
        if (paramInt != 2)
          break;
        if (paramFloat2 > this.e)
          this.e = paramFloat2;
        while (this.e - this.f > 30.0F * this.c)
        {
          this.g = -1;
          return;
          if (paramFloat2 >= this.f)
            continue;
          this.f = paramFloat2;
        }
        if ((this.g == 0) || (this.g == 2))
          if (paramFloat1 - this.d >= 50.0F * this.c)
            this.d = paramFloat1;
        for (this.g = (1 + this.g); ; this.g = (1 + this.g))
        {
          do
          {
            if ((this.g != 1) && (this.g != 3))
              break label224;
            if (paramFloat1 <= this.d)
              break;
            this.d = paramFloat1;
            return;
          }
          while (((this.g != 1) && (this.g != 3)) || (paramFloat1 - this.d > -50.0F * this.c));
          this.d = paramFloat1;
        }
        if ((this.g != 2) || (paramFloat1 >= this.d))
          continue;
        this.d = paramFloat1;
        return;
      }
    while ((paramInt != 1) || (this.g != 4));
    if (!(this.a instanceof Activity))
    {
      c.d("Can not create dialog without Activity Context");
      return;
    }
    String str1 = this.b;
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      String str3 = str1.replaceAll("\\+", "%20");
      Uri localUri = new Uri.Builder().encodedQuery(str3).build();
      StringBuilder localStringBuilder = new StringBuilder();
      Map localMap = y.a(localUri);
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str4 = (String)localIterator.next();
        localStringBuilder.append(str4).append(" = ").append((String)localMap.get(str4)).append("\n\n");
      }
      str2 = localStringBuilder.toString().trim();
      if (TextUtils.isEmpty(str2));
    }
    while (true)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
      localBuilder.setMessage(str2);
      localBuilder.setTitle("Ad Information");
      localBuilder.setPositiveButton("Share", new ap(this, str2));
      localBuilder.setNegativeButton("Close", new aq(this));
      localBuilder.create().show();
      return;
      str2 = "No debug information";
    }
  }

  public final void a(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getHistorySize();
    for (int j = 0; j < i; j++)
      a(paramMotionEvent.getActionMasked(), paramMotionEvent.getHistoricalX(0, j), paramMotionEvent.getHistoricalY(0, j));
    a(paramMotionEvent.getActionMasked(), paramMotionEvent.getX(), paramMotionEvent.getY());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ao
 * JD-Core Version:    0.6.0
 */