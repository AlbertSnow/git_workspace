package com.google.testplughost.plug;

import android.os.Process;
import android.util.Log;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import dalvik.system.DexClassLoader;

class PlugClassLoader extends DexClassLoader {
    private String mRawLibPath;
    private String[] mLibPaths;
    private final List<String> SHARE_LIBRARY_NAMES;

    public PlugClassLoader(String dexPath, String dexOutputDir, String libPath,
                           ClassLoader parent) {
    	super(dexPath,dexOutputDir,libPath, parent);
    	
        if (dexPath == null || dexOutputDir == null)
            throw new NullPointerException();
        
    	SHARE_LIBRARY_NAMES = Arrays.asList(new String[]{"libiReader_common.so", "libUiControl.so", "libiReader_icu.so", "libidentifyapp.so"});
        if(libPath!=null){
        	mRawLibPath = libPath;
        	//优先查找本地添加的lib库，然后在去系统级别的去查找
            String pathList = null;
            String systemPathList = System.getProperty("java.library.path", ".");
            String pathSep = System.getProperty("path.separator", ":");
            String fileSep = System.getProperty("file.separator", "/");

            if (mRawLibPath != null) {
                if (systemPathList.length() > 0) {
                    pathList = mRawLibPath + pathSep + systemPathList ;
                }
                else {
                    pathList = mRawLibPath;
                }
            }else{
            	pathList = systemPathList;
            }

            mLibPaths = pathList.split(pathSep);
            int length = mLibPaths.length;

            for (int i = 0; i < length; i++) {
                if (!mLibPaths[i].endsWith(fileSep))
                    mLibPaths[i] += fileSep;
            }
        }
    }

    @Override
	public String findLibrary(String libname) {
        Log.i("testClassLoader", "findLibrary: " + libname);

        String libFileName = System.mapLibraryName(libname);
        File libraryFile;
    	if (mLibPaths != null && SHARE_LIBRARY_NAMES.contains(libFileName)) {
    		for (String libString : mLibPaths) {
    			libraryFile = new File(libString, libFileName);
    			if (libraryFile.exists()) {
    				return libraryFile.getAbsolutePath();
				}
			}
    		return null;
		}else{
			return super.findLibrary(libname);
		}
    }
}

