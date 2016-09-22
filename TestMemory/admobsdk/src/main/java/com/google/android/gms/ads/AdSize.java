package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;

public final class AdSize
{
  public static final int FULL_WIDTH = -1;
  public static final int AUTO_HEIGHT = -2;
  public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
  public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
  public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
  public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
  public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
  public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
  public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
  public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
  private final int zzoG;
  private final int zzoH;
  private final String zzoI;

  public AdSize(int width, int height)
  {
    this(width, height, (width == -1 ? "FULL" : String.valueOf(width)) + "x" + (height == -2 ? "AUTO" : String.valueOf(height)) + "_as");
  }

  AdSize(int width, int height, String formatString)
  {
    if ((width < 0) && (width != -1) && (width != -3))
      throw new IllegalArgumentException("Invalid width for AdSize: " + width);
    if ((height < 0) && (height != -2) && (height != -4))
      throw new IllegalArgumentException("Invalid height for AdSize: " + height);
    this.zzoG = width;
    this.zzoH = height;
    this.zzoI = formatString;
  }

  public boolean equals(Object other)
  {
    if (other == this)
      return true;
    if (!(other instanceof AdSize))
      return false;
    AdSize localAdSize = (AdSize)other;
    return (this.zzoG == localAdSize.zzoG) && (this.zzoH == localAdSize.zzoH) && (this.zzoI.equals(localAdSize.zzoI));
  }

  public int getHeight()
  {
    return this.zzoH;
  }

  public int getHeightInPixels(Context context)
  {
    switch (this.zzoH)
    {
    case -2:
      return AdSizeParcel.zzb(context.getResources().getDisplayMetrics());
    case -4:
    case -3:
      return -1;
    }
    return zzn.zzcS().zzb(context, this.zzoH);
  }

  public int getWidth()
  {
    return this.zzoG;
  }

  public int getWidthInPixels(Context context)
  {
    switch (this.zzoG)
    {
    case -1:
      return AdSizeParcel.zza(context.getResources().getDisplayMetrics());
    case -4:
    case -3:
      return -1;
    case -2:
    }
    return zzn.zzcS().zzb(context, this.zzoG);
  }

  public int hashCode()
  {
    return this.zzoI.hashCode();
  }

  public boolean isAutoHeight()
  {
    return this.zzoH == -2;
  }

  public boolean isFullWidth()
  {
    return this.zzoG == -1;
  }

  public boolean isFluid()
  {
    return (this.zzoG == -3) && (this.zzoH == -4);
  }

  public String toString()
  {
    return this.zzoI;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.AdSize
 * JD-Core Version:    0.6.0
 */