package com.google.zxing;

import android.support.v4.app.b;

public class f
{
  private final float a;
  private final float b;

  public f(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
  }

  public static float a(f paramf1, f paramf2)
  {
    return b.a(paramf1.a, paramf1.b, paramf2.a, paramf2.b);
  }

  public static void a(f[] paramArrayOff)
  {
    float f1 = a(paramArrayOff[0], paramArrayOff[1]);
    float f2 = a(paramArrayOff[1], paramArrayOff[2]);
    float f3 = a(paramArrayOff[0], paramArrayOff[2]);
    f localf;
    Object localObject1;
    Object localObject2;
    if ((f2 >= f1) && (f2 >= f3))
    {
      localf = paramArrayOff[0];
      localObject1 = paramArrayOff[1];
      localObject2 = paramArrayOff[2];
      float f4 = localf.a;
      float f5 = localf.b;
      if ((((f)localObject2).a - f4) * (((f)localObject1).b - f5) - (((f)localObject2).b - f5) * (((f)localObject1).a - f4) >= 0.0F)
        break label175;
    }
    while (true)
    {
      paramArrayOff[0] = localObject2;
      paramArrayOff[1] = localf;
      paramArrayOff[2] = localObject1;
      return;
      if ((f3 >= f2) && (f3 >= f1))
      {
        localf = paramArrayOff[1];
        localObject1 = paramArrayOff[0];
        localObject2 = paramArrayOff[2];
        break;
      }
      localf = paramArrayOff[2];
      localObject1 = paramArrayOff[0];
      localObject2 = paramArrayOff[1];
      break;
      label175: Object localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
  }

  public final float a()
  {
    return this.a;
  }

  public final float b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof f;
    int i = 0;
    if (bool1)
    {
      f localf = (f)paramObject;
      boolean bool2 = this.a < localf.a;
      i = 0;
      if (!bool2)
      {
        boolean bool3 = this.b < localf.b;
        i = 0;
        if (!bool3)
          i = 1;
      }
    }
    return i;
  }

  public final int hashCode()
  {
    return 31 * Float.floatToIntBits(this.a) + Float.floatToIntBits(this.b);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(25);
    localStringBuilder.append('(');
    localStringBuilder.append(this.a);
    localStringBuilder.append(',');
    localStringBuilder.append(this.b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.f
 * JD-Core Version:    0.6.0
 */