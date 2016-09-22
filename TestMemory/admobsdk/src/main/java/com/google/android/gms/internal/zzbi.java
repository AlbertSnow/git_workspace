package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

@zzhb
public class zzbi
{
  public static int zzx(String paramString)
  {
    byte[] arrayOfByte = null;
    try
    {
      arrayOfByte = paramString.getBytes("UTF-8");
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      arrayOfByte = paramString.getBytes();
    }
    return zznd.zza(arrayOfByte, 0, arrayOfByte.length, 0);
  }

  static boolean zzi(int paramInt)
  {
    if (Character.isLetter(paramInt))
    {
      Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.of(paramInt);
      if ((zza(localUnicodeBlock)) || (zzj(paramInt)))
        return true;
    }
    return false;
  }

  public static String[] zzy(String paramString)
  {
    if (paramString == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar = paramString.toCharArray();
    int i = paramString.length();
    int j = 0;
    int k = 0;
    int m = 0;
    while (j < i)
    {
      int n = Character.codePointAt(arrayOfChar, j);
      int i1 = Character.charCount(n);
      if (zzi(n))
      {
        if (m != 0)
          localArrayList.add(new String(arrayOfChar, k, j - k));
        localArrayList.add(new String(arrayOfChar, j, i1));
        m = 0;
      }
      else if ((Character.isLetterOrDigit(n)) || (Character.getType(n) == 6) || (Character.getType(n) == 8))
      {
        if (m == 0)
          k = j;
        m = 1;
      }
      else if (m != 0)
      {
        localArrayList.add(new String(arrayOfChar, k, j - k));
        m = 0;
      }
      j += i1;
    }
    if (m != 0)
      localArrayList.add(new String(arrayOfChar, k, j - k));
    String[] arrayOfString = new String[localArrayList.size()];
    return (String[])localArrayList.toArray(arrayOfString);
  }

  private static boolean zzj(int paramInt)
  {
    return ((paramInt >= 65382) && (paramInt <= 65437)) || ((paramInt >= 65441) && (paramInt <= 65500));
  }

  private static boolean zza(Character.UnicodeBlock paramUnicodeBlock)
  {
    return (paramUnicodeBlock == Character.UnicodeBlock.BOPOMOFO) || (paramUnicodeBlock == Character.UnicodeBlock.BOPOMOFO_EXTENDED) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || (paramUnicodeBlock == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || (paramUnicodeBlock == Character.UnicodeBlock.HANGUL_JAMO) || (paramUnicodeBlock == Character.UnicodeBlock.HANGUL_SYLLABLES) || (paramUnicodeBlock == Character.UnicodeBlock.HIRAGANA) || (paramUnicodeBlock == Character.UnicodeBlock.KATAKANA) || (paramUnicodeBlock == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbi
 * JD-Core Version:    0.6.0
 */