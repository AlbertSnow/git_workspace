package com.nispok.snackbar;

public enum Snackbar$SnackbarDuration
{
  private int duration;

  static
  {
    LENGTH_LONG = new SnackbarDuration("LENGTH_LONG", 1, 3500);
    LENGTH_INDEFINITE = new SnackbarDuration("LENGTH_INDEFINITE", 2, -1);
    SnackbarDuration[] arrayOfSnackbarDuration = new SnackbarDuration[3];
    arrayOfSnackbarDuration[0] = LENGTH_SHORT;
    arrayOfSnackbarDuration[1] = LENGTH_LONG;
    arrayOfSnackbarDuration[2] = LENGTH_INDEFINITE;
    $VALUES = arrayOfSnackbarDuration;
  }

  private Snackbar$SnackbarDuration(int paramInt)
  {
    this.duration = paramInt;
  }

  public final int getDuration()
  {
    return this.duration;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.Snackbar.SnackbarDuration
 * JD-Core Version:    0.6.0
 */