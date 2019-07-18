package DemoWeb;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriggerController {
	String msg="Success";

	@RequestMapping("/trigger")
	public Trigger getData(@RequestParam(value="name", defaultValue="Trigger_name") String name)
	
	{
		Trigger t=new Trigger();
		t.setFunctionStatus(msg+name);
		return t;

	}
	@RequestMapping("/trigger_post")
	public String getpostData(@RequestBody Trigger t)
	
	{
		
		return t.getFunctionStatus();
		
	}
}
