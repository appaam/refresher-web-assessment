package com.sapient.aem.model;import java.time.LocalDate;public class PersonTeacher {
private Long adharCard;
private String name;
private LocalDate birthdate;
private String address;
private String email;
private Long mobile;
private Integer teacherId;
private String qualification;
private String gender;
private Double salary; public PersonTeacher() {
} public PersonTeacher(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile,
Integer teacherId, String qualification, String gender, Double salary) {
super();
this.adharCard = adharCard;
this.name = name;
this.birthdate = birthdate;
this.address = address;
this.email = email;
this.mobile = mobile;
this.teacherId = teacherId;
this.qualification = qualification;
this.gender = gender;
this.salary = salary;
} public Long getAdharCard() {
return adharCard;
} public void setAdharCard(Long adharCard) {
this.adharCard = adharCard;
} public String getName() {
return name;
} public void setName(String name) {
this.name = name;
} public LocalDate getBirthdate() {
return birthdate;
} public void setBirthdate(LocalDate birthdate) {
this.birthdate = birthdate;
} public String getAddress() {
return address;
} public void setAddress(String address) {
this.address = address;
} public String getEmail() {
return email;
} public void setEmail(String email) {
this.email = email;
} public Long getMobile() {
return mobile;
} public void setMobile(Long mobile) {
this.mobile = mobile;
} public Integer getTeacherId() {
return teacherId;
} public void setTeacherId(Integer teacherId) {
this.teacherId = teacherId;
} public String getQualification() {
return qualification;
} public void setQualification(String qualification) {
this.qualification = qualification;
} public String getGender() {
return gender;
} public void setGender(String gender) {
this.gender = gender;
} public Double getSalary() {
return salary;
} public void setSalary(Double salary) {
this.salary = salary;
} @Override
public String toString() {
return "PersonTeacher [adharCard=" + adharCard + ", name=" + name + ", birthdate=" + birthdate + ", address="
+ address + ", email=" + email + ", mobile=" + mobile + ", teacherId=" + teacherId + ", qualification="
+ qualification + ", gender=" + gender + ", salary=" + salary + "]";
}
}

