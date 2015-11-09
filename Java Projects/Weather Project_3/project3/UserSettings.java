package project3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import station.Station;
import station.StationInfo;
import data.DataInfo;

/**
 * This class provides the menu to the user, looks for valid input, throws a UserInputException if the input is invalid.  If
 * the input is all valid, it saves the settings for the rest of the program.
 * 
 * @author amy
 *
 */
public class UserSettings {
	private String stationName, variable;
	private boolean loadAllStations;
	
	public UserSettings(HashMap<String, Station> stationMap, HashMap<String, DataInfo> dataMap) {
	}

	/**
	 * Prints all the menus and parses the answers
	 */
	private void getUserInput(HashMap<String, Station> stationMap, HashMap<String, DataInfo> dataMap) {
	}

	/**
	 * Verify that the location answer is a valid key (ignore case)
	 * @param stationMap
	 * @return
	 * @throws UserInputException 
	 */
	private void getLocationAnswer(HashMap<String, Station> stationMap) throws UserInputException {
	}

	/**
	 * Print out the location choice menu for the user.  Made into a function
	 * so we can call it any time the user makes an error.
	 */
	private void printLocationMenu(HashMap<String, Station> stationMap) {
	}
	
	/**
	 * Print out the location choice menu for the user.  Made into a function
	 * so we can call it any time the user makes an error.
	 */
	private void printVariableMenu(HashMap<String, DataInfo> dataMap) {
	}
	
	
	/**
	 * Verify that the variable answer is a valid key (ignore case)
	 * @param stationMap
	 * @return
	 * @throws UserInputException 
	 */
	private void getVariableAnswer(HashMap<String, DataInfo> dataMap) throws UserInputException {
	}

	public String getStationName() {
	}

	public String getVariable() {
	}

	public boolean isLoadAllStations() {
	}

	

	
}
