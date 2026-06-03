package com.tomas.tasks.classes.classesTask5;

import com.tomas.tasks.TaskProcessor;

public class ClassesTask5 implements TaskProcessor {
	@Override
	public void run(){
		Gadget gadget = new Gadget("XPhone" , "Anna");
		Gadget.Owner owner = gadget.new Owner();

		Notifier notify = new Notifier() {
			@Override
			public String notifyUser(String user){
				return "Notify " + user;
			}
		};

		System.out.println(new Gadget.Specs().load());
		System.out.println(owner.getOwnership());
		System.out.println(gadget.show());
		System.out.println(notify.notifyUser(gadget.user));
	}
}
