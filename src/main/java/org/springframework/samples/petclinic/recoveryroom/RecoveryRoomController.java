package org.springframework.samples.petclinic.recoveryroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("recoveryroom")
public class RecoveryRoomController {
	
	@Autowired
	private RecoveryRoomService recoveryroomservice;
	
	
	private static final String VIEWS_RECOVERY_ROOM_CREATE_OR_UPDATE_FORM= "recoveryroom7createOrUpdateRecoveryRoomForm.jsp";
	
	@GetMapping(path ="/create")
	 public String InitCreationForm(ModelMap modelmap){
		String view = VIEWS_RECOVERY_ROOM_CREATE_OR_UPDATE_FORM;
		modelmap.addAttribute("recoveryRoom", new RecoveryRoom());
		modelmap.addAttribute("recoveryRoomType", recoveryroomservice.getAllRecoveryRoomTypes());
		return view;
	 }
}
