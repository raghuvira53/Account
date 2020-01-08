package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccController {
	@Autowired
	private AccRepo accRepo;
	ResponseEntity<Account> re;
	
	@GetMapping("getAcc/{id}")
	public ResponseEntity<Account> getById(@PathVariable("id") Integer sid){
		Optional<Account> opt=accRepo.findById(sid);
		if(opt.isPresent()) {
			re=new ResponseEntity<Account>(opt.get(),HttpStatus.OK);
		}else {
			re=new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
return re;
}
	@PutMapping("save")
	public void sa(@RequestBody Account ac) {
		accRepo.save(ac);
		}
	@PostMapping("save1")
	public void sa1(@RequestBody Account ac1) {
		accRepo.save(ac1);
	}
}