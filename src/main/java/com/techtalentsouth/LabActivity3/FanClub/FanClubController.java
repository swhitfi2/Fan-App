package com.techtalentsouth.LabActivity3.FanClub; 

 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.stereotype.Controller; 

import org.springframework.ui.Model; 

import org.springframework.web.bind.annotation.GetMapping; 

import org.springframework.web.bind.annotation.PostMapping; 

//import org.springframework.web.bind.annotation.RestController; 

 

 

@Controller 

public class FanClubController { 

 

@Autowired  

private FanClubRepository fanClubRepository; //creates an instance 

 

 

@GetMapping("/") 

public String index()  

{ 

     return	"FanClubUser/index.html"; 

 

}	 

 

@GetMapping("/fanClub") 

public String fanClub(FanClubUser fanClubUser)  

{ 

     return	"FanClubUser/fanClub.html"; 

} 

 

@GetMapping("/about") 

public String about()  

{ 

     return	"FanClubUser/about.html"; 

} 

 

@PostMapping(value="/fanClub")//post back to the form page 

public String addNewFan(FanClubUser fanclubuser, Model model) { 

//fanClubRepository.save(fanClubUser); //can also perform the following task 

 

fanClubRepository.save(new FanClubUser(fanclubuser.getFirstName(),fanclubuser.getLastName(),  

fanclubuser.getEmail(), fanclubuser.getFavoriteMovie(), fanclubuser.getPassword(), 

fanclubuser.getDateCreated())); 

 

 

 

//then the add attribute is passing the form data to be used back to the form 

//takes saved variables and  

model.addAttribute("firstName", fanclubuser.getFirstName()); 

model.addAttribute("lastName", fanclubuser.getLastName()); 

model.addAttribute("email", fanclubuser.getEmail()); 

model.addAttribute("favoriteMovie", fanclubuser.getFavoriteMovie()); 

model.addAttribute("password", "Sorry can't pass that"); 

model.addAttribute("createdDate", fanclubuser.getDateCreated()); 

 

 

return "FanClubUser/confirmSignUp"; 

} 

 

} 