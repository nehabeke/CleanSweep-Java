package com.blackdroidstudios.cleansweep.reportlog;

//Formatted output debugging and analysis 
//import com.blackdroidstudios.cleansweep.gui.Actor;
import com.blackdroidstudios.cleansweep.map.Tile;
import com.blackdroidstudios.cleansweep.map.Tile.floorType;
import com.blackdroidstudios.cleansweep.map.Tile.tileType;
import com.blackdroidstudios.cleansweep.surfacesensor.SurfaceSensor;

public class Reporter {
	
	private static Reporter instance = null;
	
	Reporter() {}
	
	int batteryCharge;
	int currentLocX;
	int currentLocY;
	int currentDirtLvl;
	floorType currentFlrType;
	
	public static Reporter getInstance(){
		if (instance == null){
			instance = new Reporter();
		}
		return instance;
	}
	
	public void setCurrentBattery(int charge)
	{
		this.batteryCharge = charge;
	}
	
	public void setCurrentLocX(int locX)
	{
		this.currentLocX = locX;
	}
	
	public void setCurrentLocY(int locY)
	{
		this.currentLocY = locY;
	}
	
	public void setCurrentDirtLvl(int dirtLvl)
	{
		this.currentDirtLvl = dirtLvl;
	}
	
	public void setCurrentFlrType(floorType flrType)
	{
		this.currentFlrType = flrType;
	}
	
	public static String report()
	{
		return ("Clean Sweep is currently at " + 
				Reporter.getInstance().currentLocX + "," + Reporter.getInstance().currentLocX +
				"\n with a battery level of: " + Reporter.getInstance().batteryCharge);

	}
}