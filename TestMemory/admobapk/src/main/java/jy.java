class jy
{
  public static final int A;
  public static final int B;
  public static final int C;
  public static final int D;
  public static final int E;
  public static final int F;
  public static final int G;
  public static final int H;
  public static final int I;
  public static final int J;
  public static final int K;
  public static final int L;
  public static final int a;
  public static final int b;
  public static final int c;
  public static final int d;
  public static final int e;
  public static final int f;
  public static final int g;
  public static final int h;
  public static final int i;
  public static final int j;
  public static final int k;
  public static final int l;
  public static final int m;
  public static final int n;
  public static final int o;
  public static final int p;
  public static final int q;
  public static final int r;
  public static final int s;
  public static final int t;
  public static final int u;
  public static final int v;
  public static final int w;
  public static final int x;
  public static final int y;
  public static final int z;
  public final int M;

  static
  {
    ly.c("ftyp");
    a = ly.c("avc1");
    b = ly.c("avc3");
    c = ly.c("esds");
    ly.c("mdat");
    d = ly.c("mp4a");
    e = ly.c("ac-3");
    f = ly.c("dac3");
    g = ly.c("ec-3");
    h = ly.c("dec3");
    ly.c("tfdt");
    ly.c("tfhd");
    ly.c("trex");
    ly.c("trun");
    ly.c("sidx");
    i = ly.c("moov");
    j = ly.c("mvhd");
    k = ly.c("trak");
    l = ly.c("mdia");
    m = ly.c("minf");
    n = ly.c("stbl");
    o = ly.c("avcC");
    ly.c("moof");
    ly.c("traf");
    ly.c("mvex");
    p = ly.c("tkhd");
    q = ly.c("mdhd");
    r = ly.c("hdlr");
    s = ly.c("stsd");
    ly.c("pssh");
    t = ly.c("sinf");
    u = ly.c("schm");
    v = ly.c("schi");
    w = ly.c("tenc");
    x = ly.c("encv");
    y = ly.c("enca");
    z = ly.c("frma");
    ly.c("saiz");
    ly.c("uuid");
    ly.c("senc");
    A = ly.c("pasp");
    B = ly.c("TTML");
    C = ly.c("vmhd");
    D = ly.c("smhd");
    E = ly.c("mp4v");
    F = ly.c("stts");
    G = ly.c("stss");
    H = ly.c("ctts");
    I = ly.c("stsc");
    J = ly.c("stsz");
    K = ly.c("stco");
    L = ly.c("co64");
  }

  jy(int paramInt)
  {
    this.M = paramInt;
  }

  public static int a(int paramInt)
  {
    return 0xFF & paramInt >> 24;
  }

  public static String b(int paramInt)
  {
    char c1 = (char)(paramInt >> 24);
    char c2 = (char)(0xFF & paramInt >> 16);
    char c3 = (char)(0xFF & paramInt >> 8);
    char c4 = (char)(paramInt & 0xFF);
    return 4 + c1 + c2 + c3 + c4;
  }

  public String toString()
  {
    return b(this.M);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jy
 * JD-Core Version:    0.6.0
 */