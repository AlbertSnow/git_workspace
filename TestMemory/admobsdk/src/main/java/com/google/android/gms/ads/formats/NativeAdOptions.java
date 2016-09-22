package com.google.android.gms.ads.formats;

public final class NativeAdOptions
{
  public static final int ORIENTATION_ANY = 0;
  public static final int ORIENTATION_PORTRAIT = 1;
  public static final int ORIENTATION_LANDSCAPE = 2;
  private final boolean zzoN;
  private final int zzoO;
  private final boolean zzoP;

  private NativeAdOptions(Builder builder)
  {
    this.zzoN = Builder.zza(builder);
    this.zzoO = Builder.zzb(builder);
    this.zzoP = Builder.zzc(builder);
  }

  public boolean shouldReturnUrlsForImageAssets()
  {
    return this.zzoN;
  }

  public int getImageOrientation()
  {
    return this.zzoO;
  }

  public boolean shouldRequestMultipleImages()
  {
    return this.zzoP;
  }

  public static final class Builder
  {
    private boolean zzoN = false;
    private int zzoO = 0;
    private boolean zzoP = false;

    public Builder setReturnUrlsForImageAssets(boolean shouldReturnUrls)
    {
      this.zzoN = shouldReturnUrls;
      return this;
    }

    public Builder setImageOrientation(int orientation)
    {
      this.zzoO = orientation;
      return this;
    }

    public Builder setRequestMultipleImages(boolean shouldRequestMultipleImages)
    {
      this.zzoP = shouldRequestMultipleImages;
      return this;
    }

    public NativeAdOptions build()
    {
      return new NativeAdOptions(this, null);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdOptions
 * JD-Core Version:    0.6.0
 */