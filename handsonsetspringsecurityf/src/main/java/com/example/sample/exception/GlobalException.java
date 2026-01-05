package com.example.sample.exception;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	// Handle NullPointerException
		@ExceptionHandler(NullPointerException.class)
	    public ResponseEntity<Map<String, String>> handleNullPointerException(NullPointerException ne) {
	        Map<String, String> map = new HashMap<>();
	        map.put("errorCode", "101");
	        map.put("errorMessage", "There is a Null Pointer Exception");
	        map.put("details", ne.getMessage());
	        return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	    @ExceptionHandler(RuntimeException.class)
	    public ResponseEntity<Map<String, String>> handleRuntimeException(RuntimeException re) {
	        Map<String, String> map = new HashMap<>();
	        map.put("errorCode", "102");
	        map.put("errorMessage", "Runtime exception occurred");
	        map.put("details", re.getMessage());
	        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
	    }

	    
	    @ExceptionHandler(ArithmeticException.class)
	    public ResponseEntity<Map<String, String>> handleArithmeticException(ArithmeticException ex) {
	        Map<String, String> map = new HashMap<>();
	        map.put("errorCode", "103");
	        map.put("errorMessage", "Arithmetic exception occurred");
	        map.put("details", ex.getMessage());
	        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
	   } 
	    @ExceptionHandler(exception = MethodArgumentNotValidException.class)
	    public ResponseEntity<Map<String,Object>>handleBeanObject(MethodArgumentNotValidException me){
			BindingResult br=me.getBindingResult();
			Map<String,Object> response=new LinkedHashMap<>();
			Map<String,String> fieldErrors=new LinkedHashMap<>();
		     br.getFieldErrors().forEach(x->fieldErrors.put(x.getField(), x.getDefaultMessage()));
			 response.put("exception", me.getClass().getSimpleName());
		    response.put("message", "validation field");
			response.put("errors",fieldErrors);
		   return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
			
	   }

}
