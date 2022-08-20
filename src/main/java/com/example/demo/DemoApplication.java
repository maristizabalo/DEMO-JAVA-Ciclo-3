package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		Task t1 = new Task("Recoerdear POO",true, LocalDate.of(2022,8,19));
		Task t2 = new Task("Conocer Intellij IDEA",true, LocalDate.of(2022,8,26));
		Task t3 = new Task("Conocer de Spring Boot",false, LocalDate.of(2022,9,5));
		Task t4 = new Task("Finalizando tareas...",false, LocalDate.of(2022,9,12));
		Task t5 = new Task("Clase en curso...",false, LocalDate.of(2022,8,20));

	  /*System.out.println("Descripcion de la tarea:");
		System.out.println(t1.getDescription());
		System.out.println("Fecha de la tarea");
		System.out.println(t1.getDueDate());
		System.out.println("Estado de la tarea");
		System.out.println(t1.getDone());
		System.out.println("--------------------------------");
		System.out.println("Tarea modificada");
		t1.setDescription("POO Modificado");
		System.out.println(t1.getDescription());*/

		TaskList1 metas = new TaskList1("Tareas inicales");   //Creando instancia de la clase

		metas.addTaskList(t1);
		metas.addTaskList(t2);
		metas.addTaskList(t3);
		metas.addTaskList(t4);
		metas.addTaskList(t5);

		System.out.println("Imprimiendo tareas iniciales");
		metas.printTasks();

		System.out.println("--------------------------------");

		metas.removeTask("Conocer Intellij IDEA");
		System.out.println("Tareas despues de aplicar el removeTask");
		metas.printTasks();


	}

}
