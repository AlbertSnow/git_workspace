import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import com.google.android.ads.tasks.a;
import com.google.android.ads.tasks.b;
import com.google.android.ads.tasks.c;
import com.google.android.ads.tasks.f;
import com.google.android.ads.tasks.g;
import com.google.android.ads.tasks.h;
import com.google.android.ads.tasks.j;
import com.google.android.ads.tasks.l;
import com.google.android.ads.tasks.n;
import com.google.android.ads.tasks.o;
import com.google.android.gms.ads.internal.bc;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class gy extends gw
{
  private static final String i = gy.class.getSimpleName();
  private static Method k;
  private static long m = 0L;
  private static boolean n = false;
  private static volatile hf o = null;
  private static Object p = new Object();
  public boolean j = false;
  private String l;

  protected gy(Context paramContext, String paramString)
  {
    super(paramContext);
    this.l = paramString;
    this.j = false;
  }

  protected gy(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    this.l = paramString;
    this.j = paramBoolean;
  }

  private static List a(hf paramhf, MotionEvent paramMotionEvent, DisplayMetrics paramDisplayMetrics)
  {
    Method localMethod = paramhf.a("7scYqzyHRPBaZWFKJ3pOWHbR6Dbo5le4dynIUtP3L7pYFHAqNzdBRQatrNTDhiks", "vVlHDsOifDC8W64bgexaMgYAPimhsdV/psSFMo/Evqg=");
    k = localMethod;
    if ((localMethod == null) || (paramMotionEvent == null))
      throw new he();
    try
    {
      ArrayList localArrayList = (ArrayList)k.invoke(null, new Object[] { paramMotionEvent, paramDisplayMetrics });
      return localArrayList;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new he(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new he(localInvocationTargetException);
  }

  protected static void a(Context paramContext, boolean paramBoolean)
  {
    monitorenter;
    try
    {
      if (!n)
      {
        m = Calendar.getInstance().getTime().getTime() / 1000L;
        o = b(paramContext, paramBoolean);
        n = true;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  protected static void a(List paramList)
  {
    if (o == null);
    ExecutorService localExecutorService;
    do
    {
      return;
      localExecutorService = o.b;
    }
    while ((localExecutorService == null) || (paramList.isEmpty()));
    try
    {
      com.google.android.gms.ads.internal.config.d locald = com.google.android.gms.ads.internal.config.m.al;
      localExecutorService.invokeAll(paramList, ((Long)bc.a().n.a(locald)).longValue(), TimeUnit.MILLISECONDS);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      String str = i;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = hi.a(localInterruptedException);
      Log.d(str, String.format("class methods got exception: %s", arrayOfObject));
    }
  }

  private static hf b(Context paramContext, boolean paramBoolean)
  {
    if (o == null);
    synchronized (p)
    {
      if (o == null)
      {
        hf localhf = hf.a(paramContext, "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", paramBoolean);
        List localList = Collections.singletonList(Context.class);
        localhf.a("FpxkL8T4+4KvQMD9i+2pSkm0iSIrm7YPofeiNCCHrFTofQNLiBOBNdZP5Pz5i3jB", "WFZF3SqWUN2v06LedHaqBGrhE85rZge34n+mPFIupKU=", localList);
        localhf.a("lLpTIaE60qRmDJilKTnB6dMslmEDCMG+aJ7xPwxeE01HtxatTPhAFeGxL2EFpKqq", "LwAyv7R7EEW6/T7p6KlsghmfaITLnkCV2ffewHyZJ4E=", localList);
        localhf.a("WDNcg/qrUvZ/arv3KlIpjTJy2PLrL5zJRy6RhtE1BwGO7yUZTah8sIwGKrLNQxBR", "k1O5CScpibVjQ/AkqNOTz2L1NxiUwSDOHHe20mOBuZE=", localList);
        localhf.a("0ghH/t1vDAhJsMBEq6AmO4wSmIDUPcR/Ca+bXIPvotbCa7WG11X2GY3bGGSFRSWI", "UxLcO2gMVJYxcPCRIA0oswQMYaa0vipadHgqkbOQas0=", localList);
        localhf.a("keK3XK0wK2UU/nLysKwyCf+kkLkTOC2vAbYqwrBu7R43EUtKstTw0Ncacr5N836s", "waGnxH9bEhira4fPRFV2xqpjD0WpWaSdKy82IuNFwdk=", localList);
        localhf.a("L05xKnfnYeHbEBu8dBVHLX06/lqdQ3wjnf1MDhbz8UyVOSERj3ew9tHuZCsFIQLQ", "alpbMH9e2rlIOT//YFdQTXyhxLWZXiidj7upE61JEUs=", localList);
        localhf.a("DlgHLXqDLqm1GFukOQGzXSwndUeIXE36A5gg71kBD49NoHWHGWFjde/o+K/rzyX6", "rvMoYpysLXzhZ6Icu/Rx+8e3b8bA+ziXoZXmih9N3OA=", localList);
        localhf.a("fBtIGCHte1o+4DEJXJKmN8amPgr7INw+5aLJWfquR6onmnM2N4yyUIpZKWlQd2MT", "UbZQKWrvtEsWMuqKUZ59vHKULlKuI6WSXmDlyXvVcPA=", localList);
        localhf.a("8XC+T5ZJmGqLgq9bGckp9QpSek/MdZkWG8J7h0S/jQT+nLtpFloYeQEp8BYxEnxS", "ybUDDh+rxXFJD95YxLPryhWUtCqqCbMTY7q0vd/SZrg=", localList);
        localhf.a("7scYqzyHRPBaZWFKJ3pOWHbR6Dbo5le4dynIUtP3L7pYFHAqNzdBRQatrNTDhiks", "vVlHDsOifDC8W64bgexaMgYAPimhsdV/psSFMo/Evqg=", Arrays.asList(new Class[] { MotionEvent.class, DisplayMetrics.class }));
        localhf.a("L5suOEkl11eDXKBlerzt5uhrXmMUgM/zg/0p0sGGN2whxBlK6x9tQhm9iwezF+oF", "LKckwzQJypLfshE2gWJ2grGramB5zEfM8v/nJLs8qn0=", Collections.emptyList());
        localhf.a("6p7iCXfSUdPVZxKIMLb6kQ6w4NNjoD9lvLRgWpY6QIdh4oP6AFLdVKBHQR56jQnq", "am+Emx+Il9MpMu9RJG55dNiUlw7VvmwKoBU1NE91gtY=", Collections.emptyList());
        localhf.a("BOJ3tjkSPl7I5QAxVTrljV+nhFJcIx2Q/kO7zmVvITuSUJHDxQAfVy/jOA0v9pYs", "zDiqPrOORPXZIrDdW7RtGAel/ckCjtoUBGAnfbt1Dbs=", Collections.emptyList());
        localhf.a("gK2idbBMZeT4po0Euq26hpNJPtYADahIoduvc+9lPfaj98i6doa/I7yVE/XdPW0n", "z9ajAOx5ZNdFgTi1Ek7alAp0ZDId6vOmAD0S3qFva+s=", Collections.emptyList());
        localhf.a("58FzSXiuhwkPJhngNzopCJPRsb4QxaL4R9w88HtiTtPngj9cSA9bk253tVUsvdvn", "FSmb+R06dYXhtkSUnpYyddV7qH5CUpQhJaF+z8pCRgU=", Collections.emptyList());
        o = localhf;
      }
      return o;
    }
  }

  protected void a(hf paramhf, com.google.ads.afma.nano.d paramd)
  {
    if (paramhf.b == null)
      return;
    a(b(paramhf, paramd));
  }

  protected final com.google.ads.afma.nano.d b(Context paramContext)
  {
    com.google.ads.afma.nano.d locald = new com.google.ads.afma.nano.d();
    if (!TextUtils.isEmpty(this.l))
      locald.b = this.l;
    hf localhf = b(paramContext, this.j);
    localhf.d();
    a(localhf, locald);
    localhf.e();
    return locald;
  }

  protected List b(hf paramhf, com.google.ads.afma.nano.d paramd)
  {
    int i1 = paramhf.f();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new c(paramhf, "FpxkL8T4+4KvQMD9i+2pSkm0iSIrm7YPofeiNCCHrFTofQNLiBOBNdZP5Pz5i3jB", "WFZF3SqWUN2v06LedHaqBGrhE85rZge34n+mPFIupKU=", paramd, i1, 27));
    localArrayList.add(new h(paramhf, "L5suOEkl11eDXKBlerzt5uhrXmMUgM/zg/0p0sGGN2whxBlK6x9tQhm9iwezF+oF", "LKckwzQJypLfshE2gWJ2grGramB5zEfM8v/nJLs8qn0=", paramd, m, i1, 25));
    localArrayList.add(new com.google.android.ads.tasks.m(paramhf, "BOJ3tjkSPl7I5QAxVTrljV+nhFJcIx2Q/kO7zmVvITuSUJHDxQAfVy/jOA0v9pYs", "zDiqPrOORPXZIrDdW7RtGAel/ckCjtoUBGAnfbt1Dbs=", paramd, i1, 1));
    localArrayList.add(new n(paramhf, "0ghH/t1vDAhJsMBEq6AmO4wSmIDUPcR/Ca+bXIPvotbCa7WG11X2GY3bGGSFRSWI", "UxLcO2gMVJYxcPCRIA0oswQMYaa0vipadHgqkbOQas0=", paramd, i1, 31));
    localArrayList.add(new o(paramhf, "6p7iCXfSUdPVZxKIMLb6kQ6w4NNjoD9lvLRgWpY6QIdh4oP6AFLdVKBHQR56jQnq", "am+Emx+Il9MpMu9RJG55dNiUlw7VvmwKoBU1NE91gtY=", paramd, i1, 33));
    localArrayList.add(new b(paramhf, "WDNcg/qrUvZ/arv3KlIpjTJy2PLrL5zJRy6RhtE1BwGO7yUZTah8sIwGKrLNQxBR", "k1O5CScpibVjQ/AkqNOTz2L1NxiUwSDOHHe20mOBuZE=", paramd, i1, 29));
    localArrayList.add(new f(paramhf, "keK3XK0wK2UU/nLysKwyCf+kkLkTOC2vAbYqwrBu7R43EUtKstTw0Ncacr5N836s", "waGnxH9bEhira4fPRFV2xqpjD0WpWaSdKy82IuNFwdk=", paramd, i1, 5));
    localArrayList.add(new l(paramhf, "fBtIGCHte1o+4DEJXJKmN8amPgr7INw+5aLJWfquR6onmnM2N4yyUIpZKWlQd2MT", "UbZQKWrvtEsWMuqKUZ59vHKULlKuI6WSXmDlyXvVcPA=", paramd, i1, 12));
    localArrayList.add(new a(paramhf, "8XC+T5ZJmGqLgq9bGckp9QpSek/MdZkWG8J7h0S/jQT+nLtpFloYeQEp8BYxEnxS", "ybUDDh+rxXFJD95YxLPryhWUtCqqCbMTY7q0vd/SZrg=", paramd, i1, 3));
    localArrayList.add(new com.google.android.ads.tasks.e(paramhf, "L05xKnfnYeHbEBu8dBVHLX06/lqdQ3wjnf1MDhbz8UyVOSERj3ew9tHuZCsFIQLQ", "alpbMH9e2rlIOT//YFdQTXyhxLWZXiidj7upE61JEUs=", paramd, i1, 34));
    localArrayList.add(new com.google.android.ads.tasks.d(paramhf, "DlgHLXqDLqm1GFukOQGzXSwndUeIXE36A5gg71kBD49NoHWHGWFjde/o+K/rzyX6", "rvMoYpysLXzhZ6Icu/Rx+8e3b8bA+ziXoZXmih9N3OA=", paramd, i1, 35));
    com.google.android.gms.ads.internal.config.d locald1 = com.google.android.gms.ads.internal.config.m.an;
    if (((Boolean)bc.a().n.a(locald1)).booleanValue())
      localArrayList.add(new g(paramhf, "gK2idbBMZeT4po0Euq26hpNJPtYADahIoduvc+9lPfaj98i6doa/I7yVE/XdPW0n", "z9ajAOx5ZNdFgTi1Ek7alAp0ZDId6vOmAD0S3qFva+s=", paramd, i1, 44));
    com.google.android.gms.ads.internal.config.d locald2 = com.google.android.gms.ads.internal.config.m.ap;
    if (((Boolean)bc.a().n.a(locald2)).booleanValue())
      localArrayList.add(new com.google.android.ads.tasks.k(paramhf, "58FzSXiuhwkPJhngNzopCJPRsb4QxaL4R9w88HtiTtPngj9cSA9bk253tVUsvdvn", "FSmb+R06dYXhtkSUnpYyddV7qH5CUpQhJaF+z8pCRgU=", paramd, i1, 22));
    return localArrayList;
  }

  protected com.google.ads.afma.nano.d c(Context paramContext)
  {
    com.google.ads.afma.nano.d locald = new com.google.ads.afma.nano.d();
    if (!TextUtils.isEmpty(this.l))
      locald.b = this.l;
    hf localhf = b(paramContext, this.j);
    localhf.d();
    try
    {
      List localList2 = a(localhf, this.a, this.h);
      locald.g = ((Long)localList2.get(0));
      locald.h = ((Long)localList2.get(1));
      if (((Long)localList2.get(2)).longValue() >= 0L)
        locald.i = ((Long)localList2.get(2));
      locald.u = ((Long)localList2.get(3));
      locald.v = ((Long)localList2.get(4));
      label147: if (this.c > 0L)
        locald.y = Long.valueOf(this.c);
      if (this.d > 0L)
        locald.x = Long.valueOf(this.d);
      if (this.e > 0L)
        locald.w = Long.valueOf(this.e);
      if (this.f > 0L)
        locald.z = Long.valueOf(this.f);
      if (this.g > 0L)
        locald.B = Long.valueOf(this.g);
      try
      {
        int i2 = -1 + this.b.size();
        if (i2 > 0)
        {
          locald.C = new com.google.ads.afma.nano.e[i2];
          for (int i3 = 0; i3 < i2; i3++)
          {
            List localList1 = a(localhf, (MotionEvent)this.b.get(i3), this.h);
            com.google.ads.afma.nano.e locale = new com.google.ads.afma.nano.e();
            locale.a = ((Long)localList1.get(0));
            locale.b = ((Long)localList1.get(1));
            locald.C[i3] = locale;
          }
        }
      }
      catch (he localhe2)
      {
        locald.C = null;
        ArrayList localArrayList = new ArrayList();
        if (localhf.b != null)
        {
          int i1 = localhf.f();
          localArrayList.add(new j(localhf, locald));
          localArrayList.add(new com.google.android.ads.tasks.m(localhf, "BOJ3tjkSPl7I5QAxVTrljV+nhFJcIx2Q/kO7zmVvITuSUJHDxQAfVy/jOA0v9pYs", "zDiqPrOORPXZIrDdW7RtGAel/ckCjtoUBGAnfbt1Dbs=", locald, i1, 1));
          localArrayList.add(new h(localhf, "L5suOEkl11eDXKBlerzt5uhrXmMUgM/zg/0p0sGGN2whxBlK6x9tQhm9iwezF+oF", "LKckwzQJypLfshE2gWJ2grGramB5zEfM8v/nJLs8qn0=", locald, m, i1, 25));
          com.google.android.gms.ads.internal.config.d locald1 = com.google.android.gms.ads.internal.config.m.ao;
          if (((Boolean)bc.a().n.a(locald1)).booleanValue())
            localArrayList.add(new g(localhf, "gK2idbBMZeT4po0Euq26hpNJPtYADahIoduvc+9lPfaj98i6doa/I7yVE/XdPW0n", "z9ajAOx5ZNdFgTi1Ek7alAp0ZDId6vOmAD0S3qFva+s=", locald, i1, 44));
          localArrayList.add(new a(localhf, "8XC+T5ZJmGqLgq9bGckp9QpSek/MdZkWG8J7h0S/jQT+nLtpFloYeQEp8BYxEnxS", "ybUDDh+rxXFJD95YxLPryhWUtCqqCbMTY7q0vd/SZrg=", locald, i1, 3));
          com.google.android.gms.ads.internal.config.d locald2 = com.google.android.gms.ads.internal.config.m.aq;
          if (((Boolean)bc.a().n.a(locald2)).booleanValue())
            localArrayList.add(new com.google.android.ads.tasks.k(localhf, "58FzSXiuhwkPJhngNzopCJPRsb4QxaL4R9w88HtiTtPngj9cSA9bk253tVUsvdvn", "FSmb+R06dYXhtkSUnpYyddV7qH5CUpQhJaF+z8pCRgU=", locald, i1, 22));
        }
        a(localArrayList);
        localhf.e();
        return locald;
      }
    }
    catch (he localhe1)
    {
      break label147;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     gy
 * JD-Core Version:    0.6.0
 */