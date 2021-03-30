package fit.restapi.controllers;

import java.util.Calendar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.core.IrpfCalculator;
import fit.restapi.model.request.PersonModelRquest;

@CrossOrigin(origins = {
	    "http://localhost:8000", 
	    "http://127.0.0.1:8000",
	    "http://localhost:3000", 
	    "http://127.0.0.1:3000"
})
@RestController
@RequestMapping("/irpf")
public class IrpfController {
	
    @PostMapping("/calculate")
    public double calculate(@RequestBody PersonModelRquest personModelRquest) {
        
    	var yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
    	
    	var irpf = new IrpfCalculator(yearCurrent, personModelRquest.getTotalSalary(), personModelRquest.getDependentsNumber()).calculate();

        return irpf;
    }
}
