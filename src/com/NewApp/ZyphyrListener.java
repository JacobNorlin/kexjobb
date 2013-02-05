package com.NewApp;

import android.os.Handler;
import zephyr.android.HxMBT.ConnectListenerImpl;
import zephyr.android.HxMBT.ConnectedEvent;

public class ZyphyrListener extends ConnectListenerImpl {
	
	//Packet info
	private int GP_MSG_ID = 0x20;
	private int GP_HANDLER_ID = 0x20;
	private int HR_SPD_DIST_PACKET =0x26;
	
	private final int HEART_RATE = 0x100;
	private final int INSTANT_SPEED = 0x101;
	//==
	
	private Handler zephyrHandler;

	public ZyphyrListener(Handler handler, Handler zephyrHandler) {
		super(handler, null);
		this.zephyrHandler = zephyrHandler;
	}
	
	public void Connected(ConnectedEvent<BTClient> eventArgs){
		
	}

}
