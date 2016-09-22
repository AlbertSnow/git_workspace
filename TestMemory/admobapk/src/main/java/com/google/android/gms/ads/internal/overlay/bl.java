package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@a
@TargetApi(14)
public final class bl extends Thread
  implements SurfaceTexture.OnFrameAvailableListener, bk
{
  private static final float[] a = { -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F };
  private volatile boolean A;
  private volatile boolean B;
  private final bi b;
  private final float[] c;
  private final float[] d;
  private final float[] e;
  private final float[] f;
  private final float[] g;
  private final float[] h;
  private final float[] i;
  private float j;
  private float k;
  private float l;
  private int m;
  private int n;
  private SurfaceTexture o;
  private SurfaceTexture p;
  private int q;
  private int r;
  private int s;
  private FloatBuffer t = ByteBuffer.allocateDirect(a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
  private final CountDownLatch u;
  private final Object v;
  private EGL10 w;
  private EGLDisplay x;
  private EGLContext y;
  private EGLSurface z;

  bl(Context paramContext)
  {
    super("SphericalVideoProcessor");
    this.t.put(a).position(0);
    this.c = new float[9];
    this.d = new float[9];
    this.e = new float[9];
    this.f = new float[9];
    this.g = new float[9];
    this.h = new float[9];
    this.i = new float[9];
    this.j = (0.0F / 0.0F);
    this.b = new bi(paramContext);
    this.b.c = this;
    this.u = new CountDownLatch(1);
    this.v = new Object();
  }

  private final int a(int paramInt, String paramString)
  {
    int i1 = GLES20.glCreateShader(paramInt);
    a("createShader");
    if (i1 != 0)
    {
      GLES20.glShaderSource(i1, paramString);
      a("shaderSource");
      GLES20.glCompileShader(i1);
      a("compileShader");
      int[] arrayOfInt = new int[1];
      GLES20.glGetShaderiv(i1, 35713, arrayOfInt, 0);
      a("getShaderiv");
      if (arrayOfInt[0] == 0)
      {
        Log.e("SphericalVideoRenderer", 37 + "Could not compile shader " + paramInt + ":");
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(i1));
        GLES20.glDeleteShader(i1);
        a("deleteShader");
        return 0;
      }
    }
    return i1;
  }

  private static void a(String paramString)
  {
    int i1 = GLES20.glGetError();
    if (i1 != 0)
      Log.e("SphericalVideoRenderer", 21 + String.valueOf(paramString).length() + paramString + ": glError " + i1);
  }

  private static void a(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = 1.0F;
    paramArrayOfFloat[1] = 0.0F;
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = 0.0F;
    paramArrayOfFloat[4] = (float)Math.cos(paramFloat);
    paramArrayOfFloat[5] = (float)(-Math.sin(paramFloat));
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = (float)Math.sin(paramFloat);
    paramArrayOfFloat[8] = (float)Math.cos(paramFloat);
  }

  private static void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[1] * paramArrayOfFloat3[3] + paramArrayOfFloat2[2] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[1] + paramArrayOfFloat2[1] * paramArrayOfFloat3[4] + paramArrayOfFloat2[2] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[2] + paramArrayOfFloat2[1] * paramArrayOfFloat3[5] + paramArrayOfFloat2[2] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[3] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[3] + paramArrayOfFloat2[5] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[4] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[1] + paramArrayOfFloat2[4] * paramArrayOfFloat3[4] + paramArrayOfFloat2[5] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[5] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[2] + paramArrayOfFloat2[4] * paramArrayOfFloat3[5] + paramArrayOfFloat2[5] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[6] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[0] + paramArrayOfFloat2[7] * paramArrayOfFloat3[3] + paramArrayOfFloat2[8] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[7] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[7] * paramArrayOfFloat3[4] + paramArrayOfFloat2[8] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[8] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[2] + paramArrayOfFloat2[7] * paramArrayOfFloat3[5] + paramArrayOfFloat2[8] * paramArrayOfFloat3[8]);
  }

  private static void b(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = (float)Math.cos(paramFloat);
    paramArrayOfFloat[1] = (float)(-Math.sin(paramFloat));
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = (float)Math.sin(paramFloat);
    paramArrayOfFloat[4] = (float)Math.cos(paramFloat);
    paramArrayOfFloat[5] = 0.0F;
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = 0.0F;
    paramArrayOfFloat[8] = 1.0F;
  }

  private void d()
  {
    while (this.s > 0)
    {
      this.o.updateTexImage();
      this.s = (-1 + this.s);
    }
    if (this.b.a(this.c))
    {
      if (Float.isNaN(this.j))
      {
        float[] arrayOfFloat1 = this.c;
        float[] arrayOfFloat2 = { 0.0F, 1.0F, 0.0F };
        float[] arrayOfFloat3 = new float[3];
        arrayOfFloat3[0] = (arrayOfFloat1[0] * arrayOfFloat2[0] + arrayOfFloat1[1] * arrayOfFloat2[1] + arrayOfFloat1[2] * arrayOfFloat2[2]);
        arrayOfFloat3[1] = (arrayOfFloat1[3] * arrayOfFloat2[0] + arrayOfFloat1[4] * arrayOfFloat2[1] + arrayOfFloat1[5] * arrayOfFloat2[2]);
        arrayOfFloat3[2] = (arrayOfFloat1[6] * arrayOfFloat2[0] + arrayOfFloat1[7] * arrayOfFloat2[1] + arrayOfFloat1[8] * arrayOfFloat2[2]);
        this.j = (-((float)Math.atan2(arrayOfFloat3[1], arrayOfFloat3[0]) - 1.570796F));
      }
      b(this.h, this.j + this.k);
    }
    while (true)
    {
      a(this.d, 1.570796F);
      a(this.e, this.h, this.d);
      a(this.f, this.c, this.e);
      a(this.g, this.l);
      a(this.i, this.g, this.f);
      GLES20.glUniformMatrix3fv(this.r, 1, false, this.i, 0);
      GLES20.glDrawArrays(5, 0, 4);
      a("drawArrays");
      GLES20.glFinish();
      this.w.eglSwapBuffers(this.x, this.z);
      return;
      a(this.c, -1.570796F);
      b(this.h, this.k);
    }
  }

  private boolean e()
  {
    EGLSurface localEGLSurface1 = this.z;
    boolean bool = false;
    if (localEGLSurface1 != null)
    {
      EGLSurface localEGLSurface2 = this.z;
      EGLSurface localEGLSurface3 = EGL10.EGL_NO_SURFACE;
      bool = false;
      if (localEGLSurface2 != localEGLSurface3)
      {
        bool = false | this.w.eglMakeCurrent(this.x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | this.w.eglDestroySurface(this.x, this.z);
        this.z = null;
      }
    }
    if (this.y != null)
    {
      bool |= this.w.eglDestroyContext(this.x, this.y);
      this.y = null;
    }
    if (this.x != null)
    {
      bool |= this.w.eglTerminate(this.x);
      this.x = null;
    }
    return bool;
  }

  public final void a()
  {
    synchronized (this.v)
    {
      this.v.notifyAll();
      return;
    }
  }

  final void a(float paramFloat1, float paramFloat2)
  {
    float f1;
    float f2;
    if (this.n > this.m)
    {
      f1 = 1.745329F * paramFloat1 / this.n;
      f2 = 1.745329F * paramFloat2 / this.n;
    }
    while (true)
    {
      this.k -= f1;
      this.l -= f2;
      if (this.l < -1.570796F)
        this.l = -1.570796F;
      if (this.l > 1.570796F)
        this.l = 1.570796F;
      return;
      f1 = 1.745329F * paramFloat1 / this.m;
      f2 = 1.745329F * paramFloat2 / this.m;
    }
  }

  final void a(int paramInt1, int paramInt2)
  {
    synchronized (this.v)
    {
      this.n = paramInt1;
      this.m = paramInt2;
      this.A = true;
      this.v.notifyAll();
      return;
    }
  }

  final void a(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.n = paramInt1;
    this.m = paramInt2;
    this.p = paramSurfaceTexture;
  }

  final void b()
  {
    synchronized (this.v)
    {
      this.B = true;
      this.p = null;
      this.v.notifyAll();
      return;
    }
  }

  public final SurfaceTexture c()
  {
    if (this.p == null)
      return null;
    try
    {
      this.u.await();
      label16: return this.o;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label16;
    }
  }

  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    this.s = (1 + this.s);
    synchronized (this.v)
    {
      this.v.notifyAll();
      return;
    }
  }

  public final void run()
  {
    if (this.p == null)
    {
      c.c("SphericalVideoProcessor started with no output texture.");
      this.u.countDown();
      return;
    }
    this.w = ((EGL10)EGLContext.getEGL());
    this.x = this.w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    int i1;
    String str1;
    label89: int i2;
    int i4;
    label108: int i6;
    int i7;
    label363: String str3;
    if (this.x == EGL10.EGL_NO_DISPLAY)
    {
      i1 = 0;
      d locald1 = m.W;
      if (((String)locald1.a()).equals(locald1.b))
        break label755;
      str1 = (String)locald1.a();
      i2 = a(35633, str1);
      if (i2 != 0)
        break label763;
      i4 = 0;
      this.q = i4;
      GLES20.glUseProgram(this.q);
      a("useProgram");
      int i5 = GLES20.glGetAttribLocation(this.q, "aPosition");
      GLES20.glVertexAttribPointer(i5, 3, 5126, false, 12, this.t);
      a("vertexAttribPointer");
      GLES20.glEnableVertexAttribArray(i5);
      a("enableVertexAttribArray");
      int[] arrayOfInt2 = new int[1];
      GLES20.glGenTextures(1, arrayOfInt2, 0);
      a("genTextures");
      i6 = arrayOfInt2[0];
      GLES20.glBindTexture(36197, i6);
      a("bindTextures");
      GLES20.glTexParameteri(36197, 10240, 9729);
      a("texParameteri");
      GLES20.glTexParameteri(36197, 10241, 9729);
      a("texParameteri");
      GLES20.glTexParameteri(36197, 10242, 33071);
      a("texParameteri");
      GLES20.glTexParameteri(36197, 10243, 33071);
      a("texParameteri");
      this.r = GLES20.glGetUniformLocation(this.q, "uVMat");
      float[] arrayOfFloat = { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
      GLES20.glUniformMatrix3fv(this.r, 1, false, arrayOfFloat, 0);
      if (this.q == 0)
        break label961;
      i7 = 1;
      if ((i1 != 0) && (i7 != 0))
        break label982;
      str3 = String.valueOf(GLUtils.getEGLErrorString(this.w.eglGetError()));
      if (str3.length() == 0)
        break label967;
    }
    label827: label961: label967: for (String str4 = "EGL initialization failed: ".concat(str3); ; str4 = new String("EGL initialization failed: "))
    {
      c.c(str4);
      bc.a().h.a(new Throwable(str4), true);
      e();
      this.u.countDown();
      return;
      int[] arrayOfInt1 = new int[2];
      if (!this.w.eglInitialize(this.x, arrayOfInt1))
      {
        i1 = 0;
        break;
      }
      int[] arrayOfInt4 = new int[1];
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
      int[] arrayOfInt5 = { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344 };
      if ((this.w.eglChooseConfig(this.x, arrayOfInt5, arrayOfEGLConfig, 1, arrayOfInt4)) && (arrayOfInt4[0] > 0));
      for (EGLConfig localEGLConfig = arrayOfEGLConfig[0]; ; localEGLConfig = null)
      {
        if (localEGLConfig != null)
          break label604;
        i1 = 0;
        break;
      }
      label604: int[] arrayOfInt6 = { 12440, 2, 12344 };
      this.y = this.w.eglCreateContext(this.x, localEGLConfig, EGL10.EGL_NO_CONTEXT, arrayOfInt6);
      if ((this.y == null) || (this.y == EGL10.EGL_NO_CONTEXT))
      {
        i1 = 0;
        break;
      }
      this.z = this.w.eglCreateWindowSurface(this.x, localEGLConfig, this.p, null);
      if ((this.z == null) || (this.z == EGL10.EGL_NO_SURFACE))
      {
        i1 = 0;
        break;
      }
      if (!this.w.eglMakeCurrent(this.x, this.z, this.z, this.y))
      {
        i1 = 0;
        break;
      }
      i1 = 1;
      break;
      label755: str1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
      break label89;
      label763: d locald2 = m.X;
      if (!((String)locald2.a()).equals(locald2.b));
      int i3;
      for (String str2 = (String)locald2.a(); ; str2 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}")
      {
        i3 = a(35632, str2);
        if (i3 != 0)
          break label827;
        i4 = 0;
        break;
      }
      i4 = GLES20.glCreateProgram();
      a("createProgram");
      if (i4 == 0)
        break label108;
      GLES20.glAttachShader(i4, i2);
      a("attachShader");
      GLES20.glAttachShader(i4, i3);
      a("attachShader");
      GLES20.glLinkProgram(i4);
      a("linkProgram");
      int[] arrayOfInt3 = new int[1];
      GLES20.glGetProgramiv(i4, 35714, arrayOfInt3, 0);
      a("getProgramiv");
      if (arrayOfInt3[0] != 1)
      {
        Log.e("SphericalVideoRenderer", "Could not link program: ");
        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(i4));
        GLES20.glDeleteProgram(i4);
        a("deleteProgram");
        i4 = 0;
        break label108;
      }
      GLES20.glValidateProgram(i4);
      a("validateProgram");
      break label108;
      i7 = 0;
      break label363;
    }
    label982: this.o = new SurfaceTexture(i6);
    this.o.setOnFrameAvailableListener(this);
    this.u.countDown();
    bi localbi = this.b;
    Sensor localSensor;
    if (localbi.b == null)
    {
      localSensor = localbi.a.getDefaultSensor(11);
      if (localSensor != null)
        break label1213;
      c.c("No Sensor of TYPE_ROTATION_VECTOR");
    }
    try
    {
      this.A = true;
      label1052: if (!this.B)
      {
        d();
        int i8;
        int i9;
        if (this.A)
        {
          GLES20.glViewport(0, 0, this.n, this.m);
          a("viewport");
          i8 = GLES20.glGetUniformLocation(this.q, "uFOVx");
          i9 = GLES20.glGetUniformLocation(this.q, "uFOVy");
          if (this.n <= this.m)
            break label1282;
          GLES20.glUniform1f(i8, 0.8726646F);
          GLES20.glUniform1f(i9, 0.8726646F * this.m / this.n);
        }
        while (true)
        {
          this.A = false;
          try
          {
            synchronized (this.v)
            {
              if ((!this.B) && (!this.A) && (this.s == 0))
                this.v.wait();
            }
          }
          catch (InterruptedException localInterruptedException)
          {
          }
          break label1052;
          label1213: HandlerThread localHandlerThread = new HandlerThread("OrientationMonitor");
          localHandlerThread.start();
          localbi.b = new Handler(localHandlerThread.getLooper());
          if (localbi.a.registerListener(localbi, localSensor, 0, localbi.b))
            break;
          c.c("SensorManager.registerListener failed.");
          localbi.a();
          break;
          GLES20.glUniform1f(i8, 0.8726646F * this.n / this.m);
          GLES20.glUniform1f(i9, 0.8726646F);
        }
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      c.e("SphericalVideoProcessor halted unexpectedly.");
      return;
      return;
    }
    catch (Throwable localThrowable)
    {
      label1282: c.b("SphericalVideoProcessor died.", localThrowable);
      bc.a().h.a(localThrowable, true);
      return;
    }
    finally
    {
      this.b.a();
      this.o.setOnFrameAvailableListener(null);
      this.o = null;
      e();
    }
    throw localObject1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.bl
 * JD-Core Version:    0.6.0
 */