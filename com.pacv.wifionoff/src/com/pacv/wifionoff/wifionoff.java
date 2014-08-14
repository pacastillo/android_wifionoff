package com.pacv.wifionoff;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Toast;

public class wifionoff extends Activity {
    
    public wifionoff(){
    	super();
    }
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toggleWifi();
        
        finish();
        //System.exit(0);
    }
    
    public void toggleWifi() {
		WifiManager wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
		if( !wifiManager.isWifiEnabled() ){
			wifiManager.setWifiEnabled(true);
			Toast.makeText(this, "Wifi ON", Toast.LENGTH_LONG).show();
		}else{
			wifiManager.setWifiEnabled(false);
			Toast.makeText(this, "Wifi OFF", Toast.LENGTH_LONG).show();
		}
	}

    /*
	public void toggleWifi() {
		WifiManager wm = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
		boolean currentState = wm.isWifiEnabled();
		wm.setWifiEnabled(!currentState);
		
		Toast.makeText(this, "wifi", Toast.LENGTH_LONG).show();
	}
	*/
}
