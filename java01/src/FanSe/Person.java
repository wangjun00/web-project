package FanSe;

import java.util.Date;

public class Person {

private String name;
private String pass;
private String age;
private Date birthday;
private String email;

public String getname() {
  return name;
}
public void setname(String name) {
  this.name = name;
}
public String getPass() {
  return pass;
}
public void setPass(String pass) {
  this.pass = pass;
}
public String getAge() {
  return age;
}
public void setAge(String age) {
  this.age = age;
}
public Date getBirthday() {
  return birthday;
}
public void setBirthday(Date birthday) {
  this.birthday = birthday;
}
public String getEmail() {
  return email;
}
public void setEmail(String email) {
  this.email = email;
}




}
   //你想给他赋值就用u.setXXX(); 
   // 取这个类的对象的某个值 就get
