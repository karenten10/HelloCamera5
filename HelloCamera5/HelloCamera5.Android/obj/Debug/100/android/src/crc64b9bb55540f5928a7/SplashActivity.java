package crc64b9bb55540f5928a7;


public class SplashActivity
	extends androidx.appcompat.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("HelloCamera5.Droid.SplashActivity, HelloCamera5.Android", SplashActivity.class, __md_methods);
	}


	public SplashActivity ()
	{
		super ();
		if (getClass () == SplashActivity.class)
			mono.android.TypeManager.Activate ("HelloCamera5.Droid.SplashActivity, HelloCamera5.Android", "", this, new java.lang.Object[] {  });
	}


	public SplashActivity (int p0)
	{
		super (p0);
		if (getClass () == SplashActivity.class)
			mono.android.TypeManager.Activate ("HelloCamera5.Droid.SplashActivity, HelloCamera5.Android", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
