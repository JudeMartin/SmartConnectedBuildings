package com.sjsu.edu;
/*
 * Copyright 2007 Phidgets Inc.  All rights reserved.
 */

import com.phidgets.*;
import com.phidgets.event.*;

public class OpenIFKitExample {
	public static final void main(String args[]) throws Exception {
		
		InterfaceKitPhidget ik;

		System.out.println(Phidget.getLibraryVersion());

		ik = new InterfaceKitPhidget();
		ik.addAttachListener(new AttachListener() {
			public void attached(AttachEvent ae) {
				System.out.println("attachment of " + ae);
			}
		});
		ik.addDetachListener(new DetachListener() {
			public void detached(DetachEvent ae) {
				System.out.println("detachment of " + ae);
			}
		});
		ik.addErrorListener(new ErrorListener() {
			public void error(ErrorEvent ee) {
				System.out.println(ee);
			}
		});

		ik.addSensorChangeListener(new SensorChangeListener() {
			public void sensorChanged(SensorChangeEvent se) {
				/* 0 indicates IR Sensor Value */
				if (se.getIndex() == 0) {
					System.out.println("IR SENSOR RAW Value is "
							+ se.getValue()); /* need to call adaptor for data parsing */
				}
				/* 1 indicates Touch Sensor Value */
				else if (se.getIndex() == 1) {
					System.out.println("TOUCH SENSOR RAW Value is "
							+ se.getValue()); /* need to call adaptor for data parsing */
				}
				/* 2 indicates Temperature Sensor Value */
				else if (se.getIndex() == 2) {
					System.out.println("TEMP SENSOR RAW Value is "
							+ se.getValue()); /* need to call adaptor for data parsing */
				}
				/* 3 indicates Humidity Sensor Value */
				else if (se.getIndex() == 3) {
					System.out.println("HUMIDITY SENSOR RAW Value is "
							+ se.getValue()); /* need to call adaptor for data parsing */
				}
			}
		});
		ik.openAny();
		System.out.println("waiting for InterfaceKit attachment...");
		ik.waitForAttachment();
		System.out.println(ik.getSensorRawValue(0));
		while (true);
	}
}
