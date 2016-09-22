package com.wandoujia.plugin.qr;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.EnumSet;
import java.util.regex.Pattern;

final class c
{
  static final Collection<BarcodeFormat> a;
  static final Collection<BarcodeFormat> b;
  static final Collection<BarcodeFormat> c;
  private static Collection<BarcodeFormat> d;

  static
  {
    Pattern.compile(",");
    b = EnumSet.of(BarcodeFormat.QR_CODE);
    c = EnumSet.of(BarcodeFormat.DATA_MATRIX);
    d = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14);
    EnumSet localEnumSet = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
    a = localEnumSet;
    localEnumSet.addAll(d);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.c
 * JD-Core Version:    0.6.0
 */