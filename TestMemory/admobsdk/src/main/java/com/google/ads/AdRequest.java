package com.google.ads;

@Deprecated
public final class AdRequest
{
  public static final String VERSION = "0.0.0";
  public static final String LOGTAG = "Ads";
  public static final String TEST_EMULATOR = com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR;

  public static enum Gender
  {
  }

  public static enum ErrorCode
  {
    private final String description;

    private ErrorCode(String description)
    {
      this.description = description;
    }

    public String toString()
    {
      return this.description;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.AdRequest
 * JD-Core Version:    0.6.0
 */