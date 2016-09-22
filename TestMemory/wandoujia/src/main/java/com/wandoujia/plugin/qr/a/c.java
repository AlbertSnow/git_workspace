package com.wandoujia.plugin.qr.a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.wandoujia.plugin.qr.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class c
{
  private final Context a;
  private Point b;
  private Point c;

  c(Context paramContext)
  {
    this.a = paramContext;
  }

  private static Point a(Camera.Parameters paramParameters, Point paramPoint)
  {
    ArrayList localArrayList = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort(localArrayList, new d());
    if (Log.isLoggable("CameraConfiguration", 4))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator1 = localArrayList.iterator();
      while (localIterator1.hasNext())
      {
        Camera.Size localSize3 = (Camera.Size)localIterator1.next();
        localStringBuilder.append(localSize3.width).append('x').append(localSize3.height).append(' ');
      }
      new StringBuilder("Supported preview sizes: ").append(localStringBuilder);
    }
    Object localObject1 = null;
    float f1 = paramPoint.x / paramPoint.y;
    float f2 = (1.0F / 1.0F);
    Iterator localIterator2 = localArrayList.iterator();
    int i;
    int j;
    label219: float f3;
    while (localIterator2.hasNext())
    {
      Camera.Size localSize2 = (Camera.Size)localIterator2.next();
      i = localSize2.width;
      j = localSize2.height;
      int k = i * j;
      if ((k < 150400) || (k > 691200))
        continue;
      int m;
      int n;
      if (i > j)
      {
        m = 1;
        if (m == 0)
          break label283;
        n = j;
        if (m == 0)
          break label290;
      }
      label283: label290: for (int i1 = i; ; i1 = j)
      {
        if ((n != paramPoint.x) || (i1 != paramPoint.y))
          break label297;
        Point localPoint = new Point(i, j);
        new StringBuilder("Found preview size exactly matching screen size: ").append(localPoint);
        return localPoint;
        m = 0;
        break;
        n = i;
        break label219;
      }
      label297: f3 = Math.abs(n / i1 - f1);
      if (f3 >= f2)
        break label407;
    }
    for (Object localObject2 = new Point(i, j); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      f2 = f3;
      break;
      if (localObject1 == null)
      {
        Camera.Size localSize1 = paramParameters.getPreviewSize();
        localObject1 = new Point(localSize1.width, localSize1.height);
        new StringBuilder("No suitable preview sizes, using default: ").append(localObject1);
      }
      new StringBuilder("Found best approximate preview size: ").append(localObject1);
      return localObject1;
      label407: f3 = f2;
    }
  }

  private static String a(Collection<String> paramCollection, String[] paramArrayOfString)
  {
    new StringBuilder("Supported values: ").append(paramCollection);
    if (paramCollection != null)
    {
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = paramArrayOfString[j];
        if (paramCollection.contains(str))
          return str;
      }
    }
    return null;
  }

  final Point a()
  {
    return this.c;
  }

  final void a(Camera paramCamera)
  {
    Camera.Parameters localParameters = paramCamera.getParameters();
    Display localDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    if (i > j);
    while (true)
    {
      this.b = new Point(j, i);
      new StringBuilder("Screen resolution: ").append(this.b);
      this.c = a(localParameters, this.b);
      new StringBuilder("Camera resolution: ").append(this.c);
      return;
      int k = i;
      i = j;
      j = k;
    }
  }

  final Point b()
  {
    return this.b;
  }

  final void b(Camera paramCamera)
  {
    if (Build.VERSION.SDK_INT >= 8)
      paramCamera.setDisplayOrientation(90);
    Camera.Parameters localParameters = paramCamera.getParameters();
    if (localParameters == null)
      return;
    if (b.b());
    for (String str1 = a(localParameters.getSupportedFlashModes(), new String[] { "torch", "on" }); ; str1 = a(localParameters.getSupportedFlashModes(), new String[] { "off" }))
    {
      if (str1 != null)
        localParameters.setFlashMode(str1);
      boolean bool = b.a();
      String str2 = null;
      if (bool)
        str2 = a(localParameters.getSupportedFocusModes(), new String[] { "continuous-picture", "auto" });
      if (str2 == null)
        str2 = a(localParameters.getSupportedFocusModes(), new String[] { "macro", "edof" });
      if (str2 != null)
        localParameters.setFocusMode(str2);
      localParameters.setPreviewSize(this.c.x, this.c.y);
      paramCamera.setParameters(localParameters);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.a.c
 * JD-Core Version:    0.6.0
 */