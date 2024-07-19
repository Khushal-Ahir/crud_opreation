package crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import crud.dto.Employee;

@Component
public class CrudDao {
	
	@Autowired
	EntityManager manager;
	
	public void saveEmployee(Employee employee) {
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();
	}
//	FETCH DATA
	public List<Employee> fetchData() {
		return manager.createQuery("select x from Employee x").getResultList();
	}
	public Employee fetchDataById(int id){
		return manager.find(Employee.class, id);
	}
//	DELETE DATA
	public void deleteEmpById(Employee empId) {
		manager.getTransaction().begin();
		manager.remove(empId);
		manager.getTransaction().commit();
	}
	
//	UPDATE DATA
	public void editEmp(Employee editemp) {
		manager.getTransaction().begin();
		manager.merge(editemp);
		manager.getTransaction().commit();
	}
}