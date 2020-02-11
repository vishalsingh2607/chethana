package com.ats.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ats.modelmapper.GenericResponse;
import com.ats.modelmapper.RecruiterDetail;
import com.ats.service.RecruiterService;

@Controller
@RequestMapping("/recruiter")
public class RecruiterController {
	
	@Autowired
	private RecruiterService recruiterservice;

	@RequestMapping(value = "/recruiter", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String addRecruiter(@RequestBody RecruiterDetail recruiterdetail, HttpServletRequest httpServletRequest)
			throws Throwable {
		String response = null;
		try {
		 Integer id = recruiterservice.save(recruiterdetail);
			response = id.toString();
		} catch (Throwable throwable) {
			throw new Throwable(throwable.getMessage());
		}
		return response;
	}
	
	
	@RequestMapping(value = "/recruiter", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ResponseEntity<GenericResponse> getAllRecruiter() throws Throwable {
		GenericResponse<RecruiterDetail> genericResponse = new GenericResponse<RecruiterDetail>();
		List<RecruiterDetail> recruiterDetailList = recruiterservice.getAllRecruiter();
		genericResponse.setDetails(recruiterDetailList);
		System.out.println("hello");
		return new ResponseEntity<>(genericResponse, HttpStatus.ACCEPTED);
	}
	
	 @RequestMapping(value ="/recruiter/{id}",method = RequestMethod.DELETE)
	  public ResponseEntity<GenericResponse>DeleteRecruiter(@PathVariable ("id") Integer id)throws Throwable{
		  GenericResponse<RecruiterDetail> genericResponse= new GenericResponse<RecruiterDetail>();
		  recruiterservice.delete(id);
		  genericResponse.setMessages("Record deleted successfully");
		  return new ResponseEntity<>(genericResponse,HttpStatus.ACCEPTED);  
	  }
	  @RequestMapping(value = "/recruiter/{id}",method = RequestMethod.PUT)
	  public ResponseEntity<GenericResponse>UpdateRecruiter(@RequestBody RecruiterDetail studentDetail,@PathVariable ("id")Integer id)throws Throwable{
		  GenericResponse<RecruiterDetail>genericResponse = new GenericResponse<RecruiterDetail>();
		  recruiterservice.update(id,studentDetail.getPhoneNumber());
		  genericResponse.setMessages("Record updated successfully");
		  return new ResponseEntity<>(genericResponse,HttpStatus.ACCEPTED);
	  }

	


}
