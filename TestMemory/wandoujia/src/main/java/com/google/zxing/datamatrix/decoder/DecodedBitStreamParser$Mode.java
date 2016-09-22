package com.google.zxing.datamatrix.decoder;

 enum DecodedBitStreamParser$Mode
{
  static
  {
    ASCII_ENCODE = new Mode("ASCII_ENCODE", 1);
    C40_ENCODE = new Mode("C40_ENCODE", 2);
    TEXT_ENCODE = new Mode("TEXT_ENCODE", 3);
    ANSIX12_ENCODE = new Mode("ANSIX12_ENCODE", 4);
    EDIFACT_ENCODE = new Mode("EDIFACT_ENCODE", 5);
    BASE256_ENCODE = new Mode("BASE256_ENCODE", 6);
    Mode[] arrayOfMode = new Mode[7];
    arrayOfMode[0] = PAD_ENCODE;
    arrayOfMode[1] = ASCII_ENCODE;
    arrayOfMode[2] = C40_ENCODE;
    arrayOfMode[3] = TEXT_ENCODE;
    arrayOfMode[4] = ANSIX12_ENCODE;
    arrayOfMode[5] = EDIFACT_ENCODE;
    arrayOfMode[6] = BASE256_ENCODE;
    $VALUES = arrayOfMode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode
 * JD-Core Version:    0.6.0
 */