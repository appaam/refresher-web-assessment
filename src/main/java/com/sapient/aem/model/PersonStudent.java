package com.sapient.aem.model;



import java.time.LocalDate;



public class PersonStudent {
private Long adharCard;
private String name;
private LocalDate birthdate;
private String address;
private String email;
private Long mobile;
private Long admissionCode;
private String className;
private Integer subject1;
private Integer subject2;
private Integer subject3;
private Integer subject4;
private Integer subject5;
private Integer subject6;
private String grade;

public PersonStudent() {

}



public PersonStudent(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile,
Long admissionCode, String className, Integer subject1, Integer subject2, Integer subject3,
Integer subject4, Integer subject5, Integer subject6, String grade) {
super();
this.adharCard = adharCard;
this.name = name;
this.birthdate = birthdate;
this.address = address;
this.email = email;
this.mobile = mobile;
this.admissionCode = admissionCode;
this.className = className;
this.subject1 = subject1;
this.subject2 = subject2;
this.subject3 = subject3;
this.subject4 = subject4;
this.subject5 = subject5;
this.subject6 = subject6;
this.grade = grade;
}



public Long getAdharCard() {
return adharCard;
}



public void setAdharCard(Long adharCard) {
this.adharCard = adharCard;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public LocalDate getBirthdate() {
return birthdate;
}



public void setBirthdate(LocalDate birthdate) {
this.birthdate = birthdate;
}



public String getAddress() {
return address;
}



public void setAddress(String address) {
this.address = address;
}



public String getEmail() {
return email;
}



public void setEmail(String email) {
this.email = email;
}



public Long getMobile() {
return mobile;
}



public void setMobile(Long mobile) {
this.mobile = mobile;
}



public Long getAdmissionCode() {
return admissionCode;
}



public void setAdmissionCode(Long admissionCode) {
this.admissionCode = admissionCode;
}



public String getClassName() {
return className;
}



public void setClassName(String className) {
this.className = className;
}



public Integer getSubject1() {
return subject1;
}



public void setSubject1(Integer subject1) {
this.subject1 = subject1;
}



public Integer getSubject2() {
return subject2;
}



public void setSubject2(Integer subject2) {
this.subject2 = subject2;
}



public Integer getSubject3() {
return subject3;
}



public void setSubject3(Integer subject3) {
this.subject3 = subject3;
}



public Integer getSubject4() {
return subject4;
}



public void setSubject4(Integer subject4) {
this.subject4 = subject4;
}



public Integer getSubject5() {
return subject5;
}



public void setSubject5(Integer subject5) {
this.subject5 = subject5;
}



public Integer getSubject6() {
return subject6;
}



public void setSubject6(Integer subject6) {
this.subject6 = subject6;
}



public String getGrade() {
return grade;
}



public void setGrade(String grade) {
this.grade = grade;
}



@Override
public String toString() {
return "PersonStudent [adharCard=" + adharCard + ", name=" + name + ", birthdate=" + birthdate + ", address="
+ address + ", email=" + email + ", mobile=" + mobile + ", admissionCode=" + admissionCode
+ ", className=" + className + ", subject1=" + subject1 + ", subject2=" + subject2 + ", subject3="
+ subject3 + ", subject4=" + subject4 + ", subject5=" + subject5 + ", subject6=" + subject6 + ", grade="
+ grade + "]";
}



}