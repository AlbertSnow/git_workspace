package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.b;

public final class p
{
  private static final int[] a = { 31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017 };
  private static final p[] b = f();
  private final int c;
  private final int[] d;
  private final r[] e;
  private final int f;

  private p(int paramInt, int[] paramArrayOfInt, r[] paramArrayOfr)
  {
    this.c = paramInt;
    this.d = paramArrayOfInt;
    this.e = paramArrayOfr;
    int j = paramArrayOfr[0].a();
    q[] arrayOfq = paramArrayOfr[0].b();
    int k = arrayOfq.length;
    int m = 0;
    while (i < k)
    {
      q localq = arrayOfq[i];
      m += localq.a() * (j + localq.b());
      i++;
    }
    this.f = m;
  }

  public static p a(int paramInt)
  {
    if (paramInt % 4 != 1)
      throw FormatException.getFormatInstance();
    int i = paramInt - 17;
    try
    {
      p localp = b(i / 4);
      return localp;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    throw FormatException.getFormatInstance();
  }

  public static p b(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > 40))
      throw new IllegalArgumentException();
    return b[(paramInt - 1)];
  }

  static p c(int paramInt)
  {
    int i = 0;
    int j = 2147483647;
    int k = 0;
    int n;
    if (k < 34)
    {
      int m = a[k];
      if (m == paramInt)
        return b(k + 7);
      n = n.a(paramInt, m);
      if (n >= j)
        break label74;
      i = k + 7;
    }
    while (true)
    {
      k++;
      j = n;
      break;
      if (j <= 3)
        return b(i);
      return null;
      label74: n = j;
    }
  }

  private static p[] f()
  {
    p[] arrayOfp = new p[40];
    int[] arrayOfInt1 = new int[0];
    r[] arrayOfr1 = new r[4];
    q[] arrayOfq1 = new q[1];
    arrayOfq1[0] = new q(1, 19);
    arrayOfr1[0] = new r(7, arrayOfq1);
    q[] arrayOfq2 = new q[1];
    arrayOfq2[0] = new q(1, 16);
    arrayOfr1[1] = new r(10, arrayOfq2);
    q[] arrayOfq3 = new q[1];
    arrayOfq3[0] = new q(1, 13);
    arrayOfr1[2] = new r(13, arrayOfq3);
    q[] arrayOfq4 = new q[1];
    arrayOfq4[0] = new q(1, 9);
    arrayOfr1[3] = new r(17, arrayOfq4);
    arrayOfp[0] = new p(1, arrayOfInt1, arrayOfr1);
    int[] arrayOfInt2 = { 6, 18 };
    r[] arrayOfr2 = new r[4];
    q[] arrayOfq5 = new q[1];
    arrayOfq5[0] = new q(1, 34);
    arrayOfr2[0] = new r(10, arrayOfq5);
    q[] arrayOfq6 = new q[1];
    arrayOfq6[0] = new q(1, 28);
    arrayOfr2[1] = new r(16, arrayOfq6);
    q[] arrayOfq7 = new q[1];
    arrayOfq7[0] = new q(1, 22);
    arrayOfr2[2] = new r(22, arrayOfq7);
    q[] arrayOfq8 = new q[1];
    arrayOfq8[0] = new q(1, 16);
    arrayOfr2[3] = new r(28, arrayOfq8);
    arrayOfp[1] = new p(2, arrayOfInt2, arrayOfr2);
    int[] arrayOfInt3 = { 6, 22 };
    r[] arrayOfr3 = new r[4];
    q[] arrayOfq9 = new q[1];
    arrayOfq9[0] = new q(1, 55);
    arrayOfr3[0] = new r(15, arrayOfq9);
    q[] arrayOfq10 = new q[1];
    arrayOfq10[0] = new q(1, 44);
    arrayOfr3[1] = new r(26, arrayOfq10);
    q[] arrayOfq11 = new q[1];
    arrayOfq11[0] = new q(2, 17);
    arrayOfr3[2] = new r(18, arrayOfq11);
    q[] arrayOfq12 = new q[1];
    arrayOfq12[0] = new q(2, 13);
    arrayOfr3[3] = new r(22, arrayOfq12);
    arrayOfp[2] = new p(3, arrayOfInt3, arrayOfr3);
    int[] arrayOfInt4 = { 6, 26 };
    r[] arrayOfr4 = new r[4];
    q[] arrayOfq13 = new q[1];
    arrayOfq13[0] = new q(1, 80);
    arrayOfr4[0] = new r(20, arrayOfq13);
    q[] arrayOfq14 = new q[1];
    arrayOfq14[0] = new q(2, 32);
    arrayOfr4[1] = new r(18, arrayOfq14);
    q[] arrayOfq15 = new q[1];
    arrayOfq15[0] = new q(2, 24);
    arrayOfr4[2] = new r(26, arrayOfq15);
    q[] arrayOfq16 = new q[1];
    arrayOfq16[0] = new q(4, 9);
    arrayOfr4[3] = new r(16, arrayOfq16);
    arrayOfp[3] = new p(4, arrayOfInt4, arrayOfr4);
    int[] arrayOfInt5 = { 6, 30 };
    r[] arrayOfr5 = new r[4];
    q[] arrayOfq17 = new q[1];
    arrayOfq17[0] = new q(1, 108);
    arrayOfr5[0] = new r(26, arrayOfq17);
    q[] arrayOfq18 = new q[1];
    arrayOfq18[0] = new q(2, 43);
    arrayOfr5[1] = new r(24, arrayOfq18);
    q[] arrayOfq19 = new q[2];
    arrayOfq19[0] = new q(2, 15);
    arrayOfq19[1] = new q(2, 16);
    arrayOfr5[2] = new r(18, arrayOfq19);
    q[] arrayOfq20 = new q[2];
    arrayOfq20[0] = new q(2, 11);
    arrayOfq20[1] = new q(2, 12);
    arrayOfr5[3] = new r(22, arrayOfq20);
    arrayOfp[4] = new p(5, arrayOfInt5, arrayOfr5);
    int[] arrayOfInt6 = { 6, 34 };
    r[] arrayOfr6 = new r[4];
    q[] arrayOfq21 = new q[1];
    arrayOfq21[0] = new q(2, 68);
    arrayOfr6[0] = new r(18, arrayOfq21);
    q[] arrayOfq22 = new q[1];
    arrayOfq22[0] = new q(4, 27);
    arrayOfr6[1] = new r(16, arrayOfq22);
    q[] arrayOfq23 = new q[1];
    arrayOfq23[0] = new q(4, 19);
    arrayOfr6[2] = new r(24, arrayOfq23);
    q[] arrayOfq24 = new q[1];
    arrayOfq24[0] = new q(4, 15);
    arrayOfr6[3] = new r(28, arrayOfq24);
    arrayOfp[5] = new p(6, arrayOfInt6, arrayOfr6);
    int[] arrayOfInt7 = { 6, 22, 38 };
    r[] arrayOfr7 = new r[4];
    q[] arrayOfq25 = new q[1];
    arrayOfq25[0] = new q(2, 78);
    arrayOfr7[0] = new r(20, arrayOfq25);
    q[] arrayOfq26 = new q[1];
    arrayOfq26[0] = new q(4, 31);
    arrayOfr7[1] = new r(18, arrayOfq26);
    q[] arrayOfq27 = new q[2];
    arrayOfq27[0] = new q(2, 14);
    arrayOfq27[1] = new q(4, 15);
    arrayOfr7[2] = new r(18, arrayOfq27);
    q[] arrayOfq28 = new q[2];
    arrayOfq28[0] = new q(4, 13);
    arrayOfq28[1] = new q(1, 14);
    arrayOfr7[3] = new r(26, arrayOfq28);
    arrayOfp[6] = new p(7, arrayOfInt7, arrayOfr7);
    int[] arrayOfInt8 = { 6, 24, 42 };
    r[] arrayOfr8 = new r[4];
    q[] arrayOfq29 = new q[1];
    arrayOfq29[0] = new q(2, 97);
    arrayOfr8[0] = new r(24, arrayOfq29);
    q[] arrayOfq30 = new q[2];
    arrayOfq30[0] = new q(2, 38);
    arrayOfq30[1] = new q(2, 39);
    arrayOfr8[1] = new r(22, arrayOfq30);
    q[] arrayOfq31 = new q[2];
    arrayOfq31[0] = new q(4, 18);
    arrayOfq31[1] = new q(2, 19);
    arrayOfr8[2] = new r(22, arrayOfq31);
    q[] arrayOfq32 = new q[2];
    arrayOfq32[0] = new q(4, 14);
    arrayOfq32[1] = new q(2, 15);
    arrayOfr8[3] = new r(26, arrayOfq32);
    arrayOfp[7] = new p(8, arrayOfInt8, arrayOfr8);
    int[] arrayOfInt9 = { 6, 26, 46 };
    r[] arrayOfr9 = new r[4];
    q[] arrayOfq33 = new q[1];
    arrayOfq33[0] = new q(2, 116);
    arrayOfr9[0] = new r(30, arrayOfq33);
    q[] arrayOfq34 = new q[2];
    arrayOfq34[0] = new q(3, 36);
    arrayOfq34[1] = new q(2, 37);
    arrayOfr9[1] = new r(22, arrayOfq34);
    q[] arrayOfq35 = new q[2];
    arrayOfq35[0] = new q(4, 16);
    arrayOfq35[1] = new q(4, 17);
    arrayOfr9[2] = new r(20, arrayOfq35);
    q[] arrayOfq36 = new q[2];
    arrayOfq36[0] = new q(4, 12);
    arrayOfq36[1] = new q(4, 13);
    arrayOfr9[3] = new r(24, arrayOfq36);
    arrayOfp[8] = new p(9, arrayOfInt9, arrayOfr9);
    int[] arrayOfInt10 = { 6, 28, 50 };
    r[] arrayOfr10 = new r[4];
    q[] arrayOfq37 = new q[2];
    arrayOfq37[0] = new q(2, 68);
    arrayOfq37[1] = new q(2, 69);
    arrayOfr10[0] = new r(18, arrayOfq37);
    q[] arrayOfq38 = new q[2];
    arrayOfq38[0] = new q(4, 43);
    arrayOfq38[1] = new q(1, 44);
    arrayOfr10[1] = new r(26, arrayOfq38);
    q[] arrayOfq39 = new q[2];
    arrayOfq39[0] = new q(6, 19);
    arrayOfq39[1] = new q(2, 20);
    arrayOfr10[2] = new r(24, arrayOfq39);
    q[] arrayOfq40 = new q[2];
    arrayOfq40[0] = new q(6, 15);
    arrayOfq40[1] = new q(2, 16);
    arrayOfr10[3] = new r(28, arrayOfq40);
    arrayOfp[9] = new p(10, arrayOfInt10, arrayOfr10);
    int[] arrayOfInt11 = { 6, 30, 54 };
    r[] arrayOfr11 = new r[4];
    q[] arrayOfq41 = new q[1];
    arrayOfq41[0] = new q(4, 81);
    arrayOfr11[0] = new r(20, arrayOfq41);
    q[] arrayOfq42 = new q[2];
    arrayOfq42[0] = new q(1, 50);
    arrayOfq42[1] = new q(4, 51);
    arrayOfr11[1] = new r(30, arrayOfq42);
    q[] arrayOfq43 = new q[2];
    arrayOfq43[0] = new q(4, 22);
    arrayOfq43[1] = new q(4, 23);
    arrayOfr11[2] = new r(28, arrayOfq43);
    q[] arrayOfq44 = new q[2];
    arrayOfq44[0] = new q(3, 12);
    arrayOfq44[1] = new q(8, 13);
    arrayOfr11[3] = new r(24, arrayOfq44);
    arrayOfp[10] = new p(11, arrayOfInt11, arrayOfr11);
    int[] arrayOfInt12 = { 6, 32, 58 };
    r[] arrayOfr12 = new r[4];
    q[] arrayOfq45 = new q[2];
    arrayOfq45[0] = new q(2, 92);
    arrayOfq45[1] = new q(2, 93);
    arrayOfr12[0] = new r(24, arrayOfq45);
    q[] arrayOfq46 = new q[2];
    arrayOfq46[0] = new q(6, 36);
    arrayOfq46[1] = new q(2, 37);
    arrayOfr12[1] = new r(22, arrayOfq46);
    q[] arrayOfq47 = new q[2];
    arrayOfq47[0] = new q(4, 20);
    arrayOfq47[1] = new q(6, 21);
    arrayOfr12[2] = new r(26, arrayOfq47);
    q[] arrayOfq48 = new q[2];
    arrayOfq48[0] = new q(7, 14);
    arrayOfq48[1] = new q(4, 15);
    arrayOfr12[3] = new r(28, arrayOfq48);
    arrayOfp[11] = new p(12, arrayOfInt12, arrayOfr12);
    int[] arrayOfInt13 = { 6, 34, 62 };
    r[] arrayOfr13 = new r[4];
    q[] arrayOfq49 = new q[1];
    arrayOfq49[0] = new q(4, 107);
    arrayOfr13[0] = new r(26, arrayOfq49);
    q[] arrayOfq50 = new q[2];
    arrayOfq50[0] = new q(8, 37);
    arrayOfq50[1] = new q(1, 38);
    arrayOfr13[1] = new r(22, arrayOfq50);
    q[] arrayOfq51 = new q[2];
    arrayOfq51[0] = new q(8, 20);
    arrayOfq51[1] = new q(4, 21);
    arrayOfr13[2] = new r(24, arrayOfq51);
    q[] arrayOfq52 = new q[2];
    arrayOfq52[0] = new q(12, 11);
    arrayOfq52[1] = new q(4, 12);
    arrayOfr13[3] = new r(22, arrayOfq52);
    arrayOfp[12] = new p(13, arrayOfInt13, arrayOfr13);
    int[] arrayOfInt14 = { 6, 26, 46, 66 };
    r[] arrayOfr14 = new r[4];
    q[] arrayOfq53 = new q[2];
    arrayOfq53[0] = new q(3, 115);
    arrayOfq53[1] = new q(1, 116);
    arrayOfr14[0] = new r(30, arrayOfq53);
    q[] arrayOfq54 = new q[2];
    arrayOfq54[0] = new q(4, 40);
    arrayOfq54[1] = new q(5, 41);
    arrayOfr14[1] = new r(24, arrayOfq54);
    q[] arrayOfq55 = new q[2];
    arrayOfq55[0] = new q(11, 16);
    arrayOfq55[1] = new q(5, 17);
    arrayOfr14[2] = new r(20, arrayOfq55);
    q[] arrayOfq56 = new q[2];
    arrayOfq56[0] = new q(11, 12);
    arrayOfq56[1] = new q(5, 13);
    arrayOfr14[3] = new r(24, arrayOfq56);
    arrayOfp[13] = new p(14, arrayOfInt14, arrayOfr14);
    int[] arrayOfInt15 = { 6, 26, 48, 70 };
    r[] arrayOfr15 = new r[4];
    q[] arrayOfq57 = new q[2];
    arrayOfq57[0] = new q(5, 87);
    arrayOfq57[1] = new q(1, 88);
    arrayOfr15[0] = new r(22, arrayOfq57);
    q[] arrayOfq58 = new q[2];
    arrayOfq58[0] = new q(5, 41);
    arrayOfq58[1] = new q(5, 42);
    arrayOfr15[1] = new r(24, arrayOfq58);
    q[] arrayOfq59 = new q[2];
    arrayOfq59[0] = new q(5, 24);
    arrayOfq59[1] = new q(7, 25);
    arrayOfr15[2] = new r(30, arrayOfq59);
    q[] arrayOfq60 = new q[2];
    arrayOfq60[0] = new q(11, 12);
    arrayOfq60[1] = new q(7, 13);
    arrayOfr15[3] = new r(24, arrayOfq60);
    arrayOfp[14] = new p(15, arrayOfInt15, arrayOfr15);
    int[] arrayOfInt16 = { 6, 26, 50, 74 };
    r[] arrayOfr16 = new r[4];
    q[] arrayOfq61 = new q[2];
    arrayOfq61[0] = new q(5, 98);
    arrayOfq61[1] = new q(1, 99);
    arrayOfr16[0] = new r(24, arrayOfq61);
    q[] arrayOfq62 = new q[2];
    arrayOfq62[0] = new q(7, 45);
    arrayOfq62[1] = new q(3, 46);
    arrayOfr16[1] = new r(28, arrayOfq62);
    q[] arrayOfq63 = new q[2];
    arrayOfq63[0] = new q(15, 19);
    arrayOfq63[1] = new q(2, 20);
    arrayOfr16[2] = new r(24, arrayOfq63);
    q[] arrayOfq64 = new q[2];
    arrayOfq64[0] = new q(3, 15);
    arrayOfq64[1] = new q(13, 16);
    arrayOfr16[3] = new r(30, arrayOfq64);
    arrayOfp[15] = new p(16, arrayOfInt16, arrayOfr16);
    int[] arrayOfInt17 = { 6, 30, 54, 78 };
    r[] arrayOfr17 = new r[4];
    q[] arrayOfq65 = new q[2];
    arrayOfq65[0] = new q(1, 107);
    arrayOfq65[1] = new q(5, 108);
    arrayOfr17[0] = new r(28, arrayOfq65);
    q[] arrayOfq66 = new q[2];
    arrayOfq66[0] = new q(10, 46);
    arrayOfq66[1] = new q(1, 47);
    arrayOfr17[1] = new r(28, arrayOfq66);
    q[] arrayOfq67 = new q[2];
    arrayOfq67[0] = new q(1, 22);
    arrayOfq67[1] = new q(15, 23);
    arrayOfr17[2] = new r(28, arrayOfq67);
    q[] arrayOfq68 = new q[2];
    arrayOfq68[0] = new q(2, 14);
    arrayOfq68[1] = new q(17, 15);
    arrayOfr17[3] = new r(28, arrayOfq68);
    arrayOfp[16] = new p(17, arrayOfInt17, arrayOfr17);
    int[] arrayOfInt18 = { 6, 30, 56, 82 };
    r[] arrayOfr18 = new r[4];
    q[] arrayOfq69 = new q[2];
    arrayOfq69[0] = new q(5, 120);
    arrayOfq69[1] = new q(1, 121);
    arrayOfr18[0] = new r(30, arrayOfq69);
    q[] arrayOfq70 = new q[2];
    arrayOfq70[0] = new q(9, 43);
    arrayOfq70[1] = new q(4, 44);
    arrayOfr18[1] = new r(26, arrayOfq70);
    q[] arrayOfq71 = new q[2];
    arrayOfq71[0] = new q(17, 22);
    arrayOfq71[1] = new q(1, 23);
    arrayOfr18[2] = new r(28, arrayOfq71);
    q[] arrayOfq72 = new q[2];
    arrayOfq72[0] = new q(2, 14);
    arrayOfq72[1] = new q(19, 15);
    arrayOfr18[3] = new r(28, arrayOfq72);
    arrayOfp[17] = new p(18, arrayOfInt18, arrayOfr18);
    int[] arrayOfInt19 = { 6, 30, 58, 86 };
    r[] arrayOfr19 = new r[4];
    q[] arrayOfq73 = new q[2];
    arrayOfq73[0] = new q(3, 113);
    arrayOfq73[1] = new q(4, 114);
    arrayOfr19[0] = new r(28, arrayOfq73);
    q[] arrayOfq74 = new q[2];
    arrayOfq74[0] = new q(3, 44);
    arrayOfq74[1] = new q(11, 45);
    arrayOfr19[1] = new r(26, arrayOfq74);
    q[] arrayOfq75 = new q[2];
    arrayOfq75[0] = new q(17, 21);
    arrayOfq75[1] = new q(4, 22);
    arrayOfr19[2] = new r(26, arrayOfq75);
    q[] arrayOfq76 = new q[2];
    arrayOfq76[0] = new q(9, 13);
    arrayOfq76[1] = new q(16, 14);
    arrayOfr19[3] = new r(26, arrayOfq76);
    arrayOfp[18] = new p(19, arrayOfInt19, arrayOfr19);
    int[] arrayOfInt20 = { 6, 34, 62, 90 };
    r[] arrayOfr20 = new r[4];
    q[] arrayOfq77 = new q[2];
    arrayOfq77[0] = new q(3, 107);
    arrayOfq77[1] = new q(5, 108);
    arrayOfr20[0] = new r(28, arrayOfq77);
    q[] arrayOfq78 = new q[2];
    arrayOfq78[0] = new q(3, 41);
    arrayOfq78[1] = new q(13, 42);
    arrayOfr20[1] = new r(26, arrayOfq78);
    q[] arrayOfq79 = new q[2];
    arrayOfq79[0] = new q(15, 24);
    arrayOfq79[1] = new q(5, 25);
    arrayOfr20[2] = new r(30, arrayOfq79);
    q[] arrayOfq80 = new q[2];
    arrayOfq80[0] = new q(15, 15);
    arrayOfq80[1] = new q(10, 16);
    arrayOfr20[3] = new r(28, arrayOfq80);
    arrayOfp[19] = new p(20, arrayOfInt20, arrayOfr20);
    int[] arrayOfInt21 = { 6, 28, 50, 72, 94 };
    r[] arrayOfr21 = new r[4];
    q[] arrayOfq81 = new q[2];
    arrayOfq81[0] = new q(4, 116);
    arrayOfq81[1] = new q(4, 117);
    arrayOfr21[0] = new r(28, arrayOfq81);
    q[] arrayOfq82 = new q[1];
    arrayOfq82[0] = new q(17, 42);
    arrayOfr21[1] = new r(26, arrayOfq82);
    q[] arrayOfq83 = new q[2];
    arrayOfq83[0] = new q(17, 22);
    arrayOfq83[1] = new q(6, 23);
    arrayOfr21[2] = new r(28, arrayOfq83);
    q[] arrayOfq84 = new q[2];
    arrayOfq84[0] = new q(19, 16);
    arrayOfq84[1] = new q(6, 17);
    arrayOfr21[3] = new r(30, arrayOfq84);
    arrayOfp[20] = new p(21, arrayOfInt21, arrayOfr21);
    int[] arrayOfInt22 = { 6, 26, 50, 74, 98 };
    r[] arrayOfr22 = new r[4];
    q[] arrayOfq85 = new q[2];
    arrayOfq85[0] = new q(2, 111);
    arrayOfq85[1] = new q(7, 112);
    arrayOfr22[0] = new r(28, arrayOfq85);
    q[] arrayOfq86 = new q[1];
    arrayOfq86[0] = new q(17, 46);
    arrayOfr22[1] = new r(28, arrayOfq86);
    q[] arrayOfq87 = new q[2];
    arrayOfq87[0] = new q(7, 24);
    arrayOfq87[1] = new q(16, 25);
    arrayOfr22[2] = new r(30, arrayOfq87);
    q[] arrayOfq88 = new q[1];
    arrayOfq88[0] = new q(34, 13);
    arrayOfr22[3] = new r(24, arrayOfq88);
    arrayOfp[21] = new p(22, arrayOfInt22, arrayOfr22);
    int[] arrayOfInt23 = { 6, 30, 54, 78, 102 };
    r[] arrayOfr23 = new r[4];
    q[] arrayOfq89 = new q[2];
    arrayOfq89[0] = new q(4, 121);
    arrayOfq89[1] = new q(5, 122);
    arrayOfr23[0] = new r(30, arrayOfq89);
    q[] arrayOfq90 = new q[2];
    arrayOfq90[0] = new q(4, 47);
    arrayOfq90[1] = new q(14, 48);
    arrayOfr23[1] = new r(28, arrayOfq90);
    q[] arrayOfq91 = new q[2];
    arrayOfq91[0] = new q(11, 24);
    arrayOfq91[1] = new q(14, 25);
    arrayOfr23[2] = new r(30, arrayOfq91);
    q[] arrayOfq92 = new q[2];
    arrayOfq92[0] = new q(16, 15);
    arrayOfq92[1] = new q(14, 16);
    arrayOfr23[3] = new r(30, arrayOfq92);
    arrayOfp[22] = new p(23, arrayOfInt23, arrayOfr23);
    int[] arrayOfInt24 = { 6, 28, 54, 80, 106 };
    r[] arrayOfr24 = new r[4];
    q[] arrayOfq93 = new q[2];
    arrayOfq93[0] = new q(6, 117);
    arrayOfq93[1] = new q(4, 118);
    arrayOfr24[0] = new r(30, arrayOfq93);
    q[] arrayOfq94 = new q[2];
    arrayOfq94[0] = new q(6, 45);
    arrayOfq94[1] = new q(14, 46);
    arrayOfr24[1] = new r(28, arrayOfq94);
    q[] arrayOfq95 = new q[2];
    arrayOfq95[0] = new q(11, 24);
    arrayOfq95[1] = new q(16, 25);
    arrayOfr24[2] = new r(30, arrayOfq95);
    q[] arrayOfq96 = new q[2];
    arrayOfq96[0] = new q(30, 16);
    arrayOfq96[1] = new q(2, 17);
    arrayOfr24[3] = new r(30, arrayOfq96);
    arrayOfp[23] = new p(24, arrayOfInt24, arrayOfr24);
    int[] arrayOfInt25 = { 6, 32, 58, 84, 110 };
    r[] arrayOfr25 = new r[4];
    q[] arrayOfq97 = new q[2];
    arrayOfq97[0] = new q(8, 106);
    arrayOfq97[1] = new q(4, 107);
    arrayOfr25[0] = new r(26, arrayOfq97);
    q[] arrayOfq98 = new q[2];
    arrayOfq98[0] = new q(8, 47);
    arrayOfq98[1] = new q(13, 48);
    arrayOfr25[1] = new r(28, arrayOfq98);
    q[] arrayOfq99 = new q[2];
    arrayOfq99[0] = new q(7, 24);
    arrayOfq99[1] = new q(22, 25);
    arrayOfr25[2] = new r(30, arrayOfq99);
    q[] arrayOfq100 = new q[2];
    arrayOfq100[0] = new q(22, 15);
    arrayOfq100[1] = new q(13, 16);
    arrayOfr25[3] = new r(30, arrayOfq100);
    arrayOfp[24] = new p(25, arrayOfInt25, arrayOfr25);
    int[] arrayOfInt26 = { 6, 30, 58, 86, 114 };
    r[] arrayOfr26 = new r[4];
    q[] arrayOfq101 = new q[2];
    arrayOfq101[0] = new q(10, 114);
    arrayOfq101[1] = new q(2, 115);
    arrayOfr26[0] = new r(28, arrayOfq101);
    q[] arrayOfq102 = new q[2];
    arrayOfq102[0] = new q(19, 46);
    arrayOfq102[1] = new q(4, 47);
    arrayOfr26[1] = new r(28, arrayOfq102);
    q[] arrayOfq103 = new q[2];
    arrayOfq103[0] = new q(28, 22);
    arrayOfq103[1] = new q(6, 23);
    arrayOfr26[2] = new r(28, arrayOfq103);
    q[] arrayOfq104 = new q[2];
    arrayOfq104[0] = new q(33, 16);
    arrayOfq104[1] = new q(4, 17);
    arrayOfr26[3] = new r(30, arrayOfq104);
    arrayOfp[25] = new p(26, arrayOfInt26, arrayOfr26);
    int[] arrayOfInt27 = { 6, 34, 62, 90, 118 };
    r[] arrayOfr27 = new r[4];
    q[] arrayOfq105 = new q[2];
    arrayOfq105[0] = new q(8, 122);
    arrayOfq105[1] = new q(4, 123);
    arrayOfr27[0] = new r(30, arrayOfq105);
    q[] arrayOfq106 = new q[2];
    arrayOfq106[0] = new q(22, 45);
    arrayOfq106[1] = new q(3, 46);
    arrayOfr27[1] = new r(28, arrayOfq106);
    q[] arrayOfq107 = new q[2];
    arrayOfq107[0] = new q(8, 23);
    arrayOfq107[1] = new q(26, 24);
    arrayOfr27[2] = new r(30, arrayOfq107);
    q[] arrayOfq108 = new q[2];
    arrayOfq108[0] = new q(12, 15);
    arrayOfq108[1] = new q(28, 16);
    arrayOfr27[3] = new r(30, arrayOfq108);
    arrayOfp[26] = new p(27, arrayOfInt27, arrayOfr27);
    int[] arrayOfInt28 = { 6, 26, 50, 74, 98, 122 };
    r[] arrayOfr28 = new r[4];
    q[] arrayOfq109 = new q[2];
    arrayOfq109[0] = new q(3, 117);
    arrayOfq109[1] = new q(10, 118);
    arrayOfr28[0] = new r(30, arrayOfq109);
    q[] arrayOfq110 = new q[2];
    arrayOfq110[0] = new q(3, 45);
    arrayOfq110[1] = new q(23, 46);
    arrayOfr28[1] = new r(28, arrayOfq110);
    q[] arrayOfq111 = new q[2];
    arrayOfq111[0] = new q(4, 24);
    arrayOfq111[1] = new q(31, 25);
    arrayOfr28[2] = new r(30, arrayOfq111);
    q[] arrayOfq112 = new q[2];
    arrayOfq112[0] = new q(11, 15);
    arrayOfq112[1] = new q(31, 16);
    arrayOfr28[3] = new r(30, arrayOfq112);
    arrayOfp[27] = new p(28, arrayOfInt28, arrayOfr28);
    int[] arrayOfInt29 = { 6, 30, 54, 78, 102, 126 };
    r[] arrayOfr29 = new r[4];
    q[] arrayOfq113 = new q[2];
    arrayOfq113[0] = new q(7, 116);
    arrayOfq113[1] = new q(7, 117);
    arrayOfr29[0] = new r(30, arrayOfq113);
    q[] arrayOfq114 = new q[2];
    arrayOfq114[0] = new q(21, 45);
    arrayOfq114[1] = new q(7, 46);
    arrayOfr29[1] = new r(28, arrayOfq114);
    q[] arrayOfq115 = new q[2];
    arrayOfq115[0] = new q(1, 23);
    arrayOfq115[1] = new q(37, 24);
    arrayOfr29[2] = new r(30, arrayOfq115);
    q[] arrayOfq116 = new q[2];
    arrayOfq116[0] = new q(19, 15);
    arrayOfq116[1] = new q(26, 16);
    arrayOfr29[3] = new r(30, arrayOfq116);
    arrayOfp[28] = new p(29, arrayOfInt29, arrayOfr29);
    int[] arrayOfInt30 = { 6, 26, 52, 78, 104, 130 };
    r[] arrayOfr30 = new r[4];
    q[] arrayOfq117 = new q[2];
    arrayOfq117[0] = new q(5, 115);
    arrayOfq117[1] = new q(10, 116);
    arrayOfr30[0] = new r(30, arrayOfq117);
    q[] arrayOfq118 = new q[2];
    arrayOfq118[0] = new q(19, 47);
    arrayOfq118[1] = new q(10, 48);
    arrayOfr30[1] = new r(28, arrayOfq118);
    q[] arrayOfq119 = new q[2];
    arrayOfq119[0] = new q(15, 24);
    arrayOfq119[1] = new q(25, 25);
    arrayOfr30[2] = new r(30, arrayOfq119);
    q[] arrayOfq120 = new q[2];
    arrayOfq120[0] = new q(23, 15);
    arrayOfq120[1] = new q(25, 16);
    arrayOfr30[3] = new r(30, arrayOfq120);
    arrayOfp[29] = new p(30, arrayOfInt30, arrayOfr30);
    int[] arrayOfInt31 = { 6, 30, 56, 82, 108, 134 };
    r[] arrayOfr31 = new r[4];
    q[] arrayOfq121 = new q[2];
    arrayOfq121[0] = new q(13, 115);
    arrayOfq121[1] = new q(3, 116);
    arrayOfr31[0] = new r(30, arrayOfq121);
    q[] arrayOfq122 = new q[2];
    arrayOfq122[0] = new q(2, 46);
    arrayOfq122[1] = new q(29, 47);
    arrayOfr31[1] = new r(28, arrayOfq122);
    q[] arrayOfq123 = new q[2];
    arrayOfq123[0] = new q(42, 24);
    arrayOfq123[1] = new q(1, 25);
    arrayOfr31[2] = new r(30, arrayOfq123);
    q[] arrayOfq124 = new q[2];
    arrayOfq124[0] = new q(23, 15);
    arrayOfq124[1] = new q(28, 16);
    arrayOfr31[3] = new r(30, arrayOfq124);
    arrayOfp[30] = new p(31, arrayOfInt31, arrayOfr31);
    int[] arrayOfInt32 = { 6, 34, 60, 86, 112, 138 };
    r[] arrayOfr32 = new r[4];
    q[] arrayOfq125 = new q[1];
    arrayOfq125[0] = new q(17, 115);
    arrayOfr32[0] = new r(30, arrayOfq125);
    q[] arrayOfq126 = new q[2];
    arrayOfq126[0] = new q(10, 46);
    arrayOfq126[1] = new q(23, 47);
    arrayOfr32[1] = new r(28, arrayOfq126);
    q[] arrayOfq127 = new q[2];
    arrayOfq127[0] = new q(10, 24);
    arrayOfq127[1] = new q(35, 25);
    arrayOfr32[2] = new r(30, arrayOfq127);
    q[] arrayOfq128 = new q[2];
    arrayOfq128[0] = new q(19, 15);
    arrayOfq128[1] = new q(35, 16);
    arrayOfr32[3] = new r(30, arrayOfq128);
    arrayOfp[31] = new p(32, arrayOfInt32, arrayOfr32);
    int[] arrayOfInt33 = { 6, 30, 58, 86, 114, 142 };
    r[] arrayOfr33 = new r[4];
    q[] arrayOfq129 = new q[2];
    arrayOfq129[0] = new q(17, 115);
    arrayOfq129[1] = new q(1, 116);
    arrayOfr33[0] = new r(30, arrayOfq129);
    q[] arrayOfq130 = new q[2];
    arrayOfq130[0] = new q(14, 46);
    arrayOfq130[1] = new q(21, 47);
    arrayOfr33[1] = new r(28, arrayOfq130);
    q[] arrayOfq131 = new q[2];
    arrayOfq131[0] = new q(29, 24);
    arrayOfq131[1] = new q(19, 25);
    arrayOfr33[2] = new r(30, arrayOfq131);
    q[] arrayOfq132 = new q[2];
    arrayOfq132[0] = new q(11, 15);
    arrayOfq132[1] = new q(46, 16);
    arrayOfr33[3] = new r(30, arrayOfq132);
    arrayOfp[32] = new p(33, arrayOfInt33, arrayOfr33);
    int[] arrayOfInt34 = { 6, 34, 62, 90, 118, 146 };
    r[] arrayOfr34 = new r[4];
    q[] arrayOfq133 = new q[2];
    arrayOfq133[0] = new q(13, 115);
    arrayOfq133[1] = new q(6, 116);
    arrayOfr34[0] = new r(30, arrayOfq133);
    q[] arrayOfq134 = new q[2];
    arrayOfq134[0] = new q(14, 46);
    arrayOfq134[1] = new q(23, 47);
    arrayOfr34[1] = new r(28, arrayOfq134);
    q[] arrayOfq135 = new q[2];
    arrayOfq135[0] = new q(44, 24);
    arrayOfq135[1] = new q(7, 25);
    arrayOfr34[2] = new r(30, arrayOfq135);
    q[] arrayOfq136 = new q[2];
    arrayOfq136[0] = new q(59, 16);
    arrayOfq136[1] = new q(1, 17);
    arrayOfr34[3] = new r(30, arrayOfq136);
    arrayOfp[33] = new p(34, arrayOfInt34, arrayOfr34);
    int[] arrayOfInt35 = { 6, 30, 54, 78, 102, 126, 150 };
    r[] arrayOfr35 = new r[4];
    q[] arrayOfq137 = new q[2];
    arrayOfq137[0] = new q(12, 121);
    arrayOfq137[1] = new q(7, 122);
    arrayOfr35[0] = new r(30, arrayOfq137);
    q[] arrayOfq138 = new q[2];
    arrayOfq138[0] = new q(12, 47);
    arrayOfq138[1] = new q(26, 48);
    arrayOfr35[1] = new r(28, arrayOfq138);
    q[] arrayOfq139 = new q[2];
    arrayOfq139[0] = new q(39, 24);
    arrayOfq139[1] = new q(14, 25);
    arrayOfr35[2] = new r(30, arrayOfq139);
    q[] arrayOfq140 = new q[2];
    arrayOfq140[0] = new q(22, 15);
    arrayOfq140[1] = new q(41, 16);
    arrayOfr35[3] = new r(30, arrayOfq140);
    arrayOfp[34] = new p(35, arrayOfInt35, arrayOfr35);
    int[] arrayOfInt36 = { 6, 24, 50, 76, 102, 128, 154 };
    r[] arrayOfr36 = new r[4];
    q[] arrayOfq141 = new q[2];
    arrayOfq141[0] = new q(6, 121);
    arrayOfq141[1] = new q(14, 122);
    arrayOfr36[0] = new r(30, arrayOfq141);
    q[] arrayOfq142 = new q[2];
    arrayOfq142[0] = new q(6, 47);
    arrayOfq142[1] = new q(34, 48);
    arrayOfr36[1] = new r(28, arrayOfq142);
    q[] arrayOfq143 = new q[2];
    arrayOfq143[0] = new q(46, 24);
    arrayOfq143[1] = new q(10, 25);
    arrayOfr36[2] = new r(30, arrayOfq143);
    q[] arrayOfq144 = new q[2];
    arrayOfq144[0] = new q(2, 15);
    arrayOfq144[1] = new q(64, 16);
    arrayOfr36[3] = new r(30, arrayOfq144);
    arrayOfp[35] = new p(36, arrayOfInt36, arrayOfr36);
    int[] arrayOfInt37 = { 6, 28, 54, 80, 106, 132, 158 };
    r[] arrayOfr37 = new r[4];
    q[] arrayOfq145 = new q[2];
    arrayOfq145[0] = new q(17, 122);
    arrayOfq145[1] = new q(4, 123);
    arrayOfr37[0] = new r(30, arrayOfq145);
    q[] arrayOfq146 = new q[2];
    arrayOfq146[0] = new q(29, 46);
    arrayOfq146[1] = new q(14, 47);
    arrayOfr37[1] = new r(28, arrayOfq146);
    q[] arrayOfq147 = new q[2];
    arrayOfq147[0] = new q(49, 24);
    arrayOfq147[1] = new q(10, 25);
    arrayOfr37[2] = new r(30, arrayOfq147);
    q[] arrayOfq148 = new q[2];
    arrayOfq148[0] = new q(24, 15);
    arrayOfq148[1] = new q(46, 16);
    arrayOfr37[3] = new r(30, arrayOfq148);
    arrayOfp[36] = new p(37, arrayOfInt37, arrayOfr37);
    int[] arrayOfInt38 = { 6, 32, 58, 84, 110, 136, 162 };
    r[] arrayOfr38 = new r[4];
    q[] arrayOfq149 = new q[2];
    arrayOfq149[0] = new q(4, 122);
    arrayOfq149[1] = new q(18, 123);
    arrayOfr38[0] = new r(30, arrayOfq149);
    q[] arrayOfq150 = new q[2];
    arrayOfq150[0] = new q(13, 46);
    arrayOfq150[1] = new q(32, 47);
    arrayOfr38[1] = new r(28, arrayOfq150);
    q[] arrayOfq151 = new q[2];
    arrayOfq151[0] = new q(48, 24);
    arrayOfq151[1] = new q(14, 25);
    arrayOfr38[2] = new r(30, arrayOfq151);
    q[] arrayOfq152 = new q[2];
    arrayOfq152[0] = new q(42, 15);
    arrayOfq152[1] = new q(32, 16);
    arrayOfr38[3] = new r(30, arrayOfq152);
    arrayOfp[37] = new p(38, arrayOfInt38, arrayOfr38);
    int[] arrayOfInt39 = { 6, 26, 54, 82, 110, 138, 166 };
    r[] arrayOfr39 = new r[4];
    q[] arrayOfq153 = new q[2];
    arrayOfq153[0] = new q(20, 117);
    arrayOfq153[1] = new q(4, 118);
    arrayOfr39[0] = new r(30, arrayOfq153);
    q[] arrayOfq154 = new q[2];
    arrayOfq154[0] = new q(40, 47);
    arrayOfq154[1] = new q(7, 48);
    arrayOfr39[1] = new r(28, arrayOfq154);
    q[] arrayOfq155 = new q[2];
    arrayOfq155[0] = new q(43, 24);
    arrayOfq155[1] = new q(22, 25);
    arrayOfr39[2] = new r(30, arrayOfq155);
    q[] arrayOfq156 = new q[2];
    arrayOfq156[0] = new q(10, 15);
    arrayOfq156[1] = new q(67, 16);
    arrayOfr39[3] = new r(30, arrayOfq156);
    arrayOfp[38] = new p(39, arrayOfInt39, arrayOfr39);
    int[] arrayOfInt40 = { 6, 30, 58, 86, 114, 142, 170 };
    r[] arrayOfr40 = new r[4];
    q[] arrayOfq157 = new q[2];
    arrayOfq157[0] = new q(19, 118);
    arrayOfq157[1] = new q(6, 119);
    arrayOfr40[0] = new r(30, arrayOfq157);
    q[] arrayOfq158 = new q[2];
    arrayOfq158[0] = new q(18, 47);
    arrayOfq158[1] = new q(31, 48);
    arrayOfr40[1] = new r(28, arrayOfq158);
    q[] arrayOfq159 = new q[2];
    arrayOfq159[0] = new q(34, 24);
    arrayOfq159[1] = new q(34, 25);
    arrayOfr40[2] = new r(30, arrayOfq159);
    q[] arrayOfq160 = new q[2];
    arrayOfq160[0] = new q(20, 15);
    arrayOfq160[1] = new q(61, 16);
    arrayOfr40[3] = new r(30, arrayOfq160);
    arrayOfp[39] = new p(40, arrayOfInt40, arrayOfr40);
    return arrayOfp;
  }

  public final int a()
  {
    return this.c;
  }

  public final r a(ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    return this.e[paramErrorCorrectionLevel.ordinal()];
  }

  public final int[] b()
  {
    return this.d;
  }

  public final int c()
  {
    return this.f;
  }

  public final int d()
  {
    return 17 + 4 * this.c;
  }

  final b e()
  {
    int i = d();
    b localb = new b(i);
    localb.a(0, 0, 9, 9);
    localb.a(i - 8, 0, 8, 9);
    localb.a(0, i - 8, 9, 8);
    int j = this.d.length;
    for (int k = 0; k < j; k++)
    {
      int m = -2 + this.d[k];
      for (int n = 0; n < j; n++)
      {
        if (((k == 0) && ((n == 0) || (n == j - 1))) || ((k == j - 1) && (n == 0)))
          continue;
        localb.a(-2 + this.d[n], m, 5, 5);
      }
    }
    localb.a(6, 9, 1, i - 17);
    localb.a(9, 6, i - 17, 1);
    if (this.c > 6)
    {
      localb.a(i - 11, 0, 3, 6);
      localb.a(0, i - 11, 6, 3);
    }
    return localb;
  }

  public final String toString()
  {
    return String.valueOf(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.p
 * JD-Core Version:    0.6.0
 */