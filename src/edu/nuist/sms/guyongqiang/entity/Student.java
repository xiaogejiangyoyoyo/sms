package edu.nuist.sms.guyongqiang.entity;

import java.util.Date;

import edu.nuist.sms.guyongqiang.util.Myutil;

public class Student {
	private Integer id;
	private String account;
	private String name;
	private String password;
	private String StudyNumber;
	private Boolean gender;
	private String phone;
	private String email;
	private Date birthday;
	private String interest;
	private String birthPlace;
	private String introduction;
	

@Override
	public String toString() {
		return "Student [id=" + id + ", account=" + account + ", name=" + name + ", password=" + password
				+ ", StudyNumber=" + StudyNumber + ", gender=" + gender + ", phone=" + phone + ", email=" + email
				+ ", birthday=" + birthday + ", interest=" + interest + ", birthPlace=" + birthPlace + ", introduction="
				+ introduction + "]";
	}

	//无参构造器
	public Student() {
		super();
	}
	//有参构造器

public Student(String account, String name, String password, String studyNumber, Boolean gender, String phone,
		String email, Date birthday, String interest, String birthPlace, String introduction) {
	super();
	this.account = account;
	this.name = name;
	this.password = password;
	StudyNumber = studyNumber;
	this.gender = gender;
	this.phone = phone;
	this.email = email;
	this.birthday = birthday;
	this.interest = interest;
	this.birthPlace = birthPlace;
	this.introduction = introduction;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((StudyNumber == null) ? 0 : StudyNumber.hashCode());
	result = prime * result + ((account == null) ? 0 : account.hashCode());
	result = prime * result + ((birthPlace == null) ? 0 : birthPlace.hashCode());
	result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((interest == null) ? 0 : interest.hashCode());
	result = prime * result + ((introduction == null) ? 0 : introduction.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (StudyNumber == null) {
		if (other.StudyNumber != null)
			return false;
	} else if (!StudyNumber.equals(other.StudyNumber))
		return false;
	if (account == null) {
		if (other.account != null)
			return false;
	} else if (!account.equals(other.account))
		return false;
	if (birthPlace == null) {
		if (other.birthPlace != null)
			return false;
	} else if (!birthPlace.equals(other.birthPlace))
		return false;
	if (birthday == null) {
		if (other.birthday != null)
			return false;
	} else if (!birthday.equals(other.birthday))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (interest == null) {
		if (other.interest != null)
			return false;
	} else if (!interest.equals(other.interest))
		return false;
	if (introduction == null) {
		if (other.introduction != null)
			return false;
	} else if (!introduction.equals(other.introduction))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (phone == null) {
		if (other.phone != null)
			return false;
	} else if (!phone.equals(other.phone))
		return false;
	return true;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getStudyNumber() {
	return StudyNumber;
}

public void setStudyNumber(String studyNumber) {
	StudyNumber = studyNumber;
}

public Boolean getGender() {
	return gender;
}

public void setGender(Boolean gender) {
	this.gender = gender;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Date getBirthday() {
	return birthday;
}

public void setBirthday(Date birthday) {
	this.birthday = birthday;
}

public String getInterest() {
	return interest;
}


public String getInterestView(){
	String[] interestArray = interest.split(",");
	String result = "";
	for(int i=0;i<interestArray.length;i++){
	result += Myutil.interestMap.get(interestArray[i]);
	if(i<interestArray.length-1){
	}
	}
	return result;
}


public void setInterest(String interest) {
	this.interest = interest;
}

public String getBirthPlace() {
	return birthPlace;
}
 
public String getBirthPlaceView(){
return Myutil.placeMap.get(birthPlace);

}

public void setBirthPlace(String birthPlace) {
	this.birthPlace = birthPlace;
}

public String getIntroduction() {
	return introduction;
}

public void setIntroduction(String introduction) {
	this.introduction = introduction;
}
	

	
	




}
