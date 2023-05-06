package com.example.demo.controller;

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

import com.example.demo.model.food;
import com.example.demo.service.Serviceclass;

@RestController
public class controllerclass {
    @Autowired
    Serviceclass sec;
    @GetMapping("/get")
    public List<food> getall()
    {
    	return sec.getall1();
    }
    @PostMapping("/save")
    public food addetails(@RequestBody food fo)
    {
        return sec.addall(fo);
    }
    @PutMapping("/update")
	   public food update(@RequestBody food ice)
	   {
		   return sec.savefood(ice);
	   }
	   @DeleteMapping("/delete/{id}")
	   public String deletedetails(@PathVariable int id)
	   {
		   sec.deletefood(id);
		    return "deleted";
	   }
	   @GetMapping("/query2")
	    public List<food>fetchqueryCarFuel(@RequestParam String foodname )
	    {
	    	return sec.queryCarsFuel( foodname);
	    }
}
