package com.google.zxing.aztec.decoder;

 enum Decoder$Table
{
  static
  {
    LOWER = new Table("LOWER", 1);
    MIXED = new Table("MIXED", 2);
    DIGIT = new Table("DIGIT", 3);
    PUNCT = new Table("PUNCT", 4);
    BINARY = new Table("BINARY", 5);
    Table[] arrayOfTable = new Table[6];
    arrayOfTable[0] = UPPER;
    arrayOfTable[1] = LOWER;
    arrayOfTable[2] = MIXED;
    arrayOfTable[3] = DIGIT;
    arrayOfTable[4] = PUNCT;
    arrayOfTable[5] = BINARY;
    $VALUES = arrayOfTable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.aztec.decoder.Decoder.Table
 * JD-Core Version:    0.6.0
 */