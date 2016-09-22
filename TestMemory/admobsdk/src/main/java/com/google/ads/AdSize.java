package com.google.ads;

import android.content.Context;

@Deprecated
public final class AdSize
{
  private final com.google.android.gms.ads.AdSize zzaJ;
  public static final int FULL_WIDTH = -1;
  public static final int AUTO_HEIGHT = -2;
  public static final int LANDSCAPE_AD_HEIGHT = 32;
  public static final int PORTRAIT_AD_HEIGHT = 50;
  public static final int LARGE_AD_HEIGHT = 90;
  public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
  public static final AdSize BANNER = new AdSize(320, 50, "mb");
  public static final AdSize IAB_MRECT = new AdSize(300, 250, "as");
  public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
  public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
  public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");

  public AdSize(com.google.android.gms.ads.AdSize adSize)
  {
    this.zzaJ = adSize;
  }

  public AdSize(int width, int height)
  {
    this(new com.google.android.gms.ads.AdSize(width, height));
  }

  private AdSize(int width, int height, String type)
  {
    this(new com.google.android.gms.ads.AdSize(width, height));
  }

  public boolean equals(Object other)
  {
    if (!(other instanceof AdSize))
      return false;
    AdSize localAdSize = (AdSize)other;
    return this.zzaJ.equals(localAdSize.zzaJ);
  }

  public int hashCode()
  {
    return this.zzaJ.hashCode();
  }

  public int getWidth()
  {
    return this.zzaJ.getWidth();
  }

  public int getHeight()
  {
    return this.zzaJ.getHeight();
  }

  public boolean isFullWidth()
  {
    return this.zzaJ.isFullWidth();
  }

  public boolean isAutoHeight()
  {
    return this.zzaJ.isAutoHeight();
  }

  public boolean isCustomAdSize()
  {
    return false;
  }

  public String toString()
  {
    return this.zzaJ.toString();
  }

  public int getWidthInPixels(Context context)
  {
    return this.zzaJ.getWidthInPixels(context);
  }

  public int getHeightInPixels(Context context)
  {
    return this.zzaJ.getHeightInPixels(context);
  }

  public boolean isSizeAppropriate(int width, int height)
  {
    int i = getWidth();
    int j = getHeight();
    return (width <= i * 1.25F) && (width >= i * 0.8F) && (height <= j * 1.25F) && (height >= j * 0.8F);
  }

  public AdSize findBestSize(AdSize[] options)
  {
    if (options == null)
      return null;
    Object localObject = null;
    float f1 = 0.0F;
    int i = getWidth();
    int j = getHeight();
    for (AdSize localAdSize : options)
    {
      int n = localAdSize.getWidth();
      int i1 = localAdSize.getHeight();
      if (!isSizeAppropriate(n, i1))
        continue;
      float f2 = n * i1 / (i * j);
      if (f2 > 1.0F)
        f2 = 1.0F / f2;
      if (f2 <= f1)
        continue;
      localObject = localAdSize;
      f1 = f2;
    }
    return localObject;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.AdSize
 * JD-Core Version:    0.6.0
 */