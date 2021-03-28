package fit.restapi.controllers;

import java.util.Calendar;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.core.IrpfCalculator;
import fit.restapi.model.request.PersonModelRquest;

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
