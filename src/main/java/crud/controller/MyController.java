package crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import crud.dao.CrudDao;
import crud.dto.Employee;

@Controller

public class MyController {
	
	@Autowired
	CrudDao dao;
	
	@GetMapping("/")
	public String loadHome() {
		return "home";
	}
	
	@GetMapping("/add")
	public String loadAdd() {
		return "add";
	}

	@PostMapping("/add")
	public String add(Employee employee, ModelMap map) {
		dao.saveEmployee(employee);
		map.put("success", "Data Saved Successfully");
		return "home";
	}
	
	@GetMapping("/fetch")
	public String fetch(ModelMap map) {
		List<Employee> lists=dao.fetchData();
		if(lists.isEmpty()) {
			map.put("msg", "No data found");
			return "home";
		}else {
			map.put("lists", lists);
			return "fetch";
		}
	}
	
	@GetMapping("/deleteEmp")
	public String deleteEmp(@RequestParam("id") int id, ModelMap map) {
		Employee list = (Employee) dao.fetchDataById(id);
		if(list != null) {			
			dao.deleteEmpById(list);
			System.out.println(list.getEname()+ "This is name"+ list.getId());
			map.put("success", "Data is Deleted");
			return fetch(map);
		}else {
			return (String) map.put("deleteMsg", "No Data Found");
		}
	}
	
	@GetMapping("/update")
	public String edit(@RequestParam("id") int id, ModelMap map) {
		Employee list = dao.fetchDataById(id);
		map.put("lsit",list);
		return "update";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee employee, ModelMap map) {
		System.out.println("updateEmp method calling");
		dao.updateEmp(employee);
		System.out.println("updateEmp method comeback");
		map.put("success", "Data Updated");
		return fetch(map);
	}
}
