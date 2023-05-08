package com.example.demo.carController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.carModel.CarModel;
import com.example.demo.carRepository.CarRepository;
import com.example.demo.carService.CarService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class CarController {
	@Autowired
	CarService Service;
@GetMapping("/getdata")
public List<CarModel> getAll()
{
	List<CarModel>cList=Service.getAlldetails();
	return cList;
}
//http://localhost:9080/saveStudent
	

@PostMapping("/post")
public CarModel save(@RequestBody CarModel s)
{
	return Service.savecar(s);
}
@PutMapping(value="/updatecar")
public CarModel updatecar(@RequestBody CarModel s,@RequestParam int id)
{
	s.setPid(id);
	return Service.savecar(s);
}
//http://localhost:9080/deletecar/563
@DeleteMapping(value="/deletecar")
public String deletecar(@RequestParam int id)
{
	 Service.deletecar(id);
	 return "Deleted Successfully";
}
@GetMapping(value="/getcar/{register}")
public CarModel getcar(@PathVariable("register")  int register)
{
	return Service.getcar(register);
}
//sorting
@GetMapping("/sortData1/{pna}")
public List<CarModel> sortVote(@PathVariable("pna") String pvote)
{
	return Service.sortData(pvote);
}
//pagination-higher data ->lower data chunks

@GetMapping("/pagination1/{pageno}/{pagesize}")
//pageno starts with 0

public List<CarModel> page(@PathVariable("pageno") int pageno,@PathVariable("pagesize") int pagesize)
{
return Service.pagination(pageno,pagesize);
}

@Autowired

public CarRepository ir;

@Tag( name="Native query",description="Getting details")
@GetMapping("/saveir")
public List<CarModel> getD()
{
	return ir.getAllData();
}

@Tag( name="Native query",description="Getting details by id")
@GetMapping("byName/{id}")
public List<CarModel> getName(@PathVariable ("id") int pid )
{
	return ir.bypid(pid);
}

@Tag( name="Native query",description="Getting details by start end method")
@GetMapping("startend/{start}/{end}")
public List<CarModel> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
{
	return ir.startEnd(start, end);
}

@Tag( name="Native query",description="Deleting details by id and name")
@DeleteMapping("/del/{id}/{name}")
public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
{
	ir.deleteD(id, name);
	return "deleted";
}

@Tag( name="Native query",description="Posting details")
@PutMapping("updatee/{pid}/{pname}")
public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
{
	ir.updateByQuery(pid, pname);
}

@Tag( name="JPQL",description="Getting details by methods")
@GetMapping("jp")
public List<CarModel> jplQuery()
{
	return ir.jpqlQ();
}

@Tag( name="JPQL",description="Getting details by id")
@GetMapping("/upp/{id}")
public List<CarModel> jpqUp(@PathVariable ("id") int id)
{
	return ir.jqByCon(id);
}
}
