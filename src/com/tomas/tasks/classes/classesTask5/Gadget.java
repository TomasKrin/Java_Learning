package com.tomas.tasks.classes.classesTask5;

public class Gadget {
	String model;
	String user;

	Gadget(String model , String user){
		this.model = model;
		this.user = user;
	}

	String show(){
		class Label {
			String getLabel(){
				return "Model: " + model;
			}
		}

		return new Label().getLabel();
	}

	static class Specs {
		String load(){
			return "Specs loaded";
		}
	}

	class Owner {
		String getOwnership(){
			return "Owner: " + user;
		}
	}
}
