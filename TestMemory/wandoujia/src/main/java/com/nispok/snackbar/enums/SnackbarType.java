package com.nispok.snackbar.enums;

public enum SnackbarType
{
  private int maxHeight;
  private int maxLines;
  private int minHeight;

  static
  {
    MULTI_LINE = new SnackbarType("MULTI_LINE", 1, 48, 80, 2);
    SnackbarType[] arrayOfSnackbarType = new SnackbarType[2];
    arrayOfSnackbarType[0] = SINGLE_LINE;
    arrayOfSnackbarType[1] = MULTI_LINE;
    $VALUES = arrayOfSnackbarType;
  }

  private SnackbarType(int paramInt1, int paramInt2, int paramInt3)
  {
    this.minHeight = paramInt1;
    this.maxHeight = paramInt2;
    this.maxLines = paramInt3;
  }

  public final int getMaxHeight()
  {
    return this.maxHeight;
  }

  public final int getMaxLines()
  {
    return this.maxLines;
  }

  public final int getMinHeight()
  {
    return this.minHeight;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.enums.SnackbarType
 * JD-Core Version:    0.6.0
 */