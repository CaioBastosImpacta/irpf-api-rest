package fit.restapi.controllers;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    
    @SuppressWarnings("serial")
	@GetMapping
    public List<HashMap<String, String>> getAll() {
    	
    	var map1 = new HashMap<String, String>() {{
    		put("base_salary", "Até 1.903,98");
    		put("aliquota", "-");    
    		put("ir", "-");
    	}};
    	
    	var map2 = new HashMap<String, String>() {{
    		put("base_salary", "De 1.903,99 até 2.826,65");
    		put("aliquota", "7,5");    
    		put("ir", "142,80");
    	}};
    	
    	var map3 = new HashMap<String, String>() {{
    		put("base_salary", "De 2.826,66 até 3.751,05");
    		put("aliquota", "15");    
    		put("ir", "354,80");
    	}};
    	
    	var map4 = new HashMap<String, String>() {{
    		put("base_salary", "De 3.751,06 até 4.664,68");
    		put("aliquota", "22,50");    
    		put("ir", "636,13");
    	}};
    	
    	var map5 = new HashMap<String, String>() {{
    		put("base_salary", "Acima de 4.664,68");
    		put("aliquota", "27,50");    
    		put("ir", "869,36");
    	}};
    		
    	return List.of(map1, map2, map3, map4, map5);
    }
}
