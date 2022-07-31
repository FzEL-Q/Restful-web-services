package springBootproject;

import java.util.List;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Person {
		@Id
		private long id;
		private String name;
		private String gender;
		private String adresse;
		private String phone;
		private String email;
		
		private List<Person> persons;
		
		
		public List<Person> getPersons() {
			return persons;
		}


		public void setPersons(List<Person> persons) {
			this.persons = persons;
		}


		private Person() {}
	

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
	}

