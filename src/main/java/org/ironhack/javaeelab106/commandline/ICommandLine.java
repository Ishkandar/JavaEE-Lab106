package org.ironhack.javaeelab106.commandline;

import java.util.UUID;

public interface ICommandLine {
	void addDummy();
	void addCustomEmp(String name, String birthDate, String email, String adddress);
	void addCustomIntern(String name, String birthDate, String email, String adddress, double salary);
	void raiseSalary(double raise);
	void showEmployees();
	void showInterns();

	void removeEmp(UUID id);
	void removeIntern(UUID id);
}
