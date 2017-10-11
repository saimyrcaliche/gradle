package co.com.saimyrdomain.testDataBuilder;

import co.com.saimyrdomain.Person;

public class PersonTestDataBuilder {

	private String name;
	private String lastName;
	
	public PersonTestDataBuilder(String name, String lastName) {
		this.name = "saimyr";
		this.lastName = "softwere";
	}
	
	public PersonTestDataBuilder() {
		this.name = name;
		this.lastName = lastName;
	}
	
	
	public PersonTestDataBuilder withName (String name){
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withlastName (String lastName){
		this.lastName = lastName;
		return this;
	}
	
	public Person build (){
		return new Person (this.name, this.lastName);
	}

}
