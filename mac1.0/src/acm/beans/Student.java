package acm.beans;
public class Student {

	
	private String name;
	private String sno;
	private String tel;
	private String sex;
	private String gra;
	private String dep;
	private String major;
	private String cno;
	private String account;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String sno, String tel, String sex, String gra, String dep, String major, String cno,String account) {
		super();
		this.name = name;
		this.sno = sno;
		this.tel = tel;
		this.sex = sex;
		this.gra = gra;
		this.dep = dep;
		this.major = major;
		this.cno = cno;
		this.account = account;
	}
   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cno == null) ? 0 : cno.hashCode());
		result = prime * result + ((dep == null) ? 0 : dep.hashCode());
		result = prime * result + ((gra == null) ? 0 : gra.hashCode());
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((sno == null) ? 0 : sno.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		
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
		if (cno == null) {
			if (other.cno != null)
				return false;
		} else if (!cno.equals(other.cno))
			return false;
		if (dep == null) {
			if (other.dep != null)
				return false;
		} else if (!dep.equals(other.dep))
			return false;
		if (gra == null) {
			if (other.gra != null)
				return false;
		} else if (!gra.equals(other.gra))
			return false;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (sno == null) {
			if (other.sno != null)
				return false;
		} else if (!sno.equals(other.sno))
			return false;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sno=" + sno + ", tel=" + tel + ", sex=" + sex + ", gra=" + gra + ", dep="
				+ dep + ", major=" + major + ", cno=" + cno + ", account="+account+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGra() {
		return gra;
	}
	public void setGra(String gra) {
		this.gra = gra;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	

}
