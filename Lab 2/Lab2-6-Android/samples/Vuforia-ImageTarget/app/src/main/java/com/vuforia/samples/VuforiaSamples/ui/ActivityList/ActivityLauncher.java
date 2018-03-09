/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2015 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other 
countries.
===============================================================================*/


package com.vuforia.samples.VuforiaSamples.ui.ActivityList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vuforia.samples.VuforiaSamples.R;


// This activity starts activities which demonstrate the Vuforia features
public class ActivityLauncher extends ListActivity
{
    
    private String mActivities[] = { "Image Targets" };
    
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, AboutScreen.class);
        intent.putExtra("ACTIVITY_TO_LAUNCH",
                "app.ImageTargets.ImageTargets");
        intent.putExtra("ABOUT_TEXT", "ImageTargets/IT_about.html");
        startActivity(intent);
    }
}
