package com.tomas.tasks.classes.classesTask5;

public interface Notifier {
	default String notifyUser(String user){
		return "Notify <user>";
	}
}
