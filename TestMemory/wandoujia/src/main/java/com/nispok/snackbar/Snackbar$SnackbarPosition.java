package com.nispok.snackbar;

public enum Snackbar$SnackbarPosition
{
  private int layoutGravity;

  static
  {
    BOTTOM = new SnackbarPosition("BOTTOM", 1, 80);
    BOTTOM_CENTER = new SnackbarPosition("BOTTOM_CENTER", 2, 81);
    SnackbarPosition[] arrayOfSnackbarPosition = new SnackbarPosition[3];
    arrayOfSnackbarPosition[0] = TOP;
    arrayOfSnackbarPosition[1] = BOTTOM;
    arrayOfSnackbarPosition[2] = BOTTOM_CENTER;
    $VALUES = arrayOfSnackbarPosition;
  }

  private Snackbar$SnackbarPosition(int paramInt)
  {
    this.layoutGravity = paramInt;
  }

  public final int getLayoutGravity()
  {
    return this.layoutGravity;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.Snackbar.SnackbarPosition
 * JD-Core Version:    0.6.0
 */