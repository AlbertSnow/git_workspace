package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;

public abstract class NativeAdMapper
{
  protected boolean mOverrideImpressionRecording;
  protected boolean mOverrideClickHandling;
  protected Bundle mExtras = new Bundle();

  public final void setOverrideImpressionRecording(boolean overrideImpressionRecording)
  {
    this.mOverrideImpressionRecording = overrideImpressionRecording;
  }

  public final void setOverrideClickHandling(boolean overrideClickHandling)
  {
    this.mOverrideClickHandling = overrideClickHandling;
  }

  public final void setExtras(Bundle extras)
  {
    this.mExtras = extras;
  }

  public final boolean getOverrideImpressionRecording()
  {
    return this.mOverrideImpressionRecording;
  }

  public final boolean getOverrideClickHandling()
  {
    return this.mOverrideClickHandling;
  }

  public final Bundle getExtras()
  {
    return this.mExtras;
  }

  public void trackView(View view)
  {
  }

  public void recordImpression()
  {
  }

  public void handleClick(View view)
  {
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeAdMapper
 * JD-Core Version:    0.6.0
 */