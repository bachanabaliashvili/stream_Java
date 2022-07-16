package tbcacademy.streams;


import org.testng.annotations.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.AssertJUnit.assertEquals;

public class TestStream {

	private EmployeeRecord employeeRecord[] = {new EmployeeRecord(1,"empl1",100.0),new EmployeeRecord(2,"empl2",120.0) , new EmployeeRecord(3,"empl3",80.0)};

	private Integer ID[] = {1,3,4};
	List<EmployeeRecord> empRecord = Arrays.asList(employeeRecord);
	List<Integer> IDS = Arrays.asList(ID);



	@Test
	public void task1() {
		List<Integer> ids = new ArrayList<Integer>();
	    List<EmployeeRecord> emplist = empRecord.stream()
				.filter(em->IDS.contains(em.getId()))
				.collect(Collectors.toList());
	;
		System.out.println(emplist);
	}}
