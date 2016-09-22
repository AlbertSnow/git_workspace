import android.util.SparseArray;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;

final class akv extends Thread
{
  final AtomicBoolean a = new AtomicBoolean();
  private final ReferenceQueue b;
  private final SparseArray c;

  public akv(ReferenceQueue paramReferenceQueue, SparseArray paramSparseArray)
  {
    super("GoogleApiCleanup");
    this.b = paramReferenceQueue;
    this.c = paramSparseArray;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	akv:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: iconst_1
    //   5: invokevirtual 35	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   8: bipush 10
    //   10: invokestatic 41	android/os/Process:setThreadPriority	(I)V
    //   13: aload_0
    //   14: getfield 24	akv:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   17: invokevirtual 45	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   20: ifeq +63 -> 83
    //   23: aload_0
    //   24: getfield 26	akv:b	Ljava/lang/ref/ReferenceQueue;
    //   27: invokevirtual 51	java/lang/ref/ReferenceQueue:remove	()Ljava/lang/ref/Reference;
    //   30: checkcast 53	aku
    //   33: astore_3
    //   34: aload_0
    //   35: getfield 28	akv:c	Landroid/util/SparseArray;
    //   38: aload_3
    //   39: getfield 56	aku:a	I
    //   42: invokevirtual 60	android/util/SparseArray:remove	(I)V
    //   45: aload_3
    //   46: getfield 63	aku:b	Lakt;
    //   49: pop
    //   50: aload_3
    //   51: getfield 63	aku:b	Lakt;
    //   54: pop
    //   55: aconst_null
    //   56: aconst_null
    //   57: iconst_2
    //   58: aload_3
    //   59: getfield 56	aku:a	I
    //   62: iconst_2
    //   63: invokevirtual 69	android/os/Handler:obtainMessage	(III)Landroid/os/Message;
    //   66: invokevirtual 73	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   69: pop
    //   70: goto -57 -> 13
    //   73: astore_2
    //   74: aload_0
    //   75: getfield 24	akv:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   78: iconst_0
    //   79: invokevirtual 35	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   82: return
    //   83: aload_0
    //   84: getfield 24	akv:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   87: iconst_0
    //   88: invokevirtual 35	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   91: return
    //   92: astore_1
    //   93: aload_0
    //   94: getfield 24	akv:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   97: iconst_0
    //   98: invokevirtual 35	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   101: aload_1
    //   102: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   13	70	73	java/lang/InterruptedException
    //   13	70	92	finally
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akv
 * JD-Core Version:    0.6.0
 */