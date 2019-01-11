package com.techtalentsouth.LabActivity3.FanClub; 

 

import java.util.Date; 

 

import javax.persistence.Column; 

import javax.persistence.Entity; 

import javax.persistence.GeneratedValue; 

import javax.persistence.GenerationType; 

import javax.persistence.Id; 

 

import org.hibernate.annotations.CreationTimestamp; 

import org.springframework.format.annotation.DateTimeFormat; 

import org.springframework.data.annotation.CreatedDate; 

 

@Entity 

public class FanClubUser { 

 

@Id 

@GeneratedValue(strategy=GenerationType.AUTO) 

private Long id; 

private String firstName; 

private String lastName; 

private String email; 

private String favoriteMovie; 

private String password; 

 

@Column 

@CreationTimestamp 

private Date dateCreated; 

 

 

public FanClubUser() { 

 

} 

 

public FanClubUser(String firstName, String lastName, String email, String favoriteMovie, String password, 

Date dateCreated) { 

this.firstName = firstName; 

this.lastName = lastName; 

this.email = email; 

this.favoriteMovie = favoriteMovie; 

this.password = password; 

this.dateCreated = dateCreated; 

} 

 

 

public String getFirstName() { 

return firstName; 

} 

 

 

public void setFirstName(String firstName) { 

this.firstName = firstName; 

} 

 

 

public String getLastName() { 

return lastName; 

} 

 

 

public void setLastName(String lastName) { 

this.lastName = lastName; 

} 

 

 

public String getEmail() { 

return email; 

} 

 

 

public void setEmail(String email) { 

this.email = email; 

} 

 

 

public String getFavoriteMovie() { 

return favoriteMovie; 

} 

 

 

public void setFavoriteMovie(String favoriteMovie) { 

this.favoriteMovie = favoriteMovie; 

} 

 

 

public String getPassword() { 

return password; 

} 

 

 

public void setPassword(String password) { 

this.password = password; 

} 

 

 

public Date getDateCreated() { 

return dateCreated; 

} 

 

@Override 

public String toString() { 

return "fanClubUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email 

+ ", favoriteMovie=" + favoriteMovie + ", password=" + password + ", dateCreated=" + dateCreated + "]"; 

} 

}